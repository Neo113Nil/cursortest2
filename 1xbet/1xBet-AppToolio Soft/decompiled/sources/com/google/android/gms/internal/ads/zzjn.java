package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AdSizeParcelCreator")
@SafeParcelable.Reserved({1})
@zzadh
/* loaded from: classes.dex */
public class zzjn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjn> CREATOR = new zzjo();

    @SafeParcelable.Field(id = 3)
    public final int height;

    @SafeParcelable.Field(id = 4)
    public final int heightPixels;

    @SafeParcelable.Field(id = 6)
    public final int width;

    @SafeParcelable.Field(id = 7)
    public final int widthPixels;

    @SafeParcelable.Field(id = 2)
    public final String zzarb;

    @SafeParcelable.Field(id = 5)
    public final boolean zzarc;

    @SafeParcelable.Field(id = 8)
    public final zzjn[] zzard;

    @SafeParcelable.Field(id = 9)
    public final boolean zzare;

    @SafeParcelable.Field(id = 10)
    public final boolean zzarf;

    @SafeParcelable.Field(id = 11)
    public boolean zzarg;

    public zzjn() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public zzjn(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzjn(Context context, AdSize[] adSizeArr) {
        int height;
        int i;
        String sb;
        int i2;
        double d;
        double d2;
        AdSize adSize = adSizeArr[0];
        this.zzarc = false;
        this.zzarf = adSize.isFluid();
        if (this.zzarf) {
            this.width = AdSize.BANNER.getWidth();
            height = AdSize.BANNER.getHeight();
        } else {
            this.width = adSize.getWidth();
            height = adSize.getHeight();
        }
        this.height = height;
        boolean z = this.width == -1;
        boolean z2 = this.height == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            zzkb.zzif();
            if (zzamu.zzbi(context)) {
                zzkb.zzif();
                if (zzamu.zzbj(context)) {
                    int i3 = displayMetrics.widthPixels;
                    zzkb.zzif();
                    i2 = i3 - zzamu.zzbk(context);
                    this.widthPixels = i2;
                    d = this.widthPixels / displayMetrics.density;
                    i = (int) d;
                    d2 = i;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    if (d - d2 >= 0.01d) {
                        i++;
                    }
                }
            }
            i2 = displayMetrics.widthPixels;
            this.widthPixels = i2;
            d = this.widthPixels / displayMetrics.density;
            i = (int) d;
            d2 = i;
            Double.isNaN(d);
            Double.isNaN(d2);
            if (d - d2 >= 0.01d) {
            }
        } else {
            i = this.width;
            zzkb.zzif();
            this.widthPixels = zzamu.zza(displayMetrics, this.width);
        }
        int zzd = z2 ? zzd(displayMetrics) : this.height;
        zzkb.zzif();
        this.heightPixels = zzamu.zza(displayMetrics, zzd);
        if (z || z2) {
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append(i);
            sb2.append("x");
            sb2.append(zzd);
            sb2.append("_as");
            sb = sb2.toString();
        } else {
            sb = this.zzarf ? "320x50_mb" : adSize.toString();
        }
        this.zzarb = sb;
        if (adSizeArr.length > 1) {
            this.zzard = new zzjn[adSizeArr.length];
            for (int i4 = 0; i4 < adSizeArr.length; i4++) {
                this.zzard[i4] = new zzjn(context, adSizeArr[i4]);
            }
        } else {
            this.zzard = null;
        }
        this.zzare = false;
        this.zzarg = false;
    }

    public zzjn(zzjn zzjnVar, zzjn[] zzjnVarArr) {
        this(zzjnVar.zzarb, zzjnVar.height, zzjnVar.heightPixels, zzjnVar.zzarc, zzjnVar.width, zzjnVar.widthPixels, zzjnVarArr, zzjnVar.zzare, zzjnVar.zzarf, zzjnVar.zzarg);
    }

    @SafeParcelable.Constructor
    zzjn(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) int i3, @SafeParcelable.Param(id = 7) int i4, @SafeParcelable.Param(id = 8) zzjn[] zzjnVarArr, @SafeParcelable.Param(id = 9) boolean z2, @SafeParcelable.Param(id = 10) boolean z3, @SafeParcelable.Param(id = 11) boolean z4) {
        this.zzarb = str;
        this.height = i;
        this.heightPixels = i2;
        this.zzarc = z;
        this.width = i3;
        this.widthPixels = i4;
        this.zzard = zzjnVarArr;
        this.zzare = z2;
        this.zzarf = z3;
        this.zzarg = z4;
    }

    public static int zzb(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int zzc(DisplayMetrics displayMetrics) {
        return (int) (zzd(displayMetrics) * displayMetrics.density);
    }

    private static int zzd(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    public static zzjn zzf(Context context) {
        return new zzjn("320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
    }

    public static zzjn zzhx() {
        return new zzjn("reward_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzarb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.height);
        SafeParcelWriter.writeInt(parcel, 4, this.heightPixels);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzarc);
        SafeParcelWriter.writeInt(parcel, 6, this.width);
        SafeParcelWriter.writeInt(parcel, 7, this.widthPixels);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzard, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzare);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzarf);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzarg);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final AdSize zzhy() {
        return com.google.android.gms.ads.zzb.zza(this.width, this.height, this.zzarb);
    }
}
