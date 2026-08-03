package androidx.compose.material;

/* compiled from: BackdropScaffold.kt */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableSingletons$BackdropScaffoldKt {
    public static final androidx.compose.material.ComposableSingletons$BackdropScaffoldKt INSTANCE = new androidx.compose.material.ComposableSingletons$BackdropScaffoldKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> f6lambda1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(229445492, false, new kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ComposableSingletons$BackdropScaffoldKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.material.SnackbarHostState snackbarHostState, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            invoke(snackbarHostState, composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public final void invoke(androidx.compose.material.SnackbarHostState it, androidx.compose.runtime.Composer composer, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C273@12626L16:BackdropScaffold.kt#jmzs0o");
            if ((i & 14) == 0) {
                i |= composer.changed(it) ? 4 : 2;
            }
            if ((i & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                androidx.compose.material.SnackbarHostKt.SnackbarHost(it, null, null, composer, i & 14, 6);
            }
        }
    });

    /* renamed from: getLambda-1$material_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1339getLambda1$material_release() {
        return f6lambda1;
    }
}
