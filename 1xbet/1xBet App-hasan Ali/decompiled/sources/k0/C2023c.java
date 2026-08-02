package k0;

import A0.RunnableC0049o;
import A0.V;
import D3.o;
import F2.i;
import O4.RunnableC0268n;
import android.R;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import i0.InterfaceC2009n;
import i0.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l4.C2062d;
import m.C2066d;
import m.MenuC2070h;
import m.MenuItemC2071i;
import m.ViewOnKeyListenerC2067e;
import n.C2111E;
import n.C2132f;
import n.C2138i;
import n.C2140j;
import n.InterfaceC2108B;
import n.InterfaceC2133f0;
import o1.C2218e;
import p4.InterfaceC2266f;
import s4.C;
import t.C2387I;
import t.M;
import t2.C2418f;
import u.AbstractC2470q;
import u.C2432C;
import u.C2471s;
import u.E0;
import u.InterfaceC2431B;
import u.r;
import u2.C2496k;
import u2.C2497l;
import v1.ThreadFactoryC2533a;
import v1.j;
import x.C2582h;

/* renamed from: k0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2023c implements k1.b, InterfaceC2133f0, InterfaceC2108B, r, E0, i, v1.i, D3.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17543k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f17544l;

    public /* synthetic */ C2023c(int i, Object obj) {
        this.f17543k = i;
        this.f17544l = obj;
    }

    public void A() {
        View view;
        View view2 = (View) this.f17544l;
        if (view2 == null) {
            return;
        }
        if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
            view2.requestFocus();
            view = view2;
        } else {
            view = view2.getRootView().findFocus();
        }
        if (view == null) {
            view = view2.getRootView().findViewById(R.id.content);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        view.post(new RunnableC0049o(14, view));
    }

    public void B(float f, float f5) {
        ((v3.e) this.f17544l).v().g(f, f5);
    }

    @Override // n.InterfaceC2133f0
    public void a(MenuC2070h menuC2070h, MenuItemC2071i menuItemC2071i) {
        ViewOnKeyListenerC2067e viewOnKeyListenerC2067e = (ViewOnKeyListenerC2067e) this.f17544l;
        viewOnKeyListenerC2067e.f17888p.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC2067e.f17890r;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC2070h == ((C2066d) arrayList.get(i)).f17873b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i5 = i + 1;
        viewOnKeyListenerC2067e.f17888p.postAtTime(new K2.e(this, i5 < arrayList.size() ? (C2066d) arrayList.get(i5) : null, menuItemC2071i, menuC2070h, 11, false), menuC2070h, SystemClock.uptimeMillis() + 200);
    }

    @Override // u.C0
    public boolean b() {
        ((m2.g) this.f17544l).getClass();
        return false;
    }

    @Override // k1.b
    public Cursor c(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f17544l;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e3) {
            Log.w("FontsProvider", "Unable to query the content provider", e3);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k1.b
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f17544l;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                V.v((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override // n.InterfaceC2133f0
    public void e(MenuC2070h menuC2070h, MenuItemC2071i menuItemC2071i) {
        ((ViewOnKeyListenerC2067e) this.f17544l).f17888p.removeCallbacksAndMessages(menuC2070h);
    }

    @Override // v1.i
    public void f(j jVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC2533a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC0268n(this, jVar, threadPoolExecutor, 2));
    }

    @Override // u.C0
    public AbstractC2470q g(long j5, AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        return ((m2.g) this.f17544l).g(j5, abstractC2470q, abstractC2470q2, abstractC2470q3);
    }

    @Override // u.r
    public InterfaceC2431B get(int i) {
        return (C2432C) this.f17544l;
    }

    @Override // F2.i
    public Object i(C2418f c2418f) {
        return C.g(new C2496k(((C2497l) this.f17544l).f20010p, 0), c2418f);
    }

    @Override // u.C0
    public long m(AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        return ((m2.g) this.f17544l).m(abstractC2470q, abstractC2470q2, abstractC2470q3);
    }

    public void o(CancellationException cancellationException) {
        R.e eVar = (R.e) this.f17544l;
        int i = eVar.f5108m;
        InterfaceC2266f[] interfaceC2266fArr = new InterfaceC2266f[i];
        for (int i5 = 0; i5 < i; i5++) {
            interfaceC2266fArr[i5] = ((C2582h) eVar.f5106k[i5]).f20768b;
        }
        for (int i6 = 0; i6 < i; i6++) {
            interfaceC2266fArr[i6].g(cancellationException);
        }
        if (eVar.f5108m != 0) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    @Override // u.C0
    public AbstractC2470q p(long j5, AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        return ((m2.g) this.f17544l).p(j5, abstractC2470q, abstractC2470q2, abstractC2470q3);
    }

    @Override // D3.a
    public Object q(o oVar) {
        v3.g gVar = (v3.g) this.f17544l;
        if (oVar.d() || oVar.f969d) {
            return oVar;
        }
        Exception a5 = oVar.a();
        if (!(a5 instanceof k3.d)) {
            return oVar;
        }
        int i = ((k3.d) a5).f17587k.f7483k;
        if (i == 43001 || i == 43002 || i == 43003 || i == 17) {
            return ((v3.e) gVar.f20440m).d();
        }
        if (i == 43000) {
            Exception exc = new Exception("Failed to get app set ID due to an internal error. Please try again later.");
            o oVar2 = new o();
            oVar2.e(exc);
            return oVar2;
        }
        if (i != 15) {
            return oVar;
        }
        Exception exc2 = new Exception("The operation to get app set ID timed out. Please try again later.");
        o oVar3 = new o();
        oVar3.e(exc2);
        return oVar3;
    }

    @Override // u.C0
    public AbstractC2470q r(AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        return ((m2.g) this.f17544l).r(abstractC2470q, abstractC2470q2, abstractC2470q3);
    }

    public C2218e s(int i) {
        return null;
    }

    public C2218e t(int i) {
        return null;
    }

    public void u() {
        View view = (View) this.f17544l;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void v(float f, float f5, float f6, float f7) {
        v3.e eVar = (v3.e) this.f17544l;
        InterfaceC2009n v4 = eVar.v();
        float intBitsToFloat = Float.intBitsToFloat((int) (eVar.A() >> 32)) - (f6 + f);
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (eVar.A() & 4294967295L)) - (f7 + f5)) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (!(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) >= 0.0f && Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) >= 0.0f)) {
            x.a("Width and height must be greater than or equal to zero");
        }
        eVar.P(floatToRawIntBits);
        v4.g(f, f5);
    }

    public void w(MenuC2070h menuC2070h) {
        C2132f c2132f;
        switch (this.f17543k) {
            case 3:
                C2023c c2023c = ((ActionMenuView) this.f17544l).f6731D;
                if (c2023c != null) {
                    c2023c.w(menuC2070h);
                    return;
                }
                return;
            default:
                Toolbar toolbar = (Toolbar) this.f17544l;
                C2140j c2140j = toolbar.f6776k.f6730C;
                if (c2140j == null || (c2132f = c2140j.f18255B) == null || !c2132f.b()) {
                    Iterator it = ((CopyOnWriteArrayList) toolbar.f6766Q.f18249l).iterator();
                    if (it.hasNext()) {
                        ((z1.d) it.next()).getClass();
                        throw null;
                    }
                    return;
                }
                return;
        }
    }

    public boolean x(int i, int i5, Bundle bundle) {
        return false;
    }

    public void y() {
        R.e eVar = (R.e) this.f17544l;
        int i = 0;
        int i5 = new C2062d(0, eVar.f5108m - 1, 1).f17852l;
        if (i5 >= 0) {
            while (true) {
                ((C2582h) eVar.f5106k[i]).f20768b.resumeWith(W3.o.f6046a);
                if (i == i5) {
                    break;
                } else {
                    i++;
                }
            }
        }
        eVar.h();
    }

    public void z(float f, float f5, long j5) {
        InterfaceC2009n v4 = ((v3.e) this.f17544l).v();
        int i = (int) (j5 >> 32);
        int i5 = (int) (j5 & 4294967295L);
        v4.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i5));
        v4.b(f, f5);
        v4.g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i5));
    }

    public C2023c(W0.c cVar) {
        this.f17543k = 9;
        this.f17544l = new C2387I(M.f19352a, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r7 == 1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041 A[LOOP:1: B:14:0x003f->B:15:0x0041, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2023c(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        int length;
        int i5;
        this.f17543k = 10;
        int length2 = fArr.length - 1;
        C2471s[][] c2471sArr = new C2471s[length2][];
        int i6 = 1;
        int i7 = 1;
        int i8 = 0;
        while (i8 < length2) {
            int i9 = iArr[i8];
            int i10 = 3;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            i10 = 4;
                            if (i9 != 4) {
                                i10 = 5;
                                if (i9 != 5) {
                                    i = i7;
                                    float[] fArr3 = fArr2[i8];
                                    length = (fArr3.length % 2) + (fArr3.length / 2);
                                    C2471s[] c2471sArr2 = new C2471s[length];
                                    for (i5 = 0; i5 < length; i5++) {
                                        int i11 = i5 * 2;
                                        float f = fArr[i8];
                                        int i12 = i8 + 1;
                                        float f5 = fArr[i12];
                                        float[] fArr4 = fArr2[i8];
                                        float f6 = fArr4[i11];
                                        int i13 = i11 + 1;
                                        float f7 = fArr4[i13];
                                        float[] fArr5 = fArr2[i12];
                                        c2471sArr2[i5] = new C2471s(i, f, f5, f6, f7, fArr5[i11], fArr5[i13]);
                                    }
                                    c2471sArr[i8] = c2471sArr2;
                                    i8++;
                                    i7 = i;
                                }
                            }
                        }
                    }
                    i6 = 2;
                    i = i6;
                    float[] fArr32 = fArr2[i8];
                    length = (fArr32.length % 2) + (fArr32.length / 2);
                    C2471s[] c2471sArr22 = new C2471s[length];
                    while (i5 < length) {
                    }
                    c2471sArr[i8] = c2471sArr22;
                    i8++;
                    i7 = i;
                }
                i6 = 1;
                i = i6;
                float[] fArr322 = fArr2[i8];
                length = (fArr322.length % 2) + (fArr322.length / 2);
                C2471s[] c2471sArr222 = new C2471s[length];
                while (i5 < length) {
                }
                c2471sArr[i8] = c2471sArr222;
                i8++;
                i7 = i;
            }
            i = i10;
            float[] fArr3222 = fArr2[i8];
            length = (fArr3222.length % 2) + (fArr3222.length / 2);
            C2471s[] c2471sArr2222 = new C2471s[length];
            while (i5 < length) {
            }
            c2471sArr[i8] = c2471sArr2222;
            i8++;
            i7 = i;
        }
        this.f17544l = c2471sArr;
    }

    public C2023c(C2111E c2111e) {
        this.f17543k = 17;
        this.f17544l = new x1.g(c2111e);
    }

    public C2023c(int i) {
        this.f17543k = i;
        switch (i) {
            case 8:
                this.f17544l = new LinkedHashMap(0, 0.75f, true);
                break;
            case 16:
                this.f17544l = new R.e(new C2582h[16]);
                break;
            default:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f17544l = new o1.g(this);
                    break;
                } else {
                    this.f17544l = new o1.f(this);
                    break;
                }
        }
    }

    public C2023c(Context context) {
        this.f17543k = 14;
        this.f17544l = context.getApplicationContext();
    }

    public C2023c(Context context, Uri uri) {
        this.f17543k = 1;
        this.f17544l = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public C2023c(float f, float f5, AbstractC2470q abstractC2470q) {
        r c2023c;
        this.f17543k = 12;
        if (abstractC2470q != null) {
            c2023c = new C2138i(f, f5, abstractC2470q);
        } else {
            c2023c = new C2023c(f, f5);
        }
        this.f17544l = new m2.g(c2023c);
    }

    public C2023c(float f, float f5) {
        this.f17543k = 11;
        this.f17544l = new C2432C(f, f5, 0.01f);
    }

    @Override // n.InterfaceC2108B
    public void d(int i) {
    }

    @Override // n.InterfaceC2108B
    public void h(int i) {
    }

    @Override // n.InterfaceC2108B
    public void j(int i, float f) {
    }

    public void k(int i, C2218e c2218e, String str, Bundle bundle) {
    }
}
