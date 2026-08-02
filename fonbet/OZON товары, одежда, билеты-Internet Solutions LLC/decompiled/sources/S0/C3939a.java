package S0;

import Sc.InterfaceC4008j;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: S0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3939a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f25329a = Sc.k.b(C0505a.f25332b);

    /* renamed from: b, reason: collision with root package name */
    private static final long f25330b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f25331c = 0;

    /* renamed from: S0.a$a, reason: collision with other inner class name */
    static final class C0505a extends AbstractC7737t implements Function0<InterfaceC3955f0> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0505a f25332b = new C0505a(0);

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC3955f0 invoke() {
            return Looper.getMainLooper() != null ? H.f25203a : C3941a1.f25337a;
        }
    }

    static {
        long j11;
        try {
            j11 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j11 = -1;
        }
        f25330b = j11;
    }

    public static final long a() {
        return f25330b;
    }
}
