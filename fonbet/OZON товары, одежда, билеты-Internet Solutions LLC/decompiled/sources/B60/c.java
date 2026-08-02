package B60;

import B30.f;
import Sc.o;
import android.app.Activity;
import androidx.fragment.app.r;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.storage.FastEntryData;

/* loaded from: classes3.dex */
public final class c extends V50.a<FastEntryData> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final A30.m f2957b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final S80.b f2958c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f2959d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f2960e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull A30.m fintechAuthInteractor, @NotNull S80.b fintechNavigation, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull Moshi moshi) {
        super(moshi);
        Intrinsics.checkNotNullParameter(fintechAuthInteractor, "fintechAuthInteractor");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f2957b = fintechAuthInteractor;
        this.f2958c = fintechNavigation;
        this.f2959d = fintechAnalyticInteractor;
        this.f2960e = "set_fast_entry_state";
    }

    public static Unit e(U50.j jVar, c cVar, FastEntryData fastEntryData, f.c result) {
        Object error;
        Intrinsics.checkNotNullParameter(result, "result");
        if (Intrinsics.d(result, f.c.b.f2397a)) {
            InterfaceC6618a.C1033a.e(cVar.f2959d, fastEntryData.isEnabled(), true, null, null, fastEntryData.getTokenId(), null, 44);
            NativeResult.Success.INSTANCE.getClass();
            error = NativeResult.Success.DEFAULT_WITH_SUCCESS;
        } else if (result instanceof f.c.a.C0057a) {
            f.c.a.C0057a c0057a = (f.c.a.C0057a) result;
            InterfaceC6618a.C1033a.e(cVar.f2959d, fastEntryData.isEnabled(), false, c0057a.b(), c0057a.c(), fastEntryData.getTokenId(), null, 32);
            error = new NativeResult.Error(Sh.b.c("Ошибка: ", c0057a.b(), " ", c0057a.c()), null, 2, null);
        } else {
            if (!(result instanceof f.c.a.b)) {
                throw new o();
            }
            f.c.a.b bVar = (f.c.a.b) result;
            InterfaceC6618a.C1033a.e(cVar.f2959d, fastEntryData.isEnabled(), false, bVar.a(), null, fastEntryData.getTokenId(), null, 40);
            error = new NativeResult.Error(Nk.a.b("Ошибка: ", bVar.a()), null, 2, null);
        }
        jVar.invoke(error);
        return Unit.f71690a;
    }

    @Override // V50.a
    @NotNull
    public final Class<FastEntryData> b() {
        return FastEntryData.class;
    }

    @Override // V50.a
    public final void d(WeakReference weakReference, Object obj, U50.j callback) {
        FastEntryData value = (FastEntryData) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity c11 = this.f2958c.c();
        r rVar = c11 instanceof r ? (r) c11 : null;
        if (rVar != null) {
            this.f2957b.j(rVar, value.isEnabled(), value.getTokenId(), new b(callback, this, value));
        } else {
            callback.invoke(new NativeResult.Error("fintechNavigation.getCurrentActivity() == null", null, 2, null));
        }
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return this.f2960e;
    }
}
