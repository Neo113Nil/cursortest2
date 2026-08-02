package com.paypal.oslo.feature.pushnotification.api.optin;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/api/optin/PermissionStatusHolder;", "", "Lkotlin/Function0;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PermissionStatus;", "get", "Lkotlin/Function1;", "", "set", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function0;", "getGet", "()Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "getSet", "()Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PermissionStatusHolder {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function0<com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus> get;
    private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus, kotlin.Unit> set;

    /* JADX WARN: Multi-variable type inference failed */
    public PermissionStatusHolder(kotlin.jvm.functions.Function0<? extends com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus> function0, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.get = function0;
        this.set = function1;
    }

    public final kotlin.jvm.functions.Function0<com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus> getGet() {
        return this.get;
    }

    public final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus, kotlin.Unit> getSet() {
        return this.set;
    }
}
