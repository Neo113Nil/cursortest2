package com.paypal.oslo.feature.cashin.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/cashin/domain/usecase/CheckLocationPermissionUseCaseImpl;", "Lcom/paypal/oslo/feature/cashin/domain/usecase/CheckLocationPermissionUseCase;", "<init>", "()V", "Landroid/content/Context;", "context", "", "invoke", "(Landroid/content/Context;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CheckLocationPermissionUseCaseImpl implements com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCase {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CheckLocationPermissionUseCaseImpl() {
    }

    @Override // com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCase
    public final boolean invoke(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return androidx.core.content.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || (androidx.core.content.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0);
    }
}
