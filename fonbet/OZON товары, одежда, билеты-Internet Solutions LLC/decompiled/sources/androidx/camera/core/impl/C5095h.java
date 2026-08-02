package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* renamed from: androidx.camera.core.impl.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5095h extends AbstractC5094g0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f38302a;

    C5095h(Object obj) {
        this.f38302a = obj;
    }

    @Override // androidx.camera.core.impl.AbstractC5094g0
    @NonNull
    public final Object b() {
        return this.f38302a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5094g0) {
            return this.f38302a.equals(((AbstractC5094g0) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f38302a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return T7.E.c(this.f38302a, "}", new StringBuilder("Identifier{value="));
    }
}
