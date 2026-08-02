package V50;

import H30.q;
import U50.j;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public abstract class a<T> implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f28322a;

    public a(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f28322a = moshi;
    }

    @NotNull
    public abstract Class<T> b();

    @NotNull
    protected final Moshi c() {
        return this.f28322a;
    }

    public abstract void d(WeakReference weakReference, Object obj, @NotNull j jVar);

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Class<T> clazz = b();
        j jVar = (j) callback;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Moshi moshi = this.f28322a;
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Object a11 = q.a(moshi, parameterJson, clazz);
        if (a11 == null) {
            jVar.invoke(new NativeResult.Error("Ошибка парсинга Json'а", NativeResult.Error.a.SDK_ERROR));
        }
        if (a11 != null) {
            d(weakReference, a11, jVar);
        }
    }
}
