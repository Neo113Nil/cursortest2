package m;

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
import androidx.appcompat.widget.AbstractC0670w0;
import androidx.appcompat.widget.AbstractC0672x0;
import androidx.appcompat.widget.C0649l0;
import androidx.appcompat.widget.ViewTreeObserverOnGlobalLayoutListenerC0656p;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import w1.C1719l1;

/* renamed from: m.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1421e extends s implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: E, reason: collision with root package name */
    public View f15086E;

    /* renamed from: F, reason: collision with root package name */
    public View f15087F;

    /* renamed from: G, reason: collision with root package name */
    public int f15088G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f15089H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f15090I;

    /* renamed from: J, reason: collision with root package name */
    public int f15091J;

    /* renamed from: K, reason: collision with root package name */
    public int f15092K;

    /* renamed from: M, reason: collision with root package name */
    public boolean f15094M;

    /* renamed from: N, reason: collision with root package name */
    public w f15095N;

    /* renamed from: O, reason: collision with root package name */
    public ViewTreeObserver f15096O;

    /* renamed from: P, reason: collision with root package name */
    public t f15097P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f15098Q;

    /* renamed from: b, reason: collision with root package name */
    public final Context f15099b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15100c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15101d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15102e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f15103f;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f15104x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f15105y = new ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0656p f15106z = new ViewTreeObserverOnGlobalLayoutListenerC0656p(this, 3);

    /* renamed from: A, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC1419c f15082A = new ViewOnAttachStateChangeListenerC1419c(this, 0);

    /* renamed from: B, reason: collision with root package name */
    public final C1719l1 f15083B = new C1719l1(this);

    /* renamed from: C, reason: collision with root package name */
    public int f15084C = 0;

    /* renamed from: D, reason: collision with root package name */
    public int f15085D = 0;

    /* renamed from: L, reason: collision with root package name */
    public boolean f15093L = false;

    public ViewOnKeyListenerC1421e(Context context, View view, int i7, boolean z4) {
        this.f15099b = context;
        this.f15086E = view;
        this.f15101d = i7;
        this.f15102e = z4;
        WeakHashMap weakHashMap = U.f5037a;
        this.f15088G = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f15100c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f15103f = new Handler();
    }

    @Override // m.x
    public final void a(k kVar, boolean z4) {
        ArrayList arrayList = this.f15105y;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (kVar == ((C1420d) arrayList.get(i7)).f15080b) {
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
            ((C1420d) arrayList.get(i8)).f15080b.c(false);
        }
        C1420d c1420d = (C1420d) arrayList.remove(i7);
        c1420d.f15080b.r(this);
        boolean z7 = this.f15098Q;
        A0 a02 = c1420d.f15079a;
        if (z7) {
            AbstractC0670w0.b(a02.f8397P, null);
            a02.f8397P.setAnimationStyle(0);
        }
        a02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f15088G = ((C1420d) arrayList.get(size2 - 1)).f15081c;
        } else {
            View view = this.f15086E;
            WeakHashMap weakHashMap = U.f5037a;
            this.f15088G = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z4) {
                ((C1420d) arrayList.get(0)).f15080b.c(false);
                return;
            }
            return;
        }
        dismiss();
        w wVar = this.f15095N;
        if (wVar != null) {
            wVar.a(kVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f15096O;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f15096O.removeGlobalOnLayoutListener(this.f15106z);
            }
            this.f15096O = null;
        }
        this.f15087F.removeOnAttachStateChangeListener(this.f15082A);
        this.f15097P.onDismiss();
    }

    @Override // m.InterfaceC1414B
    public final boolean b() {
        ArrayList arrayList = this.f15105y;
        return arrayList.size() > 0 && ((C1420d) arrayList.get(0)).f15079a.f8397P.isShowing();
    }

    @Override // m.x
    public final boolean d() {
        return false;
    }

    @Override // m.InterfaceC1414B
    public final void dismiss() {
        ArrayList arrayList = this.f15105y;
        int size = arrayList.size();
        if (size > 0) {
            C1420d[] c1420dArr = (C1420d[]) arrayList.toArray(new C1420d[size]);
            for (int i7 = size - 1; i7 >= 0; i7--) {
                C1420d c1420d = c1420dArr[i7];
                if (c1420d.f15079a.f8397P.isShowing()) {
                    c1420d.f15079a.dismiss();
                }
            }
        }
    }

    @Override // m.x
    public final void e(w wVar) {
        this.f15095N = wVar;
    }

    @Override // m.x
    public final void f() {
        Iterator it = this.f15105y.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C1420d) it.next()).f15079a.f8400c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C1424h) adapter).notifyDataSetChanged();
        }
    }

    @Override // m.InterfaceC1414B
    public final C0649l0 h() {
        ArrayList arrayList = this.f15105y;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C1420d) arrayList.get(arrayList.size() - 1)).f15079a.f8400c;
    }

    @Override // m.x
    public final boolean i(SubMenuC1416D subMenuC1416D) {
        Iterator it = this.f15105y.iterator();
        while (it.hasNext()) {
            C1420d c1420d = (C1420d) it.next();
            if (subMenuC1416D == c1420d.f15080b) {
                c1420d.f15079a.f8400c.requestFocus();
                return true;
            }
        }
        if (!subMenuC1416D.hasVisibleItems()) {
            return false;
        }
        k(subMenuC1416D);
        w wVar = this.f15095N;
        if (wVar != null) {
            wVar.n(subMenuC1416D);
        }
        return true;
    }

    @Override // m.s
    public final void k(k kVar) {
        kVar.b(this, this.f15099b);
        if (b()) {
            u(kVar);
        } else {
            this.f15104x.add(kVar);
        }
    }

    @Override // m.s
    public final void m(View view) {
        if (this.f15086E != view) {
            this.f15086E = view;
            int i7 = this.f15084C;
            WeakHashMap weakHashMap = U.f5037a;
            this.f15085D = Gravity.getAbsoluteGravity(i7, view.getLayoutDirection());
        }
    }

    @Override // m.s
    public final void n(boolean z4) {
        this.f15093L = z4;
    }

    @Override // m.s
    public final void o(int i7) {
        if (this.f15084C != i7) {
            this.f15084C = i7;
            View view = this.f15086E;
            WeakHashMap weakHashMap = U.f5037a;
            this.f15085D = Gravity.getAbsoluteGravity(i7, view.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C1420d c1420d;
        ArrayList arrayList = this.f15105y;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                c1420d = null;
                break;
            }
            c1420d = (C1420d) arrayList.get(i7);
            if (!c1420d.f15079a.f8397P.isShowing()) {
                break;
            } else {
                i7++;
            }
        }
        if (c1420d != null) {
            c1420d.f15080b.c(false);
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

    @Override // m.s
    public final void p(int i7) {
        this.f15089H = true;
        this.f15091J = i7;
    }

    @Override // m.s
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f15097P = (t) onDismissListener;
    }

    @Override // m.s
    public final void r(boolean z4) {
        this.f15094M = z4;
    }

    @Override // m.s
    public final void s(int i7) {
        this.f15090I = true;
        this.f15092K = i7;
    }

    @Override // m.InterfaceC1414B
    public final void show() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.f15104x;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((k) it.next());
        }
        arrayList.clear();
        View view = this.f15086E;
        this.f15087F = view;
        if (view != null) {
            boolean z4 = this.f15096O == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f15096O = viewTreeObserver;
            if (z4) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f15106z);
            }
            this.f15087F.addOnAttachStateChangeListener(this.f15082A);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013f, code lost:
    
        if (((r8.getWidth() + r11[0]) + r5) > r9.right) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0141, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0144, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0149, code lost:
    
        if ((r11[0] - r5) < 0) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(k kVar) {
        C1420d c1420d;
        View view;
        int i7;
        int i8;
        int i9;
        int width;
        MenuItem menuItem;
        C1424h c1424h;
        int i10;
        int firstVisiblePosition;
        Context context = this.f15099b;
        LayoutInflater from = LayoutInflater.from(context);
        C1424h c1424h2 = new C1424h(kVar, from, this.f15102e, R.layout.abc_cascading_menu_item_layout);
        if (!b() && this.f15093L) {
            c1424h2.f15117c = true;
        } else if (b()) {
            c1424h2.f15117c = s.t(kVar);
        }
        int l7 = s.l(c1424h2, context, this.f15100c);
        A0 a02 = new A0(context, null, this.f15101d, 0);
        a02.f8177S = this.f15083B;
        a02.f8388G = this;
        a02.f8397P.setOnDismissListener(this);
        a02.f8387F = this.f15086E;
        a02.f8384C = this.f15085D;
        a02.f8396O = true;
        a02.f8397P.setFocusable(true);
        a02.f8397P.setInputMethodMode(2);
        a02.p(c1424h2);
        a02.q(l7);
        a02.f8384C = this.f15085D;
        ArrayList arrayList = this.f15105y;
        if (arrayList.size() > 0) {
            c1420d = (C1420d) arrayList.get(arrayList.size() - 1);
            k kVar2 = c1420d.f15080b;
            int size = kVar2.f15143f.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = kVar2.getItem(i11);
                if (menuItem.hasSubMenu() && kVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i11++;
                }
            }
            if (menuItem == null) {
                view = null;
            } else {
                C0649l0 c0649l0 = c1420d.f15079a.f8400c;
                ListAdapter adapter = c0649l0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    c1424h = (C1424h) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c1424h = (C1424h) adapter;
                    i10 = 0;
                }
                int count = c1424h.getCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= count) {
                        i12 = -1;
                        break;
                    } else if (menuItem == c1424h.getItem(i12)) {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i12 != -1 && (firstVisiblePosition = (i12 + i10) - c0649l0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0649l0.getChildCount()) {
                    view = c0649l0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i13 = Build.VERSION.SDK_INT;
                PopupWindow popupWindow = a02.f8397P;
                if (i13 <= 28) {
                    Method method = A0.f8176T;
                    if (method != null) {
                        try {
                            method.invoke(popupWindow, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    AbstractC0672x0.a(popupWindow, false);
                }
                AbstractC0670w0.a(a02.f8397P, null);
                C0649l0 c0649l02 = ((C1420d) arrayList.get(arrayList.size() - 1)).f15079a.f8400c;
                int[] iArr = new int[2];
                c0649l02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f15087F.getWindowVisibleDisplayFrame(rect);
                if (this.f15088G == 1) {
                }
                boolean z4 = i7 == 1;
                this.f15088G = i7;
                if (Build.VERSION.SDK_INT >= 26) {
                    a02.f8387F = view;
                    i9 = 0;
                    i8 = 0;
                } else {
                    int[] iArr2 = new int[2];
                    this.f15086E.getLocationOnScreen(iArr2);
                    int[] iArr3 = new int[2];
                    view.getLocationOnScreen(iArr3);
                    if ((this.f15085D & 7) == 5) {
                        iArr2[0] = this.f15086E.getWidth() + iArr2[0];
                        iArr3[0] = view.getWidth() + iArr3[0];
                    }
                    i8 = iArr3[0] - iArr2[0];
                    i9 = iArr3[1] - iArr2[1];
                }
                if ((this.f15085D & 5) != 5) {
                    if (z4) {
                        width = i8 + view.getWidth();
                        a02.f8403f = width;
                        a02.f8383B = true;
                        a02.f8382A = true;
                        a02.k(i9);
                    }
                    width = i8 - l7;
                    a02.f8403f = width;
                    a02.f8383B = true;
                    a02.f8382A = true;
                    a02.k(i9);
                } else if (z4) {
                    width = i8 + l7;
                    a02.f8403f = width;
                    a02.f8383B = true;
                    a02.f8382A = true;
                    a02.k(i9);
                } else {
                    l7 = view.getWidth();
                    width = i8 - l7;
                    a02.f8403f = width;
                    a02.f8383B = true;
                    a02.f8382A = true;
                    a02.k(i9);
                }
            } else {
                if (this.f15089H) {
                    a02.f8403f = this.f15091J;
                }
                if (this.f15090I) {
                    a02.k(this.f15092K);
                }
                Rect rect2 = this.f15189a;
                a02.f8395N = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C1420d(a02, kVar, this.f15088G));
            a02.show();
            C0649l0 c0649l03 = a02.f8400c;
            c0649l03.setOnKeyListener(this);
            if (c1420d == null || !this.f15094M || kVar.f15125D == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0649l03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(kVar.f15125D);
            c0649l03.addHeaderView(frameLayout, null, false);
            a02.show();
            return;
        }
        c1420d = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C1420d(a02, kVar, this.f15088G));
        a02.show();
        C0649l0 c0649l032 = a02.f8400c;
        c0649l032.setOnKeyListener(this);
        if (c1420d == null) {
        }
    }
}
