package kotlinx.serialization.json;

import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.UStringsKt;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.internal.J0;
import kotlinx.serialization.internal.e1;

@SourceDebugExtension({"SMAP\nJsonElementSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElementSerializers.kt\nkotlinx/serialization/json/JsonLiteralSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n1#2:237\n*E\n"})
/* loaded from: classes5.dex */
public final class s implements kotlinx.serialization.b<r> {
    public static final s a = new s();
    public static final J0 b = kotlinx.serialization.descriptors.l.a("kotlinx.serialization.json.JsonLiteral", e.i.a);

    @Override // kotlinx.serialization.a
    public final Object deserialize(kotlinx.serialization.encoding.e decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        h a2 = p.b(decoder).a();
        if (a2 instanceof r) {
            return (r) a2;
        }
        throw kotlinx.serialization.json.internal.o.e("Unexpected JSON element, expected JsonLiteral, had " + Reflection.getOrCreateKotlinClass(a2.getClass()), a2.toString(), -1);
    }

    @Override // kotlinx.serialization.k, kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.f getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.k
    public final void serialize(kotlinx.serialization.encoding.f encoder, Object obj) {
        r value = (r) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        p.a(encoder);
        boolean z = value.a;
        String str = value.b;
        if (z) {
            encoder.encodeString(str);
            return;
        }
        Long longOrNull = StringsKt.toLongOrNull(str);
        if (longOrNull != null) {
            encoder.encodeLong(longOrNull.longValue());
            return;
        }
        ULong uLongOrNull = UStringsKt.toULongOrNull(str);
        if (uLongOrNull != null) {
            long data = uLongOrNull.getData();
            Intrinsics.checkNotNullParameter(ULong.INSTANCE, "<this>");
            encoder.encodeInline(e1.b).encodeLong(data);
            return;
        }
        Double doubleOrNull = StringsKt.toDoubleOrNull(str);
        if (doubleOrNull != null) {
            encoder.encodeDouble(doubleOrNull.doubleValue());
            return;
        }
        Boolean booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(str);
        if (booleanStrictOrNull != null) {
            encoder.encodeBoolean(booleanStrictOrNull.booleanValue());
        } else {
            encoder.encodeString(str);
        }
    }
}
