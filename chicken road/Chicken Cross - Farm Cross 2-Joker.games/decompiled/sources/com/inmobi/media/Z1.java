package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Z1 {
    public static boolean a(Context context, String url, Ji redirectionValidator, String api, Y9 y9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        if (y9 != null) {
            ((Z9) y9).c("AppstoreLinkHandler", "In appStoreLinkHandled");
        }
        Intrinsics.checkNotNullParameter(url, "url");
        if (url.length() != 0) {
            Uri parse = Uri.parse(url);
            if (Intrinsics.areEqual("market", parse.getScheme()) || Intrinsics.areEqual("play.google.com", parse.getHost()) || Intrinsics.areEqual("market.android.com", parse.getHost())) {
                Uri parse2 = Uri.parse(url);
                if (context != null) {
                    try {
                        context.getPackageManager().getPackageInfo("com.android.vending", 0);
                        if (!redirectionValidator.c()) {
                            redirectionValidator.a("EX_" + api);
                            return false;
                        }
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW", parse2);
                            intent.setPackage("com.android.vending");
                            intent.addFlags(268435456);
                            context.startActivity(intent);
                            if (y9 != null) {
                                ((Z9) y9).c("AppstoreLinkHandler", "Playstore link handled successfully");
                            }
                            return true;
                        } catch (IllegalArgumentException e) {
                            if (y9 != null) {
                                ((Z9) y9).c("AppstoreLinkHandler", "IllegalArgumentException: Processing appStoreLinkHandling: " + e.getMessage());
                            }
                            return false;
                        } catch (Exception e2) {
                            if (y9 != null) {
                                ((Z9) y9).c("AppstoreLinkHandler", "ActivityNotFoundException: Processing appStoreLinkHandling: " + e2.getMessage());
                            }
                            return false;
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        e3.printStackTrace();
                    }
                }
                int a2 = M5.a(context, url, redirectionValidator, api, y9);
                if (a2 != 0 && a2 != 1) {
                    return false;
                }
                if (y9 != null) {
                    ((Z9) y9).c("AppstoreLinkHandler", "Playstore link handled successfully");
                }
                return true;
            }
        }
        return false;
    }
}
