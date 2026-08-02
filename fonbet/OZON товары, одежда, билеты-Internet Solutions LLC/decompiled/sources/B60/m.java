package B60;

import B30.f;
import Sc.o;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.m;
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
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class m extends a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final B30.f f2993b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f2994c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final A30.m f2995d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final S80.b f2996e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@NotNull B30.f biometricSecurityStorage, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull A30.m fintechAuthInteractor, @NotNull S80.b fintechNavigation, @NotNull Moshi moshi) {
        super(moshi);
        Intrinsics.checkNotNullParameter(biometricSecurityStorage, "biometricSecurityStorage");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(fintechAuthInteractor, "fintechAuthInteractor");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f2993b = biometricSecurityStorage;
        this.f2994c = fintechAnalyticInteractor;
        this.f2995d = fintechAuthInteractor;
        this.f2996e = fintechNavigation;
    }

    public static Unit f(m mVar, TokenId tokenId, U50.j jVar, f.AbstractC0060f writeResult) {
        Object error;
        String str;
        Intrinsics.checkNotNullParameter(writeResult, "writeResult");
        if (writeResult instanceof f.AbstractC0060f.c) {
            Moshi c11 = mVar.c();
            if (!(((f.AbstractC0060f.c) writeResult) instanceof f.AbstractC0060f.c.a)) {
                throw new o();
            }
            try {
                str = c11.c(SecuredStorageResult.class).toJson(new SecuredStorageResult("done", null, 2, null));
            } catch (Throwable th2) {
                th2.printStackTrace();
                str = "";
            }
            String tokenId2 = tokenId.getTokenId();
            Integer valueOf = Integer.valueOf(tokenId.getToken().length());
            boolean z11 = writeResult instanceof f.AbstractC0060f.c.a;
            f.AbstractC0060f.c.a aVar = z11 ? (f.AbstractC0060f.c.a) writeResult : null;
            InterfaceC6618a.C1033a.d(mVar.f2994c, false, true, null, null, tokenId2, valueOf, aVar != null ? aVar.a() : null, 140);
            A30.m mVar2 = mVar.f2995d;
            if (mVar2.t() && z11 && tokenId.getEnableFastEntry() != null) {
                f.c i11 = mVar2.i(tokenId.getTokenId(), tokenId.getToken(), tokenId.getEnableFastEntry().booleanValue());
                String tokenId3 = tokenId.getTokenId();
                boolean booleanValue = tokenId.getEnableFastEntry().booleanValue();
                if (i11.equals(f.c.b.f2397a)) {
                    InterfaceC6618a.C1033a.e(mVar.f2994c, booleanValue, true, null, null, tokenId3, "write", 12);
                } else if (i11 instanceof f.c.a.C0057a) {
                    f.c.a.C0057a c0057a = (f.c.a.C0057a) i11;
                    mVar.f2994c.C0(c0057a.b(), c0057a.c(), tokenId3, "write", booleanValue, false);
                } else {
                    if (!(i11 instanceof f.c.a.b)) {
                        throw new o();
                    }
                    InterfaceC6618a.C1033a.e(mVar.f2994c, booleanValue, false, ((f.c.a.b) i11).a(), null, tokenId3, "write", 8);
                }
            }
            error = new NativeResult.Success(str);
        } else if (writeResult instanceof f.AbstractC0060f.a) {
            f.AbstractC0060f.a aVar2 = (f.AbstractC0060f.a) writeResult;
            InterfaceC6618a.C1033a.d(mVar.f2994c, false, false, G.g.c(aVar2.a(), ": ", aVar2.b()), aVar2.c(), tokenId.getTokenId(), Integer.valueOf(tokenId.getToken().length()), null, 192);
            error = new NativeResult.Error(aVar2.a(), null, 2, null);
        } else if (writeResult instanceof f.AbstractC0060f.d) {
            InterfaceC6618a.C1033a.d(mVar.f2994c, true, false, null, null, tokenId.getTokenId(), Integer.valueOf(tokenId.getToken().length()), null, 204);
            error = new NativeResult.Error("Пользователь отменил запрос биометрии", NativeResult.Error.a.USER_CANCELLED);
        } else {
            if (!(writeResult instanceof f.AbstractC0060f.b)) {
                throw new o();
            }
            f.AbstractC0060f.b bVar = (f.AbstractC0060f.b) writeResult;
            InterfaceC6618a.C1033a.d(mVar.f2994c, false, false, Nk.a.b("InvalidatedKey: ", bVar.a()), bVar.b(), tokenId.getTokenId(), Integer.valueOf(tokenId.getToken().length()), null, 192);
            error = new NativeResult.Error("Добавлены изменения в биометрические отпечатки. Ключ не валиден", NativeResult.Error.a.INVALIDATED_DATA);
        }
        jVar.invoke(error);
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [B60.l] */
    @Override // B60.a
    public final void e(WeakReference weakReference, @NotNull final TokenId tokenId, @NotNull final U50.j callback) {
        FintechWebView fintechWebView;
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.f2996e.N0()) {
            callback.invoke(new NativeResult.Error("web can't call Secured Storage while on pinpad", NativeResult.Error.a.IS_NOT_AVAILABLE));
            return;
        }
        r parentFragmentActivity = (weakReference == null || (fintechWebView = (FintechWebView) weakReference.get()) == null) ? null : fintechWebView.getParentFragmentActivity();
        if (parentFragmentActivity != null) {
            this.f2993b.d(parentFragmentActivity, tokenId.getTokenId(), tokenId.getToken(), new Function1() { // from class: B60.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    TokenId tokenId2 = tokenId;
                    return m.f(m.this, tokenId2, callback, (f.AbstractC0060f) obj);
                }
            }, tokenId.getReason());
        } else {
            InterfaceC6618a.C1033a.d(this.f2994c, false, false, "activity == null", null, tokenId.getTokenId(), Integer.valueOf(tokenId.getToken().length()), null, m.e.DEFAULT_DRAG_ANIMATION_DURATION);
            callback.invoke(new NativeResult.Error("activity == null", NativeResult.Error.a.IS_NOT_AVAILABLE));
        }
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "write";
    }
}
