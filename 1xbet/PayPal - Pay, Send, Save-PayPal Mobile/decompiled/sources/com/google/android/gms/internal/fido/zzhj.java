package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzhj extends java.io.IOException {
    public zzhj(java.lang.String str) {
        super(str);
    }

    public zzhj(java.lang.String str, java.lang.Throwable th) {
        super("Error in decoding CborValue from bytes", th);
    }
}
