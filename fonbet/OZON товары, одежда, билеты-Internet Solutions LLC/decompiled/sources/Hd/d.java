package Hd;

import je.s0;
import kotlin.jvm.functions.Function0;
import td.i0;

/* loaded from: classes10.dex */
final class d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final e f10840a;

    /* renamed from: b, reason: collision with root package name */
    private final i0 f10841b;

    /* renamed from: c, reason: collision with root package name */
    private final a f10842c;

    /* renamed from: d, reason: collision with root package name */
    private final s0 f10843d;

    /* renamed from: e, reason: collision with root package name */
    private final Jd.j f10844e;

    public d(e eVar, i0 i0Var, a aVar, s0 s0Var, Jd.j jVar) {
        this.f10840a = eVar;
        this.f10841b = i0Var;
        this.f10842c = aVar;
        this.f10843d = s0Var;
        this.f10844e = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        s0 s0Var = this.f10843d;
        return e.a(this.f10840a, this.f10841b, this.f10842c, s0Var, this.f10844e);
    }
}
