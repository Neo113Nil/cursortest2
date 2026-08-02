package androidx.navigation3.runtime;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/navigation3/runtime/SaveableStateHolderNavEntryDecorator;", "", "T", "Landroidx/navigation3/runtime/NavEntryDecorator;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "saveableStateHolder", "<init>", "(Landroidx/compose/runtime/saveable/SaveableStateHolder;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SaveableStateHolderNavEntryDecorator<T> extends androidx.navigation3.runtime.NavEntryDecorator<T> {
    public static final int $stable = 0;

    public SaveableStateHolderNavEntryDecorator(final androidx.compose.runtime.saveable.SaveableStateHolder saveableStateHolder) {
        super(new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.runtime.SaveableStateHolderNavEntryDecorator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.navigation3.runtime.SaveableStateHolderNavEntryDecorator.$r8$lambda$VFpj1iHfkGsZKknQulWytuuRNvU(androidx.compose.runtime.saveable.SaveableStateHolder.this, obj);
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1320822745, true, new kotlin.jvm.functions.Function3() { // from class: androidx.navigation3.runtime.SaveableStateHolderNavEntryDecorator$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return androidx.navigation3.runtime.SaveableStateHolderNavEntryDecorator.m9230$r8$lambda$t4eKAgy2AZ1TwjAWPTEIV4lzM(androidx.compose.runtime.saveable.SaveableStateHolder.this, (androidx.navigation3.runtime.NavEntry) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
    }

    /* renamed from: $r8$lambda$5AEs6Y8xjT-m9rz_14ajr7_PkrE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9229$r8$lambda$5AEs6Y8xjTm9rz_14ajr7_PkrE(androidx.navigation3.runtime.NavEntry navEntry, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(121262920, i, -1, "androidx.navigation3.runtime.SaveableStateHolderNavEntryDecorator.<init>.<anonymous>.<anonymous> (SaveableStateHolderNavEntryDecorator.kt:56)");
            }
            navEntry.Content(composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VFpj1iHfkGsZKknQulWytuuRNvU(androidx.compose.runtime.saveable.SaveableStateHolder saveableStateHolder, java.lang.Object obj) {
        saveableStateHolder.removeState(obj);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$t4eKAgy2A-Z1Twj-AWPTEIV4lzM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9230$r8$lambda$t4eKAgy2AZ1TwjAWPTEIV4lzM(androidx.compose.runtime.saveable.SaveableStateHolder saveableStateHolder, final androidx.navigation3.runtime.NavEntry navEntry, androidx.compose.runtime.Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changed(navEntry) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1320822745, i, -1, "androidx.navigation3.runtime.SaveableStateHolderNavEntryDecorator.<init>.<anonymous> (SaveableStateHolderNavEntryDecorator.kt:56)");
            }
            saveableStateHolder.SaveableStateProvider(navEntry.getContentKey(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(121262920, true, new kotlin.jvm.functions.Function2() { // from class: androidx.navigation3.runtime.SaveableStateHolderNavEntryDecorator$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.navigation3.runtime.SaveableStateHolderNavEntryDecorator.m9229$r8$lambda$5AEs6Y8xjTm9rz_14ajr7_PkrE(androidx.navigation3.runtime.NavEntry.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
