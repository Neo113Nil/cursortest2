package Db;

import Sc.r;
import Sc.s;
import Za.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.concurrent.TimeUnit;
import kb.C7625a;
import kotlin.coroutines.jvm.internal.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    private static final long f6287b;

    /* renamed from: c, reason: collision with root package name */
    private static final long f6288c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f6289d = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C7625a f6290a;

    /* renamed from: Db.a$a, reason: collision with other inner class name */
    public static final class C0133a {
        @NotNull
        public static C7625a a() {
            C7625a.C1162a c1162a = new C7625a.C1162a();
            c1162a.b(a.f6287b);
            c1162a.c(a.f6288c);
            return c1162a.a();
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f6287b = timeUnit.toMillis(1L);
        f6288c = timeUnit.toMillis(32L);
    }

    public a(@NotNull C7625a backOff) {
        Intrinsics.checkNotNullParameter(backOff, "backOff");
        this.f6290a = backOff;
    }

    @NotNull
    protected abstract d c();

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0116, code lost:
    
        if (xe.Y.b(r12, r1) == r3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012b, code lost:
    
        if (r0 == r3) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0116 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(@NotNull Function1 function1, @NotNull c cVar) {
        b bVar;
        a aVar;
        int i11;
        Function1 function12;
        a aVar2;
        int i12;
        a aVar3;
        Function1 function13;
        Throwable b11;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i13 = bVar.f6296i;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f6296i = i13 - LinearLayoutManager.INVALID_OFFSET;
                aVar = this;
                Object obj = bVar.f6294g;
                Wc.a aVar4 = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f6296i;
                int i14 = 1;
                if (i11 != 0) {
                    s.b(obj);
                    function12 = function1;
                    aVar2 = aVar;
                    i12 = 1;
                    if (i12 >= 6) {
                    }
                    return aVar4;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return ((r) obj).getF26106a();
                    }
                    i12 = bVar.f6293f;
                    function13 = bVar.f6292e;
                    aVar3 = bVar.f6291d;
                    s.b(obj);
                    int i15 = 1;
                    function12 = function13;
                    aVar2 = aVar3;
                    i12++;
                    i14 = i15;
                    if (i12 >= 6) {
                        aVar2.c().info("Trying to invoke the request");
                        bVar.f6291d = aVar2;
                        bVar.f6292e = function12;
                        bVar.f6293f = i12;
                        bVar.f6296i = i14;
                        Object invoke = function12.invoke(bVar);
                        if (invoke != aVar4) {
                            a aVar5 = aVar2;
                            function13 = function12;
                            obj = invoke;
                            aVar3 = aVar5;
                            Object f26106a = ((r) obj).getF26106a();
                            b11 = r.b(f26106a);
                            if (b11 != null) {
                                aVar3.f6290a.b();
                                aVar3.c().info("Request completed successfully");
                                return f26106a;
                            }
                            boolean e11 = aVar3.e(b11);
                            C7625a c7625a = aVar3.f6290a;
                            if (!e11) {
                                c7625a.b();
                                aVar3.c().info("Request completed with not retryable error: " + b11);
                                return f26106a;
                            }
                            if (i12 >= 5) {
                                c7625a.b();
                                aVar3.c().info("Attempts have exceeded the maximum number: 5 with error: " + b11);
                                return f26106a;
                            }
                            long a11 = c7625a.a();
                            d c11 = aVar3.c();
                            StringBuilder sb2 = new StringBuilder("Retry request after ");
                            i15 = i14;
                            sb2.append(TimeUnit.MILLISECONDS.toSeconds(a11));
                            sb2.append(" seconds because it completed with an error: ");
                            sb2.append(b11);
                            c11.b(sb2.toString(), null);
                            bVar.f6291d = aVar3;
                            bVar.f6292e = function13;
                            bVar.f6293f = i12;
                            bVar.f6296i = 2;
                        }
                    } else {
                        bVar.f6291d = null;
                        bVar.f6292e = null;
                        bVar.f6296i = 3;
                        obj = function12.invoke(bVar);
                    }
                    return aVar4;
                }
                i12 = bVar.f6293f;
                function13 = bVar.f6292e;
                aVar3 = bVar.f6291d;
                s.b(obj);
                Object f26106a2 = ((r) obj).getF26106a();
                b11 = r.b(f26106a2);
                if (b11 != null) {
                }
            }
        }
        aVar = this;
        bVar = new b(aVar, cVar);
        Object obj2 = bVar.f6294g;
        Wc.a aVar42 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f6296i;
        int i142 = 1;
        if (i11 != 0) {
        }
    }

    protected abstract boolean e(@NotNull Throwable th2);
}
