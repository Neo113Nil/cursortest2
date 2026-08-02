package org.betup.games.flashbet.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetGameAnswerDto.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lorg/betup/games/flashbet/model/FlashBetGameAnswerDto;", "", "id", "", "answer", "", "coefficient", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;D)V", "getId", "()J", "getAnswer", "()Ljava/lang/String;", "getCoefficient", "()D", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FlashBetGameAnswerDto {
    public static final int $stable = 0;

    @SerializedName("answer")
    private final String answer;

    @SerializedName("coefficient")
    private final double coefficient;

    @SerializedName("id")
    private final long id;

    public static /* synthetic */ FlashBetGameAnswerDto copy$default(FlashBetGameAnswerDto flashBetGameAnswerDto, long j, String str, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            j = flashBetGameAnswerDto.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = flashBetGameAnswerDto.answer;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            d = flashBetGameAnswerDto.coefficient;
        }
        return flashBetGameAnswerDto.copy(j2, str2, d);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAnswer() {
        return this.answer;
    }

    /* renamed from: component3, reason: from getter */
    public final double getCoefficient() {
        return this.coefficient;
    }

    public final FlashBetGameAnswerDto copy(long id, String answer, double coefficient) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        return new FlashBetGameAnswerDto(id, answer, coefficient);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashBetGameAnswerDto)) {
            return false;
        }
        FlashBetGameAnswerDto flashBetGameAnswerDto = (FlashBetGameAnswerDto) other;
        return this.id == flashBetGameAnswerDto.id && Intrinsics.areEqual(this.answer, flashBetGameAnswerDto.answer) && Double.compare(this.coefficient, flashBetGameAnswerDto.coefficient) == 0;
    }

    public int hashCode() {
        return (((Long.hashCode(this.id) * 31) + this.answer.hashCode()) * 31) + Double.hashCode(this.coefficient);
    }

    public String toString() {
        return "FlashBetGameAnswerDto(id=" + this.id + ", answer=" + this.answer + ", coefficient=" + this.coefficient + ")";
    }

    public FlashBetGameAnswerDto(long j, String answer, double d) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        this.id = j;
        this.answer = answer;
        this.coefficient = d;
    }

    public /* synthetic */ FlashBetGameAnswerDto(long j, String str, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, (i & 4) != 0 ? 0.0d : d);
    }

    public final long getId() {
        return this.id;
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final double getCoefficient() {
        return this.coefficient;
    }
}
