package com.paypal.oslo.feature.oneonboarding.inventory.views.signupwithgoogle.data;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/signupwithgoogle/data/GoogleAccountInfoDisplayComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/ViewComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/GoogleAccountInfoDisplayComponentFragment;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/signupwithgoogle/domain/GoogleAccountInfoDisplayComponentConfig;", "<init>", "()V", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "Lkotlin/Pair;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "parse", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/GoogleAccountInfoDisplayComponentFragment;)Lkotlin/Pair;", "Lkotlin/reflect/KClass;", "fragmentClass", "Lkotlin/reflect/KClass;", "getFragmentClass", "()Lkotlin/reflect/KClass;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GoogleAccountInfoDisplayComponentParser implements com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser<com.paypal.oslo.feature.oneonboarding.graphql.fragment.GoogleAccountInfoDisplayComponentFragment, com.paypal.oslo.feature.oneonboarding.inventory.views.signupwithgoogle.domain.GoogleAccountInfoDisplayComponentConfig> {
    public static final int $stable = 8;
    private final kotlin.reflect.KClass<com.paypal.oslo.feature.oneonboarding.graphql.fragment.GoogleAccountInfoDisplayComponentFragment> fragmentClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.graphql.fragment.GoogleAccountInfoDisplayComponentFragment.class);

    @javax.inject.Inject
    public GoogleAccountInfoDisplayComponentParser() {
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser
    public final kotlin.reflect.KClass<com.paypal.oslo.feature.oneonboarding.graphql.fragment.GoogleAccountInfoDisplayComponentFragment> getFragmentClass() {
        return this.fragmentClass;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser
    public final kotlin.Pair<com.paypal.oslo.feature.oneonboarding.inventory.views.signupwithgoogle.domain.GoogleAccountInfoDisplayComponentConfig, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> parse(com.paypal.oslo.feature.oneonboarding.graphql.fragment.GoogleAccountInfoDisplayComponentFragment component) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "");
        java.lang.String email = component.getEmail();
        java.lang.Object profilePictureUrl = component.getProfilePictureUrl();
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        java.lang.String obj = profilePictureUrl != null ? profilePictureUrl.toString() : null;
        if (email != null && obj != null) {
            return kotlin.TuplesKt.to(new com.paypal.oslo.feature.oneonboarding.inventory.views.signupwithgoogle.domain.GoogleAccountInfoDisplayComponentConfig(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl(component.get__typename()), com.paypal.oslo.feature.oneonboarding.api.domain.Email.m16627constructorimpl(email), com.paypal.oslo.feature.oneonboarding.inventory.views.signupwithgoogle.domain.ProfilePictureUrl.m17080constructorimpl(obj), defaultConstructorMarker), kotlin.collections.CollectionsKt.emptyList());
        }
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.oneonboarding.LoggerKt.log;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to parse GoogleAccountInfoDisplayComponent: email=");
        sb.append(email);
        sb.append(", profilePictureUrl=");
        sb.append(obj);
        com.paypal.android.logger.Logger.w$default(logger, sb.toString(), null, null, 6, null);
        return null;
    }
}
