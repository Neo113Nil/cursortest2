package androidx.glance.appwidget;

import androidx.appcompat.view.menu.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Landroidx/glance/appwidget/RowColumnChildSelector;", "", "type", "Landroidx/glance/appwidget/LayoutType;", "expandWidth", "", "expandHeight", "(Landroidx/glance/appwidget/LayoutType;ZZ)V", "getExpandHeight", "()Z", "getExpandWidth", "getType", "()Landroidx/glance/appwidget/LayoutType;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RowColumnChildSelector {
    private final boolean expandHeight;
    private final boolean expandWidth;
    private final LayoutType type;

    public RowColumnChildSelector(LayoutType layoutType, boolean z, boolean z2) {
        this.type = layoutType;
        this.expandWidth = z;
        this.expandHeight = z2;
    }

    public static /* synthetic */ RowColumnChildSelector copy$default(RowColumnChildSelector rowColumnChildSelector, LayoutType layoutType, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            layoutType = rowColumnChildSelector.type;
        }
        if ((i & 2) != 0) {
            z = rowColumnChildSelector.expandWidth;
        }
        if ((i & 4) != 0) {
            z2 = rowColumnChildSelector.expandHeight;
        }
        return rowColumnChildSelector.copy(layoutType, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final LayoutType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getExpandWidth() {
        return this.expandWidth;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getExpandHeight() {
        return this.expandHeight;
    }

    public final RowColumnChildSelector copy(LayoutType type, boolean expandWidth, boolean expandHeight) {
        return new RowColumnChildSelector(type, expandWidth, expandHeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RowColumnChildSelector)) {
            return false;
        }
        RowColumnChildSelector rowColumnChildSelector = (RowColumnChildSelector) other;
        return this.type == rowColumnChildSelector.type && this.expandWidth == rowColumnChildSelector.expandWidth && this.expandHeight == rowColumnChildSelector.expandHeight;
    }

    public final boolean getExpandHeight() {
        return this.expandHeight;
    }

    public final boolean getExpandWidth() {
        return this.expandWidth;
    }

    public final LayoutType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        boolean z = this.expandWidth;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.expandHeight;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RowColumnChildSelector(type=");
        sb.append(this.type);
        sb.append(", expandWidth=");
        sb.append(this.expandWidth);
        sb.append(", expandHeight=");
        return a.c(sb, this.expandHeight, ')');
    }
}
