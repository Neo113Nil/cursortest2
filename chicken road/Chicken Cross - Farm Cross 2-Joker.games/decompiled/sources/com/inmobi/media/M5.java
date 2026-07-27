package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.net.URISyntaxException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class M5 {
    public static int a(Context context, String url, Ji redirectionValidator, String api, Y9 y9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        if (y9 != null) {
            ((Z9) y9).c("DeeplinkHandler", "In appLinkOrDeepLinkHandled");
        }
        if (url.length() == 0) {
            if (y9 == null) {
                return 2;
            }
            ((Z9) y9).c("DeeplinkHandler", "AppLink url is Empty or null");
            return 2;
        }
        try {
            List a2 = Y3.a(context, url);
            if (a2.isEmpty()) {
                if (y9 != null) {
                    ((Z9) y9).c("DeeplinkHandler", " Resolve Info Empty");
                }
                return b(context, url, redirectionValidator, api, y9);
            }
            if (y9 != null) {
                ((Z9) y9).c("DeeplinkHandler", "Resolve Info " + ((ResolveInfo) a2.get(0)).activityInfo.name);
            }
            return a(context, url, (ResolveInfo) a2.get(0), redirectionValidator, api, y9);
        } catch (URISyntaxException unused) {
            if (y9 == null) {
                return 5;
            }
            ((Z9) y9).b("DeeplinkHandler", "URISyntaxException for url: " + url);
            return 5;
        }
    }

    public static int b(Context context, String str, Ji ji, String str2, Y9 y9) {
        try {
            return Y3.a(context, str, ji, str2);
        } catch (ActivityNotFoundException unused) {
            return a(context, str, null, ji, str2, y9);
        } catch (NullPointerException unused2) {
            return a(context, str, null, ji, str2, y9);
        } catch (SecurityException unused3) {
            if (y9 != null) {
                ((Z9) y9).b("DeeplinkHandler", "SecurityException");
            }
            return 12;
        } catch (URISyntaxException unused4) {
            if (y9 != null) {
                ((Z9) y9).b("DeeplinkHandler", "uriSyntaxException");
            }
            return 5;
        } catch (Exception e) {
            if (y9 != null) {
                ((Z9) y9).b("DeeplinkHandler", "Exception: " + e);
            }
            return 9;
        }
    }

    public static boolean a(String url, Context context, Ji redirectionValidator, Y9 y9) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Y5.f6965a.getClass();
        if (!Y5.t() || !redirectionValidator.a()) {
            return false;
        }
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        if (!((TelemetryConfig) AbstractC4260z4.f7518a.a(TelemetryConfig.class)).getLpConfig().getUniversalLinkEnabled()) {
            return false;
        }
        try {
            Uri parse = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(parse, "Uri.parse(this)");
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            Intrinsics.checkNotNullParameter(intent, "<this>");
            intent.addCategory("android.intent.category.BROWSABLE");
            Intrinsics.checkNotNullParameter(intent, "<this>");
            intent.setFlags(268436992);
            Intrinsics.checkNotNullParameter(intent, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(intent);
            if (y9 == null) {
                return true;
            }
            ((Z9) y9).a("DeeplinkHandler", "openDefaultApplication: SUCCESS");
            return true;
        } catch (ActivityNotFoundException unused) {
            if (y9 != null) {
                ((Z9) y9).b("DeeplinkHandler", "openDefaultApplication: ActivityNotFoundException");
            }
            return false;
        } catch (NullPointerException unused2) {
            if (y9 != null) {
                ((Z9) y9).b("DeeplinkHandler", "openDefaultApplication: NullPointerException");
            }
            return false;
        }
    }

    public static int a(Context context, String str, ResolveInfo resolveInfo, Ji ji, String str2, Y9 y9) {
        try {
            return Y3.a(context, str, resolveInfo, ji, str2);
        } catch (ActivityNotFoundException unused) {
            if (y9 != null) {
                ((Z9) y9).b("DeeplinkHandler", "ActivityNotFoundException for url: " + str);
            }
            return 6;
        } catch (NullPointerException unused2) {
            if (y9 != null) {
                ((Z9) y9).b("DeeplinkHandler", "NullPointerException for url: " + str);
            }
            return 13;
        } catch (SecurityException unused3) {
            if (y9 != null) {
                ((Z9) y9).b("DeeplinkHandler", "SecurityException for url: " + str);
            }
            return 12;
        } catch (URISyntaxException unused4) {
            if (y9 != null) {
                ((Z9) y9).b("DeeplinkHandler", "URISyntaxException for url: " + str);
            }
            return 5;
        } catch (Exception e) {
            if (y9 != null) {
                ((Z9) y9).b("DeeplinkHandler", "Exception: " + e);
            }
            return 9;
        }
    }
}
