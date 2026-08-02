package org.betup.ui.fragment.home.compose;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeMatchAdsRow.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lorg/betup/ui/fragment/home/compose/HomeAdsRecyclerHost;", "", "mainRv", "Landroidx/recyclerview/widget/RecyclerView;", "dotsRv", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView;)V", "getMainRv", "()Landroidx/recyclerview/widget/RecyclerView;", "getDotsRv", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* data */ class HomeAdsRecyclerHost {
    private final RecyclerView dotsRv;
    private final RecyclerView mainRv;

    public static /* synthetic */ HomeAdsRecyclerHost copy$default(HomeAdsRecyclerHost homeAdsRecyclerHost, RecyclerView recyclerView, RecyclerView recyclerView2, int i, Object obj) {
        if ((i & 1) != 0) {
            recyclerView = homeAdsRecyclerHost.mainRv;
        }
        if ((i & 2) != 0) {
            recyclerView2 = homeAdsRecyclerHost.dotsRv;
        }
        return homeAdsRecyclerHost.copy(recyclerView, recyclerView2);
    }

    /* renamed from: component1, reason: from getter */
    public final RecyclerView getMainRv() {
        return this.mainRv;
    }

    /* renamed from: component2, reason: from getter */
    public final RecyclerView getDotsRv() {
        return this.dotsRv;
    }

    public final HomeAdsRecyclerHost copy(RecyclerView mainRv, RecyclerView dotsRv) {
        Intrinsics.checkNotNullParameter(mainRv, "mainRv");
        Intrinsics.checkNotNullParameter(dotsRv, "dotsRv");
        return new HomeAdsRecyclerHost(mainRv, dotsRv);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeAdsRecyclerHost)) {
            return false;
        }
        HomeAdsRecyclerHost homeAdsRecyclerHost = (HomeAdsRecyclerHost) other;
        return Intrinsics.areEqual(this.mainRv, homeAdsRecyclerHost.mainRv) && Intrinsics.areEqual(this.dotsRv, homeAdsRecyclerHost.dotsRv);
    }

    public int hashCode() {
        return (this.mainRv.hashCode() * 31) + this.dotsRv.hashCode();
    }

    public String toString() {
        return "HomeAdsRecyclerHost(mainRv=" + this.mainRv + ", dotsRv=" + this.dotsRv + ")";
    }

    public HomeAdsRecyclerHost(RecyclerView mainRv, RecyclerView dotsRv) {
        Intrinsics.checkNotNullParameter(mainRv, "mainRv");
        Intrinsics.checkNotNullParameter(dotsRv, "dotsRv");
        this.mainRv = mainRv;
        this.dotsRv = dotsRv;
    }

    public final RecyclerView getMainRv() {
        return this.mainRv;
    }

    public final RecyclerView getDotsRv() {
        return this.dotsRv;
    }
}
