package Ef0;

import android.app.Application;
import android.content.Intent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.network.internal.debugMenu.ONDebugMenuActivity;
import s20.d;

/* loaded from: classes7.dex */
public final class d extends s20.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ld0.c f7977a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Application f7978b;

    /* loaded from: classes3.dex */
    public static final class a extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private final String f7979a = "ozon_network";

        /* renamed from: b, reason: collision with root package name */
        private final String f7980b = "OzonNetwork";

        /* renamed from: c, reason: collision with root package name */
        private final Function1<s20.c, Intent> f7981c;

        /* renamed from: Ef0.d$a$a, reason: collision with other inner class name */
        static final class C0178a extends AbstractC7737t implements Function1<s20.c, Intent> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f7982b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0178a(d dVar) {
                super(1);
                this.f7982b = dVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Intent invoke(s20.c cVar) {
                s20.c request = cVar;
                Intrinsics.checkNotNullParameter(request, "request");
                d dVar = this.f7982b;
                Intent intent = new Intent(dVar.f7978b, (Class<?>) ONDebugMenuActivity.class);
                intent.setData(request.a());
                return intent;
            }
        }

        a(d dVar) {
            this.f7981c = new C0178a(dVar);
        }

        @Override // s20.d.a
        public final String getId() {
            return this.f7979a;
        }

        @Override // s20.d.a
        public final Function1<s20.c, Intent> getIntent() {
            return this.f7981c;
        }

        @Override // s20.d.a
        public final String getName() {
            return this.f7980b;
        }
    }

    public d(@NotNull Ld0.c store, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(application, "application");
        this.f7977a = store;
        this.f7978b = application;
    }

    @Override // s20.b
    @NotNull
    public final s20.d provide() {
        return new a(this);
    }
}
