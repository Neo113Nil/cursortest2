package androidx.appcompat.widget;

/* loaded from: classes3.dex */
public class TintContextWrapper extends android.content.ContextWrapper {
    private static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
    private static java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> getHighSpeedVideoFpsRanges;
    private final android.content.res.Resources getHighSpeedVideoFpsRangesFor;
    private final android.content.res.Resources.Theme getHighSpeedVideoSizes;

    public static android.content.Context wrap(android.content.Context context) {
        if (!getHighSpeedVideoFpsRangesFor(context)) {
            return context;
        }
        synchronized (getHighResolutionOutputSizeshNQ4ISI) {
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> arrayList = getHighSpeedVideoFpsRanges;
            if (arrayList == null) {
                getHighSpeedVideoFpsRanges = new java.util.ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper> weakReference = getHighSpeedVideoFpsRanges.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        getHighSpeedVideoFpsRanges.remove(size);
                    }
                }
                for (int size2 = getHighSpeedVideoFpsRanges.size() - 1; size2 >= 0; size2--) {
                    java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper> weakReference2 = getHighSpeedVideoFpsRanges.get(size2);
                    androidx.appcompat.widget.TintContextWrapper tintContextWrapper = weakReference2 != null ? weakReference2.get() : null;
                    if (tintContextWrapper != null && tintContextWrapper.getBaseContext() == context) {
                        return tintContextWrapper;
                    }
                }
            }
            androidx.appcompat.widget.TintContextWrapper tintContextWrapper2 = new androidx.appcompat.widget.TintContextWrapper(context);
            getHighSpeedVideoFpsRanges.add(new java.lang.ref.WeakReference<>(tintContextWrapper2));
            return tintContextWrapper2;
        }
    }

    private static boolean getHighSpeedVideoFpsRangesFor(android.content.Context context) {
        return ((context instanceof androidx.appcompat.widget.TintContextWrapper) || (context.getResources() instanceof androidx.appcompat.widget.TintResources) || (context.getResources() instanceof androidx.appcompat.widget.VectorEnabledTintResources) || !androidx.appcompat.widget.VectorEnabledTintResources.shouldBeUsed()) ? false : true;
    }

    private TintContextWrapper(android.content.Context context) {
        super(context);
        if (androidx.appcompat.widget.VectorEnabledTintResources.shouldBeUsed()) {
            androidx.appcompat.widget.VectorEnabledTintResources vectorEnabledTintResources = new androidx.appcompat.widget.VectorEnabledTintResources(this, context.getResources());
            this.getHighSpeedVideoFpsRangesFor = vectorEnabledTintResources;
            android.content.res.Resources.Theme newTheme = vectorEnabledTintResources.newTheme();
            this.getHighSpeedVideoSizes = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = new androidx.appcompat.widget.TintResources(this, context.getResources());
        this.getHighSpeedVideoSizes = null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
        android.content.res.Resources.Theme theme = this.getHighSpeedVideoSizes;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        android.content.res.Resources.Theme theme = this.getHighSpeedVideoSizes;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
        return this.getHighSpeedVideoFpsRangesFor.getAssets();
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
