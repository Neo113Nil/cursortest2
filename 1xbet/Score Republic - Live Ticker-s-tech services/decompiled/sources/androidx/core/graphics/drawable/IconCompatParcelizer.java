package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p000.C0270h1;
import p000.jh1;
import p000.kh1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(jh1 jh1Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f488a = jh1Var.m2864f(iconCompat.f488a, 1);
        byte[] bArr = iconCompat.f490c;
        if (jh1Var.mo2863e(2)) {
            Parcel parcel = ((kh1) jh1Var).f4376e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f490c = bArr;
        iconCompat.f491d = jh1Var.m2865g(iconCompat.f491d, 3);
        iconCompat.f492e = jh1Var.m2864f(iconCompat.f492e, 4);
        iconCompat.f493f = jh1Var.m2864f(iconCompat.f493f, 5);
        iconCompat.f494g = (ColorStateList) jh1Var.m2865g(iconCompat.f494g, 6);
        String string = iconCompat.f496i;
        if (jh1Var.mo2863e(7)) {
            string = ((kh1) jh1Var).f4376e.readString();
        }
        iconCompat.f496i = string;
        String string2 = iconCompat.f497j;
        if (jh1Var.mo2863e(8)) {
            string2 = ((kh1) jh1Var).f4376e.readString();
        }
        iconCompat.f497j = string2;
        iconCompat.f495h = PorterDuff.Mode.valueOf(iconCompat.f496i);
        switch (iconCompat.f488a) {
            case -1:
                Parcelable parcelable = iconCompat.f491d;
                if (parcelable != null) {
                    iconCompat.f489b = parcelable;
                    return iconCompat;
                }
                C0270h1.m2190f("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f491d;
                if (parcelable2 != null) {
                    iconCompat.f489b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f490c;
                iconCompat.f489b = bArr3;
                iconCompat.f488a = 3;
                iconCompat.f492e = 0;
                iconCompat.f493f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f490c, Charset.forName("UTF-16"));
                iconCompat.f489b = str;
                if (iconCompat.f488a == 2 && iconCompat.f497j == null) {
                    iconCompat.f497j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f489b = iconCompat.f490c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, jh1 jh1Var) {
        jh1Var.getClass();
        iconCompat.f496i = iconCompat.f495h.name();
        switch (iconCompat.f488a) {
            case -1:
                iconCompat.f491d = (Parcelable) iconCompat.f489b;
                break;
            case 1:
            case 5:
                iconCompat.f491d = (Parcelable) iconCompat.f489b;
                break;
            case 2:
                iconCompat.f490c = ((String) iconCompat.f489b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f490c = (byte[]) iconCompat.f489b;
                break;
            case 4:
            case 6:
                iconCompat.f490c = iconCompat.f489b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f488a;
        if (-1 != i) {
            jh1Var.m2868j(i, 1);
        }
        byte[] bArr = iconCompat.f490c;
        if (bArr != null) {
            jh1Var.mo2867i(2);
            Parcel parcel = ((kh1) jh1Var).f4376e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f491d;
        if (parcelable != null) {
            jh1Var.mo2867i(3);
            ((kh1) jh1Var).f4376e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f492e;
        if (i2 != 0) {
            jh1Var.m2868j(i2, 4);
        }
        int i3 = iconCompat.f493f;
        if (i3 != 0) {
            jh1Var.m2868j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f494g;
        if (colorStateList != null) {
            jh1Var.mo2867i(6);
            ((kh1) jh1Var).f4376e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f496i;
        if (str != null) {
            jh1Var.mo2867i(7);
            ((kh1) jh1Var).f4376e.writeString(str);
        }
        String str2 = iconCompat.f497j;
        if (str2 != null) {
            jh1Var.mo2867i(8);
            ((kh1) jh1Var).f4376e.writeString(str2);
        }
    }
}
