package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0200k {
    public abstract H a();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0200k) {
            return a().equals(((AbstractC0200k) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
