package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0002\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/pds/components/AccordionHeaderScope;", "", "Header", "", "text", "", "contentDescription", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "pds_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AccordionHeaderScope {
    void Header(java.lang.String str, java.lang.String str2, androidx.compose.runtime.Composer composer, int i);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class ComposeDefaultImpls {
        public static final void Header$default(final java.lang.String str, java.lang.String str2, final com.paypal.pds.components.AccordionHeaderScope accordionHeaderScope, androidx.compose.runtime.Composer composer, final int i, final int i2) {
            int i3;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionHeaderScope, "");
            androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1278264175);
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            int i4 = i2 & 2;
            if (i4 != 0) {
                i3 |= 48;
            } else if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(str2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= (i & 512) == 0 ? startRestartGroup.changed(accordionHeaderScope) : startRestartGroup.changedInstance(accordionHeaderScope) ? 256 : 128;
            }
            if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                if (i4 != 0) {
                    str2 = null;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1278264175, i3, -1, "com.paypal.pds.components.AccordionHeaderScope.ComposeDefaultImpls.Header$default (Accordion.kt:-1)");
                }
                accordionHeaderScope.Header(str, str2, startRestartGroup, i3 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            final java.lang.String str3 = str2;
            androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.AccordionHeaderScope$ComposeDefaultImpls$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.pds.components.AccordionHeaderScope.ComposeDefaultImpls.$r8$lambda$_y1eMTF6RphkCGixtE8u0P2suCM(str, str3, accordionHeaderScope, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
            }
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$_y1eMTF6RphkCGixtE8u0P2suCM(java.lang.String str, java.lang.String str2, com.paypal.pds.components.AccordionHeaderScope accordionHeaderScope, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
            Header$default(str, str2, accordionHeaderScope, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            return kotlin.Unit.INSTANCE;
        }
    }
}
