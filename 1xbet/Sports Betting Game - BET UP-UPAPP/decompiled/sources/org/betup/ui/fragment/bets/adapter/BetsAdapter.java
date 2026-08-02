package org.betup.ui.fragment.bets.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

/* loaded from: classes4.dex */
public class BetsAdapter extends FragmentStatePagerAdapter {
    private final BetFragmentProvider betFragmentProvider;

    public interface BetFragmentProvider {
        Fragment getFragment(int position);

        String getFragmentTitle(int position);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return 3;
    }

    public BetsAdapter(FragmentManager fm, BetFragmentProvider betFragmentProvider) {
        super(fm);
        this.betFragmentProvider = betFragmentProvider;
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public Fragment getItem(int position) {
        return this.betFragmentProvider.getFragment(position);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int position) {
        return this.betFragmentProvider.getFragmentTitle(position);
    }
}
