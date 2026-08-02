package Db0;

import De.C2862e;
import Hb0.f;
import Sc.InterfaceC4008j;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import dc0.C6155a;
import dc0.C6176v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.antibot.callback.presentation.FullScreenAntibotActivity;
import ru.ozon.id.nativeauth.main.activity.AuthFlowActivity;
import ru.ozon.id.nativeauth.sso2.v;
import ub0.C10014b;
import xe.C10720e0;
import xe.C10727i;
import xe.f1;

/* loaded from: classes7.dex */
public final class f implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4008j<C6155a> f6305a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6176v> f6306b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10014b> f6307c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<hd0.e> f6308d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<v> f6309e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Hb0.c> f6310f;

    /* renamed from: g, reason: collision with root package name */
    private Function1<? super FullScreenAntibotActivity, Unit> f6311g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final ArrayList f6312h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C2862e f6313i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f6314j;

    /* JADX WARN: Multi-variable type inference failed */
    public f(InterfaceC4008j<C6155a> interfaceC4008j, @NotNull InterfaceC4008j<C6176v> currentUserDataInteractor, @NotNull InterfaceC4008j<C10014b> fingerprintChecker, @NotNull InterfaceC4008j<hd0.e> sso2MobileConfigInteractor, @NotNull InterfaceC4008j<v> sso2ReauthorizeHandler, @NotNull InterfaceC4008j<? extends Hb0.c> featureFlagsStore) {
        Intrinsics.checkNotNullParameter(currentUserDataInteractor, "currentUserDataInteractor");
        Intrinsics.checkNotNullParameter(fingerprintChecker, "fingerprintChecker");
        Intrinsics.checkNotNullParameter(sso2MobileConfigInteractor, "sso2MobileConfigInteractor");
        Intrinsics.checkNotNullParameter(sso2ReauthorizeHandler, "sso2ReauthorizeHandler");
        Intrinsics.checkNotNullParameter(featureFlagsStore, "featureFlagsStore");
        this.f6305a = interfaceC4008j;
        this.f6306b = currentUserDataInteractor;
        this.f6307c = fingerprintChecker;
        this.f6308d = sso2MobileConfigInteractor;
        this.f6309e = sso2ReauthorizeHandler;
        this.f6310f = featureFlagsStore;
        this.f6312h = new ArrayList();
        this.f6313i = td0.f.a();
        this.f6314j = new AtomicBoolean(false);
    }

    public final Activity d() {
        Object obj;
        AbstractC5434v.b bVar;
        AbstractC5434v lifecycle;
        ArrayList arrayList = this.f6312h;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            ComponentCallbacks2 componentCallbacks2 = (Activity) ((WeakReference) obj).get();
            if (componentCallbacks2 != null) {
                J j11 = componentCallbacks2 instanceof J ? (J) componentCallbacks2 : null;
                if (j11 == null || (lifecycle = j11.getLifecycle()) == null || (bVar = lifecycle.b()) == null) {
                    bVar = AbstractC5434v.b.STARTED;
                }
                if (bVar.a(AbstractC5434v.b.STARTED)) {
                    break;
                }
            }
        }
        WeakReference weakReference = (WeakReference) obj;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public final boolean e() {
        ArrayList arrayList = this.f6312h;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() instanceof AuthFlowActivity) {
                return true;
            }
        }
        return false;
    }

    public final void f(Function1<? super FullScreenAntibotActivity, Unit> function1) {
        this.f6311g = function1;
    }

    public final Object g(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return f1.c(5000L, new e(this, null), cVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f6314j.compareAndSet(false, true)) {
            InterfaceC4008j<Hb0.c> interfaceC4008j = this.f6310f;
            boolean booleanValue = ((Boolean) interfaceC4008j.getValue().b(f.g.f10802a)).booleanValue();
            C2862e c2862e = this.f6313i;
            if (booleanValue && this.f6306b.getValue().e()) {
                C10720e0 c10720e0 = C10720e0.f105451a;
                C10727i.c(c2862e, He.b.f10879b, null, new b(this, null), 2);
            }
            if (((Boolean) interfaceC4008j.getValue().b(f.o.f10813a)).booleanValue()) {
                C10720e0 c10720e02 = C10720e0.f105451a;
                C10727i.c(c2862e, He.b.f10879b, null, new c(this, null), 2);
            }
        }
        if (activity instanceof FullScreenAntibotActivity) {
            Function1<? super FullScreenAntibotActivity, Unit> function1 = this.f6311g;
            if (function1 != null) {
                function1.invoke(activity);
                return;
            }
            return;
        }
        ArrayList arrayList = this.f6312h;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((WeakReference) it.next()).get() == activity) {
                    return;
                }
            }
        }
        arrayList.add(new WeakReference(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ArrayList arrayList = this.f6312h;
        final d dVar = new d(activity);
        arrayList.removeIf(new Predicate() { // from class: Db0.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) Function1.this.invoke(obj)).booleanValue();
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        C6155a value;
        Intrinsics.checkNotNullParameter(activity, "activity");
        InterfaceC4008j<C6155a> interfaceC4008j = this.f6305a;
        if (interfaceC4008j == null || (value = interfaceC4008j.getValue()) == null) {
            return;
        }
        value.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        C6155a value;
        Intrinsics.checkNotNullParameter(activity, "activity");
        InterfaceC4008j<C6155a> interfaceC4008j = this.f6305a;
        if (interfaceC4008j == null || (value = interfaceC4008j.getValue()) == null) {
            return;
        }
        value.b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
