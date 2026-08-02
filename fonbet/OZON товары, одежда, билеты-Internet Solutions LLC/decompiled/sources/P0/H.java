package P0;

import S0.C3996z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final S0.B1 f20642a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f20643b = 0;

    static final class a extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f20644b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    static final class b extends AbstractC7737t implements Function0<Z1.h> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f20645b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Z1.h invoke() {
            return Z1.h.a(48);
        }
    }

    static {
        C3996z.c(a.f20644b);
        f20642a = new S0.B1(b.f20645b);
    }

    @NotNull
    public static final S0.B1 a() {
        return f20642a;
    }
}
