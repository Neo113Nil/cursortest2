package org.betup.games.flashbet.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetGameUserAnswerDto.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015JD\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lorg/betup/games/flashbet/model/FlashBetGameUserAnswerDto;", "", "question", "", "answer", "isCorrect", "", "minute", "", "coefficient", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILjava/lang/Double;)V", "getQuestion", "()Ljava/lang/String;", "getAnswer", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMinute", "()I", "getCoefficient", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILjava/lang/Double;)Lorg/betup/games/flashbet/model/FlashBetGameUserAnswerDto;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FlashBetGameUserAnswerDto {
    public static final int $stable = 0;

    @SerializedName("answer")
    private final String answer;

    @SerializedName("coefficient")
    private final Double coefficient;

    @SerializedName("isCorrect")
    private final Boolean isCorrect;

    @SerializedName("minute")
    private final int minute;

    @SerializedName("question")
    private final String question;

    public static /* synthetic */ FlashBetGameUserAnswerDto copy$default(FlashBetGameUserAnswerDto flashBetGameUserAnswerDto, String str, String str2, Boolean bool, int i, Double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = flashBetGameUserAnswerDto.question;
        }
        if ((i2 & 2) != 0) {
            str2 = flashBetGameUserAnswerDto.answer;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            bool = flashBetGameUserAnswerDto.isCorrect;
        }
        Boolean bool2 = bool;
        if ((i2 & 8) != 0) {
            i = flashBetGameUserAnswerDto.minute;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            d = flashBetGameUserAnswerDto.coefficient;
        }
        return flashBetGameUserAnswerDto.copy(str, str3, bool2, i3, d);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAnswer() {
        return this.answer;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsCorrect() {
        return this.isCorrect;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMinute() {
        return this.minute;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getCoefficient() {
        return this.coefficient;
    }

    public final FlashBetGameUserAnswerDto copy(String question, String answer, Boolean isCorrect, int minute, Double coefficient) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answer, "answer");
        return new FlashBetGameUserAnswerDto(question, answer, isCorrect, minute, coefficient);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashBetGameUserAnswerDto)) {
            return false;
        }
        FlashBetGameUserAnswerDto flashBetGameUserAnswerDto = (FlashBetGameUserAnswerDto) other;
        return Intrinsics.areEqual(this.question, flashBetGameUserAnswerDto.question) && Intrinsics.areEqual(this.answer, flashBetGameUserAnswerDto.answer) && Intrinsics.areEqual(this.isCorrect, flashBetGameUserAnswerDto.isCorrect) && this.minute == flashBetGameUserAnswerDto.minute && Intrinsics.areEqual((Object) this.coefficient, (Object) flashBetGameUserAnswerDto.coefficient);
    }

    public int hashCode() {
        int hashCode = ((this.question.hashCode() * 31) + this.answer.hashCode()) * 31;
        Boolean bool = this.isCorrect;
        int hashCode2 = (((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + Integer.hashCode(this.minute)) * 31;
        Double d = this.coefficient;
        return hashCode2 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        return "FlashBetGameUserAnswerDto(question=" + this.question + ", answer=" + this.answer + ", isCorrect=" + this.isCorrect + ", minute=" + this.minute + ", coefficient=" + this.coefficient + ")";
    }

    public FlashBetGameUserAnswerDto(String question, String answer, Boolean bool, int i, Double d) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answer, "answer");
        this.question = question;
        this.answer = answer;
        this.isCorrect = bool;
        this.minute = i;
        this.coefficient = d;
    }

    public /* synthetic */ FlashBetGameUserAnswerDto(String str, String str2, Boolean bool, int i, Double d, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : bool, i, (i2 & 16) != 0 ? null : d);
    }

    public final String getQuestion() {
        return this.question;
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final Boolean isCorrect() {
        return this.isCorrect;
    }

    public final int getMinute() {
        return this.minute;
    }

    public final Double getCoefficient() {
        return this.coefficient;
    }
}
