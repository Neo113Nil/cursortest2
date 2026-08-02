package org.betup.ui.dialogs.adapter;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import org.betup.R;
import org.betup.model.remote.entity.analytics.PurchasePlacement;
import org.betup.ui.fragment.shop.ShopBetcoinsFragmentK;

/* loaded from: classes2.dex */
public class ShopDialogPagerAdapter extends FragmentStatePagerAdapter {
    private final Context context;
    private final PurchasePlacement sourcePlacement;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return 1;
    }

    public ShopDialogPagerAdapter(Context context, FragmentManager fm, PurchasePlacement sourcePlacement) {
        super(fm);
        this.context = context;
        this.sourcePlacement = sourcePlacement;
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public Fragment getItem(int i) {
        return new ShopBetcoinsFragmentK();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int position) {
        return this.context.getString(R.string.betcoins);
    }
}
