package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4297a {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final Rect f147;

    static {
        StringFog.decrypt("0tzt/iPGEdP3\n", "hLWIiXayeL8=\n");
        f147 = new Rect();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m5341(View view, Class cls, String str, boolean z, boolean z2, List list, List list2, ArrayList arrayList) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (m5346(childAt, cls, str, list, list2)) {
                    arrayList.add(childAt);
                    if (z) {
                        return;
                    }
                    if (z2) {
                        m5341(childAt, cls, str, z, z2, list, list2, arrayList);
                    }
                } else {
                    m5341(childAt, cls, str, z, z2, list, list2, arrayList);
                    if (arrayList != null && arrayList.size() > 0 && z) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5344(Activity activity, Class cls, int i, String str, boolean z, boolean z2, List list, List list2, ArrayList arrayList) {
        if (i != -1) {
            View findViewById = activity.findViewById(i);
            if (cls.isInstance(findViewById)) {
                arrayList.add(findViewById);
                if (z) {
                    return;
                }
            }
            m5341(findViewById, cls, str, z, z2, list, list2, arrayList);
            if (arrayList.size() > 0 && z) {
                return;
            }
        }
        View findViewById2 = activity.findViewById(R.id.content);
        if (findViewById2 != null) {
            m5345(findViewById2, cls, str, z, z2, list, list2, arrayList);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5345(View view, Class cls, String str, boolean z, boolean z2, List list, List list2, ArrayList arrayList) {
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            m5345((View) view.getParent(), cls, str, z, z2, list, list2, arrayList);
        } else {
            m5341(view, cls, str, z, z2, list, list2, arrayList);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m5346(View view, Class cls, String str, List list, List list2) {
        return cls.isInstance(view) && (list == null || list.isEmpty() || list.contains(Integer.valueOf(view.getId()))) && ((list2 == null || !list2.contains(view.getClass().getName())) && (str == null || view.getClass().getName().startsWith(str)));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ArrayList m5343(ArrayList arrayList, ArrayList arrayList2) {
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        newSetFromMap.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) ((WeakReference) it.next()).get();
            if (view == null || !newSetFromMap.contains(view)) {
                it.remove();
                if (view != null) {
                    arrayList3.add(view);
                }
            }
        }
        return arrayList3;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Activity m5342(View view) {
        if (view == null) {
            return null;
        }
        View view2 = view;
        while (view2.getId() != 16908290 && (view2.getParent() instanceof View)) {
            view2 = (View) view2.getParent();
        }
        for (Context context = view2.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        View findViewById = view.findViewById(R.id.content);
        if (findViewById == null || !(findViewById.getContext() instanceof Activity)) {
            return null;
        }
        return (Activity) findViewById.getContext();
    }
}
