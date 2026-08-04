package p065i6;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f14069a;

    public a(h hVar) {
        this.f14069a = hVar;
    }

    @Override // p065i6.i
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // p065i6.i
    public g get(h hVar) {
        return p003a.a.W(this, hVar);
    }

    @Override // p065i6.g
    public final h getKey() {
        return this.f14069a;
    }

    @Override // p065i6.i
    public i minusKey(h hVar) {
        return p003a.a.e0(this, hVar);
    }

    @Override // p065i6.i
    public final i plus(i iVar) {
        return p003a.a.m0(this, iVar);
    }
}
