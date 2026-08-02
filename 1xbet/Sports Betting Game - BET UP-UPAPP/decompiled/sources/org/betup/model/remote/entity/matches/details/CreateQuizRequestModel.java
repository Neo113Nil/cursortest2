package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CreateQuizRequestModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lorg/betup/model/remote/entity/matches/details/CreateQuizRequestModel;", "", "tierId", "", "bets", "", "Lorg/betup/model/remote/entity/matches/details/PlaceBetRequestModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/util/List;)V", "getTierId", "()J", "getBets", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CreateQuizRequestModel {
    public static final int $stable = 8;

    @SerializedName("bets")
    private final List<PlaceBetRequestModel> bets;

    @SerializedName("tierId")
    private final long tierId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateQuizRequestModel copy$default(CreateQuizRequestModel createQuizRequestModel, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = createQuizRequestModel.tierId;
        }
        if ((i & 2) != 0) {
            list = createQuizRequestModel.bets;
        }
        return createQuizRequestModel.copy(j, list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTierId() {
        return this.tierId;
    }

    public final List<PlaceBetRequestModel> component2() {
        return this.bets;
    }

    public final CreateQuizRequestModel copy(long tierId, List<PlaceBetRequestModel> bets) {
        Intrinsics.checkNotNullParameter(bets, "bets");
        return new CreateQuizRequestModel(tierId, bets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateQuizRequestModel)) {
            return false;
        }
        CreateQuizRequestModel createQuizRequestModel = (CreateQuizRequestModel) other;
        return this.tierId == createQuizRequestModel.tierId && Intrinsics.areEqual(this.bets, createQuizRequestModel.bets);
    }

    public int hashCode() {
        return (Long.hashCode(this.tierId) * 31) + this.bets.hashCode();
    }

    public String toString() {
        return "CreateQuizRequestModel(tierId=" + this.tierId + ", bets=" + this.bets + ")";
    }

    public CreateQuizRequestModel(long j, List<PlaceBetRequestModel> bets) {
        Intrinsics.checkNotNullParameter(bets, "bets");
        this.tierId = j;
        this.bets = bets;
    }

    public final long getTierId() {
        return this.tierId;
    }

    public final List<PlaceBetRequestModel> getBets() {
        return this.bets;
    }
}
