package B60;

import B30.f;
import Sc.o;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.storage.SecuredStorageStateResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.storage.TokenId;

/* loaded from: classes3.dex */
public final class k extends a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final B30.a f2986b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final B30.f f2987c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f2988d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final S80.b f2989e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull B30.a biometricAuthManager, @NotNull B30.f biometricSecurityStorage, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull S80.b fintechNavigation, @NotNull Moshi moshi) {
        super(moshi);
        Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
        Intrinsics.checkNotNullParameter(biometricSecurityStorage, "biometricSecurityStorage");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f2986b = biometricAuthManager;
        this.f2987c = biometricSecurityStorage;
        this.f2988d = fintechAnalyticInteractor;
        this.f2989e = fintechNavigation;
    }

    public static Unit f(k kVar, boolean z11, TokenId tokenId, U50.j jVar, f.e result) {
        Object error;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof f.e.b) {
            Moshi c11 = kVar.c();
            String tokenId2 = tokenId.getTokenId();
            f.e.b bVar = (f.e.b) result;
            if (bVar instanceof f.e.b.a) {
                str = "found";
            } else {
                if (!(bVar instanceof f.e.b.C0059b)) {
                    throw new o();
                }
                str = "not_found";
            }
            try {
                str2 = c11.c(SecuredStorageStateResult.class).toJson(new SecuredStorageStateResult(z11, z11, tokenId2, str));
            } catch (Throwable th2) {
                th2.printStackTrace();
                str2 = "";
            }
            String tokenId3 = tokenId.getTokenId();
            kVar.f2988d.X0(null, tokenId3, true, result instanceof f.e.b.a, (r10 & 16) == 0);
            error = new NativeResult.Success(str2);
        } else {
            if (!(result instanceof f.e.a)) {
                throw new o();
            }
            InterfaceC6618a interfaceC6618a = kVar.f2988d;
            ((f.e.a) result).getClass();
            interfaceC6618a.X0(null, tokenId.getTokenId(), false, false, (r10 & 16) == 0);
            error = new NativeResult.Error(null, null, 2, null);
        }
        jVar.invoke(error);
        return Unit.f71690a;
    }

    @Override // B60.a
    public final void e(WeakReference weakReference, @NotNull final TokenId tokenId, @NotNull final U50.j callback) {
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.f2989e.N0()) {
            callback.invoke(new NativeResult.Error("web can't call Secured Storage while on pinpad", NativeResult.Error.a.IS_NOT_AVAILABLE));
            return;
        }
        final boolean b11 = this.f2986b.b();
        this.f2987c.j(tokenId.getTokenId(), new Function1() { // from class: B60.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                TokenId tokenId2 = tokenId;
                return k.f(k.this, b11, tokenId2, callback, (f.e) obj);
            }
        });
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "get_state";
    }
}
