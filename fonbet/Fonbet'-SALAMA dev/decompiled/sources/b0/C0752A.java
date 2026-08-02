package b0;

import i6.InterfaceC1287d;
import k6.AbstractC1356c;

/* renamed from: b0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0752A extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public O f9902a;

    /* renamed from: b, reason: collision with root package name */
    public i0 f9903b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9904c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f9905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O f9906e;

    /* renamed from: f, reason: collision with root package name */
    public int f9907f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0752A(O o7, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.f9906e = o7;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f9905d = obj;
        this.f9907f |= Integer.MIN_VALUE;
        return O.e(this.f9906e, false, this);
    }
}
