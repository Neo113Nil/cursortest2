package coil3.compose;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a*\u0010\u0007\u001a\u00020\u00062\u001b\u0010\u0005\u001a\u0017\u0012\r\u0012\u000b0\u0001j\u0002`\u0002¢\u0006\u0002\b\u0003\u0012\u0004\u0012\u00020\u00040\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Function1;", "Landroid/content/Context;", "Lcoil3/getHighResolutionOutputSizeshNQ4ISI;", "Lkotlin/ParameterName;", "Lcoil3/ImageLoader;", "factory", "", "setSingletonImageLoaderFactory", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SingletonImageLoadersKt {
    public static final void setSingletonImageLoaderFactory(final kotlin.jvm.functions.Function1<? super android.content.Context, ? extends coil3.ImageLoader> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(505499498);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(505499498, i2, -1, "coil3.compose.setSingletonImageLoaderFactory (singletonImageLoaders.kt:13)");
            }
            coil3.SingletonImageLoader.setSafe(new coil3.compose.SingletonImageLoadersKt$sam$coil3_SingletonImageLoader_Factory$0(function1));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: coil3.compose.SingletonImageLoadersKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return coil3.compose.SingletonImageLoadersKt.$r8$lambda$xpVmM3aUjGlZwtTLS7kgJ6m8NJo(kotlin.jvm.functions.Function1.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xpVmM3aUjGlZwtTLS7kgJ6m8NJo(kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        setSingletonImageLoaderFactory(function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
