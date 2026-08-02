package com.google.android.gms.auth.api.identity;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public final class BeginSignInResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.BeginSignInResult> CREATOR = new com.google.android.gms.auth.api.identity.zbe();
    private final android.app.PendingIntent zba;

    public BeginSignInResult(android.app.PendingIntent pendingIntent) {
        this.zba = (android.app.PendingIntent) com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getPendingIntent(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final android.app.PendingIntent getPendingIntent() {
        return this.zba;
    }
}
