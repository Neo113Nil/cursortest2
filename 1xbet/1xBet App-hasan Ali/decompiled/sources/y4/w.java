package y4;

import L4.InterfaceC0227j;

/* loaded from: classes.dex */
public final class w extends x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21435a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f21436b;

    public w(int i, byte[] bArr) {
        this.f21435a = i;
        this.f21436b = bArr;
    }

    @Override // y4.x
    public final long a() {
        return this.f21435a;
    }

    @Override // y4.x
    public final q b() {
        return null;
    }

    @Override // y4.x
    public final void c(InterfaceC0227j interfaceC0227j) {
        interfaceC0227j.w(this.f21435a, this.f21436b);
    }
}
