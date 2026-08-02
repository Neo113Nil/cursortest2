package Vb0;

import Dj.EnumC2873a;
import Dj.InterfaceC2874b;
import Dj.InterfaceC2875c;
import Fb0.f;
import Sc.C4001c;
import Sc.InterfaceC4008j;
import Sc.k;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class f extends Vb0.b {

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f28527i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f28528j;

    /* loaded from: classes3.dex */
    static final class a extends AbstractC7737t implements Function0<Map<String, ? extends f.a>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fb0.f f28529b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Fb0.f fVar) {
            super(0);
            this.f28529b = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends f.a> invoke() {
            return U.i(new Pair("appName", this.f28529b.getAppName()));
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends AbstractC7737t implements Function0<InterfaceC2874b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ld0.c f28530b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ld0.c cVar) {
            super(0);
            this.f28530b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC2874b invoke() {
            return ((InterfaceC2875c) this.f28530b.e(InterfaceC2875c.class)).f("OzonId", "ozon_id_sdk_logs");
        }
    }

    public f(@NotNull Fb0.f ozonIdConfig, @NotNull Ld0.c limbDiStore) {
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(limbDiStore, "limbDiStore");
        this.f28527i = k.b(new a(ozonIdConfig));
        this.f28528j = k.b(new b(limbDiStore));
    }

    @Override // Vb0.b
    protected final boolean i() {
        return true;
    }

    @Override // Vb0.b
    protected final void j(@NotNull String message, @NotNull Map<String, ? extends Object> customFields) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(customFields, "customFields");
        ((InterfaceC2874b) this.f28528j.getValue()).b(EnumC2873a.ERROR, message, U.m((Map) this.f28527i.getValue(), customFields), Boolean.FALSE);
    }

    @Override // Vb0.b
    protected final void k(@NotNull String message, @NotNull Map<String, ? extends Object> customFields) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(customFields, "customFields");
        ((InterfaceC2874b) this.f28528j.getValue()).b(EnumC2873a.INFO, message, U.m((Map) this.f28527i.getValue(), customFields), Boolean.FALSE);
    }

    @Override // Vb0.b
    protected final void l(@NotNull String key, @NotNull Exception t2, @NotNull Map customFields) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(t2, "t");
        Intrinsics.checkNotNullParameter(customFields, "customFields");
        ((InterfaceC2874b) this.f28528j.getValue()).b(EnumC2873a.ERROR, Nk.a.b("non-fatal: ", G.g.c(key, " ", C4001c.b(t2))), U.m((Map) this.f28527i.getValue(), customFields), Boolean.FALSE);
    }
}
