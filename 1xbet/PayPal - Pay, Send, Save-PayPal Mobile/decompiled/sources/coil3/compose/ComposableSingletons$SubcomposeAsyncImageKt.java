package coil3.compose;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$SubcomposeAsyncImageKt {
    public static final coil3.compose.ComposableSingletons$SubcomposeAsyncImageKt INSTANCE = new coil3.compose.ComposableSingletons$SubcomposeAsyncImageKt();
    private static kotlin.jvm.functions.Function3<coil3.compose.SubcomposeAsyncImageScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1938077476, false, new kotlin.jvm.functions.Function3() { // from class: coil3.compose.ComposableSingletons$SubcomposeAsyncImageKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return coil3.compose.ComposableSingletons$SubcomposeAsyncImageKt.m9742$r8$lambda$9A8lCoc8q8emKdpsn8slE5idHY((coil3.compose.SubcomposeAsyncImageScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    /* renamed from: $r8$lambda$9A8lCoc8q8emKdps-n8slE5idHY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9742$r8$lambda$9A8lCoc8q8emKdpsn8slE5idHY(coil3.compose.SubcomposeAsyncImageScope subcomposeAsyncImageScope, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = (composer.changed(subcomposeAsyncImageScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1938077476, i2, -1, "coil3.compose.ComposableSingletons$SubcomposeAsyncImageKt.lambda$1938077476.<anonymous> (SubcomposeAsyncImage.kt:309)");
            }
            coil3.compose.SubcomposeAsyncImageKt.SubcomposeAsyncImageContent(subcomposeAsyncImageScope, null, null, null, null, null, 0.0f, null, false, composer, i2 & 14, 255);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function3<coil3.compose.SubcomposeAsyncImageScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1938077476$coil_compose_core() {
        return Camera2StreamConfigurationMap;
    }
}
