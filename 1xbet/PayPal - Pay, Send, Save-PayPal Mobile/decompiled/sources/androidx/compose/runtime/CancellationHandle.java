package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/CancellationHandle;", "", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CancellationHandle {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.CancellationHandle.Companion INSTANCE = androidx.compose.runtime.CancellationHandle.Companion.getHighResolutionOutputSizeshNQ4ISI;

    void cancel();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/runtime/CancellationHandle$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/CancellationHandle;", "Empty", "Landroidx/compose/runtime/CancellationHandle;", "getEmpty$runtime", "()Landroidx/compose/runtime/CancellationHandle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ androidx.compose.runtime.CancellationHandle.Companion getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.runtime.CancellationHandle.Companion();
        private static final androidx.compose.runtime.CancellationHandle Empty = new androidx.compose.runtime.CancellationHandle() { // from class: androidx.compose.runtime.CancellationHandle$Companion$$ExternalSyntheticLambda0
            @Override // androidx.compose.runtime.CancellationHandle
            public final void cancel() {
                androidx.compose.runtime.CancellationHandle.Companion.$r8$lambda$iIE6TqmQYqxI5PjNliW9hwi3Q_E();
            }
        };

        public static /* synthetic */ void $r8$lambda$iIE6TqmQYqxI5PjNliW9hwi3Q_E() {
        }

        private Companion() {
        }

        public final androidx.compose.runtime.CancellationHandle getEmpty$runtime() {
            return Empty;
        }
    }
}
