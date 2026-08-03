package io.flutter.view;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f7916a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7917b;

    public m(android.view.View view, int i2) {
        this.f7916a = view;
        this.f7917b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.flutter.view.m)) {
            return false;
        }
        io.flutter.view.m mVar = (io.flutter.view.m) obj;
        return this.f7917b == mVar.f7917b && this.f7916a.equals(mVar.f7916a);
    }

    public final int hashCode() {
        return ((this.f7916a.hashCode() + 31) * 31) + this.f7917b;
    }
}
