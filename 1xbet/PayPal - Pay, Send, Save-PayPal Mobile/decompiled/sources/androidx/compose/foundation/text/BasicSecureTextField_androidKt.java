package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\b\u0010\u0010\u001a\u00020\u0011H\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0003X\u008a\u008e\u0002"}, d2 = {"TAG", "", "platformAllowsRevealLastTyped", "", "(Landroidx/compose/runtime/Composer;I)Z", "DefaultContentResolverForSecureTextField", "Lkotlin/Function1;", "Landroid/content/Context;", "Landroidx/compose/foundation/text/ContentResolverForSecureTextField;", "contentResolverForSecureTextField", "getContentResolverForSecureTextField$annotations", "()V", "getContentResolverForSecureTextField", "()Lkotlin/jvm/functions/Function1;", "setContentResolverForSecureTextField", "(Lkotlin/jvm/functions/Function1;)V", "resetContentResolverForSecureTextField", "", "foundation", "state"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicSecureTextField_androidKt {
    private static kotlin.jvm.functions.Function1<? super android.content.Context, ? extends androidx.compose.foundation.text.ContentResolverForSecureTextField> getHighSpeedVideoFpsRanges;
    private static final kotlin.jvm.functions.Function1<android.content.Context, androidx.compose.foundation.text.ContentResolverForSecureTextField> getHighSpeedVideoSizes;

    public static /* synthetic */ void getContentResolverForSecureTextField$annotations() {
    }

    public static final boolean platformAllowsRevealLastTyped(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1015272320, i, -1, "androidx.compose.foundation.text.platformAllowsRevealLastTyped (BasicSecureTextField.android.kt:38)");
        }
        java.lang.Object obj = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        java.lang.Object obj2 = getHighSpeedVideoFpsRanges;
        boolean changed = composer.changed(obj);
        boolean changed2 = composer.changed(obj2);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed2 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (androidx.compose.foundation.text.ContentResolverForSecureTextField) getHighSpeedVideoFpsRanges.invoke(obj);
            composer.updateRememberedValue(rememberedValue);
        }
        final androidx.compose.foundation.text.ContentResolverForSecureTextField contentResolverForSecureTextField = (androidx.compose.foundation.text.ContentResolverForSecureTextField) rememberedValue;
        boolean changed3 = composer.changed(contentResolverForSecureTextField);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(contentResolverForSecureTextField.getShowPassword()), null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
        boolean changed4 = composer.changed(contentResolverForSecureTextField);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            final android.os.Handler createAsync = androidx.core.os.HandlerCompat.createAsync(android.os.Looper.getMainLooper());
            rememberedValue3 = new android.database.ContentObserver(createAsync) { // from class: androidx.compose.foundation.text.BasicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1
                @Override // android.database.ContentObserver
                public final void onChange(boolean selfChange) {
                    androidx.compose.foundation.text.BasicSecureTextField_androidKt.getHighSpeedVideoFpsRangesFor(mutableState, androidx.compose.foundation.text.ContentResolverForSecureTextField.this.getShowPassword());
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        final androidx.compose.foundation.text.BasicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1 basicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1 = (androidx.compose.foundation.text.BasicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1) rememberedValue3;
        boolean changedInstance = composer.changedInstance(contentResolverForSecureTextField);
        boolean changedInstance2 = composer.changedInstance(basicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if ((changedInstance | changedInstance2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.BasicSecureTextField_androidKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    androidx.compose.runtime.DisposableEffectResult highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.BasicSecureTextField_androidKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.ContentResolverForSecureTextField.this, basicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        androidx.compose.runtime.EffectsKt.DisposableEffect(contentResolverForSecureTextField, basicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1, (kotlin.jvm.functions.Function1) rememberedValue4, composer, 0);
        boolean highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges((androidx.compose.runtime.MutableState<java.lang.Boolean>) mutableState);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return highSpeedVideoFpsRanges;
    }

    private static final boolean getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.DisposableEffectResult getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.foundation.text.ContentResolverForSecureTextField contentResolverForSecureTextField, final androidx.compose.foundation.text.BasicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1 basicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1) {
        contentResolverForSecureTextField.registerContentObserver(android.provider.Settings.System.getUriFor("show_password"), false, basicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicSecureTextField_androidKt$platformAllowsRevealLastTyped$lambda$5$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.compose.foundation.text.ContentResolverForSecureTextField.this.unregisterContentObserver(basicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1);
            }
        };
    }

    static {
        kotlin.jvm.functions.Function1<android.content.Context, androidx.compose.foundation.text.ContentResolverForSecureTextField> function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.BasicSecureTextField_androidKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.foundation.text.BasicSecureTextField_androidKt$DefaultContentResolverForSecureTextField$1$1 highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.foundation.text.BasicSecureTextField_androidKt.getHighSpeedVideoFpsRanges((android.content.Context) obj);
                return highSpeedVideoFpsRanges;
            }
        };
        getHighSpeedVideoSizes = function1;
        getHighSpeedVideoFpsRanges = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.text.BasicSecureTextField_androidKt$DefaultContentResolverForSecureTextField$1$1] */
    public static final androidx.compose.foundation.text.BasicSecureTextField_androidKt$DefaultContentResolverForSecureTextField$1$1 getHighSpeedVideoFpsRanges(android.content.Context context) {
        final android.content.ContentResolver contentResolver = context.getContentResolver();
        return new androidx.compose.foundation.text.ContentResolverForSecureTextField() { // from class: androidx.compose.foundation.text.BasicSecureTextField_androidKt$DefaultContentResolverForSecureTextField$1$1
            @Override // androidx.compose.foundation.text.ContentResolverForSecureTextField
            public final void registerContentObserver(android.net.Uri uri, boolean notifyForDescendants, android.database.ContentObserver observer) {
                contentResolver.registerContentObserver(uri, notifyForDescendants, observer);
            }

            @Override // androidx.compose.foundation.text.ContentResolverForSecureTextField
            public final void unregisterContentObserver(android.database.ContentObserver observer) {
                contentResolver.unregisterContentObserver(observer);
            }

            @Override // androidx.compose.foundation.text.ContentResolverForSecureTextField
            public final boolean getShowPassword() {
                try {
                    return android.provider.Settings.System.getInt(contentResolver, "show_password") > 0;
                } catch (java.lang.Exception e) {
                    return true;
                }
            }
        };
    }

    public static final kotlin.jvm.functions.Function1<android.content.Context, androidx.compose.foundation.text.ContentResolverForSecureTextField> getContentResolverForSecureTextField() {
        return getHighSpeedVideoFpsRanges;
    }

    public static final void setContentResolverForSecureTextField(kotlin.jvm.functions.Function1<? super android.content.Context, ? extends androidx.compose.foundation.text.ContentResolverForSecureTextField> function1) {
        getHighSpeedVideoFpsRanges = function1;
    }

    public static final void resetContentResolverForSecureTextField() {
        getHighSpeedVideoFpsRanges = getHighSpeedVideoSizes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
    }
}
