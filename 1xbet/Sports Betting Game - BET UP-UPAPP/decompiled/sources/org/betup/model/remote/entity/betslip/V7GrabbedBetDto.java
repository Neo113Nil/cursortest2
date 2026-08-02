package org.betup.model.remote.entity.betslip;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: V7GrabbedBetsResponse.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JN\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lorg/betup/model/remote/entity/betslip/V7GrabbedBetDto;", "", "grabbedBetId", "", "grabbedCoeficient", "", "betTypeId", "betTypeGroup", "Lorg/betup/model/remote/entity/betslip/V7BetTypeGroupDto;", "isAvailable", "", "betName", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JDLjava/lang/Long;Lorg/betup/model/remote/entity/betslip/V7BetTypeGroupDto;ZLjava/lang/String;)V", "getGrabbedBetId", "()J", "getGrabbedCoeficient", "()D", "getBetTypeId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBetTypeGroup", "()Lorg/betup/model/remote/entity/betslip/V7BetTypeGroupDto;", "()Z", "getBetName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(JDLjava/lang/Long;Lorg/betup/model/remote/entity/betslip/V7BetTypeGroupDto;ZLjava/lang/String;)Lorg/betup/model/remote/entity/betslip/V7GrabbedBetDto;", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class V7GrabbedBetDto {
    public static final int $stable = 0;

    @SerializedName("bet_name")
    private final String betName;

    @SerializedName("bet_type_group")
    private final V7BetTypeGroupDto betTypeGroup;

    @SerializedName("bet_type_id")
    private final Long betTypeId;

    @SerializedName("grabbed_bet_id")
    private final long grabbedBetId;

    @SerializedName("grabbed_coeficient")
    private final double grabbedCoeficient;

    @SerializedName("is_available")
    private final boolean isAvailable;

    /* renamed from: component1, reason: from getter */
    public final long getGrabbedBetId() {
        return this.grabbedBetId;
    }

    /* renamed from: component2, reason: from getter */
    public final double getGrabbedCoeficient() {
        return this.grabbedCoeficient;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getBetTypeId() {
        return this.betTypeId;
    }

    /* renamed from: component4, reason: from getter */
    public final V7BetTypeGroupDto getBetTypeGroup() {
        return this.betTypeGroup;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBetName() {
        return this.betName;
    }

    public final V7GrabbedBetDto copy(long grabbedBetId, double grabbedCoeficient, Long betTypeId, V7BetTypeGroupDto betTypeGroup, boolean isAvailable, String betName) {
        Intrinsics.checkNotNullParameter(betName, "betName");
        return new V7GrabbedBetDto(grabbedBetId, grabbedCoeficient, betTypeId, betTypeGroup, isAvailable, betName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof V7GrabbedBetDto)) {
            return false;
        }
        V7GrabbedBetDto v7GrabbedBetDto = (V7GrabbedBetDto) other;
        return this.grabbedBetId == v7GrabbedBetDto.grabbedBetId && Double.compare(this.grabbedCoeficient, v7GrabbedBetDto.grabbedCoeficient) == 0 && Intrinsics.areEqual(this.betTypeId, v7GrabbedBetDto.betTypeId) && Intrinsics.areEqual(this.betTypeGroup, v7GrabbedBetDto.betTypeGroup) && this.isAvailable == v7GrabbedBetDto.isAvailable && Intrinsics.areEqual(this.betName, v7GrabbedBetDto.betName);
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.grabbedBetId) * 31) + Double.hashCode(this.grabbedCoeficient)) * 31;
        Long l = this.betTypeId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        V7BetTypeGroupDto v7BetTypeGroupDto = this.betTypeGroup;
        return ((((hashCode2 + (v7BetTypeGroupDto != null ? v7BetTypeGroupDto.hashCode() : 0)) * 31) + Boolean.hashCode(this.isAvailable)) * 31) + this.betName.hashCode();
    }

    public String toString() {
        return "V7GrabbedBetDto(grabbedBetId=" + this.grabbedBetId + ", grabbedCoeficient=" + this.grabbedCoeficient + ", betTypeId=" + this.betTypeId + ", betTypeGroup=" + this.betTypeGroup + ", isAvailable=" + this.isAvailable + ", betName=" + this.betName + ")";
    }

    public V7GrabbedBetDto(long j, double d, Long l, V7BetTypeGroupDto v7BetTypeGroupDto, boolean z, String betName) {
        Intrinsics.checkNotNullParameter(betName, "betName");
        this.grabbedBetId = j;
        this.grabbedCoeficient = d;
        this.betTypeId = l;
        this.betTypeGroup = v7BetTypeGroupDto;
        this.isAvailable = z;
        this.betName = betName;
    }

    public final long getGrabbedBetId() {
        return this.grabbedBetId;
    }

    public final double getGrabbedCoeficient() {
        return this.grabbedCoeficient;
    }

    public final Long getBetTypeId() {
        return this.betTypeId;
    }

    public final V7BetTypeGroupDto getBetTypeGroup() {
        return this.betTypeGroup;
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public final String getBetName() {
        return this.betName;
    }
}
