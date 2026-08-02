package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: QuizShortModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lorg/betup/model/remote/entity/matches/details/QuizShortModel;", "", "id", "", "match", "Lorg/betup/model/remote/entity/matches/details/MatchShortDetailsDataModel;", "state", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILorg/betup/model/remote/entity/matches/details/MatchShortDetailsDataModel;J)V", "getId", "()I", "getMatch", "()Lorg/betup/model/remote/entity/matches/details/MatchShortDetailsDataModel;", "getState", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class QuizShortModel {
    public static final int $stable = 8;

    @SerializedName("id")
    private final int id;

    @SerializedName("match")
    private final MatchShortDetailsDataModel match;

    @SerializedName("state")
    private final long state;

    public static /* synthetic */ QuizShortModel copy$default(QuizShortModel quizShortModel, int i, MatchShortDetailsDataModel matchShortDetailsDataModel, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = quizShortModel.id;
        }
        if ((i2 & 2) != 0) {
            matchShortDetailsDataModel = quizShortModel.match;
        }
        if ((i2 & 4) != 0) {
            j = quizShortModel.state;
        }
        return quizShortModel.copy(i, matchShortDetailsDataModel, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final MatchShortDetailsDataModel getMatch() {
        return this.match;
    }

    /* renamed from: component3, reason: from getter */
    public final long getState() {
        return this.state;
    }

    public final QuizShortModel copy(int id, MatchShortDetailsDataModel match, long state) {
        Intrinsics.checkNotNullParameter(match, "match");
        return new QuizShortModel(id, match, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuizShortModel)) {
            return false;
        }
        QuizShortModel quizShortModel = (QuizShortModel) other;
        return this.id == quizShortModel.id && Intrinsics.areEqual(this.match, quizShortModel.match) && this.state == quizShortModel.state;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + this.match.hashCode()) * 31) + Long.hashCode(this.state);
    }

    public String toString() {
        return "QuizShortModel(id=" + this.id + ", match=" + this.match + ", state=" + this.state + ")";
    }

    public QuizShortModel(int i, MatchShortDetailsDataModel match, long j) {
        Intrinsics.checkNotNullParameter(match, "match");
        this.id = i;
        this.match = match;
        this.state = j;
    }

    public final int getId() {
        return this.id;
    }

    public final MatchShortDetailsDataModel getMatch() {
        return this.match;
    }

    public final long getState() {
        return this.state;
    }
}
