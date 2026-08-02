package androidx.fragment.app;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\r\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001d\u001a\u0004\u0018\u00010\n*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u001c\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010 \u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007¢\u0006\u0004\b \u0010!R\u0013\u0010\"\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\u0006\n\u0004\b\"\u0010#R\u0013\u0010$\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\u0006\n\u0004\b$\u0010#"}, d2 = {"Landroidx/fragment/app/FragmentTransition;", "", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "inFragment", "outFragment", "", "isPop", "Landroidx/collection/ArrayMap;", "", "Landroid/view/View;", "sharedElements", "isStart", "", "callSharedElementStartEnd", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLandroidx/collection/ArrayMap;Z)V", "Landroidx/fragment/app/FragmentTransitionImpl;", "getHighSpeedVideoFpsRangesFor", "()Landroidx/fragment/app/FragmentTransitionImpl;", "", "views", "", "visibility", "setViewVisibility", "(Ljava/util/List;I)V", "supportsTransition", "()Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "findKeyForValue", "(Landroidx/collection/ArrayMap;Ljava/lang/String;)Ljava/lang/String;", "namedViews", "retainValues", "(Landroidx/collection/ArrayMap;Landroidx/collection/ArrayMap;)V", "PLATFORM_IMPL", "Landroidx/fragment/app/FragmentTransitionImpl;", "SUPPORT_IMPL"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FragmentTransition {
    public static final androidx.fragment.app.FragmentTransition INSTANCE = new androidx.fragment.app.FragmentTransition();
    public static final androidx.fragment.app.FragmentTransitionImpl PLATFORM_IMPL = new androidx.fragment.app.FragmentTransitionCompat21();
    public static final androidx.fragment.app.FragmentTransitionImpl SUPPORT_IMPL = getHighSpeedVideoFpsRangesFor();

    private FragmentTransition() {
    }

    private static androidx.fragment.app.FragmentTransitionImpl getHighSpeedVideoFpsRangesFor() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("androidx.transition.FragmentTransitionSupport");
            kotlin.jvm.internal.Intrinsics.checkNotNull(cls, "");
            return (androidx.fragment.app.FragmentTransitionImpl) cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String findKeyForValue(androidx.collection.ArrayMap<java.lang.String, java.lang.String> arrayMap, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : arrayMap.entrySet()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) ((java.util.Map.Entry) it.next()).getKey());
        }
        return (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList);
    }

    @kotlin.jvm.JvmStatic
    public static final void retainValues(androidx.collection.ArrayMap<java.lang.String, java.lang.String> arrayMap, androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMap2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayMap2, "");
        for (int camera2StreamConfigurationMap = arrayMap.getCamera2StreamConfigurationMap() - 1; camera2StreamConfigurationMap >= 0; camera2StreamConfigurationMap--) {
            if (!arrayMap2.containsKey(arrayMap.valueAt(camera2StreamConfigurationMap))) {
                arrayMap.removeAt(camera2StreamConfigurationMap);
            }
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void callSharedElementStartEnd(androidx.fragment.app.Fragment inFragment, androidx.fragment.app.Fragment outFragment, boolean isPop, androidx.collection.ArrayMap<java.lang.String, android.view.View> sharedElements, boolean isStart) {
        androidx.core.app.SharedElementCallback enterTransitionCallback;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedElements, "");
        if (isPop) {
            enterTransitionCallback = outFragment.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = inFragment.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            androidx.collection.ArrayMap<java.lang.String, android.view.View> arrayMap = sharedElements;
            java.util.ArrayList arrayList = new java.util.ArrayList(arrayMap.size());
            java.util.Iterator<java.util.Map.Entry<java.lang.String, android.view.View>> it = arrayMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayMap.size());
            java.util.Iterator<java.util.Map.Entry<java.lang.String, android.view.View>> it2 = arrayMap.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList3.add(it2.next().getKey());
            }
            java.util.ArrayList arrayList4 = arrayList3;
            if (isStart) {
                enterTransitionCallback.onSharedElementStart(arrayList4, arrayList2, null);
            } else {
                enterTransitionCallback.onSharedElementEnd(arrayList4, arrayList2, null);
            }
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void setViewVisibility(java.util.List<? extends android.view.View> views, int visibility) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(views, "");
        java.util.Iterator<T> it = views.iterator();
        while (it.hasNext()) {
            ((android.view.View) it.next()).setVisibility(visibility);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean supportsTransition() {
        return (PLATFORM_IMPL == null && SUPPORT_IMPL == null) ? false : true;
    }
}
