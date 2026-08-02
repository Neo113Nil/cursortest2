package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes4.dex */
public final class InstrumentInfo extends a {
    public static final int CARD_CLASS_CREDIT = 1;
    public static final int CARD_CLASS_DEBIT = 2;
    public static final int CARD_CLASS_PREPAID = 3;
    public static final int CARD_CLASS_UNKNOWN = 0;

    @NonNull
    public static final Parcelable.Creator<InstrumentInfo> CREATOR = new zzo();
    private String zza;
    private String zzb;
    private int zzc;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CardClass {
    }

    private InstrumentInfo() {
    }

    public int getCardClass() {
        int i = this.zzc;
        if (i == 1 || i == 2 || i == 3) {
            return i;
        }
        return 0;
    }

    @NonNull
    public String getInstrumentDetails() {
        return this.zzb;
    }

    @NonNull
    public String getInstrumentType() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.l(parcel, 2, getInstrumentType(), false);
        c.l(parcel, 3, getInstrumentDetails(), false);
        int cardClass = getCardClass();
        c.s(parcel, 4, 4);
        parcel.writeInt(cardClass);
        c.r(parcel, q);
    }

    public InstrumentInfo(@NonNull String str, @NonNull String str2, int i) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
    }
}
