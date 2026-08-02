package org.betup.ui.fragment.user.compose.components;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleStatsItem.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000bJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b¨\u0006 "}, d2 = {"Lorg/betup/ui/fragment/user/compose/components/BattleInfo;", "", "amountColor", "Landroidx/compose/ui/graphics/Color;", "amountText", "", "statusText", "statusColor", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAmountColor-0d7_KjU", "()J", "J", "getAmountText", "()Ljava/lang/String;", "getStatusText", "getStatusColor-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component3", "component4", "component4-0d7_KjU", "copy", "copy-Usj1iBs", "(JLjava/lang/String;Ljava/lang/String;J)Lorg/betup/ui/fragment/user/compose/components/BattleInfo;", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BattleInfo {
    public static final int $stable = 0;
    private final long amountColor;
    private final String amountText;
    private final long statusColor;
    private final String statusText;

    public /* synthetic */ BattleInfo(long j, String str, String str2, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, j2);
    }

    /* renamed from: copy-Usj1iBs$default, reason: not valid java name */
    public static /* synthetic */ BattleInfo m14280copyUsj1iBs$default(BattleInfo battleInfo, long j, String str, String str2, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = battleInfo.amountColor;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = battleInfo.amountText;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = battleInfo.statusText;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            j2 = battleInfo.statusColor;
        }
        return battleInfo.m14283copyUsj1iBs(j3, str3, str4, j2);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getAmountColor() {
        return this.amountColor;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAmountText() {
        return this.amountText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getStatusColor() {
        return this.statusColor;
    }

    /* renamed from: copy-Usj1iBs, reason: not valid java name */
    public final BattleInfo m14283copyUsj1iBs(long amountColor, String amountText, String statusText, long statusColor) {
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        return new BattleInfo(amountColor, amountText, statusText, statusColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BattleInfo)) {
            return false;
        }
        BattleInfo battleInfo = (BattleInfo) other;
        return Color.m5169equalsimpl0(this.amountColor, battleInfo.amountColor) && Intrinsics.areEqual(this.amountText, battleInfo.amountText) && Intrinsics.areEqual(this.statusText, battleInfo.statusText) && Color.m5169equalsimpl0(this.statusColor, battleInfo.statusColor);
    }

    public int hashCode() {
        return (((((Color.m5175hashCodeimpl(this.amountColor) * 31) + this.amountText.hashCode()) * 31) + this.statusText.hashCode()) * 31) + Color.m5175hashCodeimpl(this.statusColor);
    }

    public String toString() {
        return "BattleInfo(amountColor=" + Color.m5176toStringimpl(this.amountColor) + ", amountText=" + this.amountText + ", statusText=" + this.statusText + ", statusColor=" + Color.m5176toStringimpl(this.statusColor) + ")";
    }

    private BattleInfo(long j, String amountText, String statusText, long j2) {
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        this.amountColor = j;
        this.amountText = amountText;
        this.statusText = statusText;
        this.statusColor = j2;
    }

    /* renamed from: getAmountColor-0d7_KjU, reason: not valid java name */
    public final long m14284getAmountColor0d7_KjU() {
        return this.amountColor;
    }

    public final String getAmountText() {
        return this.amountText;
    }

    public final String getStatusText() {
        return this.statusText;
    }

    /* renamed from: getStatusColor-0d7_KjU, reason: not valid java name */
    public final long m14285getStatusColor0d7_KjU() {
        return this.statusColor;
    }
}
