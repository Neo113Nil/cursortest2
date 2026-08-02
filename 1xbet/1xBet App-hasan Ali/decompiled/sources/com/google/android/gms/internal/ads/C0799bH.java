package com.google.android.gms.internal.ads;

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
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.bH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0799bH extends C1158jc {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f12801l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f12802m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f12803n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f12804o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f12805p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f12806q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f12807r;

    /* renamed from: s, reason: collision with root package name */
    public final SparseArray f12808s;

    /* renamed from: t, reason: collision with root package name */
    public final SparseBooleanArray f12809t;

    public C0799bH() {
        this.f12808s = new SparseArray();
        this.f12809t = new SparseBooleanArray();
        this.f12801l = true;
        this.f12802m = true;
        this.f12803n = true;
        this.f12804o = true;
        this.f12805p = true;
        this.f12806q = true;
        this.f12807r = true;
    }

    public C0799bH(Context context) {
        CaptioningManager captioningManager;
        Point point;
        Point point2;
        String h3;
        String[] split;
        int i = AbstractC1260lo.f14419a;
        if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.i = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f14107h = AbstractC1044gv.n(locale.toLanguageTag());
            }
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && AbstractC1260lo.e(context)) {
            if (i < 28) {
                h3 = AbstractC1260lo.h("sys.display-size");
            } else {
                h3 = AbstractC1260lo.h("vendor.display-size");
            }
            if (!TextUtils.isEmpty(h3)) {
                try {
                    split = h3.trim().split("x", -1);
                } catch (NumberFormatException unused) {
                }
                if (split.length == 2) {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt > 0 && parseInt2 > 0) {
                        point2 = new Point(parseInt, parseInt2);
                        int i5 = point2.x;
                        int i6 = point2.y;
                        this.f14101a = i5;
                        this.f14102b = i6;
                        this.f12808s = new SparseArray();
                        this.f12809t = new SparseBooleanArray();
                        this.f12801l = true;
                        this.f12802m = true;
                        this.f12803n = true;
                        this.f12804o = true;
                        this.f12805p = true;
                        this.f12806q = true;
                        this.f12807r = true;
                    }
                }
                JB.f("Util", "Invalid display size: ".concat(String.valueOf(h3)));
            }
            if ("Sony".equals(AbstractC1260lo.f14421c) && AbstractC1260lo.f14422d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                point2 = point;
                int i52 = point2.x;
                int i62 = point2.y;
                this.f14101a = i52;
                this.f14102b = i62;
                this.f12808s = new SparseArray();
                this.f12809t = new SparseBooleanArray();
                this.f12801l = true;
                this.f12802m = true;
                this.f12803n = true;
                this.f12804o = true;
                this.f12805p = true;
                this.f12806q = true;
                this.f12807r = true;
            }
        }
        point = new Point();
        if (i >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else {
            display.getRealSize(point);
        }
        point2 = point;
        int i522 = point2.x;
        int i622 = point2.y;
        this.f14101a = i522;
        this.f14102b = i622;
        this.f12808s = new SparseArray();
        this.f12809t = new SparseBooleanArray();
        this.f12801l = true;
        this.f12802m = true;
        this.f12803n = true;
        this.f12804o = true;
        this.f12805p = true;
        this.f12806q = true;
        this.f12807r = true;
    }

    public /* synthetic */ C0799bH(C0843cH c0843cH) {
        super(c0843cH);
        this.f12801l = c0843cH.f12988l;
        this.f12802m = c0843cH.f12989m;
        this.f12803n = c0843cH.f12990n;
        this.f12804o = c0843cH.f12991o;
        this.f12805p = c0843cH.f12992p;
        this.f12806q = c0843cH.f12993q;
        this.f12807r = c0843cH.f12994r;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = c0843cH.f12995s;
            if (i < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            } else {
                this.f12808s = sparseArray;
                this.f12809t = c0843cH.f12996t.clone();
                return;
            }
        }
    }
}
