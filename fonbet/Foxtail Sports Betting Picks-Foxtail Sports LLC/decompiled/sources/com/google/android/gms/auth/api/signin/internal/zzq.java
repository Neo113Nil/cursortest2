package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-auth@@18.1.0 */
/* loaded from: classes.dex */
public abstract class zzq extends com.google.android.gms.internal.p000authapi.zzc implements zzr {
    public zzq() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zzc
    protected final boolean zzc(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzn();
        } else {
            if (i != 2) {
                return false;
            }
            zzo();
        }
        return true;
    }
}
