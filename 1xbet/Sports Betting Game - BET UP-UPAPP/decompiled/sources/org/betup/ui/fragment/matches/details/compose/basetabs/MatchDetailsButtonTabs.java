package org.betup.ui.fragment.matches.details.compose.basetabs;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Dp;
import com.google.android.material.internal.ViewUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.fragment.matches.details.compose.butons.base.BaseButtonMatchUIItem;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchDetailsButtonTabs.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/basetabs/MatchDetailsButtonTabs;", "", "baseButtonMatchUIItem", "Lorg/betup/ui/fragment/matches/details/compose/butons/base/BaseButtonMatchUIItem;", "id", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/matches/details/compose/butons/base/BaseButtonMatchUIItem;I)V", "getBaseButtonMatchUIItem", "()Lorg/betup/ui/fragment/matches/details/compose/butons/base/BaseButtonMatchUIItem;", "MatchTabBetGroups", "MatchTabStatistics", "MatchTabComments", "MatchTabBattles", "MatchTabQuiz", "Lorg/betup/ui/fragment/matches/details/compose/basetabs/MatchDetailsButtonTabs$MatchTabBattles;", "Lorg/betup/ui/fragment/matches/details/compose/basetabs/MatchDetailsButtonTabs$MatchTabBetGroups;", "Lorg/betup/ui/fragment/matches/details/compose/basetabs/MatchDetailsButtonTabs$MatchTabComments;", "Lorg/betup/ui/fragment/matches/details/compose/basetabs/MatchDetailsButtonTabs$MatchTabQuiz;", "Lorg/betup/ui/fragment/matches/details/compose/basetabs/MatchDetailsButtonTabs$MatchTabStatistics;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class MatchDetailsButtonTabs {
    public static final int $stable = 0;
    private final BaseButtonMatchUIItem baseButtonMatchUIItem;

    public /* synthetic */ MatchDetailsButtonTabs(BaseButtonMatchUIItem baseButtonMatchUIItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseButtonMatchUIItem, i);
    }

    private MatchDetailsButtonTabs(BaseButtonMatchUIItem baseButtonMatchUIItem, int i) {
        this.baseButtonMatchUIItem = baseButtonMatchUIItem;
    }

    public final BaseButtonMatchUIItem getBaseButtonMatchUIItem() {
        return this.baseButtonMatchUIItem;
    }

    /* compiled from: MatchDetailsButtonTabs.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/basetabs/MatchDetailsButtonTabs$MatchTabBetGroups;", "Lorg/betup/ui/fragment/matches/details/compose/basetabs/MatchDetailsButtonTabs;", "onClick", "Lkotlin/Function0;", "", "isActive", "", "isSelected", "id", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lkotlin/jvm/functions/Function0;ZZI)V", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "()Z", "getId", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MatchTabBetGroups extends MatchDetailsButtonTabs {
        public static final int $stable = 0;
        private final int id;
        private final boolean isActive;
        private final boolean isSelected;
        private final Function0<Unit> onClick;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MatchTabBetGroups copy$default(MatchTabBetGroups matchTabBetGroups, Function0 function0, boolean z, boolean z2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                function0 = matchTabBetGroups.onClick;
            }
            if ((i2 & 2) != 0) {
                z = matchTabBetGroups.isActive;
            }
            if ((i2 & 4) != 0) {
                z2 = matchTabBetGroups.isSelected;
            }
            if ((i2 & 8) != 0) {
                i = matchTabBetGroups.id;
            }
            return matchTabBetGroups.copy(function0, z, z2, i);
        }

        public final Function0<Unit> component1() {
            return this.onClick;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component4, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public final MatchTabBetGroups copy(Function0<Unit> onClick, boolean isActive, boolean isSelected, int id) {
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            return new MatchTabBetGroups(onClick, isActive, isSelected, id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MatchTabBetGroups)) {
                return false;
            }
            MatchTabBetGroups matchTabBetGroups = (MatchTabBetGroups) other;
            return Intrinsics.areEqual(this.onClick, matchTabBetGroups.onClick) && this.isActive == matchTabBetGroups.isActive && this.isSelected == matchTabBetGroups.isSelected && this.id == matchTabBetGroups.id;
        }

        public int hashCode() {
            return (((((this.onClick.hashCode() * 31) + Boolean.hashCode(this.isActive)) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Integer.hashCode(this.id);
        }

        public String toString() {
            return "MatchTabBetGroups(onClick=" + this.onClick + ", isActive=" + this.isActive + ", isSelected=" + this.isSelected + ", id=" + this.id + ")";
        }

        public final Function0<Unit> getOnClick() {
            return this.onClick;
        }

        public final boolean isActive() {
            return this.isActive;
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        public final int getId() {
            return this.id;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MatchTabBetGroups(Function0<Unit> onClick, boolean z, boolean z2, int i) {
            super(new BaseButtonMatchUIItem(R.drawable.list_icon_selected, R.drawable.list_icon_unselected, z2, R.string.bet_groups, onClick, z, null, 0.0f, 0.0f, null, 960, null), i, null);
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.onClick = onClick;
            this.isActive = z;
            this.isSelected = z2;
            this.id = i;
        }
    }

    /* compiled from: MatchDetailsButtonTabs.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/basetabs/MatchDetailsButtonTabs$MatchTabStatistics;", "Lorg/betup/ui/fragment/matches/details/compose/basetabs/MatchDetailsButtonTabs;", "onClick", "Lkotlin/Function0;", "", "isActive", "", "isSelected", "id", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lkotlin/jvm/functions/Function0;ZZI)V", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "()Z", "getId", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MatchTabStatistics extends MatchDetailsButtonTabs {
        public static final int $stable = 0;
        private final int id;
        private final boolean isActive;
        private final boolean isSelected;
        private final Function0<Unit> onClick;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MatchTabStatistics copy$default(MatchTabStatistics matchTabStatistics, Function0 function0, boolean z, boolean z2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                function0 = matchTabStatistics.onClick;
            }
            if ((i2 & 2) != 0) {
                z = matchTabStatistics.isActive;
            }
            if ((i2 & 4) != 0) {
                z2 = matchTabStatistics.isSelected;
            }
            if ((i2 & 8) != 0) {
                i = matchTabStatistics.id;
            }
            return matchTabStatistics.copy(function0, z, z2, i);
        }

        public final Function0<Unit> component1() {
            return this.onClick;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component4, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public final MatchTabStatistics copy(Function0<Unit> onClick, boolean isActive, boolean isSelected, int id) {
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            return new MatchTabStatistics(onClick, isActive, isSelected, id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MatchTabStatistics)) {
                return false;
            }
            MatchTabStatistics matchTabStatistics = (MatchTabStatistics) other;
            return Intrinsics.areEqual(this.onClick, matchTabStatistics.onClick) && this.isActive == matchTabStatistics.isActive && this.isSelected == matchTabStatistics.isSelected && this.id == matchTabStatistics.id;
        }

        public int hashCode() {
            return (((((this.onClick.hashCode() * 31) + Boolean.hashCode(this.isActive)) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Integer.hashCode(this.id);
        }

        public String toString() {
            return "MatchTabStatistics(onClick=" + this.onClick + ", isActive=" + this.isActive + ", isSelected=" + this.isSelected + ", id=" + this.id + ")";
        }

        public final Function0<Unit> getOnClick() {
            return this.onClick;
        }

        public final boolean isActive() {
            return this.isActive;
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        public final int getId() {
            return this.id;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MatchTabStatistics(Function0<Unit> onClick, boolean z, boolean z2, int i) {
            super(new BaseButtonMatchUIItem(R.drawable.statistics_icon_new_selected, R.drawable.statistics_icon_new_unselected, z2, R.string.statistics, onClick, z, null, 0.0f, 0.0f, null, 960, null), i, null);
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.onClick = onClick;
            this.isActive = z;
            this.isSelected = z2;
            this.id = i;
        }
    }

    /* compiled from: MatchDetailsButtonTabs.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/basetabs/MatchDetailsButtonTabs$MatchTabComments;", "Lorg/betup/ui/fragment/matches/details/compose/basetabs/MatchDetailsButtonTabs;", "onClick", "Lkotlin/Function0;", "", "isActive", "", "isSelected", "id", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lkotlin/jvm/functions/Function0;ZZI)V", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "()Z", "getId", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MatchTabComments extends MatchDetailsButtonTabs {
        public static final int $stable = 0;
        private final int id;
        private final boolean isActive;
        private final boolean isSelected;
        private final Function0<Unit> onClick;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MatchTabComments copy$default(MatchTabComments matchTabComments, Function0 function0, boolean z, boolean z2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                function0 = matchTabComments.onClick;
            }
            if ((i2 & 2) != 0) {
                z = matchTabComments.isActive;
            }
            if ((i2 & 4) != 0) {
                z2 = matchTabComments.isSelected;
            }
            if ((i2 & 8) != 0) {
                i = matchTabComments.id;
            }
            return matchTabComments.copy(function0, z, z2, i);
        }

        public final Function0<Unit> component1() {
            return this.onClick;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component4, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public final MatchTabComments copy(Function0<Unit> onClick, boolean isActive, boolean isSelected, int id) {
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            return new MatchTabComments(onClick, isActive, isSelected, id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MatchTabComments)) {
                return false;
            }
            MatchTabComments matchTabComments = (MatchTabComments) other;
            return Intrinsics.areEqual(this.onClick, matchTabComments.onClick) && this.isActive == matchTabComments.isActive && this.isSelected == matchTabComments.isSelected && this.id == matchTabComments.id;
        }

        public int hashCode() {
            return (((((this.onClick.hashCode() * 31) + Boolean.hashCode(this.isActive)) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Integer.hashCode(this.id);
        }

        public String toString() {
            return "MatchTabComments(onClick=" + this.onClick + ", isActive=" + this.isActive + ", isSelected=" + this.isSelected + ", id=" + this.id + ")";
        }

        public final Function0<Unit> getOnClick() {
            return this.onClick;
        }

        public final boolean isActive() {
            return this.isActive;
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        public final int getId() {
            return this.id;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MatchTabComments(Function0<Unit> onClick, boolean z, boolean z2, int i) {
            super(new BaseButtonMatchUIItem(R.drawable.comments_icon_new_selected, R.drawable.comments_icon_new_unselected, z2, R.string.coments, onClick, z, Alignment.INSTANCE.getTopEnd(), Dp.m7774constructorimpl(-6), 0.0f, null, ViewUtils.EDGE_TO_EDGE_FLAGS, null), i, null);
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.onClick = onClick;
            this.isActive = z;
            this.isSelected = z2;
            this.id = i;
        }
    }

    /* compiled from: MatchDetailsButtonTabs.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/basetabs/MatchDetailsButtonTabs$MatchTabBattles;", "Lorg/betup/ui/fragment/matches/details/compose/basetabs/MatchDetailsButtonTabs;", "onClick", "Lkotlin/Function0;", "", "isActive", "", "isSelected", "id", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lkotlin/jvm/functions/Function0;ZZI)V", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "()Z", "getId", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MatchTabBattles extends MatchDetailsButtonTabs {
        public static final int $stable = 0;
        private final int id;
        private final boolean isActive;
        private final boolean isSelected;
        private final Function0<Unit> onClick;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MatchTabBattles copy$default(MatchTabBattles matchTabBattles, Function0 function0, boolean z, boolean z2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                function0 = matchTabBattles.onClick;
            }
            if ((i2 & 2) != 0) {
                z = matchTabBattles.isActive;
            }
            if ((i2 & 4) != 0) {
                z2 = matchTabBattles.isSelected;
            }
            if ((i2 & 8) != 0) {
                i = matchTabBattles.id;
            }
            return matchTabBattles.copy(function0, z, z2, i);
        }

        public final Function0<Unit> component1() {
            return this.onClick;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component4, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public final MatchTabBattles copy(Function0<Unit> onClick, boolean isActive, boolean isSelected, int id) {
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            return new MatchTabBattles(onClick, isActive, isSelected, id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MatchTabBattles)) {
                return false;
            }
            MatchTabBattles matchTabBattles = (MatchTabBattles) other;
            return Intrinsics.areEqual(this.onClick, matchTabBattles.onClick) && this.isActive == matchTabBattles.isActive && this.isSelected == matchTabBattles.isSelected && this.id == matchTabBattles.id;
        }

        public int hashCode() {
            return (((((this.onClick.hashCode() * 31) + Boolean.hashCode(this.isActive)) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Integer.hashCode(this.id);
        }

        public String toString() {
            return "MatchTabBattles(onClick=" + this.onClick + ", isActive=" + this.isActive + ", isSelected=" + this.isSelected + ", id=" + this.id + ")";
        }

        public final Function0<Unit> getOnClick() {
            return this.onClick;
        }

        public final boolean isActive() {
            return this.isActive;
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        public final int getId() {
            return this.id;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MatchTabBattles(Function0<Unit> onClick, boolean z, boolean z2, int i) {
            super(new BaseButtonMatchUIItem(R.drawable.battles_icon_new_selected, R.drawable.battles_icon_new_unselected, z2, R.string.battles, onClick, z, null, 0.0f, 0.0f, null, 960, null), i, null);
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.onClick = onClick;
            this.isActive = z;
            this.isSelected = z2;
            this.id = i;
        }
    }

    /* compiled from: MatchDetailsButtonTabs.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/basetabs/MatchDetailsButtonTabs$MatchTabQuiz;", "Lorg/betup/ui/fragment/matches/details/compose/basetabs/MatchDetailsButtonTabs;", "onClick", "Lkotlin/Function0;", "", "isActive", "", "isSelected", "id", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lkotlin/jvm/functions/Function0;ZZI)V", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "()Z", "getId", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MatchTabQuiz extends MatchDetailsButtonTabs {
        public static final int $stable = 0;
        private final int id;
        private final boolean isActive;
        private final boolean isSelected;
        private final Function0<Unit> onClick;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MatchTabQuiz copy$default(MatchTabQuiz matchTabQuiz, Function0 function0, boolean z, boolean z2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                function0 = matchTabQuiz.onClick;
            }
            if ((i2 & 2) != 0) {
                z = matchTabQuiz.isActive;
            }
            if ((i2 & 4) != 0) {
                z2 = matchTabQuiz.isSelected;
            }
            if ((i2 & 8) != 0) {
                i = matchTabQuiz.id;
            }
            return matchTabQuiz.copy(function0, z, z2, i);
        }

        public final Function0<Unit> component1() {
            return this.onClick;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component4, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public final MatchTabQuiz copy(Function0<Unit> onClick, boolean isActive, boolean isSelected, int id) {
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            return new MatchTabQuiz(onClick, isActive, isSelected, id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MatchTabQuiz)) {
                return false;
            }
            MatchTabQuiz matchTabQuiz = (MatchTabQuiz) other;
            return Intrinsics.areEqual(this.onClick, matchTabQuiz.onClick) && this.isActive == matchTabQuiz.isActive && this.isSelected == matchTabQuiz.isSelected && this.id == matchTabQuiz.id;
        }

        public int hashCode() {
            return (((((this.onClick.hashCode() * 31) + Boolean.hashCode(this.isActive)) * 31) + Boolean.hashCode(this.isSelected)) * 31) + Integer.hashCode(this.id);
        }

        public String toString() {
            return "MatchTabQuiz(onClick=" + this.onClick + ", isActive=" + this.isActive + ", isSelected=" + this.isSelected + ", id=" + this.id + ")";
        }

        public final Function0<Unit> getOnClick() {
            return this.onClick;
        }

        public final boolean isActive() {
            return this.isActive;
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        public final int getId() {
            return this.id;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MatchTabQuiz(Function0<Unit> onClick, boolean z, boolean z2, int i) {
            super(new BaseButtonMatchUIItem(R.drawable.puzzle_icon_new_selected, R.drawable.puzzle_icon_new_unselected, z2, R.string.quiz, onClick, z, null, 0.0f, 0.0f, null, 960, null), i, null);
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.onClick = onClick;
            this.isActive = z;
            this.isSelected = z2;
            this.id = i;
        }
    }
}
