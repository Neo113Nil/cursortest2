package O4;

/* loaded from: classes.dex */
public final class I extends Z {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4135d;

    public I(boolean z3) {
        this.f4135d = z3;
    }

    @Override // O4.Z
    public final void a(O o5, Object obj) {
        if (obj == null) {
            return;
        }
        o5.d(obj.toString(), null, this.f4135d);
    }
}
