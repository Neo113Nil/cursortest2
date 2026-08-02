package androidx.fragment.app;

import V4.C4076e;
import android.view.View;
import androidx.collection.C5132a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public static final X f42989a = new T();

    /* renamed from: b, reason: collision with root package name */
    public static final X f42990b;

    static {
        X x11;
        try {
            x11 = (X) C4076e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            x11 = null;
        }
        f42990b = x11;
    }

    public static final void a(@NotNull ComponentCallbacksC5392m inFragment, @NotNull ComponentCallbacksC5392m outFragment, boolean z11, @NotNull C5132a<String, View> sharedElements, boolean z12) {
        Intrinsics.checkNotNullParameter(inFragment, "inFragment");
        Intrinsics.checkNotNullParameter(outFragment, "outFragment");
        Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
        androidx.core.app.u enterTransitionCallback = z11 ? outFragment.getEnterTransitionCallback() : inFragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it = sharedElements.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            ArrayList arrayList2 = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it2 = sharedElements.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getKey());
            }
            if (z12) {
                enterTransitionCallback.onSharedElementStart(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.onSharedElementEnd(arrayList2, arrayList, null);
            }
        }
    }

    public static final String b(@NotNull C5132a<String, String> c5132a, @NotNull String value) {
        Intrinsics.checkNotNullParameter(c5132a, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : c5132a.entrySet()) {
            if (Intrinsics.d(entry.getValue(), value)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) C7714v.M(arrayList);
    }

    public static final void c(@NotNull C5132a<String, String> c5132a, @NotNull C5132a<String, View> namedViews) {
        Intrinsics.checkNotNullParameter(c5132a, "<this>");
        Intrinsics.checkNotNullParameter(namedViews, "namedViews");
        int size = c5132a.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!namedViews.containsKey(c5132a.n(size))) {
                c5132a.l(size);
            }
        }
    }

    public static final void d(int i11, @NotNull ArrayList views) {
        Intrinsics.checkNotNullParameter(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i11);
        }
    }

    public static final boolean e() {
        return (f42989a == null && f42990b == null) ? false : true;
    }
}
