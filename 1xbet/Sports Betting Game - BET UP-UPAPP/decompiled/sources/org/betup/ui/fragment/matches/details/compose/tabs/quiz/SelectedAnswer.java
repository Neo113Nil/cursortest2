package org.betup.ui.fragment.matches.details.compose.tabs.quiz;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: QuizState.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/tabs/quiz/SelectedAnswer;", "", "betId", "", "betName", "", "coefficient", "", "varietyName", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;FLjava/lang/String;)V", "getBetId", "()J", "getBetName", "()Ljava/lang/String;", "getCoefficient", "()F", "getVarietyName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SelectedAnswer {
    public static final int $stable = 0;
    private final long betId;
    private final String betName;
    private final float coefficient;
    private final String varietyName;

    public static /* synthetic */ SelectedAnswer copy$default(SelectedAnswer selectedAnswer, long j, String str, float f, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = selectedAnswer.betId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = selectedAnswer.betName;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            f = selectedAnswer.coefficient;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            str2 = selectedAnswer.varietyName;
        }
        return selectedAnswer.copy(j2, str3, f2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getBetId() {
        return this.betId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBetName() {
        return this.betName;
    }

    /* renamed from: component3, reason: from getter */
    public final float getCoefficient() {
        return this.coefficient;
    }

    /* renamed from: component4, reason: from getter */
    public final String getVarietyName() {
        return this.varietyName;
    }

    public final SelectedAnswer copy(long betId, String betName, float coefficient, String varietyName) {
        Intrinsics.checkNotNullParameter(betName, "betName");
        Intrinsics.checkNotNullParameter(varietyName, "varietyName");
        return new SelectedAnswer(betId, betName, coefficient, varietyName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectedAnswer)) {
            return false;
        }
        SelectedAnswer selectedAnswer = (SelectedAnswer) other;
        return this.betId == selectedAnswer.betId && Intrinsics.areEqual(this.betName, selectedAnswer.betName) && Float.compare(this.coefficient, selectedAnswer.coefficient) == 0 && Intrinsics.areEqual(this.varietyName, selectedAnswer.varietyName);
    }

    public int hashCode() {
        return (((((Long.hashCode(this.betId) * 31) + this.betName.hashCode()) * 31) + Float.hashCode(this.coefficient)) * 31) + this.varietyName.hashCode();
    }

    public String toString() {
        return "SelectedAnswer(betId=" + this.betId + ", betName=" + this.betName + ", coefficient=" + this.coefficient + ", varietyName=" + this.varietyName + ")";
    }

    public SelectedAnswer(long j, String betName, float f, String varietyName) {
        Intrinsics.checkNotNullParameter(betName, "betName");
        Intrinsics.checkNotNullParameter(varietyName, "varietyName");
        this.betId = j;
        this.betName = betName;
        this.coefficient = f;
        this.varietyName = varietyName;
    }

    public final long getBetId() {
        return this.betId;
    }

    public final String getBetName() {
        return this.betName;
    }

    public final float getCoefficient() {
        return this.coefficient;
    }

    public final String getVarietyName() {
        return this.varietyName;
    }
}
