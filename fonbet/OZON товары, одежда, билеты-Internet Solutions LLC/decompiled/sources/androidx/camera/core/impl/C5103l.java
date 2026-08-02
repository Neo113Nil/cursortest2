package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.S0;

/* renamed from: androidx.camera.core.impl.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5103l extends S0.a {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f38352a;

    C5103l(Throwable th2) {
        if (th2 == null) {
            throw new NullPointerException("Null error");
        }
        this.f38352a = th2;
    }

    @Override // androidx.camera.core.impl.S0.a
    @NonNull
    public final Throwable a() {
        return this.f38352a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof S0.a) {
            return this.f38352a.equals(((S0.a) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f38352a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ErrorWrapper{error=" + this.f38352a + "}";
    }
}
