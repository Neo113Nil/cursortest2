package z0;

import i6.InterfaceC1287d;
import k6.AbstractC1356c;

/* renamed from: z0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1812e extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC1813f f18433a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18434b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1813f f18435c;

    /* renamed from: d, reason: collision with root package name */
    public int f18436d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1812e(AbstractC1813f abstractC1813f, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.f18435c = abstractC1813f;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f18434b = obj;
        this.f18436d |= Integer.MIN_VALUE;
        return AbstractC1813f.c(this.f18435c, null, this);
    }
}
