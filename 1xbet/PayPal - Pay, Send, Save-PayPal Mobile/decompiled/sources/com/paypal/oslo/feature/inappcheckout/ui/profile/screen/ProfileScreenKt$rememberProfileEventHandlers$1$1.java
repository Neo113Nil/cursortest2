package com.paypal.oslo.feature.inappcheckout.ui.profile.screen;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\n\u0018\u00002\u00020\u0001R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u000f\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/profile/screen/ProfileScreenKt$rememberProfileEventHandlers$1$1;", "", "Lkotlin/Function0;", "", "onBackPress", "Lkotlin/jvm/functions/Function0;", "getOnBackPress", "()Lkotlin/jvm/functions/Function0;", "onLogout", "getOnLogout", "onNavigateToPrivacy", "getOnNavigateToPrivacy", "onNavigateToTerms", "getOnNavigateToTerms", "onNavigateToPolicies", "getOnNavigateToPolicies"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProfileScreenKt$rememberProfileEventHandlers$1$1 {
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onBackPress;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onLogout;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateToPolicies;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateToPrivacy;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateToTerms;

    ProfileScreenKt$rememberProfileEventHandlers$1$1(final com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel profileViewModel) {
        this.onBackPress = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$rememberProfileEventHandlers$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$rememberProfileEventHandlers$1$1.$r8$lambda$IsN2LqeryFUa50KFqtOlWKzr0do(com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel.this);
            }
        };
        this.onLogout = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$rememberProfileEventHandlers$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$rememberProfileEventHandlers$1$1.m15550$r8$lambda$y4GI4iDtVJ5c74t3o_ukgjwLGA(com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel.this);
            }
        };
        this.onNavigateToPrivacy = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$rememberProfileEventHandlers$1$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$rememberProfileEventHandlers$1$1.$r8$lambda$upp2SrKGrDQPpthVYbv50R7q2_g(com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel.this);
            }
        };
        this.onNavigateToTerms = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$rememberProfileEventHandlers$1$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$rememberProfileEventHandlers$1$1.m15551$r8$lambda$3FyrbrUm3KYQFRA44ocKNACUOk(com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel.this);
            }
        };
        this.onNavigateToPolicies = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$rememberProfileEventHandlers$1$1$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$rememberProfileEventHandlers$1$1.$r8$lambda$WCbGZfw3J4wYaDZmhKBkQqrnWd8(com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel.this);
            }
        };
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnBackPress() {
        return this.onBackPress;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnLogout() {
        return this.onLogout;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnNavigateToPrivacy() {
        return this.onNavigateToPrivacy;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnNavigateToTerms() {
        return this.onNavigateToTerms;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnNavigateToPolicies() {
        return this.onNavigateToPolicies;
    }

    /* renamed from: $r8$lambda$-y4GI4iDtVJ5c74t3o_ukgjwLGA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15550$r8$lambda$y4GI4iDtVJ5c74t3o_ukgjwLGA(com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel profileViewModel) {
        profileViewModel.onEvent(com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.LogoutUser.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$3FyrbrUm3-KYQFRA44ocKNACUOk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15551$r8$lambda$3FyrbrUm3KYQFRA44ocKNACUOk(com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel profileViewModel) {
        profileViewModel.onEvent(com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.NavigateToTerms.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IsN2LqeryFUa50KFqtOlWKzr0do(com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel profileViewModel) {
        profileViewModel.onEvent(com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.HandleBackPress.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WCbGZfw3J4wYaDZmhKBkQqrnWd8(com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel profileViewModel) {
        profileViewModel.onEvent(com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.NavigateToPolicies.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$upp2SrKGrDQPpthVYbv50R7q2_g(com.paypal.oslo.feature.inappcheckout.ui.profile.viewmodel.ProfileViewModel profileViewModel) {
        profileViewModel.onEvent(com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.NavigateToPrivacy.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
