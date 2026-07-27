package androidx.core.graphics.drawable;

import Z.a;
import Z.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i3 = iconCompat.f2109a;
        if (aVar.e(1)) {
            i3 = ((b) aVar).f1764e.readInt();
        }
        iconCompat.f2109a = i3;
        byte[] bArr = iconCompat.f2111c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f1764e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f2111c = bArr;
        iconCompat.f2112d = aVar.f(iconCompat.f2112d, 3);
        int i4 = iconCompat.f2113e;
        if (aVar.e(4)) {
            i4 = ((b) aVar).f1764e.readInt();
        }
        iconCompat.f2113e = i4;
        int i5 = iconCompat.f;
        if (aVar.e(5)) {
            i5 = ((b) aVar).f1764e.readInt();
        }
        iconCompat.f = i5;
        iconCompat.f2114g = (ColorStateList) aVar.f(iconCompat.f2114g, 6);
        String str = iconCompat.f2116i;
        if (aVar.e(7)) {
            str = ((b) aVar).f1764e.readString();
        }
        iconCompat.f2116i = str;
        String str2 = iconCompat.f2117j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f1764e.readString();
        }
        iconCompat.f2117j = str2;
        iconCompat.f2115h = PorterDuff.Mode.valueOf(iconCompat.f2116i);
        switch (iconCompat.f2109a) {
            case -1:
                Parcelable parcelable = iconCompat.f2112d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f2110b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f2112d;
                if (parcelable2 != null) {
                    iconCompat.f2110b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f2111c;
                iconCompat.f2110b = bArr3;
                iconCompat.f2109a = 3;
                iconCompat.f2113e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f2111c, Charset.forName(CharEncoding.UTF_16));
                iconCompat.f2110b = str3;
                if (iconCompat.f2109a == 2 && iconCompat.f2117j == null) {
                    iconCompat.f2117j = str3.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f2110b = iconCompat.f2111c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f2116i = iconCompat.f2115h.name();
        switch (iconCompat.f2109a) {
            case -1:
                iconCompat.f2112d = (Parcelable) iconCompat.f2110b;
                break;
            case 1:
            case 5:
                iconCompat.f2112d = (Parcelable) iconCompat.f2110b;
                break;
            case 2:
                iconCompat.f2111c = ((String) iconCompat.f2110b).getBytes(Charset.forName(CharEncoding.UTF_16));
                break;
            case 3:
                iconCompat.f2111c = (byte[]) iconCompat.f2110b;
                break;
            case 4:
            case 6:
                iconCompat.f2111c = iconCompat.f2110b.toString().getBytes(Charset.forName(CharEncoding.UTF_16));
                break;
        }
        int i3 = iconCompat.f2109a;
        if (-1 != i3) {
            aVar.h(1);
            ((b) aVar).f1764e.writeInt(i3);
        }
        byte[] bArr = iconCompat.f2111c;
        if (bArr != null) {
            aVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f1764e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f2112d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f1764e.writeParcelable(parcelable, 0);
        }
        int i4 = iconCompat.f2113e;
        if (i4 != 0) {
            aVar.h(4);
            ((b) aVar).f1764e.writeInt(i4);
        }
        int i5 = iconCompat.f;
        if (i5 != 0) {
            aVar.h(5);
            ((b) aVar).f1764e.writeInt(i5);
        }
        ColorStateList colorStateList = iconCompat.f2114g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f1764e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f2116i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f1764e.writeString(str);
        }
        String str2 = iconCompat.f2117j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f1764e.writeString(str2);
        }
    }
}
