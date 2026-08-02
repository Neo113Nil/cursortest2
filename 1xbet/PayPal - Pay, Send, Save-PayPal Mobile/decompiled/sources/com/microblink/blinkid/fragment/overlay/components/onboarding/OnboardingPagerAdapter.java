package com.microblink.blinkid.fragment.overlay.components.onboarding;

/* loaded from: classes10.dex */
public class OnboardingPagerAdapter extends androidx.fragment.app.FragmentStatePagerAdapter {
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String[] getHighSpeedVideoFpsRanges;
    private final int[][] getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private final java.lang.String[] getInputSizeshNQ4ISI;
    private final int getOutputFormats;
    private final int getOutputMinFrameDuration;

    public OnboardingPagerAdapter(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String[] strArr, java.lang.String[] strArr2, int[] iArr, int i, int i2, int i3) {
        this(fragmentManager, 1, strArr, strArr2, iArr, i, i2, i3);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.getOutputMinFrameDuration;
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public androidx.fragment.app.Fragment getItem(int i) {
        int[] iArr = new int[1];
        int[][] iArr2 = this.getHighSpeedVideoFpsRangesFor;
        if (i < iArr2.length) {
            iArr = iArr2[i];
        }
        int[] iArr3 = iArr;
        java.lang.String[] strArr = this.getInputSizeshNQ4ISI;
        java.lang.String str = i < strArr.length ? strArr[i] : "";
        java.lang.String[] strArr2 = this.getHighSpeedVideoFpsRanges;
        return com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingFragment.newInstance(iArr3, str, this.getOutputFormats, i < strArr2.length ? strArr2[i] : "", this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public OnboardingPagerAdapter(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String[] strArr, java.lang.String[] strArr2, int[][] iArr, int i, int i2, int i3) {
        this(fragmentManager, 1, strArr, strArr2, iArr, i, i2, i3);
    }

    public OnboardingPagerAdapter(androidx.fragment.app.FragmentManager fragmentManager, int i, java.lang.String[] strArr, java.lang.String[] strArr2, int[] iArr, int i2, int i3, int i4) {
        super(fragmentManager, i);
        this.getInputSizeshNQ4ISI = strArr;
        this.getHighSpeedVideoFpsRanges = strArr2;
        this.getOutputFormats = i2;
        this.getHighSpeedVideoSizes = i3;
        this.getHighResolutionOutputSizeshNQ4ISI = i4;
        int length = strArr.length;
        length = strArr2.length > length ? strArr2.length : length;
        this.getOutputMinFrameDuration = iArr.length > length ? iArr.length : length;
    }

    public OnboardingPagerAdapter(androidx.fragment.app.FragmentManager fragmentManager, int i, java.lang.String[] strArr, java.lang.String[] strArr2, int[][] iArr, int i2, int i3, int i4) {
        super(fragmentManager, i);
        this.getInputSizeshNQ4ISI = strArr;
        this.getHighSpeedVideoFpsRanges = strArr2;
        this.getHighSpeedVideoFpsRangesFor = iArr;
        this.getOutputFormats = i2;
        this.getHighSpeedVideoSizes = i3;
        this.getHighResolutionOutputSizeshNQ4ISI = i4;
        int length = strArr.length;
        length = strArr2.length > length ? strArr2.length : length;
        this.getOutputMinFrameDuration = iArr.length > length ? iArr.length : length;
    }
}
