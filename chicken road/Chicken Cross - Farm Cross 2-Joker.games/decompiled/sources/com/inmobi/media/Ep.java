package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ep {

    /* renamed from: a, reason: collision with root package name */
    public final H f6541a;
    public final boolean[] b;

    public Ep(H adContext) {
        Intrinsics.checkNotNullParameter(adContext, "adContext");
        this.f6541a = adContext;
        boolean[] zArr = new boolean[5];
        for (int i = 0; i < 5; i++) {
            zArr[i] = false;
        }
        this.b = zArr;
    }
}
