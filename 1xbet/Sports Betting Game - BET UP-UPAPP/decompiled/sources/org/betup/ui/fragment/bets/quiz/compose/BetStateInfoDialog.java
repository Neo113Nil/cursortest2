package org.betup.ui.fragment.bets.quiz.compose;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: QuizParticipationDetailsScreen.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lorg/betup/ui/fragment/bets/quiz/compose/BetStateInfoDialog;", "", "badgeColor", "Landroidx/compose/ui/graphics/Color;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBadgeColor-0d7_KjU", "()J", "J", "component1", "component1-0d7_KjU", "copy", "copy-8_81llA", "(J)Lorg/betup/ui/fragment/bets/quiz/compose/BetStateInfoDialog;", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* data */ class BetStateInfoDialog {
    private final long badgeColor;

    public /* synthetic */ BetStateInfoDialog(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    /* renamed from: copy-8_81llA$default, reason: not valid java name */
    public static /* synthetic */ BetStateInfoDialog m13499copy8_81llA$default(BetStateInfoDialog betStateInfoDialog, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = betStateInfoDialog.badgeColor;
        }
        return betStateInfoDialog.m13501copy8_81llA(j);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getBadgeColor() {
        return this.badgeColor;
    }

    /* renamed from: copy-8_81llA, reason: not valid java name */
    public final BetStateInfoDialog m13501copy8_81llA(long badgeColor) {
        return new BetStateInfoDialog(badgeColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BetStateInfoDialog) && Color.m5169equalsimpl0(this.badgeColor, ((BetStateInfoDialog) other).badgeColor);
    }

    public int hashCode() {
        return Color.m5175hashCodeimpl(this.badgeColor);
    }

    public String toString() {
        return "BetStateInfoDialog(badgeColor=" + Color.m5176toStringimpl(this.badgeColor) + ")";
    }

    private BetStateInfoDialog(long j) {
        this.badgeColor = j;
    }

    /* renamed from: getBadgeColor-0d7_KjU, reason: not valid java name */
    public final long m13502getBadgeColor0d7_KjU() {
        return this.badgeColor;
    }
}
