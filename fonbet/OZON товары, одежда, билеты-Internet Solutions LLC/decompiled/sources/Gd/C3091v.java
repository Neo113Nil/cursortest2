package Gd;

import kotlin.jvm.functions.Function1;

/* renamed from: Gd.v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C3091v implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final td.c0 f10071a;

    /* renamed from: b, reason: collision with root package name */
    private final C3070B f10072b;

    public C3091v(td.c0 c0Var, C3070B c3070b) {
        this.f10071a = c0Var;
        this.f10072b = c3070b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return C3070B.M(this.f10071a, this.f10072b, (Sd.f) obj);
    }
}
