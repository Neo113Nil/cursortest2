package X50;

import A30.m;
import Sc.s;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class b implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final R30.a f34111a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final m f34112b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final S80.b f34113c;

    @e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.auth.LogoutOzonIdBridgeInterface$handle$1", f = "LogoutOzonIdBridgeInterface.kt", l = {DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f34114d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ U50.j f34116f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(U50.j jVar, d dVar) {
            super(2, dVar);
            this.f34116f = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return b.this.new a(this.f34116f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            NativeResult.Success success;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f34114d;
            U50.j jVar = this.f34116f;
            try {
                if (i11 == 0) {
                    s.b(obj);
                    m mVar = b.this.f34112b;
                    this.f34114d = 1;
                    if (mVar.w(true, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                NativeResult.Success.INSTANCE.getClass();
                success = NativeResult.Success.DEFAULT_WITH_SUCCESS;
                jVar.invoke(success);
            } catch (Exception e11) {
                L80.a.a("logout_ozon_id", "error logout e=" + e11);
                jVar.invoke(new NativeResult.Error("error logout e=" + e11, null, 2, null));
            }
            return Unit.f71690a;
        }
    }

    public b(@NotNull Q90.c featureToggles, @NotNull R30.a appCoroutineScopes, @NotNull m authInteractor, @NotNull S80.b fintechNavigation) {
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(appCoroutineScopes, "appCoroutineScopes");
        Intrinsics.checkNotNullParameter(authInteractor, "authInteractor");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        this.f34111a = appCoroutineScopes;
        this.f34112b = authInteractor;
        this.f34113c = fintechNavigation;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "logout_ozon_id";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C10727i.c(this.f34111a.b(), null, null, new a((U50.j) callback, null), 3);
    }
}
