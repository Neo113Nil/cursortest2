package O4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class D extends Z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4119d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4120e;
    public final C0256b f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4121g;

    public D(int i, String str, boolean z3) {
        this.f4119d = i;
        switch (i) {
            case 1:
                C0256b c0256b = C0256b.f4204l;
                Objects.requireNonNull(str, "name == null");
                this.f4120e = str;
                this.f = c0256b;
                this.f4121g = z3;
                break;
            case 2:
                C0256b c0256b2 = C0256b.f4204l;
                Objects.requireNonNull(str, "name == null");
                this.f4120e = str;
                this.f = c0256b2;
                this.f4121g = z3;
                break;
            default:
                C0256b c0256b3 = C0256b.f4204l;
                Objects.requireNonNull(str, "name == null");
                this.f4120e = str;
                this.f = c0256b3;
                this.f4121g = z3;
                break;
        }
    }

    @Override // O4.Z
    public final void a(O o5, Object obj) {
        switch (this.f4119d) {
            case 0:
                if (obj != null) {
                    this.f.getClass();
                    String obj2 = obj.toString();
                    if (obj2 != null) {
                        o5.a(this.f4120e, obj2, this.f4121g);
                        break;
                    }
                }
                break;
            case 1:
                if (obj != null) {
                    this.f.getClass();
                    String obj3 = obj.toString();
                    if (obj3 != null) {
                        o5.b(this.f4120e, obj3, this.f4121g);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    this.f.getClass();
                    String obj4 = obj.toString();
                    if (obj4 != null) {
                        o5.d(this.f4120e, obj4, this.f4121g);
                        break;
                    }
                }
                break;
        }
    }
}
