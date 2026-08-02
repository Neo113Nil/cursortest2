package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes4.dex */
public final class GiftCardWalletObject extends a {

    @NonNull
    public static final Parcelable.Creator<GiftCardWalletObject> CREATOR = new zzn();
    CommonWalletObject zza;
    String zzb;
    String zzc;

    @Deprecated
    String zzd;
    long zze;
    String zzf;
    long zzg;
    String zzh;

    public final class Builder {
        private final com.google.android.gms.wallet.wobs.zzb zzb = CommonWalletObject.zzb();

        public /* synthetic */ Builder(zzm zzmVar) {
        }

        @NonNull
        public Builder addImageModuleDataMainImageUri(@NonNull UriData uriData) {
            this.zzb.zza(uriData);
            return this;
        }

        @NonNull
        public Builder addImageModuleDataMainImageUris(@NonNull Collection<UriData> collection) {
            this.zzb.zzb(collection);
            return this;
        }

        @NonNull
        public Builder addInfoModuleDataLabelValueRow(@NonNull LabelValueRow labelValueRow) {
            this.zzb.zzc(labelValueRow);
            return this;
        }

        @NonNull
        public Builder addInfoModuleDataLabelValueRows(@NonNull Collection<LabelValueRow> collection) {
            this.zzb.zzd(collection);
            return this;
        }

        @NonNull
        public Builder addLinksModuleDataUri(@NonNull UriData uriData) {
            this.zzb.zze(uriData);
            return this;
        }

        @NonNull
        public Builder addLinksModuleDataUris(@NonNull Collection<UriData> collection) {
            this.zzb.zzf(collection);
            return this;
        }

        @NonNull
        public Builder addLocation(@NonNull LatLng latLng) {
            this.zzb.zzg(latLng);
            return this;
        }

        @NonNull
        public Builder addLocations(@NonNull Collection<LatLng> collection) {
            this.zzb.zzh(collection);
            return this;
        }

        @NonNull
        public Builder addMessage(@NonNull WalletObjectMessage walletObjectMessage) {
            this.zzb.zzi(walletObjectMessage);
            return this;
        }

        @NonNull
        public Builder addMessages(@NonNull Collection<WalletObjectMessage> collection) {
            this.zzb.zzj(collection);
            return this;
        }

        @NonNull
        public Builder addTextModuleData(@NonNull TextModuleData textModuleData) {
            this.zzb.zzk(textModuleData);
            return this;
        }

        @NonNull
        public Builder addTextModulesData(@NonNull Collection<TextModuleData> collection) {
            this.zzb.zzl(collection);
            return this;
        }

        @NonNull
        public GiftCardWalletObject build() {
            C0875q.b(!TextUtils.isEmpty(GiftCardWalletObject.this.zzb), "Card number is required.");
            com.google.android.gms.wallet.wobs.zzb zzbVar = this.zzb;
            GiftCardWalletObject giftCardWalletObject = GiftCardWalletObject.this;
            giftCardWalletObject.zza = zzbVar.zzz();
            C0875q.b(!TextUtils.isEmpty(r0.zzm()), "Card name is required.");
            C0875q.b(!TextUtils.isEmpty(GiftCardWalletObject.this.zza.zzl()), "Card issuer name is required.");
            return GiftCardWalletObject.this;
        }

        @NonNull
        public Builder setBalanceCurrencyCode(@NonNull String str) {
            GiftCardWalletObject.this.zzf = str;
            return this;
        }

        @NonNull
        public Builder setBalanceMicros(long j) {
            GiftCardWalletObject.this.zze = j;
            return this;
        }

        @NonNull
        public Builder setBalanceUpdateTime(long j) {
            GiftCardWalletObject.this.zzg = j;
            return this;
        }

        @NonNull
        public Builder setBarcodeAlternateText(@NonNull String str) {
            this.zzb.zzm(str);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setBarcodeLabel(@NonNull String str) {
            this.zzb.zzn(str);
            return this;
        }

        @NonNull
        public Builder setBarcodeType(@NonNull String str) {
            this.zzb.zzo(str);
            return this;
        }

        @NonNull
        public Builder setBarcodeValue(@NonNull String str) {
            this.zzb.zzp(str);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setCardIdentifier(@NonNull String str) {
            GiftCardWalletObject.this.zzd = str;
            return this;
        }

        @NonNull
        public Builder setCardNumber(@NonNull String str) {
            GiftCardWalletObject.this.zzb = str;
            return this;
        }

        @NonNull
        public Builder setClassId(@NonNull String str) {
            this.zzb.zzq(str);
            return this;
        }

        @NonNull
        public Builder setEventNumber(@NonNull String str) {
            GiftCardWalletObject.this.zzh = str;
            return this;
        }

        @NonNull
        public Builder setId(@NonNull String str) {
            this.zzb.zzr(str);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setInfoModuleDataHexBackgroundColor(@NonNull String str) {
            this.zzb.zzs(str);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setInfoModuleDataHexFontColor(@NonNull String str) {
            this.zzb.zzt(str);
            return this;
        }

        @NonNull
        public Builder setInfoModuleDataShowLastUpdateTime(boolean z) {
            this.zzb.zzu(z);
            return this;
        }

        @NonNull
        public Builder setIssuerName(@NonNull String str) {
            this.zzb.zzv(str);
            return this;
        }

        @NonNull
        public Builder setPin(@NonNull String str) {
            GiftCardWalletObject.this.zzc = str;
            return this;
        }

        @NonNull
        public Builder setState(int i) {
            this.zzb.zzx(i);
            return this;
        }

        @NonNull
        public Builder setTitle(@NonNull String str) {
            this.zzb.zzw(str);
            return this;
        }

        @NonNull
        public Builder setValidTimeInterval(@NonNull TimeInterval timeInterval) {
            this.zzb.zzy(timeInterval);
            return this;
        }
    }

    public GiftCardWalletObject() {
        this.zza = CommonWalletObject.zzb().zzz();
    }

    @NonNull
    public static Builder newBuilder() {
        return new GiftCardWalletObject().new Builder(null);
    }

    @NonNull
    public String getBalanceCurrencyCode() {
        return this.zzf;
    }

    public long getBalanceMicros() {
        return this.zze;
    }

    public long getBalanceUpdateTime() {
        return this.zzg;
    }

    @NonNull
    public String getBarcodeAlternateText() {
        return this.zza.zzd();
    }

    @NonNull
    @Deprecated
    public String getBarcodeLabel() {
        return this.zza.zze();
    }

    @NonNull
    public String getBarcodeType() {
        return this.zza.zzf();
    }

    @NonNull
    public String getBarcodeValue() {
        return this.zza.zzg();
    }

    @NonNull
    @Deprecated
    public String getCardIdentifier() {
        return this.zzd;
    }

    @NonNull
    public String getCardNumber() {
        return this.zzb;
    }

    @NonNull
    public String getClassId() {
        return this.zza.zzh();
    }

    @NonNull
    public String getEventNumber() {
        return this.zzh;
    }

    @NonNull
    public String getId() {
        return this.zza.zzi();
    }

    @NonNull
    public ArrayList<UriData> getImageModuleDataMainImageUris() {
        return this.zza.zzn();
    }

    @NonNull
    @Deprecated
    public String getInfoModuleDataHexBackgroundColor() {
        return this.zza.zzj();
    }

    @NonNull
    @Deprecated
    public String getInfoModuleDataHexFontColor() {
        return this.zza.zzk();
    }

    @NonNull
    public ArrayList<LabelValueRow> getInfoModuleDataLabelValueRows() {
        return this.zza.zzo();
    }

    public boolean getInfoModuleDataShowLastUpdateTime() {
        return this.zza.zzt();
    }

    @NonNull
    public String getIssuerName() {
        return this.zza.zzl();
    }

    @NonNull
    public ArrayList<UriData> getLinksModuleDataUris() {
        return this.zza.zzp();
    }

    @NonNull
    public ArrayList<LatLng> getLocations() {
        return this.zza.zzq();
    }

    @NonNull
    public ArrayList<WalletObjectMessage> getMessages() {
        return this.zza.zzr();
    }

    @NonNull
    public String getPin() {
        return this.zzc;
    }

    public int getState() {
        return this.zza.zza();
    }

    @NonNull
    public ArrayList<TextModuleData> getTextModulesData() {
        return this.zza.zzs();
    }

    @NonNull
    public String getTitle() {
        return this.zza.zzm();
    }

    @NonNull
    public TimeInterval getValidTimeInterval() {
        return this.zza.zzc();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.k(parcel, 2, this.zza, i, false);
        c.l(parcel, 3, this.zzb, false);
        c.l(parcel, 4, this.zzc, false);
        c.l(parcel, 5, this.zzd, false);
        long j = this.zze;
        c.s(parcel, 6, 8);
        parcel.writeLong(j);
        c.l(parcel, 7, this.zzf, false);
        long j2 = this.zzg;
        c.s(parcel, 8, 8);
        parcel.writeLong(j2);
        c.l(parcel, 9, this.zzh, false);
        c.r(parcel, q);
    }

    public GiftCardWalletObject(CommonWalletObject commonWalletObject, String str, String str2, String str3, long j, String str4, long j2, String str5) {
        CommonWalletObject.zzb();
        this.zza = commonWalletObject;
        this.zzb = str;
        this.zzc = str2;
        this.zze = j;
        this.zzf = str4;
        this.zzg = j2;
        this.zzh = str5;
        this.zzd = str3;
    }
}
