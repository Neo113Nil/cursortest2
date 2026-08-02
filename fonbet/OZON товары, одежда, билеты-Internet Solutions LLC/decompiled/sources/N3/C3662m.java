package N3;

import android.net.Uri;
import com.google.common.collect.AbstractC5880y;
import f4.C6418c;
import g4.C6622d;
import h4.C6798d;
import j3.C7272n;
import j4.C7277a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import m3.C8056I;
import u4.C9946B;
import u4.C9948b;
import u4.C9950d;
import u4.C9953g;
import u4.C9955i;
import v4.C10221b;
import w4.C10427a;

/* renamed from: N3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3662m implements u {

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f18623f = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: g, reason: collision with root package name */
    private static final a f18624g = new a(new C3660k());

    /* renamed from: h, reason: collision with root package name */
    private static final a f18625h = new a(new C3661l());

    /* renamed from: b, reason: collision with root package name */
    private AbstractC5880y<C7272n> f18626b;

    /* renamed from: e, reason: collision with root package name */
    private int f18629e;

    /* renamed from: d, reason: collision with root package name */
    private k4.e f18628d = new k4.e();

    /* renamed from: c, reason: collision with root package name */
    private boolean f18627c = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N3.m$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC0356a f18630a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f18631b = new AtomicBoolean(false);

        /* renamed from: N3.m$a$a, reason: collision with other inner class name */
        public interface InterfaceC0356a {
            Constructor<? extends InterfaceC3665p> a() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException;
        }

        public a(InterfaceC0356a interfaceC0356a) {
            this.f18630a = interfaceC0356a;
        }

        public final InterfaceC3665p a(Object... objArr) {
            Constructor<? extends InterfaceC3665p> a11;
            synchronized (this.f18631b) {
                if (!this.f18631b.get()) {
                    try {
                        a11 = this.f18630a.a();
                    } catch (ClassNotFoundException unused) {
                        this.f18631b.set(true);
                    } catch (Exception e11) {
                        throw new RuntimeException("Error instantiating extension", e11);
                    }
                }
                a11 = null;
            }
            if (a11 == null) {
                return null;
            }
            try {
                return a11.newInstance(objArr);
            } catch (Exception e12) {
                throw new IllegalStateException("Unexpected error creating extractor", e12);
            }
        }
    }

    private void f(int i11, ArrayList arrayList) {
        switch (i11) {
            case 0:
                arrayList.add(new C9948b());
                break;
            case 1:
                arrayList.add(new C9950d());
                break;
            case 2:
                arrayList.add(new C9953g());
                break;
            case 3:
                arrayList.add(new O3.b());
                break;
            case 4:
                InterfaceC3665p a11 = f18624g.a(0);
                if (a11 == null) {
                    arrayList.add(new S3.c());
                    break;
                } else {
                    arrayList.add(a11);
                    break;
                }
            case 5:
                arrayList.add(new T3.c());
                break;
            case 6:
                arrayList.add(new C6418c(this.f18628d, this.f18627c ? 0 : 2));
                break;
            case 7:
                arrayList.add(new C6622d(0));
                break;
            case 8:
                arrayList.add(new C6798d(this.f18628d, this.f18627c ? 0 : 32, null, AbstractC5880y.v()));
                arrayList.add(new h4.i(this.f18628d, this.f18627c ? 0 : 16));
                break;
            case 9:
                arrayList.add(new i4.d());
                break;
            case 10:
                arrayList.add(new C9946B());
                break;
            case 11:
                if (this.f18626b == null) {
                    this.f18626b = AbstractC5880y.v();
                }
                arrayList.add(new u4.I(1, !this.f18627c ? 1 : 0, this.f18628d, new C8056I(0L), new C9955i(0, this.f18626b)));
                break;
            case 12:
                arrayList.add(new C10221b());
                break;
            case 14:
                arrayList.add(new V3.a(this.f18629e));
                break;
            case 15:
                InterfaceC3665p a12 = f18625h.a(new Object[0]);
                if (a12 != null) {
                    arrayList.add(a12);
                    break;
                }
                break;
            case 16:
                arrayList.add(new P3.b(!this.f18627c ? 1 : 0, this.f18628d));
                break;
            case 17:
                arrayList.add(new C7277a());
                break;
            case 18:
                arrayList.add(new C10427a());
                break;
            case 19:
                arrayList.add(new R3.a());
                break;
            case 20:
                arrayList.add(new U3.a());
                break;
            case 21:
                arrayList.add(new Q3.a());
                break;
        }
    }

    @Override // N3.u
    public final void a(k4.e eVar) {
        synchronized (this) {
            this.f18628d = eVar;
        }
    }

    @Override // N3.u
    public final void b() {
        synchronized (this) {
        }
    }

    @Override // N3.u
    @Deprecated
    public final void c(boolean z11) {
        synchronized (this) {
            this.f18627c = z11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x002e, B:15:0x0036, B:18:0x003c, B:21:0x0042, B:23:0x0045, B:27:0x004a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x002e, B:15:0x0036, B:18:0x003c, B:21:0x0042, B:23:0x0045, B:27:0x004a), top: B:2:0x0001 }] */
    @Override // N3.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized InterfaceC3665p[] d(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        String str;
        int b11;
        int c11;
        int i11;
        try {
            int[] iArr = f18623f;
            arrayList = new ArrayList(21);
            List<String> list = map.get("Content-Type");
            if (list != null && !list.isEmpty()) {
                str = list.get(0);
                b11 = Fl0.b.b(str);
                if (b11 != -1) {
                    f(b11, arrayList);
                }
                c11 = Fl0.b.c(uri);
                if (c11 != -1 && c11 != b11) {
                    f(c11, arrayList);
                }
                for (i11 = 0; i11 < 21; i11++) {
                    int i12 = iArr[i11];
                    if (i12 != b11 && i12 != c11) {
                        f(i12, arrayList);
                    }
                }
            }
            str = null;
            b11 = Fl0.b.b(str);
            if (b11 != -1) {
            }
            c11 = Fl0.b.c(uri);
            if (c11 != -1) {
                f(c11, arrayList);
            }
            while (i11 < 21) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (InterfaceC3665p[]) arrayList.toArray(new InterfaceC3665p[0]);
    }

    @Override // N3.u
    public final synchronized InterfaceC3665p[] e() {
        return d(Uri.EMPTY, new HashMap());
    }

    public final synchronized void g() {
        this.f18629e = 1;
    }
}
