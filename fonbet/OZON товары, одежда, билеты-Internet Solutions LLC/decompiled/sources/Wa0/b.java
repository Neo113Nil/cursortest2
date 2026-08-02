package Wa0;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.host.config.debug.menu.HostConfigDebugMenuActivity;
import s20.c;
import s20.d;

/* loaded from: classes7.dex */
public final class b extends s20.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f33423a;

    /* loaded from: classes3.dex */
    public static final class a extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private final String f33424a = "hostConfigDebugMenu";

        /* renamed from: b, reason: collision with root package name */
        private final String f33425b = "HostConfig";

        /* renamed from: c, reason: collision with root package name */
        private final Function1<c, Intent> f33426c;

        /* renamed from: Wa0.b$a$a, reason: collision with other inner class name */
        static final class C0592a extends AbstractC7737t implements Function1<c, Intent> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f33427b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0592a(b bVar) {
                super(1);
                this.f33427b = bVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Intent invoke(c cVar) {
                c request = cVar;
                Intrinsics.checkNotNullParameter(request, "request");
                int i11 = HostConfigDebugMenuActivity.f97127i;
                Application application = this.f33427b.f33423a;
                Uri a11 = request.a();
                Intrinsics.checkNotNullParameter(application, "application");
                Intent intent = new Intent(application, (Class<?>) HostConfigDebugMenuActivity.class);
                intent.setData(a11);
                return intent;
            }
        }

        a(b bVar) {
            this.f33426c = new C0592a(bVar);
        }

        @Override // s20.d.a
        public final String getId() {
            return this.f33424a;
        }

        @Override // s20.d.a
        public final Function1<c, Intent> getIntent() {
            return this.f33426c;
        }

        @Override // s20.d.a
        public final String getName() {
            return this.f33425b;
        }
    }

    public b(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f33423a = application;
    }

    @Override // s20.b
    @NotNull
    public final d provide() {
        return new a(this);
    }
}
