package org.betup.ui.common.compose;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DialogOfferComponents.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\b\u0013J.\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\b\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lorg/betup/ui/common/compose/DialogFeature;", "", "iconRes", "", "label", "", "iconTint", "Landroidx/compose/ui/graphics/Color;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;Landroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIconRes", "()I", "getLabel", "()Ljava/lang/String;", "getIconTint-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "component1", "component2", "component3", "component3-QN2ZGVo", "copy", "copy-t9lfQc4", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DialogFeature {
    public static final int $stable = 0;
    private final int iconRes;
    private final Color iconTint;
    private final String label;

    public /* synthetic */ DialogFeature(int i, String str, Color color, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, color);
    }

    /* renamed from: copy-t9lfQc4$default, reason: not valid java name */
    public static /* synthetic */ DialogFeature m12923copyt9lfQc4$default(DialogFeature dialogFeature, int i, String str, Color color, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dialogFeature.iconRes;
        }
        if ((i2 & 2) != 0) {
            str = dialogFeature.label;
        }
        if ((i2 & 4) != 0) {
            color = dialogFeature.iconTint;
        }
        return dialogFeature.m12925copyt9lfQc4(i, str, color);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIconRes() {
        return this.iconRes;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component3-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getIconTint() {
        return this.iconTint;
    }

    /* renamed from: copy-t9lfQc4, reason: not valid java name */
    public final DialogFeature m12925copyt9lfQc4(int iconRes, String label, Color iconTint) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new DialogFeature(iconRes, label, iconTint, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogFeature)) {
            return false;
        }
        DialogFeature dialogFeature = (DialogFeature) other;
        return this.iconRes == dialogFeature.iconRes && Intrinsics.areEqual(this.label, dialogFeature.label) && Intrinsics.areEqual(this.iconTint, dialogFeature.iconTint);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.iconRes) * 31) + this.label.hashCode()) * 31;
        Color color = this.iconTint;
        return hashCode + (color == null ? 0 : Color.m5175hashCodeimpl(color.m5178unboximpl()));
    }

    public String toString() {
        return "DialogFeature(iconRes=" + this.iconRes + ", label=" + this.label + ", iconTint=" + this.iconTint + ")";
    }

    private DialogFeature(int i, String label, Color color) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.iconRes = i;
        this.label = label;
        this.iconTint = color;
    }

    public /* synthetic */ DialogFeature(int i, String str, Color color, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : color, null);
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final String getLabel() {
        return this.label;
    }

    /* renamed from: getIconTint-QN2ZGVo, reason: not valid java name */
    public final Color m12926getIconTintQN2ZGVo() {
        return this.iconTint;
    }
}
