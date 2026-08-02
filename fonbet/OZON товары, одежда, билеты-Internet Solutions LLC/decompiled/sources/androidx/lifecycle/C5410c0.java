package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5413e;

@Deprecated
/* renamed from: androidx.lifecycle.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5410c0 implements G {

    /* renamed from: a, reason: collision with root package name */
    private final I f43261a;

    /* renamed from: b, reason: collision with root package name */
    private final C5413e.a f43262b;

    C5410c0(I i11) {
        this.f43261a = i11;
        this.f43262b = C5413e.f43302c.b(i11.getClass());
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(@NonNull J j11, @NonNull AbstractC5434v.a aVar) {
        this.f43262b.a(j11, aVar, this.f43261a);
    }
}
