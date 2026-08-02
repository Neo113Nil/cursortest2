package Cg;

import Qg.c;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Cg.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2778b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Tc.b f4954a;

    /* renamed from: Cg.b$a */
    static final class a extends AbstractC7737t implements Function1<c, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f4955b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(c cVar) {
            c it = cVar;
            Intrinsics.checkNotNullParameter(it, "it");
            String name = it.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "it.javaClass.name");
            return name;
        }
    }

    public static final c a(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Tc.b bVar = f4954a;
        if (bVar == null) {
            Tc.b builder = C7714v.B();
            try {
                Iterator it = Arrays.asList(new c[0]).iterator();
                Intrinsics.checkNotNullExpressionValue(it, "load(S::class.java, S::c…a.classLoader).iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    Intrinsics.checkNotNullExpressionValue(next, "i.next()");
                    builder.add(next);
                }
                f4954a = builder;
                Intrinsics.checkNotNullParameter(builder, "builder");
                bVar = builder.B();
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        }
        Tc.b bVar2 = bVar;
        if (bVar2.getF26995b() > 1) {
            throw new IllegalStateException(("More then one manifest found: " + C7714v.V(bVar2, null, null, null, a.f4955b, 31)).toString());
        }
        if (bVar2.getF26995b() != 1) {
            return null;
        }
        c cVar = (c) bVar2.get(0);
        if (Intrinsics.d(cVar.a(), packageName)) {
            return cVar;
        }
        throw new IllegalStateException(("Unexpected " + cVar.getClass().getName() + ".applicationId()").toString());
    }
}
