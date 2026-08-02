package org.betup.ui.fragment.dailybonus.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DailyBonusModels.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lorg/betup/ui/fragment/dailybonus/model/DailyBonusDay;", "", "id", "", "dayNumber", "betcoinBonus", "ticketBonus", "photoUrl", "", "state", "Lorg/betup/ui/fragment/dailybonus/model/DailyBonusState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IIIILjava/lang/String;Lorg/betup/ui/fragment/dailybonus/model/DailyBonusState;)V", "getId", "()I", "getDayNumber", "getBetcoinBonus", "getTicketBonus", "getPhotoUrl", "()Ljava/lang/String;", "getState", "()Lorg/betup/ui/fragment/dailybonus/model/DailyBonusState;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DailyBonusDay {
    public static final int $stable = 0;
    private final int betcoinBonus;
    private final int dayNumber;
    private final int id;
    private final String photoUrl;
    private final DailyBonusState state;
    private final int ticketBonus;

    public static /* synthetic */ DailyBonusDay copy$default(DailyBonusDay dailyBonusDay, int i, int i2, int i3, int i4, String str, DailyBonusState dailyBonusState, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = dailyBonusDay.id;
        }
        if ((i5 & 2) != 0) {
            i2 = dailyBonusDay.dayNumber;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = dailyBonusDay.betcoinBonus;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = dailyBonusDay.ticketBonus;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            str = dailyBonusDay.photoUrl;
        }
        String str2 = str;
        if ((i5 & 32) != 0) {
            dailyBonusState = dailyBonusDay.state;
        }
        return dailyBonusDay.copy(i, i6, i7, i8, str2, dailyBonusState);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
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
    public final DailyBonusState getState() {
        return this.state;
    }

    public final DailyBonusDay copy(int id, int dayNumber, int betcoinBonus, int ticketBonus, String photoUrl, DailyBonusState state) {
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        Intrinsics.checkNotNullParameter(state, "state");
        return new DailyBonusDay(id, dayNumber, betcoinBonus, ticketBonus, photoUrl, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyBonusDay)) {
            return false;
        }
        DailyBonusDay dailyBonusDay = (DailyBonusDay) other;
        return this.id == dailyBonusDay.id && this.dayNumber == dailyBonusDay.dayNumber && this.betcoinBonus == dailyBonusDay.betcoinBonus && this.ticketBonus == dailyBonusDay.ticketBonus && Intrinsics.areEqual(this.photoUrl, dailyBonusDay.photoUrl) && this.state == dailyBonusDay.state;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.dayNumber)) * 31) + Integer.hashCode(this.betcoinBonus)) * 31) + Integer.hashCode(this.ticketBonus)) * 31) + this.photoUrl.hashCode()) * 31) + this.state.hashCode();
    }

    public String toString() {
        return "DailyBonusDay(id=" + this.id + ", dayNumber=" + this.dayNumber + ", betcoinBonus=" + this.betcoinBonus + ", ticketBonus=" + this.ticketBonus + ", photoUrl=" + this.photoUrl + ", state=" + this.state + ")";
    }

    public DailyBonusDay(int i, int i2, int i3, int i4, String photoUrl, DailyBonusState state) {
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = i;
        this.dayNumber = i2;
        this.betcoinBonus = i3;
        this.ticketBonus = i4;
        this.photoUrl = photoUrl;
        this.state = state;
    }

    public final int getId() {
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

    public final DailyBonusState getState() {
        return this.state;
    }
}
