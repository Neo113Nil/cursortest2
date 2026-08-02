package com.microblink.blinkid.fragment.overlay.fieldbyfield;

/* loaded from: classes10.dex */
class SamplePagerAdapter extends androidx.viewpager.widget.PagerAdapter {
    private final com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement[] getHighSpeedVideoFpsRanges;
    private final android.content.Context getHighSpeedVideoSizes;

    SamplePagerAdapter(android.content.Context context, com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement[] fieldByFieldElementArr) {
        this.getHighSpeedVideoFpsRanges = fieldByFieldElementArr;
        this.getHighSpeedVideoSizes = context;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(android.view.ViewGroup viewGroup, int i, java.lang.Object obj) {
        viewGroup.removeView((android.view.View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.getHighSpeedVideoFpsRanges.length;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public java.lang.CharSequence getPageTitle(int i) {
        return this.getHighSpeedVideoFpsRanges[i].getTitle(this.getHighSpeedVideoSizes);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i) {
        return new android.view.View(this.getHighSpeedVideoSizes);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        return obj == view;
    }
}
