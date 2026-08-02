package T7;

import D1.InterfaceC2801g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import com.google.android.gms.measurement.internal.zzgk;
import com.google.crypto.tink.internal.AbstractC5887f;
import com.google.crypto.tink.internal.B;
import kotlin.jvm.functions.Function2;
import m3.r;
import u3.InterfaceC9928b;
import w2.C10411b;

/* loaded from: classes.dex */
public final /* synthetic */ class E implements B.b, AbstractC5887f.a, r.a, C10411b.c {
    public static String a(int i11, String str, String str2) {
        return str + i11 + str2;
    }

    public static String c(Object obj, String str, StringBuilder sb2) {
        sb2.append(obj);
        sb2.append(str);
        return sb2.toString();
    }

    public static Function2 f(C3969l c3969l, B1.V v11, C3969l c3969l2, A0 a02) {
        F1.b(c3969l, v11, InterfaceC2801g.a.e());
        F1.b(c3969l2, a02, InterfaceC2801g.a.g());
        return InterfaceC2801g.a.b();
    }

    public static void g(zzgk zzgkVar, String str) {
        zzgkVar.zzay().zzj().zza(str);
    }

    @Override // w2.C10411b.c
    public boolean b() {
        return false;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5887f.a
    public He.g d(com.google.crypto.tink.internal.F f7, S7.r rVar) {
        return U7.b.d(f7, rVar);
    }

    @Override // com.google.crypto.tink.internal.B.b
    public Object e(He.g gVar) {
        N n11 = (N) gVar;
        String c11 = n11.h().c();
        return U7.w.c(C.c(n11.h().b(), S7.n.a(c11).b(c11)), n11.e());
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }
}
