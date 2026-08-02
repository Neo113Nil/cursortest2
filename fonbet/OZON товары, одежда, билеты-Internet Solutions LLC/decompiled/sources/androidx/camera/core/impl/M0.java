package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.T;

/* loaded from: classes8.dex */
public final class M0 extends C5092f0 {

    /* renamed from: b, reason: collision with root package name */
    private final H f38146b;

    /* renamed from: c, reason: collision with root package name */
    private final Q0 f38147c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private final A f38148d;

    public M0(@NonNull H h11, @NonNull A a11) {
        super(h11);
        this.f38146b = h11;
        this.f38148d = a11;
        this.f38147c = a11.H();
        T.a<Boolean> aVar = A.f38105h;
        Boolean bool = Boolean.FALSE;
        ((Boolean) a11.c(aVar, bool)).getClass();
        ((Boolean) a11.c(A.f38106i, bool)).getClass();
    }

    @Override // androidx.camera.core.impl.C5092f0, C.InterfaceC2694n
    public final boolean k() {
        if (G.p.a(this.f38147c, 5)) {
            return this.f38146b.k();
        }
        return false;
    }

    @Override // androidx.camera.core.impl.C5092f0, androidx.camera.core.impl.H
    @NonNull
    public final H o() {
        return this.f38146b;
    }

    @NonNull
    public final A r() {
        return this.f38148d;
    }
}
