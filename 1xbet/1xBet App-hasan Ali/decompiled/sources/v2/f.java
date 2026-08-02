package v2;

import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final BitmapDrawable f20407a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20408b;

    public f(BitmapDrawable bitmapDrawable, boolean z3) {
        this.f20407a = bitmapDrawable;
        this.f20408b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f20407a.equals(fVar.f20407a) && this.f20408b == fVar.f20408b;
    }

    public final int hashCode() {
        return (this.f20407a.hashCode() * 31) + (this.f20408b ? 1231 : 1237);
    }
}
