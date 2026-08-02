package org.betup.model.remote.entity.challenges;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: UserBattleActionCountsModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, d2 = {"Lorg/betup/model/remote/entity/challenges/UserBattleActionCountsModel;", "", "availablePublic", "", "privatePending", "totalActionable", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(III)V", "getAvailablePublic", "()I", "getPrivatePending", "getTotalActionable", "badgeCount", "getBadgeCount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserBattleActionCountsModel {
    public static final int $stable = 0;

    @SerializedName("available_public")
    private final int availablePublic;

    @SerializedName("private_pending")
    private final int privatePending;

    @SerializedName("total_actionable")
    private final int totalActionable;

    public UserBattleActionCountsModel() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ UserBattleActionCountsModel copy$default(UserBattleActionCountsModel userBattleActionCountsModel, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = userBattleActionCountsModel.availablePublic;
        }
        if ((i4 & 2) != 0) {
            i2 = userBattleActionCountsModel.privatePending;
        }
        if ((i4 & 4) != 0) {
            i3 = userBattleActionCountsModel.totalActionable;
        }
        return userBattleActionCountsModel.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAvailablePublic() {
        return this.availablePublic;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPrivatePending() {
        return this.privatePending;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTotalActionable() {
        return this.totalActionable;
    }

    public final UserBattleActionCountsModel copy(int availablePublic, int privatePending, int totalActionable) {
        return new UserBattleActionCountsModel(availablePublic, privatePending, totalActionable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserBattleActionCountsModel)) {
            return false;
        }
        UserBattleActionCountsModel userBattleActionCountsModel = (UserBattleActionCountsModel) other;
        return this.availablePublic == userBattleActionCountsModel.availablePublic && this.privatePending == userBattleActionCountsModel.privatePending && this.totalActionable == userBattleActionCountsModel.totalActionable;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.availablePublic) * 31) + Integer.hashCode(this.privatePending)) * 31) + Integer.hashCode(this.totalActionable);
    }

    public String toString() {
        return "UserBattleActionCountsModel(availablePublic=" + this.availablePublic + ", privatePending=" + this.privatePending + ", totalActionable=" + this.totalActionable + ")";
    }

    public UserBattleActionCountsModel(int i, int i2, int i3) {
        this.availablePublic = i;
        this.privatePending = i2;
        this.totalActionable = i3;
    }

    public /* synthetic */ UserBattleActionCountsModel(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }

    public final int getAvailablePublic() {
        return this.availablePublic;
    }

    public final int getPrivatePending() {
        return this.privatePending;
    }

    public final int getTotalActionable() {
        return this.totalActionable;
    }

    public final int getBadgeCount() {
        int i = this.totalActionable;
        if (i > 0) {
            return i;
        }
        int i2 = this.availablePublic + this.privatePending;
        return i2 > 0 ? i2 : RangesKt.coerceAtLeast(i, 0);
    }
}
