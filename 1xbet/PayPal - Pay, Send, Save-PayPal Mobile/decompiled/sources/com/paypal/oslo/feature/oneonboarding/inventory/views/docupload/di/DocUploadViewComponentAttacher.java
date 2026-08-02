package com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0002\u0010\u0004JG\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0002\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0002\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/di/DocUploadViewComponentAttacher;", "", "rememberState", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetState;", "(Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetState;", "Attach", "", "config", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/domain/DocUploadViewComponentConfig;", "onDocumentUpload", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/domain/DocUploadCollectedItem;", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "modifier", "Landroidx/compose/ui/Modifier;", "state", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/domain/DocUploadViewComponentConfig;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetState;Landroidx/compose/runtime/Composer;I)V", "AttachBottomSheet", "(Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetState;Landroidx/compose/runtime/Composer;I)V", "one-onboarding_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface DocUploadViewComponentAttacher {
    void Attach(com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadViewComponentConfig docUploadViewComponentConfig, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCollectedItem, kotlin.Unit> function1, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState docUploadWidgetState, androidx.compose.runtime.Composer composer, int i);

    void AttachBottomSheet(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState docUploadWidgetState, androidx.compose.runtime.Composer composer, int i);

    com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState rememberState(androidx.compose.runtime.Composer composer, int i);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class ComposeDefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0074  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void Attach$default(final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadViewComponentConfig docUploadViewComponentConfig, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCollectedItem, kotlin.Unit> function1, final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState docUploadWidgetState, final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher docUploadViewComponentAttacher, androidx.compose.runtime.Composer composer, final int i, final int i2) {
            int i3;
            androidx.compose.ui.Modifier modifier2;
            int i4;
            final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState docUploadWidgetState2;
            final androidx.compose.ui.Modifier modifier3;
            androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docUploadViewComponentConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docUploadViewComponentAttacher, "");
            androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2047925398);
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(docUploadViewComponentConfig) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(intentId) ? 256 : 128;
            }
            int i5 = i2 & 8;
            if (i5 != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
                i4 = i2 & 16;
                if (i4 == 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    docUploadWidgetState2 = docUploadWidgetState;
                    i3 |= startRestartGroup.changedInstance(docUploadWidgetState2) ? 16384 : 8192;
                    if ((196608 & i) == 0) {
                        i3 |= (262144 & i) == 0 ? startRestartGroup.changed(docUploadViewComponentAttacher) : startRestartGroup.changedInstance(docUploadViewComponentAttacher) ? 131072 : 65536;
                    }
                    if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                    } else {
                        androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState docUploadWidgetState3 = i4 != 0 ? null : docUploadWidgetState2;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(2047925398, i3, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher.ComposeDefaultImpls.Attach$default (DocUploadViewComponentAttacher.kt:-1)");
                        }
                        docUploadViewComponentAttacher.Attach(docUploadViewComponentConfig, function1, intentId, modifier4, docUploadWidgetState3, startRestartGroup, i3 & 524286);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        docUploadWidgetState2 = docUploadWidgetState3;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher$ComposeDefaultImpls$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher.ComposeDefaultImpls.$r8$lambda$skaFRkpRlNyMDCu7QbBYoAgt2P4(com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadViewComponentConfig.this, function1, intentId, modifier3, docUploadWidgetState2, docUploadViewComponentAttacher, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                docUploadWidgetState2 = docUploadWidgetState;
                if ((196608 & i) == 0) {
                }
                if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i4 = i2 & 16;
            if (i4 == 0) {
            }
            docUploadWidgetState2 = docUploadWidgetState;
            if ((196608 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$skaFRkpRlNyMDCu7QbBYoAgt2P4(com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadViewComponentConfig docUploadViewComponentConfig, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState docUploadWidgetState, com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher docUploadViewComponentAttacher, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
            Attach$default(docUploadViewComponentConfig, function1, intentId, modifier, docUploadWidgetState, docUploadViewComponentAttacher, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            return kotlin.Unit.INSTANCE;
        }
    }
}
