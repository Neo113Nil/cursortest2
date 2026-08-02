package Qb0;

import android.app.Application;
import android.content.Intent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.ozonLimb.debug.OzonIdDebugActivity;
import s20.b;
import s20.c;
import s20.d;

/* loaded from: classes7.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f23214a;

    /* renamed from: Qb0.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0458a extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private final String f23215a = "ozonidSDK";

        /* renamed from: b, reason: collision with root package name */
        private final String f23216b = "OzonID";

        /* renamed from: c, reason: collision with root package name */
        private final Function1<c, Intent> f23217c;

        /* renamed from: Qb0.a$a$a, reason: collision with other inner class name */
        static final class C0459a extends AbstractC7737t implements Function1<c, Intent> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f23218b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0459a(a aVar) {
                super(1);
                this.f23218b = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Intent invoke(c cVar) {
                c request = cVar;
                Intrinsics.checkNotNullParameter(request, "request");
                Intent intent = new Intent(this.f23218b.f23214a, (Class<?>) OzonIdDebugActivity.class);
                intent.setData(request.a());
                return intent;
            }
        }

        C0458a(a aVar) {
            this.f23217c = new C0459a(aVar);
        }

        @Override // s20.d.a
        public final String getId() {
            return this.f23215a;
        }

        @Override // s20.d.a
        public final Function1<c, Intent> getIntent() {
            return this.f23217c;
        }

        @Override // s20.d.a
        public final String getName() {
            return this.f23216b;
        }
    }

    public a(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f23214a = application;
    }

    @Override // s20.b
    @NotNull
    public final d provide() {
        return new C0458a(this);
    }
}
