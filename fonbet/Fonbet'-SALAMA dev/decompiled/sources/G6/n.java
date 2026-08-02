package G6;

import i6.InterfaceC1287d;
import k6.AbstractC1356c;
import w1.V0;

/* loaded from: classes2.dex */
public final class n extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3101a;

    /* renamed from: b, reason: collision with root package name */
    public int f3102b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V0 f3103c;

    /* renamed from: d, reason: collision with root package name */
    public V0 f3104d;

    /* renamed from: e, reason: collision with root package name */
    public h f3105e;

    /* renamed from: f, reason: collision with root package name */
    public H6.n f3106f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(V0 v02, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.f3103c = v02;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f3101a = obj;
        this.f3102b |= Integer.MIN_VALUE;
        return this.f3103c.r(null, this);
    }
}
