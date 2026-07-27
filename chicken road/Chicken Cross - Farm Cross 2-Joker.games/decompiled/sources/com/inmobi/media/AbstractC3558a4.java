package com.inmobi.media;

import android.graphics.Color;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.a4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3558a4 {
    public static final int a(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length != 4 ? ViewCompat.MEASURED_STATE_MASK : Color.argb(iArr[0], iArr[1], iArr[2], iArr[3]);
    }
}
