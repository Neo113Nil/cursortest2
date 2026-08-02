package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import java.nio.charset.Charset;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes8.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f42132a = aVar.n(iconCompat.f42132a, 1);
        iconCompat.f42134c = aVar.i(iconCompat.f42134c);
        iconCompat.f42135d = aVar.p(iconCompat.f42135d, 3);
        iconCompat.f42136e = aVar.n(iconCompat.f42136e, 4);
        iconCompat.f42137f = aVar.n(iconCompat.f42137f, 5);
        iconCompat.f42138g = (ColorStateList) aVar.p(iconCompat.f42138g, 6);
        iconCompat.f42140i = aVar.r(7, iconCompat.f42140i);
        iconCompat.f42141j = aVar.r(8, iconCompat.f42141j);
        iconCompat.f42139h = PorterDuff.Mode.valueOf(iconCompat.f42140i);
        switch (iconCompat.f42132a) {
            case -1:
                Parcelable parcelable = iconCompat.f42135d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f42133b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f42135d;
                if (parcelable2 != null) {
                    iconCompat.f42133b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr = iconCompat.f42134c;
                iconCompat.f42133b = bArr;
                iconCompat.f42132a = 3;
                iconCompat.f42136e = 0;
                iconCompat.f42137f = bArr.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f42134c, Charset.forName("UTF-16"));
                iconCompat.f42133b = str;
                if (iconCompat.f42132a == 2 && iconCompat.f42141j == null) {
                    iconCompat.f42141j = str.split(ProductContainerDTO.RATIO_DELIMITER, -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f42133b = iconCompat.f42134c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.getClass();
        iconCompat.f42140i = iconCompat.f42139h.name();
        switch (iconCompat.f42132a) {
            case -1:
                iconCompat.f42135d = (Parcelable) iconCompat.f42133b;
                break;
            case 1:
            case 5:
                iconCompat.f42135d = (Parcelable) iconCompat.f42133b;
                break;
            case 2:
                iconCompat.f42134c = ((String) iconCompat.f42133b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f42134c = (byte[]) iconCompat.f42133b;
                break;
            case 4:
            case 6:
                iconCompat.f42134c = iconCompat.f42133b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i11 = iconCompat.f42132a;
        if (-1 != i11) {
            aVar.C(i11, 1);
        }
        byte[] bArr = iconCompat.f42134c;
        if (bArr != null) {
            aVar.y(bArr);
        }
        Parcelable parcelable = iconCompat.f42135d;
        if (parcelable != null) {
            aVar.E(parcelable, 3);
        }
        int i12 = iconCompat.f42136e;
        if (i12 != 0) {
            aVar.C(i12, 4);
        }
        int i13 = iconCompat.f42137f;
        if (i13 != 0) {
            aVar.C(i13, 5);
        }
        ColorStateList colorStateList = iconCompat.f42138g;
        if (colorStateList != null) {
            aVar.E(colorStateList, 6);
        }
        String str = iconCompat.f42140i;
        if (str != null) {
            aVar.F(7, str);
        }
        String str2 = iconCompat.f42141j;
        if (str2 != null) {
            aVar.F(8, str2);
        }
    }
}
