package org.betup.ui.fragment.user.compose;

import androidx.compose.ui.graphics.Brush;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: UserProfileBottomInfo.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001e"}, d2 = {"Lorg/betup/ui/fragment/user/compose/AdaptiveButtonItem;", "", "text", "", "coefficient", "isSelected", "", "brushUnselected", "Landroidx/compose/ui/graphics/Brush;", "blackText", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/graphics/Brush;Z)V", "getText", "()Ljava/lang/String;", "getCoefficient", "()Z", "getBrushUnselected", "()Landroidx/compose/ui/graphics/Brush;", "getBlackText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AdaptiveButtonItem {
    public static final int $stable = 0;
    private final boolean blackText;
    private final Brush brushUnselected;
    private final String coefficient;
    private final boolean isSelected;
    private final String text;

    public static /* synthetic */ AdaptiveButtonItem copy$default(AdaptiveButtonItem adaptiveButtonItem, String str, String str2, boolean z, Brush brush, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adaptiveButtonItem.text;
        }
        if ((i & 2) != 0) {
            str2 = adaptiveButtonItem.coefficient;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = adaptiveButtonItem.isSelected;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            brush = adaptiveButtonItem.brushUnselected;
        }
        Brush brush2 = brush;
        if ((i & 16) != 0) {
            z2 = adaptiveButtonItem.blackText;
        }
        return adaptiveButtonItem.copy(str, str3, z3, brush2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCoefficient() {
        return this.coefficient;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component4, reason: from getter */
    public final Brush getBrushUnselected() {
        return this.brushUnselected;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getBlackText() {
        return this.blackText;
    }

    public final AdaptiveButtonItem copy(String text, String coefficient, boolean isSelected, Brush brushUnselected, boolean blackText) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(coefficient, "coefficient");
        Intrinsics.checkNotNullParameter(brushUnselected, "brushUnselected");
        return new AdaptiveButtonItem(text, coefficient, isSelected, brushUnselected, blackText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdaptiveButtonItem)) {
            return false;
        }
        AdaptiveButtonItem adaptiveButtonItem = (AdaptiveButtonItem) other;
        return Intrinsics.areEqual(this.text, adaptiveButtonItem.text) && Intrinsics.areEqual(this.coefficient, adaptiveButtonItem.coefficient) && this.isSelected == adaptiveButtonItem.isSelected && Intrinsics.areEqual(this.brushUnselected, adaptiveButtonItem.brushUnselected) && this.blackText == adaptiveButtonItem.blackText;
    }

    public int hashCode() {
        return (((((((this.text.hashCode() * 31) + this.coefficient.hashCode()) * 31) + Boolean.hashCode(this.isSelected)) * 31) + this.brushUnselected.hashCode()) * 31) + Boolean.hashCode(this.blackText);
    }

    public String toString() {
        return "AdaptiveButtonItem(text=" + this.text + ", coefficient=" + this.coefficient + ", isSelected=" + this.isSelected + ", brushUnselected=" + this.brushUnselected + ", blackText=" + this.blackText + ")";
    }

    public AdaptiveButtonItem(String text, String coefficient, boolean z, Brush brushUnselected, boolean z2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(coefficient, "coefficient");
        Intrinsics.checkNotNullParameter(brushUnselected, "brushUnselected");
        this.text = text;
        this.coefficient = coefficient;
        this.isSelected = z;
        this.brushUnselected = brushUnselected;
        this.blackText = z2;
    }

    public final String getText() {
        return this.text;
    }

    public final String getCoefficient() {
        return this.coefficient;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final Brush getBrushUnselected() {
        return this.brushUnselected;
    }

    public final boolean getBlackText() {
        return this.blackText;
    }
}
