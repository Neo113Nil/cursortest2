package com.inmobi.media;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.webkit.URLUtil;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.inmobi.ads.rendering.InMobiInAppBrowserActivity;
import com.inmobi.media.ads.network.common.model.InlineParams;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class Ub {
    public static final /* synthetic */ int j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f6888a;
    public final Vb b;
    public final C3998pj c;
    public final Lb d;
    public final Ji e;
    public final Zb f;
    public final Y9 g;
    public final WeakReference h;
    public int i;

    public /* synthetic */ Ub(Context context, Vb vb, C3766he c3766he, Ji ji, Zb zb, Y9 y9, int i) {
        this(context, vb, null, (i & 8) != 0 ? null : c3766he, ji, zb, y9, null);
    }

    public static /* synthetic */ Tb a(Ub ub, String str, String str2, String str3, Yb yb, int i) {
        if ((i & 8) != 0) {
            yb = null;
        }
        return ub.a(str, str2, str3, yb, (i & 16) == 0);
    }

    public final Tb b(String str, String str2, String str3, Yb yb) {
        Y9 y9 = this.g;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
            ((Z9) y9).c("Ub", "In processInMobiNativeBrowserScheme");
        }
        String queryParameter = Uri.parse(str3).getQueryParameter("url");
        if (queryParameter == null || queryParameter.length() == 0) {
            Lb lb = this.d;
            if (lb != null) {
                lb.a(str2, "Invalid URL", str);
            }
            Y9 y92 = this.g;
            if (y92 != null) {
                Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                ((Z9) y92).c("Ub", "InMobiNativeBrowserScheme url is Empty or null");
            }
            a(Mb.e, yb, Integer.valueOf(ConnectionsStatusCodes.STATUS_ALREADY_ADVERTISING));
            return new Tb(3, Integer.valueOf(ConnectionsStatusCodes.STATUS_ALREADY_ADVERTISING));
        }
        if (yb != null) {
            yb.f = "EX_NATIVE";
        }
        boolean a2 = M5.a(str3, this.f6888a, this.e, this.g);
        Y9 y93 = this.g;
        if (y93 != null) {
            Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
            ((Z9) y93).c("Ub", "openDefaultApplication result = " + a2 + " for url = " + str3);
        }
        if (a2) {
            a(Mb.f, yb, (Integer) null);
            c(str, str2, str3);
            Y9 y94 = this.g;
            if (y94 != null) {
                Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                ((Z9) y94).c("Ub", "InmobiNativeBrowser scheme url handled successfully");
            }
            return new Tb(1);
        }
        Y9 y95 = this.g;
        if (y95 != null) {
            Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
            ((Z9) y95).c("Ub", "Trying appLinkOrDeepLinkHandled with urlEndpoint = " + queryParameter);
        }
        int a3 = M5.a(this.f6888a, queryParameter, this.e, str, this.g);
        if (a3 == 0 || a3 == 1) {
            a(Mb.f, yb, (Integer) null);
            c(str, str2, str3);
            Y9 y96 = this.g;
            if (y96 != null) {
                Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                ((Z9) y96).c("Ub", "InmobiNativeBrowser scheme url handled successfully");
            }
            return new Tb(1);
        }
        Lb lb2 = this.d;
        if (lb2 != null) {
            lb2.a(str2, "Invalid URL", str);
        }
        Y9 y97 = this.g;
        if (y97 != null) {
            Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
            ((Z9) y97).c("Ub", "processedResult = " + a3);
        }
        Y9 y98 = this.g;
        if (y98 != null) {
            Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
            ((Z9) y98).c("Ub", "InmobiNativeBrowser scheme url handling failed");
        }
        a(Mb.g, yb, Integer.valueOf(a3));
        return new Tb(2, Integer.valueOf(a3));
    }

    public final int c(String str, String str2, String str3, Yb yb) {
        Y9 y9 = this.g;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
            ((Z9) y9).a("Ub", "In processInternalNativeRequest");
        }
        try {
            return d(str, str2, str3, yb);
        } catch (Exception e) {
            Lb lb = this.d;
            if (lb != null) {
                lb.a(str2, "Unexpected error", "open");
            }
            Kc.a((byte) 1, "InMobi", "Failed to open URL SDK encountered unexpected error");
            Y9 y92 = this.g;
            if (y92 == null) {
                return 9;
            }
            Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
            ((Z9) y92).b("Ub", "SDK encountered unexpected error in handling open() request from creative " + e.getMessage());
            return 9;
        }
    }

    public final int d(String api, String str, String str2, Yb yb) {
        Activity activity;
        String a2;
        Ej ej;
        Intrinsics.checkNotNullParameter(api, "api");
        Y9 y9 = this.g;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
            ((Z9) y9).c("Ub", "processOpenCCTRequest - url - " + str2);
        }
        if (yb != null) {
            yb.f = "IN_NATIVE";
        }
        if (str2 == null || (StringsKt.startsWith$default(str2, ProxyConfig.MATCH_HTTP, false, 2, (Object) null) && !URLUtil.isValidUrl(str2))) {
            Y9 y92 = this.g;
            if (y92 != null) {
                Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                ((Z9) y92).c("Ub", api + " called with invalid url (" + str2 + ")");
            }
            Lb lb = this.d;
            if (lb != null) {
                lb.a(str, "Invalid URL", api);
            }
            a(Mb.e, yb, (Integer) 3);
            return 3;
        }
        WeakReference weakReference = this.h;
        if (weakReference == null || (ej = (Ej) weakReference.get()) == null) {
            activity = null;
        } else {
            activity = ej.getFullScreenActivity();
            if (activity == null) {
                activity = ej.getBannerHolderActivity().get();
            }
        }
        if (activity == null) {
            activity = this.f6888a;
        }
        Context context = activity;
        String a3 = H5.a(context);
        try {
            boolean z = this.b.c;
            try {
                if (a3 != null && z) {
                    C4038r3 c4038r3 = new C4038r3(str2, null, context, this.c, this.e, yb, api);
                    F5 f5 = c4038r3.e;
                    Context context2 = c4038r3.f;
                    if (f5.f6549a == null && context2 != null && (a2 = H5.a(context2)) != null) {
                        D5 d5 = new D5(f5);
                        f5.b = d5;
                        CustomTabsClient.bindCustomTabsService(context2, a2, d5);
                    }
                    Y9 y93 = this.g;
                    if (y93 != null) {
                        Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                        ((Z9) y93).c("Ub", "Default and Internal Native handled successfully");
                    }
                    return 0;
                }
                Y9 y94 = this.g;
                if (y94 != null) {
                    Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                    ((Z9) y94).a("Ub", "ChromeCustomTab fallback to Embedded");
                }
                if (yb != null) {
                    yb.f = "IN_CUSTOM";
                }
                return a(str2, api, yb);
            } catch (Exception unused) {
                try {
                    int a4 = Y3.a(context, str2, this.e, api);
                    if (a4 != 0 && a4 != 1) {
                        return a4;
                    }
                    c(api, str, str2);
                    if (yb != null) {
                        yb.f = "EX_NATIVE";
                    }
                    a(Mb.f, yb, (Integer) null);
                    return a4;
                } catch (Exception e) {
                    Y9 y95 = this.g;
                    if (y95 != null) {
                        Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                        ((Z9) y95).a("Ub", "Exception occurred while opening External ", e);
                    }
                    return 9;
                }
            }
        } catch (Exception unused2) {
        }
    }

    public final int e(String str, String str2, String str3, Yb yb) {
        Y9 y9 = this.g;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
            ((Z9) y9).a("Ub", "In processOpenExternalNativeRequest");
        }
        int a2 = M5.a(this.f6888a, str3, this.e, str, this.g);
        if (a2 != 0 && a2 != 1) {
            return d(str, str2, str3, yb);
        }
        if (yb != null) {
            yb.f = "EX_NATIVE";
        }
        a(Mb.f, yb, (Integer) null);
        c(str, str2, str3);
        Y9 y92 = this.g;
        if (y92 == null) {
            return 0;
        }
        Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
        ((Z9) y92).c("Ub", "External Native handled successfully");
        return 0;
    }

    public final void f(String str, String str2, String str3, Yb yb) {
        String str4;
        try {
            int a2 = Y3.a(this.f6888a, str2, this.e, "openExternal");
            if (a2 != 0 && a2 != 1) {
                a(Mb.g, yb, Integer.valueOf(a2));
                Lb lb = this.d;
                if (lb != null) {
                    try {
                        str4 = URLEncoder.encode(str2, "UTF-8");
                        Intrinsics.checkNotNull(str4);
                    } catch (UnsupportedEncodingException unused) {
                        str4 = str2;
                    }
                    lb.a(str, "Cannot resolve URI (" + str4 + ")", "openExternal");
                    return;
                }
                return;
            }
            a(Mb.f, yb, (Integer) null);
            c("openExternal", str, str2);
        } catch (ActivityNotFoundException e) {
            a(this, str, str2, str3, yb, e);
        } catch (NullPointerException e2) {
            a(this, str, str2, str3, yb, e2);
        } catch (URISyntaxException e3) {
            a(this, str, str2, str3, yb, e3);
        } catch (Exception e4) {
            a(Mb.g, yb, (Integer) 9);
            Lb lb2 = this.d;
            if (lb2 != null) {
                lb2.a(str, "Unexpected error", "openExternal");
            }
            Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
            Kc.a((byte) 1, "Ub", "Could not open URL SDK encountered an unexpected error");
            Y9 y9 = this.g;
            if (y9 != null) {
                Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                ((Z9) y9).b("Ub", "SDK encountered unexpected error in handling openExternal() request from creative " + e4.getMessage());
            }
        }
    }

    public Ub(Context context, Vb landingPageState, C3998pj c3998pj, Lb lb, Ji redirectionValidator, Zb zb, Y9 y9, WeakReference weakReference) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(landingPageState, "landingPageState");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        this.f6888a = context;
        this.b = landingPageState;
        this.c = c3998pj;
        this.d = lb;
        this.e = redirectionValidator;
        this.f = zb;
        this.g = y9;
        this.h = weakReference;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b9, code lost:
    
        if (r7.equals("DEFAULT") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0151, code lost:
    
        if (r7.equals("IN_NATIVE") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01bc, code lost:
    
        r7 = r16.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01be, code lost:
    
        if (r7 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c0, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
        ((com.inmobi.media.Z9) r7).c("Ub", "default - internal native");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ca, code lost:
    
        r1 = c(r17, r18, r19, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0196, code lost:
    
        if (r7.equals("EX_NATIVE") == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a0, code lost:
    
        r7 = r16.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a2, code lost:
    
        if (r7 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a4, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
        ((com.inmobi.media.Z9) r7).c("Ub", "open external native");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ae, code lost:
    
        r1 = e(r17, r18, r19, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x019d, code lost:
    
        if (r7.equals("SKSTORE") == false) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Tb a(String api, String str, String str2, Yb yb, boolean z) {
        Yb yb2;
        Y9 y9;
        Y9 y92;
        int c;
        Y9 y93;
        Zb zb;
        Intrinsics.checkNotNullParameter(api, "api");
        Y9 y94 = this.g;
        if (y94 != null) {
            Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
            ((Z9) y94).c("Ub", "processing URL - " + str2);
        }
        if (!z) {
            if (yb != null) {
                yb2 = yb;
            } else if (!this.b.f6911a && (zb = this.f) != null) {
                String a2 = Pb.a(str2);
                int i = this.i + 1;
                this.i = i;
                yb2 = new Yb(zb, a2, i, SystemClock.elapsedRealtime());
            }
            a(Mb.d, yb2, (Integer) null);
            if (str2 != null || str2.length() == 0) {
                y9 = this.g;
                if (y9 != null) {
                    Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                    ((Z9) y9).c("Ub", "url is empty");
                }
                a(Mb.e, yb2, (Integer) 2);
                b(api, str, str2);
                return new Tb(3, 2);
            }
            Uri parse = Uri.parse(str2);
            String scheme = parse.getScheme();
            if (scheme == null || scheme.length() == 0) {
                Y9 y95 = this.g;
                if (y95 != null) {
                    Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                    ((Z9) y95).c("Ub", "url scheme is empty");
                }
                a(Mb.e, yb2, (Integer) 4);
                b(api, str, str2);
                return new Tb(3, 4);
            }
            if (Intrinsics.areEqual(this.b.b, "SKSTORE") && !z) {
                Y9 y96 = this.g;
                if (y96 != null) {
                    Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                    ((Z9) y96).c("Ub", "inline installer");
                }
                return a(api, str, str2, (String) null, yb2);
            }
            if (Intrinsics.areEqual(parse.getScheme(), "inmobinativebrowser")) {
                Y9 y97 = this.g;
                if (y97 != null) {
                    Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                    ((Z9) y97).c("Ub", "inmobi native browser scheme");
                }
                return b(api, str, str2, yb2);
            }
            if (Intrinsics.areEqual(parse.getScheme(), "inmobideeplink")) {
                Y9 y98 = this.g;
                if (y98 != null) {
                    Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                    ((Z9) y98).c("Ub", "inmobi deeplink scheme");
                }
                return a(api, str, str2, yb2);
            }
            if (Z1.a(this.f6888a, str2, this.e, api, this.g) || M5.a(str2, this.f6888a, this.e, this.g)) {
                Y9 y99 = this.g;
                if (y99 != null) {
                    Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                    ((Z9) y99).c("Ub", "appstore link");
                }
                c(api, str, str2);
                if (yb2 != null) {
                    yb2.f = "EX_NATIVE";
                }
                a(Mb.f, yb2, (Integer) null);
                return new Tb(1);
            }
            Intrinsics.checkNotNull(parse);
            if (!Y3.a(parse)) {
                int a3 = M5.a(this.f6888a, str2, this.e, api, this.g);
                if (yb2 != null) {
                    yb2.f = "EX_NATIVE";
                }
                if (a3 == 0 || a3 == 1) {
                    a(Mb.f, yb2, (Integer) null);
                    c(api, str, str2);
                    Y9 y910 = this.g;
                    if (y910 != null) {
                        Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                        ((Z9) y910).c("Ub", "Deeplink url handled successfully");
                    }
                    return new Tb(1);
                }
                Y9 y911 = this.g;
                if (y911 != null) {
                    Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                    ((Z9) y911).c("Ub", "In processOpenRequest else");
                }
                b(api, str, str2);
                a(Mb.g, yb2, Integer.valueOf(a3));
                return new Tb(2, Integer.valueOf(a3));
            }
            Y9 y912 = this.g;
            if (y912 != null) {
                Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                ((Z9) y912).c("Ub", "http link");
            }
            Vb vb = this.b;
            if (vb.f6911a) {
                return new Tb(0);
            }
            String str3 = vb.b;
            switch (str3.hashCode()) {
                case -2032180703:
                    break;
                case -1420186263:
                    break;
                case -702637789:
                    break;
                case 112775115:
                    if (str3.equals("IN_CUSTOM")) {
                        Y9 y913 = this.g;
                        if (y913 != null) {
                            Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                            ((Z9) y913).c("Ub", "open internal custom");
                        }
                        Y9 y914 = this.g;
                        if (y914 != null) {
                            Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                            ((Z9) y914).a("Ub", "In processOpenInternalCustomRequest");
                        }
                        c = a(str2, api, yb2);
                        if ((c == 0 || c == 1) && (y93 = this.g) != null) {
                            Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                            ((Z9) y93).c("Ub", "Internal Custom handled successfully");
                            break;
                        }
                    }
                    y92 = this.g;
                    if (y92 != null) {
                        Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                        ((Z9) y92).c("Ub", "invalid scheme - open internal native");
                    }
                    c = c(api, str, str2, yb2);
                    break;
                case 409244785:
                    break;
                default:
                    y92 = this.g;
                    if (y92 != null) {
                    }
                    c = c(api, str, str2, yb2);
                    break;
            }
            if (c == 0 || c == 1) {
                return new Tb(1);
            }
            if (yb2 != null) {
                yb2.f = this.b.b;
            }
            a(Mb.g, yb2, Integer.valueOf(c));
            return new Tb(2, Integer.valueOf(c));
        }
        yb2 = null;
        a(Mb.d, yb2, (Integer) null);
        if (str2 != null) {
        }
        y9 = this.g;
        if (y9 != null) {
        }
        a(Mb.e, yb2, (Integer) 2);
        b(api, str, str2);
        return new Tb(3, 2);
    }

    public final void c(String str, String str2, String str3) {
        Lb lb = this.d;
        if (lb != null) {
            lb.a();
        }
        Lb lb2 = this.d;
        if (lb2 != null) {
            lb2.b(str, str2, str3);
        }
    }

    public final void b(String str, String str2, String str3) {
        Y9 y9 = this.g;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
            ((Z9) y9).c("Ub", str + " called with invalid url (" + str3 + ")");
        }
        Lb lb = this.d;
        if (lb != null) {
            lb.a(str2, "Invalid URL", str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.content.Context] */
    public final boolean a(String str, String str2, Yb yb, C3925n3 c3925n3) {
        Activity activity;
        String a2;
        Ej ej;
        try {
            if (this.b.d && c3925n3 != null) {
                WeakReference weakReference = this.h;
                if (weakReference == null || (ej = (Ej) weakReference.get()) == null) {
                    activity = null;
                } else {
                    activity = ej.getFullScreenActivity();
                    if (activity == null) {
                        activity = ej.getBannerHolderActivity().get();
                    }
                }
                Activity activity2 = activity != null ? activity : this.f6888a;
                String a3 = H5.a(activity2);
                if (a3 != null) {
                    try {
                        if (Ig.b(Ig.a(AbstractC3841k6.g()))) {
                            CustomTabsIntent.Builder.class.getDeclaredMethod("setInitialActivityWidthPx", Integer.TYPE);
                        } else {
                            CustomTabsIntent.Builder.class.getDeclaredMethod("setInitialActivityHeightPx", Integer.TYPE);
                        }
                        C4038r3 c4038r3 = new C4038r3(str2, c3925n3, activity2, this.c, this.e, yb, str);
                        F5 f5 = c4038r3.e;
                        Context context = c4038r3.f;
                        if (f5.f6549a == null && context != null && (a2 = H5.a(context)) != null) {
                            D5 d5 = new D5(f5);
                            f5.b = d5;
                            CustomTabsClient.bindCustomTabsService(context, a2, d5);
                        }
                        return true;
                    } catch (Error | Exception unused) {
                    }
                }
                Y9 y9 = this.g;
                if (y9 != null) {
                    Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                    ((Z9) y9).c("Ub", "Partial tabs not supported: packageName - " + a3);
                }
            }
        } catch (Exception e) {
            Y9 y92 = this.g;
            if (y92 != null) {
                Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                ((Z9) y92).c("Ub", "Error while opening partial tab: " + e.getMessage());
            }
        }
        return false;
    }

    public final int a(String api, String str, String str2, Yb yb, C3925n3 c3925n3) {
        Intrinsics.checkNotNullParameter(api, "api");
        if (str2 != null && str2.length() != 0) {
            Uri parse = Uri.parse(str2);
            String scheme = parse.getScheme();
            if (scheme != null && scheme.length() != 0) {
                if (Intrinsics.areEqual(parse.getScheme(), "inmobinativebrowser")) {
                    b(api, str, str2, yb);
                    return 2;
                }
                if (Intrinsics.areEqual(parse.getScheme(), "inmobideeplink")) {
                    return a(api, str, str2, yb).f6870a == 1 ? 2 : 4;
                }
                if (Z1.a(this.f6888a, str2, this.e, api, this.g) | M5.a(str2, this.f6888a, this.e, this.g)) {
                    c(api, str, str2);
                    if (yb != null) {
                        yb.f = "EX_NATIVE";
                    }
                    a(Mb.f, yb, (Integer) null);
                    return 2;
                }
                Intrinsics.checkNotNull(parse);
                if (Y3.a(parse) && a(api, str2, yb, c3925n3)) {
                    return 5;
                }
                if (Y3.a(parse)) {
                    return 3;
                }
                int a2 = M5.a(this.f6888a, str2, this.e, api, this.g);
                if (yb != null) {
                    yb.f = "EX_NATIVE";
                }
                if (a2 != 0 && a2 != 1) {
                    Y9 y9 = this.g;
                    if (y9 != null) {
                        Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                        ((Z9) y9).b("Ub", "CustomExpand handling failed");
                    }
                    a(Mb.j, yb, (Integer) null);
                    return 4;
                }
                c(api, str, str2);
                a(Mb.f, yb, (Integer) null);
                Y9 y92 = this.g;
                if (y92 != null) {
                    Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                    ((Z9) y92).c("Ub", "Deeplink url handled successfully");
                }
                return 2;
            }
            b(api, str, str2);
            a(Mb.e, yb, (Integer) 4);
            return 1;
        }
        b(api, str, str2);
        a(Mb.e, yb, (Integer) 2);
        return 1;
    }

    public final Tb a(String str, String str2, String str3, Yb yb) {
        Y9 y9 = this.g;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
            ((Z9) y9).a("Ub", "In processInMobiDeepLinkScheme");
        }
        Uri parse = Uri.parse(str3);
        int a2 = a(str, parse.getQueryParameter("primaryUrl"), parse.getQueryParameter("primaryTrackingUrl"));
        if (a2 != 0 && a2 != 1) {
            int a3 = a(str, parse.getQueryParameter("fallbackUrl"), parse.getQueryParameter("fallbackTrackingUrl"));
            if (yb != null) {
                yb.f = "EX_NATIVE";
            }
            if (a3 != 0 && a3 != 1) {
                Lb lb = this.d;
                if (lb != null) {
                    lb.a(str2, "Invalid URL", str);
                }
                Y9 y92 = this.g;
                if (y92 != null) {
                    Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                    ((Z9) y92).c("Ub", "InMobiDeepLinkScheme Fallback Url handling failed");
                }
                a(Mb.g, yb, Integer.valueOf(a3));
                return new Tb(2, Integer.valueOf(a3));
            }
            Y9 y93 = this.g;
            if (y93 != null) {
                Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                ((Z9) y93).c("Ub", "InMobiDeepLinkScheme Fallback Url handled successfully");
            }
            a(Mb.f, yb, (Integer) null);
            c(str, str2, str3);
            return new Tb(1);
        }
        Y9 y94 = this.g;
        if (y94 != null) {
            Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
            ((Z9) y94).c("Ub", "InMobiDeepLinkScheme Primary Url handled successfully");
        }
        if (yb != null) {
            yb.f = "EX_NATIVE";
        }
        a(Mb.f, yb, (Integer) null);
        c(str, str2, str3);
        return new Tb(1);
    }

    public final int a(String str, String str2, String url) {
        Y9 y9 = this.g;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
            ((Z9) y9).c("Ub", "inMobiDeepLinkSchemeUrlHandled - url - " + str2 + " trackingUrl " + url);
        }
        if (str2 != null && str2.length() != 0) {
            if (M5.a(str2, this.f6888a, this.e, this.g)) {
                if (AbstractC3727g4.a(url)) {
                    X3 x3 = X3.f6941a;
                    Intrinsics.checkNotNull(url);
                    Y9 y92 = this.g;
                    Intrinsics.checkNotNullParameter(url, "url");
                    X3.a(url, true, y92);
                } else {
                    Y9 y93 = this.g;
                    if (y93 != null) {
                        Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                        ((Z9) y93).b("Ub", "InMobiDeepLinkScheme scheme tracking url handling is invalid ");
                    }
                }
                Y9 y94 = this.g;
                if (y94 != null) {
                    Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                    ((Z9) y94).c("Ub", "InMobiDeepLinkScheme scheme applink/http url handled successfully");
                }
                return 0;
            }
            int a2 = M5.a(this.f6888a, str2, this.e, str, this.g);
            if (a2 != 0 && a2 != 1) {
                Y9 y95 = this.g;
                if (y95 != null) {
                    Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                    ((Z9) y95).c("Ub", "InMobiDeepLinkScheme scheme applink/http url handling failed");
                }
                return a2;
            }
            if (AbstractC3727g4.a(url)) {
                X3 x32 = X3.f6941a;
                Intrinsics.checkNotNull(url);
                Y9 y96 = this.g;
                Intrinsics.checkNotNullParameter(url, "url");
                X3.a(url, true, y96);
            } else {
                Y9 y97 = this.g;
                if (y97 != null) {
                    Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                    ((Z9) y97).b("Ub", "InMobiDeepLinkScheme scheme tracking url handling is invalid ");
                }
            }
            Y9 y98 = this.g;
            if (y98 != null) {
                Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                ((Z9) y98).c("Ub", "InMobiDeepLinkScheme scheme applink/http url handled successfully");
            }
            return 0;
        }
        Y9 y99 = this.g;
        if (y99 == null) {
            return 2;
        }
        Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
        ((Z9) y99).b("Ub", "InMobiDeepLinkScheme url is Empty or null");
        return 2;
    }

    public final int a(String url, String api, Yb yb) {
        Yb yb2;
        Yb yb3;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(api, "api");
        if (yb != null) {
            yb.f = "IN_CUSTOM";
        }
        if (url.length() == 0) {
            Y9 y9 = this.g;
            if (y9 != null) {
                Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                ((Z9) y9).b("Ub", "processOpenEmbeddedRequest failed due to empty URL");
            }
            a(Mb.e, yb, (Integer) null);
            return 2;
        }
        Uri parse = Uri.parse(url);
        Intrinsics.checkNotNullExpressionValue(parse, "Uri.parse(this)");
        if (Y3.a(parse)) {
            Intent intent = new Intent(this.f6888a, (Class<?>) InMobiInAppBrowserActivity.class);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", url);
            intent.putExtra("viewTouchTimestamp", this.e.getViewTouchTimestamp());
            if (yb != null) {
                yb2 = Yb.a(yb);
                Mb mb = Mb.d;
                yb2.e = 2;
                Unit unit = Unit.INSTANCE;
            } else {
                yb2 = null;
            }
            intent.putExtra("lpTelemetryControlInfo", yb2);
            if (yb != null) {
                yb3 = Yb.a(yb);
                Mb mb2 = Mb.d;
                yb3.e = 2;
                Unit unit2 = Unit.INSTANCE;
            } else {
                yb3 = null;
            }
            intent.putExtra("lpTelemetryControlInfo", yb3);
            Y9 obj = this.g;
            if (obj != null) {
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                HashMap hashMap = AbstractC4237y9.f7497a;
                String key = uuid.toString();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(obj, "obj");
                AbstractC4237y9.f7497a.put(key, new WeakReference(obj));
                intent.putExtra("loggerCacheKey", uuid.toString());
            }
            Lb lb = this.d;
            if (lb != null) {
                lb.a(intent);
            }
            a(Mb.f, yb, (Integer) null);
            Lb lb2 = this.d;
            if (lb2 == null) {
                return 1;
            }
            lb2.b(null, null, url);
            return 1;
        }
        Y9 y92 = this.g;
        if (y92 == null) {
            return 10;
        }
        Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
        ((Z9) y92).b("Ub", "Embedded request unable to handle " + url);
        return 10;
    }

    public final Tb a(String api, String str, String str2, String str3, Yb yb) {
        Activity activity;
        Object qb;
        Ej ej;
        Intrinsics.checkNotNullParameter(api, "api");
        Y9 y9 = this.g;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
            ((Z9) y9).a("Ub", "inline installer called with clickThroughUrl: " + str2 + ", inlineInstallUrl: " + str3);
        }
        if (yb != null) {
            yb.f = "SKSTORE";
        }
        InlineParams inlineParams = this.b.e;
        if (inlineParams == null) {
            qb = new Qb(8700);
        } else {
            WeakReference weakReference = this.h;
            if (weakReference == null || (ej = (Ej) weakReference.get()) == null) {
                activity = null;
            } else {
                activity = ej.getFullScreenActivity();
                if (activity == null) {
                    activity = ej.getBannerHolderActivity().get();
                }
            }
            String targetBundleId = inlineParams.getTargetBundleId();
            if (!AbstractC3727g4.a(str3)) {
                str3 = inlineParams.getUrl();
            }
            if (targetBundleId == null || targetBundleId.length() == 0) {
                qb = new Qb(8702);
            } else if (activity == null) {
                qb = new Qb(8704);
            } else if (str3 != null && str3.length() != 0) {
                String uri = Uri.parse(str3).buildUpon().appendQueryParameter("id", targetBundleId).build().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                qb = new Rb(activity, uri);
            } else {
                qb = new Qb(2);
            }
        }
        if (qb instanceof Rb) {
            return a(api, str, yb, str2, (Rb) qb, inlineParams != null ? inlineParams.getPingMode() : 2);
        }
        if (qb instanceof Qb) {
            return a(str2, api, str, yb, ((Qb) qb).f6800a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Tb a(String str, String str2, String str3, Yb yb, int i) {
        Y9 y9 = this.g;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
            ((Z9) y9).a("Ub", "Executing inline installer fallback flow for URL: " + str);
        }
        a(i, yb);
        if (yb != null) {
            yb.f = "EX_NATIVE";
        }
        if (str != null && str.length() != 0) {
            if (Z1.a(this.f6888a, str, this.e, str2, this.g)) {
                a(Mb.f, yb, (Integer) null);
                c(str2, str3, str);
                return new Tb(1);
            }
            if (M5.a(str, this.f6888a, this.e, this.g)) {
                a(Mb.f, yb, (Integer) null);
                c(str2, str3, str);
                return new Tb(1);
            }
            int e = e(str2, str3, str, yb);
            if (e != 0 && e != 1) {
                a(Mb.g, yb, Integer.valueOf(e));
                Lb lb = this.d;
                if (lb != null) {
                    lb.a(str3, "Launch failed", str2);
                }
                return new Tb(2, Integer.valueOf(e));
            }
            return new Tb(1);
        }
        a(Mb.g, yb, (Integer) 2);
        Lb lb2 = this.d;
        if (lb2 != null) {
            lb2.a(str3, "Launch failed", str2);
        }
        return new Tb(2, 2);
    }

    public final Tb a(String str, String str2, Yb yb, String url, Rb rb, int i) {
        Y9 y9 = this.g;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
            ((Z9) y9).a("Ub", "Executing inline installer flow for URL: " + url);
        }
        int a2 = Y3.a(rb);
        if (a2 != 0 && a2 != 1) {
            Y9 y92 = this.g;
            if (y92 != null) {
                Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                ((Z9) y92).a("Ub", "Inline installer launch failed; executing fallback for URL: " + url + ", errorCode: " + a2);
            }
            return a(url, str, str2, yb, a2);
        }
        if (url != null) {
            Y9 y93 = this.g;
            if (y93 != null) {
                Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
                ((Z9) y93).a("Ub", "Inline installer launch succeeded for URL: " + url);
            }
            if (i != 0) {
                if (i != 1) {
                    X3 x3 = X3.f6941a;
                    Y9 y94 = this.g;
                    Intrinsics.checkNotNullParameter(url, "url");
                    Vh.a(Sh.b, new Q3(url, true, y94, null));
                } else {
                    X3 x32 = X3.f6941a;
                    Y9 y95 = this.g;
                    Intrinsics.checkNotNullParameter(url, "url");
                    X3.a(url, true, y95);
                }
            }
        }
        a(Mb.f, yb, (Integer) null);
        Lb lb = this.d;
        if (lb != null) {
            lb.b(str, str2, url);
        }
        return new Tb(1);
    }

    public final void a(int i, Yb yb) {
        Object m8079constructorimpl;
        Y9 y9;
        Zb zb;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (yb == null || (zb = yb.f6970a) == null) {
                zb = this.f;
            }
            Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)));
            if (zb != null) {
                mutableMapOf.put("plType", zb.c);
                mutableMapOf.put("impressionId", zb.b);
                mutableMapOf.put("plId", Long.valueOf(zb.f6990a));
                mutableMapOf.put("adType", zb.d);
                mutableMapOf.put("markupType", zb.e);
                mutableMapOf.put("creativeType", zb.f);
                mutableMapOf.put("metadataBlob", zb.g);
                mutableMapOf.put("isRewarded", Boolean.valueOf(zb.h));
            }
            if (yb != null) {
                String str = yb.f;
                if (str == null) {
                    str = yb.f6970a.i;
                }
                mutableMapOf.put("trigger", str);
                mutableMapOf.put("urlType", yb.b);
                long j2 = yb.d;
                if (j2 != 0) {
                    CoroutineScope coroutineScope = AbstractC4143un.f7420a;
                    mutableMapOf.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j2));
                }
            }
            mutableMapOf.put("networkType", Y5.g());
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b("InlineInstallFailed", mutableMapOf, EnumC3944nm.f7271a);
            m8079constructorimpl = Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl == null || (y9 = this.g) == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
        ((Z9) y9).b("Ub", "Failed to submit inline install failed telemetry: " + m8082exceptionOrNullimpl.getMessage());
    }

    public static final void a(Ub ub, String str, String str2, String str3, Yb yb, Exception exc) {
        Y9 y9 = ub.g;
        if (y9 != null) {
            Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
            ((Z9) y9).b("Ub", "Error message in processing openExternal: " + exc.getMessage());
        }
        Lb lb = ub.d;
        if (lb != null) {
            try {
                String encode = URLEncoder.encode(str2, "UTF-8");
                Intrinsics.checkNotNull(encode);
                str2 = encode;
            } catch (UnsupportedEncodingException unused) {
            }
            lb.a(str, "Cannot resolve URI (" + str2 + ")", "openExternal");
        }
        if (str3 != null) {
            ub.f(str, str3, null, yb);
        }
    }

    public final void a(Mb funnelState, Yb yb, Integer num) {
        Intrinsics.checkNotNullParameter(funnelState, "funnelState");
        Pb.a(funnelState, yb, num, new Function2() { // from class: com.inmobi.media.Ub$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Ub.a(Ub.this, (String) obj, (Map) obj2);
            }
        });
    }

    public static final Unit a(Ub ub, String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        Lb lb = ub.d;
        if (lb != null) {
            lb.a(trackerName, macros);
        }
        return Unit.INSTANCE;
    }
}
