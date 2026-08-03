package androidx.compose.runtime;

/* compiled from: Composer.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020%2\u0006\u0010#\u001a\u00020\u0004J\u0016\u0010&\u001a\u00020'2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0006J\u001e\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006J\u0016\u0010-\u001a\u00020'2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006J\u000e\u0010.\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0004J\u0016\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006J\u000e\u00102\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0004R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000ej\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012RW\u0010\u0013\u001a>\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0014j\b\u0012\u0004\u0012\u00020\u0004`\u00150\u000ej\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0014j\b\u0012\u0004\u0012\u00020\u0004`\u0015`\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0012R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Landroidx/compose/runtime/Pending;", "", "keyInfos", "", "Landroidx/compose/runtime/KeyInfo;", "startIndex", "", "(Ljava/util/List;I)V", "groupIndex", "getGroupIndex", "()I", "setGroupIndex", "(I)V", "groupInfos", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupInfo;", "Lkotlin/collections/HashMap;", "getKeyInfos", "()Ljava/util/List;", "keyMap", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "getKeyMap", "()Ljava/util/HashMap;", "keyMap$delegate", "Lkotlin/Lazy;", "getStartIndex", "used", "", "getUsed", "usedKeys", "getNext", com.ironsource.X3.i.W, "dataKey", "nodePositionOf", "keyInfo", "recordUsed", "", "registerInsert", "", "insertIndex", "registerMoveNode", com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM, "to", com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, "registerMoveSlot", "slotPositionOf", "updateNodeCount", "group", "newCount", "updatedNodeCountOf", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class Pending {
    private int groupIndex;
    private final java.util.HashMap<java.lang.Integer, androidx.compose.runtime.GroupInfo> groupInfos;
    private final java.util.List<androidx.compose.runtime.KeyInfo> keyInfos;

    /* renamed from: keyMap$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy keyMap;
    private final int startIndex;
    private final java.util.List<androidx.compose.runtime.KeyInfo> usedKeys;

    public Pending(java.util.List<androidx.compose.runtime.KeyInfo> list, int i) {
        this.keyInfos = list;
        this.startIndex = i;
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Invalid start index".toString());
        }
        this.usedKeys = new java.util.ArrayList();
        java.util.HashMap<java.lang.Integer, androidx.compose.runtime.GroupInfo> hashMap = new java.util.HashMap<>();
        int size = this.keyInfos.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            androidx.compose.runtime.KeyInfo keyInfo = this.keyInfos.get(i3);
            hashMap.put(java.lang.Integer.valueOf(keyInfo.getLocation()), new androidx.compose.runtime.GroupInfo(i3, i2, keyInfo.getNodes()));
            i2 += keyInfo.getNodes();
        }
        this.groupInfos = hashMap;
        this.keyMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.util.HashMap<java.lang.Object, java.util.LinkedHashSet<androidx.compose.runtime.KeyInfo>>>() { // from class: androidx.compose.runtime.Pending$keyMap$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.HashMap<java.lang.Object, java.util.LinkedHashSet<androidx.compose.runtime.KeyInfo>> invoke() {
                java.util.HashMap<java.lang.Object, java.util.LinkedHashSet<androidx.compose.runtime.KeyInfo>> multiMap;
                java.lang.Object joinedKey;
                multiMap = androidx.compose.runtime.ComposerKt.multiMap();
                androidx.compose.runtime.Pending pending = androidx.compose.runtime.Pending.this;
                int size2 = pending.getKeyInfos().size();
                for (int i4 = 0; i4 < size2; i4++) {
                    androidx.compose.runtime.KeyInfo keyInfo2 = pending.getKeyInfos().get(i4);
                    joinedKey = androidx.compose.runtime.ComposerKt.getJoinedKey(keyInfo2);
                    androidx.compose.runtime.ComposerKt.put(multiMap, joinedKey, keyInfo2);
                }
                return multiMap;
            }
        });
    }

    public final java.util.List<androidx.compose.runtime.KeyInfo> getKeyInfos() {
        return this.keyInfos;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int getGroupIndex() {
        return this.groupIndex;
    }

    public final void setGroupIndex(int i) {
        this.groupIndex = i;
    }

    public final java.util.HashMap<java.lang.Object, java.util.LinkedHashSet<androidx.compose.runtime.KeyInfo>> getKeyMap() {
        return (java.util.HashMap) this.keyMap.getValue();
    }

    public final androidx.compose.runtime.KeyInfo getNext(int key, java.lang.Object dataKey) {
        java.lang.Object pop;
        pop = androidx.compose.runtime.ComposerKt.pop(getKeyMap(), dataKey != null ? new androidx.compose.runtime.JoinedKey(java.lang.Integer.valueOf(key), dataKey) : java.lang.Integer.valueOf(key));
        return (androidx.compose.runtime.KeyInfo) pop;
    }

    public final boolean recordUsed(androidx.compose.runtime.KeyInfo keyInfo) {
        return this.usedKeys.add(keyInfo);
    }

    public final java.util.List<androidx.compose.runtime.KeyInfo> getUsed() {
        return this.usedKeys;
    }

    public final void registerMoveSlot(int from, int to) {
        if (from > to) {
            for (androidx.compose.runtime.GroupInfo groupInfo : this.groupInfos.values()) {
                int slotIndex = groupInfo.getSlotIndex();
                if (slotIndex == from) {
                    groupInfo.setSlotIndex(to);
                } else if (to <= slotIndex && slotIndex < from) {
                    groupInfo.setSlotIndex(slotIndex + 1);
                }
            }
            return;
        }
        if (to > from) {
            for (androidx.compose.runtime.GroupInfo groupInfo2 : this.groupInfos.values()) {
                int slotIndex2 = groupInfo2.getSlotIndex();
                if (slotIndex2 == from) {
                    groupInfo2.setSlotIndex(to);
                } else if (from + 1 <= slotIndex2 && slotIndex2 < to) {
                    groupInfo2.setSlotIndex(slotIndex2 - 1);
                }
            }
        }
    }

    public final void registerMoveNode(int from, int to, int count) {
        if (from > to) {
            for (androidx.compose.runtime.GroupInfo groupInfo : this.groupInfos.values()) {
                int nodeIndex = groupInfo.getNodeIndex();
                if (from <= nodeIndex && nodeIndex < from + count) {
                    groupInfo.setNodeIndex((nodeIndex - from) + to);
                } else if (to <= nodeIndex && nodeIndex < from) {
                    groupInfo.setNodeIndex(nodeIndex + count);
                }
            }
            return;
        }
        if (to > from) {
            for (androidx.compose.runtime.GroupInfo groupInfo2 : this.groupInfos.values()) {
                int nodeIndex2 = groupInfo2.getNodeIndex();
                if (from <= nodeIndex2 && nodeIndex2 < from + count) {
                    groupInfo2.setNodeIndex((nodeIndex2 - from) + to);
                } else if (from + 1 <= nodeIndex2 && nodeIndex2 < to) {
                    groupInfo2.setNodeIndex(nodeIndex2 - count);
                }
            }
        }
    }

    public final void registerInsert(androidx.compose.runtime.KeyInfo keyInfo, int insertIndex) {
        this.groupInfos.put(java.lang.Integer.valueOf(keyInfo.getLocation()), new androidx.compose.runtime.GroupInfo(-1, insertIndex, 0));
    }

    public final boolean updateNodeCount(int group, int newCount) {
        int nodeIndex;
        androidx.compose.runtime.GroupInfo groupInfo = this.groupInfos.get(java.lang.Integer.valueOf(group));
        if (groupInfo == null) {
            return false;
        }
        int nodeIndex2 = groupInfo.getNodeIndex();
        int nodeCount = newCount - groupInfo.getNodeCount();
        groupInfo.setNodeCount(newCount);
        if (nodeCount == 0) {
            return true;
        }
        for (androidx.compose.runtime.GroupInfo groupInfo2 : this.groupInfos.values()) {
            if (groupInfo2.getNodeIndex() >= nodeIndex2 && !kotlin.jvm.internal.Intrinsics.areEqual(groupInfo2, groupInfo) && (nodeIndex = groupInfo2.getNodeIndex() + nodeCount) >= 0) {
                groupInfo2.setNodeIndex(nodeIndex);
            }
        }
        return true;
    }

    public final int slotPositionOf(androidx.compose.runtime.KeyInfo keyInfo) {
        androidx.compose.runtime.GroupInfo groupInfo = this.groupInfos.get(java.lang.Integer.valueOf(keyInfo.getLocation()));
        if (groupInfo != null) {
            return groupInfo.getSlotIndex();
        }
        return -1;
    }

    public final int nodePositionOf(androidx.compose.runtime.KeyInfo keyInfo) {
        androidx.compose.runtime.GroupInfo groupInfo = this.groupInfos.get(java.lang.Integer.valueOf(keyInfo.getLocation()));
        if (groupInfo != null) {
            return groupInfo.getNodeIndex();
        }
        return -1;
    }

    public final int updatedNodeCountOf(androidx.compose.runtime.KeyInfo keyInfo) {
        androidx.compose.runtime.GroupInfo groupInfo = this.groupInfos.get(java.lang.Integer.valueOf(keyInfo.getLocation()));
        return groupInfo != null ? groupInfo.getNodeCount() : keyInfo.getNodes();
    }
}
