package g1;

import G.v;
import G4.l;
import O4.ExecutorC0255a;
import S2.q;
import a3.CallableC0463g;
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
import com.google.android.gms.internal.ads.OF;
import d0.AbstractC1907b;
import e2.C1930k;
import f1.InterfaceC1942d;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k1.RunnableC2029a;
import r.Q;
import r.r;
import t3.AbstractC2425d;

/* renamed from: g1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1970d {

    /* renamed from: a, reason: collision with root package name */
    public static final l f17079a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f17080b;

    /* renamed from: c, reason: collision with root package name */
    public static Paint f17081c;

    static {
        AbstractC2425d.k("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            f17079a = new C1976j();
        } else if (i >= 29) {
            f17079a = new C1975i();
        } else if (i >= 28) {
            f17079a = new C1974h();
        } else if (i >= 26) {
            f17079a = new C1973g();
        } else {
            if (i >= 24) {
                Method method = C1972f.f17086h;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f17079a = new C1972f();
                }
            }
            f17079a = new C1971e();
        }
        f17080b = new r(16);
        f17081c = null;
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(Context context, InterfaceC1942d interfaceC1942d, Resources resources, int i, String str, int i5, int i6, M0.e eVar, boolean z3) {
        Typeface q5;
        Typeface build;
        Font.Builder fontVariationSettings;
        Font build2;
        FontFamily build3;
        int i7 = 17;
        int i8 = 3;
        int i9 = 1;
        boolean z5 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (interfaceC1942d instanceof f1.g) {
            f1.g gVar = (f1.g) interfaceC1942d;
            String str2 = gVar.f16955d;
            q5 = null;
            if (TextUtils.isEmpty(str2) || (build = c(str2)) == null) {
                ArrayList arrayList = gVar.f16952a;
                if (arrayList.size() == 1) {
                    build = c(((k1.e) arrayList.get(0)).f17562e);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= arrayList.size()) {
                                int i11 = 0;
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                while (true) {
                                    if (i11 >= arrayList.size()) {
                                        break;
                                    }
                                    k1.e eVar2 = (k1.e) arrayList.get(i11);
                                    if (i11 == arrayList.size() - 1 && TextUtils.isEmpty(eVar2.f)) {
                                        customFallbackBuilder.setSystemFallback(eVar2.f17562e);
                                        break;
                                    }
                                    Font d5 = d(c(eVar2.f17562e));
                                    if (d5 == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + eVar2.f17562e + ". Falling back to provider font.");
                                        break;
                                    }
                                    String str3 = eVar2.f;
                                    if (TextUtils.isEmpty(str3)) {
                                        build3 = OF.g(d5).build();
                                    } else {
                                        try {
                                            OF.r();
                                            OF.v();
                                            fontVariationSettings = AbstractC1907b.d(d5).setFontVariationSettings(str3);
                                            build2 = fontVariationSettings.build();
                                            build3 = OF.g(build2).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                        }
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = OF.c(build3);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build3);
                                    }
                                    i11++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (c(((k1.e) arrayList.get(i10)).f17562e) == null) {
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                if (eVar != null) {
                    new Handler(Looper.getMainLooper()).post(new Q3.g(i8, eVar, build));
                }
                f17080b.c(b(resources, i, str, i5, i6), build);
                return build;
            }
            Object[] objArr4 = !z3 ? eVar != null : gVar.f16954c != 0;
            int i12 = z3 ? gVar.f16953b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            C1930k c1930k = new C1930k(26, z5);
            c1930k.f16910l = eVar;
            ArrayList arrayList2 = gVar.f16952a;
            ExecutorC0255a executorC0255a = new ExecutorC0255a(handler);
            v vVar = new v(14, c1930k, executorC0255a);
            if (objArr4 != true) {
                String a5 = k1.h.a(i6, arrayList2);
                Typeface typeface = (Typeface) k1.h.f17568a.b(a5);
                if (typeface != null) {
                    executorC0255a.execute(new D3.h(i7, c1930k, typeface, objArr2 == true ? 1 : 0));
                    q5 = typeface;
                } else {
                    k1.f fVar = new k1.f(objArr == true ? 1 : 0, vVar);
                    synchronized (k1.h.f17570c) {
                        try {
                            Q q6 = k1.h.f17571d;
                            ArrayList arrayList3 = (ArrayList) q6.get(a5);
                            if (arrayList3 != null) {
                                arrayList3.add(fVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(fVar);
                                q6.put(a5, arrayList4);
                                CallableC0463g callableC0463g = new CallableC0463g(a5, context, arrayList2, i6, 2);
                                ThreadPoolExecutor threadPoolExecutor = k1.h.f17569b;
                                k1.f fVar2 = new k1.f(i9, a5);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                q qVar = new q(9);
                                qVar.f5347l = callableC0463g;
                                qVar.f5348m = fVar2;
                                qVar.f5349n = handler2;
                                threadPoolExecutor.execute(qVar);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                k1.e eVar3 = (k1.e) arrayList2.get(0);
                r rVar = k1.h.f17568a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{eVar3}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String a6 = k1.h.a(i6, Collections.unmodifiableList(arrayList5));
                Typeface typeface2 = (Typeface) k1.h.f17568a.b(a6);
                if (typeface2 != null) {
                    executorC0255a.execute(new D3.h(i7, c1930k, typeface2, objArr3 == true ? 1 : 0));
                    q5 = typeface2;
                } else if (i12 == -1) {
                    Object[] objArr5 = {eVar3};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr5[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    k1.g b3 = k1.h.b(a6, context, Collections.unmodifiableList(arrayList6), i6);
                    vVar.l(b3);
                    q5 = b3.f17566a;
                } else {
                    try {
                        try {
                            try {
                                k1.g gVar2 = (k1.g) k1.h.f17569b.submit(new CallableC0463g(a6, context, eVar3, i6, 1)).get(i12, TimeUnit.MILLISECONDS);
                                vVar.l(gVar2);
                                q5 = gVar2.f17566a;
                            } catch (InterruptedException e3) {
                                throw e3;
                            }
                        } catch (ExecutionException e5) {
                            throw new RuntimeException(e5);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((ExecutorC0255a) vVar.f1750m).execute(new RunnableC2029a((C1930k) vVar.f1749l, -3));
                    }
                }
            }
        } else {
            q5 = f17079a.q(context, (f1.e) interfaceC1942d, resources, i6);
            if (eVar != null) {
                if (q5 != null) {
                    new Handler(Looper.getMainLooper()).post(new Q3.g(i8, eVar, q5));
                } else {
                    eVar.a(-3);
                }
            }
        }
        if (q5 != null) {
            f17080b.c(b(resources, i, str, i5, i6), q5);
        }
        return q5;
    }

    public static String b(Resources resources, int i, String str, int i5, int i6) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i5 + '-' + i + '-' + i6;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (f17081c == null) {
            f17081c = new Paint();
        }
        f17081c.setTextSize(10.0f);
        f17081c.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f17081c);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }
}
