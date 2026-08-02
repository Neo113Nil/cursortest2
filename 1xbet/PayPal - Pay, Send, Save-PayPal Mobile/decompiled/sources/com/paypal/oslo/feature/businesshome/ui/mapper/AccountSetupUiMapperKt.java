package com.paypal.oslo.feature.businesshome.ui.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStatus;", "Lcom/paypal/oslo/feature/businesshome/ui/home/AccountSetupUiData;", "toUiData", "(Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStatus;)Lcom/paypal/oslo/feature/businesshome/ui/home/AccountSetupUiData;", "Lcom/paypal/oslo/feature/businesshome/ui/home/AccountSetupUiData$StepType;", "Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStepType;", "toDomainStepType", "(Lcom/paypal/oslo/feature/businesshome/ui/home/AccountSetupUiData$StepType;)Lcom/paypal/oslo/feature/businesshome/api/domain/model/AccountSetupStepType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AccountSetupUiMapperKt {
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData toUiData(com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStatus accountSetupStatus) {
        com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.Engagement engagement;
        com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step step;
        com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.AccountSetup accountSetup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSetupStatus, "");
        java.util.List<com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep> setupSteps = accountSetupStatus.getSetupSteps();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = setupSteps.iterator();
        while (true) {
            if (it.hasNext()) {
                com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep accountSetupStep = (com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep) it.next();
                int i = com.paypal.oslo.feature.businesshome.ui.mapper.AccountSetupUiMapperKt.WhenMappings.$EnumSwitchMapping$0[accountSetupStep.getType().ordinal()];
                if (i == 1) {
                    accountSetup = com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.AccountSetup.CONFIRM_EMAIL;
                } else if (i == 2) {
                    accountSetup = com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.AccountSetup.ADD_BANK_ACCOUNT;
                } else if (i == 3) {
                    accountSetup = com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.AccountSetup.VERIFY_ACCOUNT;
                } else {
                    if (i != 4 && i != 5) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    accountSetup = null;
                }
                com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step step2 = accountSetup != null ? new com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step(accountSetup, accountSetupStep.isCompleted()) : null;
                if (step2 != null) {
                    arrayList.add(step2);
                }
            } else {
                java.util.ArrayList arrayList2 = arrayList;
                java.util.List<com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep> recommendedSteps = accountSetupStatus.getRecommendedSteps();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStep accountSetupStep2 : recommendedSteps) {
                    int i2 = com.paypal.oslo.feature.businesshome.ui.mapper.AccountSetupUiMapperKt.WhenMappings.$EnumSwitchMapping$0[accountSetupStep2.getType().ordinal()];
                    if (i2 != 1 && i2 != 2 && i2 != 3) {
                        if (i2 == 4) {
                            engagement = com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.Engagement.REQUEST_DEBIT_CARD;
                            step = engagement != null ? null : new com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.Step(engagement, accountSetupStep2.isCompleted());
                            if (step == null) {
                                arrayList3.add(step);
                            }
                        } else if (i2 != 5) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    }
                    engagement = null;
                    if (engagement != null) {
                    }
                    if (step == null) {
                    }
                }
                return new com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData(arrayList2, arrayList3);
            }
        }
    }

    public static final com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType toDomainStepType(com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType stepType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepType, "");
        if (stepType == com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.AccountSetup.CONFIRM_EMAIL) {
            return com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.CONFIRM_EMAIL;
        }
        if (stepType == com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.AccountSetup.ADD_BANK_ACCOUNT) {
            return com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.ADD_BANK_ACCOUNT;
        }
        if (stepType == com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.AccountSetup.VERIFY_ACCOUNT) {
            return com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.VERIFY_ACCOUNT;
        }
        if (stepType == com.paypal.oslo.feature.businesshome.ui.home.AccountSetupUiData.StepType.Engagement.REQUEST_DEBIT_CARD) {
            return com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.REQUEST_DEBIT_CARD;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.values().length];
            try {
                iArr[com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.CONFIRM_EMAIL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.ADD_BANK_ACCOUNT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.VERIFY_ACCOUNT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.REQUEST_DEBIT_CARD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.businesshome.api.domain.model.AccountSetupStepType.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
