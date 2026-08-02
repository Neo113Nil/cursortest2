package androidx.compose.foundation.content.internal;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "", "<init>", "()V", "Landroidx/compose/foundation/content/TransferableContent;", "transferableContent", "", "onCommitContent", "(Landroidx/compose/foundation/content/TransferableContent;)Z", "Landroidx/compose/foundation/content/ReceiveContentListener;", "getReceiveContentListener", "()Landroidx/compose/foundation/content/ReceiveContentListener;", "receiveContentListener", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ReceiveContentConfiguration {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.content.internal.ReceiveContentConfiguration.Companion INSTANCE = new androidx.compose.foundation.content.internal.ReceiveContentConfiguration.Companion(null);

    /* renamed from: getReceiveContentListener */
    public abstract androidx.compose.foundation.content.ReceiveContentListener getGetHighSpeedVideoFpsRanges();

    public final boolean onCommitContent(androidx.compose.foundation.content.TransferableContent transferableContent) {
        return !kotlin.jvm.internal.Intrinsics.areEqual(getGetHighSpeedVideoFpsRanges().onReceive(transferableContent), transferableContent);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/content/ReceiveContentListener;", "receiveContentListener", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "invoke", "(Landroidx/compose/foundation/content/ReceiveContentListener;)Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.foundation.content.internal.ReceiveContentConfiguration invoke(androidx.compose.foundation.content.ReceiveContentListener receiveContentListener) {
            return new androidx.compose.foundation.content.internal.ReceiveContentConfigurationImpl(receiveContentListener);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
