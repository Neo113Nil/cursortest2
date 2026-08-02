package org.betup.ui.fragment.home.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeUiState.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001J\u0013\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016¨\u0006'"}, d2 = {"Lorg/betup/ui/fragment/home/compose/HomeMatchOddUi;", "", "grabbedBetId", "", "betTypeId", "", "betName", "", "isAvailable", "", "coefficient", "", "coefficientLabel", "groupUserAvailable", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JILjava/lang/String;ZDLjava/lang/String;Z)V", "getGrabbedBetId", "()J", "getBetTypeId", "()I", "getBetName", "()Ljava/lang/String;", "()Z", "getCoefficient", "()D", "getCoefficientLabel", "getGroupUserAvailable", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HomeMatchOddUi {
    public static final int $stable = 0;
    private final String betName;
    private final int betTypeId;
    private final double coefficient;
    private final String coefficientLabel;
    private final long grabbedBetId;
    private final boolean groupUserAvailable;
    private final boolean isAvailable;

    /* renamed from: component1, reason: from getter */
    public final long getGrabbedBetId() {
        return this.grabbedBetId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBetTypeId() {
        return this.betTypeId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBetName() {
        return this.betName;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    /* renamed from: component5, reason: from getter */
    public final double getCoefficient() {
        return this.coefficient;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCoefficientLabel() {
        return this.coefficientLabel;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getGroupUserAvailable() {
        return this.groupUserAvailable;
    }

    public final HomeMatchOddUi copy(long grabbedBetId, int betTypeId, String betName, boolean isAvailable, double coefficient, String coefficientLabel, boolean groupUserAvailable) {
        Intrinsics.checkNotNullParameter(betName, "betName");
        Intrinsics.checkNotNullParameter(coefficientLabel, "coefficientLabel");
        return new HomeMatchOddUi(grabbedBetId, betTypeId, betName, isAvailable, coefficient, coefficientLabel, groupUserAvailable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeMatchOddUi)) {
            return false;
        }
        HomeMatchOddUi homeMatchOddUi = (HomeMatchOddUi) other;
        return this.grabbedBetId == homeMatchOddUi.grabbedBetId && this.betTypeId == homeMatchOddUi.betTypeId && Intrinsics.areEqual(this.betName, homeMatchOddUi.betName) && this.isAvailable == homeMatchOddUi.isAvailable && Double.compare(this.coefficient, homeMatchOddUi.coefficient) == 0 && Intrinsics.areEqual(this.coefficientLabel, homeMatchOddUi.coefficientLabel) && this.groupUserAvailable == homeMatchOddUi.groupUserAvailable;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.grabbedBetId) * 31) + Integer.hashCode(this.betTypeId)) * 31) + this.betName.hashCode()) * 31) + Boolean.hashCode(this.isAvailable)) * 31) + Double.hashCode(this.coefficient)) * 31) + this.coefficientLabel.hashCode()) * 31) + Boolean.hashCode(this.groupUserAvailable);
    }

    public String toString() {
        return "HomeMatchOddUi(grabbedBetId=" + this.grabbedBetId + ", betTypeId=" + this.betTypeId + ", betName=" + this.betName + ", isAvailable=" + this.isAvailable + ", coefficient=" + this.coefficient + ", coefficientLabel=" + this.coefficientLabel + ", groupUserAvailable=" + this.groupUserAvailable + ")";
    }

    public HomeMatchOddUi(long j, int i, String betName, boolean z, double d, String coefficientLabel, boolean z2) {
        Intrinsics.checkNotNullParameter(betName, "betName");
        Intrinsics.checkNotNullParameter(coefficientLabel, "coefficientLabel");
        this.grabbedBetId = j;
        this.betTypeId = i;
        this.betName = betName;
        this.isAvailable = z;
        this.coefficient = d;
        this.coefficientLabel = coefficientLabel;
        this.groupUserAvailable = z2;
    }

    public /* synthetic */ HomeMatchOddUi(long j, int i, String str, boolean z, double d, String str2, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, str, z, d, str2, (i2 & 64) != 0 ? true : z2);
    }

    public final long getGrabbedBetId() {
        return this.grabbedBetId;
    }

    public final int getBetTypeId() {
        return this.betTypeId;
    }

    public final String getBetName() {
        return this.betName;
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public final double getCoefficient() {
        return this.coefficient;
    }

    public final String getCoefficientLabel() {
        return this.coefficientLabel;
    }

    public final boolean getGroupUserAvailable() {
        return this.groupUserAvailable;
    }
}
