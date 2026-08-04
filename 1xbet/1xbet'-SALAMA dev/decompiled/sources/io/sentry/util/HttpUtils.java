package io.sentry.util;

import io.sentry.HttpStatusCodeRange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpUtils {
    public static final String COOKIE_HEADER_NAME = "Cookie";
    private static final List<String> SENSITIVE_HEADERS = Arrays.asList("X-FORWARDED-FOR", "AUTHORIZATION", "COOKIE", "SET-COOKIE", "X-API-KEY", "X-REAL-IP", "REMOTE-ADDR", "FORWARDED", "PROXY-AUTHORIZATION", "X-CSRF-TOKEN", "X-CSRFTOKEN", "X-XSRF-TOKEN");
    private static final List<String> SECURITY_COOKIES = Arrays.asList("JSESSIONID", "JSESSIONIDSSO", "JSSOSESSIONID", "SESSIONID", "SID", "CSRFTOKEN", "XSRF-TOKEN");
    private static final HttpStatusCodeRange CLIENT_ERROR_STATUS_CODES = new HttpStatusCodeRange(400, 499);
    private static final HttpStatusCodeRange SEVER_ERROR_STATUS_CODES = new HttpStatusCodeRange(HttpStatusCodeRange.DEFAULT_MIN, HttpStatusCodeRange.DEFAULT_MAX);

    public static boolean containsSensitiveHeader(String str) {
        return SENSITIVE_HEADERS.contains(str.toUpperCase(Locale.ROOT));
    }

    public static String filterOutSecurityCookies(String str, List<String> list) {
        if (str == null) {
            return null;
        }
        try {
            String[] strArrSplit = str.split(";", -1);
            StringBuilder sb = new StringBuilder();
            int length = strArrSplit.length;
            boolean z4 = true;
            int i7 = 0;
            while (i7 < length) {
                String str2 = strArrSplit[i7];
                if (!z4) {
                    sb.append(";");
                }
                String str3 = str2.split("=", -1)[0];
                if (isSecurityCookie(str3.trim(), list)) {
                    sb.append(str3 + "=" + UrlUtils.SENSITIVE_DATA_SUBSTITUTE);
                } else {
                    sb.append(str2);
                }
                i7++;
                z4 = false;
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<String> filterOutSecurityCookiesFromHeader(Enumeration<String> enumeration, String str, List<String> list) {
        if (enumeration == null) {
            return null;
        }
        return filterOutSecurityCookiesFromHeader(Collections.list(enumeration), str, list);
    }

    public static boolean isHttpClientError(int i7) {
        return CLIENT_ERROR_STATUS_CODES.isInRange(i7);
    }

    public static boolean isHttpServerError(int i7) {
        return SEVER_ERROR_STATUS_CODES.isInRange(i7);
    }

    public static boolean isSecurityCookie(String str, List<String> list) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        if (SECURITY_COOKIES.contains(upperCase)) {
            return true;
        }
        if (list == null) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().toUpperCase(Locale.ROOT).equals(upperCase)) {
                return true;
            }
        }
        return false;
    }

    public static List<String> filterOutSecurityCookiesFromHeader(List<String> list, String str, List<String> list2) {
        if (list == null) {
            return null;
        }
        if (str != null && !COOKIE_HEADER_NAME.equalsIgnoreCase(str)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(filterOutSecurityCookies(it.next(), list2));
        }
        return arrayList;
    }
}
