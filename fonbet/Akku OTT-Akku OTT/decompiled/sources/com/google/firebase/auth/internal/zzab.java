package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import com.google.android.gms.internal.p002firebaseauthapi.zzahk;
import com.google.android.gms.internal.p002firebaseauthapi.zzaib;
import com.google.firebase.auth.UserInfo;
import io.flutter.plugins.firebase.analytics.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzab extends a implements UserInfo {
    public static final Parcelable.Creator<zzab> CREATOR = new zzaa();

    @NonNull
    private String zza;

    @NonNull
    private String zzb;

    @Nullable
    private String zzc;

    @Nullable
    private String zzd;

    @Nullable
    private Uri zze;

    @Nullable
    private String zzf;

    @Nullable
    private String zzg;
    private boolean zzh;

    @Nullable
    private String zzi;

    public zzab(zzaib zzaibVar) {
        C0875q.g(zzaibVar);
        this.zza = zzaibVar.zzd();
        String zzf = zzaibVar.zzf();
        C0875q.d(zzf);
        this.zzb = zzf;
        this.zzc = zzaibVar.zzb();
        Uri zza = zzaibVar.zza();
        if (zza != null) {
            this.zzd = zza.toString();
            this.zze = zza;
        }
        this.zzf = zzaibVar.zzc();
        this.zzg = zzaibVar.zze();
        this.zzh = false;
        this.zzi = zzaibVar.zzg();
    }

    @Nullable
    public static zzab zza(@NonNull String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new zzab(jSONObject.optString(Constants.USER_ID), jSONObject.optString(io.flutter.plugins.firebase.auth.Constants.PROVIDER_ID), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e) {
            throw new zzaao(e);
        }
    }

    @Override // com.google.firebase.auth.UserInfo
    @Nullable
    public final String getDisplayName() {
        return this.zzc;
    }

    @Override // com.google.firebase.auth.UserInfo
    @Nullable
    public final String getEmail() {
        return this.zzf;
    }

    @Override // com.google.firebase.auth.UserInfo
    @Nullable
    public final String getPhoneNumber() {
        return this.zzg;
    }

    @Override // com.google.firebase.auth.UserInfo
    @Nullable
    public final Uri getPhotoUrl() {
        if (!TextUtils.isEmpty(this.zzd) && this.zze == null) {
            this.zze = Uri.parse(this.zzd);
        }
        return this.zze;
    }

    @Override // com.google.firebase.auth.UserInfo
    @NonNull
    public final String getProviderId() {
        return this.zzb;
    }

    @Override // com.google.firebase.auth.UserInfo
    @NonNull
    public final String getUid() {
        return this.zza;
    }

    @Override // com.google.firebase.auth.UserInfo
    public final boolean isEmailVerified() {
        return this.zzh;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.l(parcel, 1, getUid(), false);
        c.l(parcel, 2, getProviderId(), false);
        c.l(parcel, 3, getDisplayName(), false);
        c.l(parcel, 4, this.zzd, false);
        c.l(parcel, 5, getEmail(), false);
        c.l(parcel, 6, getPhoneNumber(), false);
        boolean isEmailVerified = isEmailVerified();
        c.s(parcel, 7, 4);
        parcel.writeInt(isEmailVerified ? 1 : 0);
        c.l(parcel, 8, this.zzi, false);
        c.r(parcel, q);
    }

    @Nullable
    public final String zzb() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(Constants.USER_ID, this.zza);
            jSONObject.putOpt(io.flutter.plugins.firebase.auth.Constants.PROVIDER_ID, this.zzb);
            jSONObject.putOpt("displayName", this.zzc);
            jSONObject.putOpt("photoUrl", this.zzd);
            jSONObject.putOpt("email", this.zzf);
            jSONObject.putOpt("phoneNumber", this.zzg);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.zzh));
            jSONObject.putOpt("rawUserInfo", this.zzi);
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new zzaao(e);
        }
    }

    @Nullable
    public final String zza() {
        return this.zzi;
    }

    public zzab(zzahk zzahkVar, String str) {
        C0875q.g(zzahkVar);
        C0875q.d(str);
        String zzi = zzahkVar.zzi();
        C0875q.d(zzi);
        this.zza = zzi;
        this.zzb = str;
        this.zzf = zzahkVar.zzh();
        this.zzc = zzahkVar.zzg();
        Uri zzc = zzahkVar.zzc();
        if (zzc != null) {
            this.zzd = zzc.toString();
            this.zze = zzc;
        }
        this.zzh = zzahkVar.zzm();
        this.zzi = null;
        this.zzg = zzahkVar.zzj();
    }

    public zzab(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, boolean z, @Nullable String str7) {
        this.zza = str;
        this.zzb = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzc = str5;
        this.zzd = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.zze = Uri.parse(this.zzd);
        }
        this.zzh = z;
        this.zzi = str7;
    }
}
