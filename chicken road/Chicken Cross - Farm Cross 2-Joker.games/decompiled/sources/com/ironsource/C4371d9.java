package com.ironsource;

import com.ironsource.C4353c9;
import com.ironsource.InterfaceC4527m4;
import com.ironsource.Kb;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.d9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4371d9 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4527m4 f8140a;
    private final Kb.a b;
    private Long c;
    private Long d;
    private Kb e;
    private C4353c9 f;

    /* JADX WARN: Multi-variable type inference failed */
    public C4371d9() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final C4353c9 a() {
        return this.f;
    }

    public final C4353c9 b() {
        Long l = this.d;
        if (l != null) {
            long longValue = l.longValue();
            Long l2 = this.c;
            if (l2 != null) {
                long longValue2 = l2.longValue();
                if (this.e == null) {
                    return null;
                }
                long a2 = this.f8140a.a();
                Kb kb = this.b.get();
                C4353c9 c4353c9 = new C4353c9(a2 - longValue, new C4353c9.a(Math.max(0L, kb.d() - r1.d()), Math.max(0L, kb.e() - r1.e()), Math.max(0L, kb.f() - r1.f())), longValue2 / 1024);
                this.f = c4353c9;
                return c4353c9;
            }
        }
        return null;
    }

    public C4371d9(InterfaceC4527m4 currentTimeProvider, Kb.a memoryInfoProvider) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(memoryInfoProvider, "memoryInfoProvider");
        this.f8140a = currentTimeProvider;
        this.b = memoryInfoProvider;
    }

    public final void a(String serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.c = Long.valueOf(serverResponse.length());
        this.e = this.b.get();
        this.d = Long.valueOf(this.f8140a.a());
    }

    public /* synthetic */ C4371d9(InterfaceC4527m4 interfaceC4527m4, Kb.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new InterfaceC4527m4.a() : interfaceC4527m4, (i & 2) != 0 ? new Kb.a.C0309a() : aVar);
    }
}
