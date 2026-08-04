package com.google.android.gms.internal.ads;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzbwv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbwv> CREATOR = new zzbww();
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final boolean zzd;
    public final List zze;
    public final boolean zzf;
    public final boolean zzg;
    public final List zzh;

    public zzbwv(String str, String str2, boolean z4, boolean z7, List list, boolean z8, boolean z9, List list2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z4;
        this.zzd = z7;
        this.zze = list;
        this.zzf = z8;
        this.zzg = z9;
        this.zzh = list2 == null ? new ArrayList() : list2;
    }

    public static zzbwv zza(JSONObject jSONObject) {
        return new zzbwv(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), D.A0(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), D.A0(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        int iX0 = D.x0(20293, parcel);
        D.s0(parcel, 2, str, false);
        D.s0(parcel, 3, this.zzb, false);
        boolean z4 = this.zzc;
        D.B0(parcel, 4, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z7 = this.zzd;
        D.B0(parcel, 5, 4);
        parcel.writeInt(z7 ? 1 : 0);
        D.u0(parcel, 6, this.zze);
        boolean z8 = this.zzf;
        D.B0(parcel, 7, 4);
        parcel.writeInt(z8 ? 1 : 0);
        boolean z9 = this.zzg;
        D.B0(parcel, 8, 4);
        parcel.writeInt(z9 ? 1 : 0);
        D.u0(parcel, 9, this.zzh);
        D.z0(iX0, parcel);
    }
}
