package com.google.android.play.core.hsdp.protocol;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
public final class ReportRequest implements Parcelable {
    public static final Parcelable.Creator<ReportRequest> CREATOR = new zzo();
    private final String zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final long zze;

    /* synthetic */ ReportRequest(Parcel parcel, zzp zzpVar) {
        this.zza = (String) Objects.requireNonNull(parcel.readString());
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = (String) Objects.requireNonNull(parcel.readString());
        this.zze = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getOperation() {
        return this.zzb;
    }

    public int getReportCode() {
        return this.zzc;
    }

    public long getRequestTimestampMs() {
        return this.zze;
    }

    public String getSdkVersion() {
        return this.zzd;
    }

    public String getTargetPackage() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeString(this.zzd);
        parcel.writeLong(this.zze);
    }

    public ReportRequest(String str, int i, int i2, String str2, long j) {
        this.zza = (String) Objects.requireNonNull(str, "targetPackage cannot be null");
        this.zzb = i;
        this.zzc = i2;
        this.zzd = (String) Objects.requireNonNull(str2, "sdkVersion cannot be null");
        this.zze = j;
    }
}
