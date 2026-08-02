package com.zettle.sdk.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005"}, d2 = {"Lcom/zettle/sdk/ui/ZettleApiResult;", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "Failed", "Lcom/zettle/sdk/ui/ZettleApiResult$Completed;", "Lcom/zettle/sdk/ui/ZettleApiResult$Failed;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ZettleApiResult {

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0014\u0010\u0005\u001a\u00028\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/ui/ZettleApiResult$Completed;", "T", "Lcom/zettle/sdk/ui/ZettleApiResult;", "getPayload", "()Ljava/lang/Object;", "payload"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Completed<T> extends com.zettle.sdk.ui.ZettleApiResult {
        T getPayload();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/ui/ZettleApiResult$Failed;", "Lcom/zettle/sdk/ui/ZettleApiResult;", "Lcom/zettle/sdk/ui/FailureReason;", "getReason", "()Lcom/zettle/sdk/ui/FailureReason;", "reason"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Failed extends com.zettle.sdk.ui.ZettleApiResult {
        com.zettle.sdk.ui.FailureReason getReason();
    }
}
