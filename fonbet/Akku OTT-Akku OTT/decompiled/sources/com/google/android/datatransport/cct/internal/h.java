package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class h extends r {
    public final Integer a;

    public h(Integer num) {
        this.a = num;
    }

    @Override // com.google.android.datatransport.cct.internal.r
    @Nullable
    public final Integer a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        Integer num = this.a;
        Integer a = ((r) obj).a();
        return num == null ? a == null : num.equals(a);
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.a + "}";
    }
}
