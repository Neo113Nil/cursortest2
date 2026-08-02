package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoConfig;", "", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "ctx", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "getCtx", "()Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/UIs;", "uis$delegate", "Lkotlin/Lazy;", "getUis", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/UIs;", "uis", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/Actions;", "actions$delegate", "getActions", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/Actions;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalInfoConfig {
    public static final int $stable = 8;

    /* renamed from: actions$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy actions;
    private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext ctx;

    /* renamed from: uis$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy uis;

    @javax.inject.Inject
    public PersonalInfoConfig(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
        this.ctx = configContext;
        this.uis = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConfig$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConfig.m12414$r8$lambda$kVs4Rm_tvyQgv40eutz0akf9LI(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConfig.this);
            }
        });
        this.actions = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConfig$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConfig.$r8$lambda$U5SDziUwCfdYyQBF4q4Pv1UEsTs(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConfig.this);
            }
        });
    }

    public final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext getCtx() {
        return this.ctx;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.UIs getUis() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.UIs) this.uis.getValue();
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.Actions getActions() {
        return (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.Actions) this.actions.getValue();
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.Actions $r8$lambda$U5SDziUwCfdYyQBF4q4Pv1UEsTs(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConfig personalInfoConfig) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.Actions(personalInfoConfig.ctx);
    }

    /* renamed from: $r8$lambda$kVs4Rm_tvyQgv4-0eutz0akf9LI, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.UIs m12414$r8$lambda$kVs4Rm_tvyQgv40eutz0akf9LI(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConfig personalInfoConfig) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.UIs(personalInfoConfig.ctx);
    }
}
