package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes4.dex */
public final class ShippingAddressRequirements extends a {

    @NonNull
    public static final Parcelable.Creator<ShippingAddressRequirements> CREATOR = new zzam();
    ArrayList zza;

    public final class Builder {
        public /* synthetic */ Builder(zzal zzalVar) {
        }

        @NonNull
        public Builder addAllowedCountryCode(@NonNull String str) {
            C0875q.e(str, "allowedCountryCode can't be null or empty! If you don't have restrictions, just leave it unset.");
            ShippingAddressRequirements shippingAddressRequirements = ShippingAddressRequirements.this;
            if (shippingAddressRequirements.zza == null) {
                shippingAddressRequirements.zza = new ArrayList();
            }
            ShippingAddressRequirements.this.zza.add(str);
            return this;
        }

        @NonNull
        public Builder addAllowedCountryCodes(@NonNull Collection<String> collection) {
            if (collection == null || collection.isEmpty()) {
                throw new IllegalArgumentException("allowedCountryCodes can't be null or empty! If you don't have restrictions, just leave it unset.");
            }
            ShippingAddressRequirements shippingAddressRequirements = ShippingAddressRequirements.this;
            if (shippingAddressRequirements.zza == null) {
                shippingAddressRequirements.zza = new ArrayList();
            }
            ShippingAddressRequirements.this.zza.addAll(collection);
            return this;
        }

        @NonNull
        public ShippingAddressRequirements build() {
            return ShippingAddressRequirements.this;
        }
    }

    private ShippingAddressRequirements() {
    }

    @NonNull
    public static Builder newBuilder() {
        return new ShippingAddressRequirements().new Builder(null);
    }

    @Nullable
    public ArrayList<String> getAllowedCountryCodes() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.n(parcel, 1, this.zza);
        c.r(parcel, q);
    }

    public ShippingAddressRequirements(ArrayList arrayList) {
        this.zza = arrayList;
    }
}
