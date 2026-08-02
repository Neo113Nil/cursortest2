package com.amplitude.android;

/* loaded from: classes3.dex */
public final class k {
    public final boolean a;

    public k() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.a == ((k) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return androidx.appcompat.view.menu.a.c(new StringBuilder("DeadClickOptions(enabled="), this.a, ')');
    }

    public k(int i) {
        this.a = true;
    }
}
