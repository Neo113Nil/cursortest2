package com.google.android.gms.internal.base;

/* loaded from: classes4.dex */
public class zau extends android.os.Handler {
    private final android.os.Looper zaa;

    public zau() {
        this.zaa = android.os.Looper.getMainLooper();
    }

    public zau(android.os.Looper looper) {
        super(looper);
        this.zaa = android.os.Looper.getMainLooper();
    }

    public zau(android.os.Looper looper, android.os.Handler.Callback callback) {
        super(looper, callback);
        this.zaa = android.os.Looper.getMainLooper();
    }
}
