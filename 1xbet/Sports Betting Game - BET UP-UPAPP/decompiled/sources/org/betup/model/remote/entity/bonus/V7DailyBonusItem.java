package org.betup.model.remote.entity.bonus;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: V7DailyBonusResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, d2 = {"Lorg/betup/model/remote/entity/bonus/V7DailyBonusItem;", "", "id", "", "dayNumber", "", "betcoinBonus", "ticketBonus", "photoUrl", "", "state", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JIIILjava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getDayNumber", "()I", "getBetcoinBonus", "getTicketBonus", "getPhotoUrl", "()Ljava/lang/String;", "getState", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class V7DailyBonusItem {
    public static final int $stable = 0;

    @SerializedName("betcoinBonus")
    private final int betcoinBonus;

    @SerializedName("dayNumber")
    private final int dayNumber;

    @SerializedName("id")
    private final long id;

    @SerializedName("photoUrl")
    private final String photoUrl;

    @SerializedName("state")
    private final String state;

    @SerializedName("ticketBonus")
    private final int ticketBonus;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDayNumber() {
        return this.dayNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final int getBetcoinBonus() {
        return this.betcoinBonus;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTicketBonus() {
        return this.ticketBonus;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final V7DailyBonusItem copy(long id, int dayNumber, int betcoinBonus, int ticketBonus, String photoUrl, String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new V7DailyBonusItem(id, dayNumber, betcoinBonus, ticketBonus, photoUrl, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof V7DailyBonusItem)) {
            return false;
        }
        V7DailyBonusItem v7DailyBonusItem = (V7DailyBonusItem) other;
        return this.id == v7DailyBonusItem.id && this.dayNumber == v7DailyBonusItem.dayNumber && this.betcoinBonus == v7DailyBonusItem.betcoinBonus && this.ticketBonus == v7DailyBonusItem.ticketBonus && Intrinsics.areEqual(this.photoUrl, v7DailyBonusItem.photoUrl) && Intrinsics.areEqual(this.state, v7DailyBonusItem.state);
    }

    public int hashCode() {
        int hashCode = ((((((Long.hashCode(this.id) * 31) + Integer.hashCode(this.dayNumber)) * 31) + Integer.hashCode(this.betcoinBonus)) * 31) + Integer.hashCode(this.ticketBonus)) * 31;
        String str = this.photoUrl;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.state.hashCode();
    }

    public String toString() {
        return "V7DailyBonusItem(id=" + this.id + ", dayNumber=" + this.dayNumber + ", betcoinBonus=" + this.betcoinBonus + ", ticketBonus=" + this.ticketBonus + ", photoUrl=" + this.photoUrl + ", state=" + this.state + ")";
    }

    public V7DailyBonusItem(long j, int i, int i2, int i3, String str, String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j;
        this.dayNumber = i;
        this.betcoinBonus = i2;
        this.ticketBonus = i3;
        this.photoUrl = str;
        this.state = state;
    }

    public final long getId() {
        return this.id;
    }

    public final int getDayNumber() {
        return this.dayNumber;
    }

    public final int getBetcoinBonus() {
        return this.betcoinBonus;
    }

    public final int getTicketBonus() {
        return this.ticketBonus;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final String getState() {
        return this.state;
    }
}
