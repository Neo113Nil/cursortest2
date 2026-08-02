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
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.storage.SecuredStorageResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.storage.TokenId;

/* loaded from: classes3.dex */
public final class f extends a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final B30.f f2966b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f2967c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final S80.b f2968d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull B30.f biometricSecurityStorage, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull S80.b fintechNavigation, @NotNull Moshi moshi) {
        super(moshi);
        Intrinsics.checkNotNullParameter(biometricSecurityStorage, "biometricSecurityStorage");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f2966b = biometricSecurityStorage;
        this.f2967c = fintechAnalyticInteractor;
        this.f2968d = fintechNavigation;
    }

    public static Unit f(f fVar, TokenId tokenId, U50.j jVar, f.a clearTokenResult) {
        Object error;
        String str;
        Intrinsics.checkNotNullParameter(clearTokenResult, "clearTokenResult");
        if (clearTokenResult instanceof f.a.b) {
            Moshi c11 = fVar.c();
            if (!(((f.a.b) clearTokenResult) instanceof f.a.b.C0056a)) {
                throw new o();
            }
            try {
                str = c11.c(SecuredStorageResult.class).toJson(new SecuredStorageResult("done", null, 2, null));
            } catch (Throwable th2) {
                th2.printStackTrace();
                str = "";
            }
            InterfaceC6618a.C1033a.b(fVar.f2967c, true, null, tokenId.getTokenId(), 10);
            error = new NativeResult.Success(str);
        } else {
            if (!(clearTokenResult instanceof f.a.C0055a)) {
                throw new o();
            }
            f.a.C0055a c0055a = (f.a.C0055a) clearTokenResult;
            InterfaceC6618a.C1033a.b(fVar.f2967c, false, c0055a.a(), tokenId.getTokenId(), 8);
            error = new NativeResult.Error(c0055a.a(), null, 2, null);
        }
        jVar.invoke(error);
        return Unit.f71690a;
    }

    @Override // B60.a
    public final void e(WeakReference weakReference, @NotNull final TokenId tokenId, @NotNull final U50.j callback) {
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.f2968d.N0()) {
            callback.invoke(new NativeResult.Error("web can't call Secured Storage while on pinpad", NativeResult.Error.a.IS_NOT_AVAILABLE));
            return;
        }
        this.f2966b.g(tokenId.getTokenId(), new Function1() { // from class: B60.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                TokenId tokenId2 = tokenId;
                return f.f(f.this, tokenId2, callback, (f.a) obj);
            }
        });
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "clear";
    }
}
