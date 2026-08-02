package com.paypal.oslo.feature.directdeposit.atomic;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0010R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/atomic/AtomicTransactImpl;", "Lcom/paypal/oslo/feature/directdeposit/atomic/AtomicTransact;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/directdeposit/atomic/AtomicTransactParams;", "params", "", "openAtomicTransactForm", "(Landroid/content/Context;Lcom/paypal/oslo/feature/directdeposit/atomic/AtomicTransactParams;)V", "registerAtomicTransactReceiver", "(Landroid/content/Context;)V", "Lcom/paypal/oslo/feature/directdeposit/atomic/AtomicTransactListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setAtomicTransactListener", "(Lcom/paypal/oslo/feature/directdeposit/atomic/AtomicTransactListener;)V", "unRegisterAtomicTransactReceiver", "closeAtomicTransact", "Lcom/paypal/oslo/feature/directdeposit/atomic/AtomicTransactListener;", "getListener", "()Lcom/paypal/oslo/feature/directdeposit/atomic/AtomicTransactListener;", "setListener", "Lcom/paypal/oslo/feature/directdeposit/atomic/AtomicTransactImpl$receiver$1;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/directdeposit/atomic/AtomicTransactImpl$receiver$1;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AtomicTransactImpl implements com.paypal.oslo.feature.directdeposit.atomic.AtomicTransact {
    private static com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactListener listener;
    public static final com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactImpl INSTANCE = new com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactImpl();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactImpl$receiver$1 getHighSpeedVideoFpsRangesFor = new financial.atomic.transact.receiver.TransactBroadcastReceiver() { // from class: com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactImpl$receiver$1
        @Override // financial.atomic.transact.receiver.TransactBroadcastReceiver
        public final void onClose(org.json.JSONObject data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactListener listener2 = com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactImpl.INSTANCE.getListener();
            if (listener2 != null) {
                listener2.onAtomicTransactClose(data);
            }
        }

        @Override // financial.atomic.transact.receiver.TransactBroadcastReceiver
        public final void onFinish(org.json.JSONObject data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactListener listener2 = com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactImpl.INSTANCE.getListener();
            if (listener2 != null) {
                listener2.onAtomicTransactFinish(data);
            }
        }

        @Override // financial.atomic.transact.receiver.TransactBroadcastReceiver
        public final void onInteraction(org.json.JSONObject data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactListener listener2 = com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactImpl.INSTANCE.getListener();
            if (listener2 != null) {
                listener2.onAtomicTransactInteraction(data);
            }
        }

        @Override // financial.atomic.transact.receiver.TransactBroadcastReceiver
        public final void onDataRequest(java.util.List<java.lang.String> fields, java.lang.String taskId, java.lang.String userId, java.lang.String identifier) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fields, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "");
            super.onDataRequest(fields, taskId, userId, identifier);
            com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactListener listener2 = com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactImpl.INSTANCE.getListener();
            if (listener2 != null) {
                listener2.onAtomicTransactDataRequest(fields, taskId, userId, identifier);
            }
        }

        @Override // financial.atomic.transact.receiver.TransactBroadcastReceiver, android.content.BroadcastReceiver
        public final void onReceive(android.content.Context context, android.content.Intent intent) {
            super.onReceive(context, intent);
        }
    };
    public static final int $stable = 8;

    private AtomicTransactImpl() {
    }

    public final com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactListener getListener() {
        return listener;
    }

    public final void setListener(com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactListener atomicTransactListener) {
        listener = atomicTransactListener;
    }

    @Override // com.paypal.oslo.feature.directdeposit.atomic.AtomicTransact
    public final void registerAtomicTransactReceiver(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        financial.atomic.transact.Transact.INSTANCE.registerReceiver(context, getHighSpeedVideoFpsRangesFor);
    }

    @Override // com.paypal.oslo.feature.directdeposit.atomic.AtomicTransact
    public final void setAtomicTransactListener(com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactListener listener2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener2, "");
        listener = listener2;
    }

    @Override // com.paypal.oslo.feature.directdeposit.atomic.AtomicTransact
    public final void unRegisterAtomicTransactReceiver(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        financial.atomic.transact.Transact.INSTANCE.unregisterReceiver(context, getHighSpeedVideoFpsRangesFor);
    }

    @Override // com.paypal.oslo.feature.directdeposit.atomic.AtomicTransact
    public final void closeAtomicTransact(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        financial.atomic.transact.Transact.INSTANCE.close(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.feature.directdeposit.atomic.AtomicTransact
    public final void openAtomicTransactForm(android.content.Context context, com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactParams params) {
        financial.atomic.transact.Config.Language language;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
        java.lang.String token = params.getToken();
        financial.atomic.transact.Config.Product product = financial.atomic.transact.Config.Product.DEPOSIT;
        if (kotlin.jvm.internal.Intrinsics.areEqual(java.util.Locale.getDefault().getLanguage(), "es")) {
            language = financial.atomic.transact.Config.Language.es;
        } else {
            language = financial.atomic.transact.Config.Language.en;
        }
        financial.atomic.transact.Config.Language language2 = language;
        financial.atomic.transact.Config.Deeplink deeplink = new financial.atomic.transact.Config.Deeplink(financial.atomic.transact.Config.Deeplink.Step.SEARCH_COMPANY, (financial.atomic.transact.Config.Deeplink.App) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, (java.lang.String) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        financial.atomic.transact.Config.Theme theme = new financial.atomic.transact.Config.Theme((java.lang.String) null, (java.lang.String) null, java.lang.Boolean.FALSE, (financial.atomic.transact.Config.NavigationOptions) null, 11, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        java.util.ArrayList arrayListOf = kotlin.collections.CollectionsKt.arrayListOf(financial.atomic.transact.Config.Handoff.AUTHENTICATION_SUCCESS);
        java.lang.String entryPoint = params.getEntryPoint();
        java.lang.String contextId = params.getContextId();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("entry_point", entryPoint);
        jSONObject.put("context_id", contextId);
        financial.atomic.transact.Transact.Companion.present$default(financial.atomic.transact.Transact.INSTANCE, context, new financial.atomic.transact.Config(token, product, (financial.atomic.transact.Config.Environment) null, (java.lang.String) null, (financial.atomic.transact.Config.Product) null, (financial.atomic.transact.Config.Distribution) null, theme, deeplink, jSONObject, language2, (financial.atomic.transact.Config.Search) null, (java.util.List) arrayListOf, (financial.atomic.transact.Config.Experiments) (0 == true ? 1 : 0), false, false, false, (financial.atomic.transact.Config.Scope) null, (java.lang.String) (0 == true ? 1 : 0), (financial.atomic.transact.Config.Product) (0 == true ? 1 : 0), (financial.atomic.transact.Config.Customer) null, (financial.atomic.transact.Config.Features) (0 == true ? 1 : 0), (java.lang.String) null, (financial.atomic.transact.Config.DeferredPaymentMethodStrategy) (0 == true ? 1 : 0), 8385596, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, 0, 12, null);
    }
}
