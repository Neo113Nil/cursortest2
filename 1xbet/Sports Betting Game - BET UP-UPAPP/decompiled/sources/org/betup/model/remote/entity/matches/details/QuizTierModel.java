package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: QuizTierModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lorg/betup/model/remote/entity/matches/details/QuizTierModel;", "", "id", "", "oddsBoost", "", "name", "", "fee", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JDLjava/lang/String;J)V", "getId", "()J", "getOddsBoost", "()D", "getName", "()Ljava/lang/String;", "getFee", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class QuizTierModel {
    public static final int $stable = 0;

    @SerializedName("fee")
    private final long fee;

    @SerializedName("id")
    private final long id;

    @SerializedName("name")
    private final String name;

    @SerializedName("oddsBoost")
    private final double oddsBoost;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final double getOddsBoost() {
        return this.oddsBoost;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final long getFee() {
        return this.fee;
    }

    public final QuizTierModel copy(long id, double oddsBoost, String name, long fee) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new QuizTierModel(id, oddsBoost, name, fee);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuizTierModel)) {
            return false;
        }
        QuizTierModel quizTierModel = (QuizTierModel) other;
        return this.id == quizTierModel.id && Double.compare(this.oddsBoost, quizTierModel.oddsBoost) == 0 && Intrinsics.areEqual(this.name, quizTierModel.name) && this.fee == quizTierModel.fee;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.id) * 31) + Double.hashCode(this.oddsBoost)) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.fee);
    }

    public String toString() {
        return "QuizTierModel(id=" + this.id + ", oddsBoost=" + this.oddsBoost + ", name=" + this.name + ", fee=" + this.fee + ")";
    }

    public QuizTierModel(long j, double d, String name, long j2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = j;
        this.oddsBoost = d;
        this.name = name;
        this.fee = j2;
    }

    public final long getId() {
        return this.id;
    }

    public final double getOddsBoost() {
        return this.oddsBoost;
    }

    public final String getName() {
        return this.name;
    }

    public final long getFee() {
        return this.fee;
    }
}
