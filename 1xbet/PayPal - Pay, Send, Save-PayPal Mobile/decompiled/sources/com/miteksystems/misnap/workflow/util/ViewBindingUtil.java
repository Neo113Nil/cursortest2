package com.miteksystems.misnap.workflow.util;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/miteksystems/misnap/workflow/util/ViewBindingUtil;", "", "<init>", "()V", "Landroidx/viewbinding/ViewBinding;", "T", "Landroidx/fragment/app/Fragment;", "fragment", "Lkotlin/Function1;", "Landroid/view/View;", "viewBindingFactory", "Lcom/miteksystems/misnap/workflow/util/ViewBindingUtil$FragmentViewBindingDelegate;", "viewBinding", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)Lcom/miteksystems/misnap/workflow/util/ViewBindingUtil$FragmentViewBindingDelegate;", "FragmentViewBindingDelegate"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ViewBindingUtil {
    public static final com.miteksystems.misnap.workflow.util.ViewBindingUtil INSTANCE = new com.miteksystems.misnap.workflow.util.ViewBindingUtil();

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/miteksystems/misnap/workflow/util/ViewBindingUtil$FragmentViewBindingDelegate;", "Landroidx/viewbinding/ViewBinding;", "T", "Lkotlin/properties/ReadOnlyProperty;", "Landroidx/fragment/app/Fragment;", "fragment", "Lkotlin/Function1;", "Landroid/view/View;", "viewBindingFactory", "<init>", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;", "a", "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", util.h.xy.cb.b.f1091, "Lkotlin/jvm/functions/Function1;", "getViewBindingFactory", "()Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/viewbinding/ViewBinding;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0})
    public static final class FragmentViewBindingDelegate<T extends androidx.viewbinding.ViewBinding> implements kotlin.properties.ReadOnlyProperty<androidx.fragment.app.Fragment, T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final androidx.fragment.app.Fragment fragment;

        /* renamed from: b, reason: from kotlin metadata */
        private final kotlin.jvm.functions.Function1<android.view.View, T> viewBindingFactory;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private T Camera2StreamConfigurationMap;

        /* renamed from: getValue, reason: avoid collision after fix types in other method */
        public final T getValue2(androidx.fragment.app.Fragment thisRef, kotlin.reflect.KProperty<?> property) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thisRef, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
            T t = this.Camera2StreamConfigurationMap;
            if (t != null) {
                return t;
            }
            androidx.view.Lifecycle lifecycleRegistry = this.fragment.getViewLifecycleOwner().getLifecycleRegistry();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lifecycleRegistry, "");
            if (!lifecycleRegistry.getCamera2StreamConfigurationMap().isAtLeast(androidx.lifecycle.Lifecycle.State.INITIALIZED)) {
                throw new java.lang.IllegalStateException("Should not attempt to get bindings when Fragment views are destroyed.".toString());
            }
            kotlin.jvm.functions.Function1<android.view.View, T> function1 = this.viewBindingFactory;
            android.view.View requireView = thisRef.requireView();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireView, "");
            T invoke = function1.invoke(requireView);
            this.Camera2StreamConfigurationMap = invoke;
            return invoke;
        }

        @Override // kotlin.properties.ReadOnlyProperty
        public final /* bridge */ /* synthetic */ java.lang.Object getValue(androidx.fragment.app.Fragment fragment, kotlin.reflect.KProperty kProperty) {
            return getValue2(fragment, (kotlin.reflect.KProperty<?>) kProperty);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"com/miteksystems/misnap/workflow/util/ViewBindingUtil$FragmentViewBindingDelegate$1", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleOwner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "", "onCreate", "onDestroy", "Landroidx/lifecycle/Observer;", "a", "Landroidx/lifecycle/Observer;", "getViewLifecycleOwnerLiveDataObserver", "()Landroidx/lifecycle/Observer;", "viewLifecycleOwnerLiveDataObserver", "workflow_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: com.miteksystems.misnap.workflow.util.ViewBindingUtil$FragmentViewBindingDelegate$1, reason: invalid class name */
        public static final class AnonymousClass1 implements androidx.view.DefaultLifecycleObserver {
            final /* synthetic */ com.miteksystems.misnap.workflow.util.ViewBindingUtil.FragmentViewBindingDelegate<T> getHighSpeedVideoFpsRanges;
            private final androidx.view.Observer<androidx.view.LifecycleOwner> getHighSpeedVideoFpsRangesFor;

            public static /* synthetic */ void $r8$lambda$PJyDoFn2rx2GMvAokM8n6Kvi5Rc(final com.miteksystems.misnap.workflow.util.ViewBindingUtil.FragmentViewBindingDelegate fragmentViewBindingDelegate, androidx.view.LifecycleOwner lifecycleOwner) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentViewBindingDelegate, "");
                if (lifecycleOwner != null) {
                    lifecycleOwner.getLifecycleRegistry().addObserver(new androidx.view.DefaultLifecycleObserver() { // from class: com.miteksystems.misnap.workflow.util.ViewBindingUtil$FragmentViewBindingDelegate$1$viewLifecycleOwnerLiveDataObserver$1$1
                        @Override // androidx.view.DefaultLifecycleObserver
                        public final void onDestroy(androidx.view.LifecycleOwner owner) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "");
                            ((com.miteksystems.misnap.workflow.util.ViewBindingUtil.FragmentViewBindingDelegate) fragmentViewBindingDelegate).Camera2StreamConfigurationMap = null;
                        }
                    });
                }
            }

            @Override // androidx.view.DefaultLifecycleObserver
            public final void onDestroy(androidx.view.LifecycleOwner owner) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "");
                this.getHighSpeedVideoFpsRanges.getFragment().getViewLifecycleOwnerLiveData().removeObserver(this.getHighSpeedVideoFpsRangesFor);
            }

            @Override // androidx.view.DefaultLifecycleObserver
            public final void onCreate(androidx.view.LifecycleOwner owner) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "");
                this.getHighSpeedVideoFpsRanges.getFragment().getViewLifecycleOwnerLiveData().observeForever(this.getHighSpeedVideoFpsRangesFor);
            }

            AnonymousClass1(final com.miteksystems.misnap.workflow.util.ViewBindingUtil.FragmentViewBindingDelegate<T> fragmentViewBindingDelegate) {
                this.getHighSpeedVideoFpsRanges = fragmentViewBindingDelegate;
                this.getHighSpeedVideoFpsRangesFor = new androidx.view.Observer() { // from class: com.miteksystems.misnap.workflow.util.ViewBindingUtil$FragmentViewBindingDelegate$1$$ExternalSyntheticLambda0
                    @Override // androidx.view.Observer
                    public final void onChanged(java.lang.Object obj) {
                        com.miteksystems.misnap.workflow.util.ViewBindingUtil.FragmentViewBindingDelegate.AnonymousClass1.$r8$lambda$PJyDoFn2rx2GMvAokM8n6Kvi5Rc(com.miteksystems.misnap.workflow.util.ViewBindingUtil.FragmentViewBindingDelegate.this, (androidx.view.LifecycleOwner) obj);
                    }
                };
            }
        }

        public final kotlin.jvm.functions.Function1<android.view.View, T> getViewBindingFactory() {
            return this.viewBindingFactory;
        }

        public final androidx.fragment.app.Fragment getFragment() {
            return this.fragment;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FragmentViewBindingDelegate(androidx.fragment.app.Fragment fragment, kotlin.jvm.functions.Function1<? super android.view.View, ? extends T> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            this.fragment = fragment;
            this.viewBindingFactory = function1;
            fragment.getLifecycleRegistry().addObserver(new com.miteksystems.misnap.workflow.util.ViewBindingUtil.FragmentViewBindingDelegate.AnonymousClass1(this));
        }
    }

    public final <T extends androidx.viewbinding.ViewBinding> com.miteksystems.misnap.workflow.util.ViewBindingUtil.FragmentViewBindingDelegate<T> viewBinding(androidx.fragment.app.Fragment fragment, kotlin.jvm.functions.Function1<? super android.view.View, ? extends T> viewBindingFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewBindingFactory, "");
        return new com.miteksystems.misnap.workflow.util.ViewBindingUtil.FragmentViewBindingDelegate<>(fragment, viewBindingFactory);
    }

    private ViewBindingUtil() {
    }
}
