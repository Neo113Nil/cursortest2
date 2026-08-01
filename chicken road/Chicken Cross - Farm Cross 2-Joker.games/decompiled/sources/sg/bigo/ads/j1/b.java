package sg.bigo.ads.j1;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.adjust.sdk.Constants;
import com.ironsource.U3;
import com.tiktok.util.UrlConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public abstract class b {
    public static String a(String str, LinkedHashMap linkedHashMap, String str2) {
        String host = Uri.parse(str2).getHost();
        if (I.a((CharSequence) str) || linkedHashMap.isEmpty() || I.a((CharSequence) host)) {
            return str2;
        }
        try {
            Set<String> queryParameterNames = Uri.parse(str2).getQueryParameterNames();
            if (!str.equals("all") && !str.contains(host)) {
                return str2;
            }
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (!queryParameterNames.contains(entry.getKey())) {
                    sb.append((String) entry.getValue()).append(U3.j.c);
                }
            }
            String sb2 = sb.toString();
            if (TextUtils.isEmpty(sb2)) {
                return str2;
            }
            return (str2.contains("?") ? new StringBuilder().append(str2).append(U3.j.c) : new StringBuilder().append(str2).append("?")).append(sb2.substring(0, sb2.length() - 1)).toString();
        } catch (Throwable th) {
            AbstractC5496a.a("LinkUtils", "appendPixel error =" + th.getMessage());
            return str2;
        }
    }

    public static boolean b(String str, Context context) {
        try {
            context.startActivity(context.getPackageManager().getLaunchIntentForPackage(str));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String a(String str, Context context) {
        if (context == null) {
            return null;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setPackage(str);
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 131072).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && activityInfo.exported) {
                return activityInfo.name;
            }
        }
        return null;
    }

    public static boolean a(String str) {
        return str.startsWith("market://") || str.startsWith("http://play.google.com") || str.startsWith("https://play.google.com");
    }

    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    public static boolean a(Uri uri, Context context, Activity activity, sg.bigo.ads.P.f fVar, String str, boolean z, String str2, int i, boolean z2) {
        ?? r11;
        String str3;
        boolean z3;
        if (uri == null || uri.getScheme() == null || context == null) {
            return false;
        }
        if (uri.getScheme().startsWith(ProxyConfig.MATCH_HTTP)) {
            return false;
        }
        fVar.k = uri.toString();
        if (uri.getScheme().startsWith("market")) {
            if (z || i > 0) {
                z3 = true;
                str3 = "android.intent.action.VIEW";
                fVar.d = a(activity, uri, context.getPackageName(), str2, z, i, z2);
                if (fVar.a() == 1) {
                    return true;
                }
            } else {
                z3 = true;
                str3 = "android.intent.action.VIEW";
            }
            Intent addFlags = new Intent(str3, uri).addFlags(268435456);
            addFlags.setPackage("com.android.vending");
            try {
                context.startActivity(addFlags);
                fVar.b = z3 ? 1 : 0;
                return z3;
            } catch (ActivityNotFoundException unused) {
                fVar.b = 2;
                r11 = z3;
            } catch (Exception e) {
                AbstractC5496a.a("LinkUtils", e.toString());
                fVar.b = 4;
                r11 = z3;
            }
        } else {
            r11 = 1;
            str3 = "android.intent.action.VIEW";
        }
        fVar.l = str;
        try {
            context.startActivity(new Intent(str3, uri).addFlags(268435456));
            fVar.c = r11;
            return r11;
        } catch (ActivityNotFoundException unused2) {
            fVar.b = 2;
            return false;
        } catch (Exception e2) {
            AbstractC5496a.a("LinkUtils", e2.toString());
            fVar.c = 4;
            return false;
        }
    }

    public static boolean a(sg.bigo.ads.P.c cVar, Context context, String str, JSONArray jSONArray) {
        int i;
        if (!str.startsWith("http://") && !str.startsWith(UrlConst.HTTPS)) {
            str = "http://".concat(str);
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String optString = jSONArray.optString(i2);
                if (!TextUtils.isEmpty(optString) && a(context, str, optString, arrayList)) {
                    sg.bigo.ads.s1.b.a(cVar, "1", arrayList, optString, 1);
                    return true;
                }
            }
        }
        if (context != null) {
            if (context.getPackageManager().getPackageInfo("com.android.chrome", 256) != null && a(context, str, "com.android.chrome", arrayList)) {
                i = 2;
                sg.bigo.ads.s1.b.a(cVar, "1", arrayList, "", i);
                return true;
            }
        }
        if (!a(context, str, (String) null, arrayList)) {
            sg.bigo.ads.s1.b.a(cVar, "0", arrayList, "", 0);
            return false;
        }
        i = 3;
        sg.bigo.ads.s1.b.a(cVar, "1", arrayList, "", i);
        return true;
    }

    public static boolean a(Context context, String str, String str2, ArrayList arrayList) {
        String str3;
        try {
            Intent addFlags = new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456);
            if (!TextUtils.isEmpty(str2)) {
                addFlags.setPackage(str2);
            }
            context.startActivity(addFlags);
            return true;
        } catch (Exception e) {
            if (e instanceof ActivityNotFoundException) {
                str3 = "Unable to open target URL by browser due to ActivityNotFoundException.";
            } else {
                StringBuilder sb = new StringBuilder();
                if (TextUtils.isEmpty(str2)) {
                    str2 = "unknown";
                }
                arrayList.add(sb.append(str2).append(": ").append(e.getMessage()).toString());
                str3 = "Unable to open target URL by system browser.";
            }
            AbstractC5496a.a(2, 6, "LinkUtils", str3);
            return false;
        }
    }

    public static sg.bigo.ads.P.e a(Activity activity, Uri uri, String str, String str2, boolean z, int i, boolean z2) {
        if (activity != null && uri != null) {
            try {
                if (uri.getScheme() != null && !TextUtils.isEmpty(str)) {
                    String queryParameter = uri.getQueryParameter(Constants.REFERRER);
                    String queryParameter2 = uri.getQueryParameter("id");
                    if (!TextUtils.equals(str2, queryParameter2)) {
                        return new sg.bigo.ads.P.e(queryParameter2, 3, null);
                    }
                    if ("market".equalsIgnoreCase(uri.getScheme())) {
                        String lowerCase = uri.toString().toLowerCase();
                        if (!lowerCase.contains("details") && !lowerCase.contains("launch")) {
                            return new sg.bigo.ads.P.e(queryParameter2, 2, queryParameter);
                        }
                    } else if (!"details".equalsIgnoreCase(uri.getLastPathSegment())) {
                        return new sg.bigo.ads.P.e(queryParameter2, 2, queryParameter);
                    }
                    if (z) {
                        i = 1;
                    }
                    boolean z3 = i == 1;
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setPackage("com.android.vending");
                    intent.setData(Uri.parse("https://play.google.com/d?id=" + queryParameter2));
                    intent.putExtra("overlay", z3);
                    intent.putExtra("callerId", str);
                    if (!I.a((CharSequence) queryParameter)) {
                        intent.putExtra(Constants.REFERRER, queryParameter);
                    }
                    if (intent.resolveActivity(activity.getPackageManager()) == null) {
                        return new sg.bigo.ads.P.e(queryParameter2, 2, queryParameter);
                    }
                    if (z2) {
                        activity.startActivityForResult(intent, 0);
                    }
                    return new sg.bigo.ads.P.e(queryParameter2, 1, queryParameter);
                }
            } catch (Throwable th) {
                th.getMessage();
                return new sg.bigo.ads.P.e(null, 2, null);
            }
        }
        return new sg.bigo.ads.P.e(null, 2, null);
    }

    public static void a(Activity activity, String str, String str2, String str3) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage("com.android.vending");
            intent.setData(Uri.parse("https://play.google.com/d?id=" + str));
            intent.putExtra("overlay", true);
            intent.putExtra("callerId", str2);
            if (!I.a((CharSequence) str3)) {
                intent.putExtra(Constants.REFERRER, str3);
            }
            activity.startActivityForResult(intent, 0);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static boolean a(Uri uri, Context context, Activity activity, sg.bigo.ads.P.f fVar, boolean z, String str, int i, boolean z2) {
        if (context != null && uri != null) {
            if (z || i > 0) {
                fVar.d = a(activity, uri, context.getPackageName(), str, z, i, z2);
                if (fVar.a() == 1) {
                    fVar.n = true;
                    fVar.f12478a = 5;
                    return true;
                }
            }
            Intent addFlags = new Intent("android.intent.action.VIEW", uri).addFlags(268435456);
            addFlags.setPackage("com.android.vending");
            try {
                context.startActivity(addFlags);
                fVar.b = 1;
                fVar.n = true;
                fVar.f12478a = 2;
                return true;
            } catch (ActivityNotFoundException unused) {
                fVar.b = 2;
                try {
                    context.startActivity(new Intent("android.intent.action.VIEW", uri).addFlags(268435456));
                    fVar.n = true;
                    fVar.f12478a = 2;
                    return true;
                } catch (Exception e) {
                    AbstractC5496a.a("LinkUtils", e.toString());
                }
            } catch (Exception e2) {
                AbstractC5496a.a("LinkUtils", e2.toString());
                fVar.b = 4;
                context.startActivity(new Intent("android.intent.action.VIEW", uri).addFlags(268435456));
                fVar.n = true;
                fVar.f12478a = 2;
                return true;
            }
        }
        return false;
    }
}
