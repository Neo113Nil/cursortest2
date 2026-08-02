package Kk;

import He.g;
import S7.q;
import T7.U;
import U7.j;
import android.net.Uri;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.x;
import com.google.gson.internal.o;
import java.util.List;
import java.util.TreeMap;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import m1.InterfaceC8038i;
import n1.C8408a;

/* renamed from: Kk.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C3532b implements B.b, x.a, o, InterfaceC8038i {
    public static int a(int i11, int i12, boolean z11) {
        return (Boolean.hashCode(z11) + i11) * i12;
    }

    public static void b(C8408a.b bVar, long j11) {
        bVar.a().p();
        bVar.k(j11);
    }

    public static boolean g(Uri uri, String str, String str2) {
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, str);
        return Intrinsics.d(C7714v.M(pathSegments), str2);
    }

    @Override // m1.InterfaceC8038i
    public double c(double d11) {
        double d12 = d11 < 0.0d ? -d11 : d11;
        return Math.copySign(d12 >= 0.04045d ? Math.pow((0.9478672985781991d * d12) + 0.05213270142180095d, 2.4d) : d12 * 0.07739938080495357d, d11);
    }

    @Override // com.google.crypto.tink.internal.x.a
    public q d(G g10) {
        return j.a(g10);
    }

    @Override // com.google.crypto.tink.internal.B.b
    public Object e(g gVar) {
        return U7.x.c((U) gVar);
    }

    @Override // com.google.gson.internal.o
    public Object f() {
        return new TreeMap();
    }
}
