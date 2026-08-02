package androidx.glance.layout;

import android.content.res.Resources;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import androidx.glance.GlanceModifier;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0011\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0086\u0002J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006%"}, d2 = {"Landroidx/glance/layout/PaddingModifier;", "Landroidx/glance/GlanceModifier$Element;", "left", "Landroidx/glance/layout/PaddingDimension;", "start", "top", "right", "end", "bottom", "(Landroidx/glance/layout/PaddingDimension;Landroidx/glance/layout/PaddingDimension;Landroidx/glance/layout/PaddingDimension;Landroidx/glance/layout/PaddingDimension;Landroidx/glance/layout/PaddingDimension;Landroidx/glance/layout/PaddingDimension;)V", "getBottom", "()Landroidx/glance/layout/PaddingDimension;", "getEnd", "getLeft", "getRight", "getStart", "getTop", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "plus", "toDp", "Landroidx/glance/layout/PaddingInDp;", "resources", "Landroid/content/res/Resources;", "toString", "", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/glance/layout/PaddingModifier\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,281:1\n52#2:282\n52#2:283\n52#2:284\n52#2:285\n52#2:286\n52#2:287\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/glance/layout/PaddingModifier\n*L\n225#1:282\n226#1:283\n227#1:284\n228#1:285\n229#1:286\n230#1:287\n*E\n"})
/* loaded from: classes.dex */
public final /* data */ class PaddingModifier implements GlanceModifier.Element {
    public static final int $stable = 0;
    private final PaddingDimension bottom;
    private final PaddingDimension end;
    private final PaddingDimension left;
    private final PaddingDimension right;
    private final PaddingDimension start;
    private final PaddingDimension top;

    public PaddingModifier() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ PaddingModifier copy$default(PaddingModifier paddingModifier, PaddingDimension paddingDimension, PaddingDimension paddingDimension2, PaddingDimension paddingDimension3, PaddingDimension paddingDimension4, PaddingDimension paddingDimension5, PaddingDimension paddingDimension6, int i, Object obj) {
        if ((i & 1) != 0) {
            paddingDimension = paddingModifier.left;
        }
        if ((i & 2) != 0) {
            paddingDimension2 = paddingModifier.start;
        }
        if ((i & 4) != 0) {
            paddingDimension3 = paddingModifier.top;
        }
        if ((i & 8) != 0) {
            paddingDimension4 = paddingModifier.right;
        }
        if ((i & 16) != 0) {
            paddingDimension5 = paddingModifier.end;
        }
        if ((i & 32) != 0) {
            paddingDimension6 = paddingModifier.bottom;
        }
        PaddingDimension paddingDimension7 = paddingDimension5;
        PaddingDimension paddingDimension8 = paddingDimension6;
        return paddingModifier.copy(paddingDimension, paddingDimension2, paddingDimension3, paddingDimension4, paddingDimension7, paddingDimension8);
    }

    /* renamed from: component1, reason: from getter */
    public final PaddingDimension getLeft() {
        return this.left;
    }

    /* renamed from: component2, reason: from getter */
    public final PaddingDimension getStart() {
        return this.start;
    }

    /* renamed from: component3, reason: from getter */
    public final PaddingDimension getTop() {
        return this.top;
    }

    /* renamed from: component4, reason: from getter */
    public final PaddingDimension getRight() {
        return this.right;
    }

    /* renamed from: component5, reason: from getter */
    public final PaddingDimension getEnd() {
        return this.end;
    }

    /* renamed from: component6, reason: from getter */
    public final PaddingDimension getBottom() {
        return this.bottom;
    }

    public final PaddingModifier copy(PaddingDimension left, PaddingDimension start, PaddingDimension top, PaddingDimension right, PaddingDimension end, PaddingDimension bottom) {
        return new PaddingModifier(left, start, top, right, end, bottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaddingModifier)) {
            return false;
        }
        PaddingModifier paddingModifier = (PaddingModifier) other;
        return Intrinsics.areEqual(this.left, paddingModifier.left) && Intrinsics.areEqual(this.start, paddingModifier.start) && Intrinsics.areEqual(this.top, paddingModifier.top) && Intrinsics.areEqual(this.right, paddingModifier.right) && Intrinsics.areEqual(this.end, paddingModifier.end) && Intrinsics.areEqual(this.bottom, paddingModifier.bottom);
    }

    public final PaddingDimension getBottom() {
        return this.bottom;
    }

    public final PaddingDimension getEnd() {
        return this.end;
    }

    public final PaddingDimension getLeft() {
        return this.left;
    }

    public final PaddingDimension getRight() {
        return this.right;
    }

    public final PaddingDimension getStart() {
        return this.start;
    }

    public final PaddingDimension getTop() {
        return this.top;
    }

    public int hashCode() {
        return this.bottom.hashCode() + ((this.end.hashCode() + ((this.right.hashCode() + ((this.top.hashCode() + ((this.start.hashCode() + (this.left.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final PaddingModifier plus(PaddingModifier other) {
        return new PaddingModifier(this.left.plus(other.left), this.start.plus(other.start), this.top.plus(other.top), this.right.plus(other.right), this.end.plus(other.end), this.bottom.plus(other.bottom));
    }

    public final PaddingInDp toDp(Resources resources) {
        float dp;
        float dp2;
        float dp3;
        float dp4;
        float dp5;
        float dp6;
        float m1413getDpD9Ej5fM = this.left.m1413getDpD9Ej5fM();
        dp = PaddingKt.toDp(this.left.getResourceIds(), resources);
        float m1021constructorimpl = Dp.m1021constructorimpl(dp + m1413getDpD9Ej5fM);
        float m1413getDpD9Ej5fM2 = this.start.m1413getDpD9Ej5fM();
        dp2 = PaddingKt.toDp(this.start.getResourceIds(), resources);
        float m1021constructorimpl2 = Dp.m1021constructorimpl(dp2 + m1413getDpD9Ej5fM2);
        float m1413getDpD9Ej5fM3 = this.top.m1413getDpD9Ej5fM();
        dp3 = PaddingKt.toDp(this.top.getResourceIds(), resources);
        float m1021constructorimpl3 = Dp.m1021constructorimpl(dp3 + m1413getDpD9Ej5fM3);
        float m1413getDpD9Ej5fM4 = this.right.m1413getDpD9Ej5fM();
        dp4 = PaddingKt.toDp(this.right.getResourceIds(), resources);
        float m1021constructorimpl4 = Dp.m1021constructorimpl(dp4 + m1413getDpD9Ej5fM4);
        float m1413getDpD9Ej5fM5 = this.end.m1413getDpD9Ej5fM();
        dp5 = PaddingKt.toDp(this.end.getResourceIds(), resources);
        float m1021constructorimpl5 = Dp.m1021constructorimpl(dp5 + m1413getDpD9Ej5fM5);
        float m1413getDpD9Ej5fM6 = this.bottom.m1413getDpD9Ej5fM();
        dp6 = PaddingKt.toDp(this.bottom.getResourceIds(), resources);
        return new PaddingInDp(m1021constructorimpl, m1021constructorimpl2, m1021constructorimpl3, m1021constructorimpl4, m1021constructorimpl5, Dp.m1021constructorimpl(dp6 + m1413getDpD9Ej5fM6), null);
    }

    public String toString() {
        return "PaddingModifier(left=" + this.left + ", start=" + this.start + ", top=" + this.top + ", right=" + this.right + ", end=" + this.end + ", bottom=" + this.bottom + ')';
    }

    public PaddingModifier(PaddingDimension paddingDimension, PaddingDimension paddingDimension2, PaddingDimension paddingDimension3, PaddingDimension paddingDimension4, PaddingDimension paddingDimension5, PaddingDimension paddingDimension6) {
        this.left = paddingDimension;
        this.start = paddingDimension2;
        this.top = paddingDimension3;
        this.right = paddingDimension4;
        this.end = paddingDimension5;
        this.bottom = paddingDimension6;
    }

    public /* synthetic */ PaddingModifier(PaddingDimension paddingDimension, PaddingDimension paddingDimension2, PaddingDimension paddingDimension3, PaddingDimension paddingDimension4, PaddingDimension paddingDimension5, PaddingDimension paddingDimension6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new PaddingDimension(0.0f, null, 3, null) : paddingDimension, (i & 2) != 0 ? new PaddingDimension(0.0f, null, 3, null) : paddingDimension2, (i & 4) != 0 ? new PaddingDimension(0.0f, null, 3, null) : paddingDimension3, (i & 8) != 0 ? new PaddingDimension(0.0f, null, 3, null) : paddingDimension4, (i & 16) != 0 ? new PaddingDimension(0.0f, null, 3, null) : paddingDimension5, (i & 32) != 0 ? new PaddingDimension(0.0f, null, 3, null) : paddingDimension6);
    }
}
