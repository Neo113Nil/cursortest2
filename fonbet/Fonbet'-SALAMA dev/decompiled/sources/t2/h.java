package t2;

import E3.AbstractC0167z;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.Locale;
import w1.L;

/* loaded from: classes.dex */
public final class h extends u {

    /* renamed from: A, reason: collision with root package name */
    public boolean f16326A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f16327B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f16328C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f16329D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f16330E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f16331F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f16332G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f16333H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f16334I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseArray f16335J;

    /* renamed from: K, reason: collision with root package name */
    public final SparseBooleanArray f16336K;

    /* renamed from: w, reason: collision with root package name */
    public boolean f16337w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f16338x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f16339y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f16340z;

    public h(Context context) {
        Point point;
        String[] split;
        DisplayManager displayManager;
        CaptioningManager captioningManager;
        int i7 = v2.t.f17153a;
        if (i7 >= 19 && ((i7 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
            this.f16410p = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f16409o = AbstractC0167z.I(i7 >= 21 ? locale.toLanguageTag() : locale.toString());
            }
        }
        Display display = (i7 < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && v2.t.D(context)) {
            String A7 = i7 < 28 ? v2.t.A("sys.display-size") : v2.t.A("vendor.display-size");
            if (!TextUtils.isEmpty(A7)) {
                try {
                    split = A7.trim().split("x", -1);
                } catch (NumberFormatException unused) {
                }
                if (split.length == 2) {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt > 0 && parseInt2 > 0) {
                        point = new Point(parseInt, parseInt2);
                        a(point.x, point.y);
                        this.f16335J = new SparseArray();
                        this.f16336K = new SparseBooleanArray();
                        b();
                    }
                }
                L.n("Invalid display size: ", A7, "Util");
            }
            if ("Sony".equals(v2.t.f17155c) && v2.t.f17156d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                a(point.x, point.y);
                this.f16335J = new SparseArray();
                this.f16336K = new SparseBooleanArray();
                b();
            }
        }
        point = new Point();
        if (i7 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else if (i7 >= 17) {
            display.getRealSize(point);
        } else {
            display.getSize(point);
        }
        a(point.x, point.y);
        this.f16335J = new SparseArray();
        this.f16336K = new SparseBooleanArray();
        b();
    }

    @Override // t2.u
    public final u a(int i7, int i8) {
        super.a(i7, i8);
        return this;
    }

    public final void b() {
        this.f16337w = true;
        this.f16338x = false;
        this.f16339y = true;
        this.f16340z = false;
        this.f16326A = true;
        this.f16327B = false;
        this.f16328C = false;
        this.f16329D = false;
        this.f16330E = false;
        this.f16331F = true;
        this.f16332G = true;
        this.f16333H = false;
        this.f16334I = true;
    }

    public h() {
        this.f16335J = new SparseArray();
        this.f16336K = new SparseBooleanArray();
        b();
    }
}
