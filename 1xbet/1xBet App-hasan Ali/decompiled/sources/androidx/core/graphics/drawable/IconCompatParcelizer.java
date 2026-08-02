package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import c2.AbstractC0536a;
import c2.C0537b;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0536a abstractC0536a) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f6958a;
        if (abstractC0536a.e(1)) {
            i = ((C0537b) abstractC0536a).f7401e.readInt();
        }
        iconCompat.f6958a = i;
        byte[] bArr = iconCompat.f6960c;
        if (abstractC0536a.e(2)) {
            Parcel parcel = ((C0537b) abstractC0536a).f7401e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f6960c = bArr;
        iconCompat.f6961d = abstractC0536a.f(iconCompat.f6961d, 3);
        int i5 = iconCompat.f6962e;
        if (abstractC0536a.e(4)) {
            i5 = ((C0537b) abstractC0536a).f7401e.readInt();
        }
        iconCompat.f6962e = i5;
        int i6 = iconCompat.f;
        if (abstractC0536a.e(5)) {
            i6 = ((C0537b) abstractC0536a).f7401e.readInt();
        }
        iconCompat.f = i6;
        iconCompat.f6963g = (ColorStateList) abstractC0536a.f(iconCompat.f6963g, 6);
        String str = iconCompat.i;
        if (abstractC0536a.e(7)) {
            str = ((C0537b) abstractC0536a).f7401e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.f6965j;
        if (abstractC0536a.e(8)) {
            str2 = ((C0537b) abstractC0536a).f7401e.readString();
        }
        iconCompat.f6965j = str2;
        iconCompat.f6964h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f6958a) {
            case -1:
                Parcelable parcelable = iconCompat.f6961d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f6959b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f6961d;
                if (parcelable2 != null) {
                    iconCompat.f6959b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f6960c;
                iconCompat.f6959b = bArr3;
                iconCompat.f6958a = 3;
                iconCompat.f6962e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f6960c, Charset.forName("UTF-16"));
                iconCompat.f6959b = str3;
                if (iconCompat.f6958a == 2 && iconCompat.f6965j == null) {
                    iconCompat.f6965j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f6959b = iconCompat.f6960c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0536a abstractC0536a) {
        abstractC0536a.getClass();
        iconCompat.i = iconCompat.f6964h.name();
        switch (iconCompat.f6958a) {
            case -1:
                iconCompat.f6961d = (Parcelable) iconCompat.f6959b;
                break;
            case 1:
            case 5:
                iconCompat.f6961d = (Parcelable) iconCompat.f6959b;
                break;
            case 2:
                iconCompat.f6960c = ((String) iconCompat.f6959b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f6960c = (byte[]) iconCompat.f6959b;
                break;
            case 4:
            case 6:
                iconCompat.f6960c = iconCompat.f6959b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f6958a;
        if (-1 != i) {
            abstractC0536a.h(1);
            ((C0537b) abstractC0536a).f7401e.writeInt(i);
        }
        byte[] bArr = iconCompat.f6960c;
        if (bArr != null) {
            abstractC0536a.h(2);
            int length = bArr.length;
            Parcel parcel = ((C0537b) abstractC0536a).f7401e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f6961d;
        if (parcelable != null) {
            abstractC0536a.h(3);
            ((C0537b) abstractC0536a).f7401e.writeParcelable(parcelable, 0);
        }
        int i5 = iconCompat.f6962e;
        if (i5 != 0) {
            abstractC0536a.h(4);
            ((C0537b) abstractC0536a).f7401e.writeInt(i5);
        }
        int i6 = iconCompat.f;
        if (i6 != 0) {
            abstractC0536a.h(5);
            ((C0537b) abstractC0536a).f7401e.writeInt(i6);
        }
        ColorStateList colorStateList = iconCompat.f6963g;
        if (colorStateList != null) {
            abstractC0536a.h(6);
            ((C0537b) abstractC0536a).f7401e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            abstractC0536a.h(7);
            ((C0537b) abstractC0536a).f7401e.writeString(str);
        }
        String str2 = iconCompat.f6965j;
        if (str2 != null) {
            abstractC0536a.h(8);
            ((C0537b) abstractC0536a).f7401e.writeString(str2);
        }
    }
}
