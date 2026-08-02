package Cg;

import Tc.d;
import Tc.j;
import com.vk.id.tracking.tracer.TracerLibraryManifest;
import g.C6594f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Cg.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2777a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile j f4952a;

    /* renamed from: Cg.a$a, reason: collision with other inner class name */
    static final class C0118a extends AbstractC7737t implements Function1<Qg.b, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0118a f4953b = new C0118a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Qg.b bVar) {
            Qg.b it = bVar;
            Intrinsics.checkNotNullParameter(it, "it");
            String name = it.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "it.javaClass.name");
            return name;
        }
    }

    @NotNull
    public static final Qg.b a(@NotNull String libraryPackageName) throws NoSuchElementException {
        Intrinsics.checkNotNullParameter(libraryPackageName, "libraryPackageName");
        j jVar = f4952a;
        if (jVar == null) {
            j builder = new j();
            try {
                Iterator it = Arrays.asList(new TracerLibraryManifest()).iterator();
                Intrinsics.checkNotNullExpressionValue(it, "load(S::class.java, S::c…a.classLoader).iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    Intrinsics.checkNotNullExpressionValue(next, "i.next()");
                    builder.add(next);
                }
                f4952a = builder;
                Intrinsics.checkNotNullParameter(builder, "builder");
                jVar = builder.b();
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        }
        ArrayList arrayList = new ArrayList();
        Object it2 = jVar.iterator();
        while (((d.C0541d) it2).hasNext()) {
            Object next2 = ((d.e) it2).next();
            if (Intrinsics.d(((Qg.b) next2).namespace(), libraryPackageName)) {
                arrayList.add(next2);
            }
        }
        if (arrayList.size() > 1) {
            StringBuilder b11 = C6594f.b("More then one manifest found for ", libraryPackageName, ": ");
            b11.append(C7714v.V(arrayList, null, null, null, C0118a.f4953b, 31));
            throw new IllegalStateException(b11.toString().toString());
        }
        if (arrayList.size() == 1) {
            return (Qg.b) arrayList.get(0);
        }
        try {
            String str = libraryPackageName + ".TracerLibraryManifest";
            Object newInstance = Class.forName(str).newInstance();
            Intrinsics.g(newInstance, "null cannot be cast to non-null type ru.ok.tracer.manifest.TracerLiteManifest");
            Qg.b bVar = (Qg.b) newInstance;
            if (Intrinsics.d(bVar.namespace(), libraryPackageName)) {
                return bVar;
            }
            throw new IllegalStateException(("Unexpected " + str + ".namespace()").toString());
        } catch (Throwable th3) {
            NoSuchElementException noSuchElementException = new NoSuchElementException(Nk.a.b("No manifest found for ", libraryPackageName));
            noSuchElementException.initCause(th3);
            throw noSuchElementException;
        }
    }
}
