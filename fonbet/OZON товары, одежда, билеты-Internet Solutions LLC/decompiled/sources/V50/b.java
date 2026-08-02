package V50;

import H30.q;
import U50.d;
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
public abstract class b<T> implements U50.a, d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f28323a;

    public static final class a {
        public static Object a(@NotNull String parameterJson, j jVar, @NotNull Moshi moshi, @NotNull Class clazz) {
            Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Object a11 = q.a(moshi, parameterJson, clazz);
            if (a11 == null && jVar != null) {
                jVar.invoke(new NativeResult.Error("Ошибка парсинга Json'а", NativeResult.Error.a.SDK_ERROR));
            }
            return a11;
        }
    }

    public b(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f28323a = moshi;
    }

    @NotNull
    public abstract Class<T> a();

    @NotNull
    protected final Moshi b() {
        return this.f28323a;
    }

    public abstract void c(WeakReference weakReference, Object obj, @NotNull j jVar);

    @NotNull
    public abstract NativeResult d(WeakReference<FintechWebView> weakReference, T t2, @NotNull String str);

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        j jVar = (j) callback;
        Object a11 = a.a(parameterJson, jVar, this.f28323a, a());
        if (a11 != null) {
            c(weakReference, a11, jVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Object a11 = a.a(parameterJson, null, this.f28323a, a());
        if (a11 != null) {
            return d(weakReference, a11, parameterJson);
        }
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        return new NativeResult.Error("Not implemented", null, 2, null);
    }
}
