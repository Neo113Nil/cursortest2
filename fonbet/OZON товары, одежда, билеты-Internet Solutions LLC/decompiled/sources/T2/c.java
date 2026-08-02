package T2;

import R2.X;
import Sc.C4001c;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Closeable;
import java.io.FileNotFoundException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.AbstractC9688n;
import sf.D;
import sf.G;
import sf.x;
import sf.z;

/* loaded from: classes8.dex */
public class c<T> implements X<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x f26525a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final D f26526b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Q2.f f26527c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final a f26528d;

    public c(@NotNull x fileSystem, @NotNull D path, @NotNull Q2.f serializer) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f26525a = fileSystem;
        this.f26526b = path;
        this.f26527c = serializer;
        this.f26528d = new a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(4:11|12|(2:20|21)|(2:15|16)(1:18))(2:24|25))(3:26|27|28))(7:57|58|59|61|62|(1:64)|54)|(2:35|36)|30|(2:32|33)(1:34)))|77|6|7|(0)(0)|(0)|30|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b3, code lost:
    
        if (r8 == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0030, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00be, code lost:
    
        if (r7 != 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c8, code lost:
    
        r5 = r8;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c0, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c4, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c5, code lost:
    
        Sc.C4001c.a(r8, r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[Catch: FileNotFoundException -> 0x0088, TryCatch #6 {FileNotFoundException -> 0x0088, blocks: (B:32:0x008e, B:34:0x0092, B:47:0x0084, B:44:0x007f), top: B:43:0x007f, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092 A[Catch: FileNotFoundException -> 0x0088, TRY_LEAVE, TryCatch #6 {FileNotFoundException -> 0x0088, blocks: (B:32:0x008e, B:34:0x0092, B:47:0x0084, B:44:0x007f), top: B:43:0x007f, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r7v0, types: [T2.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v5, types: [T2.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object j(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        b bVar;
        int i11;
        G d11;
        c cVar3;
        G g10;
        Throwable th2;
        boolean e11;
        Throwable th3;
        if (cVar2 instanceof b) {
            bVar = (b) cVar2;
            int i12 = bVar.f26524h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f26524h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f26522f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f26524h;
                Throwable th4 = null;
                if (i11 != 0) {
                    s.b(obj);
                    cVar.f();
                    try {
                        d11 = z.d(((c) cVar).f26525a.k(((c) cVar).f26526b));
                    } catch (FileNotFoundException unused) {
                        x xVar = ((c) cVar).f26525a;
                        D d12 = ((c) cVar).f26526b;
                        e11 = xVar.e(d12);
                        Q2.f fVar = ((c) cVar).f26527c;
                        if (e11) {
                            fVar.getClass();
                            return W2.g.a();
                        }
                        G d13 = z.d(((c) cVar).f26525a.k(d12));
                        bVar.f26520d = d13;
                        bVar.f26521e = null;
                        bVar.f26524h = 2;
                        obj = fVar.a(d13, bVar);
                        cVar = d13;
                    }
                    try {
                        Q2.f fVar2 = ((c) cVar).f26527c;
                        bVar.f26520d = cVar;
                        bVar.f26521e = d11;
                        bVar.f26524h = 1;
                        Object a11 = fVar2.a(d11, bVar);
                        if (a11 != aVar) {
                            g10 = d11;
                            obj = a11;
                        }
                        return aVar;
                    } catch (Throwable th5) {
                        cVar3 = cVar;
                        g10 = d11;
                        th2 = th5;
                        if (g10 != null) {
                        }
                        th3 = th2;
                        obj = null;
                        if (th3 == null) {
                        }
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Closeable closeable = (Closeable) bVar.f26520d;
                        s.b(obj);
                        cVar = closeable;
                        if (cVar != 0) {
                            try {
                                cVar.close();
                            } catch (Throwable th6) {
                                th4 = th6;
                            }
                        }
                        if (th4 != null) {
                            throw th4;
                        }
                        Intrinsics.f(obj);
                        return obj;
                    }
                    g10 = bVar.f26521e;
                    cVar3 = (c) bVar.f26520d;
                    try {
                        s.b(obj);
                    } catch (Throwable th7) {
                        th2 = th7;
                        if (g10 != null) {
                            try {
                                try {
                                    g10.close();
                                } catch (Throwable th8) {
                                    C4001c.a(th2, th8);
                                }
                            } catch (FileNotFoundException unused2) {
                                cVar = cVar3;
                                x xVar2 = ((c) cVar).f26525a;
                                D d122 = ((c) cVar).f26526b;
                                e11 = xVar2.e(d122);
                                Q2.f fVar3 = ((c) cVar).f26527c;
                                if (e11) {
                                }
                            }
                        }
                        th3 = th2;
                        obj = null;
                        if (th3 == null) {
                        }
                    }
                }
                if (g10 != null) {
                    try {
                        g10.close();
                    } catch (Throwable th9) {
                        th3 = th9;
                    }
                }
                th3 = null;
                if (th3 == null) {
                    throw th3;
                }
                Intrinsics.f(obj);
                return obj;
            }
        }
        bVar = new b(cVar, cVar2);
        Object obj2 = bVar.f26522f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f26524h;
        Throwable th42 = null;
        if (i11 != 0) {
        }
        if (g10 != null) {
        }
        th3 = null;
        if (th3 == null) {
        }
    }

    @Override // R2.InterfaceC3908b
    public final void close() {
        this.f26528d.b();
    }

    @Override // R2.X
    public final Object e(@NotNull kotlin.coroutines.d<? super T> dVar) {
        return j(this, (kotlin.coroutines.jvm.internal.c) dVar);
    }

    protected final void f() {
        if (this.f26528d.a()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    @NotNull
    protected final AbstractC9688n g() {
        return this.f26525a;
    }

    @NotNull
    protected final D h() {
        return this.f26526b;
    }

    @NotNull
    protected final d<T> i() {
        return this.f26527c;
    }
}
