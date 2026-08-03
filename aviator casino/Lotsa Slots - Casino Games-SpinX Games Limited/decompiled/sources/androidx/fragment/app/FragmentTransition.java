package androidx.fragment.app;

/* loaded from: classes2.dex */
class FragmentTransition {
    static final androidx.fragment.app.FragmentTransitionImpl PLATFORM_IMPL = new androidx.fragment.app.FragmentTransitionCompat21();
    static final androidx.fragment.app.FragmentTransitionImpl SUPPORT_IMPL = resolveSupportImpl();

    private static androidx.fragment.app.FragmentTransitionImpl resolveSupportImpl() {
        try {
            return (androidx.fragment.app.FragmentTransitionImpl) java.lang.Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    static java.lang.String findKeyForValue(androidx.collection.ArrayMap<java.lang.String, java.lang.String> arrayMap, java.lang.String str) {
        int size = arrayMap.getSize();
        for (int i = 0; i < size; i++) {
            if (str.equals(arrayMap.valueAt(i))) {
                return arrayMap.keyAt(i);
            }
        }
        return null;
    }

    static void retainValues(androidx.collection.ArrayMap<java.lang.String, java.lang.String> arrayMap, androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMap2) {
        for (int size = arrayMap.getSize() - 1; size >= 0; size--) {
            if (!arrayMap2.containsKey(arrayMap.valueAt(size))) {
                arrayMap.removeAt(size);
            }
        }
    }

    static void callSharedElementStartEnd(androidx.fragment.app.Fragment fragment, androidx.fragment.app.Fragment fragment2, boolean z, androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMap, boolean z2) {
        androidx.core.app.SharedElementCallback enterTransitionCallback;
        if (z) {
            enterTransitionCallback = fragment2.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int size = arrayMap == null ? 0 : arrayMap.getSize();
            for (int i = 0; i < size; i++) {
                arrayList2.add(arrayMap.keyAt(i));
                arrayList.add(arrayMap.valueAt(i));
            }
            if (z2) {
                enterTransitionCallback.onSharedElementStart(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.onSharedElementEnd(arrayList2, arrayList, null);
            }
        }
    }

    static void setViewVisibility(java.util.ArrayList<android.view.View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    static boolean supportsTransition() {
        return (PLATFORM_IMPL == null && SUPPORT_IMPL == null) ? false : true;
    }

    private FragmentTransition() {
    }
}
