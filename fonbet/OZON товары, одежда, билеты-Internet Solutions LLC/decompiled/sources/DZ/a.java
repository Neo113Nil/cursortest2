package DZ;

import EZ.e;
import GZ.j;
import NZ.h;
import OZ.f;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a extends NZ.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ComponentCallbacksC5392m fragment, @NotNull G fragmentManager, int i11, @NotNull h config, f fVar) {
        super(fragment, fragmentManager, i11, config, fVar);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(config, "config");
    }

    @Override // NZ.a, EZ.g
    public final void navigate(@NotNull e<?> response, int i11) {
        Object obj;
        Intrinsics.checkNotNullParameter(response, "response");
        j c11 = response.c();
        Object b11 = response.b();
        if (!(b11 instanceof OZ.e) || c11 == null) {
            super.navigate(response, i11);
            return;
        }
        String uri = c11.b().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        String b12 = PZ.a.b(uri, true);
        Iterator<T> it = getPathConfig().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.text.h.e0(b12, (String) obj, false)) {
                    break;
                }
            }
        }
        String str = (String) obj;
        Integer num = str != null ? getPathConfig().get(str) : null;
        if (num != null) {
            super.navigate(response.e(OZ.e.c((OZ.e) b11, num.intValue())), i11);
            return;
        }
        OZ.e eVar = (OZ.e) b11;
        if (eVar.a() != null) {
            redirect(response.e(eVar.a()), i11);
        }
    }
}
