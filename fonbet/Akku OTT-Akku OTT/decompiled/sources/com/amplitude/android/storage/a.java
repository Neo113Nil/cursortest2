package com.amplitude.android.storage;

import com.bumptech.glide.manager.q;
import com.google.common.base.k;

/* loaded from: classes3.dex */
public final class a implements q {
    public static byte a(long j) {
        k.b(j, (j >> 8) == 0, "out of range: %s");
        return (byte) j;
    }
}
