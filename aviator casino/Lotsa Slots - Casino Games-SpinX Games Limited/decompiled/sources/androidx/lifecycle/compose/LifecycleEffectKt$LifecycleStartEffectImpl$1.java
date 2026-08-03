package androidx.lifecycle.compose;

/* compiled from: LifecycleEffect.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LifecycleEffectKt$LifecycleStartEffectImpl$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult> {
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.lifecycle.compose.LifecycleStartStopEffectScope, androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult> $effects;
    final /* synthetic */ androidx.lifecycle.LifecycleOwner $lifecycleOwner;
    final /* synthetic */ androidx.lifecycle.compose.LifecycleStartStopEffectScope $scope;

    /* compiled from: LifecycleEffect.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.lifecycle.Lifecycle.Event.values().length];
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LifecycleEffectKt$LifecycleStartEffectImpl$1(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.compose.LifecycleStartStopEffectScope lifecycleStartStopEffectScope, kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleStartStopEffectScope, ? extends androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult> function1) {
        super(1);
        this.$lifecycleOwner = lifecycleOwner;
        this.$scope = lifecycleStartStopEffectScope;
        this.$effects = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        final androidx.lifecycle.compose.LifecycleStartStopEffectScope lifecycleStartStopEffectScope = this.$scope;
        final kotlin.jvm.functions.Function1<androidx.lifecycle.compose.LifecycleStartStopEffectScope, androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult> function1 = this.$effects;
        final androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver = new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$1$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$1.invoke$lambda$1(androidx.lifecycle.compose.LifecycleStartStopEffectScope.this, objectRef, function1, lifecycleOwner, event);
            }
        };
        this.$lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                androidx.lifecycle.LifecycleOwner.this.getLifecycle().removeObserver(lifecycleEventObserver);
                androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult) objectRef.element;
                if (lifecycleStopOrDisposeEffectResult != null) {
                    lifecycleStopOrDisposeEffectResult.runStopOrDisposeEffect();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public static final void invoke$lambda$1(androidx.lifecycle.compose.LifecycleStartStopEffectScope lifecycleStartStopEffectScope, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.functions.Function1 function1, androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult;
        int i = androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$1.WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i == 1) {
            objectRef.element = function1.invoke(lifecycleStartStopEffectScope);
        } else if (i == 2 && (lifecycleStopOrDisposeEffectResult = (androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult) objectRef.element) != null) {
            lifecycleStopOrDisposeEffectResult.runStopOrDisposeEffect();
        }
    }
}
