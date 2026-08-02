package Hj;

import He.g;
import Q6.i;
import S7.r;
import android.graphics.Outline;
import android.view.View;
import com.google.crypto.tink.internal.AbstractC5889h;
import com.google.crypto.tink.internal.C5891j;
import com.google.crypto.tink.internal.F;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import io.sentry.InterfaceC7217w1;
import io.sentry.U;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import n8.InterfaceC8452b;
import n8.e;
import n8.f;

/* renamed from: Hj.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C3143a implements AbstractC5889h.a, InterfaceC7217w1, f, e {
    public static float d(float f7, float f11, float f12, float f13) {
        return ((f7 - f11) * f12) + f13;
    }

    public static int f(View view, String str, Outline outline, String str2) {
        Intrinsics.checkNotNullParameter(view, str);
        Intrinsics.checkNotNullParameter(outline, str2);
        return view.getWidth();
    }

    public static String g(String str, String str2, String str3) {
        return new Regex(str).replace(str2, str3);
    }

    public static String h(StringBuilder sb2, List list, String str, Map map, String str2) {
        sb2.append(list);
        sb2.append(str);
        sb2.append(map);
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // n8.e
    public Object a(InterfaceC8452b interfaceC8452b) {
        i lambda$getComponents$2;
        lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(interfaceC8452b);
        return lambda$getComponents$2;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5889h.a
    public F b(g gVar, r rVar) {
        return ((C5891j) gVar).f(rVar);
    }

    @Override // n8.f
    public List c(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // io.sentry.InterfaceC7217w1
    public void e(U u11) {
        u11.K(new Fr.f(u11));
    }
}
