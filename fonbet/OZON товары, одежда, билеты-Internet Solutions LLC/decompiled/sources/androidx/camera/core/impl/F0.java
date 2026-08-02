package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes8.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f38115a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Class<? extends E0>> f38116b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<Class<? extends E0>> f38117c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f38118a = true;

        /* renamed from: b, reason: collision with root package name */
        private HashSet f38119b;

        /* renamed from: c, reason: collision with root package name */
        private HashSet f38120c;

        @NonNull
        public final F0 a() {
            return new F0(this.f38118a, this.f38119b, this.f38120c);
        }

        @NonNull
        public final void b(@NonNull HashSet hashSet) {
            this.f38120c = new HashSet(hashSet);
        }

        @NonNull
        public final void c(@NonNull HashSet hashSet) {
            this.f38119b = new HashSet(hashSet);
        }

        @NonNull
        public final void d(boolean z11) {
            this.f38118a = z11;
        }
    }

    private F0() {
        throw null;
    }

    F0(boolean z11, HashSet hashSet, HashSet hashSet2) {
        this.f38115a = z11;
        this.f38116b = hashSet == null ? Collections.EMPTY_SET : new HashSet<>(hashSet);
        this.f38117c = hashSet2 == null ? Collections.EMPTY_SET : new HashSet<>(hashSet2);
    }

    public final boolean a(boolean z11, @NonNull Class cls) {
        if (this.f38116b.contains(cls)) {
            return true;
        }
        return !this.f38117c.contains(cls) && this.f38115a && z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof F0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        F0 f02 = (F0) obj;
        return this.f38115a == f02.f38115a && Objects.equals(this.f38116b, f02.f38116b) && Objects.equals(this.f38117c, f02.f38117c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f38115a), this.f38116b, this.f38117c);
    }

    @NonNull
    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f38115a + ", forceEnabledQuirks=" + this.f38116b + ", forceDisabledQuirks=" + this.f38117c + '}';
    }
}
