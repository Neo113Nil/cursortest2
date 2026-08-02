package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.firebase.auth.AdditionalUserInfo;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzz implements AuthResult {
    public static final Parcelable.Creator<zzz> CREATOR = new zzy();

    @NonNull
    private zzaf zza;

    @Nullable
    private zzx zzb;

    @Nullable
    private com.google.firebase.auth.zze zzc;

    public zzz(zzaf zzafVar) {
        C0875q.g(zzafVar);
        this.zza = zzafVar;
        List<zzab> zzj = zzafVar.zzj();
        this.zzb = null;
        for (int i = 0; i < zzj.size(); i++) {
            if (!TextUtils.isEmpty(zzj.get(i).zza())) {
                this.zzb = new zzx(zzj.get(i).getProviderId(), zzj.get(i).zza(), zzafVar.zzk());
            }
        }
        if (this.zzb == null) {
            this.zzb = new zzx(zzafVar.zzk());
        }
        this.zzc = zzafVar.zzh();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.AuthResult
    @Nullable
    public final AdditionalUserInfo getAdditionalUserInfo() {
        return this.zzb;
    }

    @Override // com.google.firebase.auth.AuthResult
    @Nullable
    public final AuthCredential getCredential() {
        return this.zzc;
    }

    @Override // com.google.firebase.auth.AuthResult
    @Nullable
    public final FirebaseUser getUser() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.k(parcel, 1, getUser(), i, false);
        c.k(parcel, 2, getAdditionalUserInfo(), i, false);
        c.k(parcel, 3, this.zzc, i, false);
        c.r(parcel, q);
    }

    public zzz(@NonNull zzaf zzafVar, @Nullable zzx zzxVar, @Nullable com.google.firebase.auth.zze zzeVar) {
        this.zza = zzafVar;
        this.zzb = zzxVar;
        this.zzc = zzeVar;
    }
}
