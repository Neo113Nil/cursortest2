package org.betup.model.remote.entity.user.profile;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: QuizStatsResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lorg/betup/model/remote/entity/user/profile/QuizStatsResponse;", "", "gold", "", "silver", "bronze", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JJJ)V", "getGold", "()J", "getSilver", "getBronze", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class QuizStatsResponse {
    public static final int $stable = 0;

    @SerializedName("bronze")
    private final long bronze;

    @SerializedName("gold")
    private final long gold;

    @SerializedName("silver")
    private final long silver;

    public QuizStatsResponse() {
        this(0L, 0L, 0L, 7, null);
    }

    public static /* synthetic */ QuizStatsResponse copy$default(QuizStatsResponse quizStatsResponse, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = quizStatsResponse.gold;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = quizStatsResponse.silver;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = quizStatsResponse.bronze;
        }
        return quizStatsResponse.copy(j4, j5, j3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getGold() {
        return this.gold;
    }

    /* renamed from: component2, reason: from getter */
    public final long getSilver() {
        return this.silver;
    }

    /* renamed from: component3, reason: from getter */
    public final long getBronze() {
        return this.bronze;
    }

    public final QuizStatsResponse copy(long gold, long silver, long bronze) {
        return new QuizStatsResponse(gold, silver, bronze);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuizStatsResponse)) {
            return false;
        }
        QuizStatsResponse quizStatsResponse = (QuizStatsResponse) other;
        return this.gold == quizStatsResponse.gold && this.silver == quizStatsResponse.silver && this.bronze == quizStatsResponse.bronze;
    }

    public int hashCode() {
        return (((Long.hashCode(this.gold) * 31) + Long.hashCode(this.silver)) * 31) + Long.hashCode(this.bronze);
    }

    public String toString() {
        return "QuizStatsResponse(gold=" + this.gold + ", silver=" + this.silver + ", bronze=" + this.bronze + ")";
    }

    public QuizStatsResponse(long j, long j2, long j3) {
        this.gold = j;
        this.silver = j2;
        this.bronze = j3;
    }

    public /* synthetic */ QuizStatsResponse(long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3);
    }

    public final long getGold() {
        return this.gold;
    }

    public final long getSilver() {
        return this.silver;
    }

    public final long getBronze() {
        return this.bronze;
    }
}
