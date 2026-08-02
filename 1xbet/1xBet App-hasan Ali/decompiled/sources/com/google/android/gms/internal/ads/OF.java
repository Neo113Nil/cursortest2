package com.google.android.gms.internal.ads;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.media.MediaCodecInfo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class OF {
    public static /* synthetic */ Typeface.CustomFallbackBuilder c(FontFamily fontFamily) {
        return new Typeface.CustomFallbackBuilder(fontFamily);
    }

    public static /* synthetic */ FontFamily.Builder g(Font font) {
        return new FontFamily.Builder(font);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint i() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint j(int i, int i5, int i6) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i5, i6);
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ void r() {
    }

    public static /* synthetic */ void v() {
    }
}
