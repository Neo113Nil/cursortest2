package com.pichillilorenzo.flutter_inappwebview_android;

import A5.o;
import A5.r;
import A5.s;
import P6.b;
import R0.d;
import S0.w;
import S0.x;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p031e1.k;
import p136t.e;
import p150v0.a;

/* JADX INFO: loaded from: classes2.dex */
public class MyCookieManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "MyCookieManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_cookiemanager";
    public static CookieManager cookieManager;
    public InAppWebViewFlutterPlugin plugin;

    public MyCookieManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new s(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static String getCookieExpirationDate(Long l7) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(new Date(l7.longValue()));
    }

    private static CookieManager getCookieManager() throws Exception {
        if (cookieManager == null) {
            try {
                cookieManager = CookieManager.getInstance();
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Exception e7) {
                if (e7.getMessage() == null || !e7.getClass().getCanonicalName().equals("android.webkit.WebViewFactory.MissingWebViewPackageException")) {
                    throw e7;
                }
                return null;
            }
        }
        return cookieManager;
    }

    public static void init() {
        if (cookieManager == null) {
            cookieManager = getCookieManager();
        }
    }

    public void deleteAllCookies(final r rVar) throws Exception {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            rVar.success(Boolean.FALSE);
        } else {
            cookieManager.removeAllCookies(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.3
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Boolean bool) {
                    rVar.success(bool);
                }
            });
            cookieManager.flush();
        }
    }

    public void deleteCookie(String str, String str2, String str3, String str4, final r rVar) throws Exception {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            rVar.success(Boolean.FALSE);
            return;
        }
        String strO = a.o(str2, "=; Path=", str4, "; Max-Age=-1");
        if (str3 != null) {
            strO = k.f(strO, "; Domain=", str3);
        }
        cookieManager.setCookie(str, k.e(strO, ";"), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.2
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Boolean bool) {
                rVar.success(bool);
            }
        });
        cookieManager.flush();
    }

    public void deleteCookies(String str, String str2, String str3, r rVar) throws Exception {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            rVar.success(Boolean.FALSE);
            return;
        }
        String cookie = cookieManager2.getCookie(str);
        if (cookie != null) {
            for (String str4 : cookie.split(";")) {
                String strO = a.o(str4.split("=", 2)[0].trim(), "=; Path=", str3, "; Max-Age=-1");
                if (str2 != null) {
                    strO = k.f(strO, "; Domain=", str2);
                }
                cookieManager.setCookie(str, k.e(strO, ";"), null);
            }
            cookieManager.flush();
        }
        rVar.success(Boolean.TRUE);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    public void flush(r rVar) throws Exception {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            rVar.success(Boolean.FALSE);
        } else {
            cookieManager.flush();
        }
    }

    public List<Map<String, Object>> getCookies(String str) throws Exception {
        String str2;
        ArrayList arrayList = new ArrayList();
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            return arrayList;
        }
        List<String> arrayList2 = new ArrayList<>();
        String str3 = "GET_COOKIE_INFO";
        String str4 = ";";
        if (d.a("GET_COOKIE_INFO")) {
            CookieManager cookieManager3 = cookieManager;
            if (!w.f6281O.b()) {
                throw w.a();
            }
            arrayList2 = ((WebViewCookieManagerBoundaryInterface) b.a(WebViewCookieManagerBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) x.f6311a.f6229b).convertCookieManager(cookieManager3))).getCookieInfo(str);
        } else {
            String cookie = cookieManager.getCookie(str);
            if (cookie != null) {
                arrayList2 = Arrays.asList(cookie.split(";"));
            }
        }
        Iterator<String> it = arrayList2.iterator();
        while (it.hasNext()) {
            String[] strArrSplit = it.next().split(str4);
            if (strArrSplit.length != 0) {
                String[] strArrSplit2 = strArrSplit[0].split("=", 2);
                String strTrim = strArrSplit2[0].trim();
                String strTrim2 = strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "";
                HashMap map = new HashMap();
                map.put("name", strTrim);
                map.put("value", strTrim2);
                map.put("expiresDate", null);
                map.put("isSessionOnly", null);
                map.put("domain", null);
                map.put("sameSite", null);
                map.put("isSecure", null);
                map.put("isHttpOnly", null);
                map.put("path", null);
                if (d.a(str3)) {
                    Boolean bool = Boolean.FALSE;
                    map.put("isSecure", bool);
                    map.put("isHttpOnly", bool);
                    int i7 = 1;
                    while (i7 < strArrSplit.length) {
                        Iterator<String> it2 = it;
                        String[] strArrSplit3 = strArrSplit[i7].split("=", 2);
                        String strTrim3 = strArrSplit3[0].trim();
                        String str5 = str3;
                        String[] strArr = strArrSplit;
                        String strTrim4 = strArrSplit3.length > 1 ? strArrSplit3[1].trim() : "";
                        if (strTrim3.equalsIgnoreCase("Expires")) {
                            try {
                                str2 = str4;
                                try {
                                    Date date = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US).parse(strTrim4);
                                    if (date != null) {
                                        map.put("expiresDate", Long.valueOf(date.getTime()));
                                    }
                                } catch (ParseException e7) {
                                    e = e7;
                                    Log.e(LOG_TAG, "", e);
                                }
                            } catch (ParseException e8) {
                                e = e8;
                                str2 = str4;
                            }
                        } else {
                            str2 = str4;
                            if (strTrim3.equalsIgnoreCase("Max-Age")) {
                                try {
                                    map.put("expiresDate", Long.valueOf(System.currentTimeMillis() + Long.parseLong(strTrim4)));
                                } catch (NumberFormatException e9) {
                                    Log.e(LOG_TAG, "", e9);
                                }
                            } else if (strTrim3.equalsIgnoreCase("Domain")) {
                                map.put("domain", strTrim4);
                            } else if (strTrim3.equalsIgnoreCase("SameSite")) {
                                map.put("sameSite", strTrim4);
                            } else if (strTrim3.equalsIgnoreCase("Secure")) {
                                map.put("isSecure", Boolean.TRUE);
                            } else if (strTrim3.equalsIgnoreCase("HttpOnly")) {
                                map.put("isHttpOnly", Boolean.TRUE);
                            } else if (strTrim3.equalsIgnoreCase("Path")) {
                                map.put("path", strTrim4);
                            }
                        }
                        i7++;
                        str3 = str5;
                        it = it2;
                        strArrSplit = strArr;
                        str4 = str2;
                    }
                }
                arrayList.add(map);
                str3 = str3;
                it = it;
                str4 = str4;
            }
        }
        return arrayList;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, A5.q
    public void onMethodCall(o oVar, r rVar) throws Exception {
        init();
        String str = oVar.f676a;
        str.getClass();
        switch (str) {
            case "deleteCookie":
                deleteCookie((String) oVar.a("url"), (String) oVar.a("name"), (String) oVar.a("domain"), (String) oVar.a("path"), rVar);
                break;
            case "removeSessionCookies":
                removeSessionCookies(rVar);
                break;
            case "flush":
                flush(rVar);
                break;
            case "setCookie":
                String str2 = (String) oVar.a("url");
                String str3 = (String) oVar.a("name");
                String str4 = (String) oVar.a("value");
                String str5 = (String) oVar.a("domain");
                String str6 = (String) oVar.a("path");
                String str7 = (String) oVar.a("expiresDate");
                setCookie(str2, str3, str4, str5, str6, str7 != null ? new Long(str7) : null, (Integer) oVar.a("maxAge"), (Boolean) oVar.a("isSecure"), (Boolean) oVar.a("isHttpOnly"), (String) oVar.a("sameSite"), rVar);
                break;
            case "deleteCookies":
                deleteCookies((String) oVar.a("url"), (String) oVar.a("domain"), (String) oVar.a("path"), rVar);
                break;
            case "deleteAllCookies":
                deleteAllCookies(rVar);
                break;
            case "getCookies":
                rVar.success(getCookies((String) oVar.a("url")));
                break;
            default:
                rVar.notImplemented();
                break;
        }
    }

    public void removeSessionCookies(final r rVar) throws Exception {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            rVar.success(Boolean.FALSE);
        } else {
            cookieManager.removeSessionCookies(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.4
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Boolean bool) {
                    rVar.success(bool);
                }
            });
            cookieManager.flush();
        }
    }

    public void setCookie(String str, String str2, String str3, String str4, String str5, Long l7, Integer num, Boolean bool, Boolean bool2, String str6, final r rVar) throws Exception {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            rVar.success(Boolean.FALSE);
            return;
        }
        String strF = str2 + "=" + str3 + "; Path=" + str5;
        if (str4 != null) {
            strF = k.f(strF, "; Domain=", str4);
        }
        if (l7 != null) {
            StringBuilder sbD = e.d(strF, "; Expires=");
            sbD.append(getCookieExpirationDate(l7));
            strF = sbD.toString();
        }
        if (num != null) {
            StringBuilder sbD2 = e.d(strF, "; Max-Age=");
            sbD2.append(num.toString());
            strF = sbD2.toString();
        }
        if (bool != null && bool.booleanValue()) {
            strF = k.e(strF, "; Secure");
        }
        if (bool2 != null && bool2.booleanValue()) {
            strF = k.e(strF, "; HttpOnly");
        }
        if (str6 != null) {
            strF = k.f(strF, "; SameSite=", str6);
        }
        cookieManager.setCookie(str, k.e(strF, ";"), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.1
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Boolean bool3) {
                rVar.success(bool3);
            }
        });
        cookieManager.flush();
    }
}
