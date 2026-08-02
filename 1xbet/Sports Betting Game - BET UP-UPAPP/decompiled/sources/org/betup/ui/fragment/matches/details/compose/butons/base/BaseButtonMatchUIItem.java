package org.betup.ui.fragment.matches.details.compose.butons.base;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.TabMenuItem;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BaseButtonMatch.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003J\u0010\u0010+\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b.\u0010\u001fJ\t\u0010/\u001a\u00020\u0012HÆ\u0003Jz\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b1\u00102J\u0013\u00103\u001a\u00020\u00062\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0003HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u00020\u000f¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u00020\u000f¢\u0006\n\n\u0002\u0010 \u001a\u0004\b!\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00068"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/butons/base/BaseButtonMatchUIItem;", "", "selectedImage", "", "unselectedImage", "isSelected", "", "label", "onClick", "Lkotlin/Function0;", "", "isActive", "indicatorAlignment", "Landroidx/compose/ui/Alignment;", "indicatorOffsetX", "Landroidx/compose/ui/unit/Dp;", "indicatorOffsetY", "tab", "Lorg/betup/ui/TabMenuItem;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IIZILkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Alignment;FFLorg/betup/ui/TabMenuItem;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSelectedImage", "()I", "getUnselectedImage", "()Z", "getLabel", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getIndicatorAlignment", "()Landroidx/compose/ui/Alignment;", "getIndicatorOffsetX-D9Ej5fM", "()F", "F", "getIndicatorOffsetY-D9Ej5fM", "getTab", "()Lorg/betup/ui/TabMenuItem;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component8-D9Ej5fM", "component9", "component9-D9Ej5fM", "component10", "copy", "copy-enQ_JUA", "(IIZILkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Alignment;FFLorg/betup/ui/TabMenuItem;)Lorg/betup/ui/fragment/matches/details/compose/butons/base/BaseButtonMatchUIItem;", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BaseButtonMatchUIItem {
    public static final int $stable = 0;
    private final Alignment indicatorAlignment;
    private final float indicatorOffsetX;
    private final float indicatorOffsetY;
    private final boolean isActive;
    private final boolean isSelected;
    private final int label;
    private final Function0<Unit> onClick;
    private final int selectedImage;
    private final TabMenuItem tab;
    private final int unselectedImage;

    public /* synthetic */ BaseButtonMatchUIItem(int i, int i2, boolean z, int i3, Function0 function0, boolean z2, Alignment alignment, float f, float f2, TabMenuItem tabMenuItem, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, z, i3, function0, z2, alignment, f, f2, tabMenuItem);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSelectedImage() {
        return this.selectedImage;
    }

    /* renamed from: component10, reason: from getter */
    public final TabMenuItem getTab() {
        return this.tab;
    }

    /* renamed from: component2, reason: from getter */
    public final int getUnselectedImage() {
        return this.unselectedImage;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component4, reason: from getter */
    public final int getLabel() {
        return this.label;
    }

    public final Function0<Unit> component5() {
        return this.onClick;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* renamed from: component7, reason: from getter */
    public final Alignment getIndicatorAlignment() {
        return this.indicatorAlignment;
    }

    /* renamed from: component8-D9Ej5fM, reason: not valid java name and from getter */
    public final float getIndicatorOffsetX() {
        return this.indicatorOffsetX;
    }

    /* renamed from: component9-D9Ej5fM, reason: not valid java name and from getter */
    public final float getIndicatorOffsetY() {
        return this.indicatorOffsetY;
    }

    /* renamed from: copy-enQ_JUA, reason: not valid java name */
    public final BaseButtonMatchUIItem m14005copyenQ_JUA(int selectedImage, int unselectedImage, boolean isSelected, int label, Function0<Unit> onClick, boolean isActive, Alignment indicatorAlignment, float indicatorOffsetX, float indicatorOffsetY, TabMenuItem tab) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(indicatorAlignment, "indicatorAlignment");
        Intrinsics.checkNotNullParameter(tab, "tab");
        return new BaseButtonMatchUIItem(selectedImage, unselectedImage, isSelected, label, onClick, isActive, indicatorAlignment, indicatorOffsetX, indicatorOffsetY, tab, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseButtonMatchUIItem)) {
            return false;
        }
        BaseButtonMatchUIItem baseButtonMatchUIItem = (BaseButtonMatchUIItem) other;
        return this.selectedImage == baseButtonMatchUIItem.selectedImage && this.unselectedImage == baseButtonMatchUIItem.unselectedImage && this.isSelected == baseButtonMatchUIItem.isSelected && this.label == baseButtonMatchUIItem.label && Intrinsics.areEqual(this.onClick, baseButtonMatchUIItem.onClick) && this.isActive == baseButtonMatchUIItem.isActive && Intrinsics.areEqual(this.indicatorAlignment, baseButtonMatchUIItem.indicatorAlignment) && Dp.m7779equalsimpl0(this.indicatorOffsetX, baseButtonMatchUIItem.indicatorOffsetX) && Dp.m7779equalsimpl0(this.indicatorOffsetY, baseButtonMatchUIItem.indicatorOffsetY) && this.tab == baseButtonMatchUIItem.tab;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.selectedImage) * 31) + Integer.hashCode(this.unselectedImage)) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Integer.hashCode(this.label)) * 31) + this.onClick.hashCode()) * 31) + Boolean.hashCode(this.isActive)) * 31) + this.indicatorAlignment.hashCode()) * 31) + Dp.m7780hashCodeimpl(this.indicatorOffsetX)) * 31) + Dp.m7780hashCodeimpl(this.indicatorOffsetY)) * 31) + this.tab.hashCode();
    }

    public String toString() {
        return "BaseButtonMatchUIItem(selectedImage=" + this.selectedImage + ", unselectedImage=" + this.unselectedImage + ", isSelected=" + this.isSelected + ", label=" + this.label + ", onClick=" + this.onClick + ", isActive=" + this.isActive + ", indicatorAlignment=" + this.indicatorAlignment + ", indicatorOffsetX=" + Dp.m7785toStringimpl(this.indicatorOffsetX) + ", indicatorOffsetY=" + Dp.m7785toStringimpl(this.indicatorOffsetY) + ", tab=" + this.tab + ")";
    }

    private BaseButtonMatchUIItem(int i, int i2, boolean z, int i3, Function0<Unit> onClick, boolean z2, Alignment indicatorAlignment, float f, float f2, TabMenuItem tab) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(indicatorAlignment, "indicatorAlignment");
        Intrinsics.checkNotNullParameter(tab, "tab");
        this.selectedImage = i;
        this.unselectedImage = i2;
        this.isSelected = z;
        this.label = i3;
        this.onClick = onClick;
        this.isActive = z2;
        this.indicatorAlignment = indicatorAlignment;
        this.indicatorOffsetX = f;
        this.indicatorOffsetY = f2;
        this.tab = tab;
    }

    public final int getSelectedImage() {
        return this.selectedImage;
    }

    public final int getUnselectedImage() {
        return this.unselectedImage;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final int getLabel() {
        return this.label;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public /* synthetic */ BaseButtonMatchUIItem(int i, int i2, boolean z, int i3, Function0 function0, boolean z2, Alignment alignment, float f, float f2, TabMenuItem tabMenuItem, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, z, i3, function0, z2, (i4 & 64) != 0 ? Alignment.INSTANCE.getTopCenter() : alignment, (i4 & 128) != 0 ? Dp.m7774constructorimpl(0) : f, (i4 & 256) != 0 ? Dp.m7774constructorimpl(6) : f2, (i4 & 512) != 0 ? TabMenuItem.ARENA : tabMenuItem, null);
    }

    public final Alignment getIndicatorAlignment() {
        return this.indicatorAlignment;
    }

    /* renamed from: getIndicatorOffsetX-D9Ej5fM, reason: not valid java name */
    public final float m14006getIndicatorOffsetXD9Ej5fM() {
        return this.indicatorOffsetX;
    }

    /* renamed from: getIndicatorOffsetY-D9Ej5fM, reason: not valid java name */
    public final float m14007getIndicatorOffsetYD9Ej5fM() {
        return this.indicatorOffsetY;
    }

    public final TabMenuItem getTab() {
        return this.tab;
    }
}
