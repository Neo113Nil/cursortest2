package R2;

import Je.InterfaceC3394a;
import Sc.C4001c;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class O<T> implements i0<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final File f24312a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final W2.h f24313b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final U f24314c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f24315d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f24316e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Je.d f24317f;

    public O(@NotNull File file, @NotNull W2.h serializer, @NotNull U coordinator, @NotNull Function0 onClose) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.f24312a = file;
        this.f24313b = serializer;
        this.f24314c = coordinator;
        this.f24315d = onClose;
        this.f24316e = new AtomicBoolean(false);
        this.f24317f = Je.e.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|39|40|(1:42)(1:43))(2:53|54))|13|14|15|(2:(1:18)|19)(1:21)))|7|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[Catch: all -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x007d, blocks: (B:21:0x007c, B:28:0x008f, B:31:0x008c, B:27:0x0087), top: B:7:0x0020, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [R2.O] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [R2.M, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [R2.O] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [fd.n] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [R2.j0] */
    @Override // R2.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull InterfaceC6511n interfaceC6511n, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        ?? r02;
        int i11;
        Throwable th2;
        J j11;
        boolean z11;
        O<T> o11;
        try {
            if (cVar instanceof M) {
                M m11 = (M) cVar;
                int i12 = m11.f24304i;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    m11.f24304i = i12 - LinearLayoutManager.INVALID_OFFSET;
                    r02 = m11;
                    Object obj = r02.f24302g;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = r02.f24304i;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        if (this.f24316e.get()) {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                        boolean tryLock = this.f24317f.tryLock();
                        try {
                            J j12 = new J(this.f24312a, this.f24313b);
                            try {
                                Boolean valueOf = Boolean.valueOf(tryLock);
                                r02.f24299d = this;
                                r02.f24300e = j12;
                                r02.f24301f = tryLock;
                                r02.f24304i = 1;
                                Object invoke = ((j0) interfaceC6511n).invoke(j12, valueOf, r02);
                                if (invoke == aVar) {
                                    return aVar;
                                }
                                obj = invoke;
                                z11 = tryLock;
                                o11 = this;
                                j11 = j12;
                            } catch (Throwable th3) {
                                th2 = th3;
                                interfaceC6511n = tryLock;
                                r02 = this;
                                j11 = j12;
                                j11.close();
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            interfaceC6511n = tryLock;
                            r02 = this;
                            if (interfaceC6511n != 0) {
                                r02.f24317f.c(null);
                            }
                            throw th;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC6511n = r02.f24301f;
                        j11 = r02.f24300e;
                        r02 = r02.f24299d;
                        try {
                            Sc.s.b(obj);
                            o11 = r02;
                            z11 = interfaceC6511n;
                        } catch (Throwable th5) {
                            th2 = th5;
                            try {
                                j11.close();
                            } catch (Throwable th6) {
                                C4001c.a(th2, th6);
                            }
                            throw th2;
                        }
                    }
                    j11.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z11) {
                        o11.f24317f.c(null);
                    }
                    return obj;
                }
            }
            if (i11 != 0) {
            }
            j11.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th7) {
            th = th7;
            if (interfaceC6511n != 0) {
            }
            throw th;
        }
        r02 = new M(this, cVar);
        Object obj2 = r02.f24302g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = r02.f24304i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e9 A[Catch: all -> 0x0119, IOException -> 0x011b, TRY_ENTER, TryCatch #3 {all -> 0x0119, blocks: (B:19:0x00e9, B:21:0x00ef, B:24:0x00f8, B:25:0x0118, B:27:0x011e, B:30:0x0126, B:58:0x0135, B:60:0x013b, B:61:0x013e, B:37:0x0133, B:40:0x0130, B:45:0x009e, B:47:0x00ba), top: B:44:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0126 A[Catch: all -> 0x0119, IOException -> 0x011b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0119, blocks: (B:19:0x00e9, B:21:0x00ef, B:24:0x00f8, B:25:0x0118, B:27:0x011e, B:30:0x0126, B:58:0x0135, B:60:0x013b, B:61:0x013e, B:37:0x0133, B:40:0x0130, B:45:0x009e, B:47:0x00ba), top: B:44:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // R2.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        N n11;
        Wc.a aVar;
        int i11;
        File file;
        O<T> o11;
        InterfaceC3394a interfaceC3394a;
        Q q11;
        Throwable th2;
        Q q12;
        File file2;
        O<T> o12;
        try {
            try {
                try {
                    try {
                        if (cVar instanceof N) {
                            n11 = (N) cVar;
                            int i12 = n11.f24311j;
                            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                n11.f24311j = i12 - LinearLayoutManager.INVALID_OFFSET;
                                Object obj = n11.f24309h;
                                aVar = Wc.a.COROUTINE_SUSPENDED;
                                i11 = n11.f24311j;
                                if (i11 != 0) {
                                    Sc.s.b(obj);
                                    if (this.f24316e.get()) {
                                        throw new IllegalStateException("StorageConnection has already been disposed.");
                                    }
                                    File file3 = this.f24312a;
                                    File parentFile = file3.getCanonicalFile().getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                        if (!parentFile.isDirectory()) {
                                            throw new IOException("Unable to create parent directories of " + file3);
                                        }
                                    }
                                    n11.f24305d = this;
                                    n11.f24306e = function2;
                                    Je.d dVar = this.f24317f;
                                    n11.f24307f = dVar;
                                    n11.f24311j = 1;
                                    if (dVar.a(n11) != aVar) {
                                        o11 = this;
                                        interfaceC3394a = dVar;
                                    }
                                    return aVar;
                                }
                                if (i11 != 1) {
                                    if (i11 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    q12 = n11.f24308g;
                                    file2 = (File) n11.f24307f;
                                    interfaceC3394a = (InterfaceC3394a) n11.f24306e;
                                    o12 = n11.f24305d;
                                    try {
                                        Sc.s.b(obj);
                                        Unit unit = Unit.f71690a;
                                        try {
                                            q12.close();
                                            th = null;
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                        if (th == null) {
                                            throw th;
                                        }
                                        if (file2.exists() && !H.a(file2, o12.f24312a)) {
                                            throw new IOException("Unable to rename " + file2 + " to " + o12.f24312a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                        }
                                        Unit unit2 = Unit.f71690a;
                                        interfaceC3394a.c(null);
                                        return Unit.f71690a;
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        try {
                                            q12.close();
                                        } catch (Throwable th5) {
                                            C4001c.a(th2, th5);
                                        }
                                        throw th2;
                                    }
                                }
                                InterfaceC3394a interfaceC3394a2 = (InterfaceC3394a) n11.f24307f;
                                Function2 function22 = (Function2) n11.f24306e;
                                o11 = n11.f24305d;
                                Sc.s.b(obj);
                                interfaceC3394a = interfaceC3394a2;
                                function2 = function22;
                                file = new File(o11.f24312a.getAbsolutePath() + ".tmp");
                                W2.h serializer = o11.f24313b;
                                Intrinsics.checkNotNullParameter(file, "file");
                                Intrinsics.checkNotNullParameter(serializer, "serializer");
                                q11 = new Q(file, serializer);
                                n11.f24305d = o11;
                                n11.f24306e = interfaceC3394a;
                                n11.f24307f = file;
                                n11.f24308g = q11;
                                n11.f24311j = 2;
                                if (function2.invoke(q11, n11) != aVar) {
                                    file2 = file;
                                    o12 = o11;
                                    q12 = q11;
                                    Unit unit3 = Unit.f71690a;
                                    q12.close();
                                    th = null;
                                    if (th == null) {
                                    }
                                }
                                return aVar;
                            }
                        }
                        n11.f24305d = o11;
                        n11.f24306e = interfaceC3394a;
                        n11.f24307f = file;
                        n11.f24308g = q11;
                        n11.f24311j = 2;
                        if (function2.invoke(q11, n11) != aVar) {
                        }
                        return aVar;
                    } catch (Throwable th6) {
                        th2 = th6;
                        q12 = q11;
                        q12.close();
                        throw th2;
                    }
                    W2.h serializer2 = o11.f24313b;
                    Intrinsics.checkNotNullParameter(file, "file");
                    Intrinsics.checkNotNullParameter(serializer2, "serializer");
                    q11 = new Q(file, serializer2);
                } catch (IOException e11) {
                    e = e11;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(o11.f24312a.getAbsolutePath() + ".tmp");
            } catch (Throwable th7) {
                interfaceC3394a.c(null);
                throw th7;
            }
            if (i11 != 0) {
            }
        } catch (IOException e12) {
            e = e12;
            file = aVar;
        }
        n11 = new N(this, cVar);
        Object obj2 = n11.f24309h;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = n11.f24311j;
    }

    @Override // R2.InterfaceC3908b
    public final void close() {
        this.f24316e.set(true);
        this.f24315d.invoke();
    }

    @Override // R2.i0
    @NotNull
    public final U d() {
        return this.f24314c;
    }
}
