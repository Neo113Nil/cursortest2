package A0;

import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class O0 extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f370l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v3.g f371m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f372n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(boolean z3, v3.g gVar, String str) {
        super(0);
        this.f370l = z3;
        this.f371m = gVar;
        this.f372n = str;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        if (this.f370l) {
            v3.g gVar = this.f371m;
            String str = this.f372n;
            W1.a aVar = (W1.a) gVar.f20439l;
            synchronized (aVar.f6027c) {
            }
        }
        return W3.o.f6046a;
    }
}
