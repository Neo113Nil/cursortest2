package I;

import A1.x0;
import C0.RunnableC0085d;
import D6.y0;
import H2.q;
import K4.C0321h;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.sentry.ProfilingTraceData;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import r.l;
import w1.P2;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final p3.f f3467a;

    /* renamed from: b, reason: collision with root package name */
    public static final r.g f3468b;

    static {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            f3467a = new k();
        } else if (i7 >= 28) {
            f3467a = new j();
        } else if (i7 >= 26) {
            f3467a = new i();
        } else {
            Method method = h.f3476f;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f3467a = new h();
            } else {
                f3467a = new g();
            }
        }
        f3468b = new r.g(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r6.equals(r10) == false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, H.e eVar, Resources resources, int i7, String str, int i8, int i9, C0321h c0321h) {
        Typeface v6;
        Typeface typeface;
        Typeface typeface2;
        int i10 = 12;
        int i11 = 1;
        int i12 = 17;
        boolean z4 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (eVar instanceof H.h) {
            H.h hVar = (H.h) eVar;
            String str2 = hVar.f3168d;
            v6 = null;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                new Handler(Looper.getMainLooper()).post(new A0.f(i12, c0321h, typeface));
                return typeface;
            }
            Object[] objArr3 = hVar.f3167c == 0;
            int i13 = hVar.f3166b;
            Handler handler = new Handler(Looper.getMainLooper());
            x0 x0Var = new x0(4, z4);
            x0Var.f613b = c0321h;
            I4.j jVar = hVar.f3165a;
            P2 p22 = new P2(i12, x0Var, handler, objArr2 == true ? 1 : 0);
            if (objArr3 == true) {
                r.g gVar = M.e.f4528a;
                String str3 = ((String) jVar.f3682f) + "-" + i9;
                typeface2 = (Typeface) M.e.f4528a.get(str3);
                if (typeface2 != null) {
                    handler.post(new y0(i10, x0Var, typeface2));
                } else if (i13 == -1) {
                    M.d a2 = M.e.a(str3, context, jVar, i9);
                    p22.N(a2);
                    v6 = a2.f4526a;
                } else {
                    try {
                        try {
                            try {
                                M.d dVar = (M.d) M.e.f4529b.submit(new M.b(str3, context, jVar, i9, 0)).get(i13, TimeUnit.MILLISECONDS);
                                p22.N(dVar);
                                v6 = dVar.f4526a;
                            } catch (InterruptedException e7) {
                                throw e7;
                            }
                        } catch (ExecutionException e8) {
                            throw new RuntimeException(e8);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) p22.f17509c).post(new RunnableC0085d((x0) p22.f17508b, -3));
                    }
                }
            } else {
                r.g gVar2 = M.e.f4528a;
                String str4 = ((String) jVar.f3682f) + "-" + i9;
                typeface2 = (Typeface) M.e.f4528a.get(str4);
                if (typeface2 != null) {
                    handler.post(new y0(i10, x0Var, typeface2));
                } else {
                    M.c cVar = new M.c(p22, objArr == true ? 1 : 0);
                    synchronized (M.e.f4530c) {
                        try {
                            l lVar = M.e.f4531d;
                            ArrayList arrayList = (ArrayList) lVar.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(cVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(cVar);
                                lVar.put(str4, arrayList2);
                                M.b bVar = new M.b(str4, context, jVar, i9, 1);
                                ThreadPoolExecutor threadPoolExecutor = M.e.f4529b;
                                M.c cVar2 = new M.c(str4, i11);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                q qVar = new q(i11);
                                qVar.f3287b = bVar;
                                qVar.f3288c = cVar2;
                                qVar.f3289d = handler2;
                                threadPoolExecutor.execute(qVar);
                            }
                        } finally {
                        }
                    }
                }
            }
            v6 = typeface2;
        } else {
            v6 = f3467a.v(context, (H.f) eVar, resources, i9);
            if (v6 != null) {
                new Handler(Looper.getMainLooper()).post(new A0.f(i12, c0321h, v6));
            } else {
                c0321h.a();
            }
        }
        if (v6 != null) {
            f3468b.put(b(resources, i7, str, i8, i9), v6);
        }
        return v6;
    }

    public static String b(Resources resources, int i7, String str, int i8, int i9) {
        return resources.getResourcePackageName(i7) + '-' + str + '-' + i8 + '-' + i7 + '-' + i9;
    }
}
