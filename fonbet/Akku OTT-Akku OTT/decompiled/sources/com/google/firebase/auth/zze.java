package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;

/* loaded from: classes4.dex */
public final class zze extends OAuthCredential {
    public static final Parcelable.Creator<zze> CREATOR = new zzd();
    private final String zza;

    @Nullable
    private final String zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private final zzajb zzd;

    @Nullable
    private final String zze;

    @Nullable
    private final String zzf;

    @Nullable
    private final String zzg;

    public zze(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable zzajb zzajbVar, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.zza = com.google.android.gms.internal.p002firebaseauthapi.zzac.zzb(str);
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzajbVar;
        this.zze = str4;
        this.zzf = str5;
        this.zzg = str6;
    }

    @Override // com.google.firebase.auth.OAuthCredential
    @Nullable
    public final String getAccessToken() {
        return this.zzc;
    }

    @Override // com.google.firebase.auth.OAuthCredential
    @Nullable
    public final String getIdToken() {
        return this.zzb;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String getProvider() {
        return this.zza;
    }

    @Override // com.google.firebase.auth.OAuthCredential
    @Nullable
    public final String getSecret() {
        return this.zzf;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String getSignInMethod() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.l(parcel, 1, getProvider(), false);
        c.l(parcel, 2, getIdToken(), false);
        c.l(parcel, 3, getAccessToken(), false);
        c.k(parcel, 4, this.zzd, i, false);
        c.l(parcel, 5, this.zze, false);
        c.l(parcel, 6, getSecret(), false);
        c.l(parcel, 7, this.zzg, false);
        c.r(parcel, q);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential zza() {
        return new zze(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
    }

    public static zze zza(zzajb zzajbVar) {
        C0875q.h(zzajbVar, "Must specify a non-null webSignInCredential");
        return new zze(null, null, null, zzajbVar, null, null, null);
    }

    public static zze zza(String str, String str2, String str3) {
        return zza(str, str2, str3, null, null);
    }

    public static zze zza(String str, String str2, String str3, @Nullable String str4, @Nullable String str5) {
        C0875q.e(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new zze(str, str2, str3, null, str4, str5, null);
    }

    public static zze zza(String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        C0875q.e(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new zze(str, str2, str3, null, null, null, str4);
    }

    public static zzajb zza(zze zzeVar, @Nullable String str) {
        C0875q.g(zzeVar);
        zzajb zzajbVar = zzeVar.zzd;
        return zzajbVar != null ? zzajbVar : new zzajb(zzeVar.getIdToken(), zzeVar.getAccessToken(), zzeVar.getProvider(), null, zzeVar.getSecret(), null, str, zzeVar.zze, zzeVar.zzg);
    }
}
