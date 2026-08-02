package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0017\u0010\n\u001a\u0013\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\b¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0017\u0010\n\u001a\u0013\u0012\t\u0012\u00070\r¢\u0006\u0002\b\t\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\b¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J?\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020\b2&\u0010&\u001a\"\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020$\u0018\u0001`%H\u0000¢\u0006\u0004\b(\u0010)J\u008f\u0001\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020\r2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u00132\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.2\u0006\u00101\u001a\u00020\u00132\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u001502j\b\u0012\u0004\u0012\u00020\u0015`32&\u0010&\u001a\"\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020$\u0018\u0001`%2\u000e\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u000105H\u0000¢\u0006\u0004\b(\u00108J\u0087\u0001\u00109\u001a\u00020'2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u00132\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.2\u0006\u00101\u001a\u00020\u00132\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u001502j\b\u0012\u0004\u0012\u00020\u0015`32&\u0010&\u001a\"\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020$\u0018\u0001`%2\u000e\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u000105H\u0000¢\u0006\u0004\b9\u0010:J\u001f\u0010>\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010<2\u0006\u0010;\u001a\u00020\u0013H\u0000¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\u001c¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u0004\u0018\u00010$2\u0006\u0010B\u001a\u00020\u0013¢\u0006\u0004\bC\u0010DJ\u0019\u0010E\u001a\u0004\u0018\u00010=2\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020'¢\u0006\u0004\bG\u0010\u0005J\r\u0010H\u001a\u00020'¢\u0006\u0004\bH\u0010\u0005J\r\u0010I\u001a\u00020'¢\u0006\u0004\bI\u0010\u0005J\r\u0010K\u001a\u00020J¢\u0006\u0004\bK\u0010LJ'\u0010P\u001a\u00020\u0013*\u00060Mj\u0002`N2\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010O\u001a\u00020\u0013H\u0002¢\u0006\u0004\bP\u0010QJ\u001f\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0<2\u0006\u0010B\u001a\u00020\u0013H\u0000¢\u0006\u0004\bR\u0010?J!\u0010T\u001a\u0004\u0018\u00010/2\u0006\u0010B\u001a\u00020\u00132\u0006\u0010S\u001a\u00020\u0013H\u0000¢\u0006\u0004\bT\u0010UJ\u0016\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00030VH\u0096\u0002¢\u0006\u0004\bW\u0010XJ\u0019\u0010Z\u001a\u0004\u0018\u00010\u00032\u0006\u0010Y\u001a\u00020/H\u0016¢\u0006\u0004\bZ\u0010[R$\u0010,\u001a\u00020+2\u0006\u0010\u0018\u001a\u00020+8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010\\\u001a\u0004\b]\u0010^R$\u0010-\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00138\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b-\u0010_\u001a\u0004\b`\u0010aR4\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b0\u0010b\u001a\u0004\bc\u0010dR$\u00101\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00138\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b1\u0010_\u001a\u0004\be\u0010aR\u0016\u0010f\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bE\u0010_R\u0018\u0010E\u001a\u00060/j\u0002`g8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bf\u0010hR$\u0010*\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u001c8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b*\u0010i\u001a\u0004\bj\u0010AR\"\u0010k\u001a\u00020\u00138\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bk\u0010_\u001a\u0004\bl\u0010a\"\u0004\bm\u0010nR2\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u001502j\b\u0012\u0004\u0012\u00020\u0015`38\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b4\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sRB\u0010&\u001a\"\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020$\u0018\u00010#j\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020$\u0018\u0001`%8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b&\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR*\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u0001058\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b7\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u0014\u0010~\u001a\u00020\u001c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010AR\u001c\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001"}, d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "<init>", "()V", "T", "Lkotlin/Function1;", "Landroidx/compose/runtime/SlotReader;", "Lkotlin/ParameterName;", "block", "read", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroidx/compose/runtime/SlotWriter;", "write", "openReader", "()Landroidx/compose/runtime/SlotReader;", "openWriter", "()Landroidx/compose/runtime/SlotWriter;", "", "index", "Landroidx/compose/runtime/Anchor;", io.ktor.http.LinkHeader.Parameters.Anchor, "(I)Landroidx/compose/runtime/Anchor;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "anchorIndex", "(Landroidx/compose/runtime/Anchor;)I", "", "ownsAnchor", "(Landroidx/compose/runtime/Anchor;)Z", "groupIndex", "groupContainsAnchor", "(ILandroidx/compose/runtime/Anchor;)Z", "reader", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/getHighSpeedVideoFpsRangesFor;", "sourceInformationMap", "", "close$runtime", "(Landroidx/compose/runtime/SlotReader;Ljava/util/HashMap;)V", "writer", "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "anchors", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "calledByMap", "(Landroidx/compose/runtime/SlotWriter;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Landroidx/collection/MutableIntObjectMap;)V", "setTo$runtime", "([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Landroidx/collection/MutableIntObjectMap;)V", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidateGroupsWithKey$runtime", "(I)Ljava/util/List;", "containsMark", "()Z", "group", "sourceInformationOf", "(I)Landroidx/compose/runtime/GroupSourceInformation;", "getHighSpeedVideoSizes", "(I)Landroidx/compose/runtime/RecomposeScopeImpl;", "verifyWellFormed", "collectCalledByInformation", "collectSourceInformation", "", "toDebugString", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "p1", "Camera2StreamConfigurationMap", "(Ljava/lang/StringBuilder;II)I", "slotsOf$runtime", "slotIndex", "slot$runtime", "(II)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "identityToFind", "find", "(Ljava/lang/Object;)Landroidx/compose/runtime/tooling/CompositionGroup;", "[I", "getGroups", "()[I", com.visa.cbp.getEncExpo.warmup, "getGroupsSize", "()I", "[Ljava/lang/Object;", "getSlots", "()[Ljava/lang/Object;", "getSlotsSize", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/platform/SynchronizedObject;", "Ljava/lang/Object;", "Z", "getWriter$runtime", "version", "getVersion$runtime", "setVersion$runtime", "(I)V", "Ljava/util/ArrayList;", "getAnchors$runtime", "()Ljava/util/ArrayList;", "setAnchors$runtime", "(Ljava/util/ArrayList;)V", "Ljava/util/HashMap;", "getSourceInformationMap$runtime", "()Ljava/util/HashMap;", "setSourceInformationMap$runtime", "(Ljava/util/HashMap;)V", "Landroidx/collection/MutableIntObjectMap;", "getCalledByMap$runtime", "()Landroidx/collection/MutableIntObjectMap;", "setCalledByMap$runtime", "(Landroidx/collection/MutableIntObjectMap;)V", "isEmpty", "getCompositionGroups", "()Ljava/lang/Iterable;", "compositionGroups"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SlotTable implements androidx.compose.runtime.tooling.CompositionData, java.lang.Iterable<androidx.compose.runtime.tooling.CompositionGroup>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final int $stable = 8;
    private androidx.collection.MutableIntObjectMap<androidx.collection.MutableIntSet> calledByMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;
    private int groupsSize;
    private int slotsSize;
    private java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> sourceInformationMap;
    private int version;
    private boolean writer;
    private int[] groups = new int[0];
    private java.lang.Object[] slots = new java.lang.Object[0];

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();
    private java.util.ArrayList<androidx.compose.runtime.Anchor> anchors = new java.util.ArrayList<>();

    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final java.lang.Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    /* renamed from: getWriter$runtime, reason: from getter */
    public final boolean getWriter() {
        return this.writer;
    }

    /* renamed from: getVersion$runtime, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final void setVersion$runtime(int i) {
        this.version = i;
    }

    public final java.util.ArrayList<androidx.compose.runtime.Anchor> getAnchors$runtime() {
        return this.anchors;
    }

    public final void setAnchors$runtime(java.util.ArrayList<androidx.compose.runtime.Anchor> arrayList) {
        this.anchors = arrayList;
    }

    public final java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> getSourceInformationMap$runtime() {
        return this.sourceInformationMap;
    }

    public final void setSourceInformationMap$runtime(java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> hashMap) {
        this.sourceInformationMap = hashMap;
    }

    public final androidx.collection.MutableIntObjectMap<androidx.collection.MutableIntSet> getCalledByMap$runtime() {
        return this.calledByMap;
    }

    public final void setCalledByMap$runtime(androidx.collection.MutableIntObjectMap<androidx.collection.MutableIntSet> mutableIntObjectMap) {
        this.calledByMap = mutableIntObjectMap;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public final boolean isEmpty() {
        return this.groupsSize == 0;
    }

    public final <T> T read(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.SlotReader, ? extends T> block) {
        androidx.compose.runtime.SlotReader openReader = openReader();
        try {
            return block.invoke(openReader);
        } finally {
            openReader.close();
        }
    }

    public final <T> T write(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.SlotWriter, ? extends T> block) {
        androidx.compose.runtime.SlotWriter openWriter = openWriter();
        try {
            T invoke = block.invoke(openWriter);
            openWriter.close(true);
            return invoke;
        } catch (java.lang.Throwable th) {
            openWriter.close(false);
            throw th;
        }
    }

    public final androidx.compose.runtime.SlotReader openReader() {
        if (this.writer) {
            throw new java.lang.IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.getHighSpeedVideoFpsRangesFor++;
        return new androidx.compose.runtime.SlotReader(this);
    }

    public final androidx.compose.runtime.SlotWriter openWriter() {
        if (this.writer) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Cannot start a writer when another writer is pending");
        }
        if (this.getHighSpeedVideoFpsRangesFor > 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Cannot start a writer when a reader is pending");
        }
        this.writer = true;
        this.version++;
        return new androidx.compose.runtime.SlotWriter(this);
    }

    public final androidx.compose.runtime.Anchor anchor(int index) {
        int Camera2StreamConfigurationMap;
        if (this.writer) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("use active SlotWriter to create an anchor location instead");
        }
        if (index < 0 || index >= this.groupsSize) {
            androidx.compose.runtime.PreconditionsKt.throwIllegalArgumentException("Parameter index is out of range");
        }
        java.util.ArrayList<androidx.compose.runtime.Anchor> arrayList = this.anchors;
        Camera2StreamConfigurationMap = androidx.compose.runtime.SlotTableKt.Camera2StreamConfigurationMap(arrayList, index, this.groupsSize);
        if (Camera2StreamConfigurationMap < 0) {
            androidx.compose.runtime.Anchor anchor = new androidx.compose.runtime.Anchor(index);
            arrayList.add(-(Camera2StreamConfigurationMap + 1), anchor);
            return anchor;
        }
        return arrayList.get(Camera2StreamConfigurationMap);
    }

    private final androidx.compose.runtime.Anchor getHighResolutionOutputSizeshNQ4ISI(int p0) {
        int i;
        androidx.compose.runtime.Anchor highSpeedVideoSizes;
        if (this.writer) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("use active SlotWriter to crate an anchor for location instead");
        }
        if (p0 < 0 || p0 >= (i = this.groupsSize)) {
            return null;
        }
        highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes((java.util.ArrayList<androidx.compose.runtime.Anchor>) this.anchors, p0, i);
        return highSpeedVideoSizes;
    }

    public final int anchorIndex(androidx.compose.runtime.Anchor anchor) {
        if (this.writer) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Use active SlotWriter to determine anchor location instead");
        }
        if (!anchor.getValid()) {
            androidx.compose.runtime.PreconditionsKt.throwIllegalArgumentException("Anchor refers to a group that was removed");
        }
        return anchor.getLocation();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r0 = androidx.compose.runtime.SlotTableKt.Camera2StreamConfigurationMap(r3.anchors, r4.getLocation(), r3.groupsSize);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean ownsAnchor(androidx.compose.runtime.Anchor anchor) {
        int Camera2StreamConfigurationMap;
        return anchor.getValid() && Camera2StreamConfigurationMap >= 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.anchors.get(Camera2StreamConfigurationMap), anchor);
    }

    public final boolean groupContainsAnchor(int groupIndex, androidx.compose.runtime.Anchor anchor) {
        int highSpeedVideoSizes;
        if (this.writer) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Writer is active");
        }
        if (groupIndex < 0 || groupIndex >= this.groupsSize) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Invalid group index");
        }
        if (!ownsAnchor(anchor)) {
            return false;
        }
        highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.groups, groupIndex);
        int location = anchor.getLocation();
        return groupIndex <= location && location < highSpeedVideoSizes + groupIndex;
    }

    public final void close$runtime(androidx.compose.runtime.SlotReader reader, java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> sourceInformationMap) {
        if (reader.getTable() != this || this.getHighSpeedVideoFpsRangesFor <= 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Unexpected reader close()");
        }
        this.getHighSpeedVideoFpsRangesFor--;
        if (sourceInformationMap != null) {
            synchronized (this.getHighSpeedVideoSizes) {
                java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> hashMap = this.sourceInformationMap;
                if (hashMap != null) {
                    hashMap.putAll(sourceInformationMap);
                } else {
                    this.sourceInformationMap = sourceInformationMap;
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    public final void close$runtime(androidx.compose.runtime.SlotWriter writer, int[] groups, int groupsSize, java.lang.Object[] slots, int slotsSize, java.util.ArrayList<androidx.compose.runtime.Anchor> anchors, java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> sourceInformationMap, androidx.collection.MutableIntObjectMap<androidx.collection.MutableIntSet> calledByMap) {
        if (writer.getTable() != this || !this.writer) {
            androidx.compose.runtime.PreconditionsKt.throwIllegalArgumentException("Unexpected writer close()");
        }
        this.writer = false;
        setTo$runtime(groups, groupsSize, slots, slotsSize, anchors, sourceInformationMap, calledByMap);
    }

    public final void setTo$runtime(int[] groups, int groupsSize, java.lang.Object[] slots, int slotsSize, java.util.ArrayList<androidx.compose.runtime.Anchor> anchors, java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> sourceInformationMap, androidx.collection.MutableIntObjectMap<androidx.collection.MutableIntSet> calledByMap) {
        this.groups = groups;
        this.groupsSize = groupsSize;
        this.slots = slots;
        this.slotsSize = slotsSize;
        this.anchors = anchors;
        this.sourceInformationMap = sourceInformationMap;
        this.calledByMap = calledByMap;
    }

    public final java.util.List<androidx.compose.runtime.RecomposeScopeImpl> invalidateGroupsWithKey$runtime(int target) {
        androidx.collection.MutableIntSet mutableIntSet;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        booleanRef.element = true;
        androidx.collection.MutableIntSet mutableIntSet2 = new androidx.collection.MutableIntSet(0, 1, null);
        mutableIntSet2.add(target);
        mutableIntSet2.add(-3);
        androidx.collection.MutableIntObjectMap<androidx.collection.MutableIntSet> mutableIntObjectMap = this.calledByMap;
        if (mutableIntObjectMap != null && (mutableIntSet = mutableIntObjectMap.get(target)) != null) {
            mutableIntSet2.addAll(mutableIntSet);
        }
        androidx.compose.runtime.SlotReader openReader = openReader();
        try {
            getHighResolutionOutputSizeshNQ4ISI(openReader, mutableIntSet2, arrayList, booleanRef, this, arrayList2);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            openReader.close();
            androidx.compose.runtime.SlotWriter openWriter = openWriter();
            try {
                openWriter.startGroup();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    androidx.compose.runtime.Anchor anchor = (androidx.compose.runtime.Anchor) arrayList.get(i);
                    if (anchor.toIndexFor(openWriter) >= openWriter.getCurrentGroup()) {
                        openWriter.seek(anchor);
                        openWriter.bashCurrentGroup();
                    }
                }
                openWriter.skipToGroupEnd();
                openWriter.endGroup();
                openWriter.close(true);
                if (booleanRef.element) {
                    return arrayList2;
                }
                return null;
            } catch (java.lang.Throwable th) {
                openWriter.close(false);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            openReader.close();
            throw th2;
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.SlotReader slotReader, androidx.collection.MutableIntSet mutableIntSet, java.util.List<androidx.compose.runtime.Anchor> list, kotlin.jvm.internal.Ref.BooleanRef booleanRef, androidx.compose.runtime.SlotTable slotTable, java.util.List<androidx.compose.runtime.RecomposeScopeImpl> list2) {
        androidx.compose.runtime.RecomposeScopeImpl highSpeedVideoSizes;
        int groupKey = slotReader.getGroupKey();
        if (mutableIntSet.contains(groupKey)) {
            if (groupKey != -3) {
                list.add(androidx.compose.runtime.SlotReader.anchor$default(slotReader, 0, 1, null));
            }
            if (booleanRef.element) {
                androidx.compose.runtime.RecomposeScopeImpl highSpeedVideoSizes2 = slotTable.getHighSpeedVideoSizes(slotReader.getCurrentGroup());
                if (highSpeedVideoSizes2 != null) {
                    list2.add(highSpeedVideoSizes2);
                    androidx.compose.runtime.Anchor anchor = highSpeedVideoSizes2.getAnchor();
                    if (anchor != null && anchor.getLocation() == slotReader.getCurrentGroup() && (highSpeedVideoSizes = slotTable.getHighSpeedVideoSizes(slotReader.getParent())) != null) {
                        list2.add(highSpeedVideoSizes);
                    }
                } else {
                    booleanRef.element = false;
                    list2.clear();
                }
            }
            slotReader.skipGroup();
            return;
        }
        slotReader.startGroup();
        while (!slotReader.isGroupEnd()) {
            getHighResolutionOutputSizeshNQ4ISI(slotReader, mutableIntSet, list, booleanRef, slotTable, list2);
        }
        slotReader.endGroup();
    }

    public final boolean containsMark() {
        return this.groupsSize > 0 && (this.groups[1] & 67108864) != 0;
    }

    public final androidx.compose.runtime.GroupSourceInformation sourceInformationOf(int group) {
        androidx.compose.runtime.Anchor highResolutionOutputSizeshNQ4ISI;
        java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap == null || (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(group)) == null) {
            return null;
        }
        return hashMap.get(highResolutionOutputSizeshNQ4ISI);
    }

    private final androidx.compose.runtime.RecomposeScopeImpl getHighSpeedVideoSizes(int p0) {
        int i = p0;
        while (i > 0) {
            java.util.Iterator<java.lang.Object> it = new androidx.compose.runtime.DataIterator(this, i).iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (next instanceof androidx.compose.runtime.RecomposeScopeImpl) {
                    androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = (androidx.compose.runtime.RecomposeScopeImpl) next;
                    if (recomposeScopeImpl.getUsed() && i != p0) {
                        return recomposeScopeImpl;
                    }
                    recomposeScopeImpl.setForcedRecompose(true);
                }
            }
            i = this.groups[(i * 5) + 2];
        }
        return null;
    }

    public final void verifyWellFormed() {
        int highSpeedVideoSizes;
        kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        int i = -1;
        if (this.groupsSize > 0) {
            while (intRef.element < this.groupsSize) {
                int i2 = intRef.element;
                highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.groups, intRef.element);
                getHighResolutionOutputSizeshNQ4ISI(intRef, this, -1, i2 + highSpeedVideoSizes);
            }
            if (intRef.element != this.groupsSize) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Incomplete group at root ");
                sb.append(intRef.element);
                sb.append(" expected to be ");
                sb.append(this.groupsSize);
                androidx.compose.runtime.PreconditionsKt.throwIllegalStateException(sb.toString());
            }
        }
        int length = this.slots.length;
        for (int i3 = this.slotsSize; i3 < length; i3++) {
            if (this.slots[i3] != null) {
                androidx.compose.runtime.PreconditionsKt.throwIllegalStateException("Non null value in the slot gap at index ".concat(java.lang.String.valueOf(i3)));
            }
        }
        java.util.ArrayList<androidx.compose.runtime.Anchor> arrayList = this.anchors;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            int indexFor = arrayList.get(i4).toIndexFor(this);
            if (indexFor < 0 || indexFor > this.groupsSize) {
                androidx.compose.runtime.PreconditionsKt.throwIllegalArgumentException("Invalid anchor, location out of bound");
            }
            if (i >= indexFor) {
                androidx.compose.runtime.PreconditionsKt.throwIllegalArgumentException("Anchor is out of order");
            }
            i4++;
            i = indexFor;
        }
        java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap != null) {
            for (java.util.Map.Entry<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> entry : hashMap.entrySet()) {
                androidx.compose.runtime.Anchor key = entry.getKey();
                androidx.compose.runtime.GroupSourceInformation value = entry.getValue();
                if (!key.getValid()) {
                    androidx.compose.runtime.PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                }
                if (!ownsAnchor(key)) {
                    androidx.compose.runtime.PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                }
                getHighSpeedVideoSizes(this, value);
            }
        }
    }

    private static final int getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.internal.Ref.IntRef intRef, androidx.compose.runtime.SlotTable slotTable, int i, int i2) {
        int highSpeedVideoSizes;
        int outputFormats;
        int highSpeedVideoSizes2;
        int i3 = intRef.element;
        int i4 = i3 + 1;
        intRef.element = i4;
        int i5 = i3 * 5;
        int i6 = slotTable.groups[i5 + 2];
        if (i6 != i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid parent index detected at ");
            sb.append(i3);
            sb.append(", expected parent index to be ");
            sb.append(i);
            sb.append(" found ");
            sb.append(i6);
            androidx.compose.runtime.PreconditionsKt.throwIllegalStateException(sb.toString());
        }
        highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(slotTable.groups, i3);
        int i7 = highSpeedVideoSizes + i3;
        if (i7 > slotTable.groupsSize) {
            androidx.compose.runtime.PreconditionsKt.throwIllegalStateException("A group extends past the end of the table at ".concat(java.lang.String.valueOf(i3)));
        }
        if (i7 > i2) {
            androidx.compose.runtime.PreconditionsKt.throwIllegalStateException("A group extends past its parent group at ".concat(java.lang.String.valueOf(i3)));
        }
        int[] iArr = slotTable.groups;
        int i8 = i5 + 4;
        int i9 = iArr[i8];
        int i10 = i3 >= slotTable.groupsSize - 1 ? slotTable.slotsSize : iArr[(i4 * 5) + 4];
        if (i10 > slotTable.slots.length) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Slots for ");
            sb2.append(i3);
            sb2.append(" extend past the end of the slot table");
            androidx.compose.runtime.PreconditionsKt.throwIllegalStateException(sb2.toString());
        }
        if (i9 > i10) {
            androidx.compose.runtime.PreconditionsKt.throwIllegalStateException("Invalid data anchor at ".concat(java.lang.String.valueOf(i3)));
        }
        outputFormats = androidx.compose.runtime.SlotTableKt.getOutputFormats(slotTable.groups, i3);
        if (outputFormats > i10) {
            androidx.compose.runtime.PreconditionsKt.throwIllegalStateException("Slots start out of range at ".concat(java.lang.String.valueOf(i3)));
        }
        int i11 = i5 + 1;
        int i12 = slotTable.groups[i11];
        int i13 = 0;
        if (i10 - i9 < ((i12 & 1073741824) != 0 ? 1 : 0) + ((536870912 & i12) != 0 ? 1 : 0) + ((i12 & 268435456) != 0 ? 1 : 0)) {
            androidx.compose.runtime.PreconditionsKt.throwIllegalStateException("Not enough slots added for group ".concat(java.lang.String.valueOf(i3)));
        }
        int[] iArr2 = slotTable.groups;
        boolean z = (iArr2[i11] & 1073741824) != 0;
        if (z && slotTable.slots[iArr2[i8]] == null) {
            androidx.compose.runtime.PreconditionsKt.throwIllegalStateException("No node recorded for a node group at ".concat(java.lang.String.valueOf(i3)));
        }
        while (intRef.element < i7) {
            i13 += getHighResolutionOutputSizeshNQ4ISI(intRef, slotTable, i3, i7);
        }
        int[] iArr3 = slotTable.groups;
        int i14 = iArr3[i11] & 67108863;
        highSpeedVideoSizes2 = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(iArr3, i3);
        if (i14 != i13) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Incorrect node count detected at ");
            sb3.append(i3);
            sb3.append(", expected ");
            sb3.append(i14);
            sb3.append(", received ");
            sb3.append(i13);
            androidx.compose.runtime.PreconditionsKt.throwIllegalStateException(sb3.toString());
        }
        int i15 = intRef.element - i3;
        if (highSpeedVideoSizes2 != i15) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Incorrect slot count detected at ");
            sb4.append(i3);
            sb4.append(", expected ");
            sb4.append(highSpeedVideoSizes2);
            sb4.append(", received ");
            sb4.append(i15);
            androidx.compose.runtime.PreconditionsKt.throwIllegalStateException(sb4.toString());
        }
        int[] iArr4 = slotTable.groups;
        if ((iArr4[i11] & 201326592) != 0 && i3 > 0 && (iArr4[(i * 5) + 1] & 67108864) == 0) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Expected group ");
            sb5.append(i);
            sb5.append(" to record it contains a mark because ");
            sb5.append(i3);
            sb5.append(" does");
            androidx.compose.runtime.PreconditionsKt.throwIllegalStateException(sb5.toString());
        }
        if (z) {
            return 1;
        }
        return i13;
    }

    private static final void getHighSpeedVideoSizes(androidx.compose.runtime.SlotTable slotTable, androidx.compose.runtime.GroupSourceInformation groupSourceInformation) {
        java.util.ArrayList<java.lang.Object> groups = groupSourceInformation.getGroups();
        if (groups != null) {
            java.util.ArrayList<java.lang.Object> arrayList = groups;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                java.lang.Object obj = arrayList.get(i);
                if (obj instanceof androidx.compose.runtime.Anchor) {
                    androidx.compose.runtime.Anchor anchor = (androidx.compose.runtime.Anchor) obj;
                    if (!anchor.getValid()) {
                        androidx.compose.runtime.PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                    }
                    if (!slotTable.ownsAnchor(anchor)) {
                        androidx.compose.runtime.PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                    }
                } else if (obj instanceof androidx.compose.runtime.GroupSourceInformation) {
                    getHighSpeedVideoSizes(slotTable, (androidx.compose.runtime.GroupSourceInformation) obj);
                }
            }
        }
    }

    public final void collectCalledByInformation() {
        this.calledByMap = new androidx.collection.MutableIntObjectMap<>(0, 1, null);
    }

    public final void collectSourceInformation() {
        this.sourceInformationMap = new java.util.HashMap<>();
    }

    public final java.lang.String toDebugString() {
        if (this.writer) {
            return super.toString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append('\n');
        int i = this.groupsSize;
        if (i > 0) {
            int i2 = 0;
            while (i2 < i) {
                i2 += Camera2StreamConfigurationMap(sb, i2, 0);
            }
        } else {
            sb.append("<EMPTY>");
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    private final int Camera2StreamConfigurationMap(java.lang.StringBuilder sb, int i, int i2) {
        int highSpeedVideoSizes;
        int outputFormats;
        java.lang.String Camera2StreamConfigurationMap;
        int highSpeedVideoFpsRanges;
        java.lang.String Camera2StreamConfigurationMap2;
        java.lang.String Camera2StreamConfigurationMap3;
        int inputSizeshNQ4ISI;
        java.lang.String Camera2StreamConfigurationMap4;
        java.lang.String sourceInformation;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(' ');
        }
        sb.append("Group(");
        sb.append(i);
        sb.append(")");
        androidx.compose.runtime.GroupSourceInformation sourceInformationOf = sourceInformationOf(i);
        if (sourceInformationOf != null && (sourceInformation = sourceInformationOf.getSourceInformation()) != null && (kotlin.text.StringsKt.startsWith$default(sourceInformation, "C(", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(sourceInformation, "CC(", false, 2, (java.lang.Object) null))) {
            java.lang.String str = sourceInformation;
            int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, "(", 0, false, 6, (java.lang.Object) null);
            int indexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, ')', 0, false, 6, (java.lang.Object) null);
            sb.append(" ");
            java.lang.String substring = sourceInformation.substring(indexOf$default + 1, indexOf$default2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            sb.append(substring);
            sb.append("()");
        }
        sb.append(" key=");
        int i4 = i * 5;
        sb.append(this.groups[i4]);
        highSpeedVideoSizes = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoSizes(this.groups, i);
        sb.append(", nodes=");
        int i5 = i4 + 1;
        sb.append(this.groups[i5] & 67108863);
        sb.append(", size=");
        sb.append(highSpeedVideoSizes);
        if ((this.groups[i5] & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0) {
            sb.append(", mark");
        }
        if ((this.groups[i5] & 67108864) != 0) {
            sb.append(", contains mark");
        }
        int highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(this, i);
        int i6 = i + 1;
        int highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(this, i6);
        if (highSpeedVideoFpsRanges2 < 0 || highSpeedVideoFpsRanges2 > highSpeedVideoFpsRanges3 || highSpeedVideoFpsRanges3 > this.slotsSize) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(", *invalid data offsets ");
            sb2.append(highSpeedVideoFpsRanges2);
            sb2.append('-');
            sb2.append(highSpeedVideoFpsRanges3);
            sb2.append('*');
            sb.append(sb2.toString());
        } else {
            if ((this.groups[i5] & 536870912) != 0) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(" objectKey=");
                java.lang.Object[] objArr = this.slots;
                inputSizeshNQ4ISI = androidx.compose.runtime.SlotTableKt.getInputSizeshNQ4ISI(this.groups, i);
                Camera2StreamConfigurationMap4 = androidx.compose.runtime.SlotTableKt.Camera2StreamConfigurationMap(java.lang.String.valueOf(objArr[inputSizeshNQ4ISI]), 10);
                sb3.append(Camera2StreamConfigurationMap4);
                sb.append(sb3.toString());
            }
            if ((this.groups[i5] & 1073741824) != 0) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder(" node=");
                Camera2StreamConfigurationMap3 = androidx.compose.runtime.SlotTableKt.Camera2StreamConfigurationMap(java.lang.String.valueOf(this.slots[this.groups[i4 + 4]]), 10);
                sb4.append(Camera2StreamConfigurationMap3);
                sb.append(sb4.toString());
            }
            if ((this.groups[i5] & 268435456) != 0) {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder(" aux=");
                java.lang.Object[] objArr2 = this.slots;
                highSpeedVideoFpsRanges = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoFpsRanges(this.groups, i);
                Camera2StreamConfigurationMap2 = androidx.compose.runtime.SlotTableKt.Camera2StreamConfigurationMap(java.lang.String.valueOf(objArr2[highSpeedVideoFpsRanges]), 10);
                sb5.append(Camera2StreamConfigurationMap2);
                sb.append(sb5.toString());
            }
            outputFormats = androidx.compose.runtime.SlotTableKt.getOutputFormats(this.groups, i);
            if (outputFormats < highSpeedVideoFpsRanges3) {
                sb.append(", slots=[");
                sb.append(outputFormats);
                sb.append(": ");
                for (int i7 = outputFormats; i7 < highSpeedVideoFpsRanges3; i7++) {
                    if (i7 != outputFormats) {
                        sb.append(", ");
                    }
                    Camera2StreamConfigurationMap = androidx.compose.runtime.SlotTableKt.Camera2StreamConfigurationMap(java.lang.String.valueOf(this.slots[i7]), 10);
                    sb.append(Camera2StreamConfigurationMap);
                }
                sb.append("]");
            }
        }
        sb.append('\n');
        while (i6 < i + highSpeedVideoSizes) {
            i6 += Camera2StreamConfigurationMap(sb, i6, i2 + 1);
        }
        return highSpeedVideoSizes;
    }

    private static final int getHighSpeedVideoFpsRanges(androidx.compose.runtime.SlotTable slotTable, int i) {
        return i >= slotTable.groupsSize ? slotTable.slotsSize : slotTable.groups[(i * 5) + 4];
    }

    public final java.util.List<java.lang.Object> slotsOf$runtime(int group) {
        int length;
        int[] iArr = this.groups;
        int i = iArr[(group * 5) + 4];
        int i2 = group + 1;
        if (i2 >= this.groupsSize) {
            length = this.slots.length;
        } else {
            length = iArr[(i2 * 5) + 4];
        }
        return kotlin.collections.ArraysKt.toList(this.slots).subList(i, length);
    }

    public final java.lang.Object slot$runtime(int group, int slotIndex) {
        int outputFormats;
        int length;
        outputFormats = androidx.compose.runtime.SlotTableKt.getOutputFormats(this.groups, group);
        int i = group + 1;
        if (i >= this.groupsSize) {
            length = this.slots.length;
        } else {
            length = this.groups[(i * 5) + 4];
        }
        return (slotIndex < 0 || slotIndex >= length - outputFormats) ? androidx.compose.runtime.Composer.INSTANCE.getEmpty() : this.slots[outputFormats + slotIndex];
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public final java.lang.Iterable<androidx.compose.runtime.tooling.CompositionGroup> getCompositionGroups() {
        return this;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<androidx.compose.runtime.tooling.CompositionGroup> iterator() {
        return new androidx.compose.runtime.GroupIterator(this, 0, this.groupsSize);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public final androidx.compose.runtime.tooling.CompositionGroup find(java.lang.Object identityToFind) {
        return new androidx.compose.runtime.SlotTableGroup(this, 0, 0, 4, null).find(identityToFind);
    }
}
