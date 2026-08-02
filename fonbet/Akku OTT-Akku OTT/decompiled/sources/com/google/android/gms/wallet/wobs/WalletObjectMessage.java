package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class WalletObjectMessage extends a {

    @NonNull
    public static final Parcelable.Creator<WalletObjectMessage> CREATOR = new zzo();
    String zza;
    String zzb;
    TimeInterval zzc;

    @Deprecated
    UriData zzd;

    @Deprecated
    UriData zze;

    public final class Builder {
        public /* synthetic */ Builder(zzn zznVar) {
        }

        @NonNull
        public WalletObjectMessage build() {
            return WalletObjectMessage.this;
        }

        @NonNull
        @Deprecated
        public Builder setActionUri(@NonNull UriData uriData) {
            WalletObjectMessage.this.zzd = uriData;
            return this;
        }

        @NonNull
        public Builder setBody(@NonNull String str) {
            WalletObjectMessage.this.zzb = str;
            return this;
        }

        @NonNull
        public Builder setDisplayInterval(@NonNull TimeInterval timeInterval) {
            WalletObjectMessage.this.zzc = timeInterval;
            return this;
        }

        @NonNull
        public Builder setHeader(@NonNull String str) {
            WalletObjectMessage.this.zza = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setImageUri(@NonNull UriData uriData) {
            WalletObjectMessage.this.zze = uriData;
            return this;
        }
    }

    public WalletObjectMessage() {
    }

    @NonNull
    public static Builder newBuilder() {
        return new WalletObjectMessage().new Builder(null);
    }

    @NonNull
    @Deprecated
    public UriData getActionUri() {
        return this.zzd;
    }

    @NonNull
    public String getBody() {
        return this.zzb;
    }

    @NonNull
    public TimeInterval getDisplayInterval() {
        return this.zzc;
    }

    @NonNull
    public String getHeader() {
        return this.zza;
    }

    @NonNull
    @Deprecated
    public UriData getImageUri() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.l(parcel, 2, this.zza, false);
        c.l(parcel, 3, this.zzb, false);
        c.k(parcel, 4, this.zzc, i, false);
        c.k(parcel, 5, this.zzd, i, false);
        c.k(parcel, 6, this.zze, i, false);
        c.r(parcel, q);
    }

    public WalletObjectMessage(String str, String str2, TimeInterval timeInterval, UriData uriData, UriData uriData2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = timeInterval;
        this.zzd = uriData;
        this.zze = uriData2;
    }
}
