package com.inmobi.media;

import android.graphics.Bitmap;

/* loaded from: classes6.dex */
public final class M0 implements Wh {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N0 f6706a;
    public final /* synthetic */ Q2 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ C3970oj d;

    public M0(N0 n0, Q2 q2, boolean z, C3970oj c3970oj) {
        this.f6706a = n0;
        this.b = q2;
        this.c = z;
        this.d = c3970oj;
    }

    @Override // com.inmobi.media.Wh
    public final void a(Object obj) {
        this.f6706a.a((Bitmap) obj, this.b, this.c, this.d);
    }

    @Override // com.inmobi.media.Wh
    public final void onError(Exception exc) {
        this.f6706a.a(exc, this.b);
    }
}
