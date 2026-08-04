package H6;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements p065i6.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f3441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p065i6.i f3442b;

    public i(p065i6.i iVar, Throwable th) {
        this.f3441a = th;
        this.f3442b = iVar;
    }

    @Override // p065i6.i
    public final Object fold(Object obj, Function2 function2) {
        return this.f3442b.fold(obj, function2);
    }

    @Override // p065i6.i
    public final p065i6.g get(p065i6.h hVar) {
        return this.f3442b.get(hVar);
    }

    @Override // p065i6.i
    public final p065i6.i minusKey(p065i6.h hVar) {
        return this.f3442b.minusKey(hVar);
    }

    @Override // p065i6.i
    public final p065i6.i plus(p065i6.i iVar) {
        return this.f3442b.plus(iVar);
    }
}
