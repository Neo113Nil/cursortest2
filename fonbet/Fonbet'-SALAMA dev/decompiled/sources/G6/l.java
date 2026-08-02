package G6;

import i6.InterfaceC1287d;
import k6.AbstractC1356c;

/* loaded from: classes2.dex */
public final class l extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3094a;

    /* renamed from: b, reason: collision with root package name */
    public int f3095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f3096c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3097d;

    /* renamed from: e, reason: collision with root package name */
    public h f3098e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.f3096c = mVar;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f3094a = obj;
        this.f3095b |= Integer.MIN_VALUE;
        return this.f3096c.r(null, this);
    }
}
