package Gd;

import kotlin.jvm.functions.Function1;

/* renamed from: Gd.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3089t implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final C3070B f10068a;

    /* renamed from: b, reason: collision with root package name */
    private final Fd.k f10069b;

    public C3089t(Fd.k kVar, C3070B c3070b) {
        this.f10068a = c3070b;
        this.f10069b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return C3070B.L(this.f10068a, this.f10069b, (Sd.f) obj);
    }
}
