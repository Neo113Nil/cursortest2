package androidx.compose.runtime.livedata;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a5\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0000*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0007"}, d2 = {"T", "Landroidx/lifecycle/LiveData;", "Landroidx/compose/runtime/State;", "observeAsState", "(Landroidx/lifecycle/LiveData;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "initial", "(Landroidx/lifecycle/LiveData;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LiveDataAdapterKt {
    public static final <T> androidx.compose.runtime.State<T> observeAsState(androidx.view.LiveData<T> liveData, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2027206144, i, -1, "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:39)");
        }
        androidx.compose.runtime.State<T> observeAsState = observeAsState(liveData, liveData.getValue(), composer, i & 14);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return observeAsState;
    }

    public static final <R, T extends R> androidx.compose.runtime.State<R> observeAsState(final androidx.view.LiveData<T> liveData, R r, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(411178300, i, -1, "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:56)");
        }
        final androidx.view.LifecycleOwner lifecycleOwner = (androidx.view.LifecycleOwner) composer.consume(androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            if (liveData.isInitialized()) {
                r = liveData.getValue();
            }
            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
        boolean changedInstance = composer.changedInstance(liveData);
        boolean changedInstance2 = composer.changedInstance(lifecycleOwner);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changedInstance | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.livedata.LiveDataAdapterKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.runtime.livedata.LiveDataAdapterKt.m5437$r8$lambda$c28suIfyj5tgnWkIQfGgMg5ens(androidx.view.LiveData.this, lifecycleOwner, mutableState, (androidx.compose.runtime.DisposableEffectScope) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.EffectsKt.DisposableEffect(liveData, lifecycleOwner, (kotlin.jvm.functions.Function1) rememberedValue2, composer, i & 14);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    /* renamed from: $r8$lambda$c-28suIfyj5tgnWkIQfGgMg5ens, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult m5437$r8$lambda$c28suIfyj5tgnWkIQfGgMg5ens(final androidx.view.LiveData liveData, androidx.view.LifecycleOwner lifecycleOwner, final androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        final androidx.view.Observer observer = new androidx.view.Observer() { // from class: androidx.compose.runtime.livedata.LiveDataAdapterKt$$ExternalSyntheticLambda0
            @Override // androidx.view.Observer
            public final void onChanged(java.lang.Object obj) {
                androidx.compose.runtime.MutableState.this.setValue(obj);
            }
        };
        liveData.observe(lifecycleOwner, observer);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.runtime.livedata.LiveDataAdapterKt$observeAsState$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.view.LiveData.this.removeObserver(observer);
            }
        };
    }
}
