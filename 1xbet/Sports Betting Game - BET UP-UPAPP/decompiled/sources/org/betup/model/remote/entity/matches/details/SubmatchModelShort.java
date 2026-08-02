package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.matches.VarietyBetRestrictionInfoModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SubmatchModelShort.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jb\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\t\u0010,\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lorg/betup/model/remote/entity/matches/details/SubmatchModelShort;", "", "id", "", "scoreAway", "", "scoreHome", "betsGameType", "", "isIn1xbetResponse", "", "resultRaw", "paramTId", "varietyBetRestriction", "Lorg/betup/model/remote/entity/matches/VarietyBetRestrictionInfoModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JIILjava/lang/String;ZLjava/lang/String;Ljava/lang/Long;Lorg/betup/model/remote/entity/matches/VarietyBetRestrictionInfoModel;)V", "getId", "()J", "getScoreAway", "()I", "getScoreHome", "getBetsGameType", "()Ljava/lang/String;", "()Z", "getResultRaw", "getParamTId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getVarietyBetRestriction", "()Lorg/betup/model/remote/entity/matches/VarietyBetRestrictionInfoModel;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(JIILjava/lang/String;ZLjava/lang/String;Ljava/lang/Long;Lorg/betup/model/remote/entity/matches/VarietyBetRestrictionInfoModel;)Lorg/betup/model/remote/entity/matches/details/SubmatchModelShort;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SubmatchModelShort {
    public static final int $stable = 0;

    @SerializedName("bets_game_type")
    private final String betsGameType;

    @SerializedName("id")
    private final long id;

    @SerializedName("is_in1xbet_response")
    private final boolean isIn1xbetResponse;

    @SerializedName("param_t_id")
    private final Long paramTId;

    @SerializedName("result_raw")
    private final String resultRaw;

    @SerializedName("score_away")
    private final int scoreAway;

    @SerializedName("score_home")
    private final int scoreHome;

    @SerializedName("variety_bet_restriction")
    private final VarietyBetRestrictionInfoModel varietyBetRestriction;

    public SubmatchModelShort() {
        this(0L, 0, 0, null, false, null, null, null, 255, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getScoreAway() {
        return this.scoreAway;
    }

    /* renamed from: component3, reason: from getter */
    public final int getScoreHome() {
        return this.scoreHome;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBetsGameType() {
        return this.betsGameType;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsIn1xbetResponse() {
        return this.isIn1xbetResponse;
    }

    /* renamed from: component6, reason: from getter */
    public final String getResultRaw() {
        return this.resultRaw;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getParamTId() {
        return this.paramTId;
    }

    /* renamed from: component8, reason: from getter */
    public final VarietyBetRestrictionInfoModel getVarietyBetRestriction() {
        return this.varietyBetRestriction;
    }

    public final SubmatchModelShort copy(long id, int scoreAway, int scoreHome, String betsGameType, boolean isIn1xbetResponse, String resultRaw, Long paramTId, VarietyBetRestrictionInfoModel varietyBetRestriction) {
        Intrinsics.checkNotNullParameter(betsGameType, "betsGameType");
        Intrinsics.checkNotNullParameter(resultRaw, "resultRaw");
        return new SubmatchModelShort(id, scoreAway, scoreHome, betsGameType, isIn1xbetResponse, resultRaw, paramTId, varietyBetRestriction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmatchModelShort)) {
            return false;
        }
        SubmatchModelShort submatchModelShort = (SubmatchModelShort) other;
        return this.id == submatchModelShort.id && this.scoreAway == submatchModelShort.scoreAway && this.scoreHome == submatchModelShort.scoreHome && Intrinsics.areEqual(this.betsGameType, submatchModelShort.betsGameType) && this.isIn1xbetResponse == submatchModelShort.isIn1xbetResponse && Intrinsics.areEqual(this.resultRaw, submatchModelShort.resultRaw) && Intrinsics.areEqual(this.paramTId, submatchModelShort.paramTId) && Intrinsics.areEqual(this.varietyBetRestriction, submatchModelShort.varietyBetRestriction);
    }

    public int hashCode() {
        int hashCode = ((((((((((Long.hashCode(this.id) * 31) + Integer.hashCode(this.scoreAway)) * 31) + Integer.hashCode(this.scoreHome)) * 31) + this.betsGameType.hashCode()) * 31) + Boolean.hashCode(this.isIn1xbetResponse)) * 31) + this.resultRaw.hashCode()) * 31;
        Long l = this.paramTId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        VarietyBetRestrictionInfoModel varietyBetRestrictionInfoModel = this.varietyBetRestriction;
        return hashCode2 + (varietyBetRestrictionInfoModel != null ? varietyBetRestrictionInfoModel.hashCode() : 0);
    }

    public String toString() {
        return "SubmatchModelShort(id=" + this.id + ", scoreAway=" + this.scoreAway + ", scoreHome=" + this.scoreHome + ", betsGameType=" + this.betsGameType + ", isIn1xbetResponse=" + this.isIn1xbetResponse + ", resultRaw=" + this.resultRaw + ", paramTId=" + this.paramTId + ", varietyBetRestriction=" + this.varietyBetRestriction + ")";
    }

    public SubmatchModelShort(long j, int i, int i2, String betsGameType, boolean z, String resultRaw, Long l, VarietyBetRestrictionInfoModel varietyBetRestrictionInfoModel) {
        Intrinsics.checkNotNullParameter(betsGameType, "betsGameType");
        Intrinsics.checkNotNullParameter(resultRaw, "resultRaw");
        this.id = j;
        this.scoreAway = i;
        this.scoreHome = i2;
        this.betsGameType = betsGameType;
        this.isIn1xbetResponse = z;
        this.resultRaw = resultRaw;
        this.paramTId = l;
        this.varietyBetRestriction = varietyBetRestrictionInfoModel;
    }

    public /* synthetic */ SubmatchModelShort(long j, int i, int i2, String str, boolean z, String str2, Long l, VarietyBetRestrictionInfoModel varietyBetRestrictionInfoModel, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str, (i3 & 16) == 0 ? z : false, (i3 & 32) == 0 ? str2 : "", (i3 & 64) != 0 ? null : l, (i3 & 128) == 0 ? varietyBetRestrictionInfoModel : null);
    }

    public final long getId() {
        return this.id;
    }

    public final int getScoreAway() {
        return this.scoreAway;
    }

    public final int getScoreHome() {
        return this.scoreHome;
    }

    public final String getBetsGameType() {
        return this.betsGameType;
    }

    public final boolean isIn1xbetResponse() {
        return this.isIn1xbetResponse;
    }

    public final String getResultRaw() {
        return this.resultRaw;
    }

    public final Long getParamTId() {
        return this.paramTId;
    }

    public final VarietyBetRestrictionInfoModel getVarietyBetRestriction() {
        return this.varietyBetRestriction;
    }
}
