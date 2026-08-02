package financial.atomic.transact;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r"}, d2 = {"Lfinancial/atomic/transact/PausedTransactRef;", "", "Lfinancial/atomic/transact/Transact;", "transact", "<init>", "(Lfinancial/atomic/transact/Transact;)V", "Landroid/content/Context;", "context", "", "animated", "", "resume", "(Landroid/content/Context;Z)V", "Lfinancial/atomic/transact/Transact;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PausedTransactRef {
    private final financial.atomic.transact.Transact transact;

    public PausedTransactRef(financial.atomic.transact.Transact transact) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transact, "");
        this.transact = transact;
    }

    public static /* synthetic */ void resume$default(financial.atomic.transact.PausedTransactRef pausedTransactRef, android.content.Context context, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        pausedTransactRef.resume(context, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit resume$lambda$0(financial.atomic.transact.PausedTransactRef pausedTransactRef, android.content.Context context, financial.atomic.transact.service.TransactService transactService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactService, "");
        pausedTransactRef.transact.setPaused$transact_release(false);
        financial.atomic.transact.service.TransactService.showView$default(transactService, context, 0, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    public final void resume(final android.content.Context context, boolean animated) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        financial.atomic.e.e.INSTANCE.bind(context, new kotlin.jvm.functions.Function1() { // from class: financial.atomic.transact.PausedTransactRef$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit resume$lambda$0;
                resume$lambda$0 = financial.atomic.transact.PausedTransactRef.resume$lambda$0(financial.atomic.transact.PausedTransactRef.this, context, (financial.atomic.transact.service.TransactService) obj);
                return resume$lambda$0;
            }
        });
    }
}
