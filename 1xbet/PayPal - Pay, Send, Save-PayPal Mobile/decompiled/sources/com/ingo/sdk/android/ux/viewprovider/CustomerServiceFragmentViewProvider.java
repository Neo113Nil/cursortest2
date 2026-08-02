package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u000f\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0010\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/ingo/sdk/android/ux/viewprovider/CustomerServiceFragmentViewProvider;", "Lcom/ingo/sdk/android/core/ux/composable/IngoComposable;", "Lkotlin/Function0;", "", "chatClicked", "emailClicked", "phoneClicked", "navigationClicked", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "View", "(Landroidx/compose/runtime/Composer;I)V", "Lkotlin/jvm/functions/Function0;", "getChatClicked", "()Lkotlin/jvm/functions/Function0;", "getEmailClicked", "getPhoneClicked", "getNavigationClicked"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CustomerServiceFragmentViewProvider extends com.ingo.sdk.android.core.ux.composable.IngoComposable {
    public static final int $stable = com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> chatClicked;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> emailClicked;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> navigationClicked;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> phoneClicked;

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getChatClicked() {
        return this.chatClicked;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getEmailClicked() {
        return this.emailClicked;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getPhoneClicked() {
        return this.phoneClicked;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getNavigationClicked() {
        return this.navigationClicked;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerServiceFragmentViewProvider(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function0<kotlin.Unit> function04) {
        super(null, null, null, 7, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        this.chatClicked = function0;
        this.emailClicked = function02;
        this.phoneClicked = function03;
        this.navigationClicked = function04;
    }

    public final void View(androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(369701301);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            androidx.compose.material3.ScaffoldKt.m3648ScaffoldTvnljyQ(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.ui.Modifier.INSTANCE), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1084653689, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.viewprovider.CustomerServiceFragmentViewProvider$View$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    androidx.compose.runtime.Composer composer3 = composer2;
                    if ((num.intValue() & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                    } else {
                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10649TopAppBarHzv_svQ(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_customer_support, composer3, 0), com.ingo.sdk.android.ux.viewprovider.CustomerServiceFragmentViewProvider.this.getNavigationClicked(), com.ingo.sdk.android.ux.R.drawable.ic_baseline_arrow_back_24, null, 0L, false, null, false, false, 0, composer3, 100859904, 728);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, startRestartGroup, 54), null, null, null, 0, androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme(startRestartGroup, (i2 & 14) | com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable).getBackgroundColor())), 0L, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2017818940, true, new com.ingo.sdk.android.ux.viewprovider.CustomerServiceFragmentViewProvider$View$2(this), startRestartGroup, 54), startRestartGroup, 805306416, 444);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.ingo.sdk.android.ux.viewprovider.CustomerServiceFragmentViewProvider$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.ingo.sdk.android.ux.viewprovider.CustomerServiceFragmentViewProvider.m10740$r8$lambda$_2ds5WMltyBqAVdSgKz9SuOyE4(com.ingo.sdk.android.ux.viewprovider.CustomerServiceFragmentViewProvider.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$_-2ds5WMltyBqAVdSgKz9SuOyE4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10740$r8$lambda$_2ds5WMltyBqAVdSgKz9SuOyE4(com.ingo.sdk.android.ux.viewprovider.CustomerServiceFragmentViewProvider customerServiceFragmentViewProvider, int i, androidx.compose.runtime.Composer composer, int i2) {
        customerServiceFragmentViewProvider.View(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eBzzelZQEaRvSC00onA3EXSRMoI(final com.ingo.sdk.android.ux.viewprovider.CustomerServiceFragmentViewProvider customerServiceFragmentViewProvider, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1952740360);
        if ((updateChangedFlags & 14) == 0) {
            i3 = (startRestartGroup.changed(customerServiceFragmentViewProvider) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if ((i3 & 11) != 2 || !startRestartGroup.getSkipping()) {
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), startRestartGroup, 6);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(2.0f)), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)), androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(customerServiceFragmentViewProvider.currentTheme(startRestartGroup, (i3 & 14) | com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable).getSecondaryBackgroundColor())), null, 2, null), startRestartGroup, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), startRestartGroup, 6);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.ingo.sdk.android.ux.viewprovider.CustomerServiceFragmentViewProvider$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.ingo.sdk.android.ux.viewprovider.CustomerServiceFragmentViewProvider.$r8$lambda$eBzzelZQEaRvSC00onA3EXSRMoI(com.ingo.sdk.android.ux.viewprovider.CustomerServiceFragmentViewProvider.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
