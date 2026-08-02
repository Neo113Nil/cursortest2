package Ca0;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Va0.a f4630a;

    public d(@NotNull Va0.a intentDataExtractor) {
        Intrinsics.checkNotNullParameter(intentDataExtractor, "intentDataExtractor");
        this.f4630a = intentDataExtractor;
    }

    public final a a() {
        String str;
        Va0.a aVar = this.f4630a;
        String a11 = aVar.a();
        if (a11 != null) {
            str = a11.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        if (Intrinsics.d(str, "env")) {
            String name = aVar.b();
            if (name == null || h.K(name)) {
                name = null;
            } else {
                Intrinsics.checkNotNullParameter(name, "name");
            }
            if (name != null) {
                return a.a(name);
            }
        }
        return null;
    }
}
