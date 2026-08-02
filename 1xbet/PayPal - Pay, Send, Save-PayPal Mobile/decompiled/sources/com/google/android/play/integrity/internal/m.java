package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
public abstract class m extends com.google.android.play.integrity.internal.b implements com.google.android.play.integrity.internal.n {
    public static com.google.android.play.integrity.internal.n b(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return queryLocalInterface instanceof com.google.android.play.integrity.internal.n ? (com.google.android.play.integrity.internal.n) queryLocalInterface : new com.google.android.play.integrity.internal.l(iBinder);
    }
}
