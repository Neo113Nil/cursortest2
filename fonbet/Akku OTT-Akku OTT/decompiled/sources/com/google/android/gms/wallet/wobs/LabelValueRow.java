package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.common.util.ArrayUtils;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes4.dex */
public final class LabelValueRow extends a {

    @NonNull
    public static final Parcelable.Creator<LabelValueRow> CREATOR = new zzf();

    @Deprecated
    String zza;

    @Deprecated
    String zzb;
    final ArrayList zzc;

    public final class Builder {
        public /* synthetic */ Builder(zze zzeVar) {
        }

        @NonNull
        public Builder addColumn(@NonNull LabelValue labelValue) {
            LabelValueRow.this.zzc.add(labelValue);
            return this;
        }

        @NonNull
        public Builder addColumns(@NonNull Collection<LabelValue> collection) {
            LabelValueRow.this.zzc.addAll(collection);
            return this;
        }

        @NonNull
        public LabelValueRow build() {
            return LabelValueRow.this;
        }

        @NonNull
        @Deprecated
        public Builder setHexBackgroundColor(@NonNull String str) {
            LabelValueRow.this.zzb = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setHexFontColor(@NonNull String str) {
            LabelValueRow.this.zza = str;
            return this;
        }
    }

    public LabelValueRow() {
        this.zzc = ArrayUtils.newArrayList();
    }

    @NonNull
    public static Builder newBuilder() {
        return new LabelValueRow().new Builder(null);
    }

    @NonNull
    public ArrayList<LabelValue> getColumns() {
        return this.zzc;
    }

    @NonNull
    @Deprecated
    public String getHexBackgroundColor() {
        return this.zzb;
    }

    @NonNull
    @Deprecated
    public String getHexFontColor() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.l(parcel, 2, this.zza, false);
        c.l(parcel, 3, this.zzb, false);
        c.p(parcel, 4, this.zzc, false);
        c.r(parcel, q);
    }

    public LabelValueRow(String str, String str2, ArrayList arrayList) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = arrayList;
    }
}
