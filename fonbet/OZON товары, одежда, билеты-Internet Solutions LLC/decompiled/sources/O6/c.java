package O6;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import l1.C7811b0;
import m1.C8034e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final long f19995a = C7811b0.a(0.0f, 0.0f, 0.0f, 0.3f, C8034e.s());

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Function1<C7807Z, C7807Z> f19996b = a.f19998b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f19997c = 0;

    static final class a extends AbstractC7737t implements Function1<C7807Z, C7807Z> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f19998b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final C7807Z invoke(C7807Z c7807z) {
            return C7807Z.m(C7811b0.f(c.f19995a, c7807z.w()));
        }
    }
}
