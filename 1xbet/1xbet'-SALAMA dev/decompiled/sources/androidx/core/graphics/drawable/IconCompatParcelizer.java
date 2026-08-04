package androidx.core.graphics.drawable;

import Q0.b;
import Q0.c;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f9056a = bVar.f(iconCompat.f9056a, 1);
        byte[] bArr = iconCompat.f9058c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f5751e;
            int i7 = parcel.readInt();
            if (i7 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i7];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f9058c = bArr;
        iconCompat.f9059d = bVar.g(iconCompat.f9059d, 3);
        iconCompat.f9060e = bVar.f(iconCompat.f9060e, 4);
        iconCompat.f9061f = bVar.f(iconCompat.f9061f, 5);
        iconCompat.f9062g = (ColorStateList) bVar.g(iconCompat.f9062g, 6);
        String string = iconCompat.f9064i;
        if (bVar.e(7)) {
            string = ((c) bVar).f5751e.readString();
        }
        iconCompat.f9064i = string;
        String string2 = iconCompat.j;
        if (bVar.e(8)) {
            string2 = ((c) bVar).f5751e.readString();
        }
        iconCompat.j = string2;
        iconCompat.f9063h = PorterDuff.Mode.valueOf(iconCompat.f9064i);
        switch (iconCompat.f9056a) {
            case -1:
                Parcelable parcelable = iconCompat.f9059d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f9057b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f9059d;
                if (parcelable2 != null) {
                    iconCompat.f9057b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f9058c;
                    iconCompat.f9057b = bArr3;
                    iconCompat.f9056a = 3;
                    iconCompat.f9060e = 0;
                    iconCompat.f9061f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f9058c, Charset.forName("UTF-16"));
                iconCompat.f9057b = str;
                if (iconCompat.f9056a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f9057b = iconCompat.f9058c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f9064i = iconCompat.f9063h.name();
        switch (iconCompat.f9056a) {
            case -1:
                iconCompat.f9059d = (Parcelable) iconCompat.f9057b;
                break;
            case 1:
            case 5:
                iconCompat.f9059d = (Parcelable) iconCompat.f9057b;
                break;
            case 2:
                iconCompat.f9058c = ((String) iconCompat.f9057b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f9058c = (byte[]) iconCompat.f9057b;
                break;
            case 4:
            case 6:
                iconCompat.f9058c = iconCompat.f9057b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i7 = iconCompat.f9056a;
        if (-1 != i7) {
            bVar.j(i7, 1);
        }
        byte[] bArr = iconCompat.f9058c;
        if (bArr != null) {
            bVar.i(2);
            int length = bArr.length;
            Parcel parcel = ((c) bVar).f5751e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f9059d;
        if (parcelable != null) {
            bVar.k(parcelable, 3);
        }
        int i8 = iconCompat.f9060e;
        if (i8 != 0) {
            bVar.j(i8, 4);
        }
        int i9 = iconCompat.f9061f;
        if (i9 != 0) {
            bVar.j(i9, 5);
        }
        ColorStateList colorStateList = iconCompat.f9062g;
        if (colorStateList != null) {
            bVar.k(colorStateList, 6);
        }
        String str = iconCompat.f9064i;
        if (str != null) {
            bVar.i(7);
            ((c) bVar).f5751e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            bVar.i(8);
            ((c) bVar).f5751e.writeString(str2);
        }
    }
}
