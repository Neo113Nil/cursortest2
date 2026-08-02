package Df0;

import Ga.a;
import Oa.c;
import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private Ga.a f6691a;

    public static Ga.a a(d dVar, Application context, String primaryDomain) {
        g cronetSettings = new g(0);
        Intrinsics.checkNotNullParameter(context, "appContext");
        Intrinsics.checkNotNullParameter(primaryDomain, "primaryDomain");
        Intrinsics.checkNotNullParameter(cronetSettings, "cronetSettings");
        Ga.a aVar = dVar.f6691a;
        if (aVar != null) {
            return aVar;
        }
        synchronized (dVar) {
            Ga.a aVar2 = dVar.f6691a;
            if (aVar2 != null) {
                return aVar2;
            }
            c apply = new c(cronetSettings, primaryDomain, context);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(apply, "apply");
            c.a aVar3 = new c.a(context);
            apply.invoke(aVar3);
            Ga.a a11 = a.b.a(aVar3.a());
            dVar.f6691a = a11;
            return a11;
        }
    }
}
