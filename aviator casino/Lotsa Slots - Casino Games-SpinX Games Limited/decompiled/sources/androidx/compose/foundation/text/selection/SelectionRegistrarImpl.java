package androidx.compose.foundation.text.selection;

/* compiled from: SelectionRegistrarImpl.kt */
@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b \b\u0000\u0018\u0000 d2\u00020\u0001:\u0001dB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010L\u001a\u00020\u0004H\u0016J\u0010\u0010M\u001a\u00020\r2\u0006\u0010N\u001a\u00020\u0004H\u0016J\u0010\u0010O\u001a\u00020\r2\u0006\u0010N\u001a\u00020\u0004H\u0016JB\u0010P\u001a\u00020\u001d2\u0006\u0010Q\u001a\u00020\u001e2\u0006\u0010R\u001a\u00020\u001f2\u0006\u0010S\u001a\u00020\u001f2\u0006\u0010T\u001a\u00020\u001d2\u0006\u0010U\u001a\u00020 2\u0006\u0010V\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\bW\u0010XJ\b\u0010Y\u001a\u00020\rH\u0016J\u0018\u0010Z\u001a\u00020\r2\u0006\u0010N\u001a\u00020\u00042\u0006\u0010V\u001a\u00020\u001dH\u0016J2\u0010[\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\u001e2\u0006\u0010\\\u001a\u00020\u001f2\u0006\u0010U\u001a\u00020 2\u0006\u0010V\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b]\u0010^J\u0014\u0010_\u001a\b\u0012\u0004\u0012\u00020\b0<2\u0006\u0010`\u001a\u00020\u001eJ\u0010\u0010a\u001a\u00020\b2\u0006\u0010b\u001a\u00020\bH\u0016J\u0010\u0010c\u001a\u00020\r2\u0006\u0010b\u001a\u00020\bH\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00060\u0013j\u0002`\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R(\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011RF\u0010\u001b\u001a.\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010&X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R.\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r\u0018\u00010,X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R:\u00101\u001a\"\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u000102X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b088@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\b0<8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020\u001dX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CRC\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020E082\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020E088V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bG\u0010:\"\u0004\bH\u0010I\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006e"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "()V", "initialIncrementId", "", "(J)V", "_selectableMap", "", "Landroidx/compose/foundation/text/selection/Selectable;", "_selectables", "", "afterSelectableUnsubscribe", "Lkotlin/Function1;", "", "getAfterSelectableUnsubscribe$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setAfterSelectableUnsubscribe$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "incrementId", "Ljava/util/concurrent/atomic/AtomicLong;", "Landroidx/compose/foundation/AtomicLong;", "onPositionChangeCallback", "getOnPositionChangeCallback$foundation_release", "setOnPositionChangeCallback$foundation_release", "onSelectableChangeCallback", "getOnSelectableChangeCallback$foundation_release", "setOnSelectableChangeCallback$foundation_release", "onSelectionUpdateCallback", "Lkotlin/Function6;", "", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "getOnSelectionUpdateCallback$foundation_release", "()Lkotlin/jvm/functions/Function6;", "setOnSelectionUpdateCallback$foundation_release", "(Lkotlin/jvm/functions/Function6;)V", "onSelectionUpdateEndCallback", "Lkotlin/Function0;", "getOnSelectionUpdateEndCallback$foundation_release", "()Lkotlin/jvm/functions/Function0;", "setOnSelectionUpdateEndCallback$foundation_release", "(Lkotlin/jvm/functions/Function0;)V", "onSelectionUpdateSelectAll", "Lkotlin/Function2;", "getOnSelectionUpdateSelectAll$foundation_release", "()Lkotlin/jvm/functions/Function2;", "setOnSelectionUpdateSelectAll$foundation_release", "(Lkotlin/jvm/functions/Function2;)V", "onSelectionUpdateStartCallback", "Lkotlin/Function4;", "getOnSelectionUpdateStartCallback$foundation_release", "()Lkotlin/jvm/functions/Function4;", "setOnSelectionUpdateStartCallback$foundation_release", "(Lkotlin/jvm/functions/Function4;)V", "selectableMap", "", "getSelectableMap$foundation_release", "()Ljava/util/Map;", "selectables", "", "getSelectables$foundation_release", "()Ljava/util/List;", "sorted", "getSorted$foundation_release", "()Z", "setSorted$foundation_release", "(Z)V", "<set-?>", "Landroidx/compose/foundation/text/selection/Selection;", "subselections", "getSubselections", "setSubselections", "(Ljava/util/Map;)V", "subselections$delegate", "Landroidx/compose/runtime/MutableState;", "nextSelectableId", "notifyPositionChange", "selectableId", "notifySelectableChange", "notifySelectionUpdate", "layoutCoordinates", "newPosition", "previousPosition", "isStartHandle", "adjustment", "isInTouchMode", "notifySelectionUpdate-njBpvok", "(Landroidx/compose/ui/layout/LayoutCoordinates;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)Z", "notifySelectionUpdateEnd", "notifySelectionUpdateSelectAll", "notifySelectionUpdateStart", "startPosition", "notifySelectionUpdateStart-ubNVwUQ", "(Landroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)V", "sort", "containerLayoutCoordinates", "subscribe", "selectable", "unsubscribe", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionRegistrarImpl implements androidx.compose.foundation.text.selection.SelectionRegistrar {
    private final java.util.Map<java.lang.Long, androidx.compose.foundation.text.selection.Selectable> _selectableMap;
    private final java.util.List<androidx.compose.foundation.text.selection.Selectable> _selectables;
    private kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> afterSelectableUnsubscribe;
    private java.util.concurrent.atomic.AtomicLong incrementId;
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
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.text.selection.SelectionRegistrarImpl, java.lang.Long> Saver = androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2<androidx.compose.runtime.saveable.SaverScope, androidx.compose.foundation.text.selection.SelectionRegistrarImpl, java.lang.Long>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Long invoke(androidx.compose.runtime.saveable.SaverScope saverScope, androidx.compose.foundation.text.selection.SelectionRegistrarImpl selectionRegistrarImpl) {
            java.util.concurrent.atomic.AtomicLong atomicLong;
            atomicLong = selectionRegistrarImpl.incrementId;
            return java.lang.Long.valueOf(atomicLong.get());
        }
    }, new kotlin.jvm.functions.Function1<java.lang.Long, androidx.compose.foundation.text.selection.SelectionRegistrarImpl>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.foundation.text.selection.SelectionRegistrarImpl invoke(java.lang.Long l) {
            return invoke(l.longValue());
        }

        public final androidx.compose.foundation.text.selection.SelectionRegistrarImpl invoke(long j) {
            return new androidx.compose.foundation.text.selection.SelectionRegistrarImpl(j, null);
        }
    });

    public /* synthetic */ SelectionRegistrarImpl(long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    private SelectionRegistrarImpl(long j) {
        this._selectables = new java.util.ArrayList();
        this._selectableMap = new java.util.LinkedHashMap();
        this.incrementId = new java.util.concurrent.atomic.AtomicLong(j);
        this.subselections = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(kotlin.collections.MapsKt.emptyMap(), null, 2, null);
    }

    /* compiled from: SelectionRegistrarImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.text.selection.SelectionRegistrarImpl, java.lang.Long> getSaver() {
            return androidx.compose.foundation.text.selection.SelectionRegistrarImpl.Saver;
        }
    }

    public SelectionRegistrarImpl() {
        this(1L);
    }

    /* renamed from: getSorted$foundation_release, reason: from getter */
    public final boolean getSorted() {
        return this.sorted;
    }

    public final void setSorted$foundation_release(boolean z) {
        this.sorted = z;
    }

    public final java.util.List<androidx.compose.foundation.text.selection.Selectable> getSelectables$foundation_release() {
        return this._selectables;
    }

    public final java.util.Map<java.lang.Long, androidx.compose.foundation.text.selection.Selectable> getSelectableMap$foundation_release() {
        return this._selectableMap;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> getOnPositionChangeCallback$foundation_release() {
        return this.onPositionChangeCallback;
    }

    public final void setOnPositionChangeCallback$foundation_release(kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> function1) {
        this.onPositionChangeCallback = function1;
    }

    public final kotlin.jvm.functions.Function4<java.lang.Boolean, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Offset, androidx.compose.foundation.text.selection.SelectionAdjustment, kotlin.Unit> getOnSelectionUpdateStartCallback$foundation_release() {
        return this.onSelectionUpdateStartCallback;
    }

    public final void setOnSelectionUpdateStartCallback$foundation_release(kotlin.jvm.functions.Function4<? super java.lang.Boolean, ? super androidx.compose.ui.layout.LayoutCoordinates, ? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.foundation.text.selection.SelectionAdjustment, kotlin.Unit> function4) {
        this.onSelectionUpdateStartCallback = function4;
    }

    public final kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Long, kotlin.Unit> getOnSelectionUpdateSelectAll$foundation_release() {
        return this.onSelectionUpdateSelectAll;
    }

    public final void setOnSelectionUpdateSelectAll$foundation_release(kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Long, kotlin.Unit> function2) {
        this.onSelectionUpdateSelectAll = function2;
    }

    public final kotlin.jvm.functions.Function6<java.lang.Boolean, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset, java.lang.Boolean, androidx.compose.foundation.text.selection.SelectionAdjustment, java.lang.Boolean> getOnSelectionUpdateCallback$foundation_release() {
        return this.onSelectionUpdateCallback;
    }

    public final void setOnSelectionUpdateCallback$foundation_release(kotlin.jvm.functions.Function6<? super java.lang.Boolean, ? super androidx.compose.ui.layout.LayoutCoordinates, ? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.ui.geometry.Offset, ? super java.lang.Boolean, ? super androidx.compose.foundation.text.selection.SelectionAdjustment, java.lang.Boolean> function6) {
        this.onSelectionUpdateCallback = function6;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnSelectionUpdateEndCallback$foundation_release() {
        return this.onSelectionUpdateEndCallback;
    }

    public final void setOnSelectionUpdateEndCallback$foundation_release(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.onSelectionUpdateEndCallback = function0;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> getOnSelectableChangeCallback$foundation_release() {
        return this.onSelectableChangeCallback;
    }

    public final void setOnSelectableChangeCallback$foundation_release(kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> function1) {
        this.onSelectableChangeCallback = function1;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> getAfterSelectableUnsubscribe$foundation_release() {
        return this.afterSelectableUnsubscribe;
    }

    public final void setAfterSelectableUnsubscribe$foundation_release(kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> function1) {
        this.afterSelectableUnsubscribe = function1;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public java.util.Map<java.lang.Long, androidx.compose.foundation.text.selection.Selection> getSubselections() {
        return (java.util.Map) this.subselections.getValue();
    }

    public void setSubselections(java.util.Map<java.lang.Long, androidx.compose.foundation.text.selection.Selection> map) {
        this.subselections.setValue(map);
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public androidx.compose.foundation.text.selection.Selectable subscribe(androidx.compose.foundation.text.selection.Selectable selectable) {
        if (selectable.getSelectableId() == 0) {
            throw new java.lang.IllegalArgumentException(("The selectable contains an invalid id: " + selectable.getSelectableId()).toString());
        }
        if (!(!this._selectableMap.containsKey(java.lang.Long.valueOf(selectable.getSelectableId())))) {
            throw new java.lang.IllegalArgumentException(("Another selectable with the id: " + selectable + ".selectableId has already subscribed.").toString());
        }
        this._selectableMap.put(java.lang.Long.valueOf(selectable.getSelectableId()), selectable);
        this._selectables.add(selectable);
        this.sorted = false;
        return selectable;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void unsubscribe(androidx.compose.foundation.text.selection.Selectable selectable) {
        if (this._selectableMap.containsKey(java.lang.Long.valueOf(selectable.getSelectableId()))) {
            this._selectables.remove(selectable);
            this._selectableMap.remove(java.lang.Long.valueOf(selectable.getSelectableId()));
            kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> function1 = this.afterSelectableUnsubscribe;
            if (function1 != null) {
                function1.invoke(java.lang.Long.valueOf(selectable.getSelectableId()));
            }
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public long nextSelectableId() {
        long andIncrement = this.incrementId.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.incrementId.getAndIncrement();
        }
        return andIncrement;
    }

    public final java.util.List<androidx.compose.foundation.text.selection.Selectable> sort(final androidx.compose.ui.layout.LayoutCoordinates containerLayoutCoordinates) {
        if (!this.sorted) {
            java.util.List<androidx.compose.foundation.text.selection.Selectable> list = this._selectables;
            final kotlin.jvm.functions.Function2<androidx.compose.foundation.text.selection.Selectable, androidx.compose.foundation.text.selection.Selectable, java.lang.Integer> function2 = new kotlin.jvm.functions.Function2<androidx.compose.foundation.text.selection.Selectable, androidx.compose.foundation.text.selection.Selectable, java.lang.Integer>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$sort$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Integer invoke(androidx.compose.foundation.text.selection.Selectable selectable, androidx.compose.foundation.text.selection.Selectable selectable2) {
                    long m1887getZeroF1C5BW0;
                    long m1887getZeroF1C5BW02;
                    int compareValues;
                    androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = selectable.getLayoutCoordinates();
                    androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2 = selectable2.getLayoutCoordinates();
                    if (layoutCoordinates != null) {
                        m1887getZeroF1C5BW0 = androidx.compose.ui.layout.LayoutCoordinates.this.mo3410localPositionOfR5De75A(layoutCoordinates, androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0());
                    } else {
                        m1887getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                    }
                    if (layoutCoordinates2 != null) {
                        m1887getZeroF1C5BW02 = androidx.compose.ui.layout.LayoutCoordinates.this.mo3410localPositionOfR5De75A(layoutCoordinates2, androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0());
                    } else {
                        m1887getZeroF1C5BW02 = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                    }
                    if (androidx.compose.ui.geometry.Offset.m1872getYimpl(m1887getZeroF1C5BW0) == androidx.compose.ui.geometry.Offset.m1872getYimpl(m1887getZeroF1C5BW02)) {
                        compareValues = kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Float.valueOf(androidx.compose.ui.geometry.Offset.m1871getXimpl(m1887getZeroF1C5BW0)), java.lang.Float.valueOf(androidx.compose.ui.geometry.Offset.m1871getXimpl(m1887getZeroF1C5BW02)));
                    } else {
                        compareValues = kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Float.valueOf(androidx.compose.ui.geometry.Offset.m1872getYimpl(m1887getZeroF1C5BW0)), java.lang.Float.valueOf(androidx.compose.ui.geometry.Offset.m1872getYimpl(m1887getZeroF1C5BW02)));
                    }
                    return java.lang.Integer.valueOf(compareValues);
                }
            };
            kotlin.collections.CollectionsKt.sortWith(list, new java.util.Comparator() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    int sort$lambda$2;
                    sort$lambda$2 = androidx.compose.foundation.text.selection.SelectionRegistrarImpl.sort$lambda$2(kotlin.jvm.functions.Function2.this, obj, obj2);
                    return sort$lambda$2;
                }
            });
            this.sorted = true;
        }
        return getSelectables$foundation_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sort$lambda$2(kotlin.jvm.functions.Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.Number) function2.invoke(obj, obj2)).intValue();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifyPositionChange(long selectableId) {
        this.sorted = false;
        kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> function1 = this.onPositionChangeCallback;
        if (function1 != null) {
            function1.invoke(java.lang.Long.valueOf(selectableId));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdateStart-ubNVwUQ */
    public void mo1065notifySelectionUpdateStartubNVwUQ(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, long startPosition, androidx.compose.foundation.text.selection.SelectionAdjustment adjustment, boolean isInTouchMode) {
        kotlin.jvm.functions.Function4<? super java.lang.Boolean, ? super androidx.compose.ui.layout.LayoutCoordinates, ? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.foundation.text.selection.SelectionAdjustment, kotlin.Unit> function4 = this.onSelectionUpdateStartCallback;
        if (function4 != null) {
            function4.invoke(java.lang.Boolean.valueOf(isInTouchMode), layoutCoordinates, androidx.compose.ui.geometry.Offset.m1860boximpl(startPosition), adjustment);
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateSelectAll(long selectableId, boolean isInTouchMode) {
        kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Long, kotlin.Unit> function2 = this.onSelectionUpdateSelectAll;
        if (function2 != null) {
            function2.invoke(java.lang.Boolean.valueOf(isInTouchMode), java.lang.Long.valueOf(selectableId));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdate-njBpvok */
    public boolean mo1064notifySelectionUpdatenjBpvok(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, long newPosition, long previousPosition, boolean isStartHandle, androidx.compose.foundation.text.selection.SelectionAdjustment adjustment, boolean isInTouchMode) {
        kotlin.jvm.functions.Function6<? super java.lang.Boolean, ? super androidx.compose.ui.layout.LayoutCoordinates, ? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.ui.geometry.Offset, ? super java.lang.Boolean, ? super androidx.compose.foundation.text.selection.SelectionAdjustment, java.lang.Boolean> function6 = this.onSelectionUpdateCallback;
        if (function6 != null) {
            return function6.invoke(java.lang.Boolean.valueOf(isInTouchMode), layoutCoordinates, androidx.compose.ui.geometry.Offset.m1860boximpl(newPosition), androidx.compose.ui.geometry.Offset.m1860boximpl(previousPosition), java.lang.Boolean.valueOf(isStartHandle), adjustment).booleanValue();
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateEnd() {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onSelectionUpdateEndCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectableChange(long selectableId) {
        kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> function1 = this.onSelectableChangeCallback;
        if (function1 != null) {
            function1.invoke(java.lang.Long.valueOf(selectableId));
        }
    }
}
