package com.paypal.oslo.feature.directdeposit.manager;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/manager/AtomicTransactManager;", "Lcom/paypal/oslo/feature/directdeposit/atomic/AtomicTransact;", "<init>", "()V", "Lcom/paypal/oslo/feature/directdeposit/atomic/AtomicTransactListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setAtomicTransactListener", "(Lcom/paypal/oslo/feature/directdeposit/atomic/AtomicTransactListener;)V", "Landroid/content/Context;", "context", "registerAtomicTransactReceiver", "(Landroid/content/Context;)V", "unRegisterAtomicTransactReceiver", "closeAtomicTransact", "Lcom/paypal/oslo/feature/directdeposit/atomic/AtomicTransactParams;", "params", "openAtomicTransactForm", "(Landroid/content/Context;Lcom/paypal/oslo/feature/directdeposit/atomic/AtomicTransactParams;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AtomicTransactManager implements com.paypal.oslo.feature.directdeposit.atomic.AtomicTransact {
    public static final int $stable = 8;
    private final /* synthetic */ com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactImpl getHighSpeedVideoFpsRangesFor = com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactImpl.INSTANCE;

    @javax.inject.Inject
    public AtomicTransactManager() {
    }

    @Override // com.paypal.oslo.feature.directdeposit.atomic.AtomicTransact
    public final void setAtomicTransactListener(com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactImpl.INSTANCE.setAtomicTransactListener(listener);
    }

    @Override // com.paypal.oslo.feature.directdeposit.atomic.AtomicTransact
    public final void registerAtomicTransactReceiver(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactImpl.INSTANCE.registerAtomicTransactReceiver(context);
    }

    @Override // com.paypal.oslo.feature.directdeposit.atomic.AtomicTransact
    public final void unRegisterAtomicTransactReceiver(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactImpl.INSTANCE.unRegisterAtomicTransactReceiver(context);
    }

    @Override // com.paypal.oslo.feature.directdeposit.atomic.AtomicTransact
    public final void closeAtomicTransact(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactImpl.INSTANCE.closeAtomicTransact(context);
    }

    @Override // com.paypal.oslo.feature.directdeposit.atomic.AtomicTransact
    public final void openAtomicTransactForm(android.content.Context context, com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactParams params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
        com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactImpl.INSTANCE.openAtomicTransactForm(context, params);
    }
}
