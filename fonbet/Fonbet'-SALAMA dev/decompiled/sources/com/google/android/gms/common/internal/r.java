package com.google.android.gms.common.internal;

import android.widget.Button;

/* loaded from: classes.dex */
public final class r extends Button {
    public static final int a(int i7, int i8, int i9, int i10) {
        if (i7 == 0) {
            return i8;
        }
        if (i7 == 1) {
            return i9;
        }
        if (i7 == 2) {
            return i10;
        }
        throw new IllegalStateException(e1.k.d(i7, "Unknown color scheme: "));
    }
}
