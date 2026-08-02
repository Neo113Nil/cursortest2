package Q00;

import com.squareup.moshi.D;
import com.squareup.moshi.n;
import com.squareup.moshi.p;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.domain.api.ComposerJsonDeserializer;
import sf.InterfaceC9683i;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ComposerJsonDeserializer f22809a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final n.a f22810b;

    /* renamed from: c, reason: collision with root package name */
    private final Y9.b f22811c;

    public c(@NotNull ComposerJsonDeserializer deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f22809a = deserializer;
        n.a a11 = n.a.C0918a.a("isSkip", "state", "trackingPayloads");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.f22810b = a11;
        this.f22811c = D.e(Map.class, String.class, String.class);
    }

    @NotNull
    public final d a(@NotNull p reader, @NotNull Class clazz) throws a {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        try {
            reader.beginObject();
            Exception e11 = null;
            Object obj = null;
            Object obj2 = null;
            while (reader.hasNext()) {
                int v11 = reader.v(this.f22810b);
                if (v11 != 0) {
                    ComposerJsonDeserializer composerJsonDeserializer = this.f22809a;
                    if (v11 == 1) {
                        try {
                            InterfaceC9683i o11 = reader.o();
                            Intrinsics.checkNotNullExpressionValue(o11, "nextSource(...)");
                            obj = composerJsonDeserializer.fromBuffer(o11, (Class<Object>) clazz);
                        } catch (Exception e12) {
                            e11 = e12;
                        }
                    } else if (v11 != 2) {
                        reader.y();
                        reader.skipValue();
                    } else {
                        InterfaceC9683i o12 = reader.o();
                        Intrinsics.checkNotNullExpressionValue(o12, "nextSource(...)");
                        Y9.b type = this.f22811c;
                        Intrinsics.checkNotNullExpressionValue(type, "type");
                        obj2 = composerJsonDeserializer.fromBuffer(o12, type);
                    }
                } else if (reader.k()) {
                    throw new a(null);
                }
            }
            reader.endObject();
            Unit unit = Unit.f71690a;
            reader.close();
            if (e11 != null) {
                throw e11;
            }
            if (obj != null) {
                return new d((Map) obj2, obj);
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                Vd0.b.a(reader, th2);
                throw th3;
            }
        }
    }
}
