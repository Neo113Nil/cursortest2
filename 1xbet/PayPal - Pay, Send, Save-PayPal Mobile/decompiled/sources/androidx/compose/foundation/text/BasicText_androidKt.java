package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\nH\u0000¢\u0006\u0004\b\u0007\u0010\u000e\u001a\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"\u001f\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u001a\u0010!\u001a\u00020\u00118AX\u0080\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"", "text", "Landroidx/compose/ui/text/TextStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "", "BackgroundTextMeasurement", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/text/AnnotatedString;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "", "textLength", "", "shouldPrefetch", "(I)Z", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Ljava/util/concurrent/Executor;", "LocalBackgroundTextMeasurementExecutor", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalBackgroundTextMeasurementExecutor", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getHighSpeedVideoFpsRanges", "Ljava/lang/Boolean;", "getHighSpeedVideoSizes", "getCoreCountSatisfactory", "()Z", "getCoreCountSatisfactory$annotations", "()V", "coreCountSatisfactory"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicText_androidKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<java.util.concurrent.Executor> LocalBackgroundTextMeasurementExecutor = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.BasicText_androidKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.compose.foundation.text.BasicText_androidKt.m2010$r8$lambda$aGtnfOuIgNmV5GuYCulnW0j6uc();
        }
    });
    private static java.lang.Boolean getHighSpeedVideoFpsRanges;

    /* renamed from: $r8$lambda$a-GtnfOuIgNmV5GuYCulnW0j6uc, reason: not valid java name */
    public static /* synthetic */ java.util.concurrent.Executor m2010$r8$lambda$aGtnfOuIgNmV5GuYCulnW0j6uc() {
        return null;
    }

    public static /* synthetic */ void getCoreCountSatisfactory$annotations() {
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<java.util.concurrent.Executor> getLocalBackgroundTextMeasurementExecutor() {
        return LocalBackgroundTextMeasurementExecutor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0053, code lost:
    
        if (r12.changed(r10) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BackgroundTextMeasurement(final java.lang.String str, final androidx.compose.ui.text.TextStyle textStyle, final androidx.compose.ui.text.font.FontFamily.Resolver resolver, androidx.compose.runtime.Composer composer, int i) {
        boolean z;
        boolean changed;
        boolean changed2;
        boolean changedInstance;
        java.lang.Object rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1589371739, i, -1, "androidx.compose.foundation.text.BackgroundTextMeasurement (BasicText.android.kt:68)");
        }
        java.util.concurrent.Executor executor = (java.util.concurrent.Executor) composer.consume(LocalBackgroundTextMeasurementExecutor);
        if (executor == null || !shouldPrefetch(str.length())) {
            composer.startReplaceGroup(1250991751);
        } else {
            composer.startReplaceGroup(1254274527);
            final androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
            final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            boolean z2 = true;
            if (((i & 112) ^ 48) > 32) {
            }
            if ((i & 48) != 32) {
                z = false;
                changed = composer.changed(layoutDirection.ordinal());
                if ((((i & 14) ^ 6) > 4 || !composer.changed(str)) && (i & 6) != 4) {
                    z2 = false;
                }
                changed2 = composer.changed(density);
                changedInstance = composer.changedInstance(resolver);
                rememberedValue = composer.rememberedValue();
                if (!(changed2 | z | changed | z2 | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    java.lang.Object obj = new java.lang.Runnable() { // from class: androidx.compose.foundation.text.BasicText_androidKt$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.compose.foundation.text.BasicText_androidKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.text.TextStyle.this, layoutDirection, str, density, resolver);
                        }
                    };
                    composer.updateRememberedValue(obj);
                    rememberedValue = obj;
                }
                executor.execute((java.lang.Runnable) rememberedValue);
            }
            z = true;
            changed = composer.changed(layoutDirection.ordinal());
            if (((i & 14) ^ 6) > 4) {
            }
            z2 = false;
            changed2 = composer.changed(density);
            changedInstance = composer.changedInstance(resolver);
            rememberedValue = composer.rememberedValue();
            if (!(changed2 | z | changed | z2 | changedInstance)) {
            }
            java.lang.Object obj2 = new java.lang.Runnable() { // from class: androidx.compose.foundation.text.BasicText_androidKt$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.compose.foundation.text.BasicText_androidKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.text.TextStyle.this, layoutDirection, str, density, resolver);
                }
            };
            composer.updateRememberedValue(obj2);
            rememberedValue = obj2;
            executor.execute((java.lang.Runnable) rememberedValue);
        }
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0053, code lost:
    
        if (r14.changed(r11) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BackgroundTextMeasurement(final androidx.compose.ui.text.AnnotatedString annotatedString, final androidx.compose.ui.text.TextStyle textStyle, final androidx.compose.ui.text.font.FontFamily.Resolver resolver, final java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list, androidx.compose.runtime.Composer composer, int i) {
        boolean z;
        boolean changed;
        boolean changedInstance;
        boolean changed2;
        boolean changedInstance2;
        java.lang.Object rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-650368117, i, -1, "androidx.compose.foundation.text.BackgroundTextMeasurement (BasicText.android.kt:102)");
        }
        java.util.concurrent.Executor executor = (java.util.concurrent.Executor) composer.consume(LocalBackgroundTextMeasurementExecutor);
        if (executor == null || !shouldPrefetch(annotatedString.length())) {
            composer.startReplaceGroup(-523310345);
        } else {
            composer.startReplaceGroup(-518761746);
            final androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
            final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            boolean z2 = true;
            if (((i & 112) ^ 48) > 32) {
            }
            if ((i & 48) != 32) {
                z = false;
                changed = composer.changed(layoutDirection.ordinal());
                changedInstance = composer.changedInstance(list);
                if ((((i & 14) ^ 6) > 4 || !composer.changed(annotatedString)) && (i & 6) != 4) {
                    z2 = false;
                }
                changed2 = composer.changed(density);
                changedInstance2 = composer.changedInstance(resolver);
                rememberedValue = composer.rememberedValue();
                if (!(changed2 | z | changed | changedInstance | z2 | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    java.lang.Object obj = new java.lang.Runnable() { // from class: androidx.compose.foundation.text.BasicText_androidKt$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.compose.foundation.text.BasicText_androidKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.text.TextStyle.this, layoutDirection, list, annotatedString, density, resolver);
                        }
                    };
                    composer.updateRememberedValue(obj);
                    rememberedValue = obj;
                }
                executor.execute((java.lang.Runnable) rememberedValue);
            }
            z = true;
            changed = composer.changed(layoutDirection.ordinal());
            changedInstance = composer.changedInstance(list);
            if (((i & 14) ^ 6) > 4) {
            }
            z2 = false;
            changed2 = composer.changed(density);
            changedInstance2 = composer.changedInstance(resolver);
            rememberedValue = composer.rememberedValue();
            if (!(changed2 | z | changed | changedInstance | z2 | changedInstance2)) {
            }
            java.lang.Object obj2 = new java.lang.Runnable() { // from class: androidx.compose.foundation.text.BasicText_androidKt$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.compose.foundation.text.BasicText_androidKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.text.TextStyle.this, layoutDirection, list, annotatedString, density, resolver);
                }
            };
            composer.updateRememberedValue(obj2);
            rememberedValue = obj2;
            executor.execute((java.lang.Runnable) rememberedValue);
        }
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    public static final boolean getCoreCountSatisfactory() {
        if (getHighSpeedVideoFpsRanges == null) {
            getHighSpeedVideoFpsRanges = java.lang.Boolean.valueOf(java.lang.Runtime.getRuntime().availableProcessors() >= 4);
        }
        java.lang.Boolean bool = getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
        return bool.booleanValue();
    }

    public static final boolean shouldPrefetch(int i) {
        return android.os.Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000 && getCoreCountSatisfactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    public static final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.unit.LayoutDirection layoutDirection, java.lang.String str, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver) {
        android.os.Trace.beginSection("BackgroundTextMeasurement");
        try {
            androidx.compose.runtime.snapshots.MutableSnapshot takeMutableSnapshot$default = androidx.compose.runtime.snapshots.Snapshot.Companion.takeMutableSnapshot$default(androidx.compose.runtime.snapshots.Snapshot.INSTANCE, null, null, 3, null);
            try {
                androidx.compose.runtime.snapshots.MutableSnapshot mutableSnapshot = takeMutableSnapshot$default;
                androidx.compose.runtime.snapshots.Snapshot makeCurrent = mutableSnapshot.makeCurrent();
                try {
                    androidx.compose.ui.text.ParagraphIntrinsicsKt.ParagraphIntrinsics$default(str, androidx.compose.ui.text.TextStyleKt.resolveDefaults(textStyle, layoutDirection), kotlin.collections.CollectionsKt.emptyList(), density, resolver, (java.util.List) null, 32, (java.lang.Object) null).getMaxIntrinsicWidth();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    takeMutableSnapshot$default.apply().check();
                    takeMutableSnapshot$default.dispose();
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                } finally {
                    mutableSnapshot.restoreCurrent(makeCurrent);
                }
            } finally {
            }
        } finally {
            android.os.Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    public static final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.text.TextStyle textStyle, androidx.compose.ui.unit.LayoutDirection layoutDirection, java.util.List list, androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver) {
        android.os.Trace.beginSection("BackgroundTextMeasurement");
        try {
            androidx.compose.runtime.snapshots.MutableSnapshot takeMutableSnapshot$default = androidx.compose.runtime.snapshots.Snapshot.Companion.takeMutableSnapshot$default(androidx.compose.runtime.snapshots.Snapshot.INSTANCE, null, null, 3, null);
            try {
                androidx.compose.runtime.snapshots.MutableSnapshot mutableSnapshot = takeMutableSnapshot$default;
                androidx.compose.runtime.snapshots.Snapshot makeCurrent = mutableSnapshot.makeCurrent();
                try {
                    androidx.compose.ui.text.TextStyle resolveDefaults = androidx.compose.ui.text.TextStyleKt.resolveDefaults(textStyle, layoutDirection);
                    if (list == null) {
                        list = kotlin.collections.CollectionsKt.emptyList();
                    }
                    new androidx.compose.ui.text.MultiParagraphIntrinsics(annotatedString, resolveDefaults, (java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>>) list, density, resolver).getMaxIntrinsicWidth();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    takeMutableSnapshot$default.apply().check();
                    takeMutableSnapshot$default.dispose();
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                } finally {
                    mutableSnapshot.restoreCurrent(makeCurrent);
                }
            } finally {
            }
        } finally {
            android.os.Trace.endSection();
        }
    }
}
