package Q00;

import com.squareup.moshi.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.domain.api.ComposerJsonDeserializer;
import sf.InterfaceC9683i;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f22808a;

    public b(@NotNull ComposerJsonDeserializer deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f22808a = new c(deserializer);
    }

    @NotNull
    public final <I> d<I> a(@NotNull InterfaceC9683i source, @NotNull Class<I> clazz) {
        Intrinsics.checkNotNullParameter(source, "bufferedSource");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(source, "source");
        return this.f22808a.a(new p(source), clazz);
    }
}
