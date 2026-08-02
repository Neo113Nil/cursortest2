package androidx.viewpager.widget;

/* loaded from: classes7.dex */
public abstract class PagerAdapter {
    public static final int POSITION_NONE = -2;
    public static final int POSITION_UNCHANGED = -1;
    android.database.DataSetObserver Camera2StreamConfigurationMap;
    private final android.database.DataSetObservable getHighSpeedVideoSizes = new android.database.DataSetObservable();

    @java.lang.Deprecated
    public void finishUpdate(android.view.View view) {
    }

    public abstract int getCount();

    public int getItemPosition(java.lang.Object obj) {
        return -1;
    }

    public java.lang.CharSequence getPageTitle(int i) {
        return null;
    }

    public float getPageWidth(int i) {
        return 1.0f;
    }

    public abstract boolean isViewFromObject(android.view.View view, java.lang.Object obj);

    public void restoreState(android.os.Parcelable parcelable, java.lang.ClassLoader classLoader) {
    }

    public android.os.Parcelable saveState() {
        return null;
    }

    @java.lang.Deprecated
    public void setPrimaryItem(android.view.View view, int i, java.lang.Object obj) {
    }

    @java.lang.Deprecated
    public void startUpdate(android.view.View view) {
    }

    public void startUpdate(android.view.ViewGroup viewGroup) {
        startUpdate((android.view.View) viewGroup);
    }

    public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i) {
        return instantiateItem((android.view.View) viewGroup, i);
    }

    public void destroyItem(android.view.ViewGroup viewGroup, int i, java.lang.Object obj) {
        destroyItem((android.view.View) viewGroup, i, obj);
    }

    public void setPrimaryItem(android.view.ViewGroup viewGroup, int i, java.lang.Object obj) {
        setPrimaryItem((android.view.View) viewGroup, i, obj);
    }

    public void finishUpdate(android.view.ViewGroup viewGroup) {
        finishUpdate((android.view.View) viewGroup);
    }

    @java.lang.Deprecated
    public java.lang.Object instantiateItem(android.view.View view, int i) {
        throw new java.lang.UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @java.lang.Deprecated
    public void destroyItem(android.view.View view, int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void notifyDataSetChanged() {
        synchronized (this) {
            android.database.DataSetObserver dataSetObserver = this.Camera2StreamConfigurationMap;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.getHighSpeedVideoSizes.notifyChanged();
    }

    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        this.getHighSpeedVideoSizes.registerObserver(dataSetObserver);
    }

    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        this.getHighSpeedVideoSizes.unregisterObserver(dataSetObserver);
    }
}
