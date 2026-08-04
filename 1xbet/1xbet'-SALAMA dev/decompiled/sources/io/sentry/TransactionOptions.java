package io.sentry;

/* JADX INFO: loaded from: classes2.dex */
public final class TransactionOptions extends SpanOptions {
    public static final long DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION = 30000;
    private CustomSamplingContext customSamplingContext = null;
    private boolean isAppStartTransaction = false;
    private boolean waitForChildren = false;
    private Long idleTimeout = null;
    private Long deadlineTimeout = null;
    private TransactionFinishedCallback transactionFinishedCallback = null;
    private ISpanFactory spanFactory = null;

    public CustomSamplingContext getCustomSamplingContext() {
        return this.customSamplingContext;
    }

    public Long getDeadlineTimeout() {
        return this.deadlineTimeout;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public ISpanFactory getSpanFactory() {
        return this.spanFactory;
    }

    public TransactionFinishedCallback getTransactionFinishedCallback() {
        return this.transactionFinishedCallback;
    }

    public boolean isAppStartTransaction() {
        return this.isAppStartTransaction;
    }

    public boolean isBindToScope() {
        return ScopeBindingMode.ON == getScopeBindingMode();
    }

    public boolean isWaitForChildren() {
        return this.waitForChildren;
    }

    public void setAppStartTransaction(boolean z4) {
        this.isAppStartTransaction = z4;
    }

    public void setBindToScope(boolean z4) {
        setScopeBindingMode(z4 ? ScopeBindingMode.ON : ScopeBindingMode.OFF);
    }

    public void setCustomSamplingContext(CustomSamplingContext customSamplingContext) {
        this.customSamplingContext = customSamplingContext;
    }

    public void setDeadlineTimeout(Long l7) {
        this.deadlineTimeout = l7;
    }

    public void setIdleTimeout(Long l7) {
        this.idleTimeout = l7;
    }

    public void setSpanFactory(ISpanFactory iSpanFactory) {
        this.spanFactory = iSpanFactory;
    }

    public void setTransactionFinishedCallback(TransactionFinishedCallback transactionFinishedCallback) {
        this.transactionFinishedCallback = transactionFinishedCallback;
    }

    public void setWaitForChildren(boolean z4) {
        this.waitForChildren = z4;
    }
}
