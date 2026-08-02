package P5;

import i6.InterfaceC1287d;
import k6.AbstractC1356c;

/* loaded from: classes2.dex */
public final class s extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5687a;

    /* renamed from: b, reason: collision with root package name */
    public int f5688b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0402n f5689c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C0402n c0402n, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.f5689c = c0402n;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        this.f5687a = obj;
        this.f5688b |= Integer.MIN_VALUE;
        return this.f5689c.c(null, this);
    }
}
