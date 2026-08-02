package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public class ActionCodeSettings extends a {

    @NonNull
    public static final Parcelable.Creator<ActionCodeSettings> CREATOR = new zza();
    private final String zza;

    @Nullable
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final boolean zze;

    @Nullable
    private final String zzf;
    private final boolean zzg;
    private String zzh;
    private int zzi;
    private String zzj;
    private final String zzk;

    public static class Builder {
        private String zza;

        @Nullable
        private String zzb;
        private String zzc;
        private boolean zzd;

        @Nullable
        private String zze;
        private boolean zzf;

        @Deprecated
        private String zzg;
        private String zzh;

        @NonNull
        public ActionCodeSettings build() {
            if (this.zza != null) {
                return new ActionCodeSettings(this);
            }
            throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
        }

        @NonNull
        @Deprecated
        public String getDynamicLinkDomain() {
            return this.zzg;
        }

        public boolean getHandleCodeInApp() {
            return this.zzf;
        }

        @Nullable
        public String getIOSBundleId() {
            return this.zzb;
        }

        @NonNull
        public String getLinkDomain() {
            return this.zzh;
        }

        @NonNull
        public String getUrl() {
            return this.zza;
        }

        @NonNull
        public Builder setAndroidPackageName(@NonNull String str, boolean z, @Nullable String str2) {
            this.zzc = str;
            this.zzd = z;
            this.zze = str2;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setDynamicLinkDomain(@NonNull String str) {
            this.zzg = str;
            return this;
        }

        @NonNull
        public Builder setHandleCodeInApp(boolean z) {
            this.zzf = z;
            return this;
        }

        @NonNull
        public Builder setIOSBundleId(@Nullable String str) {
            this.zzb = str;
            return this;
        }

        @NonNull
        public Builder setLinkDomain(@NonNull String str) {
            this.zzh = str;
            return this;
        }

        @NonNull
        public Builder setUrl(@NonNull String str) {
            this.zza = str;
            return this;
        }

        private Builder() {
            this.zzf = false;
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    @NonNull
    public static ActionCodeSettings zzb() {
        return new ActionCodeSettings(new Builder());
    }

    public boolean canHandleCodeInApp() {
        return this.zzg;
    }

    public boolean getAndroidInstallApp() {
        return this.zze;
    }

    @Nullable
    public String getAndroidMinimumVersion() {
        return this.zzf;
    }

    @Nullable
    public String getAndroidPackageName() {
        return this.zzd;
    }

    @Nullable
    public String getIOSBundle() {
        return this.zzb;
    }

    @NonNull
    public String getLinkDomain() {
        return this.zzk;
    }

    @NonNull
    public String getUrl() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.l(parcel, 1, getUrl(), false);
        c.l(parcel, 2, getIOSBundle(), false);
        c.l(parcel, 3, this.zzc, false);
        c.l(parcel, 4, getAndroidPackageName(), false);
        boolean androidInstallApp = getAndroidInstallApp();
        c.s(parcel, 5, 4);
        parcel.writeInt(androidInstallApp ? 1 : 0);
        c.l(parcel, 6, getAndroidMinimumVersion(), false);
        boolean canHandleCodeInApp = canHandleCodeInApp();
        c.s(parcel, 7, 4);
        parcel.writeInt(canHandleCodeInApp ? 1 : 0);
        c.l(parcel, 8, this.zzh, false);
        int i2 = this.zzi;
        c.s(parcel, 9, 4);
        parcel.writeInt(i2);
        c.l(parcel, 10, this.zzj, false);
        c.l(parcel, 11, getLinkDomain(), false);
        c.r(parcel, q);
    }

    public final int zza() {
        return this.zzi;
    }

    @NonNull
    @Deprecated
    public final String zzc() {
        return this.zzj;
    }

    @Nullable
    public final String zzd() {
        return this.zzc;
    }

    @NonNull
    public final String zze() {
        return this.zzh;
    }

    private ActionCodeSettings(Builder builder) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = null;
        this.zzd = builder.zzc;
        this.zze = builder.zzd;
        this.zzf = builder.zze;
        this.zzg = builder.zzf;
        this.zzj = builder.zzg;
        this.zzk = builder.zzh;
    }

    public final void zza(@NonNull String str) {
        this.zzh = str;
    }

    public final void zza(int i) {
        this.zzi = i;
    }

    public ActionCodeSettings(String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, String str6, int i, String str7, String str8) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = z;
        this.zzf = str5;
        this.zzg = z2;
        this.zzh = str6;
        this.zzi = i;
        this.zzj = str7;
        this.zzk = str8;
    }
}
