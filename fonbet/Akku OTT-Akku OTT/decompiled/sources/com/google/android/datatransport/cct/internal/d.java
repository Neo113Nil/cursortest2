package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends n {
    public final ArrayList a;

    public d(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // com.google.android.datatransport.cct.internal.n
    @NonNull
    @Encodable.Field(name = "logRequest")
    public final List<u> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.a.equals(((n) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
