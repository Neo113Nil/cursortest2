package S00;

import Jb.j;
import P00.l;
import Sc.o;
import T00.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class e implements d {

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f25623c;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final j f25624a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap f25625b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final m f25626a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ReentrantLock f25627b;

        /* renamed from: c, reason: collision with root package name */
        private volatile long f25628c;

        /* renamed from: d, reason: collision with root package name */
        private volatile long f25629d;

        /* renamed from: e, reason: collision with root package name */
        private volatile long f25630e;

        /* renamed from: f, reason: collision with root package name */
        private volatile long f25631f;

        /* renamed from: S00.e$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0508a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f25632a;

            static {
                int[] iArr = new int[l.values().length];
                try {
                    iArr[l.PARSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[l.MAP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f25632a = iArr;
            }
        }

        public a(@NotNull m layout) {
            Intrinsics.checkNotNullParameter(layout, "layout");
            this.f25626a = layout;
            this.f25627b = new ReentrantLock();
        }

        public final void a(@NotNull l step, long j11) {
            Intrinsics.checkNotNullParameter(step, "step");
            ReentrantLock reentrantLock = this.f25627b;
            reentrantLock.lock();
            try {
                int i11 = C0508a.f25632a[step.ordinal()];
                if (i11 == 1) {
                    this.f25629d = Math.max(this.f25629d, j11);
                } else {
                    if (i11 != 2) {
                        throw new o();
                    }
                    this.f25631f = Math.max(this.f25631f, j11);
                }
                Unit unit = Unit.f71690a;
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        public final void b(@NotNull l step, long j11) {
            Intrinsics.checkNotNullParameter(step, "step");
            ReentrantLock reentrantLock = this.f25627b;
            reentrantLock.lock();
            try {
                int i11 = C0508a.f25632a[step.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new o();
                    }
                    if (this.f25630e != 0) {
                        if (j11 < this.f25630e) {
                        }
                    }
                    this.f25630e = j11;
                } else if (this.f25628c == 0 || j11 < this.f25628c) {
                    this.f25628c = j11;
                }
                Unit unit = Unit.f71690a;
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        @NotNull
        public final c c(String str) {
            long j11;
            long j12;
            long j13;
            long j14;
            m mVar = this.f25626a;
            String d11 = mVar.d();
            String d12 = str == null ? mVar.d() : str;
            String e11 = mVar.e();
            String valueOf = String.valueOf(mVar.c());
            ReentrantLock reentrantLock = this.f25627b;
            reentrantLock.lock();
            try {
                l lVar = l.PARSE;
                int[] iArr = C0508a.f25632a;
                int i11 = iArr[lVar.ordinal()];
                if (i11 == 1) {
                    j11 = this.f25628c;
                } else {
                    if (i11 != 2) {
                        throw new o();
                    }
                    j11 = this.f25630e;
                }
                int i12 = iArr[lVar.ordinal()];
                if (i12 == 1) {
                    j12 = this.f25629d;
                } else {
                    if (i12 != 2) {
                        throw new o();
                    }
                    j12 = this.f25631f;
                }
                b bVar = new b(lVar, j11, j12);
                l lVar2 = l.MAP;
                int i13 = iArr[lVar2.ordinal()];
                if (i13 == 1) {
                    j13 = this.f25628c;
                } else {
                    if (i13 != 2) {
                        throw new o();
                    }
                    j13 = this.f25630e;
                }
                long j15 = j13;
                int i14 = iArr[lVar2.ordinal()];
                if (i14 == 1) {
                    j14 = this.f25629d;
                } else {
                    if (i14 != 2) {
                        throw new o();
                    }
                    j14 = this.f25631f;
                }
                List b02 = C7714v.b0(bVar, new b(lVar2, j15, j14));
                reentrantLock.unlock();
                return new c(d11, d12, e11, valueOf, b02);
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    public e(@NotNull j timeSource) {
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        this.f25624a = timeSource;
        this.f25625b = new ConcurrentHashMap();
    }

    @Override // S00.d
    public final void a(@NotNull m layout) {
        a aVar;
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (f25623c && (aVar = (a) this.f25625b.get(layout.d())) != null) {
            aVar.a(l.PARSE, this.f25624a.f());
        }
    }

    @Override // S00.d
    public final void b(@NotNull m layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (f25623c) {
            ConcurrentHashMap concurrentHashMap = this.f25625b;
            String d11 = layout.d();
            Object obj = concurrentHashMap.get(d11);
            if (obj == null) {
                obj = new a(layout);
                concurrentHashMap.put(d11, obj);
            }
            ((a) obj).b(l.MAP, this.f25624a.f());
        }
    }

    @Override // S00.d
    public final void c(@NotNull m layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (f25623c) {
            ConcurrentHashMap concurrentHashMap = this.f25625b;
            String d11 = layout.d();
            l step = l.PARSE;
            long f7 = this.f25624a.f();
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(step, "step");
            a aVar = new a(layout);
            aVar.b(step, f7);
            concurrentHashMap.put(d11, aVar);
        }
    }

    @Override // S00.d
    public final void d(@NotNull m layout) {
        a aVar;
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (f25623c && (aVar = (a) this.f25625b.get(layout.d())) != null) {
            aVar.a(l.MAP, this.f25624a.f());
        }
    }

    @NotNull
    public final ArrayList f(String str) {
        Collection values = this.f25625b.values();
        ArrayList arrayList = new ArrayList(C7714v.z(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).c(str));
        }
        return arrayList;
    }
}
