package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends q {
    public final byte[] a;
    public final byte[] b;

    public g(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    @Override // com.google.android.datatransport.cct.internal.q
    @Nullable
    public final byte[] a() {
        return this.a;
    }

    @Override // com.google.android.datatransport.cct.internal.q
    @Nullable
    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        boolean z = qVar instanceof g;
        if (Arrays.equals(this.a, z ? ((g) qVar).a : qVar.a())) {
            return Arrays.equals(this.b, z ? ((g) qVar).b : qVar.b());
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
