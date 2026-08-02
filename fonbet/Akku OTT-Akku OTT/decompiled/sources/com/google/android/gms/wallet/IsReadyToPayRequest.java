package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes4.dex */
public final class IsReadyToPayRequest extends a {

    @NonNull
    public static final Parcelable.Creator<IsReadyToPayRequest> CREATOR = new zzq();
    ArrayList zza;
    String zzb;
    String zzc;
    ArrayList zzd;
    boolean zze;
    String zzf;

    @Deprecated
    public final class Builder {
        public /* synthetic */ Builder(zzp zzpVar) {
        }

        @NonNull
        public Builder addAllowedCardNetwork(int i) {
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.zza == null) {
                isReadyToPayRequest.zza = new ArrayList();
            }
            IsReadyToPayRequest.this.zza.add(Integer.valueOf(i));
            return this;
        }

        @NonNull
        public Builder addAllowedCardNetworks(@NonNull Collection<Integer> collection) {
            boolean z = false;
            if (collection != null && !collection.isEmpty()) {
                z = true;
            }
            C0875q.b(z, "allowedCardNetworks can't be null or empty. If you want the defaults, leave it unset.");
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.zza == null) {
                isReadyToPayRequest.zza = new ArrayList();
            }
            IsReadyToPayRequest.this.zza.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addAllowedPaymentMethod(int i) {
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.zzd == null) {
                isReadyToPayRequest.zzd = new ArrayList();
            }
            IsReadyToPayRequest.this.zzd.add(Integer.valueOf(i));
            return this;
        }

        @NonNull
        public Builder addAllowedPaymentMethods(@NonNull Collection<Integer> collection) {
            boolean z = false;
            if (collection != null && !collection.isEmpty()) {
                z = true;
            }
            C0875q.b(z, "allowedPaymentMethods can't be null or empty. If you want the default, leave it unset.");
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.zzd == null) {
                isReadyToPayRequest.zzd = new ArrayList();
            }
            IsReadyToPayRequest.this.zzd.addAll(collection);
            return this;
        }

        @NonNull
        public IsReadyToPayRequest build() {
            return IsReadyToPayRequest.this;
        }

        @NonNull
        public Builder setExistingPaymentMethodRequired(boolean z) {
            IsReadyToPayRequest.this.zze = z;
            return this;
        }
    }

    public IsReadyToPayRequest() {
    }

    @NonNull
    public static IsReadyToPayRequest fromJson(@NonNull String str) {
        Builder newBuilder = newBuilder();
        C0875q.h(str, "isReadyToPayRequestJson cannot be null!");
        IsReadyToPayRequest.this.zzf = str;
        return newBuilder.build();
    }

    @NonNull
    @Deprecated
    public static Builder newBuilder() {
        return new IsReadyToPayRequest().new Builder(null);
    }

    @NonNull
    @Deprecated
    public ArrayList<Integer> getAllowedCardNetworks() {
        return this.zza;
    }

    @NonNull
    @Deprecated
    public ArrayList<Integer> getAllowedPaymentMethods() {
        return this.zzd;
    }

    @Deprecated
    public boolean isExistingPaymentMethodRequired() {
        return this.zze;
    }

    @NonNull
    public String toJson() {
        return this.zzf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.h(parcel, 2, this.zza);
        c.l(parcel, 4, this.zzb, false);
        c.l(parcel, 5, this.zzc, false);
        c.h(parcel, 6, this.zzd);
        boolean z = this.zze;
        c.s(parcel, 7, 4);
        parcel.writeInt(z ? 1 : 0);
        c.l(parcel, 8, this.zzf, false);
        c.r(parcel, q);
    }

    public IsReadyToPayRequest(ArrayList arrayList, String str, String str2, ArrayList arrayList2, boolean z, String str3) {
        this.zza = arrayList;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = arrayList2;
        this.zze = z;
        this.zzf = str3;
    }
}
