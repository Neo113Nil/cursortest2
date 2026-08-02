package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/pds/components/AccordionHeaderScopeImpl;", "Lcom/paypal/pds/components/AccordionHeaderScope;", "<init>", "()V", "", "p0", "p1", "", "Header", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final class AccordionHeaderScopeImpl implements com.paypal.pds.components.AccordionHeaderScope {
    public static final com.paypal.pds.components.AccordionHeaderScopeImpl INSTANCE = new com.paypal.pds.components.AccordionHeaderScopeImpl();

    private AccordionHeaderScopeImpl() {
    }

    @Override // com.paypal.pds.components.AccordionHeaderScope
    public final void Header(java.lang.String str, java.lang.String str2, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.ui.Modifier semantics$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        composer.startReplaceGroup(1644238569);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1644238569, i, -1, "com.paypal.pds.components.AccordionHeaderScopeImpl.Header (Accordion.kt:250)");
        }
        semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(androidx.compose.ui.Modifier.INSTANCE, false, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.AccordionKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.pds.components.AccordionKt.m21559$r8$lambda$QYntSAOzdVCRDXK0WeZkviJbBQ(str2, str, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
            }
        }, 1, null);
        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, semantics$default, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, i & 14, 6, 1020);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
