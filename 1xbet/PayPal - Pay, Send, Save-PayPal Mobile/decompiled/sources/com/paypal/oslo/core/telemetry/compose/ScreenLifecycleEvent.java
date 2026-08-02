package com.paypal.oslo.core.telemetry.compose;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent;", "", "<init>", "()V", "Landroidx/navigation3/runtime/NavKey;", "getDestination", "()Landroidx/navigation3/runtime/NavKey;", "destination", "Appeared", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Disappeared", "Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Appeared;", "Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Disappeared;", "Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class ScreenLifecycleEvent {
    public static final int $stable = 0;

    public abstract androidx.navigation3.runtime.NavKey getDestination();

    private ScreenLifecycleEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u0006\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Appeared;", "Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent;", "Landroidx/navigation3/runtime/NavKey;", "destination", "", "isSignalInteractionSupported", "isSignalInteractionReported", "<init>", "(Landroidx/navigation3/runtime/NavKey;ZZ)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "component2", "()Z", "component3", "copy", "(Landroidx/navigation3/runtime/NavKey;ZZ)Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Appeared;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/navigation3/runtime/NavKey;", "getDestination", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Appeared extends com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent {
        public static final int $stable = 8;
        private final androidx.navigation3.runtime.NavKey destination;
        private final boolean isSignalInteractionReported;
        private final boolean isSignalInteractionSupported;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Appeared(androidx.navigation3.runtime.NavKey navKey, boolean z, boolean z2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
            this.destination = navKey;
            this.isSignalInteractionSupported = z;
            this.isSignalInteractionReported = z2;
        }

        @Override // com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent
        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public final boolean isSignalInteractionSupported() {
            return this.isSignalInteractionSupported;
        }

        public final boolean isSignalInteractionReported() {
            return this.isSignalInteractionReported;
        }

        public final java.lang.String toString() {
            androidx.navigation3.runtime.NavKey navKey = this.destination;
            boolean z = this.isSignalInteractionSupported;
            boolean z2 = this.isSignalInteractionReported;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Appeared(destination=");
            sb.append(navKey);
            sb.append(", isSignalInteractionSupported=");
            sb.append(z);
            sb.append(", isSignalInteractionReported=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.destination.hashCode() * 31) + java.lang.Boolean.hashCode(this.isSignalInteractionSupported)) * 31) + java.lang.Boolean.hashCode(this.isSignalInteractionReported);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Appeared)) {
                return false;
            }
            com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Appeared appeared = (com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Appeared) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.destination, appeared.destination) && this.isSignalInteractionSupported == appeared.isSignalInteractionSupported && this.isSignalInteractionReported == appeared.isSignalInteractionReported;
        }

        public final com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Appeared copy(androidx.navigation3.runtime.NavKey destination, boolean isSignalInteractionSupported, boolean isSignalInteractionReported) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
            return new com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Appeared(destination, isSignalInteractionSupported, isSignalInteractionReported);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsSignalInteractionReported() {
            return this.isSignalInteractionReported;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSignalInteractionSupported() {
            return this.isSignalInteractionSupported;
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public static /* synthetic */ com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Appeared copy$default(com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Appeared appeared, androidx.navigation3.runtime.NavKey navKey, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navKey = appeared.destination;
            }
            if ((i & 2) != 0) {
                z = appeared.isSignalInteractionSupported;
            }
            if ((i & 4) != 0) {
                z2 = appeared.isSignalInteractionReported;
            }
            return appeared.copy(navKey, z, z2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Ready;", "Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent;", "Landroidx/navigation3/runtime/NavKey;", "destination", "<init>", "(Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Ready;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/navigation3/runtime/NavKey;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready extends com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent {
        public static final int $stable = 8;
        private final androidx.navigation3.runtime.NavKey destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ready(androidx.navigation3.runtime.NavKey navKey) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
            this.destination = navKey;
        }

        @Override // com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent
        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public final java.lang.String toString() {
            androidx.navigation3.runtime.NavKey navKey = this.destination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(destination=");
            sb.append(navKey);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.destination.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Ready) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, ((com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Ready) other).destination);
        }

        public final com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Ready copy(androidx.navigation3.runtime.NavKey destination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
            return new com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Ready(destination);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public static /* synthetic */ com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Ready copy$default(com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Ready ready, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navKey = ready.destination;
            }
            return ready.copy(navKey);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Disappeared;", "Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent;", "Landroidx/navigation3/runtime/NavKey;", "destination", "<init>", "(Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Disappeared;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/navigation3/runtime/NavKey;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Disappeared extends com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent {
        public static final int $stable = 8;
        private final androidx.navigation3.runtime.NavKey destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Disappeared(androidx.navigation3.runtime.NavKey navKey) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
            this.destination = navKey;
        }

        @Override // com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent
        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public final java.lang.String toString() {
            androidx.navigation3.runtime.NavKey navKey = this.destination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Disappeared(destination=");
            sb.append(navKey);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.destination.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Disappeared) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, ((com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Disappeared) other).destination);
        }

        public final com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Disappeared copy(androidx.navigation3.runtime.NavKey destination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
            return new com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Disappeared(destination);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public static /* synthetic */ com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Disappeared copy$default(com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Disappeared disappeared, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navKey = disappeared.destination;
            }
            return disappeared.copy(navKey);
        }
    }

    public /* synthetic */ ScreenLifecycleEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
