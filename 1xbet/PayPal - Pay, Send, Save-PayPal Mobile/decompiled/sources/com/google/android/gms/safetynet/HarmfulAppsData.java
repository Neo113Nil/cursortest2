package com.google.android.gms.safetynet;

/* loaded from: classes8.dex */
public class HarmfulAppsData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.safetynet.HarmfulAppsData> CREATOR = new com.google.android.gms.safetynet.zzc();
    public final int apkCategory;
    public final java.lang.String apkPackageName;
    public final byte[] apkSha256;

    public HarmfulAppsData(java.lang.String str, byte[] bArr, int i) {
        this.apkPackageName = str;
        this.apkSha256 = bArr;
        this.apkCategory = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.apkPackageName, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 3, this.apkSha256, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.apkCategory);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
