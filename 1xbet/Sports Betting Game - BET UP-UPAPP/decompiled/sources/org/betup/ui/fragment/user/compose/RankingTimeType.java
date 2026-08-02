package org.betup.ui.fragment.user.compose;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.remote.entity.user.NewUserRankingItemModel;
import org.betup.ui.fragment.user.compose.RankingCupType;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: RankingCupBaseItem.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u001e\u001f BQ\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u0082\u0001\u0003!\"#¨\u0006$"}, d2 = {"Lorg/betup/ui/fragment/user/compose/RankingTimeType;", "", "resName", "", "bronze", "Lorg/betup/ui/fragment/user/compose/RankingCupType$Bronze;", "silver", "Lorg/betup/ui/fragment/user/compose/RankingCupType$Silver;", "gold", "Lorg/betup/ui/fragment/user/compose/RankingCupType$Gold;", "fourthItem", "Lorg/betup/model/remote/entity/user/NewUserRankingItemModel;", "fiveItem", "remainingItems", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILorg/betup/ui/fragment/user/compose/RankingCupType$Bronze;Lorg/betup/ui/fragment/user/compose/RankingCupType$Silver;Lorg/betup/ui/fragment/user/compose/RankingCupType$Gold;Lorg/betup/model/remote/entity/user/NewUserRankingItemModel;Lorg/betup/model/remote/entity/user/NewUserRankingItemModel;Ljava/util/List;)V", "getResName", "()I", "getBronze", "()Lorg/betup/ui/fragment/user/compose/RankingCupType$Bronze;", "getSilver", "()Lorg/betup/ui/fragment/user/compose/RankingCupType$Silver;", "getGold", "()Lorg/betup/ui/fragment/user/compose/RankingCupType$Gold;", "getFourthItem", "()Lorg/betup/model/remote/entity/user/NewUserRankingItemModel;", "getFiveItem", "getRemainingItems", "()Ljava/util/List;", "Day", "Week", "Month", "Lorg/betup/ui/fragment/user/compose/RankingTimeType$Day;", "Lorg/betup/ui/fragment/user/compose/RankingTimeType$Month;", "Lorg/betup/ui/fragment/user/compose/RankingTimeType$Week;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class RankingTimeType {
    public static final int $stable = 8;
    private final RankingCupType.Bronze bronze;
    private final NewUserRankingItemModel fiveItem;
    private final NewUserRankingItemModel fourthItem;
    private final RankingCupType.Gold gold;
    private final List<NewUserRankingItemModel> remainingItems;
    private final int resName;
    private final RankingCupType.Silver silver;

    public /* synthetic */ RankingTimeType(int i, RankingCupType.Bronze bronze, RankingCupType.Silver silver, RankingCupType.Gold gold, NewUserRankingItemModel newUserRankingItemModel, NewUserRankingItemModel newUserRankingItemModel2, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bronze, silver, gold, newUserRankingItemModel, newUserRankingItemModel2, list);
    }

    private RankingTimeType(int i, RankingCupType.Bronze bronze, RankingCupType.Silver silver, RankingCupType.Gold gold, NewUserRankingItemModel newUserRankingItemModel, NewUserRankingItemModel newUserRankingItemModel2, List<NewUserRankingItemModel> list) {
        this.resName = i;
        this.bronze = bronze;
        this.silver = silver;
        this.gold = gold;
        this.fourthItem = newUserRankingItemModel;
        this.fiveItem = newUserRankingItemModel2;
        this.remainingItems = list;
    }

    public final int getResName() {
        return this.resName;
    }

    public final RankingCupType.Bronze getBronze() {
        return this.bronze;
    }

    public final RankingCupType.Silver getSilver() {
        return this.silver;
    }

    public final RankingCupType.Gold getGold() {
        return this.gold;
    }

    public final NewUserRankingItemModel getFourthItem() {
        return this.fourthItem;
    }

    public final NewUserRankingItemModel getFiveItem() {
        return this.fiveItem;
    }

    public /* synthetic */ RankingTimeType(int i, RankingCupType.Bronze bronze, RankingCupType.Silver silver, RankingCupType.Gold gold, NewUserRankingItemModel newUserRankingItemModel, NewUserRankingItemModel newUserRankingItemModel2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bronze, silver, gold, (i2 & 16) != 0 ? null : newUserRankingItemModel, (i2 & 32) != 0 ? null : newUserRankingItemModel2, (i2 & 64) != 0 ? CollectionsKt.emptyList() : list, null);
    }

    public final List<NewUserRankingItemModel> getRemainingItems() {
        return this.remainingItems;
    }

    /* compiled from: RankingCupBaseItem.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lorg/betup/ui/fragment/user/compose/RankingTimeType$Day;", "Lorg/betup/ui/fragment/user/compose/RankingTimeType;", "bronze", "Lorg/betup/ui/fragment/user/compose/RankingCupType$Bronze;", "silver", "Lorg/betup/ui/fragment/user/compose/RankingCupType$Silver;", "gold", "Lorg/betup/ui/fragment/user/compose/RankingCupType$Gold;", "fourthItem", "Lorg/betup/model/remote/entity/user/NewUserRankingItemModel;", "fiveItem", "remainingItems", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/user/compose/RankingCupType$Bronze;Lorg/betup/ui/fragment/user/compose/RankingCupType$Silver;Lorg/betup/ui/fragment/user/compose/RankingCupType$Gold;Lorg/betup/model/remote/entity/user/NewUserRankingItemModel;Lorg/betup/model/remote/entity/user/NewUserRankingItemModel;Ljava/util/List;)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Day extends RankingTimeType {
        public static final int $stable = 8;

        public /* synthetic */ Day(RankingCupType.Bronze bronze, RankingCupType.Silver silver, RankingCupType.Gold gold, NewUserRankingItemModel newUserRankingItemModel, NewUserRankingItemModel newUserRankingItemModel2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bronze, silver, gold, newUserRankingItemModel, newUserRankingItemModel2, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Day(RankingCupType.Bronze bronze, RankingCupType.Silver silver, RankingCupType.Gold gold, NewUserRankingItemModel newUserRankingItemModel, NewUserRankingItemModel newUserRankingItemModel2, List<NewUserRankingItemModel> remainingItems) {
            super(R.string.ranking_day_label, bronze, silver, gold, newUserRankingItemModel, newUserRankingItemModel2, remainingItems, null);
            Intrinsics.checkNotNullParameter(bronze, "bronze");
            Intrinsics.checkNotNullParameter(silver, "silver");
            Intrinsics.checkNotNullParameter(gold, "gold");
            Intrinsics.checkNotNullParameter(remainingItems, "remainingItems");
        }
    }

    /* compiled from: RankingCupBaseItem.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lorg/betup/ui/fragment/user/compose/RankingTimeType$Week;", "Lorg/betup/ui/fragment/user/compose/RankingTimeType;", "bronze", "Lorg/betup/ui/fragment/user/compose/RankingCupType$Bronze;", "silver", "Lorg/betup/ui/fragment/user/compose/RankingCupType$Silver;", "gold", "Lorg/betup/ui/fragment/user/compose/RankingCupType$Gold;", "fourthItem", "Lorg/betup/model/remote/entity/user/NewUserRankingItemModel;", "fiveItem", "remainingItems", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/user/compose/RankingCupType$Bronze;Lorg/betup/ui/fragment/user/compose/RankingCupType$Silver;Lorg/betup/ui/fragment/user/compose/RankingCupType$Gold;Lorg/betup/model/remote/entity/user/NewUserRankingItemModel;Lorg/betup/model/remote/entity/user/NewUserRankingItemModel;Ljava/util/List;)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Week extends RankingTimeType {
        public static final int $stable = 8;

        public /* synthetic */ Week(RankingCupType.Bronze bronze, RankingCupType.Silver silver, RankingCupType.Gold gold, NewUserRankingItemModel newUserRankingItemModel, NewUserRankingItemModel newUserRankingItemModel2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bronze, silver, gold, newUserRankingItemModel, newUserRankingItemModel2, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Week(RankingCupType.Bronze bronze, RankingCupType.Silver silver, RankingCupType.Gold gold, NewUserRankingItemModel newUserRankingItemModel, NewUserRankingItemModel newUserRankingItemModel2, List<NewUserRankingItemModel> remainingItems) {
            super(R.string.ranking_week_label, bronze, silver, gold, newUserRankingItemModel, newUserRankingItemModel2, remainingItems, null);
            Intrinsics.checkNotNullParameter(bronze, "bronze");
            Intrinsics.checkNotNullParameter(silver, "silver");
            Intrinsics.checkNotNullParameter(gold, "gold");
            Intrinsics.checkNotNullParameter(remainingItems, "remainingItems");
        }
    }

    /* compiled from: RankingCupBaseItem.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lorg/betup/ui/fragment/user/compose/RankingTimeType$Month;", "Lorg/betup/ui/fragment/user/compose/RankingTimeType;", "bronze", "Lorg/betup/ui/fragment/user/compose/RankingCupType$Bronze;", "silver", "Lorg/betup/ui/fragment/user/compose/RankingCupType$Silver;", "gold", "Lorg/betup/ui/fragment/user/compose/RankingCupType$Gold;", "fourthItem", "Lorg/betup/model/remote/entity/user/NewUserRankingItemModel;", "fiveItem", "remainingItems", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/user/compose/RankingCupType$Bronze;Lorg/betup/ui/fragment/user/compose/RankingCupType$Silver;Lorg/betup/ui/fragment/user/compose/RankingCupType$Gold;Lorg/betup/model/remote/entity/user/NewUserRankingItemModel;Lorg/betup/model/remote/entity/user/NewUserRankingItemModel;Ljava/util/List;)V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Month extends RankingTimeType {
        public static final int $stable = 8;

        public /* synthetic */ Month(RankingCupType.Bronze bronze, RankingCupType.Silver silver, RankingCupType.Gold gold, NewUserRankingItemModel newUserRankingItemModel, NewUserRankingItemModel newUserRankingItemModel2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bronze, silver, gold, newUserRankingItemModel, newUserRankingItemModel2, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Month(RankingCupType.Bronze bronze, RankingCupType.Silver silver, RankingCupType.Gold gold, NewUserRankingItemModel newUserRankingItemModel, NewUserRankingItemModel newUserRankingItemModel2, List<NewUserRankingItemModel> remainingItems) {
            super(R.string.ranking_month_label, bronze, silver, gold, newUserRankingItemModel, newUserRankingItemModel2, remainingItems, null);
            Intrinsics.checkNotNullParameter(bronze, "bronze");
            Intrinsics.checkNotNullParameter(silver, "silver");
            Intrinsics.checkNotNullParameter(gold, "gold");
            Intrinsics.checkNotNullParameter(remainingItems, "remainingItems");
        }
    }
}
