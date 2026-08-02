package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00060\u0002R\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\u00052\n\u0010\n\u001a\u00060\u0002R\u00020\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\b\u0018\u00010\u0002R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001c"}, d2 = {"Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier$Node;", "<init>", "()V", "", "waitForFirstLayout", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier$Node;", "node", "update", "(Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier$Node;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier$Node;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlinx/coroutines/CompletableDeferred;", "getHighSpeedVideoFpsRanges", "Node"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AwaitFirstLayoutModifier extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.Node> {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlinx.coroutines.CompletableDeferred<kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.Node Camera2StreamConfigurationMap;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        return other == this;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.Node node) {
    }

    public final java.lang.Object waitForFirstLayout(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CompletableDeferred<kotlin.Unit> completableDeferred = this.getHighSpeedVideoFpsRanges;
        if (completableDeferred == null) {
            completableDeferred = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            this.getHighSpeedVideoFpsRanges = completableDeferred;
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.Node node = this.Camera2StreamConfigurationMap;
            if (node != null && node.getIsAttached()) {
                node.requestOnAfterLayoutCallback();
            }
        }
        java.lang.Object await = completableDeferred.await(continuation);
        return await == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? await : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.Node getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.Node();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("AwaitFirstLayoutModifier");
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0006R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier$Node;", "Landroidx/compose/ui/Modifier$Node;", "<init>", "(Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;)V", "", "onAttach", "()V", "requestOnAfterLayoutCallback", "onDetach", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class Node extends androidx.compose.ui.Modifier.Node {
        private androidx.compose.ui.node.DelegatableNode.RegistrationHandle Camera2StreamConfigurationMap;

        public Node() {
        }

        @Override // androidx.compose.ui.Modifier.Node
        public final void onAttach() {
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.this.Camera2StreamConfigurationMap = this;
            if (androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.this.getHighSpeedVideoFpsRanges != null) {
                requestOnAfterLayoutCallback();
            }
        }

        public final void requestOnAfterLayoutCallback() {
            final androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier awaitFirstLayoutModifier = androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.this;
            this.Camera2StreamConfigurationMap = androidx.compose.ui.layout.OnLayoutRectChangedModifierKt.registerOnLayoutRectChanged(this, 0L, 0L, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier$Node$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.Node.Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.Node.this, awaitFirstLayoutModifier);
                    return Camera2StreamConfigurationMap;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.Node node, androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier awaitFirstLayoutModifier) {
            androidx.compose.ui.node.DelegatableNode.RegistrationHandle registrationHandle = node.Camera2StreamConfigurationMap;
            if (registrationHandle != null) {
                registrationHandle.unregister();
            }
            node.Camera2StreamConfigurationMap = null;
            kotlinx.coroutines.CompletableDeferred completableDeferred = awaitFirstLayoutModifier.getHighSpeedVideoFpsRanges;
            if (completableDeferred != null) {
                completableDeferred.complete(kotlin.Unit.INSTANCE);
            }
            awaitFirstLayoutModifier.getHighSpeedVideoFpsRanges = null;
            return kotlin.Unit.INSTANCE;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public final void onDetach() {
            if (androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.this.Camera2StreamConfigurationMap == this) {
                androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.this.Camera2StreamConfigurationMap = null;
            }
            androidx.compose.ui.node.DelegatableNode.RegistrationHandle registrationHandle = this.Camera2StreamConfigurationMap;
            if (registrationHandle != null) {
                registrationHandle.unregister();
            }
            this.Camera2StreamConfigurationMap = null;
        }
    }
}
