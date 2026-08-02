package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.C0854d;

/* loaded from: classes4.dex */
public final class p extends UnsupportedOperationException {
    public final C0854d a;

    public p(@NonNull C0854d c0854d) {
        this.a = c0854d;
    }

    @Override // java.lang.Throwable
    @NonNull
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.a));
    }
}
