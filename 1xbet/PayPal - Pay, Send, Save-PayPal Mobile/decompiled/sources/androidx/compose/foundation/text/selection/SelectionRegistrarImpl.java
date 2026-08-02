package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 t2\u00020\u0001:\u0001tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0005J/\u0010 \u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010\"J?\u0010(\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010\u0006J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010\u0005R\"\u0010+\u001a\u00020\u001c8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0007018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0007088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00109R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00070;8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001a\u00102\u001a\u00060?j\u0002`@8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bA\u0010BR0\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010C8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IRB\u0010K\u001a\"\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b\u0018\u00010J8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR6\u0010R\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010Q8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WRN\u0010Y\u001a.\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001c\u0018\u00010X8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R*\u0010`\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010_8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR0\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010C8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bf\u0010E\u001a\u0004\bg\u0010G\"\u0004\bh\u0010IR0\u0010i\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010C8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bi\u0010E\u001a\u0004\bj\u0010G\"\u0004\bk\u0010IR7\u0010s\u001a\b\u0012\u0004\u0012\u00020l0;2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020l0;8W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010=\"\u0004\bq\u0010r"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "", "p0", "<init>", "(J)V", "()V", "Landroidx/compose/foundation/text/selection/Selectable;", "selectable", "subscribe", "(Landroidx/compose/foundation/text/selection/Selectable;)Landroidx/compose/foundation/text/selection/Selectable;", "", "unsubscribe", "(Landroidx/compose/foundation/text/selection/Selectable;)V", "nextSelectableId", "()J", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerLayoutCoordinates", "", "sort", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Ljava/util/List;", "selectableId", "notifyPositionChange", "layoutCoordinates", "Landroidx/compose/ui/geometry/Offset;", "startPosition", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "", "isInTouchMode", "notifySelectionUpdateStart-ubNVwUQ", "(Landroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)V", "notifySelectionUpdateStart", "notifySelectionUpdateSelectAll", "(JZ)V", "newPosition", "previousPosition", "isStartHandle", "notifySelectionUpdate-njBpvok", "(Landroidx/compose/ui/layout/LayoutCoordinates;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)Z", "notifySelectionUpdate", "notifySelectionUpdateEnd", "notifySelectableChange", "sorted", "Z", "getSorted$foundation", "()Z", "setSorted$foundation", "(Z)V", "", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "getSelectables$foundation", "()Ljava/util/List;", "selectables", "Landroidx/collection/MutableLongObjectMap;", "Landroidx/collection/MutableLongObjectMap;", "Camera2StreamConfigurationMap", "Landroidx/collection/LongObjectMap;", "getSelectableMap$foundation", "()Landroidx/collection/LongObjectMap;", "selectableMap", "Ljava/util/concurrent/atomic/AtomicLong;", "Landroidx/compose/foundation/Camera2StreamConfigurationMap;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/atomic/AtomicLong;", "Lkotlin/Function1;", "onPositionChangeCallback", "Lkotlin/jvm/functions/Function1;", "getOnPositionChangeCallback$foundation", "()Lkotlin/jvm/functions/Function1;", "setOnPositionChangeCallback$foundation", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function4;", "onSelectionUpdateStartCallback", "Lkotlin/jvm/functions/Function4;", "getOnSelectionUpdateStartCallback$foundation", "()Lkotlin/jvm/functions/Function4;", "setOnSelectionUpdateStartCallback$foundation", "(Lkotlin/jvm/functions/Function4;)V", "Lkotlin/Function2;", "onSelectionUpdateSelectAll", "Lkotlin/jvm/functions/Function2;", "getOnSelectionUpdateSelectAll$foundation", "()Lkotlin/jvm/functions/Function2;", "setOnSelectionUpdateSelectAll$foundation", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function6;", "onSelectionUpdateCallback", "Lkotlin/jvm/functions/Function6;", "getOnSelectionUpdateCallback$foundation", "()Lkotlin/jvm/functions/Function6;", "setOnSelectionUpdateCallback$foundation", "(Lkotlin/jvm/functions/Function6;)V", "Lkotlin/Function0;", "onSelectionUpdateEndCallback", "Lkotlin/jvm/functions/Function0;", "getOnSelectionUpdateEndCallback$foundation", "()Lkotlin/jvm/functions/Function0;", "setOnSelectionUpdateEndCallback$foundation", "(Lkotlin/jvm/functions/Function0;)V", "onSelectableChangeCallback", "getOnSelectableChangeCallback$foundation", "setOnSelectableChangeCallback$foundation", "afterSelectableUnsubscribe", "getAfterSelectableUnsubscribe$foundation", "setAfterSelectableUnsubscribe$foundation", "Landroidx/compose/foundation/text/selection/Selection;", "<set-?>", "subselections$delegate", "Landroidx/compose/runtime/MutableState;", "getSubselections", "setSubselections", "(Landroidx/collection/LongObjectMap;)V", "subselections", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectionRegistrarImpl implements androidx.compose.foundation.text.selection.SelectionRegistrar {
    private kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> afterSelectableUnsubscribe;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.collection.MutableLongObjectMap<androidx.compose.foundation.text.selection.Selectable> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<androidx.compose.foundation.text.selection.Selectable> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRanges;
    private kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> onPositionChangeCallback;
    private kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> onSelectableChangeCallback;
    private kotlin.jvm.functions.Function6<? super java.lang.Boolean, ? super androidx.compose.ui.layout.LayoutCoordinates, ? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.ui.geometry.Offset, ? super java.lang.Boolean, ? super androidx.compose.foundation.text.selection.SelectionAdjustment, java.lang.Boolean> onSelectionUpdateCallback;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onSelectionUpdateEndCallback;
    private kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Long, kotlin.Unit> onSelectionUpdateSelectAll;
    private kotlin.jvm.functions.Function4<? super java.lang.Boolean, ? super androidx.compose.ui.layout.LayoutCoordinates, ? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.foundation.text.selection.SelectionAdjustment, kotlin.Unit> onSelectionUpdateStartCallback;
    private boolean sorted;

    /* renamed from: subselections$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState subselections;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text.selection.SelectionRegistrarImpl.Companion INSTANCE = new androidx.compose.foundation.text.selection.SelectionRegistrarImpl.Companion(null);
    public static final int $stable = 8;
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.text.selection.SelectionRegistrarImpl, java.lang.Long> Saver = androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            java.lang.Long valueOf;
            valueOf = java.lang.Long.valueOf(((androidx.compose.foundation.text.selection.SelectionRegistrarImpl) obj2).getHighSpeedVideoFpsRanges.get());
            return valueOf;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return androidx.compose.foundation.text.selection.SelectionRegistrarImpl.$r8$lambda$8ujfgNevJIybRdoqw5NMUN_AFBc(((java.lang.Long) obj).longValue());
        }
    });

    private SelectionRegistrarImpl(long j) {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
        this.Camera2StreamConfigurationMap = androidx.collection.LongObjectMapKt.mutableLongObjectMapOf();
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicLong(j);
        this.subselections = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.collection.LongObjectMapKt.emptyLongObjectMap(), null, 2, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.text.selection.SelectionRegistrarImpl, java.lang.Long> getSaver() {
            return androidx.compose.foundation.text.selection.SelectionRegistrarImpl.Saver;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SelectionRegistrarImpl() {
        this(1L);
    }

    /* renamed from: getSorted$foundation, reason: from getter */
    public final boolean getSorted() {
        return this.sorted;
    }

    public final void setSorted$foundation(boolean z) {
        this.sorted = z;
    }

    public final java.util.List<androidx.compose.foundation.text.selection.Selectable> getSelectables$foundation() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final androidx.collection.LongObjectMap<androidx.compose.foundation.text.selection.Selectable> getSelectableMap$foundation() {
        return this.Camera2StreamConfigurationMap;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> getOnPositionChangeCallback$foundation() {
        return this.onPositionChangeCallback;
    }

    public final void setOnPositionChangeCallback$foundation(kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> function1) {
        this.onPositionChangeCallback = function1;
    }

    public final kotlin.jvm.functions.Function4<java.lang.Boolean, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Offset, androidx.compose.foundation.text.selection.SelectionAdjustment, kotlin.Unit> getOnSelectionUpdateStartCallback$foundation() {
        return this.onSelectionUpdateStartCallback;
    }

    public final void setOnSelectionUpdateStartCallback$foundation(kotlin.jvm.functions.Function4<? super java.lang.Boolean, ? super androidx.compose.ui.layout.LayoutCoordinates, ? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.foundation.text.selection.SelectionAdjustment, kotlin.Unit> function4) {
        this.onSelectionUpdateStartCallback = function4;
    }

    public final kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Long, kotlin.Unit> getOnSelectionUpdateSelectAll$foundation() {
        return this.onSelectionUpdateSelectAll;
    }

    public final void setOnSelectionUpdateSelectAll$foundation(kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Long, kotlin.Unit> function2) {
        this.onSelectionUpdateSelectAll = function2;
    }

    public final kotlin.jvm.functions.Function6<java.lang.Boolean, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset, java.lang.Boolean, androidx.compose.foundation.text.selection.SelectionAdjustment, java.lang.Boolean> getOnSelectionUpdateCallback$foundation() {
        return this.onSelectionUpdateCallback;
    }

    public final void setOnSelectionUpdateCallback$foundation(kotlin.jvm.functions.Function6<? super java.lang.Boolean, ? super androidx.compose.ui.layout.LayoutCoordinates, ? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.ui.geometry.Offset, ? super java.lang.Boolean, ? super androidx.compose.foundation.text.selection.SelectionAdjustment, java.lang.Boolean> function6) {
        this.onSelectionUpdateCallback = function6;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnSelectionUpdateEndCallback$foundation() {
        return this.onSelectionUpdateEndCallback;
    }

    public final void setOnSelectionUpdateEndCallback$foundation(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.onSelectionUpdateEndCallback = function0;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> getOnSelectableChangeCallback$foundation() {
        return this.onSelectableChangeCallback;
    }

    public final void setOnSelectableChangeCallback$foundation(kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> function1) {
        this.onSelectableChangeCallback = function1;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> getAfterSelectableUnsubscribe$foundation() {
        return this.afterSelectableUnsubscribe;
    }

    public final void setAfterSelectableUnsubscribe$foundation(kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> function1) {
        this.afterSelectableUnsubscribe = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final androidx.collection.LongObjectMap<androidx.compose.foundation.text.selection.Selection> getSubselections() {
        return (androidx.collection.LongObjectMap) this.subselections.getValue();
    }

    public final void setSubselections(androidx.collection.LongObjectMap<androidx.compose.foundation.text.selection.Selection> longObjectMap) {
        this.subselections.setValue(longObjectMap);
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final androidx.compose.foundation.text.selection.Selectable subscribe(androidx.compose.foundation.text.selection.Selectable selectable) {
        if (selectable.getSelectableId() == 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The selectable contains an invalid id: ");
            sb.append(selectable.getSelectableId());
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        if (this.Camera2StreamConfigurationMap.containsKey(selectable.getSelectableId())) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Another selectable with the id: ");
            sb2.append(selectable);
            sb2.append(".selectableId has already subscribed.");
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(sb2.toString());
        }
        this.Camera2StreamConfigurationMap.set(selectable.getSelectableId(), selectable);
        this.getHighResolutionOutputSizeshNQ4ISI.add(selectable);
        this.sorted = false;
        return selectable;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void unsubscribe(androidx.compose.foundation.text.selection.Selectable selectable) {
        if (this.Camera2StreamConfigurationMap.containsKey(selectable.getSelectableId())) {
            this.getHighResolutionOutputSizeshNQ4ISI.remove(selectable);
            this.Camera2StreamConfigurationMap.remove(selectable.getSelectableId());
            kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> function1 = this.afterSelectableUnsubscribe;
            if (function1 != null) {
                function1.invoke(java.lang.Long.valueOf(selectable.getSelectableId()));
            }
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final long nextSelectableId() {
        long andIncrement = this.getHighSpeedVideoFpsRanges.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.getHighSpeedVideoFpsRanges.getAndIncrement();
        }
        return andIncrement;
    }

    public final java.util.List<androidx.compose.foundation.text.selection.Selectable> sort(final androidx.compose.ui.layout.LayoutCoordinates containerLayoutCoordinates) {
        if (!this.sorted) {
            java.util.List<androidx.compose.foundation.text.selection.Selectable> list = this.getHighResolutionOutputSizeshNQ4ISI;
            final kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return java.lang.Integer.valueOf(androidx.compose.foundation.text.selection.SelectionRegistrarImpl.$r8$lambda$5W8gCgKMHieWTENkGchEi0U7OSU(androidx.compose.ui.layout.LayoutCoordinates.this, (androidx.compose.foundation.text.selection.Selectable) obj, (androidx.compose.foundation.text.selection.Selectable) obj2));
                }
            };
            kotlin.collections.CollectionsKt.sortWith(list, new java.util.Comparator() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$$ExternalSyntheticLambda3
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    int intValue;
                    intValue = ((java.lang.Number) kotlin.jvm.functions.Function2.this.invoke(obj, obj2)).intValue();
                    return intValue;
                }
            });
            this.sorted = true;
        }
        return getSelectables$foundation();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void notifyPositionChange(long selectableId) {
        this.sorted = false;
        kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> function1 = this.onPositionChangeCallback;
        if (function1 != null) {
            function1.invoke(java.lang.Long.valueOf(selectableId));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdateStart-ubNVwUQ */
    public final void mo2433notifySelectionUpdateStartubNVwUQ(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, long startPosition, androidx.compose.foundation.text.selection.SelectionAdjustment adjustment, boolean isInTouchMode) {
        kotlin.jvm.functions.Function4<? super java.lang.Boolean, ? super androidx.compose.ui.layout.LayoutCoordinates, ? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.foundation.text.selection.SelectionAdjustment, kotlin.Unit> function4 = this.onSelectionUpdateStartCallback;
        if (function4 != null) {
            function4.invoke(java.lang.Boolean.valueOf(isInTouchMode), layoutCoordinates, androidx.compose.ui.geometry.Offset.m5741boximpl(startPosition), adjustment);
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void notifySelectionUpdateSelectAll(long selectableId, boolean isInTouchMode) {
        kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Long, kotlin.Unit> function2 = this.onSelectionUpdateSelectAll;
        if (function2 != null) {
            function2.invoke(java.lang.Boolean.valueOf(isInTouchMode), java.lang.Long.valueOf(selectableId));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdate-njBpvok */
    public final boolean mo2432notifySelectionUpdatenjBpvok(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, long newPosition, long previousPosition, boolean isStartHandle, androidx.compose.foundation.text.selection.SelectionAdjustment adjustment, boolean isInTouchMode) {
        kotlin.jvm.functions.Function6<? super java.lang.Boolean, ? super androidx.compose.ui.layout.LayoutCoordinates, ? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.ui.geometry.Offset, ? super java.lang.Boolean, ? super androidx.compose.foundation.text.selection.SelectionAdjustment, java.lang.Boolean> function6 = this.onSelectionUpdateCallback;
        if (function6 == null) {
            return true;
        }
        return function6.invoke(java.lang.Boolean.valueOf(isInTouchMode), layoutCoordinates, androidx.compose.ui.geometry.Offset.m5741boximpl(newPosition), androidx.compose.ui.geometry.Offset.m5741boximpl(previousPosition), java.lang.Boolean.valueOf(isStartHandle), adjustment).booleanValue();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void notifySelectionUpdateEnd() {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onSelectionUpdateEndCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public final void notifySelectableChange(long selectableId) {
        kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> function1 = this.onSelectableChangeCallback;
        if (function1 != null) {
            function1.invoke(java.lang.Long.valueOf(selectableId));
        }
    }

    public static /* synthetic */ int $r8$lambda$5W8gCgKMHieWTENkGchEi0U7OSU(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, androidx.compose.foundation.text.selection.Selectable selectable, androidx.compose.foundation.text.selection.Selectable selectable2) {
        long m5768getZeroF1C5BW0;
        long m5768getZeroF1C5BW02;
        long m5768getZeroF1C5BW03;
        long m5768getZeroF1C5BW04;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2 = selectable.getLayoutCoordinates();
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates3 = selectable2.getLayoutCoordinates();
        if (layoutCoordinates2 != null) {
            m5768getZeroF1C5BW0 = layoutCoordinates.mo7362localPositionOfR5De75A(layoutCoordinates2, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
            float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (m5768getZeroF1C5BW0 >> 32));
            float mo7361getSizeYbymL2g = (int) (layoutCoordinates2.mo7361getSizeYbymL2g() >> 32);
            float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (m5768getZeroF1C5BW0 & 4294967295L));
            float mo7361getSizeYbymL2g2 = (int) (layoutCoordinates2.mo7361getSizeYbymL2g() & 4294967295L);
            m5768getZeroF1C5BW02 = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat + mo7361getSizeYbymL2g) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2 + mo7361getSizeYbymL2g2) & 4294967295L));
        } else {
            m5768getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
            m5768getZeroF1C5BW02 = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        long j = m5768getZeroF1C5BW02;
        if (layoutCoordinates3 != null) {
            m5768getZeroF1C5BW03 = layoutCoordinates.mo7362localPositionOfR5De75A(layoutCoordinates3, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
            float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (m5768getZeroF1C5BW03 >> 32));
            float mo7361getSizeYbymL2g3 = (int) (layoutCoordinates3.mo7361getSizeYbymL2g() >> 32);
            float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (m5768getZeroF1C5BW03 & 4294967295L));
            float mo7361getSizeYbymL2g4 = (int) (layoutCoordinates3.mo7361getSizeYbymL2g() & 4294967295L);
            m5768getZeroF1C5BW04 = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat3 + mo7361getSizeYbymL2g3) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat4 + mo7361getSizeYbymL2g4) & 4294967295L));
        } else {
            m5768getZeroF1C5BW03 = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
            m5768getZeroF1C5BW04 = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        if (androidx.compose.foundation.text.selection.SelectionRegistrarImplKt.m2434inARowzwwh4xc(m5768getZeroF1C5BW0, j, m5768getZeroF1C5BW03, m5768getZeroF1C5BW04)) {
            return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (m5768getZeroF1C5BW0 >> 32))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (m5768getZeroF1C5BW03 >> 32))));
        }
        return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (m5768getZeroF1C5BW0 & 4294967295L))), java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (m5768getZeroF1C5BW03 & 4294967295L))));
    }

    public static /* synthetic */ androidx.compose.foundation.text.selection.SelectionRegistrarImpl $r8$lambda$8ujfgNevJIybRdoqw5NMUN_AFBc(long j) {
        return new androidx.compose.foundation.text.selection.SelectionRegistrarImpl(j);
    }
}
