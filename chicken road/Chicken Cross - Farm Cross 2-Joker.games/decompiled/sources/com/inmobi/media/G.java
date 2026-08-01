package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final byte f6568a;
    public final String b;
    public final int c;
    public final int d;

    public G(byte b, String impressionId, int i, int i2, int[] viewableFrameArray) {
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(viewableFrameArray, "viewableFrameArray");
        this.f6568a = b;
        this.b = impressionId;
        this.c = i;
        this.d = i2;
    }
}
