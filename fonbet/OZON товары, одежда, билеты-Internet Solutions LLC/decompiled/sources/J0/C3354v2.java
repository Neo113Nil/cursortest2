package J0;

import H8.g;
import android.content.Context;
import b8.C5581a;
import c8.C5762a;
import com.google.crypto.tink.internal.AbstractC5889h;
import com.google.crypto.tink.internal.B;
import com.google.firebase.FirebaseCommonRegistrar;
import m3.r;
import u3.InterfaceC9928b;

/* renamed from: J0.v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3354v2 implements B.b, AbstractC5889h.a, g.a, m0.E, r.a {
    public static int d(int i11, int i12, B1.m0 m0Var) {
        return (i11 - m0Var.l0()) / i12;
    }

    public static void f(String str, String str2, String str3) {
        m3.s.f(str3, str + str2);
    }

    @Override // m0.E
    public float a(float f7) {
        return f7;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5889h.a
    public com.google.crypto.tink.internal.F b(He.g gVar, S7.r rVar) {
        return C5762a.b((C5581a) gVar, rVar);
    }

    @Override // H8.g.a
    public String c(Context context) {
        return FirebaseCommonRegistrar.a(context);
    }

    @Override // com.google.crypto.tink.internal.B.b
    public Object e(He.g gVar) {
        return Y7.c.a((Y7.a) gVar);
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }
}
