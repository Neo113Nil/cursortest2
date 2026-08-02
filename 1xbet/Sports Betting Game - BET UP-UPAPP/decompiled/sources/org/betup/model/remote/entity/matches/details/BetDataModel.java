package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.bets.BetState;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BetDataModel.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JG\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lorg/betup/model/remote/entity/matches/details/BetDataModel;", "", "id", "", "coefficient", "", "betTypeId", "name", "", "state", "Lorg/betup/model/remote/entity/bets/BetState;", "available", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JFJLjava/lang/String;Lorg/betup/model/remote/entity/bets/BetState;Z)V", "getId", "()J", "getCoefficient", "()F", "getBetTypeId", "getName", "()Ljava/lang/String;", "getState", "()Lorg/betup/model/remote/entity/bets/BetState;", "getAvailable", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BetDataModel {
    public static final int $stable = 0;

    @SerializedName("available")
    private final boolean available;

    @SerializedName("bet_type_id")
    private final long betTypeId;

    @SerializedName("grabbed_coeficient")
    private final float coefficient;

    @SerializedName("grabbed_bet_id")
    private final long id;

    @SerializedName("bet_name")
    private final String name;

    @SerializedName("state")
    private final BetState state;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final float getCoefficient() {
        return this.coefficient;
    }

    /* renamed from: component3, reason: from getter */
    public final long getBetTypeId() {
        return this.betTypeId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component5, reason: from getter */
    public final BetState getState() {
        return this.state;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getAvailable() {
        return this.available;
    }

    public final BetDataModel copy(long id, float coefficient, long betTypeId, String name, BetState state, boolean available) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new BetDataModel(id, coefficient, betTypeId, name, state, available);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetDataModel)) {
            return false;
        }
        BetDataModel betDataModel = (BetDataModel) other;
        return this.id == betDataModel.id && Float.compare(this.coefficient, betDataModel.coefficient) == 0 && this.betTypeId == betDataModel.betTypeId && Intrinsics.areEqual(this.name, betDataModel.name) && this.state == betDataModel.state && this.available == betDataModel.available;
    }

    public int hashCode() {
        int hashCode = ((((((Long.hashCode(this.id) * 31) + Float.hashCode(this.coefficient)) * 31) + Long.hashCode(this.betTypeId)) * 31) + this.name.hashCode()) * 31;
        BetState betState = this.state;
        return ((hashCode + (betState == null ? 0 : betState.hashCode())) * 31) + Boolean.hashCode(this.available);
    }

    public String toString() {
        return "BetDataModel(id=" + this.id + ", coefficient=" + this.coefficient + ", betTypeId=" + this.betTypeId + ", name=" + this.name + ", state=" + this.state + ", available=" + this.available + ")";
    }

    public BetDataModel(long j, float f, long j2, String name, BetState betState, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = j;
        this.coefficient = f;
        this.betTypeId = j2;
        this.name = name;
        this.state = betState;
        this.available = z;
    }

    public /* synthetic */ BetDataModel(long j, float f, long j2, String str, BetState betState, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, f, j2, str, (i & 16) != 0 ? null : betState, z);
    }

    public final long getId() {
        return this.id;
    }

    public final float getCoefficient() {
        return this.coefficient;
    }

    public final long getBetTypeId() {
        return this.betTypeId;
    }

    public final String getName() {
        return this.name;
    }

    public final BetState getState() {
        return this.state;
    }

    public final boolean getAvailable() {
        return this.available;
    }
}
