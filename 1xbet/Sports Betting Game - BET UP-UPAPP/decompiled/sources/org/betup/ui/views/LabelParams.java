package org.betup.ui.views;

import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BetUpLabelView.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lorg/betup/ui/views/LabelParams;", "", "titleHeight", "", "titleWidth", "starsHeight", "starsWidth", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IIII)V", "getTitleHeight", "()I", "getTitleWidth", "getStarsHeight", "getStarsWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LabelParams {
    public static final int $stable = 0;
    private final int starsHeight;
    private final int starsWidth;
    private final int titleHeight;
    private final int titleWidth;

    public static /* synthetic */ LabelParams copy$default(LabelParams labelParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = labelParams.titleHeight;
        }
        if ((i5 & 2) != 0) {
            i2 = labelParams.titleWidth;
        }
        if ((i5 & 4) != 0) {
            i3 = labelParams.starsHeight;
        }
        if ((i5 & 8) != 0) {
            i4 = labelParams.starsWidth;
        }
        return labelParams.copy(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTitleHeight() {
        return this.titleHeight;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTitleWidth() {
        return this.titleWidth;
    }

    /* renamed from: component3, reason: from getter */
    public final int getStarsHeight() {
        return this.starsHeight;
    }

    /* renamed from: component4, reason: from getter */
    public final int getStarsWidth() {
        return this.starsWidth;
    }

    public final LabelParams copy(int titleHeight, int titleWidth, int starsHeight, int starsWidth) {
        return new LabelParams(titleHeight, titleWidth, starsHeight, starsWidth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabelParams)) {
            return false;
        }
        LabelParams labelParams = (LabelParams) other;
        return this.titleHeight == labelParams.titleHeight && this.titleWidth == labelParams.titleWidth && this.starsHeight == labelParams.starsHeight && this.starsWidth == labelParams.starsWidth;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.titleHeight) * 31) + Integer.hashCode(this.titleWidth)) * 31) + Integer.hashCode(this.starsHeight)) * 31) + Integer.hashCode(this.starsWidth);
    }

    public String toString() {
        return "LabelParams(titleHeight=" + this.titleHeight + ", titleWidth=" + this.titleWidth + ", starsHeight=" + this.starsHeight + ", starsWidth=" + this.starsWidth + ")";
    }

    public LabelParams(int i, int i2, int i3, int i4) {
        this.titleHeight = i;
        this.titleWidth = i2;
        this.starsHeight = i3;
        this.starsWidth = i4;
    }

    public final int getStarsHeight() {
        return this.starsHeight;
    }

    public final int getStarsWidth() {
        return this.starsWidth;
    }

    public final int getTitleHeight() {
        return this.titleHeight;
    }

    public final int getTitleWidth() {
        return this.titleWidth;
    }
}
