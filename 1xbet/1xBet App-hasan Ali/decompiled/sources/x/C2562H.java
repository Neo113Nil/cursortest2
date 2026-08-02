package x;

import c4.AbstractC0542c;
import y.C2646b;

/* renamed from: x.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2562H extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public C2589k0 f20635k;

    /* renamed from: l, reason: collision with root package name */
    public C2605t f20636l;

    /* renamed from: m, reason: collision with root package name */
    public C2646b f20637m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f20638n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2589k0 f20639o;

    /* renamed from: p, reason: collision with root package name */
    public int f20640p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2562H(C2589k0 c2589k0, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f20639o = c2589k0;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f20638n = obj;
        this.f20640p |= Integer.MIN_VALUE;
        return C2589k0.C0(this.f20639o, null, this);
    }
}
