package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuthProvider;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseUserMetadata;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.MultiFactor;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.UserInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzaf extends FirebaseUser {
    public static final Parcelable.Creator<zzaf> CREATOR = new zzae();
    private zzahv zza;
    private zzab zzb;
    private String zzc;
    private String zzd;
    private List<zzab> zze;
    private List<String> zzf;
    private String zzg;
    private Boolean zzh;
    private zzah zzi;
    private boolean zzj;
    private com.google.firebase.auth.zze zzk;
    private zzbj zzl;
    private List<com.google.firebase.auth.zzan> zzm;

    public zzaf(FirebaseApp firebaseApp, List<? extends UserInfo> list) {
        C0875q.g(firebaseApp);
        this.zzc = firebaseApp.getName();
        this.zzd = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.zzg = ExifInterface.GPS_MEASUREMENT_2D;
        zza(list);
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    @Nullable
    public final String getDisplayName() {
        return this.zzb.getDisplayName();
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    @Nullable
    public final String getEmail() {
        return this.zzb.getEmail();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final FirebaseUserMetadata getMetadata() {
        return this.zzi;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final /* synthetic */ MultiFactor getMultiFactor() {
        return new zzaj(this);
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    @Nullable
    public final String getPhoneNumber() {
        return this.zzb.getPhoneNumber();
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    @Nullable
    public final Uri getPhotoUrl() {
        return this.zzb.getPhotoUrl();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    @NonNull
    public final List<? extends UserInfo> getProviderData() {
        return this.zze;
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    @NonNull
    public final String getProviderId() {
        return this.zzb.getProviderId();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    @Nullable
    public final String getTenantId() {
        Map map;
        zzahv zzahvVar = this.zza;
        if (zzahvVar == null || zzahvVar.zzc() == null || (map = (Map) zzbi.zza(this.zza.zzc()).getClaims().get(FirebaseAuthProvider.PROVIDER_ID)) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    @NonNull
    public final String getUid() {
        return this.zzb.getUid();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final boolean isAnonymous() {
        GetTokenResult zza;
        Boolean bool = this.zzh;
        if (bool == null || bool.booleanValue()) {
            zzahv zzahvVar = this.zza;
            String str = "";
            if (zzahvVar != null && (zza = zzbi.zza(zzahvVar.zzc())) != null) {
                str = zza.getSignInProvider();
            }
            boolean z = true;
            if (getProviderData().size() > 1 || (str != null && str.equals("custom"))) {
                z = false;
            }
            this.zzh = Boolean.valueOf(z);
        }
        return this.zzh.booleanValue();
    }

    @Override // com.google.firebase.auth.UserInfo
    public final boolean isEmailVerified() {
        return this.zzb.isEmailVerified();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.k(parcel, 1, zzc(), i, false);
        c.k(parcel, 2, this.zzb, i, false);
        c.l(parcel, 3, this.zzc, false);
        c.l(parcel, 4, this.zzd, false);
        c.p(parcel, 5, this.zze, false);
        c.n(parcel, 6, zzg());
        c.l(parcel, 7, this.zzg, false);
        c.a(parcel, 8, Boolean.valueOf(isAnonymous()));
        c.k(parcel, 9, getMetadata(), i, false);
        boolean z = this.zzj;
        c.s(parcel, 10, 4);
        parcel.writeInt(z ? 1 : 0);
        c.k(parcel, 11, this.zzk, i, false);
        c.k(parcel, 12, this.zzl, i, false);
        c.p(parcel, 13, zzf(), false);
        c.r(parcel, q);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    @NonNull
    public final FirebaseApp zza() {
        return FirebaseApp.getInstance(this.zzc);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final /* synthetic */ FirebaseUser zzb() {
        this.zzh = Boolean.FALSE;
        return this;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    @NonNull
    public final zzahv zzc() {
        return this.zza;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    @NonNull
    public final String zzd() {
        return zzc().zzc();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    @NonNull
    public final String zze() {
        return this.zza.zzf();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final List<com.google.firebase.auth.zzan> zzf() {
        return this.zzm;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    @Nullable
    public final List<String> zzg() {
        return this.zzf;
    }

    @Nullable
    public final com.google.firebase.auth.zze zzh() {
        return this.zzk;
    }

    public final List<MultiFactorInfo> zzi() {
        zzbj zzbjVar = this.zzl;
        return zzbjVar != null ? zzbjVar.zza() : new ArrayList();
    }

    public final List<zzab> zzj() {
        return this.zze;
    }

    public final boolean zzk() {
        return this.zzj;
    }

    public static FirebaseUser zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser) {
        zzaf zzafVar = new zzaf(firebaseApp, firebaseUser.getProviderData());
        if (firebaseUser instanceof zzaf) {
            zzaf zzafVar2 = (zzaf) firebaseUser;
            zzafVar.zzg = zzafVar2.zzg;
            zzafVar.zzd = zzafVar2.zzd;
            zzafVar.zzi = (zzah) zzafVar2.getMetadata();
        } else {
            zzafVar.zzi = null;
        }
        if (firebaseUser.zzc() != null) {
            zzafVar.zza(firebaseUser.zzc());
        }
        if (!firebaseUser.isAnonymous()) {
            zzafVar.zzb();
        }
        return zzafVar;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void zzb(List<com.google.firebase.auth.zzan> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.zzm = list;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void zzc(List<MultiFactorInfo> list) {
        this.zzl = zzbj.zza(list);
    }

    public zzaf(zzahv zzahvVar, zzab zzabVar, String str, String str2, List<zzab> list, List<String> list2, String str3, Boolean bool, zzah zzahVar, boolean z, com.google.firebase.auth.zze zzeVar, zzbj zzbjVar, List<com.google.firebase.auth.zzan> list3) {
        this.zza = zzahvVar;
        this.zzb = zzabVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = list;
        this.zzf = list2;
        this.zzg = str3;
        this.zzh = bool;
        this.zzi = zzahVar;
        this.zzj = z;
        this.zzk = zzeVar;
        this.zzl = zzbjVar;
        this.zzm = list3;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    @NonNull
    public final synchronized FirebaseUser zza(List<? extends UserInfo> list) {
        try {
            C0875q.g(list);
            this.zze = new ArrayList(list.size());
            this.zzf = new ArrayList(list.size());
            for (int i = 0; i < list.size(); i++) {
                UserInfo userInfo = list.get(i);
                if (userInfo.getProviderId().equals(FirebaseAuthProvider.PROVIDER_ID)) {
                    this.zzb = (zzab) userInfo;
                } else {
                    this.zzf.add(userInfo.getProviderId());
                }
                this.zze.add((zzab) userInfo);
            }
            if (this.zzb == null) {
                this.zzb = this.zze.get(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final zzaf zza(String str) {
        this.zzg = str;
        return this;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void zza(zzahv zzahvVar) {
        C0875q.g(zzahvVar);
        this.zza = zzahvVar;
    }

    public final void zza(@Nullable com.google.firebase.auth.zze zzeVar) {
        this.zzk = zzeVar;
    }

    public final void zza(boolean z) {
        this.zzj = z;
    }

    public final void zza(zzah zzahVar) {
        this.zzi = zzahVar;
    }
}
