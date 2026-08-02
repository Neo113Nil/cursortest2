package I1;

import Sc.InterfaceC4003e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: I1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3222a<T extends InterfaceC4003e<? extends Boolean>> {

    /* renamed from: a, reason: collision with root package name */
    private final String f11682a;

    /* renamed from: b, reason: collision with root package name */
    private final T f11683b;

    public C3222a(String str, T t2) {
        this.f11682a = str;
        this.f11683b = t2;
    }

    public final T a() {
        return this.f11683b;
    }

    public final String b() {
        return this.f11682a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3222a)) {
            return false;
        }
        C3222a c3222a = (C3222a) obj;
        return Intrinsics.d(this.f11682a, c3222a.f11682a) && Intrinsics.d(this.f11683b, c3222a.f11683b);
    }

    public final int hashCode() {
        String str = this.f11682a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        T t2 = this.f11683b;
        return hashCode + (t2 != null ? t2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "AccessibilityAction(label=" + this.f11682a + ", action=" + this.f11683b + ')';
    }
}
