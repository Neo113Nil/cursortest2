package com.moloco.sdk.internal;

/* loaded from: classes5.dex */
public final class B implements com.moloco.sdk.internal.A, androidx.lifecycle.LifecycleOwner, androidx.savedstate.SavedStateRegistryOwner {
    public static final com.moloco.sdk.internal.B.a c = new com.moloco.sdk.internal.B.a(null);
    public static final int d = 8;
    public static final java.lang.String e = "ViewLifecycleOwner";

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.LifecycleRegistry f6927a = new androidx.lifecycle.LifecycleRegistry(this);
    public final androidx.savedstate.SavedStateRegistryController b = androidx.savedstate.SavedStateRegistryController.INSTANCE.create(this);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements android.view.View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ android.view.View f6928a;
        public final /* synthetic */ com.moloco.sdk.internal.B b;
        public final /* synthetic */ android.view.View c;

        public b(android.view.View view, com.moloco.sdk.internal.B b, android.view.View view2) {
            this.f6928a = view;
            this.b = b;
            this.c = view2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
            this.f6928a.removeOnAttachStateChangeListener(this);
            this.b.f(this.c);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
        }
    }

    @Override // com.moloco.sdk.internal.A
    public void b(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        android.view.View rootView = view.getRootView();
        if (rootView == null) {
            com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, e, "RootView is absent, skipping", null, false, 12, null);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.savedstate.ViewTreeSavedStateRegistryOwner.get(rootView), this)) {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, e, "Removing ViewTreeSavedStateRegistryOwner", null, false, 12, null);
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(rootView, null);
        }
        if (e(rootView)) {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, e, "Removing ViewTreeLifecycleOwner", null, false, 12, null);
            androidx.lifecycle.ViewTreeLifecycleOwner.set(rootView, null);
        }
    }

    @Override // com.moloco.sdk.internal.A
    public void c(android.view.View view) {
        java.lang.Object m10798constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        android.view.View rootView = view.getRootView();
        kotlin.jvm.internal.Intrinsics.checkNotNull(rootView);
        if (e(rootView)) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                this.f6927a.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_PAUSE);
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, e, "lifecycle pause success " + kotlin.Result.m10805isSuccessimpl(m10798constructorimpl), kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl), false, 8, null);
        }
    }

    @Override // com.moloco.sdk.internal.A
    public void d(android.view.View view) {
        java.lang.Object m10798constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        android.view.View rootView = view.getRootView();
        kotlin.jvm.internal.Intrinsics.checkNotNull(rootView);
        if (e(rootView)) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                this.f6927a.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_RESUME);
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            if (kotlin.Result.m10805isSuccessimpl(m10798constructorimpl)) {
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, e, "lifecycle resume success", null, false, 12, null);
            }
            java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
            if (m10801exceptionOrNullimpl != null) {
                com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, e, "lifecycle resume failure", m10801exceptionOrNullimpl, false, 8, null);
            }
        }
    }

    public final boolean e(android.view.View view) {
        return kotlin.jvm.internal.Intrinsics.areEqual(androidx.lifecycle.ViewTreeLifecycleOwner.get(view), this);
    }

    public final void f(android.view.View view) {
        android.view.View rootView = view.getRootView();
        if (rootView == null) {
            com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, e, "RootView is absent, skipping", null, false, 12, null);
            return;
        }
        if (androidx.savedstate.ViewTreeSavedStateRegistryOwner.get(rootView) == null) {
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(rootView, this);
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                this.b.performRestore(null);
                kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, e, "ViewTreeSavedStateRegistryOwner is absent, setting custom one", null, false, 12, null);
        }
        if (androidx.lifecycle.ViewTreeLifecycleOwner.get(rootView) == null) {
            androidx.lifecycle.ViewTreeLifecycleOwner.set(rootView, this);
            this.f6927a.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_CREATE);
            this.f6927a.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_START);
            this.f6927a.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_RESUME);
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, e, "ViewTreeLifecycleOwner is absent, setting custom one", null, false, 12, null);
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
        return this.f6927a;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
        return this.b.getSavedStateRegistry();
    }

    @Override // com.moloco.sdk.internal.A
    public void a(final android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        com.moloco.sdk.internal.scheduling.d.a(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.B$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.internal.B.a(view, this);
            }
        });
    }

    public static final kotlin.Unit a(android.view.View view, com.moloco.sdk.internal.B b2) {
        if (androidx.core.view.ViewCompat.isAttachedToWindow(view)) {
            b2.f(view);
        } else {
            view.addOnAttachStateChangeListener(new com.moloco.sdk.internal.B.b(view, b2, view));
        }
        return kotlin.Unit.INSTANCE;
    }
}
