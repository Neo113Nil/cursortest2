package com.google.android.gms.internal.p002firebaseauthapi;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;
import p042f4.G;

/* JADX INFO: loaded from: classes.dex */
public final class zzahr extends AbstractSafeParcelable implements zzadq {
    public static final Parcelable.Creator<zzahr> CREATOR = new zzahu();
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private boolean zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private boolean zzo;
    private String zzp;

    public zzahr() {
        this.zzi = true;
        this.zzj = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.s0(parcel, 2, this.zza, false);
        D.s0(parcel, 3, this.zzb, false);
        D.s0(parcel, 4, this.zzc, false);
        D.s0(parcel, 5, this.zzd, false);
        D.s0(parcel, 6, this.zze, false);
        D.s0(parcel, 7, this.zzf, false);
        D.s0(parcel, 8, this.zzg, false);
        D.s0(parcel, 9, this.zzh, false);
        boolean z4 = this.zzi;
        D.B0(parcel, 10, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z7 = this.zzj;
        D.B0(parcel, 11, 4);
        parcel.writeInt(z7 ? 1 : 0);
        D.s0(parcel, 12, this.zzk, false);
        D.s0(parcel, 13, this.zzl, false);
        D.s0(parcel, 14, this.zzm, false);
        D.s0(parcel, 15, this.zzn, false);
        boolean z8 = this.zzo;
        D.B0(parcel, 16, 4);
        parcel.writeInt(z8 ? 1 : 0);
        D.s0(parcel, 17, this.zzp, false);
        D.z0(iX0, parcel);
    }

    public final zzahr zza(boolean z4) {
        this.zzj = false;
        return this;
    }

    public final zzahr zzb(boolean z4) {
        this.zzo = true;
        return this;
    }

    public final zzahr zzc(boolean z4) {
        this.zzi = true;
        return this;
    }

    public final zzahr zza(String str) {
        com.google.android.gms.common.internal.D.e(str);
        this.zzb = str;
        return this;
    }

    public final zzahr zzb(String str) {
        this.zzn = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.zzj);
        jSONObject.put("returnSecureToken", this.zzi);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.zzg;
        if (str2 != null) {
            jSONObject.put("postBody", str2);
        }
        String str3 = this.zzn;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zzp;
        if (str4 != null) {
            jSONObject.put("pendingToken", str4);
        }
        if (!TextUtils.isEmpty(this.zzl)) {
            jSONObject.put("sessionId", this.zzl);
        }
        if (!TextUtils.isEmpty(this.zzm)) {
            jSONObject.put("requestUri", this.zzm);
        } else {
            String str5 = this.zza;
            if (str5 != null) {
                jSONObject.put("requestUri", str5);
            }
        }
        jSONObject.put("returnIdpCredential", this.zzo);
        return jSONObject.toString();
    }

    public zzahr(G g3, String str) {
        com.google.android.gms.common.internal.D.i(g3);
        String str2 = g3.f12925a;
        com.google.android.gms.common.internal.D.e(str2);
        this.zzl = str2;
        com.google.android.gms.common.internal.D.e(str);
        this.zzm = str;
        String str3 = g3.f12927c;
        com.google.android.gms.common.internal.D.e(str3);
        this.zze = str3;
        this.zzi = true;
        this.zzg = "providerId=" + this.zze;
    }

    public zzahr(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.zza = "http://localhost";
        this.zzc = str;
        this.zzd = str2;
        this.zzh = str5;
        this.zzk = str6;
        this.zzn = str7;
        this.zzp = str8;
        this.zzi = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(this.zzd) && TextUtils.isEmpty(this.zzk)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        com.google.android.gms.common.internal.D.e(str3);
        this.zze = str3;
        this.zzf = null;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.zzc)) {
            sb.append("id_token=");
            sb.append(this.zzc);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            sb.append("access_token=");
            sb.append(this.zzd);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.zzf)) {
            sb.append("identifier=");
            sb.append(this.zzf);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            sb.append("oauth_token_secret=");
            sb.append(this.zzh);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.zzk)) {
            sb.append("code=");
            sb.append(this.zzk);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(str9)) {
            sb.append("nonce=");
            sb.append(str9);
            sb.append("&");
        }
        sb.append("providerId=");
        sb.append(this.zze);
        this.zzg = sb.toString();
        this.zzj = true;
    }

    public zzahr(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z4, boolean z7, String str9, String str10, String str11, String str12, boolean z8, String str13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = z4;
        this.zzj = z7;
        this.zzk = str9;
        this.zzl = str10;
        this.zzm = str11;
        this.zzn = str12;
        this.zzo = z8;
        this.zzp = str13;
    }
}
