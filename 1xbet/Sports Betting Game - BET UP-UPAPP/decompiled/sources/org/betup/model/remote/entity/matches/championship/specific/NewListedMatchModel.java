package org.betup.model.remote.entity.matches.championship.specific;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewMatchesForLeagueModel.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lorg/betup/model/remote/entity/matches/championship/specific/NewListedMatchModel;", "", "match", "Lorg/betup/model/remote/entity/matches/championship/specific/NewMatchDetailsDataModel;", NotificationCompat.CATEGORY_SOCIAL, "Lorg/betup/model/remote/entity/matches/championship/specific/NewSocialModel;", "bets", "", "Lorg/betup/model/remote/entity/matches/championship/specific/NewBetSectionModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/matches/championship/specific/NewMatchDetailsDataModel;Lorg/betup/model/remote/entity/matches/championship/specific/NewSocialModel;Ljava/util/List;)V", "getMatch", "()Lorg/betup/model/remote/entity/matches/championship/specific/NewMatchDetailsDataModel;", "getSocial", "()Lorg/betup/model/remote/entity/matches/championship/specific/NewSocialModel;", "getBets", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewListedMatchModel {
    public static final int $stable = 8;

    @SerializedName("bets")
    private final List<NewBetSectionModel> bets;

    @SerializedName("match")
    private final NewMatchDetailsDataModel match;

    @SerializedName(NotificationCompat.CATEGORY_SOCIAL)
    private final NewSocialModel social;

    public NewListedMatchModel() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewListedMatchModel copy$default(NewListedMatchModel newListedMatchModel, NewMatchDetailsDataModel newMatchDetailsDataModel, NewSocialModel newSocialModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            newMatchDetailsDataModel = newListedMatchModel.match;
        }
        if ((i & 2) != 0) {
            newSocialModel = newListedMatchModel.social;
        }
        if ((i & 4) != 0) {
            list = newListedMatchModel.bets;
        }
        return newListedMatchModel.copy(newMatchDetailsDataModel, newSocialModel, list);
    }

    /* renamed from: component1, reason: from getter */
    public final NewMatchDetailsDataModel getMatch() {
        return this.match;
    }

    /* renamed from: component2, reason: from getter */
    public final NewSocialModel getSocial() {
        return this.social;
    }

    public final List<NewBetSectionModel> component3() {
        return this.bets;
    }

    public final NewListedMatchModel copy(NewMatchDetailsDataModel match, NewSocialModel social, List<NewBetSectionModel> bets) {
        Intrinsics.checkNotNullParameter(match, "match");
        Intrinsics.checkNotNullParameter(social, "social");
        Intrinsics.checkNotNullParameter(bets, "bets");
        return new NewListedMatchModel(match, social, bets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewListedMatchModel)) {
            return false;
        }
        NewListedMatchModel newListedMatchModel = (NewListedMatchModel) other;
        return Intrinsics.areEqual(this.match, newListedMatchModel.match) && Intrinsics.areEqual(this.social, newListedMatchModel.social) && Intrinsics.areEqual(this.bets, newListedMatchModel.bets);
    }

    public int hashCode() {
        return (((this.match.hashCode() * 31) + this.social.hashCode()) * 31) + this.bets.hashCode();
    }

    public String toString() {
        return "NewListedMatchModel(match=" + this.match + ", social=" + this.social + ", bets=" + this.bets + ")";
    }

    public NewListedMatchModel(NewMatchDetailsDataModel match, NewSocialModel social, List<NewBetSectionModel> bets) {
        Intrinsics.checkNotNullParameter(match, "match");
        Intrinsics.checkNotNullParameter(social, "social");
        Intrinsics.checkNotNullParameter(bets, "bets");
        this.match = match;
        this.social = social;
        this.bets = bets;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ NewListedMatchModel(org.betup.model.remote.entity.matches.championship.specific.NewMatchDetailsDataModel r18, org.betup.model.remote.entity.matches.championship.specific.NewSocialModel r19, java.util.List r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r17 = this;
            r0 = r21 & 1
            if (r0 == 0) goto L1c
            org.betup.model.remote.entity.matches.championship.specific.NewMatchDetailsDataModel r0 = new org.betup.model.remote.entity.matches.championship.specific.NewMatchDetailsDataModel
            r15 = 4095(0xfff, float:5.738E-42)
            r16 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r1 = r0
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L1e
        L1c:
            r0 = r18
        L1e:
            r1 = r21 & 2
            if (r1 == 0) goto L33
            org.betup.model.remote.entity.matches.championship.specific.NewSocialModel r1 = new org.betup.model.remote.entity.matches.championship.specific.NewSocialModel
            r10 = 63
            r11 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r1
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11)
            goto L35
        L33:
            r1 = r19
        L35:
            r2 = r21 & 4
            if (r2 == 0) goto L40
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            r3 = r17
            goto L44
        L40:
            r3 = r17
            r2 = r20
        L44:
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.betup.model.remote.entity.matches.championship.specific.NewListedMatchModel.<init>(org.betup.model.remote.entity.matches.championship.specific.NewMatchDetailsDataModel, org.betup.model.remote.entity.matches.championship.specific.NewSocialModel, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final NewMatchDetailsDataModel getMatch() {
        return this.match;
    }

    public final NewSocialModel getSocial() {
        return this.social;
    }

    public final List<NewBetSectionModel> getBets() {
        return this.bets;
    }
}
