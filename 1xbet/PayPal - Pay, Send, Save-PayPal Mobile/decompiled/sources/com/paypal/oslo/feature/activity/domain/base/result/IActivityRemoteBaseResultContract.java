package com.paypal.oslo.feature.activity.domain.base.result;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/result/IActivityRemoteBaseResultContract;", "T", "Lcom/paypal/oslo/feature/activity/domain/base/result/IActivityRemoteBaseResult;", "", "isValid", "()Z", "input", "", "toDomainModel", "(Ljava/lang/Object;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface IActivityRemoteBaseResultContract<T> extends com.paypal.oslo.feature.activity.domain.base.result.IActivityRemoteBaseResult {
    boolean isValid();

    void toDomainModel(T input);
}
