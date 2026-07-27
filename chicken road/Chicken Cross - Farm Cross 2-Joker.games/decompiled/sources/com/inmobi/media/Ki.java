package com.inmobi.media;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import com.inmobi.media.core.config.models.RootConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Ki {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f6675a;

    static {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        f6675a = ((RootConfig) AbstractC4260z4.f7518a.a(RootConfig.class)).getReducedUserAgentInfoEnabled();
    }

    public static String a() {
        try {
            PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage != null) {
                return currentWebViewPackage.versionName;
            }
            return null;
        } catch (Exception e) {
            String str = "Unable to get current WebView package version: " + e.getMessage();
            return null;
        }
    }

    public static String b() {
        if (Build.VERSION.SDK_INT >= 26) {
            return a();
        }
        return null;
    }
}
