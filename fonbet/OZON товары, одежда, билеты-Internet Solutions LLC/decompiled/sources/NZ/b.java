package NZ;

import android.os.Bundle;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f18873a = new b();

    @Override // NZ.e
    @NotNull
    public final ComponentCallbacksC5392m create(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d dVar = new d();
        Bundle bundle = new Bundle();
        bundle.putString("ru.ozon.compass.TabFragment.EXTRA_DEEPLINK", deeplink);
        dVar.setArguments(bundle);
        return dVar;
    }
}
