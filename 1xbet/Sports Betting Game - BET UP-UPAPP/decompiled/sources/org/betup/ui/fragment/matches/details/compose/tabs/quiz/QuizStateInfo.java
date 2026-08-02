package org.betup.ui.fragment.matches.details.compose.tabs.quiz;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: QuizParticipationResultScreen.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\rJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0007\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\r¨\u0006 "}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/tabs/quiz/QuizStateInfo;", "", "headerText", "", "headerColor", "Landroidx/compose/ui/graphics/Color;", "prizeLabel", "prizeColor", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;JLjava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHeaderText", "()Ljava/lang/String;", "getHeaderColor-0d7_KjU", "()J", "J", "getPrizeLabel", "getPrizeColor-0d7_KjU", "component1", "component2", "component2-0d7_KjU", "component3", "component4", "component4-0d7_KjU", "copy", "copy-3bbok98", "(Ljava/lang/String;JLjava/lang/String;J)Lorg/betup/ui/fragment/matches/details/compose/tabs/quiz/QuizStateInfo;", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* data */ class QuizStateInfo {
    private final long headerColor;
    private final String headerText;
    private final long prizeColor;
    private final String prizeLabel;

    public /* synthetic */ QuizStateInfo(String str, long j, String str2, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, j2);
    }

    /* renamed from: copy-3bbok98$default, reason: not valid java name */
    public static /* synthetic */ QuizStateInfo m14056copy3bbok98$default(QuizStateInfo quizStateInfo, String str, long j, String str2, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = quizStateInfo.headerText;
        }
        if ((i & 2) != 0) {
            j = quizStateInfo.headerColor;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            str2 = quizStateInfo.prizeLabel;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            j2 = quizStateInfo.prizeColor;
        }
        return quizStateInfo.m14059copy3bbok98(str, j3, str3, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getHeaderColor() {
        return this.headerColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPrizeLabel() {
        return this.prizeLabel;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrizeColor() {
        return this.prizeColor;
    }

    /* renamed from: copy-3bbok98, reason: not valid java name */
    public final QuizStateInfo m14059copy3bbok98(String headerText, long headerColor, String prizeLabel, long prizeColor) {
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(prizeLabel, "prizeLabel");
        return new QuizStateInfo(headerText, headerColor, prizeLabel, prizeColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuizStateInfo)) {
            return false;
        }
        QuizStateInfo quizStateInfo = (QuizStateInfo) other;
        return Intrinsics.areEqual(this.headerText, quizStateInfo.headerText) && Color.m5169equalsimpl0(this.headerColor, quizStateInfo.headerColor) && Intrinsics.areEqual(this.prizeLabel, quizStateInfo.prizeLabel) && Color.m5169equalsimpl0(this.prizeColor, quizStateInfo.prizeColor);
    }

    public int hashCode() {
        return (((((this.headerText.hashCode() * 31) + Color.m5175hashCodeimpl(this.headerColor)) * 31) + this.prizeLabel.hashCode()) * 31) + Color.m5175hashCodeimpl(this.prizeColor);
    }

    public String toString() {
        return "QuizStateInfo(headerText=" + this.headerText + ", headerColor=" + Color.m5176toStringimpl(this.headerColor) + ", prizeLabel=" + this.prizeLabel + ", prizeColor=" + Color.m5176toStringimpl(this.prizeColor) + ")";
    }

    private QuizStateInfo(String headerText, long j, String prizeLabel, long j2) {
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(prizeLabel, "prizeLabel");
        this.headerText = headerText;
        this.headerColor = j;
        this.prizeLabel = prizeLabel;
        this.prizeColor = j2;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    /* renamed from: getHeaderColor-0d7_KjU, reason: not valid java name */
    public final long m14060getHeaderColor0d7_KjU() {
        return this.headerColor;
    }

    public final String getPrizeLabel() {
        return this.prizeLabel;
    }

    /* renamed from: getPrizeColor-0d7_KjU, reason: not valid java name */
    public final long m14061getPrizeColor0d7_KjU() {
        return this.prizeColor;
    }
}
