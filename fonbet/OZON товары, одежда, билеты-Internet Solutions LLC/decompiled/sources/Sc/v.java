package Sc;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class v<A, B, C> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final A f26115a;

    /* renamed from: b, reason: collision with root package name */
    private final B f26116b;

    /* renamed from: c, reason: collision with root package name */
    private final C f26117c;

    public v(A a11, B b11, C c11) {
        this.f26115a = a11;
        this.f26116b = b11;
        this.f26117c = c11;
    }

    public final A a() {
        return this.f26115a;
    }

    public final B b() {
        return this.f26116b;
    }

    public final C d() {
        return this.f26117c;
    }

    public final A e() {
        return this.f26115a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f26115a, vVar.f26115a) && Intrinsics.d(this.f26116b, vVar.f26116b) && Intrinsics.d(this.f26117c, vVar.f26117c);
    }

    public final B f() {
        return this.f26116b;
    }

    public final C g() {
        return this.f26117c;
    }

    public final int hashCode() {
        A a11 = this.f26115a;
        int hashCode = (a11 == null ? 0 : a11.hashCode()) * 31;
        B b11 = this.f26116b;
        int hashCode2 = (hashCode + (b11 == null ? 0 : b11.hashCode())) * 31;
        C c11 = this.f26117c;
        return hashCode2 + (c11 != null ? c11.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "(" + this.f26115a + ", " + this.f26116b + ", " + this.f26117c + ')';
    }
}
