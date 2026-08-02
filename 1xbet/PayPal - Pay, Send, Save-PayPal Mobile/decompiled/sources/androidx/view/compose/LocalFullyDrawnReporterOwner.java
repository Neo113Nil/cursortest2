package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00048G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/activity/compose/LocalFullyDrawnReporterOwner;", "", "<init>", "()V", "Landroidx/activity/FullyDrawnReporterOwner;", "fullyDrawnReporterOwner", "Landroidx/compose/runtime/ProvidedValue;", "provides", "(Landroidx/activity/FullyDrawnReporterOwner;)Landroidx/compose/runtime/ProvidedValue;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getHighSpeedVideoFpsRangesFor", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/activity/FullyDrawnReporterOwner;", "current"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LocalFullyDrawnReporterOwner {
    public static final int $stable = 0;
    public static final androidx.view.compose.LocalFullyDrawnReporterOwner INSTANCE = new androidx.view.compose.LocalFullyDrawnReporterOwner();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.view.FullyDrawnReporterOwner> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0() { // from class: androidx.activity.compose.LocalFullyDrawnReporterOwner$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.view.compose.LocalFullyDrawnReporterOwner.$r8$lambda$aTOGOAF76NLQQoannI7OSKsbI50();
        }
    }, 1, null);

    public static /* synthetic */ androidx.view.FullyDrawnReporterOwner $r8$lambda$aTOGOAF76NLQQoannI7OSKsbI50() {
        return null;
    }

    private LocalFullyDrawnReporterOwner() {
    }

    public final androidx.view.FullyDrawnReporterOwner getCurrent(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(540186968, i, -1, "androidx.activity.compose.LocalFullyDrawnReporterOwner.<get-current> (ReportDrawn.kt:95)");
        }
        androidx.view.FullyDrawnReporterOwner fullyDrawnReporterOwner = (androidx.view.FullyDrawnReporterOwner) composer.consume(getHighSpeedVideoFpsRangesFor);
        if (fullyDrawnReporterOwner == null) {
            composer.startReplaceGroup(-571362883);
            fullyDrawnReporterOwner = androidx.view.View.get((android.view.View) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView()));
        } else {
            composer.startReplaceGroup(-571365177);
        }
        composer.endReplaceGroup();
        if (fullyDrawnReporterOwner == null) {
            composer.startReplaceGroup(-571361040);
            java.lang.Object obj = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(obj instanceof android.content.ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof androidx.view.FullyDrawnReporterOwner) {
                    break;
                }
                obj = ((android.content.ContextWrapper) obj).getBaseContext();
            }
            fullyDrawnReporterOwner = (androidx.view.FullyDrawnReporterOwner) obj;
        } else {
            composer.startReplaceGroup(-571365101);
        }
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return fullyDrawnReporterOwner;
    }

    public final androidx.compose.runtime.ProvidedValue<androidx.view.FullyDrawnReporterOwner> provides(androidx.view.FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        return getHighSpeedVideoFpsRangesFor.provides(fullyDrawnReporterOwner);
    }
}
