package Cj;

import Ld0.c;
import android.content.Intent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.android.debug.OzonLoggerDebugActivity;
import s20.b;
import s20.d;

/* renamed from: Cj.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2780a extends b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f5135a;

    /* renamed from: Cj.a$a, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    public static final class C0120a extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private final String f5136a = "ozonLogger";

        /* renamed from: b, reason: collision with root package name */
        private final String f5137b = "Logger";

        /* renamed from: c, reason: collision with root package name */
        private final Function1<s20.c, Intent> f5138c;

        /* renamed from: Cj.a$a$a, reason: collision with other inner class name */
        static final class C0121a extends AbstractC7737t implements Function1<s20.c, Intent> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2780a f5139b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0121a(C2780a c2780a) {
                super(1);
                this.f5139b = c2780a;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Intent invoke(s20.c cVar) {
                s20.c request = cVar;
                Intrinsics.checkNotNullParameter(request, "request");
                Intent intent = new Intent(this.f5139b.f5135a.c().a(), (Class<?>) OzonLoggerDebugActivity.class);
                intent.setData(request.a());
                return intent;
            }
        }

        C0120a(C2780a c2780a) {
            this.f5138c = new C0121a(c2780a);
        }

        @Override // s20.d.a
        public final String getId() {
            return this.f5136a;
        }

        @Override // s20.d.a
        public final Function1<s20.c, Intent> getIntent() {
            return this.f5138c;
        }

        @Override // s20.d.a
        public final String getName() {
            return this.f5137b;
        }
    }

    public C2780a(@NotNull c diStore) {
        Intrinsics.checkNotNullParameter(diStore, "diStore");
        this.f5135a = diStore;
    }

    @Override // s20.b
    @NotNull
    public final d provide() {
        return new C0120a(this);
    }
}
