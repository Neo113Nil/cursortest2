package p139t2;

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
import p151v2.t;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class h extends u {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f16332A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f16333B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f16334C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f16335D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f16336E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f16337F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f16338G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f16339H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f16340I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final SparseArray f16341J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final SparseBooleanArray f16342K;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f16343w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f16344x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f16345y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f16346z;

    /* JADX WARN: Code duplicated, block: B:53:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:58:0x0100  */
    public h(Context context) {
        Point point;
        DisplayManager displayManager;
        CaptioningManager captioningManager;
        int i7 = t.f17159a;
        if (i7 >= 19 && ((i7 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
            this.f16416p = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f16415o = AbstractC0167z.I(i7 >= 21 ? locale.toLanguageTag() : locale.toString());
            }
        }
        Display display = (i7 < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && t.D(context)) {
            String strA = i7 < 28 ? t.A("sys.display-size") : t.A("vendor.display-size");
            if (!TextUtils.isEmpty(strA)) {
                try {
                    String[] strArrSplit = strA.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i8 = Integer.parseInt(strArrSplit[0]);
                        int i9 = Integer.parseInt(strArrSplit[1]);
                        if (i8 > 0 && i9 > 0) {
                            point = new Point(i8, i9);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                L.n("Invalid display size: ", strA, "Util");
                if (!"Sony".equals(t.f17161c) && t.f17162d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                    point = new Point(3840, 2160);
                } else {
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
                }
            } else if (!"Sony".equals(t.f17161c)) {
                point = new Point();
                if (i7 >= 23) {
                    Display.Mode mode2 = display.getMode();
                    point.x = mode2.getPhysicalWidth();
                    point.y = mode2.getPhysicalHeight();
                } else if (i7 >= 17) {
                    display.getRealSize(point);
                } else {
                    display.getSize(point);
                }
            } else {
                point = new Point();
                if (i7 >= 23) {
                    Display.Mode mode3 = display.getMode();
                    point.x = mode3.getPhysicalWidth();
                    point.y = mode3.getPhysicalHeight();
                } else if (i7 >= 17) {
                    display.getRealSize(point);
                } else {
                    display.getSize(point);
                }
            }
        } else {
            point = new Point();
            if (i7 >= 23) {
                Display.Mode mode4 = display.getMode();
                point.x = mode4.getPhysicalWidth();
                point.y = mode4.getPhysicalHeight();
            } else if (i7 >= 17) {
                display.getRealSize(point);
            } else {
                display.getSize(point);
            }
        }
        a(point.x, point.y);
        this.f16341J = new SparseArray();
        this.f16342K = new SparseBooleanArray();
        b();
    }

    @Override // p139t2.u
    public final u a(int i7, int i8) {
        super.a(i7, i8);
        return this;
    }

    public final void b() {
        this.f16343w = true;
        this.f16344x = false;
        this.f16345y = true;
        this.f16346z = false;
        this.f16332A = true;
        this.f16333B = false;
        this.f16334C = false;
        this.f16335D = false;
        this.f16336E = false;
        this.f16337F = true;
        this.f16338G = true;
        this.f16339H = false;
        this.f16340I = true;
    }

    public h() {
        this.f16341J = new SparseArray();
        this.f16342K = new SparseBooleanArray();
        b();
    }
}
