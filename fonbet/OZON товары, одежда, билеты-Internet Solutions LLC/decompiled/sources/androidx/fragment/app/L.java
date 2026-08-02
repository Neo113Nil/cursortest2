package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractC5434v;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

@Deprecated
/* loaded from: classes8.dex */
public abstract class L extends androidx.viewpager.widget.a {
    private final int mBehavior;
    private Q mCurTransaction = null;
    private ComponentCallbacksC5392m mCurrentPrimaryItem = null;
    private boolean mExecutingFinishUpdate;
    private final G mFragmentManager;

    public L(@NonNull G g10, int i11) {
        this.mFragmentManager = g10;
        this.mBehavior = i11;
    }

    private static String makeFragmentName(int i11, long j11) {
        return "android:switcher:" + i11 + ProductContainerDTO.RATIO_DELIMITER + j11;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(@NonNull ViewGroup viewGroup, int i11, @NonNull Object obj) {
        ComponentCallbacksC5392m componentCallbacksC5392m = (ComponentCallbacksC5392m) obj;
        if (this.mCurTransaction == null) {
            G g10 = this.mFragmentManager;
            g10.getClass();
            this.mCurTransaction = new C5380a(g10);
        }
        this.mCurTransaction.m(componentCallbacksC5392m);
        if (componentCallbacksC5392m.equals(this.mCurrentPrimaryItem)) {
            this.mCurrentPrimaryItem = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void finishUpdate(@NonNull ViewGroup viewGroup) {
        Q q11 = this.mCurTransaction;
        if (q11 != null) {
            if (!this.mExecutingFinishUpdate) {
                try {
                    this.mExecutingFinishUpdate = true;
                    q11.l();
                } finally {
                    this.mExecutingFinishUpdate = false;
                }
            }
            this.mCurTransaction = null;
        }
    }

    @NonNull
    public abstract ComponentCallbacksC5392m getItem(int i11);

    public long getItemId(int i11) {
        return i11;
    }

    @Override // androidx.viewpager.widget.a
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i11) {
        if (this.mCurTransaction == null) {
            G g10 = this.mFragmentManager;
            g10.getClass();
            this.mCurTransaction = new C5380a(g10);
        }
        long itemId = getItemId(i11);
        ComponentCallbacksC5392m g02 = this.mFragmentManager.g0(makeFragmentName(viewGroup.getId(), itemId));
        if (g02 != null) {
            this.mCurTransaction.h(g02);
        } else {
            g02 = getItem(i11);
            this.mCurTransaction.n(viewGroup.getId(), g02, makeFragmentName(viewGroup.getId(), itemId), 1);
        }
        if (g02 != this.mCurrentPrimaryItem) {
            g02.setMenuVisibility(false);
            if (this.mBehavior == 1) {
                this.mCurTransaction.u(g02, AbstractC5434v.b.STARTED);
                return g02;
            }
            g02.setUserVisibleHint(false);
        }
        return g02;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return ((ComponentCallbacksC5392m) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.a
    public Parcelable saveState() {
        return null;
    }

    @Override // androidx.viewpager.widget.a
    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i11, @NonNull Object obj) {
        ComponentCallbacksC5392m componentCallbacksC5392m = (ComponentCallbacksC5392m) obj;
        ComponentCallbacksC5392m componentCallbacksC5392m2 = this.mCurrentPrimaryItem;
        if (componentCallbacksC5392m != componentCallbacksC5392m2) {
            if (componentCallbacksC5392m2 != null) {
                componentCallbacksC5392m2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        G g10 = this.mFragmentManager;
                        g10.getClass();
                        this.mCurTransaction = new C5380a(g10);
                    }
                    this.mCurTransaction.u(this.mCurrentPrimaryItem, AbstractC5434v.b.STARTED);
                } else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            componentCallbacksC5392m.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    G g11 = this.mFragmentManager;
                    g11.getClass();
                    this.mCurTransaction = new C5380a(g11);
                }
                this.mCurTransaction.u(componentCallbacksC5392m, AbstractC5434v.b.RESUMED);
            } else {
                componentCallbacksC5392m.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = componentCallbacksC5392m;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void startUpdate(@NonNull ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
