package a1;

import A0.AbstractC0012b;
import A0.C0009a;
import A0.C0040k0;
import A0.P0;
import A0.r1;
import P.AbstractC0321v;
import P.AbstractC0329z;
import P.C0305m0;
import P.C0315s;
import P.C0326x0;
import P.H;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.L;
import game.betting133.sports1xbet.R;
import i4.InterfaceC2015a;
import java.util.UUID;
import x0.InterfaceC2637x;

/* loaded from: classes.dex */
public final class w extends AbstractC0012b {

    /* renamed from: A, reason: collision with root package name */
    public W0.m f6448A;

    /* renamed from: B, reason: collision with root package name */
    public final C0305m0 f6449B;

    /* renamed from: C, reason: collision with root package name */
    public final C0305m0 f6450C;

    /* renamed from: D, reason: collision with root package name */
    public W0.k f6451D;

    /* renamed from: E, reason: collision with root package name */
    public final H f6452E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f6453F;

    /* renamed from: G, reason: collision with root package name */
    public final Z.s f6454G;

    /* renamed from: H, reason: collision with root package name */
    public I1.l f6455H;

    /* renamed from: I, reason: collision with root package name */
    public final C0305m0 f6456I;
    public boolean J;
    public final int[] K;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC2015a f6457s;

    /* renamed from: t, reason: collision with root package name */
    public C0453A f6458t;

    /* renamed from: u, reason: collision with root package name */
    public String f6459u;

    /* renamed from: v, reason: collision with root package name */
    public final View f6460v;

    /* renamed from: w, reason: collision with root package name */
    public final y f6461w;

    /* renamed from: x, reason: collision with root package name */
    public final WindowManager f6462x;

    /* renamed from: y, reason: collision with root package name */
    public final WindowManager.LayoutParams f6463y;

    /* renamed from: z, reason: collision with root package name */
    public z f6464z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(InterfaceC2015a interfaceC2015a, C0453A c0453a, String str, View view, W0.c cVar, z zVar, UUID uuid) {
        super(view.getContext());
        y xVar = Build.VERSION.SDK_INT >= 29 ? new x() : new y();
        this.f6457s = interfaceC2015a;
        this.f6458t = c0453a;
        this.f6459u = str;
        this.f6460v = view;
        this.f6461w = xVar;
        Object systemService = view.getContext().getSystemService("window");
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.view.WindowManager", systemService);
        this.f6462x = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        C0453A c0453a2 = this.f6458t;
        boolean b3 = l.b(view);
        boolean z3 = c0453a2.f6371b;
        int i = c0453a2.f6370a;
        if (z3 && b3) {
            i |= 8192;
        } else if (z3 && !b3) {
            i &= -8193;
        }
        layoutParams.flags = i;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f6463y = layoutParams;
        this.f6464z = zVar;
        this.f6448A = W0.m.f6016k;
        this.f6449B = AbstractC0329z.t(null);
        this.f6450C = AbstractC0329z.t(null);
        this.f6452E = AbstractC0329z.o(new C0040k0(20, this));
        this.f6453F = new Rect();
        this.f6454G = new Z.s(new j(this, 2));
        setId(android.R.id.content);
        L.l(this, L.f(view));
        setTag(R.id.view_tree_view_model_store_owner, L.g(view));
        setTag(R.id.view_tree_saved_state_registry_owner, N4.b.x(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(cVar.y((float) 8));
        setOutlineProvider(new r1(2));
        this.f6456I = AbstractC0329z.t(r.f6422a);
        this.K = new int[2];
    }

    private final i4.e getContent() {
        return (i4.e) this.f6456I.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC2637x getParentLayoutCoordinates() {
        return (InterfaceC2637x) this.f6450C.getValue();
    }

    private final W0.k getVisibleDisplayBounds() {
        this.f6461w.getClass();
        View view = this.f6460v;
        Rect rect = this.f6453F;
        view.getWindowVisibleDisplayFrame(rect);
        return new W0.k(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(i4.e eVar) {
        this.f6456I.setValue(eVar);
    }

    private final void setParentLayoutCoordinates(InterfaceC2637x interfaceC2637x) {
        this.f6450C.setValue(interfaceC2637x);
    }

    @Override // A0.AbstractC0012b
    public final void a(int i, C0315s c0315s) {
        c0315s.Z(-857613600);
        int i5 = (c0315s.h(this) ? 4 : 2) | i;
        if (c0315s.P(i5 & 1, (i5 & 3) != 2)) {
            getContent().invoke(c0315s, 0);
        } else {
            c0315s.S();
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0009a(i, 8, this);
        }
    }

    @Override // A0.AbstractC0012b
    public final void d(boolean z3, int i, int i5, int i6, int i7) {
        super.d(z3, i, i5, i6, i7);
        this.f6458t.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f6463y;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.f6461w.getClass();
        this.f6462x.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f6458t.f6372c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                InterfaceC2015a interfaceC2015a = this.f6457s;
                if (interfaceC2015a != null) {
                    interfaceC2015a.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // A0.AbstractC0012b
    public final void f(int i, int i5) {
        this.f6458t.getClass();
        W0.k visibleDisplayBounds = getVisibleDisplayBounds();
        super.f(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.f6013c - visibleDisplayBounds.f6011a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.f6014d - visibleDisplayBounds.f6012b, Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f6452E.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f6463y;
    }

    public final W0.m getParentLayoutDirection() {
        return this.f6448A;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final W0.l m8getPopupContentSizebOM6tXw() {
        return (W0.l) this.f6449B.getValue();
    }

    public final z getPositionProvider() {
        return this.f6464z;
    }

    @Override // A0.AbstractC0012b
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.J;
    }

    public final String getTestTag() {
        return this.f6459u;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void i(AbstractC0321v abstractC0321v, i4.e eVar) {
        setParentCompositionContext(abstractC0321v);
        setContent(eVar);
        this.J = true;
    }

    public final void j(InterfaceC2015a interfaceC2015a, C0453A c0453a, String str, W0.m mVar) {
        int i;
        this.f6457s = interfaceC2015a;
        this.f6459u = str;
        if (!kotlin.jvm.internal.l.a(this.f6458t, c0453a)) {
            c0453a.getClass();
            WindowManager.LayoutParams layoutParams = this.f6463y;
            this.f6458t = c0453a;
            boolean b3 = l.b(this.f6460v);
            boolean z3 = c0453a.f6371b;
            int i5 = c0453a.f6370a;
            if (z3 && b3) {
                i5 |= 8192;
            } else if (z3 && !b3) {
                i5 &= -8193;
            }
            layoutParams.flags = i5;
            this.f6461w.getClass();
            this.f6462x.updateViewLayout(this, layoutParams);
        }
        int ordinal = mVar.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                throw new D2.e();
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void k() {
        InterfaceC2637x parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.F()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long I5 = parentLayoutCoordinates.I();
            long h3 = parentLayoutCoordinates.h(0L);
            long round = (Math.round(Float.intBitsToFloat((int) (h3 >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (h3 & 4294967295L))) & 4294967295L);
            int i = (int) (round >> 32);
            int i5 = (int) (round & 4294967295L);
            W0.k kVar = new W0.k(i, i5, ((int) (I5 >> 32)) + i, ((int) (I5 & 4294967295L)) + i5);
            if (kVar.equals(this.f6451D)) {
                return;
            }
            this.f6451D = kVar;
            m();
        }
    }

    public final void l(InterfaceC2637x interfaceC2637x) {
        setParentLayoutCoordinates(interfaceC2637x);
        k();
    }

    public final void m() {
        W0.l m8getPopupContentSizebOM6tXw;
        W0.k kVar = this.f6451D;
        if (kVar == null || (m8getPopupContentSizebOM6tXw = m8getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        W0.k visibleDisplayBounds = getVisibleDisplayBounds();
        long j5 = ((visibleDisplayBounds.f6014d - visibleDisplayBounds.f6012b) & 4294967295L) | ((visibleDisplayBounds.f6013c - visibleDisplayBounds.f6011a) << 32);
        kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
        vVar.f17623k = 0L;
        this.f6454G.d(this, c.f6386r, new v(vVar, this, kVar, j5, m8getPopupContentSizebOM6tXw.f6015a));
        WindowManager.LayoutParams layoutParams = this.f6463y;
        long j6 = vVar.f17623k;
        layoutParams.x = (int) (j6 >> 32);
        layoutParams.y = (int) (j6 & 4294967295L);
        boolean z3 = this.f6458t.f6374e;
        y yVar = this.f6461w;
        if (z3) {
            yVar.a(this, (int) (j5 >> 32), (int) (j5 & 4294967295L));
        }
        yVar.getClass();
        this.f6462x.updateViewLayout(this, layoutParams);
    }

    @Override // A0.AbstractC0012b, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6454G.e();
        if (!this.f6458t.f6372c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f6455H == null) {
            this.f6455H = new I1.l(1, this.f6457s);
        }
        o.c(this, this.f6455H);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Z.s sVar = this.f6454G;
        P0 p02 = sVar.f6236h;
        if (p02 != null) {
            p02.a();
        }
        sVar.a();
        if (Build.VERSION.SDK_INT >= 33) {
            o.d(this, this.f6455H);
        }
        this.f6455H = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f6458t.f6373d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            InterfaceC2015a interfaceC2015a = this.f6457s;
            if (interfaceC2015a != null) {
                interfaceC2015a.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            InterfaceC2015a interfaceC2015a2 = this.f6457s;
            if (interfaceC2015a2 != null) {
                interfaceC2015a2.invoke();
            }
        }
        return true;
    }

    public final void setParentLayoutDirection(W0.m mVar) {
        this.f6448A = mVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m9setPopupContentSizefhxjrPA(W0.l lVar) {
        this.f6449B.setValue(lVar);
    }

    public final void setPositionProvider(z zVar) {
        this.f6464z = zVar;
    }

    public final void setTestTag(String str) {
        this.f6459u = str;
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public AbstractC0012b getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
