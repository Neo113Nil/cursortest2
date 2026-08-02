package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends f {
    public final ArrayList a;
    public final byte[] b;

    public a() {
        throw null;
    }

    public a(ArrayList arrayList, byte[] bArr) {
        this.a = arrayList;
        this.b = bArr;
    }

    @Override // com.google.android.datatransport.runtime.backends.f
    public final Iterable<com.google.android.datatransport.runtime.i> a() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.backends.f
    @Nullable
    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.a.equals(fVar.a())) {
            return Arrays.equals(this.b, fVar instanceof a ? ((a) fVar).b : fVar.b());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.b) + "}";
    }
}
