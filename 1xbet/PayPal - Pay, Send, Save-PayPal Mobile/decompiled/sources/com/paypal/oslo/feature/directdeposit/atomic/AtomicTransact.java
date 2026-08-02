package com.paypal.oslo.feature.directdeposit.atomic;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/atomic/AtomicTransact;", "", "Lcom/paypal/oslo/feature/directdeposit/atomic/AtomicTransactListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setAtomicTransactListener", "(Lcom/paypal/oslo/feature/directdeposit/atomic/AtomicTransactListener;)V", "Landroid/content/Context;", "context", "registerAtomicTransactReceiver", "(Landroid/content/Context;)V", "unRegisterAtomicTransactReceiver", "closeAtomicTransact", "Lcom/paypal/oslo/feature/directdeposit/atomic/AtomicTransactParams;", "params", "openAtomicTransactForm", "(Landroid/content/Context;Lcom/paypal/oslo/feature/directdeposit/atomic/AtomicTransactParams;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface AtomicTransact {
    void closeAtomicTransact(android.content.Context context);

    void openAtomicTransactForm(android.content.Context context, com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactParams params);

    void registerAtomicTransactReceiver(android.content.Context context);

    void setAtomicTransactListener(com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactListener listener);

    void unRegisterAtomicTransactReceiver(android.content.Context context);
}
