package org.betup.model.remote.entity.quiz;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: QuizStateCountModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lorg/betup/model/remote/entity/quiz/QuizStateCountModel;", "", "state", "", "count", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IJ)V", "getState", "()I", "getCount", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class QuizStateCountModel {
    public static final int $stable = 0;

    @SerializedName("count")
    private final long count;

    @SerializedName("state")
    private final int state;

    public static /* synthetic */ QuizStateCountModel copy$default(QuizStateCountModel quizStateCountModel, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = quizStateCountModel.state;
        }
        if ((i2 & 2) != 0) {
            j = quizStateCountModel.count;
        }
        return quizStateCountModel.copy(i, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* renamed from: component2, reason: from getter */
    public final long getCount() {
        return this.count;
    }

    public final QuizStateCountModel copy(int state, long count) {
        return new QuizStateCountModel(state, count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuizStateCountModel)) {
            return false;
        }
        QuizStateCountModel quizStateCountModel = (QuizStateCountModel) other;
        return this.state == quizStateCountModel.state && this.count == quizStateCountModel.count;
    }

    public int hashCode() {
        return (Integer.hashCode(this.state) * 31) + Long.hashCode(this.count);
    }

    public String toString() {
        return "QuizStateCountModel(state=" + this.state + ", count=" + this.count + ")";
    }

    public QuizStateCountModel(int i, long j) {
        this.state = i;
        this.count = j;
    }

    public final int getState() {
        return this.state;
    }

    public final long getCount() {
        return this.count;
    }
}
