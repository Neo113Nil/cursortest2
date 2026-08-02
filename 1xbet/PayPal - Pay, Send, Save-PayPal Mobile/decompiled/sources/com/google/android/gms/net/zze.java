package com.google.android.gms.net;

/* loaded from: classes4.dex */
final class zze implements java.lang.AutoCloseable {
    public zze(java.lang.String str) {
        android.os.Trace.beginSection(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        android.os.Trace.endSection();
    }
}
