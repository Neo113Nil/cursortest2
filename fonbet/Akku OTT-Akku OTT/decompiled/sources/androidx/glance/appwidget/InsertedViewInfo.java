package androidx.glance.appwidget;

import androidx.collection.g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012 \b\u0002\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00060\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J!\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00060\u0006HÆ\u0003J?\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032 \b\u0002\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00060\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R)\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Landroidx/glance/appwidget/InsertedViewInfo;", "", "mainViewId", "", "complexViewId", "children", "", "Landroidx/glance/appwidget/SizeSelector;", "(IILjava/util/Map;)V", "getChildren", "()Ljava/util/Map;", "getComplexViewId", "()I", "getMainViewId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class InsertedViewInfo {
    private final Map<Integer, Map<SizeSelector, Integer>> children;
    private final int complexViewId;
    private final int mainViewId;

    public InsertedViewInfo() {
        this(0, 0, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InsertedViewInfo copy$default(InsertedViewInfo insertedViewInfo, int i, int i2, Map map, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = insertedViewInfo.mainViewId;
        }
        if ((i3 & 2) != 0) {
            i2 = insertedViewInfo.complexViewId;
        }
        if ((i3 & 4) != 0) {
            map = insertedViewInfo.children;
        }
        return insertedViewInfo.copy(i, i2, map);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMainViewId() {
        return this.mainViewId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getComplexViewId() {
        return this.complexViewId;
    }

    public final Map<Integer, Map<SizeSelector, Integer>> component3() {
        return this.children;
    }

    public final InsertedViewInfo copy(int mainViewId, int complexViewId, Map<Integer, ? extends Map<SizeSelector, Integer>> children) {
        return new InsertedViewInfo(mainViewId, complexViewId, children);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsertedViewInfo)) {
            return false;
        }
        InsertedViewInfo insertedViewInfo = (InsertedViewInfo) other;
        return this.mainViewId == insertedViewInfo.mainViewId && this.complexViewId == insertedViewInfo.complexViewId && Intrinsics.areEqual(this.children, insertedViewInfo.children);
    }

    public final Map<Integer, Map<SizeSelector, Integer>> getChildren() {
        return this.children;
    }

    public final int getComplexViewId() {
        return this.complexViewId;
    }

    public final int getMainViewId() {
        return this.mainViewId;
    }

    public int hashCode() {
        return this.children.hashCode() + g.a(this.complexViewId, Integer.hashCode(this.mainViewId) * 31, 31);
    }

    public String toString() {
        return "InsertedViewInfo(mainViewId=" + this.mainViewId + ", complexViewId=" + this.complexViewId + ", children=" + this.children + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InsertedViewInfo(int i, int i2, Map<Integer, ? extends Map<SizeSelector, Integer>> map) {
        this.mainViewId = i;
        this.complexViewId = i2;
        this.children = map;
    }

    public /* synthetic */ InsertedViewInfo(int i, int i2, Map map, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? MapsKt.emptyMap() : map);
    }
}
