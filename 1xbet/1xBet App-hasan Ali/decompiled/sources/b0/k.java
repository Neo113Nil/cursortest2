package b0;

import A0.Z;
import a3.AbstractC0467k;

/* loaded from: classes.dex */
public final class k extends Z implements n {

    /* renamed from: l, reason: collision with root package name */
    public final kotlin.jvm.internal.m f7159l;

    /* JADX WARN: Multi-variable type inference failed */
    public k(i4.f fVar) {
        this.f7159l = (kotlin.jvm.internal.m) fVar;
    }

    @Override // b0.p
    public final /* synthetic */ p c(p pVar) {
        return AbstractC0467k.d(this, pVar);
    }

    @Override // b0.p
    public final Object d(i4.e eVar, Object obj) {
        return eVar.invoke(obj, this);
    }

    @Override // b0.p
    public final boolean j(i4.c cVar) {
        return ((Boolean) cVar.c(this)).booleanValue();
    }
}
