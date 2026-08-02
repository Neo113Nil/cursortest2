package b0;

import k6.AbstractC1356c;
import w1.F0;

/* loaded from: classes.dex */
public final class c0 extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public F0 f10016a;

    /* renamed from: b, reason: collision with root package name */
    public M6.a f10017b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10018c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F0 f10019d;

    /* renamed from: e, reason: collision with root package name */
    public int f10020e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(F0 f02, AbstractC1356c abstractC1356c) {
        super(abstractC1356c);
        this.f10019d = f02;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f10018c = obj;
        this.f10020e |= Integer.MIN_VALUE;
        return this.f10019d.K(this);
    }
}
