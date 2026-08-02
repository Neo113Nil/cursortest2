package B60;

import B30.f;
import Sc.o;
import androidx.fragment.app.r;
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
public final class i extends a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final B30.f f2978b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f2979c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final A30.m f2980d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final S80.b f2981e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@NotNull B30.f biometricSecurityStorage, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull A30.m fintechAuthInteractor, @NotNull S80.b fintechNavigation, @NotNull Moshi moshi) {
        super(moshi);
        Intrinsics.checkNotNullParameter(biometricSecurityStorage, "biometricSecurityStorage");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(fintechAuthInteractor, "fintechAuthInteractor");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f2978b = biometricSecurityStorage;
        this.f2979c = fintechAnalyticInteractor;
        this.f2980d = fintechAuthInteractor;
        this.f2981e = fintechNavigation;
    }

    public static Unit f(i iVar, TokenId tokenId, U50.j jVar, f.d readTokenResult) {
        Object error;
        String str;
        String b11;
        Intrinsics.checkNotNullParameter(readTokenResult, "readTokenResult");
        if (readTokenResult instanceof f.d.c) {
            Moshi c11 = iVar.c();
            f.d.c cVar = (f.d.c) readTokenResult;
            if (!(cVar instanceof f.d.c.a)) {
                throw new o();
            }
            try {
                str = c11.c(SecuredStorageResult.class).toJson(new SecuredStorageResult("done", ((f.d.c.a) cVar).b()));
            } catch (Throwable th2) {
                th2.printStackTrace();
                str = "";
            }
            String tokenId2 = tokenId.getTokenId();
            boolean z11 = readTokenResult instanceof f.d.c.a;
            f.d.c.a aVar = z11 ? (f.d.c.a) readTokenResult : null;
            Integer valueOf = (aVar == null || (b11 = aVar.b()) == null) ? null : Integer.valueOf(b11.length());
            f.d.c.a aVar2 = z11 ? (f.d.c.a) readTokenResult : null;
            InterfaceC6618a.C1033a.c(iVar.f2979c, false, true, null, null, tokenId2, valueOf, aVar2 != null ? aVar2.a() : null, 140);
            A30.m mVar = iVar.f2980d;
            if (mVar.t() && z11 && tokenId.getEnableFastEntry() != null) {
                f.c i11 = mVar.i(tokenId.getTokenId(), ((f.d.c.a) readTokenResult).b(), tokenId.getEnableFastEntry().booleanValue());
                String tokenId3 = tokenId.getTokenId();
                boolean booleanValue = tokenId.getEnableFastEntry().booleanValue();
                if (i11.equals(f.c.b.f2397a)) {
                    InterfaceC6618a.C1033a.e(iVar.f2979c, booleanValue, true, null, null, tokenId3, "read", 12);
                } else if (i11 instanceof f.c.a.C0057a) {
                    f.c.a.C0057a c0057a = (f.c.a.C0057a) i11;
                    iVar.f2979c.C0(c0057a.b(), c0057a.c(), tokenId3, "read", booleanValue, false);
                } else {
                    if (!(i11 instanceof f.c.a.b)) {
                        throw new o();
                    }
                    InterfaceC6618a.C1033a.e(iVar.f2979c, booleanValue, false, ((f.c.a.b) i11).a(), null, tokenId3, "read", 8);
                }
            }
            error = new NativeResult.Success(str);
        } else if (readTokenResult instanceof f.d.a) {
            f.d.a aVar3 = (f.d.a) readTokenResult;
            InterfaceC6618a.C1033a.c(iVar.f2979c, false, false, G.g.c(aVar3.a(), ": ", aVar3.b()), aVar3.c(), tokenId.getTokenId(), null, null, 224);
            error = new NativeResult.Error(aVar3.a(), null, 2, null);
        } else if (Intrinsics.d(readTokenResult, f.d.C0058d.f2405a)) {
            InterfaceC6618a.C1033a.c(iVar.f2979c, true, false, null, null, tokenId.getTokenId(), null, null, 236);
            error = new NativeResult.Error("Пользователь отменил запрос биометрии", NativeResult.Error.a.USER_CANCELLED);
        } else {
            if (!(readTokenResult instanceof f.d.b)) {
                throw new o();
            }
            f.d.b bVar = (f.d.b) readTokenResult;
            InterfaceC6618a.C1033a.c(iVar.f2979c, false, false, Nk.a.b("InvalidatedKey: ", bVar.a()), bVar.b(), tokenId.getTokenId(), null, null, 224);
            error = new NativeResult.Error("Добавлены изменения в биометрические отпечатки. Ключ не валиден", NativeResult.Error.a.INVALIDATED_DATA);
        }
        jVar.invoke(error);
        return Unit.f71690a;
    }

    @Override // B60.a
    public final void e(WeakReference weakReference, @NotNull final TokenId tokenId, @NotNull final U50.j callback) {
        FintechWebView fintechWebView;
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.f2981e.N0()) {
            callback.invoke(new NativeResult.Error("web can't call Secured Storage while on pinpad", NativeResult.Error.a.IS_NOT_AVAILABLE));
            return;
        }
        r parentFragmentActivity = (weakReference == null || (fintechWebView = (FintechWebView) weakReference.get()) == null) ? null : fintechWebView.getParentFragmentActivity();
        if (parentFragmentActivity != null) {
            this.f2978b.c(parentFragmentActivity, tokenId.getTokenId(), new Function1() { // from class: B60.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    TokenId tokenId2 = tokenId;
                    return i.f(i.this, tokenId2, callback, (f.d) obj);
                }
            }, tokenId.getReason());
        } else {
            InterfaceC6618a.C1033a.c(this.f2979c, false, false, "activity == null", null, tokenId.getTokenId(), null, null, 232);
            callback.invoke(new NativeResult.Error("activity == null", NativeResult.Error.a.IS_NOT_AVAILABLE));
        }
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "read";
    }
}
