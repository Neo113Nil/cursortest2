package A0;

import b4.EnumC0510a;
import c4.AbstractC0542c;

/* renamed from: A0.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037j0 extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f515k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0046m0 f516l;

    /* renamed from: m, reason: collision with root package name */
    public int f517m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0037j0(C0046m0 c0046m0, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f516l = c0046m0;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f515k = obj;
        this.f517m |= Integer.MIN_VALUE;
        this.f516l.a(null, this);
        return EnumC0510a.f7289k;
    }
}
