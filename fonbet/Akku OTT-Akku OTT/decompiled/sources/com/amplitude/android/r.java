package com.amplitude.android;

/* loaded from: classes3.dex */
public final class r {
    public final boolean a;

    public r() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.a == ((r) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return androidx.appcompat.view.menu.a.c(new StringBuilder("RageClickOptions(enabled="), this.a, ')');
    }

    public r(int i) {
        this.a = true;
    }
}
