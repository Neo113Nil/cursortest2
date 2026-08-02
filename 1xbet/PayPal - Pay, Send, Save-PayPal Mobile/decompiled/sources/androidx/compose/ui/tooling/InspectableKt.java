package androidx.compose.ui.tooling;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a*\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\"\u0010\b\u001a\u00020\u00032\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/tooling/CompositionDataRecord;", "compositionDataRecord", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "Inspectable", "(Landroidx/compose/ui/tooling/CompositionDataRecord;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "InInspectionModeOnly", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InspectableKt {
    public static final void Inspectable(final androidx.compose.ui.tooling.CompositionDataRecord compositionDataRecord, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1504045604);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(compositionDataRecord) : startRestartGroup.changedInstance(compositionDataRecord) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1504045604, i2, -1, "androidx.compose.ui.tooling.Inspectable (Inspectable.android.kt:53)");
            }
            startRestartGroup.collectParameterInformation();
            kotlin.jvm.internal.Intrinsics.checkNotNull(compositionDataRecord, "");
            java.util.Set<androidx.compose.runtime.tooling.CompositionData> store = ((androidx.compose.ui.tooling.CompositionDataRecordImpl) compositionDataRecord).getStore();
            store.add(startRestartGroup.getCompositionData());
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.ui.platform.InspectionModeKt.getLocalInspectionMode().provides(java.lang.Boolean.TRUE), androidx.compose.runtime.tooling.InspectionTablesKt.getLocalInspectionTables().provides(store)}, function2, startRestartGroup, (i2 & 112) | androidx.compose.runtime.ProvidedValue.$stable);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.ui.tooling.InspectableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.ui.tooling.InspectableKt.$r8$lambda$mgGE83ZLcdOXm7i39uTuGvlS7zU(androidx.compose.ui.tooling.CompositionDataRecord.this, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    @kotlin.Deprecated(message = "This method should not be used in application code and will be removed soon.")
    public static final void InInspectionModeOnly(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1954693855);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1954693855, i2, -1, "androidx.compose.ui.tooling.InInspectionModeOnly (Inspectable.android.kt:71)");
            }
            if (!((java.lang.Boolean) startRestartGroup.consume(androidx.compose.ui.platform.InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
                startRestartGroup.startReplaceGroup(1115537283);
            } else {
                startRestartGroup.startReplaceGroup(1118132138);
                function2.invoke(startRestartGroup, java.lang.Integer.valueOf(i2 & 14));
            }
            startRestartGroup.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.ui.tooling.InspectableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.ui.tooling.InspectableKt.m8511$r8$lambda$A60ffMCsn5_AuDHFqPPY0dFLRw(kotlin.jvm.functions.Function2.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$A60ffMCsn5_AuDHFqPPY0-dFLRw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m8511$r8$lambda$A60ffMCsn5_AuDHFqPPY0dFLRw(kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        InInspectionModeOnly(function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mgGE83ZLcdOXm7i39uTuGvlS7zU(androidx.compose.ui.tooling.CompositionDataRecord compositionDataRecord, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        Inspectable(compositionDataRecord, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
