package com.paypal.oslo.feature.businesshome.ui.businessexperiencedisabled;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/ui/businessexperiencedisabled/BusinessExperienceDisabledViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/api/IdentitySession;", "identitySession", "<init>", "(Lcom/paypal/oslo/feature/identity/api/IdentitySession;)V", "", "logout", "()V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/api/IdentitySession;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BusinessExperienceDisabledViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.api.IdentitySession getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public BusinessExperienceDisabledViewModel(com.paypal.oslo.feature.identity.api.IdentitySession identitySession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identitySession, "");
        this.getHighResolutionOutputSizeshNQ4ISI = identitySession;
    }

    public final void logout() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesshome.ui.businessexperiencedisabled.BusinessExperienceDisabledViewModel$logout$1(this, null), 3, null);
    }
}
