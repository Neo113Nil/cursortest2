package Ae;

import kotlin.Unit;

/* renamed from: Ae.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2405m implements InterfaceC2395h<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f1039a;

    public C2405m(Object obj) {
        this.f1039a = obj;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(InterfaceC2397i<? super Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        Object emit = interfaceC2397i.emit(this.f1039a, dVar);
        return emit == Wc.a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }
}
