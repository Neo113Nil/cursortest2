package Bm0;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final Cm0.b f4010a;

    /* renamed from: b, reason: collision with root package name */
    private final b f4011b;

    public d(Cm0.b bVar, b bVar2) {
        this.f4010a = bVar;
        this.f4011b = bVar2;
    }

    @Override // Bm0.c
    @NonNull
    public final e a() {
        b bVar = this.f4011b;
        if (bVar == null) {
            throw new IllegalArgumentException("MaskDescriptor cannot be null");
        }
        bVar.l();
        Dm0.b[] d11 = bVar.d();
        Cm0.b bVar2 = this.f4010a;
        if (d11 == null && bVar2 == null) {
            throw new IllegalStateException("Cannot create mask: neither slots nor slots parser and raw-mask are set");
        }
        e eVar = new e(bVar.d() != null ? bVar.d() : bVar2.parseSlots(bVar.b()), bVar.g());
        eVar.e(bVar.e());
        eVar.f(bVar.f());
        return eVar;
    }
}
