package com.ironsource;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.ironsource.C4685v1;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.v1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4685v1 implements N1 {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ironsource.v1$a */
    static final class a implements LifecycleEventObserver {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC4462ia f8713a;

        /* renamed from: com.ironsource.v1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1345a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f8714a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Lifecycle.Event.ON_STOP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f8714a = iArr;
            }
        }

        public a(InterfaceC4462ia listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f8713a = listener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Lifecycle.Event event, a this$0) {
            Intrinsics.checkNotNullParameter(event, "$event");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            int i = C1345a.f8714a[event.ordinal()];
            if (i == 1) {
                this$0.f8713a.b();
                return;
            }
            if (i == 2) {
                this$0.f8713a.c();
            } else if (i == 3) {
                this$0.f8713a.d();
            } else {
                if (i != 4) {
                    return;
                }
                this$0.f8713a.a();
            }
        }

        public boolean equals(Object obj) {
            InterfaceC4462ia interfaceC4462ia = this.f8713a;
            a aVar = obj instanceof a ? (a) obj : null;
            return Intrinsics.areEqual(interfaceC4462ia, aVar != null ? aVar.f8713a : null);
        }

        public int hashCode() {
            return this.f8713a.hashCode();
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner source, final Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.v1$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C4685v1.a.a(Lifecycle.Event.this, this);
                }
            }, 0L, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC4462ia observer) {
        Intrinsics.checkNotNullParameter(observer, "$observer");
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(new a(observer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC4462ia observer) {
        Intrinsics.checkNotNullParameter(observer, "$observer");
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().removeObserver(new a(observer));
    }

    @Override // com.ironsource.N1
    public void a(final InterfaceC4462ia observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.v1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4685v1.c(InterfaceC4462ia.this);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.N1
    public void b(final InterfaceC4462ia observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.v1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4685v1.d(InterfaceC4462ia.this);
            }
        }, 0L, 2, null);
    }
}
