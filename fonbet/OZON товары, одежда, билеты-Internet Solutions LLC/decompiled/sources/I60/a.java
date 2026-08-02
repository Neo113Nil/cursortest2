package I60;

import com.squareup.moshi.Moshi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Function1<String, Boolean> f11999a;

    public a(@NotNull Moshi moshi, Function1 function1) {
        Intrinsics.checkNotNullParameter("window.web_bridge", "webBridgeLocation");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f11999a = function1;
    }
}
