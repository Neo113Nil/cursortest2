package com.vungle.ads.internal.model;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;

/* loaded from: classes7.dex */
public final class q0 {
    public static final p0 Companion = new p0();

    /* renamed from: a, reason: collision with root package name */
    public final Integer f12004a;
    public final String b;
    public final List c;
    public final Json d;
    public final i0 e;

    public /* synthetic */ q0(int i, Integer num, String str, List list, i0 i0Var) {
        String b;
        i0 i0Var2 = null;
        if ((i & 1) == 0) {
            this.f12004a = null;
        } else {
            this.f12004a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        Json Json$default = JsonKt.Json$default(null, o0.f11998a, 1, null);
        this.d = Json$default;
        if ((i & 8) != 0) {
            this.e = i0Var;
            return;
        }
        if (this.b != null && (b = b()) != null) {
            KSerializer<Object> serializer = SerializersKt.serializer(Json$default.getSerializersModule(), Reflection.typeOf(i0.class));
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            i0Var2 = (i0) Json$default.decodeFromString(serializer, b);
        }
        this.e = i0Var2;
    }

    public static final void a(q0 self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        i0 i0Var;
        String b;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.f12004a != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.f12004a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.b);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.c != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, new ArrayListSerializer(StringSerializer.INSTANCE), self.c);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3)) {
            i0 i0Var2 = self.e;
            if (self.b == null || (b = self.b()) == null) {
                i0Var = null;
            } else {
                Json json = self.d;
                KSerializer<Object> serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(i0.class));
                Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                i0Var = (i0) json.decodeFromString(serializer, b);
            }
            if (Intrinsics.areEqual(i0Var2, i0Var)) {
                return;
            }
        }
        output.encodeNullableSerializableElement(serialDesc, 3, c.f11957a, self.e);
    }

    public final String b() {
        byte[] decode = Base64.decode(this.b, 0);
        if (decode == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(decode);
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 1024);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = gZIPInputStream.read(bArr);
                    if (read == -1) {
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(gZIPInputStream, null);
                        Unit unit2 = Unit.INSTANCE;
                        CloseableKt.closeFinally(byteArrayInputStream, null);
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                        Intrinsics.checkNotNullExpressionValue(byteArrayOutputStream2, "result.toString()");
                        return byteArrayOutputStream2;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(byteArrayInputStream, th);
                throw th2;
            }
        }
    }

    public final Integer c() {
        return this.f12004a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.areEqual(this.f12004a, q0Var.f12004a) && Intrinsics.areEqual(this.b, q0Var.b) && Intrinsics.areEqual(this.c, q0Var.c);
    }

    public final int hashCode() {
        Integer num = this.f12004a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("BidPayload(version=").append(this.f12004a).append(", adunit=").append(this.b).append(", impression=").append(this.c).append(')').toString();
    }

    public final i0 a() {
        return this.e;
    }
}
