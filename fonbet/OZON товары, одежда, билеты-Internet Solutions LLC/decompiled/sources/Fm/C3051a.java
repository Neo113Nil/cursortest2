package Fm;

import mg.h;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.price.PriceDTO;

/* renamed from: Fm.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C3051a {
    public static int a(Price price, int i11, int i12) {
        return (price.hashCode() + i11) * i12;
    }

    public static int b(PriceDTO priceDTO, int i11, int i12) {
        return (priceDTO.hashCode() + i11) * i12;
    }

    public static String c(String str, h hVar) {
        return str + hVar;
    }

    public static String d(StringBuilder sb2, Long l11, String str) {
        sb2.append(l11);
        sb2.append(str);
        return sb2.toString();
    }
}
