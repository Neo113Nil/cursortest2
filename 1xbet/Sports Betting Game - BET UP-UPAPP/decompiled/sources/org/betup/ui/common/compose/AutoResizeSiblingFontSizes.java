package org.betup.ui.common.compose;

import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: AutoResizeSiblingsText.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0019"}, d2 = {"Lorg/betup/ui/common/compose/AutoResizeSiblingFontSizes;", "", "labelFontSize", "Landroidx/compose/ui/unit/TextUnit;", "valueFontSize", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLabelFontSize-XSAIIZE", "()J", "J", "getValueFontSize-XSAIIZE", "component1", "component1-XSAIIZE", "component2", "component2-XSAIIZE", "copy", "copy-NB67dxo", "(JJ)Lorg/betup/ui/common/compose/AutoResizeSiblingFontSizes;", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AutoResizeSiblingFontSizes {
    public static final int $stable = 0;
    private final long labelFontSize;
    private final long valueFontSize;

    public /* synthetic */ AutoResizeSiblingFontSizes(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: copy-NB67dxo$default, reason: not valid java name */
    public static /* synthetic */ AutoResizeSiblingFontSizes m12892copyNB67dxo$default(AutoResizeSiblingFontSizes autoResizeSiblingFontSizes, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = autoResizeSiblingFontSizes.labelFontSize;
        }
        if ((i & 2) != 0) {
            j2 = autoResizeSiblingFontSizes.valueFontSize;
        }
        return autoResizeSiblingFontSizes.m12895copyNB67dxo(j, j2);
    }

    /* renamed from: component1-XSAIIZE, reason: not valid java name and from getter */
    public final long getLabelFontSize() {
        return this.labelFontSize;
    }

    /* renamed from: component2-XSAIIZE, reason: not valid java name and from getter */
    public final long getValueFontSize() {
        return this.valueFontSize;
    }

    /* renamed from: copy-NB67dxo, reason: not valid java name */
    public final AutoResizeSiblingFontSizes m12895copyNB67dxo(long labelFontSize, long valueFontSize) {
        return new AutoResizeSiblingFontSizes(labelFontSize, valueFontSize, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoResizeSiblingFontSizes)) {
            return false;
        }
        AutoResizeSiblingFontSizes autoResizeSiblingFontSizes = (AutoResizeSiblingFontSizes) other;
        return TextUnit.m7965equalsimpl0(this.labelFontSize, autoResizeSiblingFontSizes.labelFontSize) && TextUnit.m7965equalsimpl0(this.valueFontSize, autoResizeSiblingFontSizes.valueFontSize);
    }

    public int hashCode() {
        return (TextUnit.m7969hashCodeimpl(this.labelFontSize) * 31) + TextUnit.m7969hashCodeimpl(this.valueFontSize);
    }

    public String toString() {
        return "AutoResizeSiblingFontSizes(labelFontSize=" + TextUnit.m7975toStringimpl(this.labelFontSize) + ", valueFontSize=" + TextUnit.m7975toStringimpl(this.valueFontSize) + ")";
    }

    private AutoResizeSiblingFontSizes(long j, long j2) {
        this.labelFontSize = j;
        this.valueFontSize = j2;
    }

    /* renamed from: getLabelFontSize-XSAIIZE, reason: not valid java name */
    public final long m12896getLabelFontSizeXSAIIZE() {
        return this.labelFontSize;
    }

    /* renamed from: getValueFontSize-XSAIIZE, reason: not valid java name */
    public final long m12897getValueFontSizeXSAIIZE() {
        return this.valueFontSize;
    }
}
