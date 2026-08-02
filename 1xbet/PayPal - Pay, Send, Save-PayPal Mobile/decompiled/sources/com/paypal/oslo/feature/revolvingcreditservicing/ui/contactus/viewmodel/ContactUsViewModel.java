package com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 (2\u00020\u0001:\u0002)(B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a0\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ContactUsArgs;", "navArgs", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/phone/PhoneNumberFormatterFacade;", "phoneNumberFormatterFacade", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsReducer;", "reducer", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsObservabilityMiddleware$Factory;", "observabilityMiddlewareFactory", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ContactUsArgs;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/phone/PhoneNumberFormatterFacade;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsReducer;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsObservabilityMiddleware$Factory;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsEvent;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ContactUsArgs;", "getNavArgs", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ContactUsArgs;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsObservabilityMiddleware;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsObservabilityMiddleware;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsUiEffect;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "effect", "Lkotlinx/coroutines/flow/Flow;", "getEffect", "()Lkotlinx/coroutines/flow/Flow;", "Companion", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ContactUsViewModel extends androidx.view.ViewModel {

    @java.lang.Deprecated
    public static final java.lang.String STORE_NAME = "ContactUsViewModel.store";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsObservabilityMiddleware getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsUiEffect> effect;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsState, com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsUiEffect> getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ContactUsArgs navArgs;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsState> state;
    private static final com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsViewModel.Companion Companion = new com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsViewModel.Companion(null);
    public static final int $stable = 8;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsViewModel$Factory;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ContactUsArgs;", "navArgs", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsViewModel;", "create", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ContactUsArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ContactUsArgs navArgs);
    }

    @dagger.assisted.AssistedInject
    public ContactUsViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ContactUsArgs contactUsArgs, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade phoneNumberFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsReducer contactUsReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsObservabilityMiddleware.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactUsArgs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumberFormatterFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactUsReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        this.navArgs = contactUsArgs;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsObservabilityMiddleware create = factory.create(contactUsArgs.getCpi());
        this.getHighResolutionOutputSizeshNQ4ISI = create;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsState, com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>(STORE_NAME, com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsState.Initial.INSTANCE, contactUsReducer, kotlin.collections.CollectionsKt.listOf(create), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoFpsRanges = mviStateStore;
        processEvent(new com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsEvent.OnViewCreated(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade.format$default(phoneNumberFormatterFacade, contactUsArgs.getPhoneNumber(), false, null, 6, null), null));
        this.state = mviStateStore.getUiState();
        this.effect = mviStateStore.getUiEffect();
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ContactUsArgs getNavArgs() {
        return this.navArgs;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsState> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsUiEffect> getEffect() {
        return this.effect;
    }

    public final void processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoFpsRanges.onEvent(event);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsViewModel$Companion;", "", "<init>", "()V", "", "STORE_NAME", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
