package com.ironsource;

/* renamed from: com.ironsource.x1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3356x1 implements com.ironsource.P1 {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ironsource.x1$a */
    static final class a implements androidx.lifecycle.LifecycleEventObserver {

        /* renamed from: a, reason: collision with root package name */
        private final com.ironsource.InterfaceC3097ia f6812a;

        /* renamed from: com.ironsource.x1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0170a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f6813a;

            static {
                int[] iArr = new int[androidx.lifecycle.Lifecycle.Event.values().length];
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_START.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[androidx.lifecycle.Lifecycle.Event.ON_STOP.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                f6813a = iArr;
            }
        }

        public a(com.ironsource.InterfaceC3097ia listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
            this.f6812a = listener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(androidx.lifecycle.Lifecycle.Event event, com.ironsource.C3356x1.a this$0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "$event");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            int i = com.ironsource.C3356x1.a.C0170a.f6813a[event.ordinal()];
            if (i == 1) {
                this$0.f6812a.b();
                return;
            }
            if (i == 2) {
                this$0.f6812a.c();
            } else if (i == 3) {
                this$0.f6812a.d();
            } else {
                if (i != 4) {
                    return;
                }
                this$0.f6812a.a();
            }
        }

        public boolean equals(java.lang.Object obj) {
            com.ironsource.InterfaceC3097ia interfaceC3097ia = this.f6812a;
            com.ironsource.C3356x1.a aVar = obj instanceof com.ironsource.C3356x1.a ? (com.ironsource.C3356x1.a) obj : null;
            return kotlin.jvm.internal.Intrinsics.areEqual(interfaceC3097ia, aVar != null ? aVar.f6812a : null);
        }

        public int hashCode() {
            return this.f6812a.hashCode();
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(androidx.lifecycle.LifecycleOwner source, final androidx.lifecycle.Lifecycle.Event event) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
            com.ironsource.environment.thread.IronSourceThreadManager.postMediationBackgroundTask$default(com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE, new java.lang.Runnable() { // from class: com.ironsource.x1$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.C3356x1.a.a(androidx.lifecycle.Lifecycle.Event.this, this);
                }
            }, 0L, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.ironsource.InterfaceC3097ia observer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "$observer");
        androidx.lifecycle.ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(new com.ironsource.C3356x1.a(observer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(com.ironsource.InterfaceC3097ia observer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "$observer");
        androidx.lifecycle.ProcessLifecycleOwner.INSTANCE.get().getLifecycle().removeObserver(new com.ironsource.C3356x1.a(observer));
    }

    @Override // com.ironsource.P1
    public void a(final com.ironsource.InterfaceC3097ia observer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "observer");
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        com.ironsource.environment.thread.IronSourceThreadManager.postOnUiThreadTask$default(com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE, new java.lang.Runnable() { // from class: com.ironsource.x1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3356x1.c(com.ironsource.InterfaceC3097ia.this);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.P1
    public void b(final com.ironsource.InterfaceC3097ia observer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "observer");
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        com.ironsource.environment.thread.IronSourceThreadManager.postOnUiThreadTask$default(com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE, new java.lang.Runnable() { // from class: com.ironsource.x1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3356x1.d(com.ironsource.InterfaceC3097ia.this);
            }
        }, 0L, 2, null);
    }
}
