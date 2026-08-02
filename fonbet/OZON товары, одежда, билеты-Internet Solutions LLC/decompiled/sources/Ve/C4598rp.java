package Ve;

import Ae.C2399j;
import Ae.C2408n0;
import c8.C5762a;
import com.google.crypto.tink.internal.AbstractC5887f;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

/* renamed from: Ve.rp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C4598rp implements AbstractC5887f.a {
    public static int a(AtomAction atomAction, int i11, int i12) {
        return (atomAction.hashCode() + i11) * i12;
    }

    public static Object b(Retrofit retrofit, String str, Class cls, String str2) {
        Intrinsics.checkNotNullParameter(retrofit, str);
        Object create = retrofit.create(cls);
        Intrinsics.checkNotNullExpressionValue(create, str2);
        return create;
    }

    public static String c(int i11, String str, String str2) {
        return str + str2 + i11;
    }

    public static void e(int i11, HashMap hashMap, String str, int i12, String str2) {
        hashMap.put(str, Integer.valueOf(i11));
        hashMap.put(str2, Integer.valueOf(i12));
    }

    public static void f(ComposerReferences composerReferences, C2408n0 c2408n0) {
        C2399j.C(c2408n0, androidx.lifecycle.K.a(composerReferences.getContainer().g()));
    }

    @Override // com.google.crypto.tink.internal.AbstractC5887f.a
    public He.g d(com.google.crypto.tink.internal.F f7, S7.r rVar) {
        return C5762a.c(f7, rVar);
    }
}
