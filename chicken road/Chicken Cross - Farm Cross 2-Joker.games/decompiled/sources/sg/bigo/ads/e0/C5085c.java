package sg.bigo.ads.e0;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import sg.bigo.ads.K0.X;

/* renamed from: sg.bigo.ads.e0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5085c {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f12751a;
    public DisplayCutout e;
    public final ArrayList b = new ArrayList();
    public final IdentityHashMap c = new IdentityHashMap();
    public final IdentityHashMap d = new IdentityHashMap();
    public final C5086d f = new C5086d();
    public int g = 0;
    public int h = 0;
    public final Rect i = new Rect(0, 0, 0, 0);

    public C5085c(Activity activity) {
        this.f12751a = activity;
    }

    public final void a(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.e = windowInsets.getDisplayCutout();
            View decorView = this.f12751a.getWindow() != null ? this.f12751a.getWindow().getDecorView() : null;
            this.g = decorView != null ? decorView.getWidth() : 0;
            this.h = decorView != null ? decorView.getHeight() : 0;
            if (i >= 31) {
                C5086d c5086d = this.f;
                RoundedCorner roundedCorner = windowInsets.getRoundedCorner(0);
                RoundedCorner roundedCorner2 = windowInsets.getRoundedCorner(1);
                RoundedCorner roundedCorner3 = windowInsets.getRoundedCorner(3);
                RoundedCorner roundedCorner4 = windowInsets.getRoundedCorner(2);
                c5086d.f12752a = roundedCorner;
                c5086d.b = roundedCorner2;
                c5086d.c = roundedCorner3;
                c5086d.d = roundedCorner4;
                this.f.a(this.g, this.h);
            }
            a();
        }
    }

    public final void a(View view, int i) {
        if (Build.VERSION.SDK_INT >= 28 && view != null) {
            if (i != 0 && i != 1 && i != 2) {
                i = 0;
            }
            this.b.add(view);
            this.c.put(view, Integer.valueOf(i));
            if (!this.d.containsKey(view)) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    this.d.put(view, new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin));
                }
            }
            a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0173 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28 && !this.b.isEmpty()) {
            View decorView = this.f12751a.getWindow() != null ? this.f12751a.getWindow().getDecorView() : null;
            int width = decorView != null ? decorView.getWidth() : 0;
            int height = decorView != null ? decorView.getHeight() : 0;
            if (i3 >= 31) {
                C5086d c5086d = this.f;
                if (c5086d.g == 0 && c5086d.h == 0 && width > 0 && height > 0) {
                    c5086d.a(width, height);
                }
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (view != null) {
                    Rect a2 = X.a(view, 0);
                    if (!this.i.equals(a2)) {
                        Rect rect = new Rect(a2);
                        Integer num = (Integer) this.c.get(view);
                        int intValue = num == null ? 0 : num.intValue();
                        if (intValue == 0) {
                            DisplayCutout displayCutout = this.e;
                            if (displayCutout != null && Build.VERSION.SDK_INT >= 28) {
                                List<Rect> boundingRects = displayCutout.getBoundingRects();
                                if (!boundingRects.isEmpty()) {
                                    for (Rect rect2 : boundingRects) {
                                        if (rect2 != null) {
                                            AbstractC5083a.a(rect2, rect, this.g, this.h);
                                        }
                                    }
                                }
                            }
                            if (Build.VERSION.SDK_INT >= 31 && width > 0 && height > 0) {
                                this.f.a(rect, width, height);
                            }
                            if (rect.equals(a2)) {
                                rect.toString();
                            } else {
                                float f = rect.left - a2.left;
                                float f2 = rect.top - a2.top;
                                a2.toString();
                                rect.toString();
                                view.setTranslationX(f);
                                view.setTranslationY(f2);
                            }
                        } else {
                            C5084b c5084b = new C5084b(this, rect, intValue);
                            DisplayCutout displayCutout2 = this.e;
                            if (displayCutout2 != null && Build.VERSION.SDK_INT >= 28) {
                                List<Rect> boundingRects2 = displayCutout2.getBoundingRects();
                                if (!boundingRects2.isEmpty()) {
                                    for (Rect rect3 : boundingRects2) {
                                        if (rect3 != null) {
                                            c5084b.a(rect3);
                                        }
                                    }
                                }
                            }
                            int i4 = Build.VERSION.SDK_INT;
                            if (i4 >= 31 && width > 0 && height > 0) {
                                C5086d c5086d2 = this.f;
                                c5086d2.getClass();
                                if (intValue != 1 && intValue != 2) {
                                    c5086d2.a(rect, width, height);
                                } else if (i4 >= 31) {
                                    int i5 = c5086d2.g;
                                    if ((i5 == 0 && c5086d2.h == 0) || i5 > width || c5086d2.h > height) {
                                        c5086d2.a(width, height);
                                    }
                                    int i6 = c5086d2.e;
                                    int i7 = c5086d2.f;
                                    int i8 = c5086d2.g;
                                    if (i8 <= 0) {
                                        i8 = width;
                                    }
                                    int i9 = c5086d2.h;
                                    if (i9 <= 0) {
                                        i9 = height;
                                    }
                                    if (intValue == 1) {
                                        int i10 = rect.left;
                                        if (i10 < i6) {
                                            i2 = i6 - i10;
                                        } else {
                                            int i11 = rect.right;
                                            if (i11 > i8) {
                                                i2 = i8 - i11;
                                            }
                                            i2 = 0;
                                            i = 0;
                                            if ((i2 == 0 || i != 0) && AbstractC5083a.a(new Rect(rect), i2, i, width, height)) {
                                                Objects.toString(rect);
                                                rect.offset(i2, i);
                                            } else {
                                                Objects.toString(rect);
                                            }
                                        }
                                        i = 0;
                                        if (i2 == 0) {
                                        }
                                        Objects.toString(rect);
                                        rect.offset(i2, i);
                                    } else {
                                        int i12 = rect.top;
                                        if (i12 < i7) {
                                            i = i7 - i12;
                                        } else {
                                            int i13 = rect.bottom;
                                            if (i13 > i9) {
                                                i = i9 - i13;
                                            }
                                            i2 = 0;
                                            i = 0;
                                            if (i2 == 0) {
                                            }
                                            Objects.toString(rect);
                                            rect.offset(i2, i);
                                        }
                                        i2 = 0;
                                        if (i2 == 0) {
                                        }
                                        Objects.toString(rect);
                                        rect.offset(i2, i);
                                    }
                                }
                            }
                            if (!rect.equals(a2)) {
                                int i14 = rect.left - a2.left;
                                int i15 = rect.top - a2.top;
                                a2.toString();
                                rect.toString();
                                if (!this.d.containsKey(view)) {
                                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                        this.d.put(view, new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin));
                                    }
                                }
                                Rect rect4 = (Rect) this.d.get(view);
                                if (rect4 != null) {
                                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                                        int i16 = rect4.left;
                                        int i17 = rect4.right;
                                        int i18 = rect4.top;
                                        int i19 = rect4.bottom;
                                        if (i14 != 0) {
                                            if (i14 > 0) {
                                                i16 += i14;
                                            } else {
                                                i17 -= i14;
                                            }
                                        }
                                        if (i15 != 0) {
                                            if (i15 > 0) {
                                                i18 += i15;
                                            } else {
                                                i19 -= i15;
                                            }
                                        }
                                        if (marginLayoutParams2.leftMargin != i16 || marginLayoutParams2.rightMargin != i17 || marginLayoutParams2.topMargin != i18 || marginLayoutParams2.bottomMargin != i19) {
                                            marginLayoutParams2.leftMargin = i16;
                                            marginLayoutParams2.rightMargin = i17;
                                            marginLayoutParams2.topMargin = i18;
                                            marginLayoutParams2.bottomMargin = i19;
                                            view.setLayoutParams(marginLayoutParams2);
                                        }
                                    }
                                }
                            } else {
                                rect.toString();
                            }
                        }
                    }
                }
            }
        }
    }
}
