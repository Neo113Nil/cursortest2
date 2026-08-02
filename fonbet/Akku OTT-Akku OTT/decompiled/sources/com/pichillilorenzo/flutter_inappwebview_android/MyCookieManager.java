package com.pichillilorenzo.flutter_inappwebview_android;

import android.support.v4.media.session.f;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import androidx.browser.browseractions.a;
import androidx.compose.runtime.changelist.d;
import androidx.media3.common.util.e;
import androidx.webkit.CookieManagerCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import j$.util.DesugarTimeZone;
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

/* loaded from: classes4.dex */
public class MyCookieManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "MyCookieManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_cookiemanager";
    public static CookieManager cookieManager;
    public InAppWebViewFlutterPlugin plugin;

    public MyCookieManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static String getCookieExpirationDate(Long l) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(new Date(l.longValue()));
    }

    private static CookieManager getCookieManager() {
        if (cookieManager == null) {
            try {
                cookieManager = CookieManager.getInstance();
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Exception e) {
                if (e.getMessage() == null || !e.getClass().getCanonicalName().equals("android.webkit.WebViewFactory.MissingWebViewPackageException")) {
                    throw e;
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

    public void deleteAllCookies(final MethodChannel.Result result) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            result.success(Boolean.FALSE);
        } else {
            cookieManager.removeAllCookies(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.3
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Boolean bool) {
                    result.success(bool);
                }
            });
            cookieManager.flush();
        }
    }

    public void deleteCookie(String str, String str2, String str3, String str4, final MethodChannel.Result result) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            result.success(Boolean.FALSE);
            return;
        }
        String a = e.a(str2, "=; Path=", str4, "; Max-Age=-1");
        if (str3 != null) {
            a = f.b(a, "; Domain=", str3);
        }
        cookieManager.setCookie(str, d.b(a, ";"), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.2
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Boolean bool) {
                result.success(bool);
            }
        });
        cookieManager.flush();
    }

    public void deleteCookies(String str, String str2, String str3, MethodChannel.Result result) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            result.success(Boolean.FALSE);
            return;
        }
        String cookie = cookieManager2.getCookie(str);
        if (cookie != null) {
            for (String str4 : cookie.split(";")) {
                String a = e.a(str4.split("=", 2)[0].trim(), "=; Path=", str3, "; Max-Age=-1");
                if (str2 != null) {
                    a = f.b(a, "; Domain=", str2);
                }
                cookieManager.setCookie(str, d.b(a, ";"), null);
            }
            cookieManager.flush();
        }
        result.success(Boolean.TRUE);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    public List<Map<String, Object>> getCookies(String str) {
        ArrayList arrayList = new ArrayList();
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 != null) {
            List arrayList2 = new ArrayList();
            String str2 = WebViewFeature.GET_COOKIE_INFO;
            if (WebViewFeature.isFeatureSupported(WebViewFeature.GET_COOKIE_INFO)) {
                arrayList2 = CookieManagerCompat.getCookieInfo(cookieManager, str);
            } else {
                String cookie = cookieManager.getCookie(str);
                if (cookie != null) {
                    arrayList2 = Arrays.asList(cookie.split(";"));
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String[] split = ((String) it.next()).split(";");
                if (split.length != 0) {
                    String[] split2 = split[0].split("=", 2);
                    String trim = split2[0].trim();
                    String trim2 = split2.length > 1 ? split2[1].trim() : "";
                    HashMap hashMap = new HashMap();
                    hashMap.put("name", trim);
                    hashMap.put("value", trim2);
                    hashMap.put("expiresDate", null);
                    hashMap.put("isSessionOnly", null);
                    hashMap.put("domain", null);
                    hashMap.put("sameSite", null);
                    hashMap.put("isSecure", null);
                    hashMap.put("isHttpOnly", null);
                    hashMap.put("path", null);
                    if (WebViewFeature.isFeatureSupported(str2)) {
                        Boolean bool = Boolean.FALSE;
                        hashMap.put("isSecure", bool);
                        hashMap.put("isHttpOnly", bool);
                        int i = 1;
                        while (i < split.length) {
                            Iterator it2 = it;
                            String[] split3 = split[i].split("=", 2);
                            String trim3 = split3[0].trim();
                            String[] strArr = split;
                            String str3 = str2;
                            String trim4 = split3.length > 1 ? split3[1].trim() : "";
                            if (trim3.equalsIgnoreCase(RtspHeaders.EXPIRES)) {
                                try {
                                    Date parse = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.US).parse(trim4);
                                    if (parse != null) {
                                        hashMap.put("expiresDate", Long.valueOf(parse.getTime()));
                                    }
                                } catch (NumberFormatException | ParseException unused) {
                                }
                            } else if (trim3.equalsIgnoreCase("Max-Age")) {
                                hashMap.put("expiresDate", Long.valueOf(System.currentTimeMillis() + Long.parseLong(trim4)));
                            } else if (trim3.equalsIgnoreCase("Domain")) {
                                hashMap.put("domain", trim4);
                            } else if (trim3.equalsIgnoreCase("SameSite")) {
                                hashMap.put("sameSite", trim4);
                            } else if (trim3.equalsIgnoreCase("Secure")) {
                                hashMap.put("isSecure", Boolean.TRUE);
                            } else if (trim3.equalsIgnoreCase("HttpOnly")) {
                                hashMap.put("isHttpOnly", Boolean.TRUE);
                            } else if (trim3.equalsIgnoreCase("Path")) {
                                hashMap.put("path", trim4);
                            }
                            i++;
                            split = strArr;
                            it = it2;
                            str2 = str3;
                        }
                    }
                    arrayList.add(hashMap);
                    it = it;
                    str2 = str2;
                }
            }
        }
        return arrayList;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        init();
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "deleteCookie":
                deleteCookie((String) methodCall.argument("url"), (String) methodCall.argument("name"), (String) methodCall.argument("domain"), (String) methodCall.argument("path"), result);
                break;
            case "removeSessionCookies":
                removeSessionCookies(result);
                break;
            case "setCookie":
                String str2 = (String) methodCall.argument("url");
                String str3 = (String) methodCall.argument("name");
                String str4 = (String) methodCall.argument("value");
                String str5 = (String) methodCall.argument("domain");
                String str6 = (String) methodCall.argument("path");
                String str7 = (String) methodCall.argument("expiresDate");
                setCookie(str2, str3, str4, str5, str6, str7 != null ? new Long(str7) : null, (Integer) methodCall.argument("maxAge"), (Boolean) methodCall.argument("isSecure"), (Boolean) methodCall.argument("isHttpOnly"), (String) methodCall.argument("sameSite"), result);
                break;
            case "deleteCookies":
                deleteCookies((String) methodCall.argument("url"), (String) methodCall.argument("domain"), (String) methodCall.argument("path"), result);
                break;
            case "deleteAllCookies":
                deleteAllCookies(result);
                break;
            case "getCookies":
                result.success(getCookies((String) methodCall.argument("url")));
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    public void removeSessionCookies(final MethodChannel.Result result) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            result.success(Boolean.FALSE);
        } else {
            cookieManager.removeSessionCookies(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.4
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Boolean bool) {
                    result.success(bool);
                }
            });
            cookieManager.flush();
        }
    }

    public void setCookie(String str, String str2, String str3, String str4, String str5, Long l, Integer num, Boolean bool, Boolean bool2, String str6, final MethodChannel.Result result) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            result.success(Boolean.FALSE);
            return;
        }
        String str7 = str2 + "=" + str3 + "; Path=" + str5;
        if (str4 != null) {
            str7 = f.b(str7, "; Domain=", str4);
        }
        if (l != null) {
            StringBuilder d = a.d(str7, "; Expires=");
            d.append(getCookieExpirationDate(l));
            str7 = d.toString();
        }
        if (num != null) {
            StringBuilder d2 = a.d(str7, "; Max-Age=");
            d2.append(num.toString());
            str7 = d2.toString();
        }
        if (bool != null && bool.booleanValue()) {
            str7 = d.b(str7, "; Secure");
        }
        if (bool2 != null && bool2.booleanValue()) {
            str7 = d.b(str7, "; HttpOnly");
        }
        if (str6 != null) {
            str7 = f.b(str7, "; SameSite=", str6);
        }
        cookieManager.setCookie(str, d.b(str7, ";"), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.1
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Boolean bool3) {
                result.success(bool3);
            }
        });
        cookieManager.flush();
    }
}
