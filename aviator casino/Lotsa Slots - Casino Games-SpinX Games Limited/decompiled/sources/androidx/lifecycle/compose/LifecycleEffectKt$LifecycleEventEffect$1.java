package androidx.lifecycle.compose;

/* compiled from: LifecycleEffect.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LifecycleEffectKt$LifecycleEventEffect$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult> {
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function0<kotlin.Unit>> $currentOnEvent$delegate;
    final /* synthetic */ androidx.lifecycle.Lifecycle.Event $event;
    final /* synthetic */ androidx.lifecycle.LifecycleOwner $lifecycleOwner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LifecycleEffectKt$LifecycleEventEffect$1(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> state) {
        super(1);
        this.$lifecycleOwner = lifecycleOwner;
        this.$event = event;
        this.$currentOnEvent$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        final androidx.lifecycle.Lifecycle.Event event = this.$event;
        final androidx.compose.runtime.State<kotlin.jvm.functions.Function0<kotlin.Unit>> state = this.$currentOnEvent$delegate;
        final androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver = new androidx.lifecycle.LifecycleEventObserver() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleEventEffect$1$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event2) {
                androidx.lifecycle.compose.LifecycleEffectKt$LifecycleEventEffect$1.invoke$lambda$0(androidx.lifecycle.Lifecycle.Event.this, state, lifecycleOwner, event2);
            }
        };
        this.$lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        final androidx.lifecycle.LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleEventEffect$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                androidx.lifecycle.LifecycleOwner.this.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(androidx.lifecycle.Lifecycle.Event event, androidx.compose.runtime.State state, androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event2) {
        kotlin.jvm.functions.Function0 LifecycleEventEffect$lambda$0;
        if (event2 == event) {
            LifecycleEventEffect$lambda$0 = androidx.lifecycle.compose.LifecycleEffectKt.LifecycleEventEffect$lambda$0(state);
            LifecycleEventEffect$lambda$0.invoke();
        }
    }
}
