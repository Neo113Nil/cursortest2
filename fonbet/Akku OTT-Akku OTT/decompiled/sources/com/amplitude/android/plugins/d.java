package com.amplitude.android.plugins;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.amplitude.android.f;
import com.amplitude.android.g;
import com.amplitude.android.h;
import com.amplitude.android.m;
import com.amplitude.android.n;
import com.amplitude.android.o;
import com.amplitude.android.p;
import com.amplitude.android.q;
import com.amplitude.android.utilities.i;
import com.amplitude.android.utilities.j;
import com.amplitude.android.utilities.l;
import com.amplitude.android.utilities.m;
import com.amplitude.android.x;
import com.amplitude.core.k;
import com.amplitude.core.platform.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C1049c0;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.K;
import kotlinx.coroutines.channels.b;
import kotlinx.coroutines.channels.i;
import kotlinx.coroutines.internal.C1086c;

/* loaded from: classes3.dex */
public final class d implements Application.ActivityLifecycleCallbacks, k {
    public final com.amplitude.android.utilities.c a;
    public final k.a b;
    public PackageInfo c;
    public com.amplitude.android.a d;
    public g e;
    public n f;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public boolean k;

    @DebugMetadata(c = "com.amplitude.android.plugins.AndroidLifecyclePlugin$setup$1", f = "AndroidLifecyclePlugin.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
        public i a;
        public int b;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return d.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(K k, Continuation<? super Unit> continuation) {
            return ((a) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0034 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x003d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0032 -> B:5:0x0035). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            i aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            d dVar = d.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.b bVar = dVar.a.a;
                bVar.getClass();
                aVar = new b.a();
                this.a = aVar;
                this.b = 1;
                obj = aVar.b(this);
                if (obj == coroutine_suspended) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = this.a;
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    com.amplitude.android.utilities.a aVar2 = (com.amplitude.android.utilities.a) aVar.next();
                    Activity activity = aVar2.a.get();
                    if (activity != null) {
                        int ordinal = aVar2.b.ordinal();
                        if (ordinal == 0) {
                            Intent intent = activity.getIntent();
                            dVar.onActivityCreated(activity, intent != null ? intent.getExtras() : null);
                        } else if (ordinal == 1) {
                            dVar.onActivityStarted(activity);
                        } else if (ordinal == 2) {
                            dVar.onActivityResumed(activity);
                        } else if (ordinal == 3) {
                            dVar.onActivityPaused(activity);
                        } else if (ordinal == 4) {
                            dVar.onActivityStopped(activity);
                        } else if (ordinal == 5) {
                            dVar.onActivityDestroyed(activity);
                        }
                    }
                    this.a = aVar;
                    this.b = 1;
                    obj = aVar.b(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    public d(com.amplitude.android.utilities.c activityLifecycleObserver) {
        Intrinsics.checkNotNullParameter(activityLifecycleObserver, "activityLifecycleObserver");
        this.a = activityLifecycleObserver;
        this.b = k.a.d;
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
    }

    @Override // com.amplitude.core.platform.k
    public final void b(com.amplitude.core.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00aa, code lost:
    
        if (r2.e.contains(com.amplitude.android.p.a.a) != false) goto L23;
     */
    @Override // com.amplitude.core.platform.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(com.amplitude.core.b amplitude) {
        PackageInfo packageInfo;
        Object valueOf;
        long longVersionCode;
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        super.c(amplitude);
        C1086c c1086c = amplitude.c;
        this.d = (com.amplitude.android.a) amplitude;
        h hVar = amplitude.a;
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        g.a aVar = g.Companion;
        Set<f> autocapture = hVar.D;
        q interactionsOptions = hVar.B;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(autocapture, "autocapture");
        Intrinsics.checkNotNullParameter(interactionsOptions, "interactionsOptions");
        List createListBuilder = CollectionsKt.createListBuilder();
        if (autocapture.contains(f.i)) {
            createListBuilder.add(p.b.a);
        }
        if (autocapture.contains(f.j)) {
            if (interactionsOptions.a.a) {
                createListBuilder.add(p.c.a);
            }
            if (interactionsOptions.b.a) {
                createListBuilder.add(p.a.a);
            }
        }
        this.e = new g(autocapture.contains(f.c), autocapture.contains(f.d), autocapture.contains(f.f), autocapture.contains(f.e), CollectionsKt.build(createListBuilder));
        Context context = hVar.b;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) context;
        g gVar = this.e;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autocaptureState");
            gVar = null;
        }
        if (!gVar.e.contains(p.c.a)) {
            g gVar2 = this.e;
            if (gVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("autocaptureState");
                gVar2 = null;
            }
        }
        float f = application.getResources().getDisplayMetrics().density;
        com.amplitude.common.a i = amplitude.i();
        g gVar3 = this.e;
        if (gVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autocaptureState");
            gVar3 = null;
        }
        n nVar = new n(amplitude, i, f, gVar3);
        this.f = nVar;
        nVar.e = C1082i.c(c1086c, amplitude.d, null, new o(nVar, null), 2);
        i.c("FrustrationInteractionsDetector started - UI change collection is now active");
        g gVar4 = this.e;
        if (gVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autocaptureState");
            gVar4 = null;
        }
        if (gVar4.b) {
            try {
                packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
                Intrinsics.checkNotNull(packageInfo);
            } catch (PackageManager.NameNotFoundException unused) {
                amplitude.i().b("Cannot find package with application.packageName: " + application.getPackageName());
                packageInfo = new PackageInfo();
            }
            this.c = packageInfo;
            com.amplitude.android.a aVar2 = this.d;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
                aVar2 = null;
            }
            com.amplitude.android.utilities.i iVar = new com.amplitude.android.utilities.i(aVar2);
            PackageInfo packageInfo2 = this.c;
            if (packageInfo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("packageInfo");
                packageInfo2 = null;
            }
            Intrinsics.checkNotNullParameter(packageInfo2, "packageInfo");
            String str = packageInfo2.versionName;
            if (str == null) {
                str = "Unknown";
            }
            String str2 = str;
            if (Build.VERSION.SDK_INT >= 28) {
                longVersionCode = packageInfo2.getLongVersionCode();
                valueOf = Long.valueOf(longVersionCode);
            } else {
                valueOf = Integer.valueOf(packageInfo2.versionCode);
            }
            String obj = valueOf.toString();
            com.amplitude.core.k j = aVar2.j();
            String f2 = j.f(k.a.i);
            String f3 = j.f(k.a.j);
            if (f3 == null) {
                com.amplitude.core.b.m(aVar2, "[Amplitude] Application Installed", MapsKt.mapOf(TuplesKt.to("[Amplitude] Version", str2), TuplesKt.to("[Amplitude] Build", obj)), 4);
            } else if (!Intrinsics.areEqual(obj, f3)) {
                com.amplitude.core.b.m(aVar2, "[Amplitude] Application Updated", MapsKt.mapOf(TuplesKt.to("[Amplitude] Previous Version", f2), TuplesKt.to("[Amplitude] Previous Build", f3), TuplesKt.to("[Amplitude] Version", str2), TuplesKt.to("[Amplitude] Build", obj)), 4);
            }
            C1082i.c(aVar2.c, aVar2.f, null, new m(iVar, j, str2, obj, null), 2);
        }
        kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
        C1082i.c(c1086c, kotlinx.coroutines.internal.p.a, null, new a(null), 2);
    }

    @Override // com.amplitude.core.platform.k
    public final k.a getType() {
        return this.b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        com.amplitude.android.a aVar;
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.i.add(Integer.valueOf(activity.hashCode()));
        g gVar = this.e;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autocaptureState");
            gVar = null;
        }
        if (gVar.c) {
            com.amplitude.android.a aVar2 = this.d;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
                aVar = null;
            } else {
                aVar = aVar2;
            }
            com.amplitude.android.utilities.i iVar = new com.amplitude.android.utilities.i(aVar);
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (((Boolean) iVar.b.getValue()).booleanValue()) {
                WeakHashMap<FragmentActivity, List<com.amplitude.android.internal.fragments.a>> weakHashMap = com.amplitude.android.internal.fragments.b.a;
                j track = new j(2, aVar, com.amplitude.android.a.class, "track", "track(Ljava/lang/String;Ljava/util/Map;Lcom/amplitude/core/events/EventOptions;)Lcom/amplitude/core/Amplitude;", 8);
                com.amplitude.common.a logger = aVar.i();
                Intrinsics.checkNotNullParameter(activity, "<this>");
                Intrinsics.checkNotNullParameter(track, "track");
                Intrinsics.checkNotNullParameter(logger, "logger");
                FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
                if (fragmentActivity == null) {
                    logger.c("Activity is not a FragmentActivity");
                    return;
                }
                com.amplitude.android.internal.fragments.a aVar3 = new com.amplitude.android.internal.fragments.a(track, logger);
                fragmentActivity.getSupportFragmentManager().registerFragmentLifecycleCallbacks(aVar3, true);
                WeakHashMap<FragmentActivity, List<com.amplitude.android.internal.fragments.a>> weakHashMap2 = com.amplitude.android.internal.fragments.b.a;
                List<com.amplitude.android.internal.fragments.a> list = weakHashMap2.get(fragmentActivity);
                if (list == null) {
                    list = new ArrayList<>();
                    weakHashMap2.put(fragmentActivity, list);
                }
                list.add(aVar3);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.i.remove(Integer.valueOf(activity.hashCode()));
        g gVar = this.e;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autocaptureState");
            gVar = null;
        }
        if (gVar.c) {
            com.amplitude.android.a aVar = this.d;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
                aVar = null;
            }
            com.amplitude.android.utilities.i iVar = new com.amplitude.android.utilities.i(aVar);
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (((Boolean) iVar.b.getValue()).booleanValue()) {
                WeakHashMap<FragmentActivity, List<com.amplitude.android.internal.fragments.a>> weakHashMap = com.amplitude.android.internal.fragments.b.a;
                com.amplitude.common.a logger = aVar.i();
                Intrinsics.checkNotNullParameter(activity, "<this>");
                Intrinsics.checkNotNullParameter(logger, "logger");
                FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
                if (fragmentActivity == null) {
                    logger.c("Activity is not a FragmentActivity");
                    return;
                }
                List<com.amplitude.android.internal.fragments.a> remove = com.amplitude.android.internal.fragments.b.a.remove(fragmentActivity);
                if (remove != null) {
                    Iterator<com.amplitude.android.internal.fragments.a> it = remove.iterator();
                    while (it.hasNext()) {
                        fragmentActivity.getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(it.next());
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        g gVar = this.e;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autocaptureState");
            gVar = null;
        }
        if (gVar.e.isEmpty()) {
            return;
        }
        com.amplitude.android.a aVar = this.d;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
            aVar = null;
        }
        new com.amplitude.android.utilities.i(aVar);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        if (window == null) {
            aVar.i().b("Failed to stop user interaction event tracking: Activity window is null");
            return;
        }
        Window.Callback callback = window.getCallback();
        com.amplitude.android.internal.gestures.d dVar = callback instanceof com.amplitude.android.internal.gestures.d ? (com.amplitude.android.internal.gestures.d) callback : null;
        if (dVar != null) {
            Window.Callback callback2 = dVar.a;
            window.setCallback(callback2 instanceof com.amplitude.android.internal.gestures.f ? null : callback2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        com.amplitude.android.a aVar;
        Window.Callback dVar;
        Intrinsics.checkNotNullParameter(activity, "activity");
        g gVar = this.e;
        Unit unit = null;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autocaptureState");
            gVar = null;
        }
        if (gVar.e.isEmpty()) {
            return;
        }
        com.amplitude.android.a aVar2 = this.d;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
            aVar = null;
        } else {
            aVar = aVar2;
        }
        new com.amplitude.android.utilities.i(aVar);
        n nVar = this.f;
        g autocaptureState = this.e;
        if (autocaptureState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autocaptureState");
            autocaptureState = null;
        }
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(autocaptureState, "autocaptureState");
        Window window = activity.getWindow();
        if (window != null) {
            Window.Callback callback = window.getCallback();
            if (callback == null) {
                callback = new com.amplitude.android.internal.gestures.f();
            } else {
                Intrinsics.checkNotNull(callback);
            }
            if (nVar != null) {
                dVar = new com.amplitude.android.internal.gestures.e(callback, activity, new com.amplitude.android.utilities.k(2, aVar, com.amplitude.android.a.class, "track", "track(Ljava/lang/String;Ljava/util/Map;Lcom/amplitude/core/events/EventOptions;)Lcom/amplitude/core/Amplitude;", 8), (List) ((Function1) com.amplitude.android.internal.locators.d.a.getValue()).invoke(aVar.i()), aVar.i(), autocaptureState, nVar);
            } else {
                dVar = new com.amplitude.android.internal.gestures.d(callback, activity, new l(2, aVar, com.amplitude.android.a.class, "track", "track(Ljava/lang/String;Ljava/util/Map;Lcom/amplitude/core/events/EventOptions;)Lcom/amplitude/core/Amplitude;", 8), (List) ((Function1) com.amplitude.android.internal.locators.d.a.getValue()).invoke(aVar.i()), aVar.i(), autocaptureState);
            }
            window.setCallback(dVar);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            aVar.i().b("Failed to track user interaction event: Activity window is null");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!this.i.contains(Integer.valueOf(activity.hashCode()))) {
            onActivityCreated(activity, activity.getIntent().getExtras());
        }
        LinkedHashSet linkedHashSet = this.j;
        com.amplitude.android.a aVar = null;
        if (linkedHashSet.isEmpty()) {
            com.amplitude.android.a aVar2 = this.d;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
                aVar2 = null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            com.amplitude.core.platform.m mVar = aVar2.g;
            Intrinsics.checkNotNull(mVar, "null cannot be cast to non-null type com.amplitude.android.Timeline");
            ((x) mVar).d.c(new m.a(currentTimeMillis));
        }
        linkedHashSet.add(Integer.valueOf(activity.hashCode()));
        g gVar = this.e;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autocaptureState");
            gVar = null;
        }
        if (gVar.b && linkedHashSet.size() == 1) {
            com.amplitude.android.a aVar3 = this.d;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
                aVar3 = null;
            }
            com.amplitude.android.utilities.i iVar = new com.amplitude.android.utilities.i(aVar3);
            PackageInfo packageInfo = this.c;
            if (packageInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("packageInfo");
                packageInfo = null;
            }
            iVar.a(packageInfo, this.k);
            this.k = false;
        }
        g gVar2 = this.e;
        if (gVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autocaptureState");
            gVar2 = null;
        }
        if (gVar2.d) {
            com.amplitude.android.a aVar4 = this.d;
            if (aVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
                aVar4 = null;
            }
            new com.amplitude.android.utilities.i(aVar4).b(activity);
        }
        g gVar3 = this.e;
        if (gVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autocaptureState");
            gVar3 = null;
        }
        if (gVar3.c) {
            com.amplitude.android.a aVar5 = this.d;
            if (aVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
            } else {
                aVar = aVar5;
            }
            com.amplitude.android.utilities.i iVar2 = new com.amplitude.android.utilities.i(aVar);
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                com.amplitude.android.utilities.i.Companion.getClass();
                com.amplitude.core.b.m(aVar, "[Amplitude] Screen Viewed", MapsKt.mapOf(TuplesKt.to("[Amplitude] Screen Name", i.a.a(activity))), 4);
            } catch (Exception e) {
                iVar2.a.i().b("Failed to track screen viewed event: " + e);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Integer valueOf = Integer.valueOf(activity.hashCode());
        LinkedHashSet linkedHashSet = this.j;
        linkedHashSet.remove(valueOf);
        g gVar = this.e;
        com.amplitude.android.a aVar = null;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autocaptureState");
            gVar = null;
        }
        if (gVar.b && linkedHashSet.isEmpty()) {
            com.amplitude.android.a aVar2 = this.d;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
                aVar2 = null;
            }
            new com.amplitude.android.utilities.i(aVar2);
            com.amplitude.core.b.m(aVar2, "[Amplitude] Application Backgrounded", null, 6);
            this.k = true;
        }
        if (linkedHashSet.isEmpty()) {
            com.amplitude.android.a aVar3 = this.d;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("androidAmplitude");
            } else {
                aVar = aVar3;
            }
            long currentTimeMillis = System.currentTimeMillis();
            com.amplitude.core.platform.m mVar = aVar.g;
            Intrinsics.checkNotNull(mVar, "null cannot be cast to non-null type com.amplitude.android.Timeline");
            ((x) mVar).d.c(new m.c(currentTimeMillis));
            h hVar = aVar.a;
            Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type com.amplitude.android.Configuration");
            if (hVar.t) {
                aVar.e();
            }
        }
    }
}
