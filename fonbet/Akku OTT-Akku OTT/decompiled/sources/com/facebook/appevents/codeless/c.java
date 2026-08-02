package com.facebook.appevents.codeless;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.UiThread;
import com.facebook.C0728q;
import com.facebook.appevents.codeless.a;
import com.facebook.appevents.codeless.d;
import com.facebook.appevents.codeless.internal.a;
import com.facebook.internal.E;
import com.facebook.internal.n;
import com.facebook.internal.p;
import com.facebook.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SourceDebugExtension({"SMAP\nCodelessMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodelessMatcher.kt\ncom/facebook/appevents/codeless/CodelessMatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,459:1\n1#2:460\n*E\n"})
/* loaded from: classes3.dex */
public final class c {
    public static final a Companion = new a();
    public static c f;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final Set<Activity> b;
    public final LinkedHashSet c;
    public HashSet<String> d;
    public final HashMap<Integer, HashSet<String>> e;

    public static final class a {
        @JvmStatic
        @UiThread
        public static Bundle b(com.facebook.appevents.codeless.internal.a aVar, View rootView, View hostView) {
            ArrayList a;
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            Bundle bundle = new Bundle();
            List<com.facebook.appevents.codeless.internal.b> unmodifiableList = Collections.unmodifiableList(aVar.c);
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(parameters)");
            if (unmodifiableList != null) {
                for (com.facebook.appevents.codeless.internal.b bVar : unmodifiableList) {
                    String str = bVar.b;
                    String str2 = bVar.a;
                    ArrayList arrayList = bVar.c;
                    if (str != null && str.length() > 0) {
                        bundle.putString(str2, bVar.b);
                    } else if (arrayList.size() > 0) {
                        if (Intrinsics.areEqual(bVar.d, "relative")) {
                            ViewTreeObserverOnGlobalLayoutListenerC0074c.a aVar2 = ViewTreeObserverOnGlobalLayoutListenerC0074c.Companion;
                            String simpleName = hostView.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName, "hostView.javaClass.simpleName");
                            aVar2.getClass();
                            a = ViewTreeObserverOnGlobalLayoutListenerC0074c.a.a(hostView, arrayList, 0, -1, simpleName);
                        } else {
                            ViewTreeObserverOnGlobalLayoutListenerC0074c.a aVar3 = ViewTreeObserverOnGlobalLayoutListenerC0074c.Companion;
                            String simpleName2 = rootView.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName2, "rootView.javaClass.simpleName");
                            aVar3.getClass();
                            a = ViewTreeObserverOnGlobalLayoutListenerC0074c.a.a(rootView, arrayList, 0, -1, simpleName2);
                        }
                        Iterator it = a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                b bVar2 = (b) it.next();
                                if (bVar2.a() != null) {
                                    String j = com.facebook.appevents.codeless.internal.e.j(bVar2.a());
                                    if (j.length() > 0) {
                                        bundle.putString(str2, j);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0016 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #2 {all -> 0x002c, blocks: (B:3:0x0001, B:8:0x0016, B:14:0x0028, B:15:0x002e, B:17:0x003e, B:26:0x003b, B:31:0x0010, B:11:0x0024, B:23:0x0037, B:28:0x000c), top: B:2:0x0001, inners: #0, #1, #3 }] */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final synchronized c a() {
            c cVar;
            c cVar2;
            try {
                cVar = null;
                if (!com.facebook.internal.instrument.crashshield.a.b(c.class)) {
                    try {
                        cVar2 = c.f;
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, c.class);
                    }
                    if (cVar2 == null) {
                        c cVar3 = new c();
                        if (!com.facebook.internal.instrument.crashshield.a.b(c.class)) {
                            try {
                                c.f = cVar3;
                            } catch (Throwable th2) {
                                com.facebook.internal.instrument.crashshield.a.a(th2, c.class);
                            }
                        }
                    }
                    if (!com.facebook.internal.instrument.crashshield.a.b(c.class)) {
                        try {
                            cVar = c.f;
                        } catch (Throwable th3) {
                            com.facebook.internal.instrument.crashshield.a.a(th3, c.class);
                        }
                    }
                    Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
                }
                cVar2 = null;
                if (cVar2 == null) {
                }
                if (!com.facebook.internal.instrument.crashshield.a.b(c.class)) {
                }
                Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
            } catch (Throwable th4) {
                throw th4;
            }
            return cVar;
        }
    }

    public static final class b {
        public final WeakReference<View> a;
        public final String b;

        public b(View view, String viewMapKey) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(viewMapKey, "viewMapKey");
            this.a = new WeakReference<>(view);
            this.b = viewMapKey;
        }

        public final View a() {
            WeakReference<View> weakReference = this.a;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }
    }

    @UiThread
    /* renamed from: com.facebook.appevents.codeless.c$c, reason: collision with other inner class name */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC0074c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {
        public static final a Companion = new a();
        public final WeakReference<View> a;
        public ArrayList b;
        public final HashSet<String> c;
        public final String d;

        /* renamed from: com.facebook.appevents.codeless.c$c$a */
        public static final class a {
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00c9, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r9.getClass().getSimpleName(), (java.lang.String) androidx.appcompat.view.menu.a.a(1, r12)) == false) goto L81;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00f7, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r12, r5) == false) goto L81;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0125, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r12, r6) == false) goto L81;
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x0145, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r12, r6) == false) goto L81;
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:0x016f, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r12, r1) == false) goto L81;
             */
            @JvmStatic
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static ArrayList a(View view, List path, int i, int i2, String mapKey) {
                List split$default;
                Intrinsics.checkNotNullParameter(path, "path");
                Intrinsics.checkNotNullParameter(mapKey, "mapKey");
                String str = mapKey + '.' + i2;
                ArrayList arrayList = new ArrayList();
                if (view != null) {
                    int i3 = 0;
                    if (i >= path.size()) {
                        arrayList.add(new b(view, str));
                    } else {
                        com.facebook.appevents.codeless.internal.c cVar = (com.facebook.appevents.codeless.internal.c) path.get(i);
                        String str2 = cVar.a;
                        if (Intrinsics.areEqual(str2, "..")) {
                            ViewParent parent = view.getParent();
                            if (parent instanceof ViewGroup) {
                                ArrayList b = b((ViewGroup) parent);
                                int size = b.size();
                                while (i3 < size) {
                                    arrayList.addAll(a((View) b.get(i3), path, i + 1, i3, str));
                                    i3++;
                                }
                            }
                        } else {
                            if (Intrinsics.areEqual(str2, ".")) {
                                arrayList.add(new b(view, str));
                                return arrayList;
                            }
                            int i4 = cVar.b;
                            int i5 = cVar.h;
                            if (i4 == -1 || i2 == i4) {
                                if (!Intrinsics.areEqual(view.getClass().getCanonicalName(), str2)) {
                                    if (new Regex(".*android\\..*").matches(str2)) {
                                        split$default = StringsKt__StringsKt.split$default(cVar.a, new String[]{"."}, false, 0, 6, (Object) null);
                                        if (!split$default.isEmpty()) {
                                        }
                                    }
                                }
                                if ((i5 & 1) <= 0 || cVar.c == view.getId()) {
                                    if ((i5 & 2) > 0) {
                                        String str3 = cVar.d;
                                        String j = com.facebook.appevents.codeless.internal.e.j(view);
                                        String d = E.d(E.J(j));
                                        if (!Intrinsics.areEqual(str3, j)) {
                                        }
                                    }
                                    if ((i5 & 8) > 0) {
                                        String str4 = cVar.f;
                                        String obj = view.getContentDescription() == null ? "" : view.getContentDescription().toString();
                                        String d2 = E.d(E.J(obj));
                                        if (!Intrinsics.areEqual(str4, obj)) {
                                        }
                                    }
                                    if ((i5 & 16) > 0) {
                                        String str5 = cVar.g;
                                        String h = com.facebook.appevents.codeless.internal.e.h(view);
                                        String d3 = E.d(E.J(h));
                                        if (!Intrinsics.areEqual(str5, h)) {
                                        }
                                    }
                                    if ((i5 & 4) > 0) {
                                        String str6 = cVar.e;
                                        String obj2 = view.getTag() != null ? view.getTag().toString() : "";
                                        String d4 = E.d(E.J(obj2));
                                        if (!Intrinsics.areEqual(str6, obj2)) {
                                        }
                                    }
                                    if (i == path.size() - 1) {
                                        arrayList.add(new b(view, str));
                                    }
                                }
                            }
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList b2 = b((ViewGroup) view);
                        int size2 = b2.size();
                        while (i3 < size2) {
                            arrayList.addAll(a((View) b2.get(i3), path, i + 1, i3, str));
                            i3++;
                        }
                    }
                }
                return arrayList;
            }

            public static ArrayList b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View child = viewGroup.getChildAt(i);
                    if (child.getVisibility() == 0) {
                        Intrinsics.checkNotNullExpressionValue(child, "child");
                        arrayList.add(child);
                    }
                }
                return arrayList;
            }
        }

        public ViewTreeObserverOnGlobalLayoutListenerC0074c(View view, Handler handler, HashSet<String> listenerSet, String activityName) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(listenerSet, "listenerSet");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            this.a = new WeakReference<>(view);
            this.c = listenerSet;
            this.d = activityName;
            handler.postDelayed(this, 200L);
        }

        public final void a(b bVar, View rootView, com.facebook.appevents.codeless.internal.a mapping) {
            boolean z;
            HashSet<String> hashSet;
            View hostView = bVar.a();
            if (hostView == null) {
                return;
            }
            String str = bVar.b;
            View.OnClickListener f = com.facebook.appevents.codeless.internal.e.f(hostView);
            if (f instanceof a.ViewOnClickListenerC0073a) {
                Intrinsics.checkNotNull(f, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                if (((a.ViewOnClickListenerC0073a) f).e) {
                    z = true;
                    hashSet = this.c;
                    if (!hashSet.contains(str) || z) {
                    }
                    com.facebook.appevents.codeless.a aVar = com.facebook.appevents.codeless.a.a;
                    a.ViewOnClickListenerC0073a viewOnClickListenerC0073a = null;
                    if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.codeless.a.class)) {
                        try {
                            Intrinsics.checkNotNullParameter(mapping, "mapping");
                            Intrinsics.checkNotNullParameter(rootView, "rootView");
                            Intrinsics.checkNotNullParameter(hostView, "hostView");
                            viewOnClickListenerC0073a = new a.ViewOnClickListenerC0073a(mapping, rootView, hostView);
                        } catch (Throwable th) {
                            com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.codeless.a.class);
                        }
                    }
                    hostView.setOnClickListener(viewOnClickListenerC0073a);
                    hashSet.add(str);
                    return;
                }
            }
            z = false;
            hashSet = this.c;
            if (hashSet.contains(str)) {
            }
        }

        public final void b(b bVar, View rootView, com.facebook.appevents.codeless.internal.a mapping) {
            boolean z;
            HashSet<String> hashSet;
            AdapterView hostView = (AdapterView) bVar.a();
            if (hostView == null) {
                return;
            }
            String str = bVar.b;
            AdapterView.OnItemClickListener onItemClickListener = hostView.getOnItemClickListener();
            if (onItemClickListener instanceof a.b) {
                Intrinsics.checkNotNull(onItemClickListener, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                if (((a.b) onItemClickListener).e) {
                    z = true;
                    hashSet = this.c;
                    if (!hashSet.contains(str) || z) {
                    }
                    com.facebook.appevents.codeless.a aVar = com.facebook.appevents.codeless.a.a;
                    a.b bVar2 = null;
                    if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.codeless.a.class)) {
                        try {
                            Intrinsics.checkNotNullParameter(mapping, "mapping");
                            Intrinsics.checkNotNullParameter(rootView, "rootView");
                            Intrinsics.checkNotNullParameter(hostView, "hostView");
                            bVar2 = new a.b(mapping, rootView, hostView);
                        } catch (Throwable th) {
                            com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.codeless.a.class);
                        }
                    }
                    hostView.setOnItemClickListener(bVar2);
                    hashSet.add(str);
                    return;
                }
            }
            z = false;
            hashSet = this.c;
            if (hashSet.contains(str)) {
            }
        }

        public final void c(b bVar, View rootView, com.facebook.appevents.codeless.internal.a mapping) {
            boolean z;
            HashSet<String> hashSet;
            View hostView = bVar.a();
            if (hostView == null) {
                return;
            }
            String str = bVar.b;
            View.OnTouchListener g = com.facebook.appevents.codeless.internal.e.g(hostView);
            if (g instanceof d.a) {
                Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                if (((d.a) g).e) {
                    z = true;
                    hashSet = this.c;
                    if (!hashSet.contains(str) || z) {
                    }
                    int i = d.a;
                    d.a aVar = null;
                    if (!com.facebook.internal.instrument.crashshield.a.b(d.class)) {
                        try {
                            Intrinsics.checkNotNullParameter(mapping, "mapping");
                            Intrinsics.checkNotNullParameter(rootView, "rootView");
                            Intrinsics.checkNotNullParameter(hostView, "hostView");
                            aVar = new d.a(mapping, rootView, hostView);
                        } catch (Throwable th) {
                            com.facebook.internal.instrument.crashshield.a.a(th, d.class);
                        }
                    }
                    hostView.setOnTouchListener(aVar);
                    hashSet.add(str);
                    return;
                }
            }
            z = false;
            hashSet = this.c;
            if (hashSet.contains(str)) {
            }
        }

        public final void d() {
            boolean startsWith$default;
            ArrayList arrayList = this.b;
            if (arrayList != null) {
                WeakReference<View> weakReference = this.a;
                if (weakReference.get() != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        com.facebook.appevents.codeless.internal.a aVar = (com.facebook.appevents.codeless.internal.a) arrayList.get(i);
                        View view = weakReference.get();
                        if (aVar != null) {
                            String str = aVar.d;
                            if (view != null) {
                                String str2 = this.d;
                                if (str == null || str.length() == 0 || Intrinsics.areEqual(str, str2)) {
                                    List unmodifiableList = Collections.unmodifiableList(aVar.b);
                                    Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(path)");
                                    if (unmodifiableList.size() <= 25) {
                                        Companion.getClass();
                                        Iterator it = a.a(view, unmodifiableList, 0, -1, str2).iterator();
                                        while (it.hasNext()) {
                                            b bVar = (b) it.next();
                                            try {
                                                View a2 = bVar.a();
                                                if (a2 != null) {
                                                    View a3 = com.facebook.appevents.codeless.internal.e.a(a2);
                                                    if (a3 == null || !com.facebook.appevents.codeless.internal.e.a.m(a2, a3)) {
                                                        String name = a2.getClass().getName();
                                                        Intrinsics.checkNotNullExpressionValue(name, "view.javaClass.name");
                                                        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(name, "com.facebook.react", false, 2, null);
                                                        if (!startsWith$default) {
                                                            if (!(a2 instanceof AdapterView)) {
                                                                a(bVar, view, aVar);
                                                            } else if (a2 instanceof ListView) {
                                                                b(bVar, view, aVar);
                                                            }
                                                        }
                                                    } else {
                                                        c(bVar, view, aVar);
                                                    }
                                                }
                                            } catch (Exception unused) {
                                                com.facebook.internal.instrument.crashshield.a.b(c.class);
                                                E e = E.a;
                                                w wVar = w.a;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            d();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            d();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                return;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                    return;
                }
                try {
                    n b = p.b(w.b());
                    if (b != null && b.g) {
                        a.b bVar = com.facebook.appevents.codeless.internal.a.Companion;
                        JSONArray jSONArray = b.h;
                        bVar.getClass();
                        ArrayList arrayList = new ArrayList();
                        if (jSONArray != null) {
                            try {
                                int length = jSONArray.length();
                                for (int i = 0; i < length; i++) {
                                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                                    Intrinsics.checkNotNullExpressionValue(jSONObject, "array.getJSONObject(i)");
                                    arrayList.add(a.b.a(jSONObject));
                                }
                            } catch (IllegalArgumentException | JSONException unused) {
                            }
                        }
                        this.b = arrayList;
                        View view = this.a.get();
                        if (view == null) {
                            return;
                        }
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(this);
                            viewTreeObserver.addOnScrollChangedListener(this);
                        }
                        d();
                    }
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, this);
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.a.a(th2, this);
            }
        }
    }

    public c() {
        Set<Activity> newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(WeakHashMap())");
        this.b = newSetFromMap;
        this.c = new LinkedHashSet();
        this.d = new HashSet<>();
        this.e = new HashMap<>();
    }

    @UiThread
    public final void a(Activity activity) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new C0728q("Can't add activity to CodelessMatcher on non-UI thread");
            }
            this.b.add(activity);
            this.d.clear();
            HashSet<String> hashSet = this.e.get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.d = hashSet;
            }
            if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                return;
            }
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    b();
                } else {
                    this.a.post(new androidx.core.widget.c(this, 3));
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
        }
    }

    public final void b() {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            for (Activity activity : this.b) {
                if (activity != null) {
                    View a2 = com.facebook.appevents.internal.g.a(activity);
                    String activityName = activity.getClass().getSimpleName();
                    Handler handler = this.a;
                    HashSet<String> hashSet = this.d;
                    Intrinsics.checkNotNullExpressionValue(activityName, "activityName");
                    this.c.add(new ViewTreeObserverOnGlobalLayoutListenerC0074c(a2, handler, hashSet, activityName));
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }

    @UiThread
    public final void c(Activity activity) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new C0728q("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            this.b.remove(activity);
            this.c.clear();
            HashMap<Integer, HashSet<String>> hashMap = this.e;
            Integer valueOf = Integer.valueOf(activity.hashCode());
            Object clone = this.d.clone();
            Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type java.util.HashSet<kotlin.String>{ kotlin.collections.TypeAliasesKt.HashSet<kotlin.String> }");
            hashMap.put(valueOf, (HashSet) clone);
            this.d.clear();
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }
}
