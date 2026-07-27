package B2;

import m0.C1121i;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183a;

    /* renamed from: b, reason: collision with root package name */
    public String f184b;

    public C1121i a() {
        if (this.f184b == null) {
            throw new IllegalArgumentException("Product type must be set");
        }
        C1121i c1121i = new C1121i();
        c1121i.f10048a = this.f184b;
        return c1121i;
    }

    public String toString() {
        switch (this.f183a) {
            case 0:
                return "<" + this.f184b + '>';
            default:
                return super.toString();
        }
    }

    public v(String str) {
        this.f183a = 0;
        this.f184b = str;
    }
}
