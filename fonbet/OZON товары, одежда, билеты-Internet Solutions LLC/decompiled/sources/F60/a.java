package F60;

import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f9093a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<FintechWebView> f9094b;

    /* renamed from: c, reason: collision with root package name */
    private Function1<? super String, Boolean> f9095c;

    /* renamed from: d, reason: collision with root package name */
    private J60.a f9096d;

    /* renamed from: e, reason: collision with root package name */
    private G60.a f9097e;

    /* renamed from: f, reason: collision with root package name */
    private H60.a f9098f;

    public a(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f9093a = moshi;
    }

    public final H60.a a() {
        return this.f9098f;
    }

    public final G60.a b() {
        return this.f9097e;
    }

    public final J60.a c() {
        return this.f9096d;
    }

    public final void d(Function1<? super String, Boolean> function1) {
        this.f9095c = function1;
    }

    public final void e(@NotNull FintechWebView fintechWebView) {
        Intrinsics.checkNotNullParameter(fintechWebView, "fintechWebView");
        this.f9094b = new WeakReference<>(fintechWebView);
        WeakReference weakReference = new WeakReference(fintechWebView);
        Function1<? super String, Boolean> function1 = this.f9095c;
        Moshi moshi = this.f9093a;
        this.f9096d = new J60.a(weakReference, moshi, function1);
        this.f9097e = new G60.a(this.f9094b, moshi, this.f9095c);
        this.f9098f = new H60.a(this.f9094b, moshi, this.f9095c);
        new I60.a(moshi, this.f9095c);
    }
}
