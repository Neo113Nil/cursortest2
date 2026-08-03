package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class kq {

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static android.graphics.Rect f3090 = new android.graphics.Rect();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static android.view.View m8510(android.app.Activity activity) {
        return activity.findViewById(android.R.id.content);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static <E extends android.view.View> E m8502(android.app.Activity activity, java.lang.Class<E> cls, int i, java.util.List<java.lang.String> list, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        m8507(activity, cls, i, str, true, false, null, list, arrayList);
        if (arrayList.size() > 0) {
            return (E) arrayList.get(0);
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static <E extends android.view.View> void m8513(android.app.Activity activity, java.lang.Class<E> cls, boolean z, java.util.List<java.lang.Integer> list, java.util.List<java.lang.String> list2, java.util.List<E> list3) {
        m8507(activity, cls, -1, null, false, z, list, list2, list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ｋ, reason: contains not printable characters */
    public static <E extends android.view.View> void m8507(android.app.Activity activity, java.lang.Class<E> cls, int i, java.lang.String str, boolean z, boolean z2, java.util.List<java.lang.Integer> list, java.util.List<java.lang.String> list2, java.util.List<E> list3) {
        if (i != -1) {
            android.view.View findViewById = activity.findViewById(i);
            if (cls.isInstance(findViewById)) {
                list3.add(findViewById);
                if (z) {
                    return;
                }
            }
            m8505(findViewById, cls, str, z, z2, list, list2, list3);
            if (list3.size() > 0 && z) {
                return;
            }
        }
        android.view.View findViewById2 = activity.findViewById(android.R.id.content);
        if (findViewById2 != null) {
            m8508(findViewById2, cls, str, z, z2, list, list2, list3);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static <E extends android.view.View> void m8508(android.view.View view, java.lang.Class<E> cls, java.lang.String str, boolean z, boolean z2, java.util.List<java.lang.Integer> list, java.util.List<java.lang.String> list2, java.util.List<E> list3) {
        android.view.View view2 = view;
        while (view2.getParent() != null && (view2.getParent() instanceof android.view.ViewGroup)) {
            view2 = (android.view.View) view2.getParent();
        }
        m8505(view2, cls, str, z, z2, list, list2, list3);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static <E extends android.view.View> E m8503(android.view.View view, java.lang.Class<E> cls, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        m8514(view, cls, true, z, null, null, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (E) arrayList.get(0);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static <E extends android.view.View> void m8514(android.view.View view, java.lang.Class<E> cls, boolean z, boolean z2, java.util.List<java.lang.Integer> list, java.util.List<java.lang.String> list2, java.util.List<E> list3) {
        m8505(view, cls, null, z, z2, list, list2, list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ﻛ, reason: contains not printable characters */
    public static <E extends android.view.View> void m8505(android.view.View view, java.lang.Class<E> cls, java.lang.String str, boolean z, boolean z2, java.util.List<java.lang.Integer> list, java.util.List<java.lang.String> list2, java.util.List<E> list3) {
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                if (m8511(childAt, cls, str, list, list2)) {
                    list3.add(childAt);
                    if (z) {
                        return;
                    }
                    if (z2) {
                        m8505(childAt, cls, str, z, z2, list, list2, list3);
                    }
                } else {
                    m8505(childAt, cls, str, z, z2, list, list2, list3);
                    if (list3 != 0 && list3.size() > 0 && z) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static <E extends android.view.View> boolean m8511(android.view.View view, java.lang.Class<E> cls, java.lang.String str, java.util.List<java.lang.Integer> list, java.util.List<java.lang.String> list2) {
        if (!cls.isInstance(view)) {
            return false;
        }
        if ((m8515(list) || list.contains(java.lang.Integer.valueOf(view.getId()))) && !m8509(list2, view)) {
            return str == null || view.getClass().getName().startsWith(str);
        }
        return false;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m8515(java.util.List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean m8509(java.util.List<java.lang.String> list, android.view.View view) {
        return list != null && list.contains(view.getClass().getName());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static android.view.View m8512(android.view.View view) {
        while (view.getParent() instanceof android.view.View) {
            view = (android.view.View) view.getParent();
        }
        return view;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m8504(android.view.View view) {
        view.getHitRect(f3090);
        return view.getGlobalVisibleRect(f3090);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static android.app.Activity m8506(android.view.View view) {
        android.view.View findViewById;
        if (view != null) {
            android.view.View view2 = view;
            while (view2.getId() != 16908290 && (view2.getParent() instanceof android.view.View)) {
                view2 = (android.view.View) view2.getParent();
            }
            for (android.content.Context context = view2.getContext(); context instanceof android.content.ContextWrapper; context = ((android.content.ContextWrapper) context).getBaseContext()) {
                if (context instanceof android.app.Activity) {
                    return (android.app.Activity) context;
                }
            }
            if (view != null && (findViewById = view.findViewById(android.R.id.content)) != null && (findViewById.getContext() instanceof android.app.Activity)) {
                return (android.app.Activity) findViewById.getContext();
            }
        }
        return null;
    }
}
