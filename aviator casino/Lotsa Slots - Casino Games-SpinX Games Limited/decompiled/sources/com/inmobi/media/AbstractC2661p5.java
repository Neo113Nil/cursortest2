package com.inmobi.media;

/* renamed from: com.inmobi.media.p5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2661p5 {
    public static int a(android.content.Context context, java.lang.String url, com.inmobi.media.InterfaceC2859wh redirectionValidator, java.lang.String api, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(api, "api");
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("DeeplinkHandler", "In appLinkOrDeepLinkHandled");
        }
        if (url.length() == 0) {
            if (interfaceC2772t9 == null) {
                return 2;
            }
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("DeeplinkHandler", "AppLink url is Empty or null");
            return 2;
        }
        try {
            java.util.List a2 = com.inmobi.media.B3.a(context, url);
            if (a2.isEmpty()) {
                if (interfaceC2772t9 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).c("DeeplinkHandler", " Resolve Info Empty");
                }
                return b(context, url, redirectionValidator, api, interfaceC2772t9);
            }
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).c("DeeplinkHandler", "Resolve Info " + ((android.content.pm.ResolveInfo) a2.get(0)).activityInfo.name);
            }
            return a(context, url, (android.content.pm.ResolveInfo) a2.get(0), redirectionValidator, api, interfaceC2772t9);
        } catch (java.net.URISyntaxException unused) {
            if (interfaceC2772t9 == null) {
                return 5;
            }
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("DeeplinkHandler", "URISyntaxException for url: " + url);
            return 5;
        }
    }

    public static int b(android.content.Context context, java.lang.String str, com.inmobi.media.InterfaceC2859wh interfaceC2859wh, java.lang.String str2, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        try {
            return com.inmobi.media.B3.a(context, str, interfaceC2859wh, str2);
        } catch (android.content.ActivityNotFoundException unused) {
            return a(context, str, null, interfaceC2859wh, str2, interfaceC2772t9);
        } catch (java.lang.NullPointerException unused2) {
            return a(context, str, null, interfaceC2859wh, str2, interfaceC2772t9);
        } catch (java.lang.SecurityException unused3) {
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("DeeplinkHandler", "SecurityException");
            }
            return 12;
        } catch (java.net.URISyntaxException unused4) {
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("DeeplinkHandler", "uriSyntaxException");
            }
            return 5;
        } catch (java.lang.Exception e) {
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("DeeplinkHandler", "Exception: " + e);
            }
            return 9;
        }
    }

    public static boolean a(java.lang.String url, android.content.Context context, com.inmobi.media.InterfaceC2859wh redirectionValidator, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        com.inmobi.media.B5.f4614a.getClass();
        if (!com.inmobi.media.B5.t() || !redirectionValidator.a()) {
            return false;
        }
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.TelemetryConfig.class, "clazz");
        if (!((com.inmobi.media.core.config.models.TelemetryConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.TelemetryConfig.class)).getLpConfig().getUniversalLinkEnabled()) {
            return false;
        }
        try {
            android.net.Uri parse = android.net.Uri.parse(url);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "Uri.parse(this)");
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", parse);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
            intent.addCategory("android.intent.category.BROWSABLE");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
            intent.setFlags(268436992);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(intent);
            if (interfaceC2772t9 == null) {
                return true;
            }
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("DeeplinkHandler", "openDefaultApplication: SUCCESS");
            return true;
        } catch (android.content.ActivityNotFoundException unused) {
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("DeeplinkHandler", "openDefaultApplication: ActivityNotFoundException");
            }
            return false;
        } catch (java.lang.NullPointerException unused2) {
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("DeeplinkHandler", "openDefaultApplication: NullPointerException");
            }
            return false;
        }
    }

    public static int a(android.content.Context context, java.lang.String str, android.content.pm.ResolveInfo resolveInfo, com.inmobi.media.InterfaceC2859wh interfaceC2859wh, java.lang.String str2, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        try {
            return com.inmobi.media.B3.a(context, str, resolveInfo, interfaceC2859wh, str2);
        } catch (android.content.ActivityNotFoundException unused) {
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("DeeplinkHandler", "ActivityNotFoundException for url: " + str);
            }
            return 6;
        } catch (java.lang.NullPointerException unused2) {
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("DeeplinkHandler", "NullPointerException for url: " + str);
            }
            return 13;
        } catch (java.lang.SecurityException unused3) {
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("DeeplinkHandler", "SecurityException for url: " + str);
            }
            return 12;
        } catch (java.net.URISyntaxException unused4) {
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("DeeplinkHandler", "URISyntaxException for url: " + str);
            }
            return 5;
        } catch (java.lang.Exception e) {
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("DeeplinkHandler", "Exception: " + e);
            }
            return 9;
        }
    }
}
