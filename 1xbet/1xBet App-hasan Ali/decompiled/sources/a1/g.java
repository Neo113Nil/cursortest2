package a1;

import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f6399l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f6400m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0453A f6401n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f6402o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ W0.m f6403p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(w wVar, InterfaceC2015a interfaceC2015a, C0453A c0453a, String str, W0.m mVar) {
        super(0);
        this.f6399l = wVar;
        this.f6400m = interfaceC2015a;
        this.f6401n = c0453a;
        this.f6402o = str;
        this.f6403p = mVar;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        this.f6399l.j(this.f6400m, this.f6401n, this.f6402o, this.f6403p);
        return W3.o.f6046a;
    }
}
