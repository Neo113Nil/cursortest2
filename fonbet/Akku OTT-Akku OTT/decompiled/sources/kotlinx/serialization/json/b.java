package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.C;
import kotlinx.serialization.json.internal.C1179c;
import kotlinx.serialization.json.internal.C1185i;
import kotlinx.serialization.json.internal.F;
import kotlinx.serialization.json.internal.H;

/* loaded from: classes5.dex */
public abstract class b {
    public static final a d = new a(new f(), kotlinx.serialization.modules.h.a);
    public final f a;
    public final kotlinx.serialization.modules.d b;
    public final C1185i c = new C1185i();

    public static final class a extends b {
    }

    public b(f fVar, kotlinx.serialization.modules.d dVar) {
        this.a = fVar;
        this.b = dVar;
    }

    public final <T> T a(kotlinx.serialization.a<? extends T> deserializer, String string) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(string, "string");
        F c = com.amplitude.core.utilities.y.c(this, string);
        T t = (T) new C(this, H.c, c, deserializer.getDescriptor(), null).decodeSerializableValue(deserializer);
        if (c.e() == 10) {
            return t;
        }
        F.m(c, "Expected EOF after parsing, but had " + c.e.charAt(c.a - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final <T> String b(kotlinx.serialization.k<? super T> serializer, T t) {
        char[] removeLastOrNull;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        kotlinx.serialization.json.internal.u uVar = new kotlinx.serialization.json.internal.u();
        C1179c c1179c = C1179c.c;
        synchronized (c1179c) {
            removeLastOrNull = c1179c.a.removeLastOrNull();
            if (removeLastOrNull != null) {
                c1179c.b -= removeLastOrNull.length;
            } else {
                removeLastOrNull = null;
            }
        }
        if (removeLastOrNull == null) {
            removeLastOrNull = new char[128];
        }
        uVar.a = removeLastOrNull;
        try {
            kotlinx.serialization.json.internal.t.a(this, uVar, serializer, t);
            return uVar.toString();
        } finally {
            uVar.b();
        }
    }
}
