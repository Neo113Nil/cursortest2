package com.google.android.material.color;

/* loaded from: classes8.dex */
final class ResourcesLoaderUtils {
    static boolean isColorResource(int i) {
        return 28 <= i && i <= 31;
    }

    private ResourcesLoaderUtils() {
    }

    static boolean addResourcesLoaderToContext(android.content.Context context, java.util.Map<java.lang.Integer, java.lang.Integer> map) {
        android.content.res.loader.ResourcesLoader create = com.google.android.material.color.ColorResourcesLoaderCreator.create(context, map);
        if (create == null) {
            return false;
        }
        context.getResources().addLoaders(create);
        return true;
    }
}
