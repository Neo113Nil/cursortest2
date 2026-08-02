package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public abstract class x extends v {
    public static final WeakReference d = new WeakReference(null);
    public WeakReference c;

    public x(byte[] bArr) {
        super(bArr);
        this.c = d;
    }

    @Override // com.google.android.gms.common.v
    public final byte[] D() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.c.get();
                if (bArr == null) {
                    bArr = E();
                    this.c = new WeakReference(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }

    public abstract byte[] E();
}
