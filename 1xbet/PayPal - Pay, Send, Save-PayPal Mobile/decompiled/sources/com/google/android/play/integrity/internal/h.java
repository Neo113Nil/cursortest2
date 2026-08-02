package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
public abstract class h extends com.google.android.play.integrity.internal.b implements com.google.android.play.integrity.internal.i {
    public static com.google.android.play.integrity.internal.i b(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        return queryLocalInterface instanceof com.google.android.play.integrity.internal.i ? (com.google.android.play.integrity.internal.i) queryLocalInterface : new com.google.android.play.integrity.internal.g(iBinder);
    }
}
