package org.betup.ui.fragment.matches.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import org.betup.ui.fragment.matches.MatchTabProvider;

/* loaded from: classes4.dex */
public class TabsAdapter extends FragmentStatePagerAdapter {
    private MatchTabProvider provider;

    public TabsAdapter(FragmentManager fm, MatchTabProvider provider) {
        super(fm);
        this.provider = provider;
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public Fragment getItem(int position) {
        return this.provider.getFragmentForPosition(position);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.provider.getCount();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int position) {
        return this.provider.getTitle(position);
    }
}
