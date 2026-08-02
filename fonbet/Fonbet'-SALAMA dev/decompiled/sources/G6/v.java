package G6;

import D6.InterfaceC0118e0;
import i6.InterfaceC1287d;
import k6.AbstractC1356c;

/* loaded from: classes2.dex */
public final class v extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public w f3130a;

    /* renamed from: b, reason: collision with root package name */
    public h f3131b;

    /* renamed from: c, reason: collision with root package name */
    public y f3132c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0118e0 f3133d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3134e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f3135f;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w f3136x;

    /* renamed from: y, reason: collision with root package name */
    public int f3137y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.f3136x = wVar;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f3135f = obj;
        this.f3137y |= Integer.MIN_VALUE;
        this.f3136x.r(null, this);
        return j6.a.f14642a;
    }
}
