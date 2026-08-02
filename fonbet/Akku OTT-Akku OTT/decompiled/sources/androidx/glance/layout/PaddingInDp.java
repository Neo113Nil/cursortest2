package androidx.glance.layout;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BD\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0019\u0010\u0012\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000bJ\u0019\u0010\u0014\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000bJ\u0019\u0010\u0016\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u000bJ\u0019\u0010\u0018\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u000bJ\u0019\u0010\u001a\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000bJ\u0019\u0010\u001c\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u000bJR\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\"J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\"J\t\u0010)\u001a\u00020*HÖ\u0001R\u001c\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u001c\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000bR\u001c\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/glance/layout/PaddingInDp;", "", "left", "Landroidx/compose/ui/unit/Dp;", "start", "top", "right", "end", "bottom", "(FFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBottom-D9Ej5fM", "()F", "F", "getEnd-D9Ej5fM", "getLeft-D9Ej5fM", "getRight-D9Ej5fM", "getStart-D9Ej5fM", "getTop-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "component3", "component3-D9Ej5fM", "component4", "component4-D9Ej5fM", "component5", "component5-D9Ej5fM", "component6", "component6-D9Ej5fM", "copy", "copy-erZIsFM", "(FFFFFF)Landroidx/glance/layout/PaddingInDp;", "equals", "", "other", "hashCode", "", "toAbsolute", "isRtl", "toRelative", "toString", "", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/glance/layout/PaddingInDp\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,281:1\n155#2:282\n155#2:283\n155#2:284\n155#2:285\n155#2:286\n155#2:287\n52#3:288\n52#3:289\n52#3:290\n52#3:291\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/glance/layout/PaddingInDp\n*L\n256#1:282\n257#1:283\n258#1:284\n259#1:285\n260#1:286\n261#1:287\n266#1:288\n268#1:289\n275#1:290\n277#1:291\n*E\n"})
/* loaded from: classes.dex */
public final /* data */ class PaddingInDp {
    public static final int $stable = 0;
    private final float bottom;
    private final float end;
    private final float left;
    private final float right;
    private final float start;
    private final float top;

    public /* synthetic */ PaddingInDp(float f, float f2, float f3, float f4, float f5, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6);
    }

    /* renamed from: copy-erZIsFM$default, reason: not valid java name */
    public static /* synthetic */ PaddingInDp m1414copyerZIsFM$default(PaddingInDp paddingInDp, float f, float f2, float f3, float f4, float f5, float f6, int i, Object obj) {
        if ((i & 1) != 0) {
            f = paddingInDp.left;
        }
        if ((i & 2) != 0) {
            f2 = paddingInDp.start;
        }
        if ((i & 4) != 0) {
            f3 = paddingInDp.top;
        }
        if ((i & 8) != 0) {
            f4 = paddingInDp.right;
        }
        if ((i & 16) != 0) {
            f5 = paddingInDp.end;
        }
        if ((i & 32) != 0) {
            f6 = paddingInDp.bottom;
        }
        float f7 = f5;
        float f8 = f6;
        return paddingInDp.m1421copyerZIsFM(f, f2, f3, f4, f7, f8);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getLeft() {
        return this.left;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStart() {
        return this.start;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTop() {
        return this.top;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getRight() {
        return this.right;
    }

    /* renamed from: component5-D9Ej5fM, reason: not valid java name and from getter */
    public final float getEnd() {
        return this.end;
    }

    /* renamed from: component6-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: copy-erZIsFM, reason: not valid java name */
    public final PaddingInDp m1421copyerZIsFM(float left, float start, float top, float right, float end, float bottom) {
        return new PaddingInDp(left, start, top, right, end, bottom, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaddingInDp)) {
            return false;
        }
        PaddingInDp paddingInDp = (PaddingInDp) other;
        return Dp.m1026equalsimpl0(this.left, paddingInDp.left) && Dp.m1026equalsimpl0(this.start, paddingInDp.start) && Dp.m1026equalsimpl0(this.top, paddingInDp.top) && Dp.m1026equalsimpl0(this.right, paddingInDp.right) && Dp.m1026equalsimpl0(this.end, paddingInDp.end) && Dp.m1026equalsimpl0(this.bottom, paddingInDp.bottom);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m1422getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m1423getEndD9Ej5fM() {
        return this.end;
    }

    /* renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m1424getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m1425getRightD9Ej5fM() {
        return this.right;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m1426getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m1427getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return Dp.m1027hashCodeimpl(this.bottom) + ((Dp.m1027hashCodeimpl(this.end) + ((Dp.m1027hashCodeimpl(this.right) + ((Dp.m1027hashCodeimpl(this.top) + ((Dp.m1027hashCodeimpl(this.start) + (Dp.m1027hashCodeimpl(this.left) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final PaddingInDp toAbsolute(boolean isRtl) {
        return new PaddingInDp(Dp.m1021constructorimpl(this.left + (isRtl ? this.end : this.start)), 0.0f, this.top, Dp.m1021constructorimpl(this.right + (isRtl ? this.start : this.end)), 0.0f, this.bottom, 18, null);
    }

    public final PaddingInDp toRelative(boolean isRtl) {
        return new PaddingInDp(0.0f, Dp.m1021constructorimpl(this.start + (isRtl ? this.right : this.left)), this.top, 0.0f, Dp.m1021constructorimpl(this.end + (isRtl ? this.left : this.right)), this.bottom, 9, null);
    }

    public String toString() {
        return "PaddingInDp(left=" + ((Object) Dp.m1032toStringimpl(this.left)) + ", start=" + ((Object) Dp.m1032toStringimpl(this.start)) + ", top=" + ((Object) Dp.m1032toStringimpl(this.top)) + ", right=" + ((Object) Dp.m1032toStringimpl(this.right)) + ", end=" + ((Object) Dp.m1032toStringimpl(this.end)) + ", bottom=" + ((Object) Dp.m1032toStringimpl(this.bottom)) + ')';
    }

    private PaddingInDp(float f, float f2, float f3, float f4, float f5, float f6) {
        this.left = f;
        this.start = f2;
        this.top = f3;
        this.right = f4;
        this.end = f5;
        this.bottom = f6;
    }

    public /* synthetic */ PaddingInDp(float f, float f2, float f3, float f4, float f5, float f6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dp.m1021constructorimpl(0) : f, (i & 2) != 0 ? Dp.m1021constructorimpl(0) : f2, (i & 4) != 0 ? Dp.m1021constructorimpl(0) : f3, (i & 8) != 0 ? Dp.m1021constructorimpl(0) : f4, (i & 16) != 0 ? Dp.m1021constructorimpl(0) : f5, (i & 32) != 0 ? Dp.m1021constructorimpl(0) : f6, null);
    }
}
