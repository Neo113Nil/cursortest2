package P2;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.core.view.C5305a;
import androidx.core.view.Y;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import y2.q;
import y2.r;

/* loaded from: classes8.dex */
public abstract class a extends C5305a {

    /* renamed from: j, reason: collision with root package name */
    private static final Rect f21658j = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);

    /* renamed from: e, reason: collision with root package name */
    private final AccessibilityManager f21663e;

    /* renamed from: f, reason: collision with root package name */
    private final Chip f21664f;

    /* renamed from: g, reason: collision with root package name */
    private c f21665g;

    /* renamed from: a, reason: collision with root package name */
    private final Rect f21659a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    private final Rect f21660b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    private final Rect f21661c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    private final int[] f21662d = new int[2];

    /* renamed from: h, reason: collision with root package name */
    int f21666h = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: i, reason: collision with root package name */
    int f21667i = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: P2.a$a, reason: collision with other inner class name */
    final class C0425a {
    }

    final class b {
    }

    private class c extends r {
        c() {
        }

        @Override // y2.r
        public final q b(int i11) {
            return q.B(a.this.c(i11));
        }

        @Override // y2.r
        public final q c(int i11) {
            a aVar = a.this;
            int i12 = i11 == 2 ? aVar.f21666h : aVar.f21667i;
            if (i12 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i12);
        }

        @Override // y2.r
        public final boolean e(int i11, int i12, Bundle bundle) {
            return a.this.h(i11, i12, bundle);
        }
    }

    public a(@NonNull Chip chip) {
        this.f21664f = chip;
        this.f21663e = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        int i11 = Y.f42258g;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    public final boolean a(int i11) {
        if (this.f21667i != i11) {
            return false;
        }
        this.f21667i = LinearLayoutManager.INVALID_OFFSET;
        g(i11, false);
        i(i11, 8);
        return true;
    }

    protected abstract void b(ArrayList arrayList);

    @NonNull
    final q c(int i11) {
        Chip chip = this.f21664f;
        if (i11 == -1) {
            q A11 = q.A(chip);
            int i12 = Y.f42258g;
            chip.onInitializeAccessibilityNodeInfo(A11.z0());
            ArrayList arrayList = new ArrayList();
            b(arrayList);
            if (A11.k() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                A11.c(((Integer) arrayList.get(i13)).intValue(), chip);
            }
            return A11;
        }
        q z11 = q.z();
        z11.S(true);
        z11.U(true);
        z11.K("android.view.View");
        Rect rect = f21658j;
        z11.G(rect);
        z11.H(rect);
        z11.h0(chip);
        f(i11, z11);
        if (z11.q() == null && z11.n() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f21660b;
        z11.i(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int g10 = z11.g();
        if ((g10 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((g10 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        z11.e0(chip.getContext().getPackageName());
        z11.p0(i11, chip);
        if (this.f21666h == i11) {
            z11.E(true);
            z11.a(UserVerificationMethods.USER_VERIFY_PATTERN);
        } else {
            z11.E(false);
            z11.a(64);
        }
        boolean z12 = this.f21667i == i11;
        if (z12) {
            z11.a(2);
        } else if (z11.u()) {
            z11.a(1);
        }
        z11.V(z12);
        int[] iArr = this.f21662d;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f21659a;
        z11.j(rect3);
        if (rect3.equals(rect)) {
            z11.i(rect3);
            if (z11.f105940b != -1) {
                q z13 = q.z();
                for (int i14 = z11.f105940b; i14 != -1; i14 = z13.f105940b) {
                    z13.g0(-1, chip);
                    z13.G(rect);
                    f(i14, z13);
                    z13.i(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f21661c;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                z11.H(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            z11.y0(true);
                        }
                    }
                }
            }
        }
        return z11;
    }

    protected abstract boolean d(int i11, int i12);

    protected abstract void e(@NonNull q qVar);

    protected abstract void f(int i11, @NonNull q qVar);

    protected abstract void g(int i11, boolean z11);

    @Override // androidx.core.view.C5305a
    public final r getAccessibilityNodeProvider(View view) {
        if (this.f21665g == null) {
            this.f21665g = new c();
        }
        return this.f21665g;
    }

    final boolean h(int i11, int i12, Bundle bundle) {
        int i13;
        int i14;
        Chip chip = this.f21664f;
        if (i11 == -1) {
            int i15 = Y.f42258g;
            return chip.performAccessibilityAction(i12, bundle);
        }
        if (i12 == 1) {
            if ((!chip.isFocused() && !chip.requestFocus()) || (i13 = this.f21667i) == i11) {
                return false;
            }
            if (i13 != Integer.MIN_VALUE) {
                a(i13);
            }
            if (i11 == Integer.MIN_VALUE) {
                return false;
            }
            this.f21667i = i11;
            g(i11, true);
            i(i11, 8);
            return true;
        }
        if (i12 == 2) {
            return a(i11);
        }
        if (i12 != 64) {
            if (i12 != 128) {
                return d(i11, i12);
            }
            if (this.f21666h != i11) {
                return false;
            }
            this.f21666h = LinearLayoutManager.INVALID_OFFSET;
            chip.invalidate();
            i(i11, 65536);
            return true;
        }
        AccessibilityManager accessibilityManager = this.f21663e;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i14 = this.f21666h) == i11) {
            return false;
        }
        if (i14 != Integer.MIN_VALUE) {
            this.f21666h = LinearLayoutManager.INVALID_OFFSET;
            chip.invalidate();
            i(i14, 65536);
        }
        this.f21666h = i11;
        chip.invalidate();
        i(i11, 32768);
        return true;
    }

    public final void i(int i11, int i12) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i11 == Integer.MIN_VALUE || !this.f21663e.isEnabled() || (parent = (view = this.f21664f).getParent()) == null) {
            return;
        }
        if (i11 != -1) {
            obtain = AccessibilityEvent.obtain(i12);
            q c11 = c(i11);
            obtain.getText().add(c11.q());
            obtain.setContentDescription(c11.n());
            obtain.setScrollable(c11.x());
            obtain.setPassword(c11.w());
            obtain.setEnabled(c11.t());
            obtain.setChecked(c11.r());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(c11.l());
            obtain.setSource(view, i11);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i12);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }

    @Override // androidx.core.view.C5305a
    public final void onInitializeAccessibilityNodeInfo(View view, q qVar) {
        super.onInitializeAccessibilityNodeInfo(view, qVar);
        e(qVar);
    }
}
