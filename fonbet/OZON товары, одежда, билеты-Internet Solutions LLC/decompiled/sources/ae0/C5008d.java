package ae0;

import android.content.Context;
import com.yandex.mapkit.MapKitFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ae0.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5008d extends AbstractC5006b {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C5008d f36629d = new C5008d(0);

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final EnumC5007c f36630e = EnumC5007c.YANDEX;

    @Override // ae0.AbstractC5006b
    @NotNull
    public final EnumC5007c d() {
        return f36630e;
    }

    @Override // ae0.AbstractC5006b
    protected final void e(@NotNull Context context, @NotNull String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        MapKitFactory.setApiKey(apiKey);
        String c11 = c();
        if (c11 != null) {
            MapKitFactory.setLocale(c11);
        }
        MapKitFactory.initialize(context);
    }
}
