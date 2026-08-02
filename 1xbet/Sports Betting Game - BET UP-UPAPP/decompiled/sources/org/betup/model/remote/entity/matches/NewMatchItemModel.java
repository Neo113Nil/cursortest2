package org.betup.model.remote.entity.matches;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewMatchItemModel.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lorg/betup/model/remote/entity/matches/NewMatchItemModel;", "", "match", "Lorg/betup/model/remote/entity/matches/NewMatchModel;", NotificationCompat.CATEGORY_SOCIAL, "Lorg/betup/model/remote/entity/matches/NewMatchSocialModel;", "bets", "", "Lorg/betup/model/remote/entity/matches/NewMatchBetModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/matches/NewMatchModel;Lorg/betup/model/remote/entity/matches/NewMatchSocialModel;Ljava/util/List;)V", "getMatch", "()Lorg/betup/model/remote/entity/matches/NewMatchModel;", "getSocial", "()Lorg/betup/model/remote/entity/matches/NewMatchSocialModel;", "getBets", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewMatchItemModel {
    public static final int $stable = 8;

    @SerializedName("bets")
    private final List<NewMatchBetModel> bets;

    @SerializedName("match")
    private final NewMatchModel match;

    @SerializedName(NotificationCompat.CATEGORY_SOCIAL)
    private final NewMatchSocialModel social;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewMatchItemModel copy$default(NewMatchItemModel newMatchItemModel, NewMatchModel newMatchModel, NewMatchSocialModel newMatchSocialModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            newMatchModel = newMatchItemModel.match;
        }
        if ((i & 2) != 0) {
            newMatchSocialModel = newMatchItemModel.social;
        }
        if ((i & 4) != 0) {
            list = newMatchItemModel.bets;
        }
        return newMatchItemModel.copy(newMatchModel, newMatchSocialModel, list);
    }

    /* renamed from: component1, reason: from getter */
    public final NewMatchModel getMatch() {
        return this.match;
    }

    /* renamed from: component2, reason: from getter */
    public final NewMatchSocialModel getSocial() {
        return this.social;
    }

    public final List<NewMatchBetModel> component3() {
        return this.bets;
    }

    public final NewMatchItemModel copy(NewMatchModel match, NewMatchSocialModel social, List<NewMatchBetModel> bets) {
        Intrinsics.checkNotNullParameter(match, "match");
        Intrinsics.checkNotNullParameter(social, "social");
        Intrinsics.checkNotNullParameter(bets, "bets");
        return new NewMatchItemModel(match, social, bets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewMatchItemModel)) {
            return false;
        }
        NewMatchItemModel newMatchItemModel = (NewMatchItemModel) other;
        return Intrinsics.areEqual(this.match, newMatchItemModel.match) && Intrinsics.areEqual(this.social, newMatchItemModel.social) && Intrinsics.areEqual(this.bets, newMatchItemModel.bets);
    }

    public int hashCode() {
        return (((this.match.hashCode() * 31) + this.social.hashCode()) * 31) + this.bets.hashCode();
    }

    public String toString() {
        return "NewMatchItemModel(match=" + this.match + ", social=" + this.social + ", bets=" + this.bets + ")";
    }

    public NewMatchItemModel(NewMatchModel match, NewMatchSocialModel social, List<NewMatchBetModel> bets) {
        Intrinsics.checkNotNullParameter(match, "match");
        Intrinsics.checkNotNullParameter(social, "social");
        Intrinsics.checkNotNullParameter(bets, "bets");
        this.match = match;
        this.social = social;
        this.bets = bets;
    }

    public final NewMatchModel getMatch() {
        return this.match;
    }

    public final NewMatchSocialModel getSocial() {
        return this.social;
    }

    public final List<NewMatchBetModel> getBets() {
        return this.bets;
    }
}
