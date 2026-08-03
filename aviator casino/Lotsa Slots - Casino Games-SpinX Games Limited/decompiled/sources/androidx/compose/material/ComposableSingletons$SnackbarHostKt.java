package androidx.compose.material;

/* compiled from: SnackbarHost.kt */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableSingletons$SnackbarHostKt {
    public static final androidx.compose.material.ComposableSingletons$SnackbarHostKt INSTANCE = new androidx.compose.material.ComposableSingletons$SnackbarHostKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarData, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> f12lambda1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(996639038, false, new kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarData, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ComposableSingletons$SnackbarHostKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.material.SnackbarData snackbarData, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            invoke(snackbarData, composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public final void invoke(androidx.compose.material.SnackbarData it, androidx.compose.runtime.Composer composer, int i) {
            int i2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C153@6325L12:SnackbarHost.kt#jmzs0o");
            if ((i & 14) == 0) {
                i2 = i | (composer.changed(it) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                androidx.compose.material.SnackbarKt.m1494SnackbarsPrSdHI(it, null, false, null, 0L, 0L, 0L, 0.0f, composer, i2 & 14, 254);
            }
        }
    });

    /* renamed from: getLambda-1$material_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarData, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1345getLambda1$material_release() {
        return f12lambda1;
    }
}
