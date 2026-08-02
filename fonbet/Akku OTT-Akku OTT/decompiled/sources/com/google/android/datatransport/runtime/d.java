package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends n {
    public final String a;
    public final byte[] b;
    public final com.google.android.datatransport.e c;

    public d(String str, byte[] bArr, com.google.android.datatransport.e eVar) {
        this.a = str;
        this.b = bArr;
        this.c = eVar;
    }

    @Override // com.google.android.datatransport.runtime.n
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.n
    @Nullable
    public final byte[] b() {
        return this.b;
    }

    @Override // com.google.android.datatransport.runtime.n
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final com.google.android.datatransport.e c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.a.equals(nVar.a())) {
            return Arrays.equals(this.b, nVar instanceof d ? ((d) nVar).b : nVar.b()) && this.c.equals(nVar.c());
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }
}
