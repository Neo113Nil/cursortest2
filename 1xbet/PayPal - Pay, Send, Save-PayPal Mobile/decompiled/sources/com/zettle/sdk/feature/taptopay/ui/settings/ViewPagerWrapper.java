package com.zettle.sdk.feature.taptopay.ui.settings;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/settings/ViewPagerWrapper;", "Landroidx/viewpager/widget/ViewPager;", "Landroidx/viewpager2/widget/ViewPager2;", "p0", "Lcom/zettle/sdk/feature/taptopay/ui/settings/ViewPagerAdapter;", "p1", "<init>", "(Landroidx/viewpager2/widget/ViewPager2;Lcom/zettle/sdk/feature/taptopay/ui/settings/ViewPagerAdapter;)V", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "", "addOnPageChangeListener", "(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V", "Landroidx/viewpager/widget/PagerAdapter;", "getAdapter", "()Landroidx/viewpager/widget/PagerAdapter;", "", "getCurrentItem", "()I", "removeOnPageChangeListener", "item", "setCurrentItem", "(I)V", "Lcom/zettle/sdk/feature/taptopay/ui/settings/ViewPagerWrapper$PagerAdapterWrapper;", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/feature/taptopay/ui/settings/ViewPagerWrapper$PagerAdapterWrapper;", "Lcom/zettle/sdk/feature/taptopay/ui/settings/ViewPagerWrapper$PageCallbackWrapper;", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/feature/taptopay/ui/settings/ViewPagerWrapper$PageCallbackWrapper;", "Camera2StreamConfigurationMap", "Landroidx/viewpager2/widget/ViewPager2;", "PageCallbackWrapper", "PagerAdapterWrapper"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ViewPagerWrapper extends androidx.viewpager.widget.ViewPager {
    private final androidx.viewpager2.widget.ViewPager2 Camera2StreamConfigurationMap;
    private final com.zettle.sdk.feature.taptopay.ui.settings.ViewPagerWrapper.PagerAdapterWrapper getHighSpeedVideoFpsRangesFor;
    private final com.zettle.sdk.feature.taptopay.ui.settings.ViewPagerWrapper.PageCallbackWrapper getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPagerWrapper(androidx.viewpager2.widget.ViewPager2 viewPager2, com.zettle.sdk.feature.taptopay.ui.settings.ViewPagerAdapter viewPagerAdapter) {
        super(viewPager2.getContext());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewPager2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewPagerAdapter, "");
        this.Camera2StreamConfigurationMap = viewPager2;
        this.getHighSpeedVideoFpsRangesFor = new com.zettle.sdk.feature.taptopay.ui.settings.ViewPagerWrapper.PagerAdapterWrapper(viewPagerAdapter);
        this.getHighSpeedVideoSizes = new com.zettle.sdk.feature.taptopay.ui.settings.ViewPagerWrapper.PageCallbackWrapper(viewPager2);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final int getCurrentItem() {
        return this.Camera2StreamConfigurationMap.getCurrentItem();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void setCurrentItem(int item) {
        this.Camera2StreamConfigurationMap.setCurrentItem(item);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final androidx.viewpager.widget.PagerAdapter getAdapter() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void addOnPageChangeListener(androidx.viewpager.widget.ViewPager.OnPageChangeListener p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoSizes.add(p0);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void removeOnPageChangeListener(androidx.viewpager.widget.ViewPager.OnPageChangeListener p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoSizes.remove(p0);
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\nR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/settings/ViewPagerWrapper$PageCallbackWrapper;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "<init>", "(Landroidx/viewpager2/widget/ViewPager2;)V", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V", "", "state", "onPageScrollStateChanged", "(I)V", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "offset", "offsetPixels", "onPageScrolled", "(IFI)V", "onPageSelected", "remove", "", "getHighSpeedVideoSizes", "Ljava/util/Set;", "getHighSpeedVideoFpsRanges", "Landroidx/viewpager2/widget/ViewPager2;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PageCallbackWrapper extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
        public static final int $stable = 8;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final androidx.viewpager2.widget.ViewPager2 getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.util.Set<androidx.viewpager.widget.ViewPager.OnPageChangeListener> getHighSpeedVideoFpsRanges;

        public PageCallbackWrapper(androidx.viewpager2.widget.ViewPager2 viewPager2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewPager2, "");
            this.getHighSpeedVideoSizes = viewPager2;
            this.getHighSpeedVideoFpsRanges = new java.util.LinkedHashSet();
        }

        public final void add(androidx.viewpager.widget.ViewPager.OnPageChangeListener listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
            this.getHighSpeedVideoFpsRanges.add(listener);
            if (this.getHighSpeedVideoFpsRanges.size() == 1) {
                this.getHighSpeedVideoSizes.registerOnPageChangeCallback(this);
            }
        }

        public final void remove(androidx.viewpager.widget.ViewPager.OnPageChangeListener listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
            this.getHighSpeedVideoFpsRanges.remove(listener);
            if (this.getHighSpeedVideoFpsRanges.size() == 0) {
                this.getHighSpeedVideoSizes.unregisterOnPageChangeCallback(this);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageSelected(int position) {
            super.onPageSelected(position);
            java.util.Iterator<T> it = this.getHighSpeedVideoFpsRanges.iterator();
            while (it.hasNext()) {
                ((androidx.viewpager.widget.ViewPager.OnPageChangeListener) it.next()).onPageSelected(position);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageScrollStateChanged(int state) {
            java.lang.Integer num;
            super.onPageScrollStateChanged(state);
            if (state == 0) {
                num = 0;
            } else if (state == 1) {
                num = 1;
            } else {
                num = state != 2 ? null : 2;
            }
            if (num != null) {
                java.util.Iterator<T> it = this.getHighSpeedVideoFpsRanges.iterator();
                while (it.hasNext()) {
                    ((androidx.viewpager.widget.ViewPager.OnPageChangeListener) it.next()).onPageScrollStateChanged(num.intValue());
                }
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageScrolled(int position, float offset, int offsetPixels) {
            java.util.Iterator<T> it = this.getHighSpeedVideoFpsRanges.iterator();
            while (it.hasNext()) {
                ((androidx.viewpager.widget.ViewPager.OnPageChangeListener) it.next()).onPageScrolled(position, offset, offsetPixels);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/settings/ViewPagerWrapper$PagerAdapterWrapper;", "Landroidx/viewpager/widget/PagerAdapter;", "Lcom/zettle/sdk/feature/taptopay/ui/settings/ViewPagerAdapter;", "p0", "<init>", "(Lcom/zettle/sdk/feature/taptopay/ui/settings/ViewPagerAdapter;)V", "", "getCount", "()I", "Landroid/view/View;", "", "p1", "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/feature/taptopay/ui/settings/ViewPagerAdapter;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class PagerAdapterWrapper extends androidx.viewpager.widget.PagerAdapter {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final com.zettle.sdk.feature.taptopay.ui.settings.ViewPagerAdapter getHighSpeedVideoSizes;

        public PagerAdapterWrapper(com.zettle.sdk.feature.taptopay.ui.settings.ViewPagerAdapter viewPagerAdapter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewPagerAdapter, "");
            this.getHighSpeedVideoSizes = viewPagerAdapter;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return this.getHighSpeedVideoSizes.getItemCount();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final boolean isViewFromObject(android.view.View p0, java.lang.Object p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            return true;
        }
    }
}
