package Kk;

import GZ.j;
import S7.q;
import android.content.Context;
import androidx.camera.core.impl.U0;
import androidx.camera.core.impl.V0;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.z;
import g8.h;
import h8.C6874b;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import m3.r;
import ru.ozon.app.android.pdp.utils.PDPBackgroundColorDecorator;
import ru.ozon.uni.atoms.af.AtomAction;
import u3.InterfaceC9928b;

/* loaded from: classes11.dex */
public final /* synthetic */ class c implements z.a, r.a {
    public /* synthetic */ c(InterfaceC9928b.a aVar) {
    }

    public static int a(String str, String str2) {
        return (str + str2).hashCode();
    }

    public static String c(j jVar, String str) {
        String uri = jVar.b().toString();
        Intrinsics.checkNotNullExpressionValue(uri, str);
        return uri;
    }

    public static String d(String str, String str2, String str3, List list, Map map) {
        return str + list + str2 + map + str3;
    }

    public static String e(String str, String str2, AtomAction atomAction) {
        return str + atomAction + str2;
    }

    public static StringBuilder f(String str, String str2, Integer num, Integer num2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(num);
        sb2.append(str2);
        sb2.append(num2);
        sb2.append(str3);
        return sb2;
    }

    public static List g(Context context, Context context2, String str) {
        Intrinsics.checkNotNullParameter(context, str);
        return C7714v.a0(new PDPBackgroundColorDecorator(context2));
    }

    public static void h(V0.b bVar, V0.a aVar, U0 u02, V0.b bVar2, V0.a aVar2) {
        u02.a(V0.a(bVar, aVar));
        u02.a(V0.a(bVar2, aVar2));
    }

    @Override // com.google.crypto.tink.internal.z.a
    public G b(q qVar) {
        return C6874b.d((h) qVar);
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }
}
