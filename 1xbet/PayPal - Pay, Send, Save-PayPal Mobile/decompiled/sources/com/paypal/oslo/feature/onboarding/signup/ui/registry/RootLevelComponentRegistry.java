package com.paypal.oslo.feature.onboarding.signup.ui.registry;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/registry/RootLevelComponentRegistry;", "", "<init>", "()V", "", "componentId", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/RootLevelComponentState;", "state", "", "register", "(Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/RootLevelComponentState;)V", "unregister", "(Ljava/lang/String;)V", "", "Lcom/paypal/pds/components/DropdownState;", "getDropdownStates", "()Ljava/util/Map;", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public class RootLevelComponentRegistry {
    public static final int $stable = 0;
    private final androidx.compose.runtime.snapshots.SnapshotStateMap<java.lang.String, com.paypal.oslo.feature.onboarding.signup.ui.model.RootLevelComponentState> getHighSpeedVideoSizes = androidx.compose.runtime.SnapshotStateKt.mutableStateMapOf();

    public void register(java.lang.String componentId, com.paypal.oslo.feature.onboarding.signup.ui.model.RootLevelComponentState state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        this.getHighSpeedVideoSizes.put(componentId, state);
    }

    public void unregister(java.lang.String componentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        this.getHighSpeedVideoSizes.remove(componentId);
    }

    public java.util.Map<java.lang.String, com.paypal.pds.components.DropdownState> getDropdownStates() {
        androidx.compose.runtime.snapshots.SnapshotStateMap<java.lang.String, com.paypal.oslo.feature.onboarding.signup.ui.model.RootLevelComponentState> snapshotStateMap = this.getHighSpeedVideoSizes;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, com.paypal.oslo.feature.onboarding.signup.ui.model.RootLevelComponentState> entry : snapshotStateMap.entrySet()) {
            if (entry.getValue() instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.RootLevelComponentState.Dropdown) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap2.size()));
        for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
            java.lang.Object key = entry2.getKey();
            java.lang.Object value = entry2.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
            linkedHashMap3.put(key, ((com.paypal.oslo.feature.onboarding.signup.ui.model.RootLevelComponentState.Dropdown) value).getState());
        }
        return linkedHashMap3;
    }
}
