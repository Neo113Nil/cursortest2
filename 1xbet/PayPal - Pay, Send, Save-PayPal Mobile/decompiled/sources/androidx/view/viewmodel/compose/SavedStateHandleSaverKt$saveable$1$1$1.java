package androidx.view.viewmodel.compose;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class SavedStateHandleSaverKt$saveable$1$1$1 implements androidx.compose.runtime.saveable.SaverScope, kotlin.jvm.internal.FunctionAdapter {
    final /* synthetic */ androidx.view.SavedStateHandle.Companion Camera2StreamConfigurationMap;

    @Override // androidx.compose.runtime.saveable.SaverScope
    public final boolean canBeSaved(java.lang.Object obj) {
        return this.Camera2StreamConfigurationMap.validateValue(obj);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final kotlin.Function<?> getFunctionDelegate() {
        return new kotlin.jvm.internal.FunctionReferenceImpl(1, this.Camera2StreamConfigurationMap, androidx.view.SavedStateHandle.Companion.class, "validateValue", "validateValue(Ljava/lang/Object;)Z", 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof androidx.compose.runtime.saveable.SaverScope) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    SavedStateHandleSaverKt$saveable$1$1$1(androidx.view.SavedStateHandle.Companion companion) {
        this.Camera2StreamConfigurationMap = companion;
    }
}
