package G6;

import i6.InterfaceC1287d;
import k6.AbstractC1356c;

/* loaded from: classes2.dex */
public final class o extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public e f3107a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3108b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3109c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f3110d;

    /* renamed from: e, reason: collision with root package name */
    public int f3111e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(e eVar, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.f3110d = eVar;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f3109c = obj;
        this.f3111e |= Integer.MIN_VALUE;
        return this.f3110d.c(null, this);
    }
}
