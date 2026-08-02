package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.internal.AbstractC1127b;
import kotlinx.serialization.json.internal.l;
import kotlinx.serialization.json.internal.r;

@SourceDebugExtension({"SMAP\nStreamingJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 3 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n+ 4 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 5 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 6 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoderKt\n*L\n1#1,391:1\n76#2,6:392\n82#2,9:406\n271#3,8:398\n513#4,3:415\n513#4,3:418\n133#5,18:421\n384#6,5:439\n384#6,5:444\n*S KotlinDebug\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoder\n*L\n75#1:392,6\n75#1:406,9\n75#1:398,8\n202#1:415,3\n203#1:418,3\n215#1:421,18\n308#1:439,5\n315#1:444,5\n*E\n"})
/* loaded from: classes5.dex */
public final class C extends kotlinx.serialization.encoding.a implements kotlinx.serialization.json.g {
    public final kotlinx.serialization.json.b a;
    public final H b;

    @JvmField
    public final F c;
    public final kotlinx.serialization.modules.d d;
    public int e;
    public a f;
    public final kotlinx.serialization.json.f g;
    public final l h;

    public static final class a {

        @JvmField
        public String a;
    }

    public C(kotlinx.serialization.json.b json, H mode, F lexer, kotlinx.serialization.descriptors.f descriptor, a aVar) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.a = json;
        this.b = mode;
        this.c = lexer;
        this.d = json.b;
        this.e = -1;
        this.f = aVar;
        kotlinx.serialization.json.f fVar = json.a;
        this.g = fVar;
        this.h = fVar.a ? null : new l(descriptor);
    }

    @Override // kotlinx.serialization.json.g
    public final kotlinx.serialization.json.h a() {
        return new A(this.a.a, this.c).b();
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public final kotlinx.serialization.encoding.c beginStructure(kotlinx.serialization.descriptors.f sd) {
        Intrinsics.checkNotNullParameter(sd, "descriptor");
        kotlinx.serialization.json.b bVar = this.a;
        H b = I.b(sd, bVar);
        F f = this.c;
        r rVar = f.b;
        Intrinsics.checkNotNullParameter(sd, "sd");
        int i = rVar.c + 1;
        rVar.c = i;
        Object[] objArr = rVar.a;
        if (i == objArr.length) {
            int i2 = i * 2;
            Object[] copyOf = Arrays.copyOf(objArr, i2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            rVar.a = copyOf;
            int[] copyOf2 = Arrays.copyOf(rVar.b, i2);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
            rVar.b = copyOf2;
        }
        rVar.a[i] = sd;
        f.g(b.a);
        if (f.r() == 4) {
            F.m(f, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int ordinal = b.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            return new C(this.a, b, this.c, sd, this.f);
        }
        if (this.b == b && bVar.a.a) {
            return this;
        }
        return new C(this.a, b, this.c, sd, this.f);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public final boolean decodeBoolean() {
        boolean z;
        boolean z2;
        F f = this.c;
        int u = f.u();
        if (u == f.p().length()) {
            F.m(f, "EOF", 0, null, 6);
            throw null;
        }
        if (f.p().charAt(u) == '\"') {
            u++;
            z = true;
        } else {
            z = false;
        }
        int t = f.t(u);
        if (t >= f.p().length() || t == -1) {
            F.m(f, "EOF", 0, null, 6);
            throw null;
        }
        int i = t + 1;
        int charAt = f.p().charAt(t) | ' ';
        if (charAt == 102) {
            f.c(i, "alse");
            z2 = false;
        } else {
            if (charAt != 116) {
                F.m(f, "Expected valid boolean literal prefix, but had '" + f.j() + '\'', 0, null, 6);
                throw null;
            }
            f.c(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (f.a == f.p().length()) {
            F.m(f, "EOF", 0, null, 6);
            throw null;
        }
        if (f.p().charAt(f.a) == '\"') {
            f.a++;
            return z2;
        }
        F.m(f, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public final byte decodeByte() {
        F f = this.c;
        long h = f.h();
        byte b = (byte) h;
        if (h == b) {
            return b;
        }
        F.m(f, "Failed to parse byte for input '" + h + '\'', 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public final char decodeChar() {
        F f = this.c;
        String j = f.j();
        if (j.length() == 1) {
            return j.charAt(0);
        }
        F.m(f, androidx.compose.runtime.t.c("Expected single char, but got '", '\'', j), 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public final double decodeDouble() {
        F f = this.c;
        String j = f.j();
        try {
            double parseDouble = Double.parseDouble(j);
            kotlinx.serialization.json.f fVar = this.a.a;
            if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                return parseDouble;
            }
            o.h(f, Double.valueOf(parseDouble));
            throw null;
        } catch (IllegalArgumentException unused) {
            F.m(f, androidx.compose.runtime.t.c("Failed to parse type 'double' for input '", '\'', j), 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0187, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, "key");
        r1 = kotlin.text.StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) r11.p().subSequence(0, r11.a).toString(), r3, 0, false, 6, (java.lang.Object) null);
        r11.l(r1, androidx.compose.runtime.t.c("Encountered an unknown key '", '\'', r3), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ab, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int decodeElementIndex(kotlinx.serialization.descriptors.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        H h = this.b;
        int ordinal = h.ordinal();
        char c = ':';
        int i = 0;
        r7 = false;
        boolean z = false;
        kotlinx.serialization.json.b bVar = this.a;
        int i2 = -1;
        F f = this.c;
        if (ordinal == 0) {
            boolean v = f.v();
            while (true) {
                boolean b = f.b();
                l lVar = this.h;
                if (b) {
                    this.g.getClass();
                    String key = f.d();
                    f.g(c);
                    int a2 = q.a(descriptor, bVar, key);
                    if (a2 != -3) {
                        if (lVar != null) {
                            kotlinx.serialization.internal.E e = lVar.a;
                            if (a2 < 64) {
                                e.c |= 1 << a2;
                            } else {
                                int i3 = (a2 >>> 6) - 1;
                                long[] jArr = e.d;
                                jArr[i3] = jArr[i3] | (1 << (a2 & 63));
                            }
                        }
                        i2 = a2;
                    } else {
                        a aVar = this.f;
                        if (aVar == null || !Intrinsics.areEqual(aVar.a, key)) {
                            break;
                        }
                        aVar.a = null;
                        r rVar = f.b;
                        ArrayList arrayList = new ArrayList();
                        byte r = f.r();
                        if (r == 8 || r == 6) {
                            while (true) {
                                byte r2 = f.r();
                                if (r2 == 1) {
                                    f.d();
                                } else {
                                    if (r2 == 8 || r2 == 6) {
                                        arrayList.add(Byte.valueOf(r2));
                                    } else if (r2 == 9) {
                                        if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 8) {
                                            throw o.e("found ] instead of } at path: " + rVar, f.p(), f.a);
                                        }
                                        CollectionsKt.removeLast(arrayList);
                                    } else if (r2 == 7) {
                                        if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 6) {
                                            throw o.e("found } instead of ] at path: " + rVar, f.p(), f.a);
                                        }
                                        CollectionsKt.removeLast(arrayList);
                                    } else if (r2 == 10) {
                                        F.m(f, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                        throw null;
                                    }
                                    f.e();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            f.j();
                        }
                        v = f.v();
                        c = ':';
                    }
                } else {
                    if (v) {
                        kotlinx.serialization.json.f fVar = bVar.a;
                        o.f(f, "object");
                        throw null;
                    }
                    if (lVar != null) {
                        kotlinx.serialization.internal.E e2 = lVar.a;
                        l.a aVar2 = e2.b;
                        kotlinx.serialization.descriptors.f fVar2 = e2.a;
                        int d = fVar2.d();
                        while (true) {
                            long j = e2.c;
                            long j2 = -1;
                            if (j != -1) {
                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                                e2.c |= 1 << numberOfTrailingZeros;
                                if (((Boolean) aVar2.invoke(fVar2, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
                                    i2 = numberOfTrailingZeros;
                                    break;
                                }
                            } else if (d > 64) {
                                long[] jArr2 = e2.d;
                                int length = jArr2.length;
                                loop3: while (i < length) {
                                    int i4 = i + 1;
                                    int i5 = i4 * 64;
                                    long j3 = jArr2[i];
                                    while (j3 != j2) {
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j3);
                                        j3 |= 1 << numberOfTrailingZeros2;
                                        int i6 = numberOfTrailingZeros2 + i5;
                                        if (((Boolean) aVar2.invoke(fVar2, Integer.valueOf(i6))).booleanValue()) {
                                            jArr2[i] = j3;
                                            i2 = i6;
                                            break loop3;
                                        }
                                        j2 = -1;
                                    }
                                    jArr2[i] = j3;
                                    i = i4;
                                    j2 = -1;
                                }
                            }
                        }
                    }
                    i2 = -1;
                }
            }
        } else if (ordinal != 2) {
            boolean v2 = f.v();
            if (f.b()) {
                int i7 = this.e;
                if (i7 != -1 && !v2) {
                    F.m(f, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i2 = i7 + 1;
                this.e = i2;
            } else if (v2) {
                kotlinx.serialization.json.f fVar3 = bVar.a;
                o.f(f, "array");
                throw null;
            }
        } else {
            int i8 = this.e;
            Object[] objArr = i8 % 2 != 0;
            if (objArr != true) {
                f.g(':');
            } else if (i8 != -1) {
                z = f.v();
            }
            if (f.b()) {
                if (objArr != false) {
                    if (this.e == -1) {
                        int i9 = f.a;
                        if (z) {
                            F.m(f, "Unexpected leading comma", i9, null, 4);
                            throw null;
                        }
                    } else {
                        int i10 = f.a;
                        if (!z) {
                            F.m(f, "Expected comma after the key-value pair", i10, null, 4);
                            throw null;
                        }
                    }
                }
                i2 = this.e + 1;
                this.e = i2;
            } else if (z) {
                kotlinx.serialization.json.f fVar4 = bVar.a;
                o.f(f, "object");
                throw null;
            }
        }
        if (h != H.e) {
            r rVar2 = f.b;
            rVar2.b[rVar2.c] = i2;
        }
        return i2;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public final int decodeEnum(kotlinx.serialization.descriptors.f enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return q.b(enumDescriptor, this.a, decodeString(), " at path " + this.c.b.a());
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public final float decodeFloat() {
        F f = this.c;
        String j = f.j();
        try {
            float parseFloat = Float.parseFloat(j);
            kotlinx.serialization.json.f fVar = this.a.a;
            if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
                return parseFloat;
            }
            o.h(f, Float.valueOf(parseFloat));
            throw null;
        } catch (IllegalArgumentException unused) {
            F.m(f, androidx.compose.runtime.t.c("Failed to parse type 'float' for input '", '\'', j), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public final kotlinx.serialization.encoding.e decodeInline(kotlinx.serialization.descriptors.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return E.a(descriptor) ? new j(this.c, this.a) : super.decodeInline(descriptor);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public final int decodeInt() {
        F f = this.c;
        long h = f.h();
        int i = (int) h;
        if (h == i) {
            return i;
        }
        F.m(f, "Failed to parse int for input '" + h + '\'', 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public final long decodeLong() {
        return this.c.h();
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public final boolean decodeNotNullMark() {
        l lVar = this.h;
        if (!(lVar != null ? lVar.b : false)) {
            F f = this.c;
            int t = f.t(f.u());
            int length = f.p().length() - t;
            boolean z = false;
            if (length >= 4 && t != -1) {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        if ("null".charAt(i) != f.p().charAt(t + i)) {
                            break;
                        }
                        i++;
                    } else if (length <= 4 || com.bumptech.glide.load.data.mediastore.b.a(f.p().charAt(t + 4)) != 0) {
                        z = true;
                        f.a = t + 4;
                    }
                }
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public final Void decodeNull() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.c
    public final <T> T decodeSerializableElement(kotlinx.serialization.descriptors.f descriptor, int i, kotlinx.serialization.a<? extends T> deserializer, T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        boolean z = this.b == H.e && (i & 1) == 0;
        F f = this.c;
        if (z) {
            r rVar = f.b;
            int[] iArr = rVar.b;
            int i2 = rVar.c;
            if (iArr[i2] == -2) {
                rVar.a[i2] = r.a.a;
            }
        }
        T t2 = (T) super.decodeSerializableElement(descriptor, i, deserializer, t);
        if (z) {
            r rVar2 = f.b;
            int[] iArr2 = rVar2.b;
            int i3 = rVar2.c;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                rVar2.c = i4;
                Object[] objArr = rVar2.a;
                if (i4 == objArr.length) {
                    int i5 = i4 * 2;
                    Object[] copyOf = Arrays.copyOf(objArr, i5);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                    rVar2.a = copyOf;
                    int[] copyOf2 = Arrays.copyOf(rVar2.b, i5);
                    Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
                    rVar2.b = copyOf2;
                }
            }
            Object[] objArr2 = rVar2.a;
            int i6 = rVar2.c;
            objArr2[i6] = t2;
            rVar2.b[i6] = -2;
        }
        return t2;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012f  */
    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> T decodeSerializableValue(kotlinx.serialization.a<? extends T> deserializer) {
        boolean contains$default;
        String substringBefore$default;
        String removeSuffix;
        String substringAfter;
        kotlinx.serialization.json.b bVar = this.a;
        F f = this.c;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        try {
        } catch (kotlinx.serialization.c e) {
            String message = e.getMessage();
            Intrinsics.checkNotNull(message);
            contains$default = StringsKt__StringsKt.contains$default(message, "at path", false, 2, (Object) null);
            if (!contains$default) {
            }
        }
        if (!(deserializer instanceof AbstractC1127b)) {
            return deserializer.deserialize(this);
        }
        kotlinx.serialization.json.f fVar = bVar.a;
        String a2 = B.a(((AbstractC1127b) deserializer).getDescriptor(), bVar);
        this.g.getClass();
        String q = f.q(a2);
        String str = null;
        if (q != null) {
            try {
                kotlinx.serialization.a a3 = kotlinx.serialization.g.a((AbstractC1127b) deserializer, this, q);
                Intrinsics.checkNotNull(a3, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>");
                a aVar = new a();
                aVar.a = a2;
                this.f = aVar;
                return (T) a3.deserialize(this);
            } catch (kotlinx.serialization.j e2) {
                String message2 = e2.getMessage();
                Intrinsics.checkNotNull(message2);
                substringBefore$default = StringsKt__StringsKt.substringBefore$default(message2, '\n', (String) null, 2, (Object) null);
                removeSuffix = StringsKt__StringsKt.removeSuffix(substringBefore$default, (CharSequence) ".");
                String message3 = e2.getMessage();
                Intrinsics.checkNotNull(message3);
                substringAfter = StringsKt__StringsKt.substringAfter(message3, '\n', "");
                F.m(f, removeSuffix, 0, substringAfter, 2);
                throw null;
            }
        }
        if (deserializer == null) {
            return (T) ((AbstractC1127b) deserializer).deserialize(this);
        }
        kotlinx.serialization.json.f fVar2 = bVar.a;
        String a4 = B.a(((AbstractC1127b) deserializer).getDescriptor(), bVar);
        kotlinx.serialization.json.h a5 = a();
        String h = ((AbstractC1127b) deserializer).getDescriptor().h();
        if (!(a5 instanceof kotlinx.serialization.json.x)) {
            throw o.e("Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.x.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(a5.getClass()).getSimpleName() + " as the serialized body of " + h + " at element: " + f.b.a(), a5.toString(), -1);
        }
        kotlinx.serialization.json.x xVar = (kotlinx.serialization.json.x) a5;
        kotlinx.serialization.json.h hVar = (kotlinx.serialization.json.h) xVar.get(a4);
        if (hVar != null) {
            kotlinx.serialization.json.z b = kotlinx.serialization.json.i.b(hVar);
            Intrinsics.checkNotNullParameter(b, "<this>");
            if (!(b instanceof kotlinx.serialization.json.u)) {
                str = b.a();
            }
        }
        try {
            kotlinx.serialization.a a6 = kotlinx.serialization.g.a((AbstractC1127b) deserializer, this, str);
            Intrinsics.checkNotNull(a6, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
            return (T) com.amplitude.id.b.b(bVar, a4, xVar, a6);
        } catch (kotlinx.serialization.j e3) {
            String message4 = e3.getMessage();
            Intrinsics.checkNotNull(message4);
            throw o.e(message4, xVar.toString(), -1);
        }
        String message5 = e.getMessage();
        Intrinsics.checkNotNull(message5);
        contains$default = StringsKt__StringsKt.contains$default(message5, "at path", false, 2, (Object) null);
        if (!contains$default) {
            throw e;
        }
        throw new kotlinx.serialization.c(e.a, e.getMessage() + " at path: " + f.b.a(), e);
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public final short decodeShort() {
        F f = this.c;
        long h = f.h();
        short s = (short) h;
        if (h == s) {
            return s;
        }
        F.m(f, "Failed to parse short for input '" + h + '\'', 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public final String decodeString() {
        this.g.getClass();
        return this.c.i();
    }

    @Override // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.c
    public final void endStructure(kotlinx.serialization.descriptors.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlinx.serialization.json.f fVar = this.a.a;
        F f = this.c;
        if (f.v()) {
            o.f(f, "");
            throw null;
        }
        f.g(this.b.b);
        r rVar = f.b;
        int i = rVar.c;
        int[] iArr = rVar.b;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            rVar.c = i - 1;
        }
        int i2 = rVar.c;
        if (i2 != -1) {
            rVar.c = i2 - 1;
        }
    }

    @Override // kotlinx.serialization.encoding.c
    public final kotlinx.serialization.modules.d getSerializersModule() {
        return this.d;
    }
}
