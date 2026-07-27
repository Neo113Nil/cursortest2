package com.google.android.play.core.hsdp.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
public final class PrewarmRequest implements Parcelable {
    public static final Parcelable.Creator<PrewarmRequest> CREATOR = new zzm();
    private final String zza;
    private final String zzb;
    private final IBinder zzc;
    private final Bundle zzd;

    /* synthetic */ PrewarmRequest(Parcel parcel, zzn zznVar) {
        this.zza = (String) Objects.requireNonNull(parcel.readString());
        this.zzb = (String) Objects.requireNonNull(parcel.readString());
        if (parcel.readByte() != 0) {
            this.zzc = parcel.readStrongBinder();
        } else {
            this.zzc = null;
        }
        Bundle readBundle = parcel.readBundle(PrewarmRequest.class.getClassLoader());
        this.zzd = readBundle == null ? Bundle.EMPTY : readBundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getExtras() {
        return new Bundle(this.zzd);
    }

    public String getTargetPackage() {
        return this.zza;
    }

    public String getUrl() {
        return this.zzb;
    }

    public IBinder getWindowToken() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        IBinder iBinder = this.zzc;
        if (iBinder != null) {
            parcel.writeByte((byte) 1);
            parcel.writeStrongBinder(iBinder);
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeBundle(this.zzd);
    }

    public PrewarmRequest(String str, String str2, IBinder iBinder, Bundle bundle) {
        this.zza = (String) Objects.requireNonNull(str, "targetPackage cannot be null");
        this.zzb = (String) Objects.requireNonNull(str2, "url cannot be null");
        this.zzc = iBinder;
        this.zzd = bundle != null ? new Bundle(bundle) : Bundle.EMPTY;
    }
}
