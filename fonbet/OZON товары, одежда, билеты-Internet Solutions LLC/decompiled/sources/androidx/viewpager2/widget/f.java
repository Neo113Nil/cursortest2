package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* loaded from: classes8.dex */
final class f extends RecyclerView.t {

    /* renamed from: a, reason: collision with root package name */
    private ViewPager2.g f45215a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final ViewPager2 f45216b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final RecyclerView f45217c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private final LinearLayoutManager f45218d;

    /* renamed from: e, reason: collision with root package name */
    private int f45219e;

    /* renamed from: f, reason: collision with root package name */
    private int f45220f;

    /* renamed from: g, reason: collision with root package name */
    private a f45221g;

    /* renamed from: h, reason: collision with root package name */
    private int f45222h;

    /* renamed from: i, reason: collision with root package name */
    private int f45223i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f45224j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f45225k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f45226l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f45227m;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f45228a;

        /* renamed from: b, reason: collision with root package name */
        float f45229b;

        /* renamed from: c, reason: collision with root package name */
        int f45230c;
    }

    f(@NonNull ViewPager2 viewPager2) {
        this.f45216b = viewPager2;
        RecyclerView recyclerView = viewPager2.f45175j;
        this.f45217c = recyclerView;
        this.f45218d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f45221g = new a();
        m();
    }

    private void a(int i11) {
        ViewPager2.g gVar = this.f45215a;
        if (gVar != null) {
            gVar.onPageSelected(i11);
        }
    }

    private void b(int i11) {
        if ((this.f45219e == 3 && this.f45220f == 0) || this.f45220f == i11) {
            return;
        }
        this.f45220f = i11;
        ViewPager2.g gVar = this.f45215a;
        if (gVar != null) {
            gVar.onPageScrollStateChanged(i11);
        }
    }

    private void m() {
        this.f45219e = 0;
        this.f45220f = 0;
        a aVar = this.f45221g;
        aVar.f45228a = -1;
        aVar.f45229b = 0.0f;
        aVar.f45230c = 0;
        this.f45222h = -1;
        this.f45223i = -1;
        this.f45224j = false;
        this.f45225k = false;
        this.f45227m = false;
        this.f45226l = false;
    }

    private void p(boolean z11) {
        this.f45227m = z11;
        this.f45219e = z11 ? 4 : 1;
        int i11 = this.f45223i;
        if (i11 != -1) {
            this.f45222h = i11;
            this.f45223i = -1;
        } else if (this.f45222h == -1) {
            this.f45222h = this.f45218d.findFirstVisibleItemPosition();
        }
        b(1);
    }

    private void q() {
        int top;
        LinearLayoutManager linearLayoutManager = this.f45218d;
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        a aVar = this.f45221g;
        aVar.f45228a = findFirstVisibleItemPosition;
        if (findFirstVisibleItemPosition == -1) {
            aVar.f45228a = -1;
            aVar.f45229b = 0.0f;
            aVar.f45230c = 0;
            return;
        }
        View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
        if (findViewByPosition == null) {
            aVar.f45228a = -1;
            aVar.f45229b = 0.0f;
            aVar.f45230c = 0;
            return;
        }
        int leftDecorationWidth = linearLayoutManager.getLeftDecorationWidth(findViewByPosition);
        int rightDecorationWidth = linearLayoutManager.getRightDecorationWidth(findViewByPosition);
        int topDecorationHeight = linearLayoutManager.getTopDecorationHeight(findViewByPosition);
        int bottomDecorationHeight = linearLayoutManager.getBottomDecorationHeight(findViewByPosition);
        ViewGroup.LayoutParams layoutParams = findViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = findViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = findViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        int orientation = linearLayoutManager.getOrientation();
        RecyclerView recyclerView = this.f45217c;
        if (orientation == 0) {
            top = (findViewByPosition.getLeft() - leftDecorationWidth) - recyclerView.getPaddingLeft();
            if (this.f45216b.n()) {
                top = -top;
            }
            height = width;
        } else {
            top = (findViewByPosition.getTop() - topDecorationHeight) - recyclerView.getPaddingTop();
        }
        int i11 = -top;
        aVar.f45230c = i11;
        if (i11 >= 0) {
            aVar.f45229b = height != 0 ? i11 / height : 0.0f;
        } else {
            if (new b(linearLayoutManager).b()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            Locale locale = Locale.US;
            throw new IllegalStateException(Ej.b.a(aVar.f45230c, "Page can only be offset by a positive amount, not by "));
        }
    }

    final double d() {
        q();
        a aVar = this.f45221g;
        return aVar.f45228a + aVar.f45229b;
    }

    final int e() {
        return this.f45220f;
    }

    final boolean f() {
        return this.f45220f == 1;
    }

    final boolean g() {
        return this.f45227m;
    }

    final boolean h() {
        return this.f45220f == 0;
    }

    final void i() {
        this.f45219e = 4;
        p(true);
    }

    final void j() {
        this.f45226l = true;
    }

    final void k() {
        if (!f() || this.f45227m) {
            this.f45227m = false;
            q();
            a aVar = this.f45221g;
            if (aVar.f45230c != 0) {
                b(2);
                return;
            }
            int i11 = aVar.f45228a;
            if (i11 != this.f45222h) {
                a(i11);
            }
            b(0);
            m();
        }
    }

    final void l(int i11, boolean z11) {
        this.f45219e = z11 ? 2 : 3;
        this.f45227m = false;
        boolean z12 = this.f45223i != i11;
        this.f45223i = i11;
        b(2);
        if (z12) {
            a(i11);
        }
    }

    final void o(ViewPager2.g gVar) {
        this.f45215a = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i11) {
        ViewPager2.g gVar;
        int i12 = this.f45219e;
        boolean z11 = true;
        if (!(i12 == 1 && this.f45220f == 1) && i11 == 1) {
            p(false);
            return;
        }
        if ((i12 == 1 || i12 == 4) && i11 == 2) {
            if (this.f45225k) {
                b(2);
                this.f45224j = true;
                return;
            }
            return;
        }
        if (i12 != 1 && i12 != 4) {
            z11 = false;
        }
        a aVar = this.f45221g;
        if (z11 && i11 == 0) {
            q();
            if (!this.f45225k) {
                int i13 = aVar.f45228a;
                if (i13 != -1 && (gVar = this.f45215a) != null) {
                    gVar.onPageScrolled(i13, 0.0f, 0);
                }
            } else if (aVar.f45230c == 0) {
                int i14 = this.f45222h;
                int i15 = aVar.f45228a;
                if (i14 != i15) {
                    a(i15);
                }
            }
            b(0);
            m();
        }
        if (this.f45219e == 2 && i11 == 0 && this.f45226l) {
            q();
            if (aVar.f45230c == 0) {
                int i16 = this.f45223i;
                int i17 = aVar.f45228a;
                if (i16 != i17) {
                    if (i17 == -1) {
                        i17 = 0;
                    }
                    a(i17);
                }
                b(0);
                m();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r7 < 0) == r5.f45216b.n()) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // androidx.recyclerview.widget.RecyclerView.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onScrolled(@NonNull RecyclerView recyclerView, int i11, int i12) {
        int i13;
        this.f45225k = true;
        q();
        boolean z11 = this.f45224j;
        a aVar = this.f45221g;
        if (z11) {
            this.f45224j = false;
            if (i12 <= 0) {
                if (i12 == 0) {
                }
                i13 = aVar.f45228a;
                this.f45223i = i13;
                if (this.f45222h != i13) {
                    a(i13);
                }
            }
            if (aVar.f45230c != 0) {
                i13 = aVar.f45228a + 1;
                this.f45223i = i13;
                if (this.f45222h != i13) {
                }
            }
            i13 = aVar.f45228a;
            this.f45223i = i13;
            if (this.f45222h != i13) {
            }
        } else if (this.f45219e == 0) {
            int i14 = aVar.f45228a;
            if (i14 == -1) {
                i14 = 0;
            }
            a(i14);
        }
        int i15 = aVar.f45228a;
        if (i15 == -1) {
            i15 = 0;
        }
        float f7 = aVar.f45229b;
        int i16 = aVar.f45230c;
        ViewPager2.g gVar = this.f45215a;
        if (gVar != null) {
            gVar.onPageScrolled(i15, f7, i16);
        }
        int i17 = aVar.f45228a;
        int i18 = this.f45223i;
        if ((i17 == i18 || i18 == -1) && aVar.f45230c == 0 && this.f45220f != 1) {
            b(0);
            m();
        }
    }
}
