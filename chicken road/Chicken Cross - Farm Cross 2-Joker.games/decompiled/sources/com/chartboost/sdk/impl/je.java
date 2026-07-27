package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.ironsource.U3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class je {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4827a;

        static {
            int[] iArr = new int[ie.values().length];
            try {
                iArr[ie.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ie.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ie.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ie.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ie.c.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ie.h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ie.e.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ie.i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f4827a = iArr;
        }
    }

    public static final void a(Activity activity, com.chartboost.sdk.internal.Model.a aVar) {
        if (activity == null || a(activity) || aVar == null || !aVar.k() || !aVar.m()) {
            return;
        }
        activity.setRequestedOrientation(-1);
    }

    public static final String b(Context context, q6 displayMeasurement) {
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        switch (a.f4827a[a(context, displayMeasurement).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return U3.i.D;
            case 5:
            case 6:
            case 7:
            case 8:
                return U3.i.C;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean c(Context context, q6 displayMeasurement) {
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        ie a2 = a(context, displayMeasurement);
        return a2 == ie.b || a2 == ie.d || a2 == ie.f || a2 == ie.g;
    }

    public static final void a(Activity activity, com.chartboost.sdk.internal.Model.a aVar, q6 displayMeasurement) {
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        if (activity == null || a(activity) || aVar == null) {
            return;
        }
        int i = 1;
        if (aVar.k() && aVar.m()) {
            switch (a.f4827a[a(activity, displayMeasurement).ordinal()]) {
                case 1:
                case 2:
                    break;
                case 3:
                case 4:
                    i = 9;
                    break;
                case 5:
                case 6:
                    i = 0;
                    break;
                default:
                    i = 8;
                    break;
            }
            activity.setRequestedOrientation(i);
        }
    }

    public static final boolean a(Activity activity) {
        View decorView;
        Drawable background;
        if (activity == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 26 || activity.getApplicationInfo().targetSdkVersion <= 26) {
            return false;
        }
        Window window = activity.getWindow();
        return window == null || (decorView = window.getDecorView()) == null || (background = decorView.getBackground()) == null || background.getAlpha() != 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x002f, code lost:
    
        if (r7.b() < r7.a()) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ie a(Context context, q6 q6Var) {
        boolean z;
        if (context == null) {
            return ie.b;
        }
        try {
            r6 b = q6Var.b();
            int a2 = a(context);
            boolean z2 = false;
            if (b.b() == b.a()) {
                if (context.getResources().getConfiguration().orientation != 2) {
                    z = true;
                }
                z = false;
            }
            if (a2 == 0 || a2 == 2) {
                z2 = z;
            } else if (!z) {
                z2 = true;
            }
            if (z2) {
                if (a2 == 0) {
                    return ie.b;
                }
                if (a2 == 1) {
                    return ie.h;
                }
                if (a2 == 2) {
                    return ie.d;
                }
                if (a2 != 3) {
                    return ie.b;
                }
                return ie.i;
            }
            if (a2 == 0) {
                return ie.c;
            }
            if (a2 == 1) {
                return ie.f;
            }
            if (a2 == 2) {
                return ie.e;
            }
            if (a2 != 3) {
                return ie.c;
            }
            return ie.g;
        } catch (Exception e) {
            mb.b("Cannot getOrientation", e);
            return ie.c;
        }
    }

    public static final int a(Context context) {
        Display defaultDisplay;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return 0;
        }
        return defaultDisplay.getRotation();
    }
}
