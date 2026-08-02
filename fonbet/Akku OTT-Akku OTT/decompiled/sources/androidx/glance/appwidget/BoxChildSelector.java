package androidx.glance.appwidget;

import androidx.glance.layout.Alignment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0010\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\nJ\u0019\u0010\u0012\u001a\u00020\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\nJ4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/glance/appwidget/BoxChildSelector;", "", "type", "Landroidx/glance/appwidget/LayoutType;", "horizontalAlignment", "Landroidx/glance/layout/Alignment$Horizontal;", "verticalAlignment", "Landroidx/glance/layout/Alignment$Vertical;", "(Landroidx/glance/appwidget/LayoutType;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHorizontalAlignment-PGIyAqw", "()I", "I", "getType", "()Landroidx/glance/appwidget/LayoutType;", "getVerticalAlignment-mnfRV0w", "component1", "component2", "component2-PGIyAqw", "component3", "component3-mnfRV0w", "copy", "copy-vmlqhMs", "(Landroidx/glance/appwidget/LayoutType;II)Landroidx/glance/appwidget/BoxChildSelector;", "equals", "", "other", "hashCode", "", "toString", "", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BoxChildSelector {
    private final int horizontalAlignment;
    private final LayoutType type;
    private final int verticalAlignment;

    public /* synthetic */ BoxChildSelector(LayoutType layoutType, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutType, i, i2);
    }

    /* renamed from: copy-vmlqhMs$default, reason: not valid java name */
    public static /* synthetic */ BoxChildSelector m1290copyvmlqhMs$default(BoxChildSelector boxChildSelector, LayoutType layoutType, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            layoutType = boxChildSelector.type;
        }
        if ((i3 & 2) != 0) {
            i = boxChildSelector.horizontalAlignment;
        }
        if ((i3 & 4) != 0) {
            i2 = boxChildSelector.verticalAlignment;
        }
        return boxChildSelector.m1293copyvmlqhMs(layoutType, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final LayoutType getType() {
        return this.type;
    }

    /* renamed from: component2-PGIyAqw, reason: not valid java name and from getter */
    public final int getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    /* renamed from: component3-mnfRV0w, reason: not valid java name and from getter */
    public final int getVerticalAlignment() {
        return this.verticalAlignment;
    }

    /* renamed from: copy-vmlqhMs, reason: not valid java name */
    public final BoxChildSelector m1293copyvmlqhMs(LayoutType type, int horizontalAlignment, int verticalAlignment) {
        return new BoxChildSelector(type, horizontalAlignment, verticalAlignment, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxChildSelector)) {
            return false;
        }
        BoxChildSelector boxChildSelector = (BoxChildSelector) other;
        return this.type == boxChildSelector.type && Alignment.Horizontal.m1372equalsimpl0(this.horizontalAlignment, boxChildSelector.horizontalAlignment) && Alignment.Vertical.m1382equalsimpl0(this.verticalAlignment, boxChildSelector.verticalAlignment);
    }

    /* renamed from: getHorizontalAlignment-PGIyAqw, reason: not valid java name */
    public final int m1294getHorizontalAlignmentPGIyAqw() {
        return this.horizontalAlignment;
    }

    public final LayoutType getType() {
        return this.type;
    }

    /* renamed from: getVerticalAlignment-mnfRV0w, reason: not valid java name */
    public final int m1295getVerticalAlignmentmnfRV0w() {
        return this.verticalAlignment;
    }

    public int hashCode() {
        return Alignment.Vertical.m1383hashCodeimpl(this.verticalAlignment) + ((Alignment.Horizontal.m1373hashCodeimpl(this.horizontalAlignment) + (this.type.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "BoxChildSelector(type=" + this.type + ", horizontalAlignment=" + ((Object) Alignment.Horizontal.m1374toStringimpl(this.horizontalAlignment)) + ", verticalAlignment=" + ((Object) Alignment.Vertical.m1384toStringimpl(this.verticalAlignment)) + ')';
    }

    private BoxChildSelector(LayoutType layoutType, int i, int i2) {
        this.type = layoutType;
        this.horizontalAlignment = i;
        this.verticalAlignment = i2;
    }
}
