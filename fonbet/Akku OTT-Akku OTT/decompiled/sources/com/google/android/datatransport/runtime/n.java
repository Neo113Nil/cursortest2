package com.google.android.datatransport.runtime;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class n {
    public abstract String a();

    @Nullable
    public abstract byte[] b();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract com.google.android.datatransport.e c();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final d d(com.google.android.datatransport.e eVar) {
        String a = a();
        if (a == null) {
            throw new NullPointerException("Null backendName");
        }
        if (eVar != null) {
            return new d(a, b(), eVar);
        }
        throw new NullPointerException("Null priority");
    }

    public final String toString() {
        String a = a();
        com.google.android.datatransport.e c = c();
        String encodeToString = b() == null ? "" : Base64.encodeToString(b(), 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(a);
        sb.append(", ");
        sb.append(c);
        sb.append(", ");
        return androidx.concurrent.futures.a.a(sb, encodeToString, ")");
    }
}
