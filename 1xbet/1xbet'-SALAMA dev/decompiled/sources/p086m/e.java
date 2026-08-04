package p086m;

import P.U;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.A0;
import androidx.appcompat.widget.AbstractC0649w0;
import androidx.appcompat.widget.AbstractC0651x0;
import androidx.appcompat.widget.C0628l0;
import androidx.appcompat.widget.ViewTreeObserverOnGlobalLayoutListenerC0635p;
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p155w1.C1010l1;

/* JADX INFO: loaded from: classes.dex */
public final class e extends s implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public View f15092E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public View f15093F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f15094G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f15095H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f15096I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f15097J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f15098K;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f15100M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public w f15101N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ViewTreeObserver f15102O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public t f15103P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f15104Q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f15105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f15109f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f15110x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f15111y = new ArrayList();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0635p f15112z = new ViewTreeObserverOnGlobalLayoutListenerC0635p(this, 3);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0926c f15088A = new ViewOnAttachStateChangeListenerC0926c(this, 0);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C1010l1 f15089B = new C1010l1(this);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f15090C = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f15091D = 0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f15099L = false;

    public e(Context context, View view, int i7, boolean z4) {
        this.f15105b = context;
        this.f15092E = view;
        this.f15107d = i7;
        this.f15108e = z4;
        WeakHashMap weakHashMap = U.f5037a;
        this.f15094G = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f15106c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f15109f = new Handler();
    }

    @Override // p086m.x
    public final void a(k kVar, boolean z4) {
        ArrayList arrayList = this.f15111y;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (kVar == ((C0927d) arrayList.get(i7)).f15086b) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 < 0) {
            return;
        }
        int i8 = i7 + 1;
        if (i8 < arrayList.size()) {
            ((C0927d) arrayList.get(i8)).f15086b.c(false);
        }
        C0927d c0927d = (C0927d) arrayList.remove(i7);
        c0927d.f15086b.r(this);
        boolean z7 = this.f15104Q;
        A0 a2 = c0927d.f15085a;
        if (z7) {
            AbstractC0649w0.b(a2.f8397P, null);
            a2.f8397P.setAnimationStyle(0);
        }
        a2.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f15094G = ((C0927d) arrayList.get(size2 - 1)).f15087c;
        } else {
            View view = this.f15092E;
            WeakHashMap weakHashMap = U.f5037a;
            this.f15094G = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z4) {
                ((C0927d) arrayList.get(0)).f15086b.c(false);
                return;
            }
            return;
        }
        dismiss();
        w wVar = this.f15101N;
        if (wVar != null) {
            wVar.a(kVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f15102O;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f15102O.removeGlobalOnLayoutListener(this.f15112z);
            }
            this.f15102O = null;
        }
        this.f15093F.removeOnAttachStateChangeListener(this.f15088A);
        this.f15103P.onDismiss();
    }

    @Override // p086m.B
    public final boolean b() {
        ArrayList arrayList = this.f15111y;
        return arrayList.size() > 0 && ((C0927d) arrayList.get(0)).f15085a.f8397P.isShowing();
    }

    @Override // p086m.x
    public final boolean d() {
        return false;
    }

    @Override // p086m.B
    public final void dismiss() {
        ArrayList arrayList = this.f15111y;
        int size = arrayList.size();
        if (size > 0) {
            C0927d[] c0927dArr = (C0927d[]) arrayList.toArray(new C0927d[size]);
            for (int i7 = size - 1; i7 >= 0; i7--) {
                C0927d c0927d = c0927dArr[i7];
                if (c0927d.f15085a.f8397P.isShowing()) {
                    c0927d.f15085a.dismiss();
                }
            }
        }
    }

    @Override // p086m.x
    public final void e(w wVar) {
        this.f15101N = wVar;
    }

    @Override // p086m.x
    public final void f() {
        Iterator it = this.f15111y.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0927d) it.next()).f15085a.f8400c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    @Override // p086m.B
    public final C0628l0 h() {
        ArrayList arrayList = this.f15111y;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0927d) arrayList.get(arrayList.size() - 1)).f15085a.f8400c;
    }

    @Override // p086m.x
    public final boolean i(D d7) {
        for (C0927d c0927d : this.f15111y) {
            if (d7 == c0927d.f15086b) {
                c0927d.f15085a.f8400c.requestFocus();
                return true;
            }
        }
        if (!d7.hasVisibleItems()) {
            return false;
        }
        k(d7);
        w wVar = this.f15101N;
        if (wVar != null) {
            wVar.n(d7);
        }
        return true;
    }

    @Override // p086m.s
    public final void k(k kVar) {
        kVar.b(this, this.f15105b);
        if (b()) {
            u(kVar);
        } else {
            this.f15110x.add(kVar);
        }
    }

    @Override // p086m.s
    public final void m(View view) {
        if (this.f15092E != view) {
            this.f15092E = view;
            int i7 = this.f15090C;
            WeakHashMap weakHashMap = U.f5037a;
            this.f15091D = Gravity.getAbsoluteGravity(i7, view.getLayoutDirection());
        }
    }

    @Override // p086m.s
    public final void n(boolean z4) {
        this.f15099L = z4;
    }

    @Override // p086m.s
    public final void o(int i7) {
        if (this.f15090C != i7) {
            this.f15090C = i7;
            View view = this.f15092E;
            WeakHashMap weakHashMap = U.f5037a;
            this.f15091D = Gravity.getAbsoluteGravity(i7, view.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0927d c0927d;
        ArrayList arrayList = this.f15111y;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                c0927d = null;
                break;
            }
            c0927d = (C0927d) arrayList.get(i7);
            if (!c0927d.f15085a.f8397P.isShowing()) {
                break;
            } else {
                i7++;
            }
        }
        if (c0927d != null) {
            c0927d.f15086b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i7 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p086m.s
    public final void p(int i7) {
        this.f15095H = true;
        this.f15097J = i7;
    }

    @Override // p086m.s
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f15103P = (t) onDismissListener;
    }

    @Override // p086m.s
    public final void r(boolean z4) {
        this.f15100M = z4;
    }

    @Override // p086m.s
    public final void s(int i7) {
        this.f15096I = true;
        this.f15098K = i7;
    }

    @Override // p086m.B
    public final void show() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.f15110x;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((k) it.next());
        }
        arrayList.clear();
        View view = this.f15092E;
        this.f15093F = view;
        if (view != null) {
            boolean z4 = this.f15102O == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f15102O = viewTreeObserver;
            if (z4) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f15112z);
            }
            this.f15093F.addOnAttachStateChangeListener(this.f15088A);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:53:0x0107  */
    /* JADX WARN: Code duplicated, block: B:56:0x0135  */
    /* JADX WARN: Code duplicated, block: B:58:0x0141  */
    /* JADX WARN: Code duplicated, block: B:60:0x0144  */
    /* JADX WARN: Code duplicated, block: B:61:0x0146  */
    /* JADX WARN: Code duplicated, block: B:65:0x014e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0150  */
    /* JADX WARN: Code duplicated, block: B:69:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x015f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0172  */
    /* JADX WARN: Code duplicated, block: B:76:0x0196 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0198  */
    /* JADX WARN: Code duplicated, block: B:78:0x019a  */
    /* JADX WARN: Code duplicated, block: B:79:0x019e A[PHI: r5
      0x019e: PHI (r5v13 int) = (r5v5 int), (r5v15 int) binds: [B:80:0x01a0, B:78:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:88:0x01be  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cd  */
    public final void u(k kVar) {
        C0927d c0927d;
        View childAt;
        Rect rect;
        Rect rect2;
        int i7;
        PopupWindow popupWindow;
        C0628l0 c0628l0;
        int[] iArr;
        Rect rect3;
        int i8;
        boolean z4;
        int[] iArr2;
        int[] iArr3;
        int i9;
        int i10;
        int width;
        Method method;
        MenuItem item;
        h hVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f15105b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        h hVar2 = new h(kVar, layoutInflaterFrom, this.f15108e, R.layout.abc_cascading_menu_item_layout);
        if (!b() && this.f15099L) {
            hVar2.f15123c = true;
        } else if (b()) {
            hVar2.f15123c = s.t(kVar);
        }
        int iL = s.l(hVar2, context, this.f15106c);
        A0 a2 = new A0(context, null, this.f15107d, 0);
        a2.f8177S = this.f15089B;
        a2.f8388G = this;
        a2.f8397P.setOnDismissListener(this);
        a2.f8387F = this.f15092E;
        a2.f8384C = this.f15091D;
        a2.f8396O = true;
        a2.f8397P.setFocusable(true);
        a2.f8397P.setInputMethodMode(2);
        a2.p(hVar2);
        a2.q(iL);
        a2.f8384C = this.f15091D;
        ArrayList arrayList = this.f15111y;
        if (arrayList.size() > 0) {
            c0927d = (C0927d) arrayList.get(arrayList.size() - 1);
            k kVar2 = c0927d.f15086b;
            int size = kVar2.f15149f.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    item = null;
                    break;
                }
                item = kVar2.getItem(i11);
                if (item.hasSubMenu() && kVar == item.getSubMenu()) {
                    break;
                } else {
                    i11++;
                }
            }
            if (item == null) {
                childAt = null;
            } else {
                C0628l0 c0628l1 = c0927d.f15085a.f8400c;
                ListAdapter adapter = c0628l1.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    hVar = (h) headerViewListAdapter.getWrappedAdapter();
                } else {
                    hVar = (h) adapter;
                    headersCount = 0;
                }
                int count = hVar.getCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= count) {
                        i12 = -1;
                        break;
                    } else if (item == hVar.getItem(i12)) {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i12 != -1 && (firstVisiblePosition = (i12 + headersCount) - c0628l1.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0628l1.getChildCount()) {
                    childAt = c0628l1.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                i7 = Build.VERSION.SDK_INT;
                popupWindow = a2.f8397P;
                if (i7 <= 28) {
                    method = A0.f8176T;
                    if (method != null) {
                        try {
                            method.invoke(popupWindow, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    AbstractC0651x0.a(popupWindow, false);
                }
                AbstractC0649w0.a(a2.f8397P, null);
                c0628l0 = ((C0927d) arrayList.get(arrayList.size() - 1)).f15085a.f8400c;
                iArr = new int[2];
                c0628l0.getLocationOnScreen(iArr);
                rect3 = new Rect();
                this.f15093F.getWindowVisibleDisplayFrame(rect3);
                if (this.f15094G == 1) {
                    if (c0628l0.getWidth() + iArr[0] + iL > rect3.right) {
                        i8 = 0;
                    } else {
                        i8 = 1;
                    }
                } else if (iArr[0] - iL < 0) {
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if (i8 == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f15094G = i8;
                if (Build.VERSION.SDK_INT >= 26) {
                    a2.f8387F = childAt;
                    i10 = 0;
                    i9 = 0;
                } else {
                    iArr2 = new int[2];
                    this.f15092E.getLocationOnScreen(iArr2);
                    iArr3 = new int[2];
                    childAt.getLocationOnScreen(iArr3);
                    if ((this.f15091D & 7) == 5) {
                        iArr2[0] = this.f15092E.getWidth() + iArr2[0];
                        iArr3[0] = childAt.getWidth() + iArr3[0];
                    }
                    i9 = iArr3[0] - iArr2[0];
                    i10 = iArr3[1] - iArr2[1];
                }
                if ((this.f15091D & 5) == 5) {
                    if (z4) {
                        width = i9 + iL;
                    } else {
                        iL = childAt.getWidth();
                        width = i9 - iL;
                    }
                } else if (z4) {
                    width = i9 + childAt.getWidth();
                } else {
                    width = i9 - iL;
                }
                a2.f8403f = width;
                a2.f8383B = true;
                a2.f8382A = true;
                a2.k(i10);
            } else {
                if (this.f15095H) {
                    a2.f8403f = this.f15097J;
                }
                if (this.f15096I) {
                    a2.k(this.f15098K);
                }
                rect = this.f15195a;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                a2.f8395N = rect2;
            }
            arrayList.add(new C0927d(a2, kVar, this.f15094G));
            a2.show();
            C0628l0 c0628l2 = a2.f8400c;
            c0628l2.setOnKeyListener(this);
            if (c0927d == null || !this.f15100M || kVar.f15131D == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0628l2, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(kVar.f15131D);
            c0628l2.addHeaderView(frameLayout, null, false);
            a2.show();
            return;
        }
        c0927d = null;
        childAt = null;
        if (childAt != null) {
            i7 = Build.VERSION.SDK_INT;
            popupWindow = a2.f8397P;
            if (i7 <= 28) {
                method = A0.f8176T;
                if (method != null) {
                    method.invoke(popupWindow, Boolean.FALSE);
                }
            } else {
                AbstractC0651x0.a(popupWindow, false);
            }
            AbstractC0649w0.a(a2.f8397P, null);
            c0628l0 = ((C0927d) arrayList.get(arrayList.size() - 1)).f15085a.f8400c;
            iArr = new int[2];
            c0628l0.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.f15093F.getWindowVisibleDisplayFrame(rect3);
            if (this.f15094G == 1) {
                if (c0628l0.getWidth() + iArr[0] + iL > rect3.right) {
                    i8 = 0;
                } else {
                    i8 = 1;
                }
            } else if (iArr[0] - iL < 0) {
                i8 = 1;
            } else {
                i8 = 0;
            }
            if (i8 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f15094G = i8;
            if (Build.VERSION.SDK_INT >= 26) {
                a2.f8387F = childAt;
                i10 = 0;
                i9 = 0;
            } else {
                iArr2 = new int[2];
                this.f15092E.getLocationOnScreen(iArr2);
                iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f15091D & 7) == 5) {
                    iArr2[0] = this.f15092E.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                i9 = iArr3[0] - iArr2[0];
                i10 = iArr3[1] - iArr2[1];
            }
            if ((this.f15091D & 5) == 5) {
                if (z4) {
                    width = i9 + iL;
                } else {
                    iL = childAt.getWidth();
                    width = i9 - iL;
                }
            } else if (z4) {
                width = i9 + childAt.getWidth();
            } else {
                width = i9 - iL;
            }
            a2.f8403f = width;
            a2.f8383B = true;
            a2.f8382A = true;
            a2.k(i10);
        } else {
            if (this.f15095H) {
                a2.f8403f = this.f15097J;
            }
            if (this.f15096I) {
                a2.k(this.f15098K);
            }
            rect = this.f15195a;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            a2.f8395N = rect2;
        }
        arrayList.add(new C0927d(a2, kVar, this.f15094G));
        a2.show();
        C0628l0 c0628l3 = a2.f8400c;
        c0628l3.setOnKeyListener(this);
        if (c0927d == null) {
        }
    }
}
