package org.betup.model.remote.entity.user;

import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: VarietyBetRestrictionsConfigModel.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lorg/betup/model/remote/entity/user/VarietyBetRestrictionVisibilityModel;", "", "standardBets", "", ClientData.KEY_CHALLENGE, "competition", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ZZZ)V", "getStandardBets", "()Z", "getChallenge", "getCompetition", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VarietyBetRestrictionVisibilityModel {
    public static final int $stable = 0;

    @SerializedName(ClientData.KEY_CHALLENGE)
    private final boolean challenge;

    @SerializedName("competition")
    private final boolean competition;

    @SerializedName("standardBets")
    private final boolean standardBets;

    public VarietyBetRestrictionVisibilityModel() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ VarietyBetRestrictionVisibilityModel copy$default(VarietyBetRestrictionVisibilityModel varietyBetRestrictionVisibilityModel, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = varietyBetRestrictionVisibilityModel.standardBets;
        }
        if ((i & 2) != 0) {
            z2 = varietyBetRestrictionVisibilityModel.challenge;
        }
        if ((i & 4) != 0) {
            z3 = varietyBetRestrictionVisibilityModel.competition;
        }
        return varietyBetRestrictionVisibilityModel.copy(z, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getStandardBets() {
        return this.standardBets;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getChallenge() {
        return this.challenge;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCompetition() {
        return this.competition;
    }

    public final VarietyBetRestrictionVisibilityModel copy(boolean standardBets, boolean challenge, boolean competition) {
        return new VarietyBetRestrictionVisibilityModel(standardBets, challenge, competition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VarietyBetRestrictionVisibilityModel)) {
            return false;
        }
        VarietyBetRestrictionVisibilityModel varietyBetRestrictionVisibilityModel = (VarietyBetRestrictionVisibilityModel) other;
        return this.standardBets == varietyBetRestrictionVisibilityModel.standardBets && this.challenge == varietyBetRestrictionVisibilityModel.challenge && this.competition == varietyBetRestrictionVisibilityModel.competition;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.standardBets) * 31) + Boolean.hashCode(this.challenge)) * 31) + Boolean.hashCode(this.competition);
    }

    public String toString() {
        return "VarietyBetRestrictionVisibilityModel(standardBets=" + this.standardBets + ", challenge=" + this.challenge + ", competition=" + this.competition + ")";
    }

    public VarietyBetRestrictionVisibilityModel(boolean z, boolean z2, boolean z3) {
        this.standardBets = z;
        this.challenge = z2;
        this.competition = z3;
    }

    public /* synthetic */ VarietyBetRestrictionVisibilityModel(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
    }

    public final boolean getStandardBets() {
        return this.standardBets;
    }

    public final boolean getChallenge() {
        return this.challenge;
    }

    public final boolean getCompetition() {
        return this.competition;
    }
}
