package androidx.compose.runtime.changelist;

/* compiled from: Operation.kt */
@kotlin.Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:!\u001f !\"#$%&'()*+,-./0123456789:;<=>?B\u001b\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u001a\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\t2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011J\b\u0010\u0015\u001a\u00020\tH\u0016J(\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007\u0082\u0001\u001f@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006_"}, d2 = {"Landroidx/compose/runtime/changelist/Operation;", "", "ints", "", "objects", "(II)V", "getInts", "()I", "name", "", "getName", "()Ljava/lang/String;", "getObjects", "intParamName", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "objectParamName", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "objectParamName-31yXWZQ", "toString", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "AdvanceSlotsBy", "ApplyChangeList", "CopyNodesToNewAnchorLocation", "CopySlotTableToAnchorLocation", "DeactivateCurrentGroup", "DetermineMovableContentNodeIndex", "Downs", "EndCompositionScope", "EndCurrentGroup", "EndMovableContentPlacement", "EnsureGroupStarted", "EnsureRootGroupStarted", "InsertNodeFixup", "InsertSlots", "InsertSlotsWithFixups", "IntParameter", "MoveCurrentGroup", "MoveNode", "ObjectParameter", "PostInsertNodeFixup", "ReleaseMovableGroupAtCurrent", "Remember", "RemoveCurrentGroup", "RemoveNode", "ResetSlots", "SideEffect", "SkipToEndOfCurrentGroup", "TestOperation", "UpdateAuxData", "UpdateNode", "UpdateValue", "Ups", "UseCurrentNode", "Landroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy;", "Landroidx/compose/runtime/changelist/Operation$ApplyChangeList;", "Landroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation$DeactivateCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex;", "Landroidx/compose/runtime/changelist/Operation$Downs;", "Landroidx/compose/runtime/changelist/Operation$EndCompositionScope;", "Landroidx/compose/runtime/changelist/Operation$EndCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$EndMovableContentPlacement;", "Landroidx/compose/runtime/changelist/Operation$EnsureGroupStarted;", "Landroidx/compose/runtime/changelist/Operation$EnsureRootGroupStarted;", "Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation$InsertSlots;", "Landroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups;", "Landroidx/compose/runtime/changelist/Operation$MoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$MoveNode;", "Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent;", "Landroidx/compose/runtime/changelist/Operation$Remember;", "Landroidx/compose/runtime/changelist/Operation$RemoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$RemoveNode;", "Landroidx/compose/runtime/changelist/Operation$ResetSlots;", "Landroidx/compose/runtime/changelist/Operation$SideEffect;", "Landroidx/compose/runtime/changelist/Operation$SkipToEndOfCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation$TestOperation;", "Landroidx/compose/runtime/changelist/Operation$UpdateAuxData;", "Landroidx/compose/runtime/changelist/Operation$UpdateNode;", "Landroidx/compose/runtime/changelist/Operation$UpdateValue;", "Landroidx/compose/runtime/changelist/Operation$Ups;", "Landroidx/compose/runtime/changelist/Operation$UseCurrentNode;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Operation {
    public static final int $stable = 0;
    private final int ints;
    private final int objects;

    public /* synthetic */ Operation(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    public abstract void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager);

    private Operation(int i, int i2) {
        this.ints = i;
        this.objects = i2;
    }

    public /* synthetic */ Operation(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, null);
    }

    public final int getInts() {
        return this.ints;
    }

    public final int getObjects() {
        return this.objects;
    }

    public final java.lang.String getName() {
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
        return simpleName == null ? "" : simpleName;
    }

    /* renamed from: intParamName-w8GmfQM, reason: not valid java name */
    public java.lang.String mo1653intParamNamew8GmfQM(int parameter) {
        return "IntParameter(" + parameter + ')';
    }

    /* renamed from: objectParamName-31yXWZQ, reason: not valid java name */
    public java.lang.String mo1654objectParamName31yXWZQ(int parameter) {
        return "ObjectParameter(" + parameter + ')';
    }

    public java.lang.String toString() {
        return getName();
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$IntParameter;", "", "offset", "", "constructor-impl", "(I)I", "getOffset", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class IntParameter {
        private final int offset;

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.compose.runtime.changelist.Operation.IntParameter m1678boximpl(int i) {
            return new androidx.compose.runtime.changelist.Operation.IntParameter(i);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m1679constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1680equalsimpl(int i, java.lang.Object obj) {
            return (obj instanceof androidx.compose.runtime.changelist.Operation.IntParameter) && i == ((androidx.compose.runtime.changelist.Operation.IntParameter) obj).m1684unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1681equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1682hashCodeimpl(int i) {
            return i;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m1683toStringimpl(int i) {
            return "IntParameter(offset=" + i + ')';
        }

        public boolean equals(java.lang.Object obj) {
            return m1680equalsimpl(this.offset, obj);
        }

        public int hashCode() {
            return m1682hashCodeimpl(this.offset);
        }

        public java.lang.String toString() {
            return m1683toStringimpl(this.offset);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m1684unboximpl() {
            return this.offset;
        }

        private /* synthetic */ IntParameter(int i) {
            this.offset = i;
        }

        public final int getOffset() {
            return this.offset;
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0003¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "T", "", "offset", "", "constructor-impl", "(I)I", "getOffset", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class ObjectParameter<T> {
        private final int offset;

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.compose.runtime.changelist.Operation.ObjectParameter m1689boximpl(int i) {
            return new androidx.compose.runtime.changelist.Operation.ObjectParameter(i);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static <T> int m1690constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1691equalsimpl(int i, java.lang.Object obj) {
            return (obj instanceof androidx.compose.runtime.changelist.Operation.ObjectParameter) && i == ((androidx.compose.runtime.changelist.Operation.ObjectParameter) obj).m1695unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1692equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1693hashCodeimpl(int i) {
            return i;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m1694toStringimpl(int i) {
            return "ObjectParameter(offset=" + i + ')';
        }

        public boolean equals(java.lang.Object obj) {
            return m1691equalsimpl(this.offset, obj);
        }

        public int hashCode() {
            return m1693hashCodeimpl(this.offset);
        }

        public java.lang.String toString() {
            return m1694toStringimpl(this.offset);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m1695unboximpl() {
            return this.offset;
        }

        private /* synthetic */ ObjectParameter(int i) {
            this.offset = i;
        }

        public final int getOffset() {
            return this.offset;
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\r*\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0018\u0010\u0003\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$Ups;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Count", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getCount-jn0FJLE", "()I", "intParamName", "", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Ups extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.Ups INSTANCE = new androidx.compose.runtime.changelist.Operation.Ups();

        private Ups() {
            super(1, 0, 2, null);
        }

        /* renamed from: getCount-jn0FJLE, reason: not valid java name */
        public final int m1710getCountjn0FJLE() {
            return androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public java.lang.String mo1653intParamNamew8GmfQM(int parameter) {
            return androidx.compose.runtime.changelist.Operation.IntParameter.m1681equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0)) ? com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT : super.mo1653intParamNamew8GmfQM(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            int mo1711getIntw8GmfQM = operationArgContainer.mo1711getIntw8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0));
            for (int i = 0; i < mo1711getIntw8GmfQM; i++) {
                applier.up();
            }
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R&\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$Downs;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Nodes", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "", "", "getNodes-HpuvwBQ", "()I", "objectParamName", "", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Downs extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.Downs INSTANCE = new androidx.compose.runtime.changelist.Operation.Downs();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Downs() {
            super(0, r0, r0, null);
            int i = 1;
        }

        /* renamed from: getNodes-HpuvwBQ, reason: not valid java name */
        public final int m1666getNodesHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (java.lang.Object obj : (java.lang.Object[]) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0))) {
                applier.down(obj);
            }
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public java.lang.String mo1654objectParamName31yXWZQ(int parameter) {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0)) ? "nodes" : super.mo1654objectParamName31yXWZQ(parameter);
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\r*\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0018\u0010\u0003\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Distance", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getDistance-jn0FJLE", "()I", "intParamName", "", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AdvanceSlotsBy extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.AdvanceSlotsBy INSTANCE = new androidx.compose.runtime.changelist.Operation.AdvanceSlotsBy();

        private AdvanceSlotsBy() {
            super(1, 0, 2, null);
        }

        /* renamed from: getDistance-jn0FJLE, reason: not valid java name */
        public final int m1655getDistancejn0FJLE() {
            return androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public java.lang.String mo1653intParamNamew8GmfQM(int parameter) {
            return androidx.compose.runtime.changelist.Operation.IntParameter.m1681equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0)) ? "distance" : super.mo1653intParamNamew8GmfQM(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            slotWriter.advanceBy(operationArgContainer.mo1711getIntw8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0)));
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\u00020\u0006*\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R$\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$SideEffect;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Effect", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Lkotlin/Function0;", "", "getEffect-HpuvwBQ", "()I", "objectParamName", "", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SideEffect extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.SideEffect INSTANCE = new androidx.compose.runtime.changelist.Operation.SideEffect();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private SideEffect() {
            super(0, r0, r0, null);
            int i = 1;
        }

        /* renamed from: getEffect-HpuvwBQ, reason: not valid java name */
        public final int m1704getEffectHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public java.lang.String mo1654objectParamName31yXWZQ(int parameter) {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0)) ? "effect" : super.mo1654objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            rememberManager.sideEffect((kotlin.jvm.functions.Function0) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0)));
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u000e*\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$Remember;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Value", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/RememberObserver;", "getValue-HpuvwBQ", "()I", "objectParamName", "", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Remember extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.Remember INSTANCE = new androidx.compose.runtime.changelist.Operation.Remember();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Remember() {
            super(0, r0, r0, null);
            int i = 1;
        }

        /* renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m1701getValueHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public java.lang.String mo1654objectParamName31yXWZQ(int parameter) {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0)) ? "value" : super.mo1654objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            rememberManager.remembering((androidx.compose.runtime.RememberObserver) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0)));
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ(\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0018\u0010\u0003\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateValue;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "GroupSlotIndex", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getGroupSlotIndex-jn0FJLE", "()I", "Value", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "", "getValue-HpuvwBQ", "intParamName", "", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "objectParamName", "objectParamName-31yXWZQ", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UpdateValue extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.UpdateValue INSTANCE = new androidx.compose.runtime.changelist.Operation.UpdateValue();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private UpdateValue() {
            super(r0, r0, null);
            int i = 1;
        }

        /* renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m1709getValueHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0);
        }

        /* renamed from: getGroupSlotIndex-jn0FJLE, reason: not valid java name */
        public final int m1708getGroupSlotIndexjn0FJLE() {
            return androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public java.lang.String mo1653intParamNamew8GmfQM(int parameter) {
            return androidx.compose.runtime.changelist.Operation.IntParameter.m1681equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0)) ? "groupSlotIndex" : super.mo1653intParamNamew8GmfQM(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public java.lang.String mo1654objectParamName31yXWZQ(int parameter) {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0)) ? "value" : super.mo1654objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            java.lang.Object mo1712getObject31yXWZQ = operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0));
            int mo1711getIntw8GmfQM = operationArgContainer.mo1711getIntw8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0));
            if (mo1712getObject31yXWZQ instanceof androidx.compose.runtime.RememberObserverHolder) {
                rememberManager.remembering(((androidx.compose.runtime.RememberObserverHolder) mo1712getObject31yXWZQ).getWrapped());
            }
            java.lang.Object obj = slotWriter.set(mo1711getIntw8GmfQM, mo1712getObject31yXWZQ);
            if (obj instanceof androidx.compose.runtime.RememberObserverHolder) {
                rememberManager.forgetting(((androidx.compose.runtime.RememberObserverHolder) obj).getWrapped());
            } else if (obj instanceof androidx.compose.runtime.RecomposeScopeImpl) {
                ((androidx.compose.runtime.RecomposeScopeImpl) obj).release();
            }
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u000e*\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R \u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateAuxData;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Data", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "", "getData-HpuvwBQ", "()I", "objectParamName", "", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UpdateAuxData extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.UpdateAuxData INSTANCE = new androidx.compose.runtime.changelist.Operation.UpdateAuxData();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private UpdateAuxData() {
            super(0, r0, r0, null);
            int i = 1;
        }

        /* renamed from: getData-HpuvwBQ, reason: not valid java name */
        public final int m1705getDataHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public java.lang.String mo1654objectParamName31yXWZQ(int parameter) {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0)) ? "data" : super.mo1654objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            slotWriter.updateAux(operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0)));
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EnsureRootGroupStarted;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EnsureRootGroupStarted extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.EnsureRootGroupStarted INSTANCE = new androidx.compose.runtime.changelist.Operation.EnsureRootGroupStarted();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private EnsureRootGroupStarted() {
            super(r2, r2, 3, null);
            int i = 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            slotWriter.ensureStarted(0);
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u000e*\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EnsureGroupStarted;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "objectParamName", "", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EnsureGroupStarted extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.EnsureGroupStarted INSTANCE = new androidx.compose.runtime.changelist.Operation.EnsureGroupStarted();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private EnsureGroupStarted() {
            super(0, r0, r0, null);
            int i = 1;
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m1669getAnchorHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public java.lang.String mo1654objectParamName31yXWZQ(int parameter) {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0)) ? io.ktor.http.LinkHeader.Parameters.Anchor : super.mo1654objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            slotWriter.ensureStarted((androidx.compose.runtime.Anchor) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0)));
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$RemoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RemoveCurrentGroup extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.RemoveCurrentGroup INSTANCE = new androidx.compose.runtime.changelist.Operation.RemoveCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private RemoveCurrentGroup() {
            super(r2, r2, 3, null);
            int i = 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            androidx.compose.runtime.ComposerKt.removeCurrentGroup(slotWriter, rememberManager);
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\r*\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0018\u0010\u0003\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$MoveCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Offset", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getOffset-jn0FJLE", "()I", "intParamName", "", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class MoveCurrentGroup extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.MoveCurrentGroup INSTANCE = new androidx.compose.runtime.changelist.Operation.MoveCurrentGroup();

        private MoveCurrentGroup() {
            super(1, 0, 2, null);
        }

        /* renamed from: getOffset-jn0FJLE, reason: not valid java name */
        public final int m1685getOffsetjn0FJLE() {
            return androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public java.lang.String mo1653intParamNamew8GmfQM(int parameter) {
            return androidx.compose.runtime.changelist.Operation.IntParameter.m1681equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0)) ? "offset" : super.mo1653intParamNamew8GmfQM(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            slotWriter.moveGroup(operationArgContainer.mo1711getIntw8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0)));
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EndCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EndCurrentGroup extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.EndCurrentGroup INSTANCE = new androidx.compose.runtime.changelist.Operation.EndCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private EndCurrentGroup() {
            super(r2, r2, 3, null);
            int i = 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            slotWriter.endGroup();
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$SkipToEndOfCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SkipToEndOfCurrentGroup extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.SkipToEndOfCurrentGroup INSTANCE = new androidx.compose.runtime.changelist.Operation.SkipToEndOfCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private SkipToEndOfCurrentGroup() {
            super(r2, r2, 3, null);
            int i = 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            slotWriter.skipToGroupEnd();
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\u00020\u0007*\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R*\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EndCompositionScope;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Action", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "", "getAction-HpuvwBQ", "()I", "Composition", "getComposition-HpuvwBQ", "objectParamName", "", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EndCompositionScope extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.EndCompositionScope INSTANCE = new androidx.compose.runtime.changelist.Operation.EndCompositionScope();

        private EndCompositionScope() {
            super(0, 2, 1, null);
        }

        /* renamed from: getAction-HpuvwBQ, reason: not valid java name */
        public final int m1667getActionHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0);
        }

        /* renamed from: getComposition-HpuvwBQ, reason: not valid java name */
        public final int m1668getCompositionHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public java.lang.String mo1654objectParamName31yXWZQ(int parameter) {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0)) ? io.ktor.http.LinkHeader.Parameters.Anchor : androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1)) ? "composition" : super.mo1654objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            ((kotlin.jvm.functions.Function1) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0))).invoke((androidx.compose.runtime.Composition) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1)));
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UseCurrentNode;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UseCurrentNode extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.UseCurrentNode INSTANCE = new androidx.compose.runtime.changelist.Operation.UseCurrentNode();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private UseCurrentNode() {
            super(r2, r2, 3, null);
            int i = 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            java.lang.Object current = applier.getCurrent();
            kotlin.jvm.internal.Intrinsics.checkNotNull(current, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((androidx.compose.runtime.ComposeNodeLifecycleCallback) current).onReuse();
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0012\u001a\u00020\u0007*\u00020\u00132\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R9\u0010\u0003\u001a#\u0012\u001f\u0012\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$UpdateNode;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Block", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getBlock-HpuvwBQ", "()I", "Value", "getValue-HpuvwBQ", "objectParamName", "", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UpdateNode extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.UpdateNode INSTANCE = new androidx.compose.runtime.changelist.Operation.UpdateNode();

        private UpdateNode() {
            super(0, 2, 1, null);
        }

        /* renamed from: getValue-HpuvwBQ, reason: not valid java name */
        public final int m1707getValueHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0);
        }

        /* renamed from: getBlock-HpuvwBQ, reason: not valid java name */
        public final int m1706getBlockHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public java.lang.String mo1654objectParamName31yXWZQ(int parameter) {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0)) ? "value" : androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1)) ? "block" : super.mo1654objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            ((kotlin.jvm.functions.Function2) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1))).invoke(applier.getCurrent(), operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0)));
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0018\u0010\u0003\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$RemoveNode;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Count", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getCount-jn0FJLE", "()I", "RemoveIndex", "getRemoveIndex-jn0FJLE", "intParamName", "", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RemoveNode extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.RemoveNode INSTANCE = new androidx.compose.runtime.changelist.Operation.RemoveNode();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private RemoveNode() {
            super(r2, 0, r2, null);
            int i = 2;
        }

        /* renamed from: getRemoveIndex-jn0FJLE, reason: not valid java name */
        public final int m1703getRemoveIndexjn0FJLE() {
            return androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0);
        }

        /* renamed from: getCount-jn0FJLE, reason: not valid java name */
        public final int m1702getCountjn0FJLE() {
            return androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public java.lang.String mo1653intParamNamew8GmfQM(int parameter) {
            return androidx.compose.runtime.changelist.Operation.IntParameter.m1681equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0)) ? "removeIndex" : androidx.compose.runtime.changelist.Operation.IntParameter.m1681equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(1)) ? com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT : super.mo1653intParamNamew8GmfQM(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            applier.remove(operationArgContainer.mo1711getIntw8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0)), operationArgContainer.mo1711getIntw8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(1)));
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0018\u0010\u0003\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$MoveNode;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Count", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getCount-jn0FJLE", "()I", com.google.common.net.HttpHeaders.FROM, "getFrom-jn0FJLE", "To", "getTo-jn0FJLE", "intParamName", "", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class MoveNode extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.MoveNode INSTANCE = new androidx.compose.runtime.changelist.Operation.MoveNode();

        private MoveNode() {
            super(3, 0, 2, null);
        }

        /* renamed from: getFrom-jn0FJLE, reason: not valid java name */
        public final int m1687getFromjn0FJLE() {
            return androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0);
        }

        /* renamed from: getTo-jn0FJLE, reason: not valid java name */
        public final int m1688getTojn0FJLE() {
            return androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(1);
        }

        /* renamed from: getCount-jn0FJLE, reason: not valid java name */
        public final int m1686getCountjn0FJLE() {
            return androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public java.lang.String mo1653intParamNamew8GmfQM(int parameter) {
            return androidx.compose.runtime.changelist.Operation.IntParameter.m1681equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0)) ? com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM : androidx.compose.runtime.changelist.Operation.IntParameter.m1681equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(1)) ? "to" : androidx.compose.runtime.changelist.Operation.IntParameter.m1681equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(2)) ? com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT : super.mo1653intParamNamew8GmfQM(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            applier.move(operationArgContainer.mo1711getIntw8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0)), operationArgContainer.mo1711getIntw8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(1)), operationArgContainer.mo1711getIntw8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(2)));
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertSlots;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "FromSlotTable", "Landroidx/compose/runtime/SlotTable;", "getFromSlotTable-HpuvwBQ", "objectParamName", "", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InsertSlots extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.InsertSlots INSTANCE = new androidx.compose.runtime.changelist.Operation.InsertSlots();

        private InsertSlots() {
            super(0, 2, 1, null);
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m1673getAnchorHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0);
        }

        /* renamed from: getFromSlotTable-HpuvwBQ, reason: not valid java name */
        public final int m1674getFromSlotTableHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public java.lang.String mo1654objectParamName31yXWZQ(int parameter) {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0)) ? io.ktor.http.LinkHeader.Parameters.Anchor : androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1)) ? com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM : super.mo1654objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            androidx.compose.runtime.SlotTable slotTable = (androidx.compose.runtime.SlotTable) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1));
            androidx.compose.runtime.Anchor anchor = (androidx.compose.runtime.Anchor) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0));
            slotWriter.beginInsert();
            slotWriter.moveFrom(slotTable, anchor.toIndexFor(slotTable), false);
            slotWriter.endInsert();
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "Fixups", "Landroidx/compose/runtime/changelist/FixupList;", "getFixups-HpuvwBQ", "FromSlotTable", "Landroidx/compose/runtime/SlotTable;", "getFromSlotTable-HpuvwBQ", "objectParamName", "", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InsertSlotsWithFixups extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.InsertSlotsWithFixups INSTANCE = new androidx.compose.runtime.changelist.Operation.InsertSlotsWithFixups();

        private InsertSlotsWithFixups() {
            super(0, 3, 1, null);
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m1675getAnchorHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0);
        }

        /* renamed from: getFromSlotTable-HpuvwBQ, reason: not valid java name */
        public final int m1677getFromSlotTableHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1);
        }

        /* renamed from: getFixups-HpuvwBQ, reason: not valid java name */
        public final int m1676getFixupsHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public java.lang.String mo1654objectParamName31yXWZQ(int parameter) {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0)) ? io.ktor.http.LinkHeader.Parameters.Anchor : androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1)) ? com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM : androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(2)) ? "fixups" : super.mo1654objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            androidx.compose.runtime.SlotTable slotTable = (androidx.compose.runtime.SlotTable) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1));
            androidx.compose.runtime.Anchor anchor = (androidx.compose.runtime.Anchor) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0));
            androidx.compose.runtime.changelist.FixupList fixupList = (androidx.compose.runtime.changelist.FixupList) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(2));
            androidx.compose.runtime.SlotWriter openWriter = slotTable.openWriter();
            try {
                fixupList.executeAndFlushAllPendingFixups(applier, openWriter, rememberManager);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                openWriter.close();
                slotWriter.beginInsert();
                slotWriter.moveFrom(slotTable, anchor.toIndexFor(slotTable), false);
                slotWriter.endInsert();
            } catch (java.lang.Throwable th) {
                openWriter.close();
                throw th;
            }
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013J(\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R&\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u0018\u0010\f\u001a\u00020\r8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$InsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Factory", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Lkotlin/Function0;", "", "getFactory-HpuvwBQ", "()I", "GroupAnchor", "Landroidx/compose/runtime/Anchor;", "getGroupAnchor-HpuvwBQ", "InsertIndex", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getInsertIndex-jn0FJLE", "intParamName", "", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "objectParamName", "objectParamName-31yXWZQ", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InsertNodeFixup extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.InsertNodeFixup INSTANCE = new androidx.compose.runtime.changelist.Operation.InsertNodeFixup();

        private InsertNodeFixup() {
            super(1, 2, null);
        }

        /* renamed from: getFactory-HpuvwBQ, reason: not valid java name */
        public final int m1670getFactoryHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0);
        }

        /* renamed from: getInsertIndex-jn0FJLE, reason: not valid java name */
        public final int m1672getInsertIndexjn0FJLE() {
            return androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0);
        }

        /* renamed from: getGroupAnchor-HpuvwBQ, reason: not valid java name */
        public final int m1671getGroupAnchorHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public java.lang.String mo1653intParamNamew8GmfQM(int parameter) {
            return androidx.compose.runtime.changelist.Operation.IntParameter.m1681equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0)) ? "insertIndex" : super.mo1653intParamNamew8GmfQM(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public java.lang.String mo1654objectParamName31yXWZQ(int parameter) {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0)) ? "factory" : androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1)) ? "groupAnchor" : super.mo1654objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            java.lang.Object invoke = ((kotlin.jvm.functions.Function0) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0))).invoke();
            androidx.compose.runtime.Anchor anchor = (androidx.compose.runtime.Anchor) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1));
            int mo1711getIntw8GmfQM = operationArgContainer.mo1711getIntw8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0));
            kotlin.jvm.internal.Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            slotWriter.updateNode(anchor, invoke);
            applier.insertTopDown(mo1711getIntw8GmfQM, invoke);
            applier.down(invoke);
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ(\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\t8Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$PostInsertNodeFixup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "GroupAnchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getGroupAnchor-HpuvwBQ", "()I", "InsertIndex", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getInsertIndex-jn0FJLE", "intParamName", "", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "intParamName-w8GmfQM", "(I)Ljava/lang/String;", "objectParamName", "objectParamName-31yXWZQ", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PostInsertNodeFixup extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.PostInsertNodeFixup INSTANCE = new androidx.compose.runtime.changelist.Operation.PostInsertNodeFixup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private PostInsertNodeFixup() {
            super(r0, r0, null);
            int i = 1;
        }

        /* renamed from: getInsertIndex-jn0FJLE, reason: not valid java name */
        public final int m1697getInsertIndexjn0FJLE() {
            return androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0);
        }

        /* renamed from: getGroupAnchor-HpuvwBQ, reason: not valid java name */
        public final int m1696getGroupAnchorHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: intParamName-w8GmfQM */
        public java.lang.String mo1653intParamNamew8GmfQM(int parameter) {
            return androidx.compose.runtime.changelist.Operation.IntParameter.m1681equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0)) ? "insertIndex" : super.mo1653intParamNamew8GmfQM(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public java.lang.String mo1654objectParamName31yXWZQ(int parameter) {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0)) ? "groupAnchor" : super.mo1654objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            androidx.compose.runtime.Anchor anchor = (androidx.compose.runtime.Anchor) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0));
            int mo1711getIntw8GmfQM = operationArgContainer.mo1711getIntw8GmfQM(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(0));
            applier.up();
            kotlin.jvm.internal.Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            applier.insertBottomUp(mo1711getIntw8GmfQM, slotWriter.node(anchor));
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$DeactivateCurrentGroup;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DeactivateCurrentGroup extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.DeactivateCurrentGroup INSTANCE = new androidx.compose.runtime.changelist.Operation.DeactivateCurrentGroup();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private DeactivateCurrentGroup() {
            super(r2, r2, 3, null);
            int i = 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            androidx.compose.runtime.ComposerKt.deactivateCurrentGroup(slotWriter, rememberManager);
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ResetSlots;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ResetSlots extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.ResetSlots INSTANCE = new androidx.compose.runtime.changelist.Operation.ResetSlots();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ResetSlots() {
            super(r2, r2, 3, null);
            int i = 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            slotWriter.reset();
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Anchor", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/Anchor;", "getAnchor-HpuvwBQ", "()I", "EffectiveNodeIndexOut", "Landroidx/compose/runtime/internal/IntRef;", "getEffectiveNodeIndexOut-HpuvwBQ", "objectParamName", "", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DetermineMovableContentNodeIndex extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.DetermineMovableContentNodeIndex INSTANCE = new androidx.compose.runtime.changelist.Operation.DetermineMovableContentNodeIndex();

        private DetermineMovableContentNodeIndex() {
            super(0, 2, 1, null);
        }

        /* renamed from: getEffectiveNodeIndexOut-HpuvwBQ, reason: not valid java name */
        public final int m1665getEffectiveNodeIndexOutHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0);
        }

        /* renamed from: getAnchor-HpuvwBQ, reason: not valid java name */
        public final int m1664getAnchorHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public java.lang.String mo1654objectParamName31yXWZQ(int parameter) {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0)) ? "effectiveNodeIndexOut" : androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1)) ? io.ktor.http.LinkHeader.Parameters.Anchor : super.mo1654objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            int positionToInsert;
            androidx.compose.runtime.internal.IntRef intRef = (androidx.compose.runtime.internal.IntRef) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0));
            androidx.compose.runtime.Anchor anchor = (androidx.compose.runtime.Anchor) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1));
            kotlin.jvm.internal.Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            positionToInsert = androidx.compose.runtime.changelist.OperationKt.positionToInsert(slotWriter, anchor, applier);
            intRef.setElement(positionToInsert);
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R&\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "EffectiveNodeIndex", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/internal/IntRef;", "getEffectiveNodeIndex-HpuvwBQ", "()I", "Nodes", "", "", "getNodes-HpuvwBQ", "objectParamName", "", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CopyNodesToNewAnchorLocation extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.CopyNodesToNewAnchorLocation INSTANCE = new androidx.compose.runtime.changelist.Operation.CopyNodesToNewAnchorLocation();

        private CopyNodesToNewAnchorLocation() {
            super(0, 2, 1, null);
        }

        /* renamed from: getEffectiveNodeIndex-HpuvwBQ, reason: not valid java name */
        public final int m1658getEffectiveNodeIndexHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0);
        }

        /* renamed from: getNodes-HpuvwBQ, reason: not valid java name */
        public final int m1659getNodesHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public java.lang.String mo1654objectParamName31yXWZQ(int parameter) {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0)) ? "effectiveNodeIndex" : androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1)) ? "nodes" : super.mo1654objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            int element = ((androidx.compose.runtime.internal.IntRef) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0))).getElement();
            java.util.List list = (java.util.List) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1));
            int size = list.size();
            for (int i = 0; i < size; i++) {
                java.lang.Object obj = list.get(i);
                kotlin.jvm.internal.Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i2 = element + i;
                applier.insertBottomUp(i2, obj);
                applier.insertTopDown(i2, obj);
            }
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R \u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation;", "Landroidx/compose/runtime/changelist/Operation;", "()V", com.google.common.net.HttpHeaders.FROM, "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/MovableContentStateReference;", "getFrom-HpuvwBQ", "()I", "ParentCompositionContext", "Landroidx/compose/runtime/CompositionContext;", "getParentCompositionContext-HpuvwBQ", "ResolvedState", "Landroidx/compose/runtime/MovableContentState;", "getResolvedState-HpuvwBQ", "To", "getTo-HpuvwBQ", "objectParamName", "", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CopySlotTableToAnchorLocation extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.CopySlotTableToAnchorLocation INSTANCE = new androidx.compose.runtime.changelist.Operation.CopySlotTableToAnchorLocation();

        private CopySlotTableToAnchorLocation() {
            super(0, 4, 1, null);
        }

        /* renamed from: getResolvedState-HpuvwBQ, reason: not valid java name */
        public final int m1662getResolvedStateHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0);
        }

        /* renamed from: getParentCompositionContext-HpuvwBQ, reason: not valid java name */
        public final int m1661getParentCompositionContextHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1);
        }

        /* renamed from: getFrom-HpuvwBQ, reason: not valid java name */
        public final int m1660getFromHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(2);
        }

        /* renamed from: getTo-HpuvwBQ, reason: not valid java name */
        public final int m1663getToHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(3);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public java.lang.String mo1654objectParamName31yXWZQ(int parameter) {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0)) ? "resolvedState" : androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1)) ? "resolvedCompositionContext" : androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(2)) ? com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM : androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(3)) ? "to" : super.mo1654objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            androidx.compose.runtime.MovableContentStateReference movableContentStateReference = (androidx.compose.runtime.MovableContentStateReference) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(2));
            androidx.compose.runtime.MovableContentStateReference movableContentStateReference2 = (androidx.compose.runtime.MovableContentStateReference) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(3));
            androidx.compose.runtime.CompositionContext compositionContext = (androidx.compose.runtime.CompositionContext) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1));
            androidx.compose.runtime.MovableContentState movableContentState = (androidx.compose.runtime.MovableContentState) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0));
            if (movableContentState == null && (movableContentState = compositionContext.movableContentStateResolve$runtime_release(movableContentStateReference)) == null) {
                androidx.compose.runtime.ComposerKt.composeRuntimeError("Could not resolve state for movable content");
                throw new kotlin.KotlinNothingValueException();
            }
            java.util.List<androidx.compose.runtime.Anchor> moveIntoGroupFrom = slotWriter.moveIntoGroupFrom(1, movableContentState.getSlotTable(), 2);
            androidx.compose.runtime.RecomposeScopeImpl.Companion companion = androidx.compose.runtime.RecomposeScopeImpl.INSTANCE;
            androidx.compose.runtime.ControlledComposition composition = movableContentStateReference2.getComposition();
            kotlin.jvm.internal.Intrinsics.checkNotNull(composition, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
            companion.adoptAnchoredScopes$runtime_release(slotWriter, moveIntoGroupFrom, (androidx.compose.runtime.RecomposeScopeOwner) composition);
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$EndMovableContentPlacement;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EndMovableContentPlacement extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.EndMovableContentPlacement INSTANCE = new androidx.compose.runtime.changelist.Operation.EndMovableContentPlacement();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private EndMovableContentPlacement() {
            super(r2, r2, 3, null);
            int i = 0;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            androidx.compose.runtime.changelist.OperationKt.positionToParentOf(slotWriter, applier, 0);
            slotWriter.endGroup();
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Composition", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/ControlledComposition;", "getComposition-HpuvwBQ", "()I", "ParentCompositionContext", "Landroidx/compose/runtime/CompositionContext;", "getParentCompositionContext-HpuvwBQ", "Reference", "Landroidx/compose/runtime/MovableContentStateReference;", "getReference-HpuvwBQ", "objectParamName", "", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ReleaseMovableGroupAtCurrent extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.ReleaseMovableGroupAtCurrent INSTANCE = new androidx.compose.runtime.changelist.Operation.ReleaseMovableGroupAtCurrent();

        private ReleaseMovableGroupAtCurrent() {
            super(0, 3, 1, null);
        }

        /* renamed from: getComposition-HpuvwBQ, reason: not valid java name */
        public final int m1698getCompositionHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0);
        }

        /* renamed from: getParentCompositionContext-HpuvwBQ, reason: not valid java name */
        public final int m1699getParentCompositionContextHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1);
        }

        /* renamed from: getReference-HpuvwBQ, reason: not valid java name */
        public final int m1700getReferenceHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(2);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public java.lang.String mo1654objectParamName31yXWZQ(int parameter) {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0)) ? "composition" : androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1)) ? "parentCompositionContext" : androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(2)) ? "reference" : super.mo1654objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            androidx.compose.runtime.changelist.OperationKt.releaseMovableGroupAtCurrent((androidx.compose.runtime.ControlledComposition) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0)), (androidx.compose.runtime.CompositionContext) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1)), (androidx.compose.runtime.MovableContentStateReference) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(2)), slotWriter);
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$ApplyChangeList;", "Landroidx/compose/runtime/changelist/Operation;", "()V", "Changes", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "Landroidx/compose/runtime/changelist/ChangeList;", "getChanges-HpuvwBQ", "()I", "EffectiveNodeIndex", "Landroidx/compose/runtime/internal/IntRef;", "getEffectiveNodeIndex-HpuvwBQ", "objectParamName", "", com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "objectParamName-31yXWZQ", "(I)Ljava/lang/String;", "execute", "", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ApplyChangeList extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 0;
        public static final androidx.compose.runtime.changelist.Operation.ApplyChangeList INSTANCE = new androidx.compose.runtime.changelist.Operation.ApplyChangeList();

        private ApplyChangeList() {
            super(0, 2, 1, null);
        }

        /* renamed from: getChanges-HpuvwBQ, reason: not valid java name */
        public final int m1656getChangesHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0);
        }

        /* renamed from: getEffectiveNodeIndex-HpuvwBQ, reason: not valid java name */
        public final int m1657getEffectiveNodeIndexHpuvwBQ() {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        /* renamed from: objectParamName-31yXWZQ */
        public java.lang.String mo1654objectParamName31yXWZQ(int parameter) {
            return androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0)) ? "changes" : androidx.compose.runtime.changelist.Operation.ObjectParameter.m1692equalsimpl0(parameter, androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1)) ? "effectiveNodeIndex" : super.mo1654objectParamName31yXWZQ(parameter);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            androidx.compose.runtime.internal.IntRef intRef = (androidx.compose.runtime.internal.IntRef) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(1));
            int element = intRef != null ? intRef.getElement() : 0;
            androidx.compose.runtime.changelist.ChangeList changeList = (androidx.compose.runtime.changelist.ChangeList) operationArgContainer.mo1712getObject31yXWZQ(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(0));
            if (element > 0) {
                applier = new androidx.compose.runtime.OffsetApplier(applier, element);
            }
            changeList.executeAndFlushAllPendingChanges(applier, slotWriter, rememberManager);
        }
    }

    /* compiled from: Operation.kt */
    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012$\b\u0002\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0002\u0010\u000bJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J(\u0010\u0019\u001a\u00020\n*\u00020\u001a2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\tH\u0016R-\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00140\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/changelist/Operation$TestOperation;", "Landroidx/compose/runtime/changelist/Operation;", "ints", "", "objects", "block", "Lkotlin/Function3;", "Landroidx/compose/runtime/Applier;", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "", "(IILkotlin/jvm/functions/Function3;)V", "getBlock", "()Lkotlin/jvm/functions/Function3;", "intParams", "", "Landroidx/compose/runtime/changelist/Operation$IntParameter;", "getIntParams", "()Ljava/util/List;", "objParams", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "", "getObjParams", "toString", "", "execute", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "applier", "slots", "rememberManager", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TestOperation extends androidx.compose.runtime.changelist.Operation {
        public static final int $stable = 8;
        private final kotlin.jvm.functions.Function3<androidx.compose.runtime.Applier<?>, androidx.compose.runtime.SlotWriter, androidx.compose.runtime.RememberManager, kotlin.Unit> block;
        private final java.util.List<androidx.compose.runtime.changelist.Operation.IntParameter> intParams;
        private final java.util.List<androidx.compose.runtime.changelist.Operation.ObjectParameter<java.lang.Object>> objParams;

        public TestOperation() {
            this(0, 0, null, 7, null);
        }

        public /* synthetic */ TestOperation(int i, int i2, androidx.compose.runtime.changelist.Operation.TestOperation.AnonymousClass1 anonymousClass1, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? new kotlin.jvm.functions.Function3<androidx.compose.runtime.Applier<?>, androidx.compose.runtime.SlotWriter, androidx.compose.runtime.RememberManager, kotlin.Unit>() { // from class: androidx.compose.runtime.changelist.Operation.TestOperation.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return kotlin.Unit.INSTANCE;
                }
            } : anonymousClass1);
        }

        public final kotlin.jvm.functions.Function3<androidx.compose.runtime.Applier<?>, androidx.compose.runtime.SlotWriter, androidx.compose.runtime.RememberManager, kotlin.Unit> getBlock() {
            return this.block;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TestOperation(int i, int i2, kotlin.jvm.functions.Function3<? super androidx.compose.runtime.Applier<?>, ? super androidx.compose.runtime.SlotWriter, ? super androidx.compose.runtime.RememberManager, kotlin.Unit> function3) {
            super(i, i2, null);
            this.block = function3;
            java.util.ArrayList arrayList = new java.util.ArrayList(i);
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(androidx.compose.runtime.changelist.Operation.IntParameter.m1678boximpl(androidx.compose.runtime.changelist.Operation.IntParameter.m1679constructorimpl(i3)));
            }
            this.intParams = arrayList;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList2.add(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1689boximpl(androidx.compose.runtime.changelist.Operation.ObjectParameter.m1690constructorimpl(i4)));
            }
            this.objParams = arrayList2;
        }

        public final java.util.List<androidx.compose.runtime.changelist.Operation.IntParameter> getIntParams() {
            return this.intParams;
        }

        public final java.util.List<androidx.compose.runtime.changelist.Operation.ObjectParameter<java.lang.Object>> getObjParams() {
            return this.objParams;
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public void execute(androidx.compose.runtime.changelist.OperationArgContainer operationArgContainer, androidx.compose.runtime.Applier<?> applier, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.RememberManager rememberManager) {
            this.block.invoke(applier, slotWriter, rememberManager);
        }

        @Override // androidx.compose.runtime.changelist.Operation
        public java.lang.String toString() {
            return "TestOperation(ints = " + getInts() + ", objects = " + getObjects() + ")@" + java.lang.System.identityHashCode(this);
        }
    }
}
