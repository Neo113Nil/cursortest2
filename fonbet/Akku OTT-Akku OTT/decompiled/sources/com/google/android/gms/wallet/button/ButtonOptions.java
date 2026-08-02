package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class ButtonOptions extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<ButtonOptions> CREATOR = new zzb();
    int zza;
    int zzb;
    int zzc;
    String zzd;
    boolean zze = false;

    public final class Builder {
        public /* synthetic */ Builder(zza zzaVar) {
        }

        @NonNull
        public ButtonOptions build() {
            return ButtonOptions.this;
        }

        @NonNull
        public Builder setAllowedPaymentMethods(@NonNull String str) {
            ButtonOptions.this.zzd = str;
            return this;
        }

        @NonNull
        public Builder setButtonTheme(int i) {
            ButtonOptions.this.zzb = i;
            return this;
        }

        @NonNull
        public Builder setButtonType(int i) {
            ButtonOptions.this.zza = i;
            return this;
        }

        @NonNull
        public Builder setCornerRadius(int i) {
            ButtonOptions buttonOptions = ButtonOptions.this;
            buttonOptions.zzc = i;
            buttonOptions.zze = true;
            return this;
        }
    }

    private ButtonOptions() {
    }

    @NonNull
    public static Builder newBuilder() {
        return new ButtonOptions().new Builder(null);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ButtonOptions) {
            ButtonOptions buttonOptions = (ButtonOptions) obj;
            if (C0874p.a(Integer.valueOf(this.zza), Integer.valueOf(buttonOptions.zza)) && C0874p.a(Integer.valueOf(this.zzb), Integer.valueOf(buttonOptions.zzb)) && C0874p.a(Integer.valueOf(this.zzc), Integer.valueOf(buttonOptions.zzc)) && C0874p.a(this.zzd, buttonOptions.zzd)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String getAllowedPaymentMethods() {
        return this.zzd;
    }

    public int getButtonTheme() {
        return this.zzb;
    }

    public int getButtonType() {
        return this.zza;
    }

    public int getCornerRadius() {
        return this.zzc;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        int buttonType = getButtonType();
        c.s(parcel, 1, 4);
        parcel.writeInt(buttonType);
        int buttonTheme = getButtonTheme();
        c.s(parcel, 2, 4);
        parcel.writeInt(buttonTheme);
        int cornerRadius = getCornerRadius();
        c.s(parcel, 3, 4);
        parcel.writeInt(cornerRadius);
        c.l(parcel, 4, getAllowedPaymentMethods(), false);
        c.r(parcel, q);
    }

    public ButtonOptions(int i, int i2, int i3, String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        C0875q.g(str);
        this.zzd = str;
    }
}
