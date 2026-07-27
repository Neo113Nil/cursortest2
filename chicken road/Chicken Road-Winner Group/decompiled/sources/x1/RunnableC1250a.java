package x1;

import a.AbstractC0086a;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.view.View;
import b0.j;
import io.flutter.plugin.editing.k;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import o1.i;
import org.json.JSONException;
import org.json.JSONObject;
import s1.C1196c;
import s1.C1199f;
import s1.C1205l;
import y1.AbstractAsyncTaskC1252a;
import y1.AsyncTaskC1253b;
import y1.AsyncTaskC1254c;

/* renamed from: x1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1250a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10544a;

    public /* synthetic */ RunnableC1250a(int i3) {
        this.f10544a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0161  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        HashSet hashSet;
        boolean z3;
        Throwable th;
        KeyguardManager keyguardManager;
        Iterator it;
        Iterator it2;
        HashSet hashSet2;
        Activity activity;
        Boolean bool;
        String str;
        switch (this.f10544a) {
            case 0:
                b bVar = b.f10545g;
                bVar.getClass();
                bVar.f10551b.clear();
                Iterator it3 = Collections.unmodifiableCollection(C1196c.f10320c.f10322b).iterator();
                while (it3.hasNext()) {
                    ((i) it3.next()).getClass();
                }
                bVar.f = System.nanoTime();
                d dVar = bVar.f10553d;
                dVar.getClass();
                C1196c c1196c = C1196c.f10320c;
                HashMap hashMap = dVar.f10558b;
                HashMap hashMap2 = dVar.f10557a;
                HashSet hashSet3 = dVar.f10560d;
                HashSet hashSet4 = dVar.f10563h;
                HashMap hashMap3 = dVar.f10559c;
                HashMap hashMap4 = dVar.f10562g;
                HashSet hashSet5 = dVar.f10561e;
                HashSet hashSet6 = dVar.f;
                if (c1196c != null) {
                    Iterator it4 = Collections.unmodifiableCollection(c1196c.f10322b).iterator();
                    while (it4.hasNext()) {
                        i iVar = (i) it4.next();
                        View view = (View) iVar.f10171d.get();
                        if (!iVar.f || iVar.f10173g) {
                            it2 = it4;
                            hashSet2 = hashSet4;
                        } else {
                            String str2 = iVar.f10174h;
                            if (view != null) {
                                Context context = view.getContext();
                                while (true) {
                                    if (!(context instanceof ContextWrapper)) {
                                        activity = null;
                                    } else if (context instanceof Activity) {
                                        activity = (Activity) context;
                                    } else {
                                        context = ((ContextWrapper) context).getBaseContext();
                                    }
                                }
                                boolean isInPictureInPictureMode = activity != null ? activity.isInPictureInPictureMode() : false;
                                if (isInPictureInPictureMode) {
                                    hashSet4.add(str2);
                                }
                                boolean z4 = isInPictureInPictureMode;
                                if (view.isAttachedToWindow()) {
                                    boolean hasWindowFocus = view.hasWindowFocus();
                                    it2 = it4;
                                    WeakHashMap weakHashMap = dVar.f10564i;
                                    if (hasWindowFocus) {
                                        weakHashMap.remove(view);
                                        bool = Boolean.FALSE;
                                    } else if (weakHashMap.containsKey(view)) {
                                        bool = (Boolean) weakHashMap.get(view);
                                    } else {
                                        Boolean bool2 = Boolean.FALSE;
                                        weakHashMap.put(view, bool2);
                                        bool = bool2;
                                    }
                                    if (!bool.booleanValue() || z4) {
                                        HashSet hashSet7 = new HashSet();
                                        View view2 = view;
                                        while (view2 != null) {
                                            String a3 = AbstractC0086a.a(view2);
                                            if (a3 != null) {
                                                str = a3;
                                            } else {
                                                hashSet7.add(view2);
                                                Object parent = view2.getParent();
                                                HashSet hashSet8 = hashSet4;
                                                if (parent instanceof View) {
                                                    view2 = (View) parent;
                                                    hashSet4 = hashSet8;
                                                } else {
                                                    hashSet4 = hashSet8;
                                                    view2 = null;
                                                }
                                            }
                                        }
                                        hashSet2 = hashSet4;
                                        hashSet3.addAll(hashSet7);
                                        str = null;
                                        if (str != null) {
                                            hashSet5.add(str2);
                                            hashMap2.put(view, str2);
                                            Iterator it5 = iVar.f10170c.f10329a.iterator();
                                            while (it5.hasNext()) {
                                                C1199f c1199f = (C1199f) it5.next();
                                                View view3 = (View) c1199f.f10326a.get();
                                                if (view3 != null) {
                                                    c cVar = (c) hashMap.get(view3);
                                                    if (cVar != null) {
                                                        cVar.f10556b.add(str2);
                                                    } else {
                                                        hashMap.put(view3, new c(c1199f, str2));
                                                    }
                                                }
                                            }
                                        } else if (str != "noWindowFocus") {
                                            hashSet6.add(str2);
                                            hashMap3.put(str2, view);
                                            hashMap4.put(str2, str);
                                        }
                                    } else {
                                        str = "noWindowFocus";
                                    }
                                } else {
                                    str = "notAttached";
                                    it2 = it4;
                                }
                                hashSet2 = hashSet4;
                                if (str != null) {
                                }
                            } else {
                                hashSet6.add(str2);
                                hashMap4.put(str2, "noAdView");
                            }
                        }
                        hashSet4 = hashSet2;
                        it4 = it2;
                    }
                }
                HashSet hashSet9 = hashSet4;
                long nanoTime = System.nanoTime();
                V1.b bVar2 = bVar.f10552c;
                j jVar = (j) bVar2.f1615c;
                int size = hashSet6.size();
                V1.b bVar3 = bVar.f10554e;
                if (size > 0) {
                    Iterator it6 = hashSet6.iterator();
                    while (it6.hasNext()) {
                        String str3 = (String) it6.next();
                        JSONObject d3 = jVar.d(null);
                        View view4 = (View) hashMap3.get(str3);
                        HashMap hashMap5 = hashMap;
                        String str4 = (String) hashMap4.get(str3);
                        HashMap hashMap6 = hashMap2;
                        if (str4 != null) {
                            JSONObject d4 = ((k) bVar2.f1614b).d(view4);
                            try {
                                d4.put("adSessionId", str3);
                            } catch (JSONException unused) {
                            }
                            try {
                                d4.put("notVisibleReason", str4);
                            } catch (JSONException unused2) {
                            }
                            w1.b.c(d3, d4);
                        }
                        w1.b.e(d3);
                        HashSet hashSet10 = new HashSet();
                        hashSet10.add(str3);
                        bVar3.getClass();
                        AsyncTaskC1254c asyncTaskC1254c = new AsyncTaskC1254c(bVar3, hashSet10, d3, nanoTime, 0);
                        A0.j jVar2 = (A0.j) bVar3.f1615c;
                        asyncTaskC1254c.f10583a = jVar2;
                        ((ArrayDeque) jVar2.f67c).add(asyncTaskC1254c);
                        if (((AbstractAsyncTaskC1252a) jVar2.f68d) == null) {
                            jVar2.s();
                        }
                        hashMap2 = hashMap6;
                        hashMap = hashMap5;
                    }
                }
                HashMap hashMap7 = hashMap;
                HashMap hashMap8 = hashMap2;
                if (hashSet5.size() > 0) {
                    JSONObject d5 = jVar.d(null);
                    jVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    C1196c c1196c2 = C1196c.f10320c;
                    if (c1196c2 != null) {
                        Collection unmodifiableCollection = Collections.unmodifiableCollection(c1196c2.f10322b);
                        IdentityHashMap identityHashMap = new IdentityHashMap((unmodifiableCollection.size() << 1) + 3);
                        Iterator it7 = unmodifiableCollection.iterator();
                        while (it7.hasNext()) {
                            View view5 = (View) ((i) it7.next()).f10171d.get();
                            if (view5 != null && view5.isAttachedToWindow() && view5.isShown()) {
                                View view6 = view5;
                                while (true) {
                                    if (view6 == null) {
                                        View rootView = view5.getRootView();
                                        if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                            identityHashMap.put(rootView, rootView);
                                            float z5 = rootView.getZ();
                                            int size2 = arrayList.size();
                                            while (true) {
                                                if (size2 > 0) {
                                                    it = it7;
                                                    if (((View) arrayList.get(size2 - 1)).getZ() > z5) {
                                                        size2--;
                                                        it7 = it;
                                                    }
                                                } else {
                                                    it = it7;
                                                }
                                            }
                                            arrayList.add(size2, rootView);
                                            it7 = it;
                                        }
                                    } else {
                                        if (view6.getAlpha() == 0.0f) {
                                            break;
                                        }
                                        Object parent2 = view6.getParent();
                                        view6 = parent2 instanceof View ? (View) parent2 : null;
                                    }
                                }
                            }
                        }
                    }
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        bVar.a((View) it8.next(), (k) jVar.f2462a, d5, false);
                    }
                    w1.b.e(d5);
                    bVar3.getClass();
                    hashSet = hashSet6;
                    z3 = false;
                    th = null;
                    AsyncTaskC1254c asyncTaskC1254c2 = new AsyncTaskC1254c(bVar3, hashSet5, d5, nanoTime, 1);
                    A0.j jVar3 = (A0.j) bVar3.f1615c;
                    asyncTaskC1254c2.f10583a = jVar3;
                    ((ArrayDeque) jVar3.f67c).add(asyncTaskC1254c2);
                    if (((AbstractAsyncTaskC1252a) jVar3.f68d) == null) {
                        jVar3.s();
                    }
                } else {
                    hashSet = hashSet6;
                    z3 = false;
                    th = null;
                    bVar3.getClass();
                    AsyncTaskC1253b asyncTaskC1253b = new AsyncTaskC1253b(bVar3);
                    A0.j jVar4 = (A0.j) bVar3.f1615c;
                    asyncTaskC1253b.f10583a = jVar4;
                    ((ArrayDeque) jVar4.f67c).add(asyncTaskC1253b);
                    if (((AbstractAsyncTaskC1252a) jVar4.f68d) == null) {
                        jVar4.s();
                    }
                }
                hashMap8.clear();
                hashMap7.clear();
                hashMap3.clear();
                hashSet3.clear();
                hashSet5.clear();
                hashSet.clear();
                hashMap4.clear();
                dVar.f10565j = z3;
                hashSet9.clear();
                long nanoTime2 = System.nanoTime() - bVar.f;
                ArrayList arrayList2 = bVar.f10550a;
                if (arrayList2.size() > 0) {
                    Iterator it9 = arrayList2.iterator();
                    if (it9.hasNext()) {
                        if (it9.next() != null) {
                            throw new ClassCastException();
                        }
                        TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                        throw th;
                    }
                }
                C1205l c1205l = C1205l.f10339d;
                Context context2 = (Context) c1205l.f10340a.get();
                if (context2 == null || (keyguardManager = (KeyguardManager) context2.getSystemService("keyguard")) == null) {
                    return;
                }
                boolean isDeviceLocked = keyguardManager.isDeviceLocked();
                c1205l.a(c1205l.f10341b, isDeviceLocked);
                c1205l.f10342c = isDeviceLocked;
                return;
            default:
                Handler handler = b.f10547i;
                if (handler != null) {
                    handler.post(b.f10548j);
                    b.f10547i.postDelayed(b.f10549k, 200L);
                    return;
                }
                return;
        }
    }
}
