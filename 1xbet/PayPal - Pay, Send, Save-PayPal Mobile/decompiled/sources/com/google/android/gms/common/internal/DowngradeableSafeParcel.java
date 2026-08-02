package com.google.android.gms.common.internal;

/* loaded from: classes8.dex */
public abstract class DowngradeableSafeParcel extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    private static final java.lang.Object zza = new java.lang.Object();
    private boolean zzb = false;

    protected static boolean canUnparcelSafely(java.lang.String str) {
        synchronized (zza) {
        }
        return true;
    }

    protected static java.lang.Integer getUnparcelClientVersion() {
        synchronized (zza) {
        }
        return null;
    }

    protected abstract boolean prepareForClientVersion(int i);

    protected boolean shouldDowngrade() {
        return this.zzb;
    }

    public void setShouldDowngrade(boolean z) {
        this.zzb = z;
    }
}
