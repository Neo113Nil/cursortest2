package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class H6 {
    public static final void a(android.widget.ProgressBar progressBar, com.inmobi.media.Og progressConfig, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressBar, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressConfig, "progressConfig");
        progressBar.setProgressTintList(android.content.res.ColorStateList.valueOf(com.inmobi.media.D3.a(progressConfig.c)));
        progressBar.setProgressBackgroundTintList(android.content.res.ColorStateList.valueOf(com.inmobi.media.D3.a(progressConfig.d)));
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, (int) (progressConfig.e * f));
        layoutParams.addRule(12);
        progressBar.setLayoutParams(layoutParams);
    }
}
