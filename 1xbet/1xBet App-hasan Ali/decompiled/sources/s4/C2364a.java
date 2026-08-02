package s4;

import c4.AbstractC0542c;
import u2.C2496k;

/* renamed from: s4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2364a extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public t4.t f19251k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f19252l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2496k f19253m;

    /* renamed from: n, reason: collision with root package name */
    public int f19254n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2364a(C2496k c2496k, a4.c cVar) {
        super(cVar);
        this.f19253m = c2496k;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f19252l = obj;
        this.f19254n |= Integer.MIN_VALUE;
        return this.f19253m.a(null, this);
    }
}
