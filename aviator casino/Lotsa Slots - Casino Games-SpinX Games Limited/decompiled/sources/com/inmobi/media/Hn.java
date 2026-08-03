package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Hn {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.G f4751a;
    public final boolean[] b;

    public Hn(com.inmobi.media.G adContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adContext, "adContext");
        this.f4751a = adContext;
        boolean[] zArr = new boolean[5];
        for (int i = 0; i < 5; i++) {
            zArr[i] = false;
        }
        this.b = zArr;
    }
}
