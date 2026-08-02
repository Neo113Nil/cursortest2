package org.betup.ui.fragment.bets.quiz.compose.components;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: QuizResultItem.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\fJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u001d"}, d2 = {"Lorg/betup/ui/fragment/bets/quiz/compose/components/QuizStateDisplayInfo;", "", "statusText", "", "statusColor", "Landroidx/compose/ui/graphics/Color;", "moneyColor", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getStatusText", "()Ljava/lang/String;", "getStatusColor-0d7_KjU", "()J", "J", "getMoneyColor-0d7_KjU", "component1", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "copy", "copy-WkMS-hQ", "(Ljava/lang/String;JJ)Lorg/betup/ui/fragment/bets/quiz/compose/components/QuizStateDisplayInfo;", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* data */ class QuizStateDisplayInfo {
    private final long moneyColor;
    private final long statusColor;
    private final String statusText;

    public /* synthetic */ QuizStateDisplayInfo(String str, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2);
    }

    /* renamed from: copy-WkMS-hQ$default, reason: not valid java name */
    public static /* synthetic */ QuizStateDisplayInfo m13513copyWkMShQ$default(QuizStateDisplayInfo quizStateDisplayInfo, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = quizStateDisplayInfo.statusText;
        }
        if ((i & 2) != 0) {
            j = quizStateDisplayInfo.statusColor;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = quizStateDisplayInfo.moneyColor;
        }
        return quizStateDisplayInfo.m13516copyWkMShQ(str, j3, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getStatusColor() {
        return this.statusColor;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getMoneyColor() {
        return this.moneyColor;
    }

    /* renamed from: copy-WkMS-hQ, reason: not valid java name */
    public final QuizStateDisplayInfo m13516copyWkMShQ(String statusText, long statusColor, long moneyColor) {
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        return new QuizStateDisplayInfo(statusText, statusColor, moneyColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuizStateDisplayInfo)) {
            return false;
        }
        QuizStateDisplayInfo quizStateDisplayInfo = (QuizStateDisplayInfo) other;
        return Intrinsics.areEqual(this.statusText, quizStateDisplayInfo.statusText) && Color.m5169equalsimpl0(this.statusColor, quizStateDisplayInfo.statusColor) && Color.m5169equalsimpl0(this.moneyColor, quizStateDisplayInfo.moneyColor);
    }

    public int hashCode() {
        return (((this.statusText.hashCode() * 31) + Color.m5175hashCodeimpl(this.statusColor)) * 31) + Color.m5175hashCodeimpl(this.moneyColor);
    }

    public String toString() {
        return "QuizStateDisplayInfo(statusText=" + this.statusText + ", statusColor=" + Color.m5176toStringimpl(this.statusColor) + ", moneyColor=" + Color.m5176toStringimpl(this.moneyColor) + ")";
    }

    private QuizStateDisplayInfo(String statusText, long j, long j2) {
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        this.statusText = statusText;
        this.statusColor = j;
        this.moneyColor = j2;
    }

    public final String getStatusText() {
        return this.statusText;
    }

    /* renamed from: getStatusColor-0d7_KjU, reason: not valid java name */
    public final long m13518getStatusColor0d7_KjU() {
        return this.statusColor;
    }

    /* renamed from: getMoneyColor-0d7_KjU, reason: not valid java name */
    public final long m13517getMoneyColor0d7_KjU() {
        return this.moneyColor;
    }
}
