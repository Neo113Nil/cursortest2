package androidx.compose.foundation.text.contextmenu.internal;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt {
    public static final androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt INSTANCE = new androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt();
    private static kotlin.jvm.functions.Function5<androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession, androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider, kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(129995601, false, new kotlin.jvm.functions.Function5() { // from class: androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function5
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
            return androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.$r8$lambda$oXzF_Jyjp32y5Qe0ZwoaBqIxxOU((androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession) obj, (androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider) obj2, (kotlin.jvm.functions.Function0) obj3, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
        }
    });
    private static kotlin.jvm.functions.Function5<androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession, androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider, kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(636288403, false, new kotlin.jvm.functions.Function5() { // from class: androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function5
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
            return androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.$r8$lambda$w92Ftq6DyRsX2aOp5LWpSzrk6Nk((androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession) obj, (androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider) obj2, (kotlin.jvm.functions.Function0) obj3, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
        }
    });
    private static kotlin.jvm.functions.Function5<androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession, androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider, kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1357803046, false, new kotlin.jvm.functions.Function5() { // from class: androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function5
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
            return androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.$r8$lambda$l_uoLwr5irhdJz3qdMC4U50vdX4((androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession) obj, (androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider) obj2, (kotlin.jvm.functions.Function0) obj3, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$l_uoLwr5irhdJz3qdMC4U50vdX4(androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession textContextMenuSession, androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider textContextMenuDataProvider, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(textContextMenuSession) : composer.changedInstance(textContextMenuSession) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composer.changed(textContextMenuDataProvider) : composer.changedInstance(textContextMenuDataProvider) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composer.changedInstance(function0) ? 256 : 128;
        }
        if (composer.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1357803046, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda$-1357803046.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:99)");
            }
            androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt.getHighSpeedVideoFpsRanges(textContextMenuSession, textContextMenuDataProvider, function0, composer, i2 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oXzF_Jyjp32y5Qe0ZwoaBqIxxOU(androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession textContextMenuSession, androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider textContextMenuDataProvider, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(textContextMenuSession) : composer.changedInstance(textContextMenuSession) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composer.changed(textContextMenuDataProvider) : composer.changedInstance(textContextMenuDataProvider) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composer.changedInstance(function0) ? 256 : 128;
        }
        if (composer.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(129995601, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda$129995601.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:75)");
            }
            androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt.getHighSpeedVideoFpsRanges(textContextMenuSession, textContextMenuDataProvider, function0, composer, i2 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$w92Ftq6DyRsX2aOp5LWpSzrk6Nk(androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession textContextMenuSession, androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider textContextMenuDataProvider, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(textContextMenuSession) : composer.changedInstance(textContextMenuSession) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composer.changed(textContextMenuDataProvider) : composer.changedInstance(textContextMenuDataProvider) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composer.changedInstance(function0) ? 256 : 128;
        }
        if (composer.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(636288403, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda$636288403.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:90)");
            }
            androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt.getHighSpeedVideoFpsRanges(textContextMenuSession, textContextMenuDataProvider, function0, composer, i2 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function5<androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession, androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider, kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$636288403$foundation() {
        return Camera2StreamConfigurationMap;
    }

    public final kotlin.jvm.functions.Function5<androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession, androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider, kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$129995601$foundation() {
        return getHighSpeedVideoSizes;
    }

    /* renamed from: getLambda$-1357803046$foundation, reason: not valid java name */
    public final kotlin.jvm.functions.Function5<androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession, androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider, kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m2151getLambda$1357803046$foundation() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
