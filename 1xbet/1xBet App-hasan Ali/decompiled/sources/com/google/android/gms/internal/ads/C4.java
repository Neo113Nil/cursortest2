package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class C4 implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7963k;

    public /* synthetic */ C4(int i) {
        this.f7963k = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        CountDownLatch countDownLatch;
        Throwable th;
        IdentityHashMap identityHashMap;
        C1667ur c1667ur;
        HashMap hashMap;
        Iterator it;
        HashSet hashSet;
        boolean z3;
        Boolean bool;
        String str;
        Activity activity;
        switch (this.f7963k) {
            case 0:
                try {
                    D4.f8160b = MessageDigest.getInstance("MD5");
                    countDownLatch = D4.f8163e;
                } catch (NoSuchAlgorithmException unused) {
                    countDownLatch = D4.f8163e;
                } catch (Throwable th2) {
                    D4.f8163e.countDown();
                    throw th2;
                }
                countDownLatch.countDown();
                return;
            case 1:
                AbstractC1803xs.n("Pinged SB successfully.");
                return;
            case 2:
                Looper.myLooper().quit();
                return;
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                Ws ws = Ws.f12113g;
                ws.getClass();
                ws.f12118b.clear();
                for (C1893zs c1893zs : Collections.unmodifiableCollection(Hs.f9492c.f9494b)) {
                }
                ws.f = System.nanoTime();
                C0802bc c0802bc = ws.f12120d;
                c0802bc.getClass();
                Hs hs = Hs.f9492c;
                HashMap hashMap2 = (HashMap) c0802bc.f12821k;
                HashMap hashMap3 = (HashMap) c0802bc.f12824n;
                HashSet hashSet2 = (HashSet) c0802bc.f12822l;
                HashSet hashSet3 = (HashSet) c0802bc.f12830t;
                HashMap hashMap4 = (HashMap) c0802bc.f12826p;
                HashMap hashMap5 = (HashMap) c0802bc.f12829s;
                HashSet hashSet4 = (HashSet) c0802bc.f12827q;
                HashSet hashSet5 = (HashSet) c0802bc.f12828r;
                if (hs != null) {
                    Iterator it2 = Collections.unmodifiableCollection(hs.f9494b).iterator();
                    while (it2.hasNext()) {
                        C1893zs c1893zs2 = (C1893zs) it2.next();
                        View view = (View) c1893zs2.f16777c.get();
                        if (!c1893zs2.f16779e || c1893zs2.f) {
                            it = it2;
                            hashSet = hashSet3;
                        } else {
                            String str2 = c1893zs2.f16780g;
                            if (view != null) {
                                it = it2;
                                if (Build.VERSION.SDK_INT >= 24) {
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
                                    if (activity != null) {
                                        z3 = activity.isInPictureInPictureMode();
                                        if (z3) {
                                            hashSet3.add(str2);
                                        }
                                        boolean z5 = z3;
                                        if (view.isAttachedToWindow()) {
                                            str = "notAttached";
                                        } else {
                                            boolean hasWindowFocus = view.hasWindowFocus();
                                            WeakHashMap weakHashMap = (WeakHashMap) c0802bc.f12825o;
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
                                            if (!bool.booleanValue() || z5) {
                                                HashSet hashSet6 = new HashSet();
                                                View view2 = view;
                                                while (view2 != null) {
                                                    String l5 = AbstractC1668us.l(view2);
                                                    if (l5 != null) {
                                                        str = l5;
                                                    } else {
                                                        hashSet6.add(view2);
                                                        Object parent = view2.getParent();
                                                        HashSet hashSet7 = hashSet3;
                                                        if (parent instanceof View) {
                                                            view2 = (View) parent;
                                                            hashSet3 = hashSet7;
                                                        } else {
                                                            hashSet3 = hashSet7;
                                                            view2 = null;
                                                        }
                                                    }
                                                }
                                                hashSet = hashSet3;
                                                hashSet2.addAll(hashSet6);
                                                str = null;
                                                if (str == null) {
                                                    hashSet4.add(str2);
                                                    hashMap3.put(view, str2);
                                                    ArrayList arrayList = c1893zs2.f16776b.f10552a;
                                                    int size = arrayList.size();
                                                    int i = 0;
                                                    while (i < size) {
                                                        Object obj = arrayList.get(i);
                                                        i++;
                                                        Ks ks = (Ks) obj;
                                                        View view3 = (View) ks.f10274a.get();
                                                        if (view3 != null) {
                                                            Vs vs = (Vs) hashMap2.get(view3);
                                                            if (vs != null) {
                                                                vs.f11963b.add(str2);
                                                            } else {
                                                                hashMap2.put(view3, new Vs(ks, str2));
                                                            }
                                                        }
                                                    }
                                                } else if (str != "noWindowFocus") {
                                                    hashSet5.add(str2);
                                                    hashMap4.put(str2, view);
                                                    hashMap5.put(str2, str);
                                                }
                                            } else {
                                                str = "noWindowFocus";
                                            }
                                        }
                                        hashSet = hashSet3;
                                        if (str == null) {
                                        }
                                    }
                                }
                                z3 = false;
                                if (z3) {
                                }
                                boolean z52 = z3;
                                if (view.isAttachedToWindow()) {
                                }
                                hashSet = hashSet3;
                                if (str == null) {
                                }
                            } else {
                                hashSet5.add(str2);
                                hashMap5.put(str2, "noAdView");
                                it2 = it2;
                            }
                        }
                        it2 = it;
                        hashSet3 = hashSet;
                    }
                }
                HashSet hashSet8 = hashSet3;
                long nanoTime = System.nanoTime();
                C1667ur c1667ur2 = ws.f12119c;
                Ps ps = (Ps) c1667ur2.f15915m;
                int size2 = hashSet5.size();
                Er er = ws.f12121e;
                if (size2 > 0) {
                    Iterator it3 = hashSet5.iterator();
                    while (it3.hasNext()) {
                        String str3 = (String) it3.next();
                        HashMap hashMap6 = hashMap2;
                        JSONObject a5 = ps.a(null);
                        View view4 = (View) hashMap4.get(str3);
                        String str4 = (String) hashMap5.get(str3);
                        if (str4 != null) {
                            hashMap = hashMap3;
                            JSONObject e3 = ((Qs) c1667ur2.f15914l).e(view4);
                            try {
                                e3.put("adSessionId", str3);
                                c1667ur = c1667ur2;
                            } catch (JSONException e5) {
                                c1667ur = c1667ur2;
                                AbstractC1668us.q("Error with setting ad session id", e5);
                            }
                            try {
                                e3.put("notVisibleReason", str4);
                            } catch (JSONException e6) {
                                AbstractC1668us.q("Error with setting not visible reason", e6);
                            }
                            Us.b(a5, e3);
                        } else {
                            c1667ur = c1667ur2;
                            hashMap = hashMap3;
                        }
                        Us.d(a5);
                        HashSet hashSet9 = new HashSet();
                        hashSet9.add(str3);
                        er.getClass();
                        Zs zs = new Zs(er, hashSet9, a5, nanoTime, 0);
                        C0905dr c0905dr = (C0905dr) er.f8618m;
                        zs.f12250a = c0905dr;
                        ArrayDeque arrayDeque = (ArrayDeque) c0905dr.f13187m;
                        arrayDeque.add(zs);
                        if (((Xs) c0905dr.f13188n) == null) {
                            Xs xs = (Xs) arrayDeque.poll();
                            c0905dr.f13188n = xs;
                            if (xs != null) {
                                xs.executeOnExecutor((ThreadPoolExecutor) c0905dr.f13186l, new Object[0]);
                                hashMap2 = hashMap6;
                                hashMap3 = hashMap;
                                c1667ur2 = c1667ur;
                            }
                        }
                        hashMap2 = hashMap6;
                        hashMap3 = hashMap;
                        c1667ur2 = c1667ur;
                    }
                }
                HashMap hashMap7 = hashMap2;
                HashMap hashMap8 = hashMap3;
                boolean z6 = false;
                if (hashSet4.size() > 0) {
                    JSONObject a6 = ps.a(null);
                    ps.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    Hs hs2 = Hs.f9492c;
                    if (hs2 != null) {
                        Collection unmodifiableCollection = Collections.unmodifiableCollection(hs2.f9494b);
                        int size3 = unmodifiableCollection.size();
                        IdentityHashMap identityHashMap2 = new IdentityHashMap(size3 + size3 + 3);
                        Iterator it4 = unmodifiableCollection.iterator();
                        while (it4.hasNext()) {
                            View view5 = (View) ((C1893zs) it4.next()).f16777c.get();
                            if (view5 != null && view5.isAttachedToWindow() && view5.isShown()) {
                                View view6 = view5;
                                while (true) {
                                    if (view6 == null) {
                                        View rootView = view5.getRootView();
                                        if (rootView != null && !identityHashMap2.containsKey(rootView)) {
                                            identityHashMap2.put(rootView, rootView);
                                            float z7 = rootView.getZ();
                                            int size4 = arrayList2.size();
                                            while (true) {
                                                if (size4 > 0) {
                                                    identityHashMap = identityHashMap2;
                                                    int i5 = size4 - 1;
                                                    if (((View) arrayList2.get(i5)).getZ() > z7) {
                                                        size4 = i5;
                                                        identityHashMap2 = identityHashMap;
                                                    }
                                                } else {
                                                    identityHashMap = identityHashMap2;
                                                }
                                            }
                                            arrayList2.add(size4, rootView);
                                            identityHashMap2 = identityHashMap;
                                        }
                                    } else if (view6.getAlpha() != 0.0f) {
                                        Object parent2 = view6.getParent();
                                        view6 = parent2 instanceof View ? (View) parent2 : null;
                                    }
                                }
                            }
                        }
                    }
                    int size5 = arrayList2.size();
                    for (int i6 = 0; i6 < size5; i6++) {
                        ws.a((View) arrayList2.get(i6), (Qs) ps.f11130k, a6, false);
                    }
                    Us.d(a6);
                    er.getClass();
                    z6 = false;
                    th = null;
                    Zs zs2 = new Zs(er, hashSet4, a6, nanoTime, 1);
                    C0905dr c0905dr2 = (C0905dr) er.f8618m;
                    zs2.f12250a = c0905dr2;
                    ArrayDeque arrayDeque2 = (ArrayDeque) c0905dr2.f13187m;
                    arrayDeque2.add(zs2);
                    if (((Xs) c0905dr2.f13188n) == null) {
                        Xs xs2 = (Xs) arrayDeque2.poll();
                        c0905dr2.f13188n = xs2;
                        if (xs2 != null) {
                            xs2.executeOnExecutor((ThreadPoolExecutor) c0905dr2.f13186l, new Object[0]);
                        }
                    }
                } else {
                    th = null;
                    er.getClass();
                    Ys ys = new Ys(er);
                    C0905dr c0905dr3 = (C0905dr) er.f8618m;
                    ys.f12250a = c0905dr3;
                    ArrayDeque arrayDeque3 = (ArrayDeque) c0905dr3.f13187m;
                    arrayDeque3.add(ys);
                    if (((Xs) c0905dr3.f13188n) == null) {
                        Xs xs3 = (Xs) arrayDeque3.poll();
                        c0905dr3.f13188n = xs3;
                        if (xs3 != null) {
                            xs3.executeOnExecutor((ThreadPoolExecutor) c0905dr3.f13186l, new Object[0]);
                        }
                    }
                }
                hashMap8.clear();
                hashMap7.clear();
                hashMap4.clear();
                hashSet2.clear();
                hashSet4.clear();
                hashSet5.clear();
                hashMap5.clear();
                c0802bc.f12823m = z6;
                hashSet8.clear();
                long nanoTime2 = System.nanoTime() - ws.f;
                ArrayList arrayList3 = ws.f12117a;
                if (arrayList3.size() > 0) {
                    Iterator it5 = arrayList3.iterator();
                    if (it5.hasNext()) {
                        if (it5.next() != null) {
                            throw new ClassCastException();
                        }
                        TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                        throw th;
                    }
                }
                Os os = Os.f11007d;
                Context context2 = (Context) os.f11008a.get();
                if (context2 == null) {
                    return;
                }
                boolean isDeviceLocked = ((KeyguardManager) context2.getSystemService("keyguard")).isDeviceLocked();
                os.a(os.f11009b, isDeviceLocked);
                os.f11010c = isDeviceLocked;
                return;
            case 7:
                Handler handler = Ws.i;
                if (handler != null) {
                    handler.post(Ws.f12115j);
                    Ws.i.postDelayed(Ws.f12116k, 200L);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
