package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes8.dex */
public abstract class zbo extends com.google.android.gms.internal.p000authapi.zbb implements com.google.android.gms.auth.api.signin.internal.zbp {
    public zbo() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            zbb();
        } else {
            if (i != 2) {
                return false;
            }
            zbc();
        }
        return true;
    }
}
