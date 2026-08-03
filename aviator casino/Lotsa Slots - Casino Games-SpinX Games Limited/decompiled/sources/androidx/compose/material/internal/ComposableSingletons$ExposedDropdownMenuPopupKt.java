package androidx.compose.material.internal;

/* compiled from: ExposedDropdownMenuPopup.kt */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableSingletons$ExposedDropdownMenuPopupKt {
    public static final androidx.compose.material.internal.ComposableSingletons$ExposedDropdownMenuPopupKt INSTANCE = new androidx.compose.material.internal.ComposableSingletons$ExposedDropdownMenuPopupKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> f15lambda1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1627646060, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.internal.ComposableSingletons$ExposedDropdownMenuPopupKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            invoke(composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public final void invoke(androidx.compose.runtime.Composer composer, int i) {
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C:ExposedDropdownMenuPopup.kt#mnwmf7");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$material_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1585getLambda1$material_release() {
        return f15lambda1;
    }
}
