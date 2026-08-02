package org.betup.games.flashbet.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetGameQuestionDto.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lorg/betup/games/flashbet/model/FlashBetGameQuestionDto;", "", "question", "", "answers", "", "Lorg/betup/games/flashbet/model/FlashBetGameAnswerDto;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/util/List;)V", "getQuestion", "()Ljava/lang/String;", "getAnswers", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FlashBetGameQuestionDto {
    public static final int $stable = 8;

    @SerializedName("answers")
    private final List<FlashBetGameAnswerDto> answers;

    @SerializedName("question")
    private final String question;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlashBetGameQuestionDto copy$default(FlashBetGameQuestionDto flashBetGameQuestionDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flashBetGameQuestionDto.question;
        }
        if ((i & 2) != 0) {
            list = flashBetGameQuestionDto.answers;
        }
        return flashBetGameQuestionDto.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    public final List<FlashBetGameAnswerDto> component2() {
        return this.answers;
    }

    public final FlashBetGameQuestionDto copy(String question, List<FlashBetGameAnswerDto> answers) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answers, "answers");
        return new FlashBetGameQuestionDto(question, answers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashBetGameQuestionDto)) {
            return false;
        }
        FlashBetGameQuestionDto flashBetGameQuestionDto = (FlashBetGameQuestionDto) other;
        return Intrinsics.areEqual(this.question, flashBetGameQuestionDto.question) && Intrinsics.areEqual(this.answers, flashBetGameQuestionDto.answers);
    }

    public int hashCode() {
        return (this.question.hashCode() * 31) + this.answers.hashCode();
    }

    public String toString() {
        return "FlashBetGameQuestionDto(question=" + this.question + ", answers=" + this.answers + ")";
    }

    public FlashBetGameQuestionDto(String question, List<FlashBetGameAnswerDto> answers) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.question = question;
        this.answers = answers;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final List<FlashBetGameAnswerDto> getAnswers() {
        return this.answers;
    }
}
