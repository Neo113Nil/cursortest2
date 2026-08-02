package com.paypal.oslo.feature.verificationcapture.api.widget;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\tH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetInterface;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetConfig;", "config", "", "setConfig", "(Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetConfig;)V", "", "key", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Ljava/lang/String;Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetListener;)V", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/ErrorMessagePriority;", "priority", "message", "setMessage", "(Lcom/paypal/oslo/feature/verificationcapture/api/widget/ErrorMessagePriority;Ljava/lang/String;)V", "", "visibility", "setViewVisibility", "(I)V", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetResult;", "getResult", "()Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetResult;", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetRenderState;", "getRenderState", "()Lkotlinx/coroutines/flow/StateFlow;", "renderState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class IdScanWidgetInterface {
    public static final int $stable = 0;

    public abstract kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetRenderState> getRenderState();

    public abstract com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetResult getResult();

    public abstract void setConfig(com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetConfig config);

    public abstract void setListener(java.lang.String key, com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetListener listener);

    public abstract void setMessage(com.paypal.oslo.feature.verificationcapture.api.widget.ErrorMessagePriority priority, java.lang.String message);

    public abstract void setViewVisibility(int visibility);
}
