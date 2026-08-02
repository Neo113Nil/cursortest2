package E;

import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1375l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B0 f1376m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(B0 b02, int i) {
        super(0);
        this.f1375l = i;
        this.f1376m = b02;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        switch (this.f1375l) {
            case 0:
                return Boolean.valueOf(this.f1376m.f994a.h() > 0.0f);
            default:
                B0 b02 = this.f1376m;
                return Boolean.valueOf(b02.f994a.h() < b02.f995b.h());
        }
    }
}
