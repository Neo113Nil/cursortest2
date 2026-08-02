package H20;

import Ld0.c;
import Ld0.f;
import Td0.d;
import android.app.Application;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r20.C9164a;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f10523a;

    public a(@NotNull Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10523a = context;
    }

    @NotNull
    public static List b() {
        List<f> f7;
        C9164a c9164a = C9164a.f82858a;
        c c11 = C9164a.c();
        if (c11 == null || (f7 = c11.f()) == null) {
            return K.f71697a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : f7) {
            if (obj instanceof s20.b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((s20.b) it.next()).provide());
        }
        return arrayList2;
    }

    @NotNull
    public final List<d> a() {
        Vd0.a b11;
        C9164a c9164a = C9164a.f82858a;
        Vd0.b c11 = C9164a.a().t().c();
        return (c11 == null || (b11 = c11.b()) == null) ? K.f71697a : b11.a(this.f10523a);
    }
}
