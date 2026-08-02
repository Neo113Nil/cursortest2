package com.bumptech.glide.load.engine;

import android.media.AudioManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class q {
    public static final double a(AudioManager audioManager) {
        Intrinsics.checkNotNullParameter(audioManager, "<this>");
        double d = 10000;
        return Math.rint((audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3)) * d) / d;
    }

    public static final long b(long j, long j2, long j3, String str) {
        String str2;
        int i = kotlinx.coroutines.internal.y.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long longOrNull = StringsKt.toLongOrNull(str2);
        if (longOrNull == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = longOrNull.longValue();
        if (j2 <= longValue && longValue <= j3) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
    }

    public static int c(int i, int i2, String str) {
        return (int) b(i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150, str);
    }
}
