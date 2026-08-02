package com.paypal.oslo.feature.onboarding.signup.phone.data.repository;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/phone/data/repository/SmsRetrieverRepositoryImpl;", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/repository/SmsRetrieverRepository;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/SmsRetrieverState;", "startListening", "()Lkotlinx/coroutines/flow/Flow;", "", "stopListening", "()V", "getHighSpeedVideoSizes", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SmsRetrieverRepositoryImpl implements com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.SmsRetrieverRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public SmsRetrieverRepositoryImpl(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRangesFor = context;
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.SmsRetrieverRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.onboarding.signup.phone.domain.model.SmsRetrieverState> startListening() {
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.paypal.oslo.feature.onboarding.signup.phone.data.repository.SmsRetrieverRepositoryImpl$startListening$1(this, null));
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.phone.domain.repository.SmsRetrieverRepository
    public final void stopListening() {
        com.paypal.oslo.feature.onboarding.signup.phone.data.receiver.SmsBroadcastReceiver.INSTANCE.clearListener();
    }
}
