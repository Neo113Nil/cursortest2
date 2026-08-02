package com.paypal.oslo.core.appidentity.di;

@dagger.hilt.android.EarlyEntryPoint
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/appidentity/di/AppIdentityEntryPoint;", "Lcom/paypal/oslo/core/di/CoreEntryPoint;", "Lcom/paypal/oslo/core/appidentity/data/AppGUID;", "appGuid", "()Lcom/paypal/oslo/core/appidentity/data/AppGUID;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AppIdentityEntryPoint extends com.paypal.oslo.core.di.CoreEntryPoint {
    com.paypal.oslo.core.appidentity.data.AppGUID appGuid();
}
