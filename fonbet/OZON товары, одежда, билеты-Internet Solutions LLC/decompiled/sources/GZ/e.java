package GZ;

import D1.InterfaceC2801g;
import S0.C3969l;
import S0.F1;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn;
import com.google.firebase.messaging.B;
import j3.t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements d, Q6.g, C3.b {
    public static int b(int i11, int i12, int i13) {
        return zzdn.zzA(i11) + i12 + i13;
    }

    public static androidx.compose.ui.e c(C3969l c3969l, androidx.compose.ui.e eVar, e.a aVar, float f7) {
        F1.b(c3969l, eVar, InterfaceC2801g.a.f());
        return a0.e(aVar, f7);
    }

    public static void d(Boolean bool, Integer num, String str, String str2, StringBuilder sb2) {
        sb2.append(bool);
        sb2.append(str);
        sb2.append(num);
        sb2.append(str2);
    }

    @Override // GZ.d
    public boolean a(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return false;
    }

    @Override // Q6.g
    public Object apply(Object obj) {
        F8.b bVar = (F8.b) obj;
        bVar.getClass();
        return B.a(bVar);
    }

    @Override // C3.b
    public void m(t tVar) {
    }
}
