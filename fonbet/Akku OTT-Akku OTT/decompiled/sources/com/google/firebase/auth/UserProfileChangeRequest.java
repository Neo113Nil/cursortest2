package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public class UserProfileChangeRequest extends a {

    @NonNull
    public static final Parcelable.Creator<UserProfileChangeRequest> CREATOR = new zzau();

    @Nullable
    private String zza;

    @Nullable
    private String zzb;
    private boolean zzc;
    private boolean zzd;

    @Nullable
    private Uri zze;

    public static class Builder {

        @Nullable
        private String zza;

        @Nullable
        private Uri zzb;
        private boolean zzc;
        private boolean zzd;

        @NonNull
        public UserProfileChangeRequest build() {
            String str = this.zza;
            Uri uri = this.zzb;
            return new UserProfileChangeRequest(str, uri == null ? null : uri.toString(), this.zzc, this.zzd);
        }

        @Nullable
        public String getDisplayName() {
            return this.zza;
        }

        @Nullable
        public Uri getPhotoUri() {
            return this.zzb;
        }

        @NonNull
        public Builder setDisplayName(@Nullable String str) {
            if (str == null) {
                this.zzc = true;
                return this;
            }
            this.zza = str;
            return this;
        }

        @NonNull
        public Builder setPhotoUri(@Nullable Uri uri) {
            if (uri == null) {
                this.zzd = true;
                return this;
            }
            this.zzb = uri;
            return this;
        }
    }

    public UserProfileChangeRequest(@Nullable String str, @Nullable String str2, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z;
        this.zzd = z2;
        this.zze = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    @Nullable
    public String getDisplayName() {
        return this.zza;
    }

    @Nullable
    public Uri getPhotoUri() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.l(parcel, 2, getDisplayName(), false);
        c.l(parcel, 3, this.zzb, false);
        boolean z = this.zzc;
        c.s(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzd;
        c.s(parcel, 5, 4);
        parcel.writeInt(z2 ? 1 : 0);
        c.r(parcel, q);
    }

    @Nullable
    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zzd;
    }
}
