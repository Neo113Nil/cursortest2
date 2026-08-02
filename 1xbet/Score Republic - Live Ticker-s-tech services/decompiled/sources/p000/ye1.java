package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ye1 {

    /* JADX INFO: renamed from: a */
    public static final aa0 f9283a;

    /* JADX INFO: renamed from: b */
    public static final rk0 f9284b;

    /* JADX INFO: renamed from: c */
    public static Paint f9285c;

    static {
        wo1.m5378a("TypefaceCompat static init");
        if (Build.VERSION.SDK_INT >= 31) {
            f9283a = new ze1();
        } else {
            f9283a = new aa0();
        }
        f9284b = new rk0(16);
        f9285c = null;
        Trace.endSection();
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m5790a(Context context, q40[] q40VarArr, int i) {
        wo1.m5378a("TypefaceCompat.createFromFontInfo");
        try {
            aa0 aa0Var = f9283a;
            aa0Var.getClass();
            Typeface typefaceBuild = null;
            try {
                FontFamily fontFamilyM164n = aa0Var.m164n(q40VarArr, context.getContentResolver());
                if (fontFamilyM164n != null) {
                    typefaceBuild = new Typeface.CustomFallbackBuilder(fontFamilyM164n).setStyle(aa0.m150m(fontFamilyM164n, i).getStyle()).build();
                }
            } catch (Exception e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
            Trace.endSection();
            return typefaceBuild;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:127:0x02dd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static Typeface m5791b(Context context, m40 m40Var, Resources resources, int i, String str, int i2, int i3, C0940z6 c0940z6) {
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i4 = 12;
        Typeface typefaceBuild2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (m40Var instanceof p40) {
            p40 p40Var = (p40) m40Var;
            String str2 = p40Var.f5981d;
            int i5 = 1;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = m5794e(str2)) == null) {
                ArrayList arrayList = p40Var.f5978a;
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i6 = 0;
                        while (true) {
                            if (i6 >= arrayList.size()) {
                                int i7 = 0;
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                while (true) {
                                    if (i7 < arrayList.size()) {
                                        f40 f40Var = (f40) arrayList.get(i7);
                                        if (i7 == arrayList.size() - 1 && TextUtils.isEmpty(f40Var.f2307f)) {
                                            customFallbackBuilder.setSystemFallback(f40Var.f2306e);
                                        } else {
                                            String str3 = f40Var.f2306e;
                                            String str4 = f40Var.f2307f;
                                            Font fontM5795f = m5795f(m5794e(str3));
                                            if (fontM5795f == null) {
                                                Log.w("TypefaceCompat", "Unable identify the primary font for " + f40Var.f2306e + ". Falling back to provider font.");
                                            } else {
                                                if (TextUtils.isEmpty(str4)) {
                                                    fontFamilyBuild = new FontFamily.Builder(fontM5795f).build();
                                                } else {
                                                    try {
                                                        fontFamilyBuild = new FontFamily.Builder(AbstractC0364jm.m2933a(fontM5795f).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                }
                                                if (customFallbackBuilder == null) {
                                                    customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilder.addCustomFallback(fontFamilyBuild);
                                                }
                                                i7++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilder.build();
                                    break;
                                }
                            }
                            if (m5794e(((f40) arrayList.get(i6)).f2306e) != null) {
                                i6++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = m5794e(((f40) arrayList.get(0)).f2306e);
            }
            if (typefaceBuild != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0195f1(i4, c0940z6, typefaceBuild));
                f9284b.m4363c(m5793d(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            Object[] objArr5 = p40Var.f5980c == 0;
            int i8 = p40Var.f5979b;
            Handler handler = new Handler(Looper.getMainLooper());
            an0 an0Var = new an0(10, (boolean) (objArr4 == true ? 1 : 0));
            an0Var.f254k = c0940z6;
            ArrayList arrayList2 = p40Var.f5978a;
            ja0 ja0Var = new ja0(1, handler);
            C0312i6 c0312i6 = new C0312i6(15, an0Var, ja0Var);
            if (objArr5 != true) {
                String strM3167a = l40.m3167a(i3, arrayList2);
                Typeface typeface = (Typeface) l40.f4669a.m4362b(strM3167a);
                if (typeface != null) {
                    ja0Var.execute(new RunnableC0529o2(an0Var, typeface, i5, objArr2 == true ? 1 : 0));
                    typefaceBuild2 = typeface;
                } else {
                    j40 j40Var = new j40(objArr == true ? 1 : 0, c0312i6);
                    synchronized (l40.f4671c) {
                        try {
                            w71 w71Var = l40.f4672d;
                            ArrayList arrayList3 = (ArrayList) w71Var.get(strM3167a);
                            if (arrayList3 != null) {
                                arrayList3.add(j40Var);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(j40Var);
                                w71Var.put(strM3167a, arrayList4);
                                i40 i40Var = new i40(strM3167a, context, arrayList2, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = l40.f4670b;
                                j40 j40Var2 = new j40(i5, strM3167a);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                RunnableC0702sr runnableC0702sr = new RunnableC0702sr();
                                runnableC0702sr.f7195l = i40Var;
                                runnableC0702sr.f7194k = j40Var2;
                                runnableC0702sr.f7196m = handler2;
                                threadPoolExecutor.execute(runnableC0702sr);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    C0270h1.m2190f("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                f40 f40Var2 = (f40) arrayList2.get(0);
                rk0 rk0Var = l40.f4669a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{f40Var2}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strM3167a2 = l40.m3167a(i3, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) l40.f4669a.m4362b(strM3167a2);
                if (typeface2 != null) {
                    ja0Var.execute(new RunnableC0529o2(an0Var, typeface2, i5, objArr3 == true ? 1 : 0));
                    typefaceBuild2 = typeface2;
                } else if (i8 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = new Object[]{f40Var2}[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    k40 k40VarM3168b = l40.m3168b(strM3167a2, context, Collections.unmodifiableList(arrayList6), i3);
                    c0312i6.m2548t(k40VarM3168b);
                    typefaceBuild2 = k40VarM3168b.f4279a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    k40 k40Var = (k40) l40.f4670b.submit(new i40(strM3167a2, context, f40Var2, i3, 0)).get(i8, TimeUnit.MILLISECONDS);
                                    c0312i6.m2548t(k40Var);
                                    typefaceBuild2 = k40Var.f4279a;
                                } catch (TimeoutException unused2) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (ExecutionException e) {
                                throw new RuntimeException(e);
                            }
                        } catch (InterruptedException e2) {
                            throw e2;
                        }
                    } catch (InterruptedException unused3) {
                        ((ja0) c0312i6.f3448l).execute(new RunnableC0393ke((an0) c0312i6.f3447k, -3));
                    }
                }
            }
        } else {
            n40 n40Var = (n40) m40Var;
            f9283a.getClass();
            try {
                FontFamily.Builder builder = null;
                for (o40 o40Var : n40Var.f5293a) {
                    try {
                        try {
                            try {
                                Font fontBuild = new Font.Builder(resources, o40Var.f5622e).setWeight(o40Var.f5618a).setSlant(o40Var.f5619b ? 1 : 0).setTtcIndex(o40Var.f5621d).setFontVariationSettings(o40Var.f5620c).build();
                                if (builder == null) {
                                    builder = new FontFamily.Builder(fontBuild);
                                } else {
                                    builder.addFont(fontBuild);
                                }
                            } catch (Exception e3) {
                                e = e3;
                                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                                if (typefaceBuild2 != null) {
                                    new Handler(Looper.getMainLooper()).post(new RunnableC0195f1(i4, c0940z6, typefaceBuild2));
                                } else {
                                    c0940z6.m5863a();
                                }
                                if (typefaceBuild2 != null) {
                                    f9284b.m4363c(m5793d(resources, i, str, i2, i3), typefaceBuild2);
                                }
                                return typefaceBuild2;
                            }
                        } catch (IOException unused4) {
                        }
                    } catch (IOException unused5) {
                    }
                }
                if (builder != null) {
                    FontFamily fontFamilyBuild2 = builder.build();
                    typefaceBuild2 = new Typeface.CustomFallbackBuilder(fontFamilyBuild2).setStyle(aa0.m150m(fontFamilyBuild2, i3).getStyle()).build();
                }
            } catch (Exception e4) {
                e = e4;
            }
            if (typefaceBuild2 != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0195f1(i4, c0940z6, typefaceBuild2));
            } else {
                c0940z6.m5863a();
            }
        }
        if (typefaceBuild2 != null) {
            f9284b.m4363c(m5793d(resources, i, str, i2, i3), typefaceBuild2);
        }
        return typefaceBuild2;
    }

    /* JADX INFO: renamed from: c */
    public static Typeface m5792c(Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceBuild;
        f9283a.getClass();
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            typefaceBuild = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            typefaceBuild = null;
        }
        if (typefaceBuild != null) {
            f9284b.m4363c(m5793d(resources, i, str, i2, i3), typefaceBuild);
        }
        return typefaceBuild;
    }

    /* JADX INFO: renamed from: d */
    public static String m5793d(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* JADX INFO: renamed from: e */
    public static Typeface m5794e(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static Font m5795f(Typeface typeface) {
        if (f9285c == null) {
            f9285c = new Paint();
        }
        f9285c.setTextSize(10.0f);
        f9285c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f9285c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
