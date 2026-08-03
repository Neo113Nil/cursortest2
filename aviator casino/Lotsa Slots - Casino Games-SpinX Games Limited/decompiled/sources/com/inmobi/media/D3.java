package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class D3 {
    public static final int a(int[] iArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length != 4 ? androidx.core.view.ViewCompat.MEASURED_STATE_MASK : android.graphics.Color.argb(iArr[0], iArr[1], iArr[2], iArr[3]);
    }
}
