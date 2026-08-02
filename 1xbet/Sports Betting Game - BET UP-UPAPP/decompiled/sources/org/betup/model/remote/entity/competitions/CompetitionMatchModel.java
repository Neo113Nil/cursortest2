package org.betup.model.remote.entity.competitions;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CompetitionDetailsModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lorg/betup/model/remote/entity/competitions/CompetitionMatchModel;", "", "matchInfo", "Lorg/betup/model/remote/entity/competitions/CompetitionMatchInfoModel;", "subMatches", "", "Lorg/betup/model/remote/entity/competitions/CompetitionSubMatchModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/competitions/CompetitionMatchInfoModel;Ljava/util/List;)V", "getMatchInfo", "()Lorg/betup/model/remote/entity/competitions/CompetitionMatchInfoModel;", "getSubMatches", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CompetitionMatchModel {
    public static final int $stable = 8;

    @SerializedName("match_info")
    private final CompetitionMatchInfoModel matchInfo;

    @SerializedName("sub_matches")
    private final List<CompetitionSubMatchModel> subMatches;

    /* JADX WARN: Multi-variable type inference failed */
    public CompetitionMatchModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompetitionMatchModel copy$default(CompetitionMatchModel competitionMatchModel, CompetitionMatchInfoModel competitionMatchInfoModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            competitionMatchInfoModel = competitionMatchModel.matchInfo;
        }
        if ((i & 2) != 0) {
            list = competitionMatchModel.subMatches;
        }
        return competitionMatchModel.copy(competitionMatchInfoModel, list);
    }

    /* renamed from: component1, reason: from getter */
    public final CompetitionMatchInfoModel getMatchInfo() {
        return this.matchInfo;
    }

    public final List<CompetitionSubMatchModel> component2() {
        return this.subMatches;
    }

    public final CompetitionMatchModel copy(CompetitionMatchInfoModel matchInfo, List<CompetitionSubMatchModel> subMatches) {
        Intrinsics.checkNotNullParameter(matchInfo, "matchInfo");
        Intrinsics.checkNotNullParameter(subMatches, "subMatches");
        return new CompetitionMatchModel(matchInfo, subMatches);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompetitionMatchModel)) {
            return false;
        }
        CompetitionMatchModel competitionMatchModel = (CompetitionMatchModel) other;
        return Intrinsics.areEqual(this.matchInfo, competitionMatchModel.matchInfo) && Intrinsics.areEqual(this.subMatches, competitionMatchModel.subMatches);
    }

    public int hashCode() {
        return (this.matchInfo.hashCode() * 31) + this.subMatches.hashCode();
    }

    public String toString() {
        return "CompetitionMatchModel(matchInfo=" + this.matchInfo + ", subMatches=" + this.subMatches + ")";
    }

    public CompetitionMatchModel(CompetitionMatchInfoModel matchInfo, List<CompetitionSubMatchModel> subMatches) {
        Intrinsics.checkNotNullParameter(matchInfo, "matchInfo");
        Intrinsics.checkNotNullParameter(subMatches, "subMatches");
        this.matchInfo = matchInfo;
        this.subMatches = subMatches;
    }

    public final CompetitionMatchInfoModel getMatchInfo() {
        return this.matchInfo;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CompetitionMatchModel(org.betup.model.remote.entity.competitions.CompetitionMatchInfoModel r19, java.util.List r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r18 = this;
            r0 = r21 & 1
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
            r1 = r21 & 2
            if (r1 == 0) goto L2a
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r2 = r18
            goto L2e
        L2a:
            r2 = r18
            r1 = r20
        L2e:
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.betup.model.remote.entity.competitions.CompetitionMatchModel.<init>(org.betup.model.remote.entity.competitions.CompetitionMatchInfoModel, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<CompetitionSubMatchModel> getSubMatches() {
        return this.subMatches;
    }
}
