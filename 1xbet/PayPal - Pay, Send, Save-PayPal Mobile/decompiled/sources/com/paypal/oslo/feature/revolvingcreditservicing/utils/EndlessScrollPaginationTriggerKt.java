package com.paypal.oslo.feature.revolvingcreditservicing.utils;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0007¢\u0006\u0002\u0010\u000e\u001a?\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0007¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012²\u0006\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u008a\u0084\u0002²\u0006\n\u0010\u0014\u001a\u00020\tX\u008a\u0084\u0002²\u0006\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u008a\u0084\u0002²\u0006\n\u0010\u0014\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"ScrollTimeoutMillis", "", "DefaultThreshold", "", "EndlessScrollPaginationTrigger", "", "scrollState", "Landroidx/compose/foundation/ScrollState;", "enabled", "", "debounceMillis", "triggerThreshold", "onLoadMore", "Lkotlin/Function0;", "(Landroidx/compose/foundation/ScrollState;ZJDLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Landroidx/compose/foundation/lazy/LazyListState;ZJDLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "revolvingcredit-servicing_prodRelease", "onLoadMoreRemembered", "enabledRemembered"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EndlessScrollPaginationTriggerKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EndlessScrollPaginationTrigger(final androidx.compose.foundation.ScrollState scrollState, final boolean z, long j, double d, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        int i4;
        double d2;
        final long j3;
        final double d3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scrollState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(242009744);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(scrollState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            j2 = j;
            i3 |= startRestartGroup.changed(j2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                d2 = d;
                i3 |= startRestartGroup.changed(d2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
                }
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    j3 = j2;
                    d3 = d2;
                } else {
                    long j4 = i5 != 0 ? 300L : j2;
                    if (i4 != 0) {
                        d2 = 0.8d;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(242009744, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTrigger (EndlessScrollPaginationTrigger.kt:37)");
                    }
                    androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function0, startRestartGroup, (i3 >> 12) & 14);
                    androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(java.lang.Boolean.valueOf(z), startRestartGroup, (i3 >> 3) & 14);
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    boolean z2 = (i3 & 14) == 4;
                    boolean z3 = (i3 & 896) == 256;
                    boolean changed = startRestartGroup.changed(rememberUpdatedState2);
                    boolean z4 = (i3 & 7168) == 2048;
                    boolean changed2 = startRestartGroup.changed(rememberUpdatedState);
                    com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$1$1 rememberedValue = startRestartGroup.rememberedValue();
                    if (((z2 | z3 | changed | z4) || changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        unit = unit2;
                        rememberedValue = new com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$1$1(j4, scrollState, d2, rememberUpdatedState2, rememberUpdatedState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    } else {
                        unit = unit2;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    d3 = d2;
                    j3 = j4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt.$r8$lambda$oMH37344ft98jXFzqSdg4Mw_BR4(androidx.compose.foundation.ScrollState.this, z, j3, d3, function0, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            d2 = d;
            if ((i & 24576) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        j2 = j;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        d2 = d;
        if ((i & 24576) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EndlessScrollPaginationTrigger(final androidx.compose.foundation.lazy.LazyListState lazyListState, final boolean z, long j, double d, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        int i4;
        double d2;
        final long j3;
        final double d3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1335771019);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(lazyListState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            j2 = j;
            i3 |= startRestartGroup.changed(j2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                d2 = d;
                i3 |= startRestartGroup.changed(d2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
                }
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    j3 = j2;
                    d3 = d2;
                } else {
                    long j4 = i5 != 0 ? 300L : j2;
                    if (i4 != 0) {
                        d2 = 0.8d;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1335771019, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTrigger (EndlessScrollPaginationTrigger.kt:69)");
                    }
                    androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function0, startRestartGroup, (i3 >> 12) & 14);
                    androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(java.lang.Boolean.valueOf(z), startRestartGroup, (i3 >> 3) & 14);
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    boolean z2 = (i3 & 14) == 4;
                    boolean z3 = (i3 & 896) == 256;
                    boolean changed = startRestartGroup.changed(rememberUpdatedState2);
                    boolean z4 = (i3 & 7168) == 2048;
                    boolean changed2 = startRestartGroup.changed(rememberUpdatedState);
                    com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$3$1 rememberedValue = startRestartGroup.rememberedValue();
                    if (((z2 | z3 | changed | z4) || changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        unit = unit2;
                        rememberedValue = new com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$EndlessScrollPaginationTrigger$3$1(j4, lazyListState, d2, rememberUpdatedState2, rememberUpdatedState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    } else {
                        unit = unit2;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    d3 = d2;
                    j3 = j4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.utils.EndlessScrollPaginationTriggerKt.$r8$lambda$5gzXapRRrTLYv6tXMXSMLzagP30(androidx.compose.foundation.lazy.LazyListState.this, z, j3, d3, function0, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            d2 = d;
            if ((i & 24576) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        j2 = j;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        d2 = d;
        if ((i & 24576) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5gzXapRRrTLYv6tXMXSMLzagP30(androidx.compose.foundation.lazy.LazyListState lazyListState, boolean z, long j, double d, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        EndlessScrollPaginationTrigger(lazyListState, z, j, d, (kotlin.jvm.functions.Function0<kotlin.Unit>) function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oMH37344ft98jXFzqSdg4Mw_BR4(androidx.compose.foundation.ScrollState scrollState, boolean z, long j, double d, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        EndlessScrollPaginationTrigger(scrollState, z, j, d, (kotlin.jvm.functions.Function0<kotlin.Unit>) function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function0 access$EndlessScrollPaginationTrigger$lambda$0(androidx.compose.runtime.State state) {
        return (kotlin.jvm.functions.Function0) state.getValue();
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function0 access$EndlessScrollPaginationTrigger$lambda$4(androidx.compose.runtime.State state) {
        return (kotlin.jvm.functions.Function0) state.getValue();
    }
}
