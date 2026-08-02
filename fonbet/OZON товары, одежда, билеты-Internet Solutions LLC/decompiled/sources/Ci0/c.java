package Ci0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends Td0.a {

    /* renamed from: a, reason: collision with root package name */
    private final a f5115a;

    public static final class a extends Td0.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f5116a;

        a(f fVar) {
            this.f5116a = fVar;
        }

        @Override // Td0.b
        public final Td0.d a(Rd0.a debugMenuEnvironment) {
            Intrinsics.checkNotNullParameter(debugMenuEnvironment, "debugMenuEnvironment");
            return new b(this.f5116a, debugMenuEnvironment);
        }
    }

    c(f fVar) {
        this.f5115a = new a(fVar);
    }

    @Override // Td0.a
    public final Td0.b a() {
        return this.f5115a;
    }
}
