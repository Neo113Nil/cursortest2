package aZ;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.h;
import pf0.l;
import ru.ozon.app.android.abtool.AbToolBaseApi;
import ru.ozon.app.android.abtool.AbToolLibsApi;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static Ld0.c f36524a;

    public static AbToolLibsApi a() {
        Ld0.c cVar = f36524a;
        return (AbToolLibsApi) (cVar != null ? (AbToolBaseApi) cVar.d(AbToolBaseApi.class) : null);
    }

    public static l b() {
        Ld0.c cVar = f36524a;
        h hVar = cVar != null ? (h) cVar.d(h.class) : null;
        if (hVar instanceof l) {
            return (l) hVar;
        }
        return null;
    }

    public static void c(@NotNull Ld0.c store) {
        Intrinsics.checkNotNullParameter(store, "store");
        f36524a = store;
    }
}
