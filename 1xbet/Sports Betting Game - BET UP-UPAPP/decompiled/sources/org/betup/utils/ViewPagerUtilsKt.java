package org.betup.utils;

import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewPagerUtils.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, d2 = {"scrollPreviousTabIfExist", "", "Landroidx/viewpager/widget/ViewPager;", "scrollNextTabIfExist", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ViewPagerUtilsKt {
    public static final void scrollPreviousTabIfExist(ViewPager viewPager) {
        int currentItem;
        Intrinsics.checkNotNullParameter(viewPager, "<this>");
        int childCount = viewPager.getChildCount();
        if (childCount <= 1 || 1 > (currentItem = viewPager.getCurrentItem()) || currentItem > childCount) {
            return;
        }
        viewPager.setCurrentItem(currentItem - 1);
    }

    public static final void scrollNextTabIfExist(ViewPager viewPager) {
        int currentItem;
        Intrinsics.checkNotNullParameter(viewPager, "<this>");
        int childCount = viewPager.getChildCount();
        if (childCount <= 1 || (currentItem = viewPager.getCurrentItem()) < 0 || currentItem >= childCount) {
            return;
        }
        viewPager.setCurrentItem(currentItem + 1);
    }
}
