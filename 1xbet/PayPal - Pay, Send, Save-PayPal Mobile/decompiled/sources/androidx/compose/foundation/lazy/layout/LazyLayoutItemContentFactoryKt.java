package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a;\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "p0", "Landroidx/compose/foundation/lazy/layout/StableValue;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "p1", "", "p2", "", "p3", "", "getHighSpeedVideoSizes", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Ljava/lang/Object;ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyLayoutItemContentFactoryKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoSizes(final androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider lazyLayoutItemProvider, final java.lang.Object obj, final int i, final java.lang.Object obj2, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1439843069);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(lazyLayoutItemProvider) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changed(obj2) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1439843069, i3, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:124)");
            }
            ((androidx.compose.runtime.saveable.SaveableStateHolder) obj).SaveableStateProvider(obj2, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(980966366, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt.Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider.this, i, obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                    return Camera2StreamConfigurationMap;
                }
            }, startRestartGroup, 54), startRestartGroup, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                    ((java.lang.Integer) obj4).intValue();
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider.this, obj, i, obj2, i2, (androidx.compose.runtime.Composer) obj3);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider lazyLayoutItemProvider, int i, java.lang.Object obj, androidx.compose.runtime.Composer composer, int i2) {
        if (!composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(980966366, i2, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:126)");
            }
            lazyLayoutItemProvider.Item(i, obj, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider lazyLayoutItemProvider, java.lang.Object obj, int i, java.lang.Object obj2, int i2, androidx.compose.runtime.Composer composer) {
        getHighSpeedVideoSizes(lazyLayoutItemProvider, obj, i, obj2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }
}
