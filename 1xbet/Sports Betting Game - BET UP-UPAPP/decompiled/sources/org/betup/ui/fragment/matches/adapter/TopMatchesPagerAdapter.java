package org.betup.ui.fragment.matches.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.fragment.matches.TopMatchesTabFragment;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: TopMatchesPagerAdapter.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lorg/betup/ui/fragment/matches/adapter/TopMatchesPagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/fragment/app/FragmentManager;)V", "getItem", "Landroidx/fragment/app/Fragment;", "position", "", "getCount", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TopMatchesPagerAdapter extends FragmentStatePagerAdapter {
    public static final int $stable = 8;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopMatchesPagerAdapter(FragmentManager fm) {
        super(fm, 1);
        Intrinsics.checkNotNullParameter(fm, "fm");
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public Fragment getItem(int position) {
        return TopMatchesTabFragment.INSTANCE.newInstance(position);
    }
}
