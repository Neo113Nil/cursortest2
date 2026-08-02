package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class TtpPermissionsRationaleScreenKt$TtpPermissionsRationaleScreen$callbacks$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.core.permission.domain.model.PermissionStatus, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.core.permission.domain.model.PermissionStatus permissionStatus) {
        com.paypal.oslo.core.permission.domain.model.PermissionStatus permissionStatus2 = permissionStatus;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionStatus2, "");
        ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel) this.receiver).onLocationPermissionChecked$business_pay_and_get_paid_prodRelease(permissionStatus2);
        return kotlin.Unit.INSTANCE;
    }

    TtpPermissionsRationaleScreenKt$TtpPermissionsRationaleScreen$callbacks$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel.class, "onLocationPermissionChecked", "onLocationPermissionChecked$business_pay_and_get_paid_prodRelease(Lcom/paypal/oslo/core/permission/domain/model/PermissionStatus;)V", 0);
    }
}
