package com.paypal.oslo.feature.helpcenter.ui.navigation;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00118\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R+\u0010!\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00048G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/navigation/BottomSheetStackState;", "", "<init>", "()V", "", "height", "", "updateMaxHeight", "(I)V", "Lcom/paypal/oslo/feature/helpcenter/ui/navigation/StackPage;", "page", "Lcom/paypal/oslo/feature/helpcenter/ui/navigation/StackEntry;", com.adjust.sdk.Constants.PUSH, "(Lcom/paypal/oslo/feature/helpcenter/ui/navigation/StackPage;)Lcom/paypal/oslo/feature/helpcenter/ui/navigation/StackEntry;", "", "pop", "()Z", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "entries", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getEntries", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getCanGoBack", "canGoBack", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "<set-?>", "maxContentHeight$delegate", "Landroidx/compose/runtime/MutableIntState;", "getMaxContentHeight", "()I", "setMaxContentHeight", "maxContentHeight", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BottomSheetStackState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState.Companion INSTANCE = new com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState.Companion(null);
    private static final androidx.compose.runtime.saveable.Saver<com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState, java.lang.Object> Saver = androidx.compose.runtime.saveable.ListSaverKt.listSaver(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState.$r8$lambda$mnz7DsLRkP4F_Hg43_Uyxze4AgA((androidx.compose.runtime.saveable.SaverScope) obj, (com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState) obj2);
        }
    }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState.m14813$r8$lambda$3q2KaZ2nIUVsS065eo6PXVepE8((java.util.List) obj);
        }
    });

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.compose.runtime.snapshots.SnapshotStateList<com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry> entries = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();

    /* renamed from: maxContentHeight$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState maxContentHeight = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);

    public final androidx.compose.runtime.snapshots.SnapshotStateList<com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry> getEntries() {
        return this.entries;
    }

    public final boolean getCanGoBack() {
        return this.entries.size() > 1;
    }

    private final void setMaxContentHeight(int i) {
        this.maxContentHeight.setIntValue(i);
    }

    public final int getMaxContentHeight() {
        return this.maxContentHeight.getIntValue();
    }

    public final void updateMaxHeight(int height) {
        if (height > getMaxContentHeight()) {
            setMaxContentHeight(height);
        }
    }

    public final com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry push(com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = i + 1;
        com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry stackEntry = new com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry(page, i);
        if (this.entries.isEmpty()) {
            stackEntry.setReady(true);
        }
        this.entries.add(stackEntry);
        return stackEntry;
    }

    public final boolean pop() {
        if (!getCanGoBack()) {
            return false;
        }
        androidx.compose.runtime.snapshots.SnapshotStateList<com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry> snapshotStateList = this.entries;
        snapshotStateList.remove(kotlin.collections.CollectionsKt.getLastIndex(snapshotStateList));
        return true;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/navigation/BottomSheetStackState$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/paypal/oslo/feature/helpcenter/ui/navigation/BottomSheetStackState;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState, java.lang.Object> getSaver() {
            return com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState.Saver;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: $r8$lambda$3q2KaZ2nIUVsS065eo6PXVepE-8, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState m14813$r8$lambda$3q2KaZ2nIUVsS065eo6PXVepE8(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState bottomSheetStackState = new com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage stackPage = (com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage) it.next();
            int i = bottomSheetStackState.getHighResolutionOutputSizeshNQ4ISI;
            bottomSheetStackState.getHighResolutionOutputSizeshNQ4ISI = i + 1;
            com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry stackEntry = new com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry(stackPage, i);
            stackEntry.setReady(true);
            bottomSheetStackState.entries.add(stackEntry);
        }
        return bottomSheetStackState;
    }

    public static /* synthetic */ java.util.List $r8$lambda$mnz7DsLRkP4F_Hg43_Uyxze4AgA(androidx.compose.runtime.saveable.SaverScope saverScope, com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState bottomSheetStackState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(saverScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetStackState, "");
        androidx.compose.runtime.snapshots.SnapshotStateList<com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry> snapshotStateList = bottomSheetStackState.entries;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(snapshotStateList, 10));
        java.util.Iterator<com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry> it = snapshotStateList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPage());
        }
        return arrayList;
    }
}
