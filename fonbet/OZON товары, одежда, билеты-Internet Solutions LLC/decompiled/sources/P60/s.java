package P60;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final g f21925a;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.installedapps.domain.InstalledTargetAppsInteractorImpl$getInstalledAppPackages$2", f = "InstalledTargetAppsInteractorImpl.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super List<? extends String>>, Object> {
        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return s.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super List<? extends String>> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            Xc.a<P60.a> a11 = P60.a.a();
            ArrayList arrayList = new ArrayList();
            Iterator<E> it = a11.iterator();
            while (it.hasNext()) {
                String b11 = ((P60.a) it.next()).b();
                if (b11 != null) {
                    arrayList.add(b11);
                }
            }
            List H02 = C7714v.H0(s.this.f21925a.l(arrayList));
            L80.a.a("InstalledTargetAppsInteractor", "Found " + H02.size() + " target apps: " + H02);
            return H02;
        }
    }

    public s(@NotNull g installedAppsManager) {
        Intrinsics.checkNotNullParameter(installedAppsManager, "installedAppsManager");
        this.f21925a = installedAppsManager;
    }

    @Override // P60.r
    public final Object a(@NotNull kotlin.coroutines.d<? super List<String>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(He.b.f10879b, new a(null), dVar);
    }
}
