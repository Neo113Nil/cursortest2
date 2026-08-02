package Ae;

import fd.InterfaceC6511n;
import kotlin.Unit;

/* renamed from: Ae.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2417s0 implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f1137a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f1138b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f1139c;

    public C2417s0(InterfaceC2395h interfaceC2395h, InterfaceC2395h interfaceC2395h2, InterfaceC6511n interfaceC6511n) {
        this.f1137a = interfaceC2395h;
        this.f1138b = interfaceC2395h2;
        this.f1139c = interfaceC6511n;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [fd.n, java.lang.Object] */
    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        Object a11 = Be.p.a(interfaceC2397i, new C2419t0(this.f1139c, null), dVar, v0.f1162a, new InterfaceC2395h[]{this.f1137a, this.f1138b});
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }
}
