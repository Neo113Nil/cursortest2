package bk0;

import Sc.InterfaceC4008j;
import Sc.k;
import fi0.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.i;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x f56089a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final i f56090b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f56091c;

    static final class a extends AbstractC7737t implements Function0<Boolean> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            pf0.h hVar;
            e eVar = e.this;
            Ld0.c v11 = eVar.f56089a.v();
            return Boolean.valueOf(((v11 == null || (hVar = (pf0.h) v11.d(pf0.h.class)) == null) ? null : hVar.H(eVar.f56090b)) != null);
        }
    }

    public e(@NotNull x settings, @NotNull i networkConfig) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        this.f56089a = settings;
        this.f56090b = networkConfig;
        this.f56091c = k.b(new a());
    }

    public final boolean c() {
        return ((Boolean) this.f56091c.getValue()).booleanValue();
    }
}
