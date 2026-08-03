package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes4.dex */
public abstract class zbs extends com.google.android.gms.internal.p000authapi.zbb implements com.google.android.gms.internal.p000authapi.zbt {
    public zbs() {
        super("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    protected final boolean zba(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.p000authapi.zbc.zba(parcel, com.google.android.gms.common.api.Status.CREATOR);
        com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult saveAccountLinkingTokenResult = (com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult) com.google.android.gms.internal.p000authapi.zbc.zba(parcel, com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult.CREATOR);
        com.google.android.gms.internal.p000authapi.zbc.zbb(parcel);
        zbb(status, saveAccountLinkingTokenResult);
        return true;
    }
}
