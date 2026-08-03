package androidx.compose.runtime;

/* compiled from: SlotTable.kt */
@kotlin.Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0015J\u000e\u00105\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u0007J\u0006\u00106\u001a\u000207J=\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2&\u0010%\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u00010&j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u0001`(H\u0000¢\u0006\u0002\b<J\u007f\u00108\u001a\u0002092\u0006\u00101\u001a\u00020=2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d2\u0006\u0010#\u001a\u00020\u00152\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2&\u0010%\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u00010&j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u0001`(H\u0000¢\u0006\u0004\b<\u0010>J\u0006\u0010?\u001a\u00020\u001aJ\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00150AH\u0002J\u0012\u0010B\u001a\u0004\u0018\u00010\u00032\u0006\u0010C\u001a\u00020\u001eH\u0016J\u0012\u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010F\u001a\u00020\u0015H\u0002J\u0016\u0010G\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u0007J\u000e\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00150AH\u0002J\u001d\u0010J\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010A2\u0006\u0010K\u001a\u00020\u0015H\u0000¢\u0006\u0002\bLJ\u000f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00030NH\u0096\u0002J\u000e\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00150AH\u0002J\u000e\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00150AH\u0002J\u0006\u0010Q\u001a\u00020;J\u0006\u0010R\u001a\u00020=J\u000e\u0010S\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u0007J\u000e\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00150AH\u0002J7\u0010U\u001a\u0002HV\"\u0004\b\u0000\u0010V2!\u0010W\u001a\u001d\u0012\u0013\u0012\u00110;¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(:\u0012\u0004\u0012\u0002HV0XH\u0086\b¢\u0006\u0002\u0010[Jw\u0010\\\u001a\u0002092\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d2\u0006\u0010#\u001a\u00020\u00152\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2&\u0010%\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u00010&j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u0001`(H\u0000¢\u0006\u0004\b]\u0010^J\u001f\u0010_\u001a\u0004\u0018\u00010\u001e2\u0006\u0010F\u001a\u00020\u00152\u0006\u0010`\u001a\u00020\u0015H\u0000¢\u0006\u0002\baJ\u001d\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0A2\u0006\u0010F\u001a\u00020\u0015H\u0000¢\u0006\u0002\bcJ\u0010\u0010d\u001a\u0004\u0018\u00010'2\u0006\u0010F\u001a\u00020\u0015J\u0010\u0010e\u001a\u0004\u0018\u00010\u00072\u0006\u00104\u001a\u00020\u0015J\u0006\u0010f\u001a\u000209J7\u0010g\u001a\u0002HV\"\u0004\b\u0000\u0010V2!\u0010W\u001a\u001d\u0012\u0013\u0012\u00110=¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(1\u0012\u0004\u0012\u0002HV0XH\u0086\b¢\u0006\u0002\u0010[J \u0010h\u001a\u00020\u0015*\u00060ij\u0002`j2\u0006\u00104\u001a\u00020\u00152\u0006\u0010k\u001a\u00020\u0015H\u0002R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u001e\u0010#\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R:\u0010%\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u00010&j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'\u0018\u0001`(X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0018\"\u0004\b/\u00100R\u001e\u00101\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u001a@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001b¨\u0006l"}, d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "()V", "anchors", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", "getAnchors$runtime_release", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "compositionGroups", "getCompositionGroups", "()Ljava/lang/Iterable;", "<set-?>", "", "groups", "getGroups", "()[I", "", "groupsSize", "getGroupsSize", "()I", "isEmpty", "", "()Z", "readers", "", "", "slots", "getSlots", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "slotsSize", "getSlotsSize", "sourceInformationMap", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "getSourceInformationMap$runtime_release", "()Ljava/util/HashMap;", "setSourceInformationMap$runtime_release", "(Ljava/util/HashMap;)V", "version", "getVersion$runtime_release", "setVersion$runtime_release", "(I)V", "writer", "getWriter$runtime_release", io.ktor.http.LinkHeader.Parameters.Anchor, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "anchorIndex", "asString", "", "close", "", "reader", "Landroidx/compose/runtime/SlotReader;", "close$runtime_release", "Landroidx/compose/runtime/SlotWriter;", "(Landroidx/compose/runtime/SlotWriter;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;)V", "containsMark", "dataIndexes", "", "find", "identityToFind", "findEffectiveRecomposeScope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "group", "groupContainsAnchor", "groupIndex", "groupSizes", "invalidateGroupsWithKey", "target", "invalidateGroupsWithKey$runtime_release", "iterator", "", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "nodes", "openReader", "openWriter", "ownsAnchor", "parentIndexes", "read", "T", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "setTo", "setTo$runtime_release", "([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;)V", "slot", "slotIndex", "slot$runtime_release", "slotsOf", "slotsOf$runtime_release", "sourceInformationOf", "tryAnchor", "verifyWellFormed", "write", "emitGroup", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SlotTable implements androidx.compose.runtime.tooling.CompositionData, java.lang.Iterable<androidx.compose.runtime.tooling.CompositionGroup>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final int $stable = 8;
    private int groupsSize;
    private int readers;
    private int slotsSize;
    private java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> sourceInformationMap;
    private int version;
    private boolean writer;
    private int[] groups = new int[0];
    private java.lang.Object[] slots = new java.lang.Object[0];
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

    /* renamed from: getWriter$runtime_release, reason: from getter */
    public final boolean getWriter() {
        return this.writer;
    }

    /* renamed from: getVersion$runtime_release, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final void setVersion$runtime_release(int i) {
        this.version = i;
    }

    public final java.util.ArrayList<androidx.compose.runtime.Anchor> getAnchors$runtime_release() {
        return this.anchors;
    }

    public final void setAnchors$runtime_release(java.util.ArrayList<androidx.compose.runtime.Anchor> arrayList) {
        this.anchors = arrayList;
    }

    public final java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> getSourceInformationMap$runtime_release() {
        return this.sourceInformationMap;
    }

    public final void setSourceInformationMap$runtime_release(java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> hashMap) {
        this.sourceInformationMap = hashMap;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    public final <T> T read(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.SlotReader, ? extends T> block) {
        androidx.compose.runtime.SlotReader openReader = openReader();
        try {
            return block.invoke(openReader);
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            openReader.close();
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    public final <T> T write(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.SlotWriter, ? extends T> block) {
        androidx.compose.runtime.SlotWriter openWriter = openWriter();
        try {
            return block.invoke(openWriter);
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            openWriter.close();
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    public final androidx.compose.runtime.SlotReader openReader() {
        if (this.writer) {
            throw new java.lang.IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.readers++;
        return new androidx.compose.runtime.SlotReader(this);
    }

    public final androidx.compose.runtime.SlotWriter openWriter() {
        if (!this.writer) {
            if (this.readers <= 0) {
                this.writer = true;
                this.version++;
                return new androidx.compose.runtime.SlotWriter(this);
            }
            androidx.compose.runtime.ComposerKt.composeRuntimeError("Cannot start a writer when a reader is pending".toString());
            throw new kotlin.KotlinNothingValueException();
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("Cannot start a writer when another writer is pending".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    public final androidx.compose.runtime.Anchor anchor(int index) {
        int i;
        if (!(!this.writer)) {
            androidx.compose.runtime.ComposerKt.composeRuntimeError("use active SlotWriter to create an anchor location instead".toString());
            throw new kotlin.KotlinNothingValueException();
        }
        if (index < 0 || index >= (i = this.groupsSize)) {
            throw new java.lang.IllegalArgumentException("Parameter index is out of range".toString());
        }
        java.util.ArrayList<androidx.compose.runtime.Anchor> arrayList = this.anchors;
        int search = androidx.compose.runtime.SlotTableKt.search(arrayList, index, i);
        if (search < 0) {
            androidx.compose.runtime.Anchor anchor = new androidx.compose.runtime.Anchor(index);
            arrayList.add(-(search + 1), anchor);
            return anchor;
        }
        return arrayList.get(search);
    }

    public final androidx.compose.runtime.Anchor tryAnchor(int index) {
        int i;
        androidx.compose.runtime.Anchor find;
        if (!(!this.writer)) {
            androidx.compose.runtime.ComposerKt.composeRuntimeError("use active SlotWriter to crate an anchor for location instead".toString());
            throw new kotlin.KotlinNothingValueException();
        }
        if (index < 0 || index >= (i = this.groupsSize)) {
            return null;
        }
        find = androidx.compose.runtime.SlotTableKt.find(this.anchors, index, i);
        return find;
    }

    public final int anchorIndex(androidx.compose.runtime.Anchor anchor) {
        if (!this.writer) {
            if (!anchor.getValid()) {
                throw new java.lang.IllegalArgumentException("Anchor refers to a group that was removed".toString());
            }
            return anchor.getLocation();
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("Use active SlotWriter to determine anchor location instead".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    public final boolean ownsAnchor(androidx.compose.runtime.Anchor anchor) {
        int search;
        return anchor.getValid() && (search = androidx.compose.runtime.SlotTableKt.search(this.anchors, anchor.getLocation(), this.groupsSize)) >= 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.anchors.get(search), anchor);
    }

    public final boolean groupContainsAnchor(int groupIndex, androidx.compose.runtime.Anchor anchor) {
        int groupSize;
        if (!this.writer) {
            if (groupIndex >= 0 && groupIndex < this.groupsSize) {
                if (ownsAnchor(anchor)) {
                    groupSize = androidx.compose.runtime.SlotTableKt.groupSize(this.groups, groupIndex);
                    int i = groupSize + groupIndex;
                    int location = anchor.getLocation();
                    if (groupIndex <= location && location < i) {
                        return true;
                    }
                }
                return false;
            }
            androidx.compose.runtime.ComposerKt.composeRuntimeError("Invalid group index".toString());
            throw new kotlin.KotlinNothingValueException();
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("Writer is active".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    public final void close$runtime_release(androidx.compose.runtime.SlotReader reader, java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> sourceInformationMap) {
        if (reader.getTable() == this && this.readers > 0) {
            this.readers--;
            if (sourceInformationMap != null) {
                synchronized (this) {
                    java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> hashMap = this.sourceInformationMap;
                    if (hashMap != null) {
                        hashMap.putAll(sourceInformationMap);
                    } else {
                        this.sourceInformationMap = sourceInformationMap;
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                return;
            }
            return;
        }
        androidx.compose.runtime.ComposerKt.composeRuntimeError("Unexpected reader close()".toString());
        throw new kotlin.KotlinNothingValueException();
    }

    public final void close$runtime_release(androidx.compose.runtime.SlotWriter writer, int[] groups, int groupsSize, java.lang.Object[] slots, int slotsSize, java.util.ArrayList<androidx.compose.runtime.Anchor> anchors, java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> sourceInformationMap) {
        if (writer.getTable() != this || !this.writer) {
            throw new java.lang.IllegalArgumentException("Unexpected writer close()".toString());
        }
        this.writer = false;
        setTo$runtime_release(groups, groupsSize, slots, slotsSize, anchors, sourceInformationMap);
    }

    public final void setTo$runtime_release(int[] groups, int groupsSize, java.lang.Object[] slots, int slotsSize, java.util.ArrayList<androidx.compose.runtime.Anchor> anchors, java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> sourceInformationMap) {
        this.groups = groups;
        this.groupsSize = groupsSize;
        this.slots = slots;
        this.slotsSize = slotsSize;
        this.anchors = anchors;
        this.sourceInformationMap = sourceInformationMap;
    }

    public final java.util.List<androidx.compose.runtime.RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release(int target) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        booleanRef.element = true;
        androidx.compose.runtime.SlotReader openReader = openReader();
        try {
            invalidateGroupsWithKey$lambda$16$scanGroup(openReader, target, arrayList, booleanRef, this, arrayList2);
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
                openWriter.close();
                if (booleanRef.element) {
                    return arrayList2;
                }
                return null;
            } catch (java.lang.Throwable th) {
                openWriter.close();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            openReader.close();
            throw th2;
        }
    }

    private static final void invalidateGroupsWithKey$lambda$16$scanGroup(androidx.compose.runtime.SlotReader slotReader, int i, java.util.List<androidx.compose.runtime.Anchor> list, kotlin.jvm.internal.Ref.BooleanRef booleanRef, androidx.compose.runtime.SlotTable slotTable, java.util.List<androidx.compose.runtime.RecomposeScopeImpl> list2) {
        int groupKey = slotReader.getGroupKey();
        if (groupKey == i || groupKey == -3) {
            if (groupKey != -3) {
                list.add(androidx.compose.runtime.SlotReader.anchor$default(slotReader, 0, 1, null));
            }
            if (booleanRef.element) {
                androidx.compose.runtime.RecomposeScopeImpl findEffectiveRecomposeScope = slotTable.findEffectiveRecomposeScope(slotReader.getCurrentGroup());
                if (findEffectiveRecomposeScope != null) {
                    list2.add(findEffectiveRecomposeScope);
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
            invalidateGroupsWithKey$lambda$16$scanGroup(slotReader, i, list, booleanRef, slotTable, list2);
        }
        slotReader.endGroup();
    }

    public final boolean containsMark() {
        boolean containsMark;
        if (this.groupsSize <= 0) {
            return false;
        }
        containsMark = androidx.compose.runtime.SlotTableKt.containsMark(this.groups, 0);
        return containsMark;
    }

    public final androidx.compose.runtime.GroupSourceInformation sourceInformationOf(int group) {
        androidx.compose.runtime.Anchor tryAnchor;
        java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> hashMap = this.sourceInformationMap;
        if (hashMap == null || (tryAnchor = tryAnchor(group)) == null) {
            return null;
        }
        return hashMap.get(tryAnchor);
    }

    private final androidx.compose.runtime.RecomposeScopeImpl findEffectiveRecomposeScope(int group) {
        int i = group;
        while (i > 0) {
            java.util.Iterator<java.lang.Object> it = new androidx.compose.runtime.DataIterator(this, i).iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (next instanceof androidx.compose.runtime.RecomposeScopeImpl) {
                    androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = (androidx.compose.runtime.RecomposeScopeImpl) next;
                    if (recomposeScopeImpl.getUsed() && i != group) {
                        return recomposeScopeImpl;
                    }
                    recomposeScopeImpl.setForcedRecompose(true);
                }
            }
            i = androidx.compose.runtime.SlotTableKt.parentAnchor(this.groups, i);
        }
        return null;
    }

    public final void verifyWellFormed() {
        int groupSize;
        kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        int i = -1;
        if (this.groupsSize > 0) {
            while (intRef.element < this.groupsSize) {
                int i2 = intRef.element;
                groupSize = androidx.compose.runtime.SlotTableKt.groupSize(this.groups, intRef.element);
                verifyWellFormed$validateGroup(intRef, this, -1, i2 + groupSize);
            }
            if (intRef.element != this.groupsSize) {
                throw new java.lang.IllegalStateException(("Incomplete group at root " + intRef.element + " expected to be " + this.groupsSize).toString());
            }
        }
        int length = this.slots.length;
        for (int i3 = this.slotsSize; i3 < length; i3++) {
            if (this.slots[i3] != null) {
                throw new java.lang.IllegalStateException(("Non null value in the slot gap at index " + i3).toString());
            }
        }
        java.util.ArrayList<androidx.compose.runtime.Anchor> arrayList = this.anchors;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            int indexFor = arrayList.get(i4).toIndexFor(this);
            if (indexFor < 0 || indexFor > this.groupsSize) {
                throw new java.lang.IllegalArgumentException("Invalid anchor, location out of bound".toString());
            }
            if (i >= indexFor) {
                throw new java.lang.IllegalArgumentException("Anchor is out of order".toString());
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
                    throw new java.lang.IllegalArgumentException("Source map contains invalid anchor".toString());
                }
                if (!ownsAnchor(key)) {
                    throw new java.lang.IllegalArgumentException("Source map anchor is not owned by the slot table".toString());
                }
                verifyWellFormed$verifySourceGroup(this, value);
            }
        }
    }

    private static final int verifyWellFormed$validateGroup(kotlin.jvm.internal.Ref.IntRef intRef, androidx.compose.runtime.SlotTable slotTable, int i, int i2) {
        int parentAnchor;
        int groupSize;
        int dataAnchor;
        int slotAnchor;
        boolean isNode;
        boolean hasObjectKey;
        boolean hasAux;
        boolean isNode2;
        int nodeCount;
        int groupSize2;
        boolean containsAnyMark;
        boolean containsMark;
        int nodeIndex;
        int i3 = intRef.element;
        int i4 = i3 + 1;
        intRef.element = i4;
        parentAnchor = androidx.compose.runtime.SlotTableKt.parentAnchor(slotTable.groups, i3);
        if (parentAnchor == i) {
            groupSize = androidx.compose.runtime.SlotTableKt.groupSize(slotTable.groups, i3);
            int i5 = groupSize + i3;
            if (i5 > slotTable.groupsSize) {
                throw new java.lang.IllegalStateException(("A group extends past the end of the table at " + i3).toString());
            }
            if (i5 <= i2) {
                dataAnchor = androidx.compose.runtime.SlotTableKt.dataAnchor(slotTable.groups, i3);
                int dataAnchor2 = i3 >= slotTable.groupsSize - 1 ? slotTable.slotsSize : androidx.compose.runtime.SlotTableKt.dataAnchor(slotTable.groups, i4);
                if (dataAnchor2 > slotTable.slots.length) {
                    throw new java.lang.IllegalStateException(("Slots for " + i3 + " extend past the end of the slot table").toString());
                }
                if (dataAnchor <= dataAnchor2) {
                    slotAnchor = androidx.compose.runtime.SlotTableKt.slotAnchor(slotTable.groups, i3);
                    if (slotAnchor <= dataAnchor2) {
                        isNode = androidx.compose.runtime.SlotTableKt.isNode(slotTable.groups, i3);
                        hasObjectKey = androidx.compose.runtime.SlotTableKt.hasObjectKey(slotTable.groups, i3);
                        int i6 = (isNode ? 1 : 0) + (hasObjectKey ? 1 : 0);
                        hasAux = androidx.compose.runtime.SlotTableKt.hasAux(slotTable.groups, i3);
                        if (dataAnchor2 - dataAnchor >= i6 + (hasAux ? 1 : 0)) {
                            isNode2 = androidx.compose.runtime.SlotTableKt.isNode(slotTable.groups, i3);
                            if (isNode2) {
                                java.lang.Object[] objArr = slotTable.slots;
                                nodeIndex = androidx.compose.runtime.SlotTableKt.nodeIndex(slotTable.groups, i3);
                                if (objArr[nodeIndex] == null) {
                                    throw new java.lang.IllegalStateException(("No node recorded for a node group at " + i3).toString());
                                }
                            }
                            int i7 = 0;
                            while (intRef.element < i5) {
                                i7 += verifyWellFormed$validateGroup(intRef, slotTable, i3, i5);
                            }
                            nodeCount = androidx.compose.runtime.SlotTableKt.nodeCount(slotTable.groups, i3);
                            groupSize2 = androidx.compose.runtime.SlotTableKt.groupSize(slotTable.groups, i3);
                            if (nodeCount != i7) {
                                throw new java.lang.IllegalStateException(("Incorrect node count detected at " + i3 + ", expected " + nodeCount + ", received " + i7).toString());
                            }
                            int i8 = intRef.element - i3;
                            if (groupSize2 == i8) {
                                containsAnyMark = androidx.compose.runtime.SlotTableKt.containsAnyMark(slotTable.groups, i3);
                                if (containsAnyMark && i3 > 0) {
                                    containsMark = androidx.compose.runtime.SlotTableKt.containsMark(slotTable.groups, i);
                                    if (!containsMark) {
                                        throw new java.lang.IllegalStateException(("Expected group " + i + " to record it contains a mark because " + i3 + " does").toString());
                                    }
                                }
                                if (isNode2) {
                                    return 1;
                                }
                                return i7;
                            }
                            throw new java.lang.IllegalStateException(("Incorrect slot count detected at " + i3 + ", expected " + groupSize2 + ", received " + i8).toString());
                        }
                        throw new java.lang.IllegalStateException(("Not enough slots added for group " + i3).toString());
                    }
                    throw new java.lang.IllegalStateException(("Slots start out of range at " + i3).toString());
                }
                throw new java.lang.IllegalStateException(("Invalid data anchor at " + i3).toString());
            }
            throw new java.lang.IllegalStateException(("A group extends past its parent group at " + i3).toString());
        }
        throw new java.lang.IllegalStateException(("Invalid parent index detected at " + i3 + ", expected parent index to be " + i + " found " + parentAnchor).toString());
    }

    private static final void verifyWellFormed$verifySourceGroup(androidx.compose.runtime.SlotTable slotTable, androidx.compose.runtime.GroupSourceInformation groupSourceInformation) {
        java.util.ArrayList<java.lang.Object> groups = groupSourceInformation.getGroups();
        if (groups != null) {
            java.util.ArrayList<java.lang.Object> arrayList = groups;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                java.lang.Object obj = arrayList.get(i);
                if (obj instanceof androidx.compose.runtime.Anchor) {
                    androidx.compose.runtime.Anchor anchor = (androidx.compose.runtime.Anchor) obj;
                    if (!anchor.getValid()) {
                        throw new java.lang.IllegalArgumentException("Source map contains invalid anchor".toString());
                    }
                    if (!slotTable.ownsAnchor(anchor)) {
                        throw new java.lang.IllegalArgumentException("Source map anchor is not owned by the slot table".toString());
                    }
                } else if (obj instanceof androidx.compose.runtime.GroupSourceInformation) {
                    verifyWellFormed$verifySourceGroup(slotTable, (androidx.compose.runtime.GroupSourceInformation) obj);
                }
            }
        }
    }

    public final java.lang.String asString() {
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
                i2 += emitGroup(sb, i2, 0);
            }
        } else {
            sb.append("<EMPTY>");
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private final int emitGroup(java.lang.StringBuilder sb, int i, int i2) {
        int key;
        int groupSize;
        int nodeCount;
        boolean hasMark;
        boolean containsMark;
        boolean hasObjectKey;
        boolean isNode;
        boolean hasAux;
        int slotAnchor;
        int auxIndex;
        int nodeIndex;
        int objectKeyIndex;
        java.util.HashMap<androidx.compose.runtime.Anchor, androidx.compose.runtime.GroupSourceInformation> hashMap;
        androidx.compose.runtime.GroupSourceInformation groupSourceInformation;
        java.lang.String sourceInformation;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(' ');
        }
        sb.append("Group(");
        sb.append(i);
        sb.append(")");
        androidx.compose.runtime.Anchor tryAnchor = tryAnchor(i);
        if (tryAnchor != null && (hashMap = this.sourceInformationMap) != null && (groupSourceInformation = hashMap.get(tryAnchor)) != null && (sourceInformation = groupSourceInformation.getSourceInformation()) != null && (kotlin.text.StringsKt.startsWith$default(sourceInformation, "C(", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(sourceInformation, "CC(", false, 2, (java.lang.Object) null))) {
            java.lang.String str = sourceInformation;
            int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, "(", 0, false, 6, (java.lang.Object) null) + 1;
            int indexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, ')', 0, false, 6, (java.lang.Object) null);
            sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
            java.lang.String substring = sourceInformation.substring(indexOf$default, indexOf$default2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append("()");
        }
        sb.append(" key=");
        key = androidx.compose.runtime.SlotTableKt.key(this.groups, i);
        sb.append(key);
        groupSize = androidx.compose.runtime.SlotTableKt.groupSize(this.groups, i);
        sb.append(", nodes=");
        nodeCount = androidx.compose.runtime.SlotTableKt.nodeCount(this.groups, i);
        sb.append(nodeCount);
        sb.append(", size=");
        sb.append(groupSize);
        hasMark = androidx.compose.runtime.SlotTableKt.hasMark(this.groups, i);
        if (hasMark) {
            sb.append(", mark");
        }
        containsMark = androidx.compose.runtime.SlotTableKt.containsMark(this.groups, i);
        if (containsMark) {
            sb.append(", contains mark");
        }
        int emitGroup$dataIndex = emitGroup$dataIndex(this, i);
        int i4 = i + 1;
        int emitGroup$dataIndex2 = emitGroup$dataIndex(this, i4);
        if (emitGroup$dataIndex >= 0 && emitGroup$dataIndex <= emitGroup$dataIndex2 && emitGroup$dataIndex2 <= this.slotsSize) {
            hasObjectKey = androidx.compose.runtime.SlotTableKt.hasObjectKey(this.groups, i);
            if (hasObjectKey) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" objectKey=");
                java.lang.Object[] objArr = this.slots;
                objectKeyIndex = androidx.compose.runtime.SlotTableKt.objectKeyIndex(this.groups, i);
                sb2.append(objArr[objectKeyIndex]);
                sb.append(sb2.toString());
            }
            isNode = androidx.compose.runtime.SlotTableKt.isNode(this.groups, i);
            if (isNode) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(" node=");
                java.lang.Object[] objArr2 = this.slots;
                nodeIndex = androidx.compose.runtime.SlotTableKt.nodeIndex(this.groups, i);
                sb3.append(objArr2[nodeIndex]);
                sb.append(sb3.toString());
            }
            hasAux = androidx.compose.runtime.SlotTableKt.hasAux(this.groups, i);
            if (hasAux) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder(" aux=");
                java.lang.Object[] objArr3 = this.slots;
                auxIndex = androidx.compose.runtime.SlotTableKt.auxIndex(this.groups, i);
                sb4.append(objArr3[auxIndex]);
                sb.append(sb4.toString());
            }
            slotAnchor = androidx.compose.runtime.SlotTableKt.slotAnchor(this.groups, i);
            if (slotAnchor < emitGroup$dataIndex2) {
                sb.append(", slots=[");
                sb.append(slotAnchor);
                sb.append(": ");
                for (int i5 = slotAnchor; i5 < emitGroup$dataIndex2; i5++) {
                    if (i5 != slotAnchor) {
                        sb.append(", ");
                    }
                    sb.append(java.lang.String.valueOf(this.slots[i5]));
                }
                sb.append(com.ironsource.X3.j.e);
            }
        } else {
            sb.append(", *invalid data offsets " + emitGroup$dataIndex + '-' + emitGroup$dataIndex2 + io.ktor.util.date.GMTDateParser.ANY);
        }
        sb.append('\n');
        int i6 = i + groupSize;
        while (i4 < i6) {
            i4 += emitGroup(sb, i4, i2 + 1);
        }
        return groupSize;
    }

    private static final int emitGroup$dataIndex(androidx.compose.runtime.SlotTable slotTable, int i) {
        int dataAnchor;
        if (i >= slotTable.groupsSize) {
            return slotTable.slotsSize;
        }
        dataAnchor = androidx.compose.runtime.SlotTableKt.dataAnchor(slotTable.groups, i);
        return dataAnchor;
    }

    private final java.util.List<java.lang.Integer> keys() {
        java.util.List<java.lang.Integer> keys;
        keys = androidx.compose.runtime.SlotTableKt.keys(this.groups, this.groupsSize * 5);
        return keys;
    }

    private final java.util.List<java.lang.Integer> nodes() {
        java.util.List<java.lang.Integer> nodeCounts;
        nodeCounts = androidx.compose.runtime.SlotTableKt.nodeCounts(this.groups, this.groupsSize * 5);
        return nodeCounts;
    }

    private final java.util.List<java.lang.Integer> parentIndexes() {
        java.util.List<java.lang.Integer> parentAnchors;
        parentAnchors = androidx.compose.runtime.SlotTableKt.parentAnchors(this.groups, this.groupsSize * 5);
        return parentAnchors;
    }

    private final java.util.List<java.lang.Integer> dataIndexes() {
        java.util.List<java.lang.Integer> dataAnchors;
        dataAnchors = androidx.compose.runtime.SlotTableKt.dataAnchors(this.groups, this.groupsSize * 5);
        return dataAnchors;
    }

    private final java.util.List<java.lang.Integer> groupSizes() {
        java.util.List<java.lang.Integer> groupSizes;
        groupSizes = androidx.compose.runtime.SlotTableKt.groupSizes(this.groups, this.groupsSize * 5);
        return groupSizes;
    }

    public final java.util.List<java.lang.Object> slotsOf$runtime_release(int group) {
        int dataAnchor;
        dataAnchor = androidx.compose.runtime.SlotTableKt.dataAnchor(this.groups, group);
        int i = group + 1;
        return kotlin.collections.ArraysKt.toList(this.slots).subList(dataAnchor, i < this.groupsSize ? androidx.compose.runtime.SlotTableKt.dataAnchor(this.groups, i) : this.slots.length);
    }

    public final java.lang.Object slot$runtime_release(int group, int slotIndex) {
        int slotAnchor;
        slotAnchor = androidx.compose.runtime.SlotTableKt.slotAnchor(this.groups, group);
        int i = group + 1;
        return (slotIndex < 0 || slotIndex >= (i < this.groupsSize ? androidx.compose.runtime.SlotTableKt.dataAnchor(this.groups, i) : this.slots.length) - slotAnchor) ? androidx.compose.runtime.Composer.INSTANCE.getEmpty() : this.slots[slotAnchor + slotIndex];
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public java.lang.Iterable<androidx.compose.runtime.tooling.CompositionGroup> getCompositionGroups() {
        return this;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<androidx.compose.runtime.tooling.CompositionGroup> iterator() {
        return new androidx.compose.runtime.GroupIterator(this, 0, this.groupsSize);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public androidx.compose.runtime.tooling.CompositionGroup find(java.lang.Object identityToFind) {
        return new androidx.compose.runtime.SlotTableGroup(this, 0, 0, 4, null).find(identityToFind);
    }
}
