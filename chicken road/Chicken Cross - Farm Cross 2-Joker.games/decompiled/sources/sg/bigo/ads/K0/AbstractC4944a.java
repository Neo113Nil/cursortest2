package sg.bigo.ads.K0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.play.core.splitcompat.SplitCompat;
import java.util.Locale;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.K0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4944a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f12353a = null;
    public static boolean b = true;

    public static int a(Context context, int i) {
        try {
            try {
                return context.getResources().getColor(i);
            } catch (Exception unused) {
                b(context);
                return context.getResources().getColor(i);
            }
        } catch (Exception unused2) {
            AbstractC5496a.a("BigoAAB", String.valueOf("Activity context getColor failed. the resId is " + Integer.toHexString(i)));
            try {
                Context a2 = a(context);
                try {
                    return a2.getResources().getColor(i);
                } catch (Exception unused3) {
                    b(a2);
                    return a2.getResources().getColor(i);
                }
            } catch (Exception unused4) {
                AbstractC5496a.a("BigoAAB", String.valueOf("Application context getColor failed. the resId is " + Integer.toHexString(i)));
                return 0;
            }
        }
    }

    public static int b(Context context, int i) {
        try {
            try {
                return context.getResources().getDimensionPixelSize(i);
            } catch (Exception unused) {
                b(context);
                return context.getResources().getDimensionPixelSize(i);
            }
        } catch (Exception unused2) {
            AbstractC5496a.a("BigoAAB", String.valueOf("Activity context getDimensionPixelSize failed. the resId is " + Integer.toHexString(i)));
            try {
                Context a2 = a(context);
                try {
                    return a2.getResources().getDimensionPixelSize(i);
                } catch (Exception unused3) {
                    b(a2);
                    return a2.getResources().getDimensionPixelSize(i);
                }
            } catch (Exception unused4) {
                AbstractC5496a.a("BigoAAB", String.valueOf("Application context getDimensionPixelSize failed. the resId is " + Integer.toHexString(i)));
                return 0;
            }
        }
    }

    public static Drawable c(Context context, int i) {
        if (context != null) {
            try {
                try {
                    return context.getResources().getDrawable(i);
                } catch (Exception unused) {
                    b(context);
                    return context.getResources().getDrawable(i);
                }
            } catch (Exception unused2) {
                AbstractC5496a.a("BigoAAB", String.valueOf("Activity context getDrawable failed. the resId is " + Integer.toHexString(i)));
                try {
                    Context a2 = a(context);
                    try {
                        return a2.getResources().getDrawable(i);
                    } catch (Exception unused3) {
                        b(a2);
                        return a2.getResources().getDrawable(i);
                    }
                } catch (Exception unused4) {
                    AbstractC5496a.a("BigoAAB", String.valueOf("Application context getDrawable failed. the resId is " + Integer.toHexString(i)));
                }
            }
        }
        return null;
    }

    public static Context a(Context context) {
        if (b) {
            b = false;
            try {
                Context applicationContext = context.getApplicationContext();
                f12353a = applicationContext.createPackageContext(applicationContext.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        Context context2 = f12353a;
        return context2 != null ? context2 : context.getApplicationContext();
    }

    public static String b(Context context, int i, Object... objArr) {
        try {
            return objArr.length > 0 ? context.getString(i, objArr) : context.getString(i);
        } catch (Exception unused) {
            b(context);
            return objArr.length > 0 ? context.getString(i, objArr) : context.getString(i);
        }
    }

    public static void b(Context context) {
        try {
            SplitCompat.install(context);
        } catch (Throwable unused) {
            AbstractC5496a.a("BigoAAB", "SplitCompact not found.");
        }
    }

    public static String a(Context context, int i, Object... objArr) {
        try {
            return b(context, i, objArr);
        } catch (Exception unused) {
            AbstractC5496a.a("BigoAAB", String.valueOf("Activity context getString failed. the resId is " + Integer.toHexString(i)));
            try {
                return b(a(context), i, objArr);
            } catch (Exception unused2) {
                AbstractC5496a.a("BigoAAB", String.valueOf("Application context getString failed. the resId is " + Integer.toHexString(i)));
                return "";
            }
        }
    }

    public static CharSequence a(Context context, int i, Locale locale) {
        Resources resources = context != null ? context.getResources() : null;
        if (resources == null) {
            return null;
        }
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration).getResources().getText(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static View a(Context context, int i, ViewGroup viewGroup, boolean z) {
        View inflate;
        View inflate2;
        if (context != null) {
            try {
                try {
                    inflate = LayoutInflater.from(context).inflate(i, viewGroup, z);
                } catch (Exception unused) {
                    b(context);
                    inflate = LayoutInflater.from(context).inflate(i, viewGroup, z);
                }
            } catch (Exception unused2) {
                AbstractC5496a.a("BigoAAB", String.valueOf("Self context inflateView failed. the resId is " + Integer.toHexString(i)));
            }
            if (inflate == null) {
                return inflate;
            }
            try {
                Context a2 = a(context);
                try {
                    inflate2 = LayoutInflater.from(a2).inflate(i, viewGroup, z);
                } catch (Exception unused3) {
                    b(a2);
                    inflate2 = LayoutInflater.from(a2).inflate(i, viewGroup, z);
                }
                return inflate2;
            } catch (Exception unused4) {
                AbstractC5496a.a("BigoAAB", String.valueOf("Application context inflateView failed. the resId is " + Integer.toHexString(i)));
                return inflate;
            }
        }
        inflate = null;
        if (inflate == null) {
        }
    }
}
