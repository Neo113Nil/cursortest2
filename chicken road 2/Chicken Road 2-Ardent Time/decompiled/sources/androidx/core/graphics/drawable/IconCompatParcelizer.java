package androidx.core.graphics.drawable;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static androidx.core.graphics.drawable.IconCompat read(U.a aVar) {
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat();
        int i2 = iconCompat.f2174a;
        if (aVar.e(1)) {
            i2 = ((U.b) aVar).f1721e.readInt();
        }
        iconCompat.f2174a = i2;
        byte[] bArr = iconCompat.f2176c;
        if (aVar.e(2)) {
            android.os.Parcel parcel = ((U.b) aVar).f1721e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f2176c = bArr;
        iconCompat.f2177d = aVar.f(iconCompat.f2177d, 3);
        int i3 = iconCompat.f2178e;
        if (aVar.e(4)) {
            i3 = ((U.b) aVar).f1721e.readInt();
        }
        iconCompat.f2178e = i3;
        int i4 = iconCompat.f2179f;
        if (aVar.e(5)) {
            i4 = ((U.b) aVar).f1721e.readInt();
        }
        iconCompat.f2179f = i4;
        iconCompat.f2180g = (android.content.res.ColorStateList) aVar.f(iconCompat.f2180g, 6);
        java.lang.String str = iconCompat.f2182i;
        if (aVar.e(7)) {
            str = ((U.b) aVar).f1721e.readString();
        }
        iconCompat.f2182i = str;
        java.lang.String str2 = iconCompat.f2183j;
        if (aVar.e(8)) {
            str2 = ((U.b) aVar).f1721e.readString();
        }
        iconCompat.f2183j = str2;
        iconCompat.f2181h = android.graphics.PorterDuff.Mode.valueOf(iconCompat.f2182i);
        switch (iconCompat.f2174a) {
            case -1:
                android.os.Parcelable parcelable = iconCompat.f2177d;
                if (parcelable == null) {
                    throw new java.lang.IllegalArgumentException("Invalid icon");
                }
                iconCompat.f2175b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                android.os.Parcelable parcelable2 = iconCompat.f2177d;
                if (parcelable2 != null) {
                    iconCompat.f2175b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f2176c;
                    iconCompat.f2175b = bArr3;
                    iconCompat.f2174a = 3;
                    iconCompat.f2178e = 0;
                    iconCompat.f2179f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                java.lang.String str3 = new java.lang.String(iconCompat.f2176c, java.nio.charset.Charset.forName("UTF-16"));
                iconCompat.f2175b = str3;
                if (iconCompat.f2174a == 2 && iconCompat.f2183j == null) {
                    iconCompat.f2183j = str3.split(io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f2175b = iconCompat.f2176c;
                return iconCompat;
        }
    }

    public static void write(androidx.core.graphics.drawable.IconCompat iconCompat, U.a aVar) {
        aVar.getClass();
        iconCompat.f2182i = iconCompat.f2181h.name();
        switch (iconCompat.f2174a) {
            case -1:
                iconCompat.f2177d = (android.os.Parcelable) iconCompat.f2175b;
                break;
            case 1:
            case 5:
                iconCompat.f2177d = (android.os.Parcelable) iconCompat.f2175b;
                break;
            case 2:
                iconCompat.f2176c = ((java.lang.String) iconCompat.f2175b).getBytes(java.nio.charset.Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f2176c = (byte[]) iconCompat.f2175b;
                break;
            case 4:
            case 6:
                iconCompat.f2176c = iconCompat.f2175b.toString().getBytes(java.nio.charset.Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f2174a;
        if (-1 != i2) {
            aVar.h(1);
            ((U.b) aVar).f1721e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f2176c;
        if (bArr != null) {
            aVar.h(2);
            int length = bArr.length;
            android.os.Parcel parcel = ((U.b) aVar).f1721e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        android.os.Parcelable parcelable = iconCompat.f2177d;
        if (parcelable != null) {
            aVar.h(3);
            ((U.b) aVar).f1721e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f2178e;
        if (i3 != 0) {
            aVar.h(4);
            ((U.b) aVar).f1721e.writeInt(i3);
        }
        int i4 = iconCompat.f2179f;
        if (i4 != 0) {
            aVar.h(5);
            ((U.b) aVar).f1721e.writeInt(i4);
        }
        android.content.res.ColorStateList colorStateList = iconCompat.f2180g;
        if (colorStateList != null) {
            aVar.h(6);
            ((U.b) aVar).f1721e.writeParcelable(colorStateList, 0);
        }
        java.lang.String str = iconCompat.f2182i;
        if (str != null) {
            aVar.h(7);
            ((U.b) aVar).f1721e.writeString(str);
        }
        java.lang.String str2 = iconCompat.f2183j;
        if (str2 != null) {
            aVar.h(8);
            ((U.b) aVar).f1721e.writeString(str2);
        }
    }
}
