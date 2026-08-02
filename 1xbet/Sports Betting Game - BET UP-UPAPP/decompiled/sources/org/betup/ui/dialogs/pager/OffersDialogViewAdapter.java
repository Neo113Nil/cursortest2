package org.betup.ui.dialogs.pager;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import io.bidmachine.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.analytics.OfferModel;
import org.betup.model.remote.entity.analytics.PurchasePlacement;
import org.betup.ui.dialogs.offer.SpecialOfferPageFragment;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OffersDialogViewAdapter.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lorg/betup/ui/dialogs/pager/OffersDialogViewAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "models", "", "Lorg/betup/model/remote/entity/analytics/OfferModel;", "placement", "Lorg/betup/model/remote/entity/analytics/PurchasePlacement;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;Lorg/betup/model/remote/entity/analytics/PurchasePlacement;)V", "getItem", "Landroidx/fragment/app/Fragment;", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "", "getPageTitle", "", "position", "getCount", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OffersDialogViewAdapter extends FragmentStatePagerAdapter {
    public static final int $stable = 8;
    private final List<OfferModel> models;
    private final PurchasePlacement placement;

    public /* synthetic */ OffersDialogViewAdapter(FragmentManager fragmentManager, List list, PurchasePlacement purchasePlacement, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentManager, (i & 2) != 0 ? CollectionsKt.emptyList() : list, purchasePlacement);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersDialogViewAdapter(FragmentManager fragmentManager, List<OfferModel> models, PurchasePlacement placement) {
        super(fragmentManager);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.models = models;
        this.placement = placement;
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public Fragment getItem(int i) {
        return SpecialOfferPageFragment.INSTANCE.newInstance(this.models.get(i), this.placement);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public String getPageTitle(int position) {
        return String.valueOf(position);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.models.size();
    }
}
