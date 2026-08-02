package org.betup.model.remote.entity.sports;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.rest.user.V7UserBetStatisticsInteractor;
import org.betup.ui.fragment.matches.filter.NewMatchFilter;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: NewMatchCount.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006%"}, d2 = {"Lorg/betup/model/remote/entity/sports/NewMatchCount;", "", "all", "", "live", "hour", "threeHours", "sixHours", "twelveHours", "oneDay", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IIIIIII)V", "getAll", "()I", "getLive", "getHour", "getThreeHours", "getSixHours", "getTwelveHours", "getOneDay", "getCurrentCount", "filter", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NewMatchCount {
    public static final int $stable = 0;

    @SerializedName(V7UserBetStatisticsInteractor.STATS_TYPE_ALL)
    private final int all;

    @SerializedName("HOUR")
    private final int hour;

    @SerializedName("LIVE")
    private final int live;

    @SerializedName("ONE_DAY")
    private final int oneDay;

    @SerializedName("SIX_HOURS")
    private final int sixHours;

    @SerializedName("THREE_HOURS")
    private final int threeHours;

    @SerializedName("TWELVE_HOURS")
    private final int twelveHours;

    public NewMatchCount() {
        this(0, 0, 0, 0, 0, 0, 0, 127, null);
    }

    public static /* synthetic */ NewMatchCount copy$default(NewMatchCount newMatchCount, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = newMatchCount.all;
        }
        if ((i8 & 2) != 0) {
            i2 = newMatchCount.live;
        }
        int i9 = i2;
        if ((i8 & 4) != 0) {
            i3 = newMatchCount.hour;
        }
        int i10 = i3;
        if ((i8 & 8) != 0) {
            i4 = newMatchCount.threeHours;
        }
        int i11 = i4;
        if ((i8 & 16) != 0) {
            i5 = newMatchCount.sixHours;
        }
        int i12 = i5;
        if ((i8 & 32) != 0) {
            i6 = newMatchCount.twelveHours;
        }
        int i13 = i6;
        if ((i8 & 64) != 0) {
            i7 = newMatchCount.oneDay;
        }
        return newMatchCount.copy(i, i9, i10, i11, i12, i13, i7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAll() {
        return this.all;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLive() {
        return this.live;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHour() {
        return this.hour;
    }

    /* renamed from: component4, reason: from getter */
    public final int getThreeHours() {
        return this.threeHours;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSixHours() {
        return this.sixHours;
    }

    /* renamed from: component6, reason: from getter */
    public final int getTwelveHours() {
        return this.twelveHours;
    }

    /* renamed from: component7, reason: from getter */
    public final int getOneDay() {
        return this.oneDay;
    }

    public final NewMatchCount copy(int all, int live, int hour, int threeHours, int sixHours, int twelveHours, int oneDay) {
        return new NewMatchCount(all, live, hour, threeHours, sixHours, twelveHours, oneDay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewMatchCount)) {
            return false;
        }
        NewMatchCount newMatchCount = (NewMatchCount) other;
        return this.all == newMatchCount.all && this.live == newMatchCount.live && this.hour == newMatchCount.hour && this.threeHours == newMatchCount.threeHours && this.sixHours == newMatchCount.sixHours && this.twelveHours == newMatchCount.twelveHours && this.oneDay == newMatchCount.oneDay;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.all) * 31) + Integer.hashCode(this.live)) * 31) + Integer.hashCode(this.hour)) * 31) + Integer.hashCode(this.threeHours)) * 31) + Integer.hashCode(this.sixHours)) * 31) + Integer.hashCode(this.twelveHours)) * 31) + Integer.hashCode(this.oneDay);
    }

    public String toString() {
        return "NewMatchCount(all=" + this.all + ", live=" + this.live + ", hour=" + this.hour + ", threeHours=" + this.threeHours + ", sixHours=" + this.sixHours + ", twelveHours=" + this.twelveHours + ", oneDay=" + this.oneDay + ")";
    }

    public NewMatchCount(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.all = i;
        this.live = i2;
        this.hour = i3;
        this.threeHours = i4;
        this.sixHours = i5;
        this.twelveHours = i6;
        this.oneDay = i7;
    }

    public /* synthetic */ NewMatchCount(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? 0 : i3, (i8 & 8) != 0 ? 0 : i4, (i8 & 16) != 0 ? 0 : i5, (i8 & 32) != 0 ? 0 : i6, (i8 & 64) != 0 ? 0 : i7);
    }

    public final int getAll() {
        return this.all;
    }

    public final int getLive() {
        return this.live;
    }

    public final int getHour() {
        return this.hour;
    }

    public final int getThreeHours() {
        return this.threeHours;
    }

    public final int getSixHours() {
        return this.sixHours;
    }

    public final int getTwelveHours() {
        return this.twelveHours;
    }

    public final int getOneDay() {
        return this.oneDay;
    }

    public final int getCurrentCount(NewMatchFilter filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        if (Intrinsics.areEqual(filter, NewMatchFilter.All.INSTANCE)) {
            return this.all;
        }
        if (Intrinsics.areEqual(filter, NewMatchFilter.Live.INSTANCE)) {
            return this.live;
        }
        if (Intrinsics.areEqual(filter, NewMatchFilter.OneHour.INSTANCE)) {
            return this.hour;
        }
        if (Intrinsics.areEqual(filter, NewMatchFilter.ThreeHours.INSTANCE)) {
            return this.threeHours;
        }
        if (Intrinsics.areEqual(filter, NewMatchFilter.SixHours.INSTANCE)) {
            return this.sixHours;
        }
        if (Intrinsics.areEqual(filter, NewMatchFilter.TwelveHours.INSTANCE)) {
            return this.twelveHours;
        }
        if (Intrinsics.areEqual(filter, NewMatchFilter.Today.INSTANCE)) {
            return this.oneDay;
        }
        throw new NoWhenBranchMatchedException();
    }
}
