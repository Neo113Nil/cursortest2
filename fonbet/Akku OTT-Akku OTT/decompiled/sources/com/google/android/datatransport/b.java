package com.google.android.datatransport;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class b extends f {
    public final Integer a;

    public b(@Nullable Integer num) {
        this.a = num;
    }

    @Override // com.google.android.datatransport.f
    @Nullable
    public final Integer a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        Integer num = this.a;
        Integer a = ((f) obj).a();
        return num == null ? a == null : num.equals(a);
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.a + "}";
    }
}
