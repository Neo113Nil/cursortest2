package com.inmobi.media;

import android.content.res.ColorStateList;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.e7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3673e7 {
    public static final void a(ProgressBar progressBar, Xh progressConfig, float f) {
        Intrinsics.checkNotNullParameter(progressBar, "<this>");
        Intrinsics.checkNotNullParameter(progressConfig, "progressConfig");
        progressBar.setProgressTintList(ColorStateList.valueOf(AbstractC3558a4.a(progressConfig.c)));
        progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(AbstractC3558a4.a(progressConfig.d)));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (progressConfig.e * f));
        layoutParams.addRule(12);
        progressBar.setLayoutParams(layoutParams);
    }
}
