package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
public abstract class zbn extends com.google.android.gms.internal.p000authapi.zbb implements com.google.android.gms.internal.p000authapi.zbo {
    public zbn() {
        super("com.google.android.gms.auth.api.identity.internal.IGetPhoneNumberHintIntentCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    protected final boolean zba(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.p000authapi.zbc.zba(parcel, com.google.android.gms.common.api.Status.CREATOR);
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) com.google.android.gms.internal.p000authapi.zbc.zba(parcel, android.app.PendingIntent.CREATOR);
        com.google.android.gms.internal.p000authapi.zbc.zbd(parcel);
        zbb(status, pendingIntent);
        return true;
    }
}
