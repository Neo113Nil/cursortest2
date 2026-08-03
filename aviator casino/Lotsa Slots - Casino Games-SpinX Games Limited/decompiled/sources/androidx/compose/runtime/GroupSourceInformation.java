package androidx.compose.runtime;

/* compiled from: SlotTable.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0001H\u0002J\u001e\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003J\u0006\u0010!\u001a\u00020\u001bJ\u0006\u0010\"\u001a\u00020\u001bJ\u0010\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u0000H\u0002J\u000e\u0010'\u001a\u00020\b2\u0006\u0010$\u001a\u00020%J\u0016\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*2\u0006\u0010\u001c\u001a\u00020\u0003J\u0016\u0010(\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u0003J\u0016\u0010+\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006,"}, d2 = {"Landroidx/compose/runtime/GroupSourceInformation;", "", com.ironsource.X3.i.W, "", "sourceInformation", "", "(ILjava/lang/String;)V", "closed", "", "getClosed", "()Z", "setClosed", "(Z)V", "groups", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getGroups", "()Ljava/util/ArrayList;", "setGroups", "(Ljava/util/ArrayList;)V", "getKey", "()I", "getSourceInformation", "()Ljava/lang/String;", "setSourceInformation", "(Ljava/lang/String;)V", "add", "", "group", "addGroupAfter", "writer", "Landroidx/compose/runtime/SlotWriter;", "predecessor", "close", "endGrouplessCall", "hasAnchor", io.ktor.http.LinkHeader.Parameters.Anchor, "Landroidx/compose/runtime/Anchor;", "openInformation", "removeAnchor", "reportGroup", com.ironsource.B5.R, "Landroidx/compose/runtime/SlotTable;", "startGrouplessCall", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GroupSourceInformation {
    public static final int $stable = 8;
    private boolean closed;
    private java.util.ArrayList<java.lang.Object> groups;
    private final int key;
    private java.lang.String sourceInformation;

    public GroupSourceInformation(int i, java.lang.String str) {
        this.key = i;
        this.sourceInformation = str;
    }

    public final int getKey() {
        return this.key;
    }

    public final java.lang.String getSourceInformation() {
        return this.sourceInformation;
    }

    public final void setSourceInformation(java.lang.String str) {
        this.sourceInformation = str;
    }

    public final java.util.ArrayList<java.lang.Object> getGroups() {
        return this.groups;
    }

    public final void setGroups(java.util.ArrayList<java.lang.Object> arrayList) {
        this.groups = arrayList;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final void setClosed(boolean z) {
        this.closed = z;
    }

    public final void startGrouplessCall(int key, java.lang.String sourceInformation) {
        openInformation().add(new androidx.compose.runtime.GroupSourceInformation(key, sourceInformation));
    }

    public final void endGrouplessCall() {
        openInformation().close();
    }

    public final void reportGroup(androidx.compose.runtime.SlotWriter writer, int group) {
        openInformation().add(writer.anchor(group));
    }

    public final void reportGroup(androidx.compose.runtime.SlotTable table, int group) {
        openInformation().add(table.anchor(group));
    }

    public final void addGroupAfter(androidx.compose.runtime.SlotWriter writer, int predecessor, int group) {
        androidx.compose.runtime.Anchor tryAnchor$runtime_release;
        java.util.ArrayList<java.lang.Object> arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList<>();
            this.groups = arrayList;
        }
        int i = 0;
        if (predecessor >= 0 && (tryAnchor$runtime_release = writer.tryAnchor$runtime_release(predecessor)) != null) {
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                java.lang.Object obj = arrayList.get(i);
                if (kotlin.jvm.internal.Intrinsics.areEqual(obj, tryAnchor$runtime_release) || ((obj instanceof androidx.compose.runtime.GroupSourceInformation) && ((androidx.compose.runtime.GroupSourceInformation) obj).hasAnchor(tryAnchor$runtime_release))) {
                    break;
                } else {
                    i++;
                }
            }
        }
        arrayList.add(i, writer.anchor(group));
    }

    public final void close() {
        this.closed = true;
    }

    private final androidx.compose.runtime.GroupSourceInformation openInformation() {
        java.lang.Object obj;
        androidx.compose.runtime.GroupSourceInformation openInformation;
        java.util.ArrayList<java.lang.Object> arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                obj = arrayList.get(size);
                if ((obj instanceof androidx.compose.runtime.GroupSourceInformation) && !((androidx.compose.runtime.GroupSourceInformation) obj).closed) {
                    break;
                }
            }
        }
        obj = null;
        androidx.compose.runtime.GroupSourceInformation groupSourceInformation = obj instanceof androidx.compose.runtime.GroupSourceInformation ? (androidx.compose.runtime.GroupSourceInformation) obj : null;
        return (groupSourceInformation == null || (openInformation = groupSourceInformation.openInformation()) == null) ? this : openInformation;
    }

    private final void add(java.lang.Object group) {
        java.util.ArrayList<java.lang.Object> arrayList = this.groups;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList<>();
        }
        this.groups = arrayList;
        arrayList.add(group);
    }

    private final boolean hasAnchor(androidx.compose.runtime.Anchor anchor) {
        java.util.ArrayList<java.lang.Object> arrayList = this.groups;
        if (arrayList == null) {
            return false;
        }
        java.util.ArrayList<java.lang.Object> arrayList2 = arrayList;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = arrayList2.get(i);
            if (kotlin.jvm.internal.Intrinsics.areEqual(obj, anchor) || ((obj instanceof androidx.compose.runtime.GroupSourceInformation) && ((androidx.compose.runtime.GroupSourceInformation) obj).hasAnchor(anchor))) {
                return true;
            }
        }
        return false;
    }

    public final boolean removeAnchor(androidx.compose.runtime.Anchor anchor) {
        java.util.ArrayList<java.lang.Object> arrayList = this.groups;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                java.lang.Object obj = arrayList.get(size);
                if (obj instanceof androidx.compose.runtime.Anchor) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(obj, anchor)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof androidx.compose.runtime.GroupSourceInformation) && !((androidx.compose.runtime.GroupSourceInformation) obj).removeAnchor(anchor)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.groups = null;
                return false;
            }
        }
        return true;
    }
}
