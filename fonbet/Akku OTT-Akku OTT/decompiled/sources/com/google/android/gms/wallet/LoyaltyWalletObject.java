package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes4.dex */
public final class LoyaltyWalletObject extends a {

    @NonNull
    public static final Parcelable.Creator<LoyaltyWalletObject> CREATOR = new zzs();
    String zza;
    String zzb;
    String zzc;
    String zzd;
    String zze;
    String zzf;
    String zzg;
    String zzh;

    @Deprecated
    String zzi;
    String zzj;
    int zzk;
    final ArrayList zzl;
    TimeInterval zzm;
    final ArrayList zzn;

    @Deprecated
    String zzo;

    @Deprecated
    String zzp;
    final ArrayList zzq;
    boolean zzr;
    final ArrayList zzs;
    final ArrayList zzt;
    final ArrayList zzu;
    LoyaltyPoints zzv;

    public final class Builder {
        public /* synthetic */ Builder(zzr zzrVar) {
        }

        @NonNull
        public Builder addImageModuleDataMainImageUri(@NonNull UriData uriData) {
            LoyaltyWalletObject.this.zzs.add(uriData);
            return this;
        }

        @NonNull
        public Builder addImageModuleDataMainImageUris(@NonNull Collection<UriData> collection) {
            LoyaltyWalletObject.this.zzs.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addInfoModuleDataLabeValueRow(@NonNull LabelValueRow labelValueRow) {
            LoyaltyWalletObject.this.zzq.add(labelValueRow);
            return this;
        }

        @NonNull
        public Builder addInfoModuleDataLabelValueRows(@NonNull Collection<LabelValueRow> collection) {
            LoyaltyWalletObject.this.zzq.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addLinksModuleDataUri(@NonNull UriData uriData) {
            LoyaltyWalletObject.this.zzu.add(uriData);
            return this;
        }

        @NonNull
        public Builder addLinksModuleDataUris(@NonNull Collection<UriData> collection) {
            LoyaltyWalletObject.this.zzu.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addLocation(@NonNull LatLng latLng) {
            LoyaltyWalletObject.this.zzn.add(latLng);
            return this;
        }

        @NonNull
        public Builder addLocations(@NonNull Collection<LatLng> collection) {
            LoyaltyWalletObject.this.zzn.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addMessage(@NonNull WalletObjectMessage walletObjectMessage) {
            LoyaltyWalletObject.this.zzl.add(walletObjectMessage);
            return this;
        }

        @NonNull
        public Builder addMessages(@NonNull Collection<WalletObjectMessage> collection) {
            LoyaltyWalletObject.this.zzl.addAll(collection);
            return this;
        }

        @NonNull
        public Builder addTextModuleData(@NonNull TextModuleData textModuleData) {
            LoyaltyWalletObject.this.zzt.add(textModuleData);
            return this;
        }

        @NonNull
        public Builder addTextModulesData(@NonNull Collection<TextModuleData> collection) {
            LoyaltyWalletObject.this.zzt.addAll(collection);
            return this;
        }

        @NonNull
        public LoyaltyWalletObject build() {
            return LoyaltyWalletObject.this;
        }

        @NonNull
        public Builder setAccountId(@NonNull String str) {
            LoyaltyWalletObject.this.zzb = str;
            return this;
        }

        @NonNull
        public Builder setAccountName(@NonNull String str) {
            LoyaltyWalletObject.this.zze = str;
            return this;
        }

        @NonNull
        public Builder setBarcodeAlternateText(@NonNull String str) {
            LoyaltyWalletObject.this.zzf = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setBarcodeLabel(@NonNull String str) {
            LoyaltyWalletObject.this.zzi = str;
            return this;
        }

        @NonNull
        public Builder setBarcodeType(@NonNull String str) {
            LoyaltyWalletObject.this.zzg = str;
            return this;
        }

        @NonNull
        public Builder setBarcodeValue(@NonNull String str) {
            LoyaltyWalletObject.this.zzh = str;
            return this;
        }

        @NonNull
        public Builder setClassId(@NonNull String str) {
            LoyaltyWalletObject.this.zzj = str;
            return this;
        }

        @NonNull
        public Builder setId(@NonNull String str) {
            LoyaltyWalletObject.this.zza = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setInfoModuleDataHexBackgroundColor(@NonNull String str) {
            LoyaltyWalletObject.this.zzp = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setInfoModuleDataHexFontColor(@NonNull String str) {
            LoyaltyWalletObject.this.zzo = str;
            return this;
        }

        @NonNull
        public Builder setInfoModuleDataShowLastUpdateTime(boolean z) {
            LoyaltyWalletObject.this.zzr = z;
            return this;
        }

        @NonNull
        public Builder setIssuerName(@NonNull String str) {
            LoyaltyWalletObject.this.zzc = str;
            return this;
        }

        @NonNull
        public Builder setLoyaltyPoints(@NonNull LoyaltyPoints loyaltyPoints) {
            LoyaltyWalletObject.this.zzv = loyaltyPoints;
            return this;
        }

        @NonNull
        public Builder setProgramName(@NonNull String str) {
            LoyaltyWalletObject.this.zzd = str;
            return this;
        }

        @NonNull
        public Builder setState(int i) {
            LoyaltyWalletObject.this.zzk = i;
            return this;
        }

        @NonNull
        public Builder setValidTimeInterval(@NonNull TimeInterval timeInterval) {
            LoyaltyWalletObject.this.zzm = timeInterval;
            return this;
        }
    }

    public LoyaltyWalletObject() {
        this.zzl = ArrayUtils.newArrayList();
        this.zzn = ArrayUtils.newArrayList();
        this.zzq = ArrayUtils.newArrayList();
        this.zzs = ArrayUtils.newArrayList();
        this.zzt = ArrayUtils.newArrayList();
        this.zzu = ArrayUtils.newArrayList();
    }

    @NonNull
    public static Builder newBuilder() {
        return new LoyaltyWalletObject().new Builder(null);
    }

    @NonNull
    public String getAccountId() {
        return this.zzb;
    }

    @NonNull
    public String getAccountName() {
        return this.zze;
    }

    @NonNull
    public String getBarcodeAlternateText() {
        return this.zzf;
    }

    @NonNull
    @Deprecated
    public String getBarcodeLabel() {
        return this.zzi;
    }

    @NonNull
    public String getBarcodeType() {
        return this.zzg;
    }

    @NonNull
    public String getBarcodeValue() {
        return this.zzh;
    }

    @NonNull
    public String getClassId() {
        return this.zzj;
    }

    @NonNull
    public String getId() {
        return this.zza;
    }

    @NonNull
    public ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.zzs;
    }

    @NonNull
    @Deprecated
    public String getInfoModuleDataHexBackgroundColor() {
        return this.zzp;
    }

    @NonNull
    @Deprecated
    public String getInfoModuleDataHexFontColor() {
        return this.zzo;
    }

    @NonNull
    public ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.zzq;
    }

    public boolean getInfoModuleDataShowLastUpdateTime() {
        return this.zzr;
    }

    @NonNull
    public String getIssuerName() {
        return this.zzc;
    }

    @NonNull
    public ArrayList<UriData> getLinksModuleDataUris() {
        return this.zzu;
    }

    @NonNull
    public ArrayList<LatLng> getLocations() {
        return this.zzn;
    }

    @NonNull
    public LoyaltyPoints getLoyaltyPoints() {
        return this.zzv;
    }

    @NonNull
    public ArrayList<WalletObjectMessage> getMessages() {
        return this.zzl;
    }

    @NonNull
    public String getProgramName() {
        return this.zzd;
    }

    public int getState() {
        return this.zzk;
    }

    @NonNull
    public ArrayList<TextModuleData> getTextModulesData() {
        return this.zzt;
    }

    @NonNull
    public TimeInterval getValidTimeInterval() {
        return this.zzm;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.l(parcel, 2, this.zza, false);
        c.l(parcel, 3, this.zzb, false);
        c.l(parcel, 4, this.zzc, false);
        c.l(parcel, 5, this.zzd, false);
        c.l(parcel, 6, this.zze, false);
        c.l(parcel, 7, this.zzf, false);
        c.l(parcel, 8, this.zzg, false);
        c.l(parcel, 9, this.zzh, false);
        c.l(parcel, 10, this.zzi, false);
        c.l(parcel, 11, this.zzj, false);
        int i2 = this.zzk;
        c.s(parcel, 12, 4);
        parcel.writeInt(i2);
        c.p(parcel, 13, this.zzl, false);
        c.k(parcel, 14, this.zzm, i, false);
        c.p(parcel, 15, this.zzn, false);
        c.l(parcel, 16, this.zzo, false);
        c.l(parcel, 17, this.zzp, false);
        c.p(parcel, 18, this.zzq, false);
        boolean z = this.zzr;
        c.s(parcel, 19, 4);
        parcel.writeInt(z ? 1 : 0);
        c.p(parcel, 20, this.zzs, false);
        c.p(parcel, 21, this.zzt, false);
        c.p(parcel, 22, this.zzu, false);
        c.k(parcel, 23, this.zzv, i, false);
        c.r(parcel, q);
    }

    public LoyaltyWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, LoyaltyPoints loyaltyPoints) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = str9;
        this.zzj = str10;
        this.zzk = i;
        this.zzl = arrayList;
        this.zzm = timeInterval;
        this.zzn = arrayList2;
        this.zzo = str11;
        this.zzp = str12;
        this.zzq = arrayList3;
        this.zzr = z;
        this.zzs = arrayList4;
        this.zzt = arrayList5;
        this.zzu = arrayList6;
        this.zzv = loyaltyPoints;
    }
}
