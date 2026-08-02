package org.betup.ui.fragment.flashbet.controller;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.fragment.flashbet.compose.FlashBetLeagueCardItem;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetCategoriesController.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lorg/betup/ui/fragment/flashbet/controller/FlashBetCategoriesState;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Loading", "Success", VastTagName.ERROR, "Lorg/betup/ui/fragment/flashbet/controller/FlashBetCategoriesState$Error;", "Lorg/betup/ui/fragment/flashbet/controller/FlashBetCategoriesState$Loading;", "Lorg/betup/ui/fragment/flashbet/controller/FlashBetCategoriesState$Success;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class FlashBetCategoriesState {
    public static final int $stable = 0;

    public /* synthetic */ FlashBetCategoriesState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: FlashBetCategoriesController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/ui/fragment/flashbet/controller/FlashBetCategoriesState$Loading;", "Lorg/betup/ui/fragment/flashbet/controller/FlashBetCategoriesState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Loading extends FlashBetCategoriesState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    private FlashBetCategoriesState() {
    }

    /* compiled from: FlashBetCategoriesController.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lorg/betup/ui/fragment/flashbet/controller/FlashBetCategoriesState$Success;", "Lorg/betup/ui/fragment/flashbet/controller/FlashBetCategoriesState;", "items", "", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetLeagueCardItem;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success extends FlashBetCategoriesState {
        public static final int $stable = 8;
        private final List<FlashBetLeagueCardItem> items;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = success.items;
            }
            return success.copy(list);
        }

        public final List<FlashBetLeagueCardItem> component1() {
            return this.items;
        }

        public final Success copy(List<FlashBetLeagueCardItem> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new Success(items);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.items, ((Success) other).items);
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            return "Success(items=" + this.items + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(List<FlashBetLeagueCardItem> items) {
            super(null);
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
        }

        public final List<FlashBetLeagueCardItem> getItems() {
            return this.items;
        }
    }

    /* compiled from: FlashBetCategoriesController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/betup/ui/fragment/flashbet/controller/FlashBetCategoriesState$Error;", "Lorg/betup/ui/fragment/flashbet/controller/FlashBetCategoriesState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Error extends FlashBetCategoriesState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }
}
