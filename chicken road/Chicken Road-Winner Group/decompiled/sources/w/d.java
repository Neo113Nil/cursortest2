package w;

import A.m;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import b0.j;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l.C1099s;
import p.C1156f;
import p.C1161k;
import v.C1213c;
import v.C1215e;
import v.InterfaceC1212b;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final F2.b f10438a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1156f f10439b;

    static {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            f10438a = new i();
        } else if (i3 >= 28) {
            f10438a = new h();
        } else if (i3 >= 26) {
            f10438a = new g();
        } else {
            Method method = f.f10447j;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f10438a = new f();
            } else {
                f10438a = new e();
            }
        }
        f10439b = new C1156f(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r3.equals(r5) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, InterfaceC1212b interfaceC1212b, Resources resources, int i3, String str, int i4, int i5, C1099s c1099s) {
        Typeface l3;
        Typeface typeface;
        Typeface typeface2;
        int i6 = 18;
        int i7 = 1;
        int i8 = 0;
        if (interfaceC1212b instanceof C1215e) {
            C1215e c1215e = (C1215e) interfaceC1212b;
            String str2 = c1215e.f10404d;
            l3 = null;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                new Handler(Looper.getMainLooper()).post(new D1.a(c1099s, i6, typeface));
                return typeface;
            }
            boolean z3 = c1215e.f10403c == 0;
            int i9 = c1215e.f10402b;
            Handler handler = new Handler(Looper.getMainLooper());
            j jVar = new j();
            jVar.f2462a = c1099s;
            A.e eVar = c1215e.f10401a;
            a1.e eVar2 = new a1.e(jVar, i7, handler);
            if (z3) {
                C1156f c1156f = A.i.f20a;
                String str3 = ((String) eVar.f10e) + TokenBuilder.TOKEN_DELIMITER + i5;
                typeface2 = (Typeface) A.i.f20a.a(str3);
                if (typeface2 != null) {
                    handler.post(new A.a(jVar, i8, typeface2));
                } else if (i9 == -1) {
                    A.h a3 = A.i.a(str3, context, eVar, i5);
                    eVar2.C(a3);
                    l3 = a3.f18a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    A.h hVar = (A.h) A.i.f21b.submit(new A.f(str3, context, eVar, i5, 0)).get(i9, TimeUnit.MILLISECONDS);
                                    eVar2.C(hVar);
                                    l3 = hVar.f18a;
                                } catch (TimeoutException unused) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e3) {
                                throw e3;
                            }
                        } catch (ExecutionException e4) {
                            throw new RuntimeException(e4);
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) eVar2.f1789c).post(new A.b((j) eVar2.f1788b, -3));
                    }
                }
            } else {
                C1156f c1156f2 = A.i.f20a;
                String str4 = ((String) eVar.f10e) + TokenBuilder.TOKEN_DELIMITER + i5;
                typeface2 = (Typeface) A.i.f20a.a(str4);
                if (typeface2 != null) {
                    handler.post(new A.a(jVar, i8, typeface2));
                } else {
                    A.g gVar = new A.g(i8, eVar2);
                    synchronized (A.i.f22c) {
                        try {
                            C1161k c1161k = A.i.f23d;
                            ArrayList arrayList = (ArrayList) c1161k.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(gVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(gVar);
                                c1161k.put(str4, arrayList2);
                                A.f fVar = new A.f(str4, context, eVar, i5, 1);
                                ThreadPoolExecutor threadPoolExecutor = A.i.f21b;
                                A.g gVar2 = new A.g(i7, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                m mVar = new m();
                                mVar.f31b = fVar;
                                mVar.f32c = gVar2;
                                mVar.f33d = handler2;
                                threadPoolExecutor.execute(mVar);
                            }
                        } finally {
                        }
                    }
                }
            }
            l3 = typeface2;
        } else {
            l3 = f10438a.l(context, (C1213c) interfaceC1212b, resources, i5);
            if (l3 != null) {
                new Handler(Looper.getMainLooper()).post(new D1.a(c1099s, i6, l3));
            } else {
                c1099s.a();
            }
        }
        if (l3 != null) {
            f10439b.b(b(resources, i3, str, i4, i5), l3);
        }
        return l3;
    }

    public static String b(Resources resources, int i3, String str, int i4, int i5) {
        return resources.getResourcePackageName(i3) + '-' + str + '-' + i4 + '-' + i3 + '-' + i5;
    }
}
