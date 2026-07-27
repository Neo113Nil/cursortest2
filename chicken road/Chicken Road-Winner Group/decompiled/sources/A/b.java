package A;

import D.z;
import R0.u;
import U.C0063c;
import U.C0067g;
import U.t;
import android.animation.ValueAnimator;
import android.content.Context;
import android.media.AudioManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import i1.C0337g;
import i1.C0338h;
import i1.C0341k;
import io.appmetrica.analytics.impl.C0644l9;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import l.A;
import l.C1090i;
import m0.C1116d;
import m0.C1120h;
import m0.E;
import m0.O;
import y1.AbstractAsyncTaskC1252a;
import y1.AsyncTaskC1253b;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4b;

    public /* synthetic */ b(int i3, Object obj) {
        this.f3a = i3;
        this.f4b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1090i c1090i;
        float f = 0.0f;
        switch (this.f3a) {
            case 0:
                Object obj = ((b0.j) this.f4b).f2462a;
                return;
            case 1:
                try {
                    ((Runnable) this.f4b).run();
                    return;
                } catch (Exception e3) {
                    X0.a.r("Executor", "Background execution failure.", e3);
                    return;
                }
            case 2:
                H.f fVar = (H.f) this.f4b;
                if (fVar.f475o) {
                    boolean z3 = fVar.f473m;
                    H.a aVar = fVar.f462a;
                    if (z3) {
                        fVar.f473m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f456e = currentAnimationTimeMillis;
                        aVar.f457g = -1L;
                        aVar.f = currentAnimationTimeMillis;
                        aVar.f458h = 0.5f;
                    }
                    if ((aVar.f457g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f457g + aVar.f459i) || !fVar.e()) {
                        fVar.f475o = false;
                        return;
                    }
                    boolean z4 = fVar.f474n;
                    ListView listView = fVar.f464c;
                    if (z4) {
                        fVar.f474n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a3 = aVar.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar.f;
                    aVar.f = currentAnimationTimeMillis2;
                    fVar.f477q.scrollListBy((int) (j3 * ((a3 * 4.0f) + ((-4.0f) * a3 * a3)) * aVar.f455d));
                    Field field = z.f259a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                ((P.k) this.f4b).i();
                throw null;
            case 4:
                ((R0.l) this.f4b).h();
                return;
            case 5:
                Q0.c cVar = ((R0.l) ((J1.i) this.f4b).f729b).f1209d;
                cVar.c(cVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 6:
                ((u) this.f4b).f1248j.c(new P0.b(4));
                return;
            case 7:
                throw null;
            case 8:
                C0067g c0067g = (C0067g) this.f4b;
                int i3 = c0067g.f1557v;
                ValueAnimator valueAnimator = c0067g.f1556u;
                if (i3 == 1) {
                    valueAnimator.cancel();
                } else if (i3 != 2) {
                    return;
                }
                c0067g.f1557v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 9:
                t tVar = ((RecyclerView) this.f4b).f2377D;
                if (tVar != null) {
                    C0063c c0063c = (C0063c) tVar;
                    ArrayList arrayList = c0063c.f1523e;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0063c.f1524g;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0063c.f1525h;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0063c.f;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList.clear();
                    if (!isEmpty2) {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.addAll(arrayList2);
                        ArrayList arrayList6 = c0063c.f1527j;
                        arrayList6.add(arrayList5);
                        arrayList2.clear();
                        if (!isEmpty) {
                            B0.c.n(arrayList5.get(0));
                            throw null;
                        }
                        Iterator it2 = arrayList5.iterator();
                        if (it2.hasNext()) {
                            B0.c.n(it2.next());
                            throw null;
                        }
                        arrayList5.clear();
                        arrayList6.remove(arrayList5);
                    }
                    if (!isEmpty3) {
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.addAll(arrayList3);
                        ArrayList arrayList8 = c0063c.f1528k;
                        arrayList8.add(arrayList7);
                        arrayList3.clear();
                        if (!isEmpty) {
                            B0.c.n(arrayList7.get(0));
                            throw null;
                        }
                        Iterator it3 = arrayList7.iterator();
                        if (it3.hasNext()) {
                            B0.c.n(it3.next());
                            throw null;
                        }
                        arrayList7.clear();
                        arrayList8.remove(arrayList7);
                    }
                    if (isEmpty4) {
                        return;
                    }
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.addAll(arrayList4);
                    ArrayList arrayList10 = c0063c.f1526i;
                    arrayList10.add(arrayList9);
                    arrayList4.clear();
                    if (!isEmpty || !isEmpty2 || !isEmpty3) {
                        Math.max(!isEmpty2 ? c0063c.f1583c : 0L, isEmpty3 ? 0L : c0063c.f1584d);
                        arrayList9.get(0).getClass();
                        throw new ClassCastException();
                    }
                    Iterator it4 = arrayList9.iterator();
                    if (it4.hasNext()) {
                        it4.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList9.clear();
                    arrayList10.remove(arrayList9);
                    return;
                }
                return;
            case 10:
                ((StaggeredGridLayoutManager) this.f4b).J();
                return;
            case 11:
                a1.e eVar = (a1.e) this.f4b;
                long j4 = a1.e.G((Context) eVar.f1788b).getLong("app_set_id_last_used_time", -1L);
                long j5 = j4 != -1 ? j4 + 33696000000L : -1L;
                if (j5 == -1 || System.currentTimeMillis() <= j5) {
                    return;
                }
                Context context = (Context) eVar.f1788b;
                if (!a1.e.G(context).edit().remove(CommonUrlParts.APP_SET_ID).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String valueOf2 = String.valueOf(context.getPackageName());
                Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
            case 12:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e4) {
                    if (!TextUtils.equals(e4.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e4;
                    }
                    return;
                } catch (NullPointerException e5) {
                    if (!TextUtils.equals(e5.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e5;
                    }
                    return;
                }
            case 13:
                synchronized (((C0338h) this.f4b).f5020c) {
                    C0337g c0337g = ((C0338h) this.f4b).f5021d;
                    if (c0337g != null) {
                        C0341k c0341k = (C0341k) c0337g.f5017d;
                        synchronized (c0341k.f5022a) {
                            try {
                                if (!c0341k.f5024c) {
                                    c0341k.f5024c = true;
                                    c0341k.f5025d = true;
                                    c0341k.f5023b.e(c0341k);
                                }
                            } finally {
                            }
                        }
                    }
                }
                return;
            case 14:
                A a4 = (A) this.f4b;
                a4.f9685m = null;
                a4.drawableStateChanged();
                return;
            case 15:
                ActionMenuView actionMenuView = ((Toolbar) this.f4b).f2070a;
                if (actionMenuView == null || (c1090i = actionMenuView.f1966s) == null) {
                    return;
                }
                c1090i.k();
                return;
            case 16:
                m0.z zVar = (m0.z) this.f4b;
                C1116d c1116d = zVar.f10095b;
                c1116d.t(0);
                C1120h c1120h = O.f9978l;
                c1116d.H(24, 6, c1120h);
                zVar.a(c1120h);
                return;
            case 17:
                WebSettings.getDefaultUserAgent((Context) this.f4b);
                return;
            case 18:
                r1.b bVar = (r1.b) this.f4b;
                AudioManager audioManager = bVar.f10284c;
                int streamVolume = audioManager.getStreamVolume(3);
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                bVar.f10285d.getClass();
                if (streamMaxVolume > 0 && streamVolume > 0) {
                    f = streamVolume / streamMaxVolume;
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                }
                bVar.f10287g.set(false);
                if (((Float) bVar.f.getAndSet(Float.valueOf(f))).floatValue() != f) {
                    bVar.f10282a.post(new r1.a(this, f));
                    return;
                }
                return;
            case C0644l9.f7759C /* 19 */:
                ((WebView) this.f4b).destroy();
                return;
            default:
                V1.b bVar2 = ((x1.b) this.f4b).f10554e;
                bVar2.getClass();
                AsyncTaskC1253b asyncTaskC1253b = new AsyncTaskC1253b(bVar2);
                A0.j jVar = (A0.j) bVar2.f1615c;
                asyncTaskC1253b.f10583a = jVar;
                ((ArrayDeque) jVar.f67c).add(asyncTaskC1253b);
                if (((AbstractAsyncTaskC1252a) jVar.f68d) == null) {
                    jVar.s();
                    return;
                }
                return;
        }
    }

    public b(R0.i iVar, E e3) {
        this.f3a = 7;
        this.f4b = e3;
    }

    public b(v1.d dVar) {
        this.f3a = 19;
        this.f4b = dVar.f10413g;
    }

    public b(b0.j jVar, int i3) {
        this.f3a = 0;
        this.f4b = jVar;
    }
}
