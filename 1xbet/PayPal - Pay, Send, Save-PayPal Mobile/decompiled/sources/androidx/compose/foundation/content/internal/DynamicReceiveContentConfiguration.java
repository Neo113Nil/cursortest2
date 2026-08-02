package androidx.compose.foundation.content.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/foundation/content/internal/DynamicReceiveContentConfiguration;", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "Landroidx/compose/foundation/content/ReceiveContentNode;", "receiveContentNode", "<init>", "(Landroidx/compose/foundation/content/ReceiveContentNode;)V", "Landroidx/compose/foundation/content/ReceiveContentNode;", "getReceiveContentNode", "()Landroidx/compose/foundation/content/ReceiveContentNode;", "Landroidx/compose/foundation/content/ReceiveContentListener;", "receiveContentListener", "Landroidx/compose/foundation/content/ReceiveContentListener;", "getReceiveContentListener", "()Landroidx/compose/foundation/content/ReceiveContentListener;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DynamicReceiveContentConfiguration extends androidx.compose.foundation.content.internal.ReceiveContentConfiguration {
    public static final int $stable = 8;
    private final androidx.compose.foundation.content.ReceiveContentListener receiveContentListener = new androidx.compose.foundation.content.ReceiveContentListener() { // from class: androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration$receiveContentListener$1

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private int getHighResolutionOutputSizeshNQ4ISI;

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public final void onDragStart() {
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration.this.getReceiveContentNode().getReceiveContentListener().onDragStart();
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public final void onDragEnd() {
            androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration.this.getReceiveContentNode().getReceiveContentListener().onDragEnd();
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public final void onDragEnter() {
            int i = this.getHighResolutionOutputSizeshNQ4ISI + 1;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            if (i == 1) {
                androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration.this.getReceiveContentNode().getReceiveContentListener().onDragEnter();
            }
            androidx.compose.foundation.content.ReceiveContentListener access$getParentReceiveContentListener = androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration.access$getParentReceiveContentListener(androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration.this);
            if (access$getParentReceiveContentListener != null) {
                access$getParentReceiveContentListener.onDragEnter();
            }
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public final void onDragExit() {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(i - 1, 0);
            this.getHighResolutionOutputSizeshNQ4ISI = coerceAtLeast;
            if (coerceAtLeast == 0 && i > 0) {
                androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration.this.getReceiveContentNode().getReceiveContentListener().onDragExit();
            }
            androidx.compose.foundation.content.ReceiveContentListener access$getParentReceiveContentListener = androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration.access$getParentReceiveContentListener(androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration.this);
            if (access$getParentReceiveContentListener != null) {
                access$getParentReceiveContentListener.onDragExit();
            }
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public final androidx.compose.foundation.content.TransferableContent onReceive(androidx.compose.foundation.content.TransferableContent transferableContent) {
            androidx.compose.foundation.content.TransferableContent onReceive = androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration.this.getReceiveContentNode().getReceiveContentListener().onReceive(transferableContent);
            if (onReceive == null) {
                return null;
            }
            androidx.compose.foundation.content.ReceiveContentListener access$getParentReceiveContentListener = androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration.access$getParentReceiveContentListener(androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration.this);
            return access$getParentReceiveContentListener == null ? onReceive : access$getParentReceiveContentListener.onReceive(onReceive);
        }
    };
    private final androidx.compose.foundation.content.ReceiveContentNode receiveContentNode;

    public DynamicReceiveContentConfiguration(androidx.compose.foundation.content.ReceiveContentNode receiveContentNode) {
        this.receiveContentNode = receiveContentNode;
    }

    public final androidx.compose.foundation.content.ReceiveContentNode getReceiveContentNode() {
        return this.receiveContentNode;
    }

    @Override // androidx.compose.foundation.content.internal.ReceiveContentConfiguration
    public final androidx.compose.foundation.content.ReceiveContentListener getReceiveContentListener() {
        return this.receiveContentListener;
    }

    public static final /* synthetic */ androidx.compose.foundation.content.ReceiveContentListener access$getParentReceiveContentListener(androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration dynamicReceiveContentConfiguration) {
        androidx.compose.foundation.content.internal.ReceiveContentConfiguration receiveContentConfiguration = androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt.getReceiveContentConfiguration(dynamicReceiveContentConfiguration.receiveContentNode);
        if (receiveContentConfiguration != null) {
            return receiveContentConfiguration.getReceiveContentListener();
        }
        return null;
    }
}
