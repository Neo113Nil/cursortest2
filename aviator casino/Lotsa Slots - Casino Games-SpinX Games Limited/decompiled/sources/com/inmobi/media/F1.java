package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class F1 {
    public static boolean a(android.content.Context context, java.lang.String url, com.inmobi.media.InterfaceC2859wh redirectionValidator, java.lang.String api, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(api, "api");
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("AppstoreLinkHandler", "In appStoreLinkHandled");
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        if (url.length() != 0) {
            android.net.Uri parse = android.net.Uri.parse(url);
            if (kotlin.jvm.internal.Intrinsics.areEqual("market", parse.getScheme()) || kotlin.jvm.internal.Intrinsics.areEqual("play.google.com", parse.getHost()) || kotlin.jvm.internal.Intrinsics.areEqual("market.android.com", parse.getHost())) {
                android.net.Uri parse2 = android.net.Uri.parse(url);
                if (context != null) {
                    try {
                        context.getPackageManager().getPackageInfo("com.android.vending", 0);
                        if (!redirectionValidator.c()) {
                            redirectionValidator.a("EX_" + api);
                            return false;
                        }
                        try {
                            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", parse2);
                            intent.setPackage("com.android.vending");
                            intent.addFlags(268435456);
                            context.startActivity(intent);
                            if (interfaceC2772t9 != null) {
                                ((com.inmobi.media.C2799u9) interfaceC2772t9).c("AppstoreLinkHandler", "Playstore link handled successfully");
                            }
                            return true;
                        } catch (java.lang.IllegalArgumentException e) {
                            if (interfaceC2772t9 != null) {
                                ((com.inmobi.media.C2799u9) interfaceC2772t9).c("AppstoreLinkHandler", "IllegalArgumentException: Processing appStoreLinkHandling: " + e.getMessage());
                            }
                            return false;
                        } catch (java.lang.Exception e2) {
                            if (interfaceC2772t9 != null) {
                                ((com.inmobi.media.C2799u9) interfaceC2772t9).c("AppstoreLinkHandler", "ActivityNotFoundException: Processing appStoreLinkHandling: " + e2.getMessage());
                            }
                            return false;
                        }
                    } catch (android.content.pm.PackageManager.NameNotFoundException e3) {
                        e3.printStackTrace();
                    }
                }
                int a2 = com.inmobi.media.AbstractC2661p5.a(context, url, redirectionValidator, api, interfaceC2772t9);
                if (a2 != 0 && a2 != 1) {
                    return false;
                }
                if (interfaceC2772t9 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).c("AppstoreLinkHandler", "Playstore link handled successfully");
                }
                return true;
            }
        }
        return false;
    }
}
