package com.chartboost.sdk.internal.interruption;

import android.app.Application;
import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.chartboost.sdk.impl.mb;
import com.chartboost.sdk.impl.wa;
import com.chartboost.sdk.impl.x6;
import com.chartboost.sdk.impl.xa;
import com.chartboost.sdk.internal.interruption.InterruptionController;
import com.chartboost.sdk.internal.interruption.a;
import com.ironsource.U3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes4.dex */
public final class InterruptionController implements AudioManager.OnAudioFocusChangeListener {
    public static Context g;
    public static AudioManager h;
    public static AudioFocusRequest i;

    /* renamed from: a, reason: collision with root package name */
    public static final InterruptionController f5128a = new InterruptionController();
    public static final Object b = new Object();
    public static final Set c = new LinkedHashSet();
    public static final List d = new ArrayList();
    public static final List e = new ArrayList();
    public static final List f = new ArrayList();
    public static wa j = new wa(0, 1, null);
    public static final Lazy k = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.internal.interruption.InterruptionController$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return InterruptionController.j();
        }
    });

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"Lcom/chartboost/sdk/internal/interruption/InterruptionController$AppProcessLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "onStart", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", U3.i.u0, "onStop", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AppProcessLifecycleObserver implements DefaultLifecycleObserver {

        /* renamed from: a, reason: collision with root package name */
        public static final AppProcessLifecycleObserver f5129a = new AppProcessLifecycleObserver();

        private AppProcessLifecycleObserver() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            synchronized (InterruptionController.b) {
                Set set = InterruptionController.c;
                a.C0231a c0231a = com.chartboost.sdk.internal.interruption.a.b;
                if (!set.contains(c0231a.a()) && InterruptionController.c.contains(c0231a.b())) {
                    InterruptionController.f5128a.b(c0231a.b());
                }
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            InterruptionController.f5128a.b(com.chartboost.sdk.internal.interruption.a.b.a());
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            InterruptionController.f5128a.a(com.chartboost.sdk.internal.interruption.a.b.a());
        }
    }

    public static final class a extends SuspendLambda implements Function2 {
        public int b;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(AppProcessLifecycleObserver.f5129a);
            mb.c("InterruptionController initialized with ProcessLifecycleOwner.", null, 2, null);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, Continuation continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = InterruptionController.b;
            boolean z = this.c;
            synchronized (obj2) {
                CollectionsKt.removeAll(InterruptionController.e, new Function1() { // from class: com.chartboost.sdk.internal.interruption.InterruptionController$b$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return Boolean.valueOf(InterruptionController.b.a((WeakReference) obj3));
                    }
                });
                Iterator it = InterruptionController.e.iterator();
                while (it.hasNext()) {
                    x6 x6Var = (x6) ((WeakReference) it.next()).get();
                    if (x6Var != null) {
                        x6Var.b(z);
                    }
                }
                mb.c((z ? "Ducking" : "Restoring") + " ad audio volume", null, 2, null);
                unit = Unit.INSTANCE;
            }
            return unit;
        }

        public static final boolean a(WeakReference weakReference) {
            return weakReference.get() == null;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ Set c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Set set, Continuation continuation) {
            super(2, continuation);
            this.c = set;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = InterruptionController.b;
            Set set = this.c;
            synchronized (obj2) {
                CollectionsKt.removeAll(InterruptionController.d, new Function1() { // from class: com.chartboost.sdk.internal.interruption.InterruptionController$c$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return Boolean.valueOf(InterruptionController.c.a((WeakReference) obj3));
                    }
                });
                Iterator it = InterruptionController.d.iterator();
                while (it.hasNext()) {
                    xa xaVar = (xa) ((WeakReference) it.next()).get();
                    if (xaVar != null) {
                        xaVar.a(set);
                    }
                }
                unit = Unit.INSTANCE;
            }
            return unit;
        }

        public static final boolean a(WeakReference weakReference) {
            return weakReference.get() == null;
        }
    }

    public static final CoroutineScope j() {
        return CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
    }

    public final Set f() {
        Set set;
        synchronized (b) {
            set = CollectionsKt.toSet(c);
        }
        return set;
    }

    public final CoroutineScope g() {
        return (CoroutineScope) k.getValue();
    }

    public final void h() {
        BuildersKt__Builders_commonKt.launch$default(g(), null, null, new c(f(), null), 3, null);
    }

    public final int i() {
        int requestAudioFocus;
        AudioManager audioManager = h;
        if (audioManager == null) {
            mb.b("AudioManager is null, cannot request audio focus.", (Throwable) null, 2, (Object) null);
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest build = new AudioFocusRequest.Builder(j.a()).setOnAudioFocusChangeListener(f5128a).setWillPauseWhenDucked(true).build();
            i = build;
            requestAudioFocus = audioManager.requestAudioFocus(build);
        } else {
            requestAudioFocus = audioManager.requestAudioFocus(f5128a, 3, j.a());
        }
        if (requestAudioFocus == 0) {
            mb.b("Audio focus request FAILED.", (Throwable) null, 2, (Object) null);
            return requestAudioFocus;
        }
        if (requestAudioFocus == 1) {
            mb.c("Audio focus request GRANTED.", null, 2, null);
            return requestAudioFocus;
        }
        if (requestAudioFocus != 2) {
            mb.e("Audio focus request returned unknown result: " + requestAudioFocus, null, 2, null);
            return requestAudioFocus;
        }
        mb.c("Audio focus request DELAYED.", null, 2, null);
        return requestAudioFocus;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i2) {
        if (i2 == -3) {
            a(true);
            return;
        }
        if (i2 == -2 || i2 == -1) {
            a(com.chartboost.sdk.internal.interruption.a.b.b());
        } else {
            if (i2 != 1) {
                return;
            }
            a(false);
            b(com.chartboost.sdk.internal.interruption.a.b.b());
        }
    }

    public static /* synthetic */ void a(InterruptionController interruptionController, Application application, wa waVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            waVar = new wa(0, 1, null);
        }
        interruptionController.a(application, waVar);
    }

    public final void b(final xa listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (b) {
            CollectionsKt.removeAll(d, new Function1() { // from class: com.chartboost.sdk.internal.interruption.InterruptionController$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(InterruptionController.a(xa.this, (WeakReference) obj));
                }
            });
        }
    }

    public final void a(Application application, wa config) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(config, "config");
        Context applicationContext = application.getApplicationContext();
        g = applicationContext;
        j = config;
        if (applicationContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            applicationContext = null;
        }
        Object systemService = applicationContext.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager == null) {
            mb.b("Failed to get AudioManager. Audio focus handling will be disabled.", (Throwable) null, 2, (Object) null);
            audioManager = null;
        }
        h = audioManager;
        BuildersKt__Builders_commonKt.launch$default(g(), null, null, new a(null), 3, null);
    }

    public final void b(final x6 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (b) {
            CollectionsKt.removeAll(e, new Function1() { // from class: com.chartboost.sdk.internal.interruption.InterruptionController$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(InterruptionController.a(x6.this, (WeakReference) obj));
                }
            });
        }
    }

    public final void b(com.chartboost.sdk.internal.interruption.a aVar) {
        boolean remove;
        synchronized (b) {
            remove = c.remove(aVar);
            Unit unit = Unit.INSTANCE;
        }
        if (remove) {
            mb.c("Ad interruption ended: " + aVar, null, 2, null);
            h();
        }
    }

    public final void a() {
        AudioManager audioManager = h;
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest audioFocusRequest = i;
                if (audioFocusRequest != null) {
                    mb.c("Abandoning audio focus (API 26+).", null, 2, null);
                    audioManager.abandonAudioFocusRequest(audioFocusRequest);
                }
                i = null;
                return;
            }
            mb.c("Abandoning audio focus (API < 26).", null, 2, null);
            audioManager.abandonAudioFocus(f5128a);
            return;
        }
        mb.b("AudioManager is null, cannot abandon audio focus.", (Throwable) null, 2, (Object) null);
    }

    public final void b(boolean z) {
        if (z) {
            a(com.chartboost.sdk.internal.interruption.a.b.c());
        } else {
            b(com.chartboost.sdk.internal.interruption.a.b.c());
        }
    }

    public final void a(xa listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (b) {
            d.add(new WeakReference(listener));
        }
    }

    public static final boolean a(xa xaVar, WeakReference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.get() == null || it.get() == xaVar;
    }

    public final void a(x6 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (b) {
            e.add(new WeakReference(listener));
        }
    }

    public static final boolean a(x6 x6Var, WeakReference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.get() == null || it.get() == x6Var;
    }

    public final void a(com.chartboost.sdk.internal.interruption.a aVar) {
        boolean z;
        synchronized (b) {
            Set set = c;
            boolean isEmpty = set.isEmpty();
            boolean add = set.add(aVar);
            if (!isEmpty && !add) {
                z = false;
                Unit unit = Unit.INSTANCE;
            }
            z = true;
            Unit unit2 = Unit.INSTANCE;
        }
        if (z) {
            mb.c("Ad interruption began: " + aVar, null, 2, null);
            h();
        }
    }

    public final void a(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(g(), null, null, new b(z, null), 3, null);
    }
}
