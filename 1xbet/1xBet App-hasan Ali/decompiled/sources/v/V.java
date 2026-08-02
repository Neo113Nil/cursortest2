package v;

import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class V extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: m, reason: collision with root package name */
    public static final V f20183m = new V(0, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final V f20184n = new V(0, 1);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f20185l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(int i, int i5) {
        super(i);
        this.f20185l = i5;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        switch (this.f20185l) {
            case 0:
                return G.f20148a;
            case 1:
                return new i0();
            default:
                return new v0(0);
        }
    }
}
