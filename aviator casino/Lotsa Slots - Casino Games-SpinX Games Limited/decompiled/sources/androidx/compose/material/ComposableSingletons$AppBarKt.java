package androidx.compose.material;

/* compiled from: AppBar.kt */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableSingletons$AppBarKt {
    public static final androidx.compose.material.ComposableSingletons$AppBarKt INSTANCE = new androidx.compose.material.ComposableSingletons$AppBarKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> f5lambda1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-771938130, false, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ComposableSingletons$AppBarKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            invoke(rowScope, composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public final void invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rowScope, "$this$null");
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C:AppBar.kt#jmzs0o");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$material_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1338getLambda1$material_release() {
        return f5lambda1;
    }
}
