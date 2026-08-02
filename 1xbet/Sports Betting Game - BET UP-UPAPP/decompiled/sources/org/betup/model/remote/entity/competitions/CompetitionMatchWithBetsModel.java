package org.betup.model.remote.entity.competitions;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CompetitionDetailsWithParticipantModel.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lorg/betup/model/remote/entity/competitions/CompetitionMatchWithBetsModel;", "", "matchInfo", "Lorg/betup/model/remote/entity/competitions/CompetitionMatchInfoModel;", "bets", "", "Lorg/betup/model/remote/entity/competitions/CompetitionParticipantBetModel;", "subMatches", "Lorg/betup/model/remote/entity/competitions/CompetitionSubMatchModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/competitions/CompetitionMatchInfoModel;Ljava/util/List;Ljava/util/List;)V", "getMatchInfo", "()Lorg/betup/model/remote/entity/competitions/CompetitionMatchInfoModel;", "getBets", "()Ljava/util/List;", "getSubMatches", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CompetitionMatchWithBetsModel {
    public static final int $stable = 8;

    @SerializedName("bets")
    private final List<CompetitionParticipantBetModel> bets;

    @SerializedName("match_info")
    private final CompetitionMatchInfoModel matchInfo;

    @SerializedName("sub_matches")
    private final List<CompetitionSubMatchModel> subMatches;

    public CompetitionMatchWithBetsModel() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompetitionMatchWithBetsModel copy$default(CompetitionMatchWithBetsModel competitionMatchWithBetsModel, CompetitionMatchInfoModel competitionMatchInfoModel, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            competitionMatchInfoModel = competitionMatchWithBetsModel.matchInfo;
        }
        if ((i & 2) != 0) {
            list = competitionMatchWithBetsModel.bets;
        }
        if ((i & 4) != 0) {
            list2 = competitionMatchWithBetsModel.subMatches;
        }
        return competitionMatchWithBetsModel.copy(competitionMatchInfoModel, list, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final CompetitionMatchInfoModel getMatchInfo() {
        return this.matchInfo;
    }

    public final List<CompetitionParticipantBetModel> component2() {
        return this.bets;
    }

    public final List<CompetitionSubMatchModel> component3() {
        return this.subMatches;
    }

    public final CompetitionMatchWithBetsModel copy(CompetitionMatchInfoModel matchInfo, List<CompetitionParticipantBetModel> bets, List<CompetitionSubMatchModel> subMatches) {
        Intrinsics.checkNotNullParameter(matchInfo, "matchInfo");
        Intrinsics.checkNotNullParameter(bets, "bets");
        Intrinsics.checkNotNullParameter(subMatches, "subMatches");
        return new CompetitionMatchWithBetsModel(matchInfo, bets, subMatches);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompetitionMatchWithBetsModel)) {
            return false;
        }
        CompetitionMatchWithBetsModel competitionMatchWithBetsModel = (CompetitionMatchWithBetsModel) other;
        return Intrinsics.areEqual(this.matchInfo, competitionMatchWithBetsModel.matchInfo) && Intrinsics.areEqual(this.bets, competitionMatchWithBetsModel.bets) && Intrinsics.areEqual(this.subMatches, competitionMatchWithBetsModel.subMatches);
    }

    public int hashCode() {
        return (((this.matchInfo.hashCode() * 31) + this.bets.hashCode()) * 31) + this.subMatches.hashCode();
    }

    public String toString() {
        return "CompetitionMatchWithBetsModel(matchInfo=" + this.matchInfo + ", bets=" + this.bets + ", subMatches=" + this.subMatches + ")";
    }

    public CompetitionMatchWithBetsModel(CompetitionMatchInfoModel matchInfo, List<CompetitionParticipantBetModel> bets, List<CompetitionSubMatchModel> subMatches) {
        Intrinsics.checkNotNullParameter(matchInfo, "matchInfo");
        Intrinsics.checkNotNullParameter(bets, "bets");
        Intrinsics.checkNotNullParameter(subMatches, "subMatches");
        this.matchInfo = matchInfo;
        this.bets = bets;
        this.subMatches = subMatches;
    }

    public final CompetitionMatchInfoModel getMatchInfo() {
        return this.matchInfo;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CompetitionMatchWithBetsModel(org.betup.model.remote.entity.competitions.CompetitionMatchInfoModel r19, java.util.List r20, java.util.List r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r18 = this;
            r0 = r22 & 1
            if (r0 == 0) goto L1d
            org.betup.model.remote.entity.competitions.CompetitionMatchInfoModel r0 = new org.betup.model.remote.entity.competitions.CompetitionMatchInfoModel
            r1 = r0
            r16 = 8191(0x1fff, float:1.1478E-41)
            r17 = 0
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
            r15 = 0
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L1f
        L1d:
            r0 = r19
        L1f:
            r1 = r22 & 2
            if (r1 == 0) goto L28
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            goto L2a
        L28:
            r1 = r20
        L2a:
            r2 = r22 & 4
            if (r2 == 0) goto L35
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            r3 = r18
            goto L39
        L35:
            r3 = r18
            r2 = r21
        L39:
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.betup.model.remote.entity.competitions.CompetitionMatchWithBetsModel.<init>(org.betup.model.remote.entity.competitions.CompetitionMatchInfoModel, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<CompetitionParticipantBetModel> getBets() {
        return this.bets;
    }

    public final List<CompetitionSubMatchModel> getSubMatches() {
        return this.subMatches;
    }
}
