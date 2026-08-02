package com.paypal.oslo.feature.activity.domain.common.extensions;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class ActivityMapperExtensionsKt$transformToDomainResultToGroupItemsByDate$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DateHeader> {
    public static final com.paypal.oslo.feature.activity.domain.common.extensions.ActivityMapperExtensionsKt$transformToDomainResultToGroupItemsByDate$1 getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.activity.domain.common.extensions.ActivityMapperExtensionsKt$transformToDomainResultToGroupItemsByDate$1();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DateHeader invoke(java.lang.String str) {
        java.lang.String str2 = str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return com.paypal.oslo.feature.activity.domain.common.extensions.ActivityMapperExtensionsKt.access$createDateHeader(str2);
    }

    ActivityMapperExtensionsKt$transformToDomainResultToGroupItemsByDate$1() {
        super(1, com.paypal.oslo.feature.activity.domain.common.extensions.ActivityMapperExtensionsKt.class, "createDateHeader", "createDateHeader(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$DateHeader;", 1);
    }
}
