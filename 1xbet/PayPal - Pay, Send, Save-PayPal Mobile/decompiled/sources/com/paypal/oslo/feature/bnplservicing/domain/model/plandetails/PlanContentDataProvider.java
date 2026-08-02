package com.paypal.oslo.feature.bnplservicing.domain.model.plandetails;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanContentDataProvider;", "", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanActivity;", "getPlanActivities", "()Ljava/util/List;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Document;", "getPlanDocuments", "", "isPendingFraud", "()Z", "isMiniMirandaRequired"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface PlanContentDataProvider {
    default java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanActivity> getPlanActivities() {
        return null;
    }

    default java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.Document> getPlanDocuments() {
        return null;
    }

    default boolean isMiniMirandaRequired() {
        return false;
    }

    default boolean isPendingFraud() {
        return false;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanActivity> getPlanActivities(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanContentDataProvider planContentDataProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanContentDataProvider.super.getPlanActivities();
        }

        @java.lang.Deprecated
        public static java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.common.Document> getPlanDocuments(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanContentDataProvider planContentDataProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanContentDataProvider.super.getPlanDocuments();
        }

        @java.lang.Deprecated
        public static boolean isPendingFraud(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanContentDataProvider planContentDataProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanContentDataProvider.super.isPendingFraud();
        }

        @java.lang.Deprecated
        public static boolean isMiniMirandaRequired(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanContentDataProvider planContentDataProvider) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanContentDataProvider.super.isMiniMirandaRequired();
        }
    }
}
