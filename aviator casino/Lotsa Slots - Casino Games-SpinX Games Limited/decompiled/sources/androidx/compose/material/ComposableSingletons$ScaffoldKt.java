package androidx.compose.material;

/* compiled from: Scaffold.kt */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableSingletons$ScaffoldKt {
    public static final androidx.compose.material.ComposableSingletons$ScaffoldKt INSTANCE = new androidx.compose.material.ComposableSingletons$ScaffoldKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> f8lambda1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2069405901, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ComposableSingletons$ScaffoldKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            invoke(composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public final void invoke(androidx.compose.runtime.Composer composer, int i) {
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C:Scaffold.kt#jmzs0o");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> f9lambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-231850563, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ComposableSingletons$ScaffoldKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            invoke(composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public final void invoke(androidx.compose.runtime.Composer composer, int i) {
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C:Scaffold.kt#jmzs0o");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> f10lambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-147687984, false, new kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ComposableSingletons$ScaffoldKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.material.SnackbarHostState snackbarHostState, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            invoke(snackbarHostState, composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public final void invoke(androidx.compose.material.SnackbarHostState it, androidx.compose.runtime.Composer composer, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C163@7224L16:Scaffold.kt#jmzs0o");
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

    /* renamed from: lambda-4, reason: not valid java name */
    public static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> f11lambda4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-900670499, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ComposableSingletons$ScaffoldKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            invoke(composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public final void invoke(androidx.compose.runtime.Composer composer, int i) {
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C:Scaffold.kt#jmzs0o");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$material_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1341getLambda1$material_release() {
        return f8lambda1;
    }

    /* renamed from: getLambda-2$material_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1342getLambda2$material_release() {
        return f9lambda2;
    }

    /* renamed from: getLambda-3$material_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1343getLambda3$material_release() {
        return f10lambda3;
    }

    /* renamed from: getLambda-4$material_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1344getLambda4$material_release() {
        return f11lambda4;
    }
}
