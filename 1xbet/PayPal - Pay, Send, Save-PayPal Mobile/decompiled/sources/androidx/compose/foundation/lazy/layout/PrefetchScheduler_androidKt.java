package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "rememberDefaultPrefetchScheduler", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler_androidKt$RobolectricImpl$1;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler_androidKt$RobolectricImpl$1;", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PrefetchScheduler_androidKt {
    private static final androidx.compose.foundation.lazy.layout.PrefetchScheduler_androidKt$RobolectricImpl$1 getHighSpeedVideoFpsRanges;

    public static final androidx.compose.foundation.lazy.layout.PrefetchScheduler rememberDefaultPrefetchScheduler(androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.foundation.lazy.layout.PrefetchScheduler_androidKt$RobolectricImpl$1 prefetchScheduler_androidKt$RobolectricImpl$1;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1141871251, i, -1, "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:36)");
        }
        androidx.compose.foundation.lazy.layout.PrefetchScheduler_androidKt$RobolectricImpl$1 prefetchScheduler_androidKt$RobolectricImpl$12 = getHighSpeedVideoFpsRanges;
        if (prefetchScheduler_androidKt$RobolectricImpl$12 != null) {
            composer.startReplaceGroup(1345554384);
            composer.endReplaceGroup();
            prefetchScheduler_androidKt$RobolectricImpl$1 = prefetchScheduler_androidKt$RobolectricImpl$12;
        } else {
            composer.startReplaceGroup(1345603457);
            android.view.View view = (android.view.View) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
            boolean changed = composer.changed(view);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.lang.Object tag = view.getTag(androidx.compose.foundation.R.id.compose_prefetch_scheduler);
                java.lang.Object obj = tag instanceof androidx.compose.foundation.lazy.layout.PrefetchScheduler ? (androidx.compose.foundation.lazy.layout.PrefetchScheduler) tag : null;
                if (obj == null) {
                    java.lang.Object androidPrefetchScheduler = new androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler(view);
                    view.setTag(androidx.compose.foundation.R.id.compose_prefetch_scheduler, androidPrefetchScheduler);
                    obj = (androidx.compose.foundation.lazy.layout.PrefetchScheduler) androidPrefetchScheduler;
                }
                rememberedValue = obj;
                composer.updateRememberedValue(rememberedValue);
            }
            prefetchScheduler_androidKt$RobolectricImpl$1 = (androidx.compose.foundation.lazy.layout.PrefetchScheduler) rememberedValue;
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return prefetchScheduler_androidKt$RobolectricImpl$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.foundation.lazy.layout.PrefetchScheduler_androidKt$RobolectricImpl$1] */
    static {
        androidx.compose.foundation.lazy.layout.PrefetchScheduler_androidKt$RobolectricImpl$1 prefetchScheduler_androidKt$RobolectricImpl$1;
        if (android.os.Build.FINGERPRINT != null) {
            java.lang.String lowerCase = android.os.Build.FINGERPRINT.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "robolectric")) {
                prefetchScheduler_androidKt$RobolectricImpl$1 = new androidx.compose.foundation.lazy.layout.PrefetchScheduler() { // from class: androidx.compose.foundation.lazy.layout.PrefetchScheduler_androidKt$RobolectricImpl$1
                    @Override // androidx.compose.foundation.lazy.layout.PrefetchScheduler
                    public final void schedulePrefetch(androidx.compose.foundation.lazy.layout.PrefetchRequest prefetchRequest) {
                    }
                };
                getHighSpeedVideoFpsRanges = prefetchScheduler_androidKt$RobolectricImpl$1;
            }
        }
        prefetchScheduler_androidKt$RobolectricImpl$1 = null;
        getHighSpeedVideoFpsRanges = prefetchScheduler_androidKt$RobolectricImpl$1;
    }
}
