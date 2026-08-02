package Lh;

import GZ.j;
import WZ.t;
import com.google.android.gms.internal.measurement.zzjj;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.data.common.Paddings;

/* loaded from: classes10.dex */
public final /* synthetic */ class a {
    public static int a(int i11, int i12, int i13, int i14) {
        return zzjj.zzA(i11) + i12 + i13 + i14;
    }

    public static String b(StringBuilder sb2, String str, t tVar, String str2) {
        sb2.append(str);
        sb2.append(tVar);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder c(String str, long j11, String str2, Integer num) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j11);
        sb2.append(str2);
        sb2.append(num);
        return sb2;
    }

    public static StringBuilder d(String str, String str2, String str3, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(z11);
        sb2.append(str2);
        sb2.append(z12);
        sb2.append(str3);
        return sb2;
    }

    public static void e(StringBuilder sb2, Paddings paddings, String str, Paddings paddings2, String str2) {
        sb2.append(paddings);
        sb2.append(str);
        sb2.append(paddings2);
        sb2.append(str2);
    }

    public static boolean f(j jVar, String str) {
        return Intrinsics.d(jVar.b().getAuthority(), str);
    }
}
