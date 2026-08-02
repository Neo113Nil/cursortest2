package Ep;

import He.g;
import S0.C3969l;
import T7.C4040w;
import U7.k;
import com.google.crypto.tink.internal.B;
import com.squareup.moshi.D;
import com.squareup.moshi.Moshi;
import i8.i;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.r;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import u3.InterfaceC9928b;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements B.b, r.a {
    public static int a(int i11, int i12, int i13, int i14, int i15) {
        return Math.max(((i11 * i12) / i13) + i14, i15);
    }

    public static Class b(Set set, String str, Moshi moshi, String str2, Type type) {
        Intrinsics.checkNotNullParameter(set, str);
        Intrinsics.checkNotNullParameter(moshi, str2);
        return D.c(type);
    }

    public static String c(StringBuilder sb2, Integer num, String str) {
        sb2.append(num);
        sb2.append(str);
        return sb2.toString();
    }

    public static void d(int i11, C3969l c3969l, int i12, Function2 function2) {
        c3969l.x(Integer.valueOf(i11));
        c3969l.c(Integer.valueOf(i12), function2);
    }

    public static void f(StringBuilder sb2, CommonCellSettings.LayoutPadding layoutPadding, String str, CommonCellSettings.LayoutPadding layoutPadding2, String str2) {
        sb2.append(layoutPadding);
        sb2.append(str);
        sb2.append(layoutPadding2);
        sb2.append(str2);
    }

    @Override // com.google.crypto.tink.internal.B.b
    public Object e(g gVar) {
        C4040w c4040w = (C4040w) gVar;
        return k.e() ? k.c(c4040w) : i.c(c4040w);
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }
}
