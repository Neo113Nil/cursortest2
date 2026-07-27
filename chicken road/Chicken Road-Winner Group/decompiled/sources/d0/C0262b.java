package d0;

import android.graphics.Rect;
import kotlin.jvm.internal.j;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262b {

    /* renamed from: a, reason: collision with root package name */
    public final int f4822a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4823b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4824c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4825d;

    public C0262b(Rect rect) {
        int i3 = rect.left;
        int i4 = rect.top;
        int i5 = rect.right;
        int i6 = rect.bottom;
        this.f4822a = i3;
        this.f4823b = i4;
        this.f4824c = i5;
        this.f4825d = i6;
        if (i3 > i5) {
            throw new IllegalArgumentException(B0.c.g(i3, i5, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i4 > i6) {
            throw new IllegalArgumentException(B0.c.g(i4, i6, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
    }

    public final Rect a() {
        return new Rect(this.f4822a, this.f4823b, this.f4824c, this.f4825d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0262b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        j.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        C0262b c0262b = (C0262b) obj;
        return this.f4822a == c0262b.f4822a && this.f4823b == c0262b.f4823b && this.f4824c == c0262b.f4824c && this.f4825d == c0262b.f4825d;
    }

    public final int hashCode() {
        return (((((this.f4822a * 31) + this.f4823b) * 31) + this.f4824c) * 31) + this.f4825d;
    }

    public final String toString() {
        return C0262b.class.getSimpleName() + " { [" + this.f4822a + ',' + this.f4823b + ',' + this.f4824c + ',' + this.f4825d + "] }";
    }
}
