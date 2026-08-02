package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public abstract class zzbn extends com.google.android.play.core.splitinstall.internal.zzl implements com.google.android.play.core.splitinstall.internal.zzbo {
    public static com.google.android.play.core.splitinstall.internal.zzbo zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        return queryLocalInterface instanceof com.google.android.play.core.splitinstall.internal.zzbo ? (com.google.android.play.core.splitinstall.internal.zzbo) queryLocalInterface : new com.google.android.play.core.splitinstall.internal.zzbm(iBinder);
    }
}
