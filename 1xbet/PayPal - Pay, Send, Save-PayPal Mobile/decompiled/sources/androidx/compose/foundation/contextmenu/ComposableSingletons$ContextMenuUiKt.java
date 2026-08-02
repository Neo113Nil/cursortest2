package androidx.compose.foundation.contextmenu;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$ContextMenuUiKt {
    public static final androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt INSTANCE = new androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt();
    private static kotlin.jvm.functions.Function8<androidx.compose.ui.Modifier, java.lang.String, java.lang.Boolean, androidx.compose.foundation.contextmenu.ContextMenuColors, kotlin.jvm.functions.Function3<? super androidx.compose.ui.graphics.Color, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1571120048, false, new kotlin.jvm.functions.Function8() { // from class: androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function8
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
            return androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt.$r8$lambda$79eQ7Hvpb2w82g5PFNf9y_xV4AI((androidx.compose.ui.Modifier) obj, (java.lang.String) obj2, ((java.lang.Boolean) obj3).booleanValue(), (androidx.compose.foundation.contextmenu.ContextMenuColors) obj4, (kotlin.jvm.functions.Function3) obj5, (kotlin.jvm.functions.Function0) obj6, (androidx.compose.runtime.Composer) obj7, ((java.lang.Integer) obj8).intValue());
        }
    });
    private static kotlin.jvm.functions.Function3<androidx.compose.foundation.contextmenu.ContextMenuColors, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1455401925, false, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt.$r8$lambda$27vYcaTEBfrVHhY5mGppVjIFmqk((androidx.compose.foundation.contextmenu.ContextMenuColors) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$27vYcaTEBfrVHhY5mGppVjIFmqk(androidx.compose.foundation.contextmenu.ContextMenuColors contextMenuColors, androidx.compose.runtime.Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changed(contextMenuColors) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1455401925, i, -1, "androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt.lambda$-1455401925.<anonymous> (ContextMenuUi.kt:305)");
            }
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, androidx.compose.foundation.contextmenu.ContextMenuSpec.INSTANCE.m1391getDividerVerticalPaddingD9Ej5fM(), 1, null), 0.0f, 1, null), androidx.compose.foundation.contextmenu.ContextMenuSpec.INSTANCE.m1390getDividerHeightD9Ej5fM()), contextMenuColors.getIconColor(), null, 2, null), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$79eQ7Hvpb2w82g5PFNf9y_xV4AI(androidx.compose.ui.Modifier modifier, java.lang.String str, boolean z, androidx.compose.foundation.contextmenu.ContextMenuColors contextMenuColors, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = (composer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composer.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composer.changed(contextMenuColors) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composer.changedInstance(function3) ? 16384 : 8192;
        }
        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i2 |= composer.changedInstance(function0) ? 131072 : 65536;
        }
        if (composer.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1571120048, i2, -1, "androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt.lambda$-1571120048.<anonymous> (ContextMenuUi.kt:136)");
            }
            androidx.compose.foundation.contextmenu.ContextMenuUiKt.ContextMenuItem(str, z, contextMenuColors, modifier, function3, function0, composer, ((i2 >> 3) & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO) | ((i2 << 9) & 7168) | (57344 & i2) | (i2 & 458752), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1571120048$foundation, reason: not valid java name */
    public final kotlin.jvm.functions.Function8<androidx.compose.ui.Modifier, java.lang.String, java.lang.Boolean, androidx.compose.foundation.contextmenu.ContextMenuColors, kotlin.jvm.functions.Function3<? super androidx.compose.ui.graphics.Color, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1379getLambda$1571120048$foundation() {
        return getHighSpeedVideoSizes;
    }

    /* renamed from: getLambda$-1455401925$foundation, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.contextmenu.ContextMenuColors, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1378getLambda$1455401925$foundation() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
