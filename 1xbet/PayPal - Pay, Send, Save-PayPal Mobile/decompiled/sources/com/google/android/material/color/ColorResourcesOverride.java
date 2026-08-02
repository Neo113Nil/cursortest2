package com.google.android.material.color;

/* loaded from: classes8.dex */
public interface ColorResourcesOverride {
    boolean applyIfPossible(android.content.Context context, java.util.Map<java.lang.Integer, java.lang.Integer> map);

    android.content.Context wrapContextIfPossible(android.content.Context context, java.util.Map<java.lang.Integer, java.lang.Integer> map);

    static com.google.android.material.color.ColorResourcesOverride getInstance() {
        if (30 <= android.os.Build.VERSION.SDK_INT && android.os.Build.VERSION.SDK_INT <= 33) {
            return com.google.android.material.color.ResourcesLoaderColorResourcesOverride.getInstance();
        }
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return com.google.android.material.color.ResourcesLoaderColorResourcesOverride.getInstance();
        }
        return null;
    }
}
