package A0;

import b4.EnumC0510a;
import c4.AbstractC0542c;

/* loaded from: classes.dex */
public final class E extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f175k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F f176l;

    /* renamed from: m, reason: collision with root package name */
    public int f177m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f176l = f;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f175k = obj;
        this.f177m |= Integer.MIN_VALUE;
        this.f176l.M(null, this);
        return EnumC0510a.f7289k;
    }
}
