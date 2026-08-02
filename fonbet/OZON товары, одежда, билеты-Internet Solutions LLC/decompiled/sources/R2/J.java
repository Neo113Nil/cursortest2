package R2;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class J<T> implements X<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final File f24289a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final W2.h f24290b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f24291c;

    public J(@NotNull File file, @NotNull W2.h serializer) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f24289a = file;
        this.f24290b = serializer;
        this.f24291c = new AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(7:40|41|42|43|44|(1:46)|47)|30|31))|66|6|7|(0)(0)|30|31|(3:(1:21)|(1:36)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x006b, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [R2.J] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object i(J j11, kotlin.coroutines.jvm.internal.c cVar) {
        I i11;
        ?? r22;
        Throwable th2;
        Closeable closeable;
        Throwable th3;
        FileInputStream fileInputStream;
        if (cVar instanceof I) {
            i11 = (I) cVar;
            int i12 = i11.f24288h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                i11.f24288h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = i11.f24286f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                r22 = i11.f24288h;
                if (r22 != 0) {
                    Sc.s.b(obj);
                    j11.f();
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(j11.f24289a);
                        try {
                            W2.h hVar = j11.f24290b;
                            i11.f24284d = j11;
                            i11.f24285e = fileInputStream2;
                            i11.f24288h = 1;
                            Object a11 = hVar.a(fileInputStream2, i11);
                            if (a11 != aVar) {
                                fileInputStream = fileInputStream2;
                                obj = a11;
                            }
                        } catch (Throwable th4) {
                            r22 = j11;
                            fileInputStream = fileInputStream2;
                            th3 = th4;
                            throw th3;
                        }
                    } catch (FileNotFoundException unused) {
                        boolean exists = j11.f24289a.exists();
                        W2.h hVar2 = j11.f24290b;
                        if (exists) {
                            hVar2.getClass();
                            return W2.g.a();
                        }
                        FileInputStream fileInputStream3 = new FileInputStream(j11.f24289a);
                        try {
                            i11.f24284d = fileInputStream3;
                            i11.f24285e = null;
                            i11.f24288h = 2;
                            Object a12 = hVar2.a(fileInputStream3, i11);
                            if (a12 != aVar) {
                                obj = a12;
                                closeable = fileInputStream3;
                                Vd0.b.a(closeable, null);
                                return obj;
                            }
                            return aVar;
                        } catch (Throwable th5) {
                            th2 = th5;
                            closeable = fileInputStream3;
                            throw th3;
                        }
                    }
                    return aVar;
                }
                if (r22 != 1) {
                    if (r22 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable = (Closeable) i11.f24284d;
                    try {
                        Sc.s.b(obj);
                        Vd0.b.a(closeable, null);
                        return obj;
                    } catch (Throwable th6) {
                        th2 = th6;
                        try {
                            throw th3;
                        } finally {
                        }
                    }
                }
                fileInputStream = i11.f24285e;
                r22 = (J) i11.f24284d;
                try {
                    Sc.s.b(obj);
                } catch (Throwable th7) {
                    th3 = th7;
                    try {
                        throw th3;
                    } finally {
                    }
                }
                Vd0.b.a(fileInputStream, null);
                return obj;
            }
        }
        i11 = new I(j11, cVar);
        Object obj2 = i11.f24286f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        r22 = i11.f24288h;
        if (r22 != 0) {
        }
        Vd0.b.a(fileInputStream, null);
        return obj2;
    }

    @Override // R2.InterfaceC3908b
    public final void close() {
        this.f24291c.set(true);
    }

    @Override // R2.X
    public final Object e(@NotNull kotlin.coroutines.d<? super T> dVar) {
        return i(this, (kotlin.coroutines.jvm.internal.c) dVar);
    }

    protected final void f() {
        if (this.f24291c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    @NotNull
    protected final File g() {
        return this.f24289a;
    }

    @NotNull
    protected final a0<T> h() {
        return this.f24290b;
    }
}
