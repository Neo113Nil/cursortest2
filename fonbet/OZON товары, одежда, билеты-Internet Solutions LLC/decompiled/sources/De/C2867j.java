package De;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import xe.AbstractC10732k0;
import xe.B0;
import xe.C10760z;
import xe.Z0;
import xe.h1;

/* renamed from: De.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2867j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C2857A f6627a = new C2857A("UNDEFINED");

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C2857A f6628b = new C2857A("REUSABLE_CLAIMED");

    public static final void b(@NotNull Object obj, @NotNull kotlin.coroutines.d dVar) {
        if (!(dVar instanceof C2866i)) {
            dVar.resumeWith(obj);
            return;
        }
        C2866i c2866i = (C2866i) dVar;
        Throwable b11 = Sc.r.b(obj);
        Object c10760z = b11 == null ? obj : new C10760z(false, b11);
        xe.I i11 = c2866i.f6623d;
        kotlin.coroutines.jvm.internal.c cVar = c2866i.f6624e;
        if (i11.t(cVar.getContext())) {
            c2866i.f6625f = c10760z;
            c2866i.f105427c = 1;
            c2866i.f6623d.q(cVar.getContext(), c2866i);
            return;
        }
        AbstractC10732k0 b12 = Z0.b();
        if (b12.H0()) {
            c2866i.f6625f = c10760z;
            c2866i.f105427c = 1;
            b12.z(c2866i);
            return;
        }
        b12.E0(true);
        try {
            B0 b02 = (B0) cVar.getContext().get(B0.f105374o0);
            if (b02 == null || b02.isActive()) {
                Object obj2 = c2866i.f6626g;
                CoroutineContext context = cVar.getContext();
                Object c11 = G.c(context, obj2);
                h1<?> d11 = c11 != G.f6602a ? xe.G.d(cVar, context, c11) : null;
                try {
                    cVar.resumeWith(obj);
                    Unit unit = Unit.f71690a;
                } finally {
                    if (d11 == null || d11.z0()) {
                        G.a(context, c11);
                    }
                }
            } else {
                c2866i.resumeWith(Sc.s.a(b02.Z()));
            }
            while (b12.M0()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
