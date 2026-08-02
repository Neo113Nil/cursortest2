package B0;

import D1.InterfaceC2801g;
import K1.C3422b;
import Q1.D;
import S0.InterfaceC3967k;
import android.net.Uri;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.C5891j;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.r;
import ru.ozon.uni.core.UniTextStyles;
import u3.InterfaceC9928b;

/* renamed from: B0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2454a implements Q1.X, B.b, r.a {
    public static int a(int i11, int i12, int i13) {
        return (Integer.hashCode(i11) + i12) * i13;
    }

    public static Map b(String str, String str2) {
        return kotlin.collections.U.i(new Pair(str, str2));
    }

    public static Pair c(UniTextStyles uniTextStyles, String str) {
        return new Pair(str, Integer.valueOf(uniTextStyles.getResId()));
    }

    public static Function2 d(InterfaceC3967k interfaceC3967k, B1.V v11, InterfaceC3967k interfaceC3967k2, S0.A0 a02) {
        S0.F1.b(interfaceC3967k, v11, InterfaceC2801g.a.e());
        S0.F1.b(interfaceC3967k2, a02, InterfaceC2801g.a.g());
        return InterfaceC2801g.a.b();
    }

    public static void f(Integer num, String str, String str2, String str3, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(num);
        sb2.append(str3);
    }

    public static void g(String str, ArrayList arrayList) {
        arrayList.add(kotlin.text.h.z0(str).toString());
    }

    public static boolean h(Uri uri, String str, int i11) {
        return Intrinsics.d(uri.getPathSegments().get(i11), str);
    }

    @Override // com.google.crypto.tink.internal.B.b
    public Object e(He.g gVar) {
        return Z7.b.c((C5891j) gVar);
    }

    @Override // Q1.X
    public Q1.W filter(C3422b c3422b) {
        return new Q1.W(c3422b, D.a.a());
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }
}
