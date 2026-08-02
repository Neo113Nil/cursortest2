package a10;

import Sc.o;
import b10.C5519a;
import c10.C5724a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: a10.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4913a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C5519a f36187a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C5724a f36188b;

    /* renamed from: a10.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0686a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36189a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.SERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f36189a = iArr;
        }
    }

    public C4913a(C4914b newMetricsTraceStorage) {
        C5519a regularPerformanceHandler = new C5519a(newMetricsTraceStorage);
        C5724a serverPerformanceHandler = new C5724a(newMetricsTraceStorage);
        Intrinsics.checkNotNullParameter(newMetricsTraceStorage, "newMetricsTraceStorage");
        Intrinsics.checkNotNullParameter(regularPerformanceHandler, "regularPerformanceHandler");
        Intrinsics.checkNotNullParameter(serverPerformanceHandler, "serverPerformanceHandler");
        this.f36187a = regularPerformanceHandler;
        this.f36188b = serverPerformanceHandler;
    }

    public final void a(@NotNull String redirectKey, i iVar, @NotNull String requestId) {
        Intrinsics.checkNotNullParameter(redirectKey, "redirectKey");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        if (iVar != null) {
            this.f36188b.a(redirectKey, iVar);
        } else {
            this.f36187a.b(redirectKey, requestId);
        }
    }

    public final void b(@NotNull L00.j response, @NotNull C4916d redirectCause) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(redirectCause, "redirectCause");
        String a11 = redirectCause.a();
        if (a11 == null) {
            return;
        }
        int i11 = C0686a.f36189a[redirectCause.d().ordinal()];
        if (i11 == 1) {
            this.f36187a.c(a11, response);
        } else {
            if (i11 != 2) {
                throw new o();
            }
            this.f36188b.b(a11, response);
        }
    }
}
