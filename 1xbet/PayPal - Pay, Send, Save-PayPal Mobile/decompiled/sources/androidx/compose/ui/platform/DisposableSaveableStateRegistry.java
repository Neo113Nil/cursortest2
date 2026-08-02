package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00140\u0013H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "saveableStateRegistry", "Lkotlin/Function0;", "", "onDispose", "<init>", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry;Lkotlin/jvm/functions/Function0;)V", "dispose", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "canBeSaved", "(Ljava/lang/Object;)Z", "", "key", "consumeRestored", "(Ljava/lang/String;)Ljava/lang/Object;", "", "", "performSave", "()Ljava/util/Map;", "valueProvider", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "registerProvider", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DisposableSaveableStateRegistry implements androidx.compose.runtime.saveable.SaveableStateRegistry {
    public static final int $stable = 8;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    private final /* synthetic */ androidx.compose.runtime.saveable.SaveableStateRegistry getHighSpeedVideoSizes;

    public DisposableSaveableStateRegistry(androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.getHighSpeedVideoSizes = saveableStateRegistry;
        this.Camera2StreamConfigurationMap = function0;
    }

    public final void dispose() {
        this.Camera2StreamConfigurationMap.invoke();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final androidx.compose.runtime.saveable.SaveableStateRegistry.Entry registerProvider(java.lang.String key, kotlin.jvm.functions.Function0<? extends java.lang.Object> valueProvider) {
        return this.getHighSpeedVideoSizes.registerProvider(key, valueProvider);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final java.util.Map<java.lang.String, java.util.List<java.lang.Object>> performSave() {
        return this.getHighSpeedVideoSizes.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final java.lang.Object consumeRestored(java.lang.String key) {
        return this.getHighSpeedVideoSizes.consumeRestored(key);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final boolean canBeSaved(java.lang.Object value) {
        return this.getHighSpeedVideoSizes.canBeSaved(value);
    }
}
