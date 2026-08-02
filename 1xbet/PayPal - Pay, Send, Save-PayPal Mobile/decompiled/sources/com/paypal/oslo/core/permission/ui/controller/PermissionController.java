package com.paypal.oslo.core.permission.ui.controller;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/permission/ui/controller/PermissionController;", "", "Lcom/paypal/oslo/core/permission/domain/model/PermissionRequest;", "request", "Lcom/paypal/oslo/core/permission/domain/model/PermissionStatus;", "requestPermission", "(Lcom/paypal/oslo/core/permission/domain/model/PermissionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "navigateToPermissionSettings", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface PermissionController {
    void navigateToPermissionSettings();

    java.lang.Object requestPermission(com.paypal.oslo.core.permission.domain.model.PermissionRequest permissionRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.permission.domain.model.PermissionStatus> continuation);
}
