package kotlinx.serialization.json.internal;

import androidx.credentials.provider.CredentialEntry;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.serialization.descriptors.m;
import kotlinx.serialization.descriptors.n;
import kotlinx.serialization.internal.AbstractC1127b;
import kotlinx.serialization.internal.AbstractC1152n0;
import kotlinx.serialization.internal.S;

@SourceDebugExtension({"SMAP\nTreeJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 4 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n+ 5 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,334:1\n74#1:359\n74#1:373\n74#1:384\n74#1:394\n75#1:419\n75#1:428\n85#1:437\n75#1:438\n88#1:447\n75#1:448\n89#1,5:457\n88#1:462\n75#1:463\n89#1,5:472\n88#1:477\n75#1:478\n89#1,5:487\n88#1:492\n75#1:493\n89#1,5:502\n88#1:507\n75#1:508\n89#1,5:517\n88#1:522\n75#1:523\n89#1,5:532\n88#1:537\n75#1:538\n89#1,5:547\n88#1:552\n75#1:553\n89#1,5:562\n75#1:567\n85#1:576\n75#1:577\n1#2:335\n76#3,6:336\n82#3,9:350\n271#4,8:342\n271#4,8:360\n271#4,8:374\n271#4,8:385\n271#4,8:395\n271#4,8:403\n271#4,8:411\n271#4,8:420\n271#4,8:429\n271#4,8:439\n271#4,8:449\n271#4,8:464\n271#4,8:479\n271#4,8:494\n271#4,8:509\n271#4,8:524\n271#4,8:539\n271#4,8:554\n271#4,8:568\n271#4,8:578\n36#5,5:368\n41#5,2:382\n44#5:393\n*S KotlinDebug\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n*L\n64#1:359\n67#1:373\n68#1:384\n70#1:394\n85#1:419\n88#1:428\n105#1:437\n105#1:438\n112#1:447\n112#1:448\n112#1:457,5\n114#1:462\n114#1:463\n114#1:472,5\n120#1:477\n120#1:478\n120#1:487,5\n126#1:492\n126#1:493\n126#1:502,5\n127#1:507\n127#1:508\n127#1:517,5\n130#1:522\n130#1:523\n130#1:532,5\n137#1:537\n137#1:538\n137#1:547,5\n143#1:552\n143#1:553\n143#1:562,5\n146#1:567\n159#1:576\n159#1:577\n56#1:336,6\n56#1:350,9\n56#1:342,8\n64#1:360,8\n67#1:374,8\n68#1:385,8\n70#1:395,8\n74#1:403,8\n75#1:411,8\n85#1:420,8\n88#1:429,8\n105#1:439,8\n112#1:449,8\n114#1:464,8\n120#1:479,8\n126#1:494,8\n127#1:509,8\n130#1:524,8\n137#1:539,8\n143#1:554,8\n146#1:568,8\n159#1:578,8\n65#1:368,5\n65#1:382,2\n65#1:393\n*E\n"})
/* renamed from: kotlinx.serialization.json.internal.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1177a extends AbstractC1152n0 implements kotlinx.serialization.json.g {
    public final kotlinx.serialization.json.b c;
    public final String d;

    @JvmField
    public final kotlinx.serialization.json.f e;

    public AbstractC1177a(kotlinx.serialization.json.b bVar, kotlinx.serialization.json.h hVar, String str) {
        this.c = bVar;
        this.d = str;
        this.e = bVar.a;
    }

    @Override // kotlinx.serialization.json.g
    public final kotlinx.serialization.json.h a() {
        return s();
    }

    @Override // kotlinx.serialization.internal.AbstractC1152n0
    public final boolean b(Object obj) {
        boolean equals;
        boolean equals2;
        Boolean bool;
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.h r = r(tag);
        if (!(r instanceof kotlinx.serialization.json.z)) {
            throw o.e("Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.z.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(r.getClass()).getSimpleName() + " as the serialized body of boolean at element: " + u(tag), r.toString(), -1);
        }
        kotlinx.serialization.json.z zVar = (kotlinx.serialization.json.z) r;
        try {
            S s = kotlinx.serialization.json.i.a;
            Intrinsics.checkNotNullParameter(zVar, "<this>");
            String a = zVar.a();
            String[] strArr = G.a;
            Intrinsics.checkNotNullParameter(a, "<this>");
            equals = StringsKt__StringsJVMKt.equals(a, CredentialEntry.TRUE_STRING, true);
            if (equals) {
                bool = Boolean.TRUE;
            } else {
                equals2 = StringsKt__StringsJVMKt.equals(a, CredentialEntry.FALSE_STRING, true);
                bool = equals2 ? Boolean.FALSE : null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            v(zVar, "boolean", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            v(zVar, "boolean", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.e
    public kotlinx.serialization.encoding.c beginStructure(kotlinx.serialization.descriptors.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlinx.serialization.json.h s = s();
        kotlinx.serialization.descriptors.m kind = descriptor.getKind();
        boolean areEqual = Intrinsics.areEqual(kind, n.b.a);
        kotlinx.serialization.json.b bVar = this.c;
        if (areEqual || (kind instanceof kotlinx.serialization.descriptors.d)) {
            String h = descriptor.h();
            if (s instanceof kotlinx.serialization.json.c) {
                return new w(bVar, (kotlinx.serialization.json.c) s);
            }
            throw o.e("Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.c.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(s.getClass()).getSimpleName() + " as the serialized body of " + h + " at element: " + q(), s.toString(), -1);
        }
        if (!Intrinsics.areEqual(kind, n.c.a)) {
            String h2 = descriptor.h();
            if (s instanceof kotlinx.serialization.json.x) {
                return new v(bVar, (kotlinx.serialization.json.x) s, this.d, 8);
            }
            throw o.e("Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.x.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(s.getClass()).getSimpleName() + " as the serialized body of " + h2 + " at element: " + q(), s.toString(), -1);
        }
        kotlinx.serialization.descriptors.f a = I.a(descriptor.g(0), bVar.b);
        kotlinx.serialization.descriptors.m kind2 = a.getKind();
        if (!(kind2 instanceof kotlinx.serialization.descriptors.e) && !Intrinsics.areEqual(kind2, m.b.a)) {
            throw o.c(a);
        }
        String h3 = descriptor.h();
        if (s instanceof kotlinx.serialization.json.x) {
            return new x(bVar, (kotlinx.serialization.json.x) s);
        }
        throw o.e("Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.x.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(s.getClass()).getSimpleName() + " as the serialized body of " + h3 + " at element: " + q(), s.toString(), -1);
    }

    @Override // kotlinx.serialization.internal.AbstractC1152n0
    public final byte c(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.h r = r(tag);
        if (!(r instanceof kotlinx.serialization.json.z)) {
            throw o.e("Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.z.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(r.getClass()).getSimpleName() + " as the serialized body of byte at element: " + u(tag), r.toString(), -1);
        }
        kotlinx.serialization.json.z zVar = (kotlinx.serialization.json.z) r;
        try {
            int a = kotlinx.serialization.json.i.a(zVar);
            Byte valueOf = (-128 > a || a > 127) ? null : Byte.valueOf((byte) a);
            if (valueOf != null) {
                return valueOf.byteValue();
            }
            v(zVar, "byte", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            v(zVar, "byte", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.AbstractC1152n0
    public final char d(Object obj) {
        char single;
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.h r = r(tag);
        if (r instanceof kotlinx.serialization.json.z) {
            kotlinx.serialization.json.z zVar = (kotlinx.serialization.json.z) r;
            try {
                single = StringsKt___StringsKt.single(zVar.a());
                return single;
            } catch (IllegalArgumentException unused) {
                v(zVar, "char", tag);
                throw null;
            }
        }
        throw o.e("Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.z.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(r.getClass()).getSimpleName() + " as the serialized body of char at element: " + u(tag), r.toString(), -1);
    }

    @Override // kotlinx.serialization.internal.AbstractC1152n0, kotlinx.serialization.encoding.e
    public final kotlinx.serialization.encoding.e decodeInline(kotlinx.serialization.descriptors.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (CollectionsKt.lastOrNull((List) this.a) != null) {
            return super.decodeInline(descriptor);
        }
        return new s(this.c, t(), this.d).decodeInline(descriptor);
    }

    @Override // kotlinx.serialization.encoding.e
    public boolean decodeNotNullMark() {
        return !(s() instanceof kotlinx.serialization.json.u);
    }

    @Override // kotlinx.serialization.internal.AbstractC1152n0, kotlinx.serialization.encoding.e
    public final <T> T decodeSerializableValue(kotlinx.serialization.a<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!(deserializer instanceof AbstractC1127b)) {
            return deserializer.deserialize(this);
        }
        kotlinx.serialization.json.b bVar = this.c;
        kotlinx.serialization.json.f fVar = bVar.a;
        AbstractC1127b abstractC1127b = (AbstractC1127b) deserializer;
        String a = B.a(abstractC1127b.getDescriptor(), bVar);
        kotlinx.serialization.json.h s = s();
        String h = abstractC1127b.getDescriptor().h();
        if (!(s instanceof kotlinx.serialization.json.x)) {
            throw o.e("Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.x.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(s.getClass()).getSimpleName() + " as the serialized body of " + h + " at element: " + q(), s.toString(), -1);
        }
        kotlinx.serialization.json.x xVar = (kotlinx.serialization.json.x) s;
        kotlinx.serialization.json.h hVar = (kotlinx.serialization.json.h) xVar.get(a);
        String str = null;
        if (hVar != null) {
            kotlinx.serialization.json.z b = kotlinx.serialization.json.i.b(hVar);
            Intrinsics.checkNotNullParameter(b, "<this>");
            if (!(b instanceof kotlinx.serialization.json.u)) {
                str = b.a();
            }
        }
        try {
            kotlinx.serialization.a a2 = kotlinx.serialization.g.a((AbstractC1127b) deserializer, this, str);
            Intrinsics.checkNotNull(a2, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
            return (T) com.amplitude.id.b.b(bVar, a, xVar, a2);
        } catch (kotlinx.serialization.j e) {
            String message = e.getMessage();
            Intrinsics.checkNotNull(message);
            throw o.e(message, xVar.toString(), -1);
        }
    }

    @Override // kotlinx.serialization.internal.AbstractC1152n0
    public final double e(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.h r = r(tag);
        if (!(r instanceof kotlinx.serialization.json.z)) {
            throw o.e("Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.z.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(r.getClass()).getSimpleName() + " as the serialized body of double at element: " + u(tag), r.toString(), -1);
        }
        kotlinx.serialization.json.z zVar = (kotlinx.serialization.json.z) r;
        try {
            S s = kotlinx.serialization.json.i.a;
            Intrinsics.checkNotNullParameter(zVar, "<this>");
            double parseDouble = Double.parseDouble(zVar.a());
            kotlinx.serialization.json.f fVar = this.c.a;
            if (Double.isInfinite(parseDouble) || Double.isNaN(parseDouble)) {
                throw o.a(Double.valueOf(parseDouble), tag, s().toString());
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            v(zVar, "double", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.c
    public void endStructure(kotlinx.serialization.descriptors.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.internal.AbstractC1152n0
    public final int f(Object obj, kotlinx.serialization.descriptors.f enumDescriptor) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        kotlinx.serialization.json.h r = r(tag);
        String h = enumDescriptor.h();
        if (r instanceof kotlinx.serialization.json.z) {
            return q.b(enumDescriptor, this.c, ((kotlinx.serialization.json.z) r).a(), "");
        }
        throw o.e("Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.z.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(r.getClass()).getSimpleName() + " as the serialized body of " + h + " at element: " + u(tag), r.toString(), -1);
    }

    @Override // kotlinx.serialization.internal.AbstractC1152n0
    public final float g(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.h r = r(tag);
        if (!(r instanceof kotlinx.serialization.json.z)) {
            throw o.e("Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.z.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(r.getClass()).getSimpleName() + " as the serialized body of float at element: " + u(tag), r.toString(), -1);
        }
        kotlinx.serialization.json.z zVar = (kotlinx.serialization.json.z) r;
        try {
            S s = kotlinx.serialization.json.i.a;
            Intrinsics.checkNotNullParameter(zVar, "<this>");
            float parseFloat = Float.parseFloat(zVar.a());
            kotlinx.serialization.json.f fVar = this.c.a;
            if (Float.isInfinite(parseFloat) || Float.isNaN(parseFloat)) {
                throw o.a(Float.valueOf(parseFloat), tag, s().toString());
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            v(zVar, "float", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.c
    public final kotlinx.serialization.modules.d getSerializersModule() {
        return this.c.b;
    }

    @Override // kotlinx.serialization.internal.AbstractC1152n0
    public final kotlinx.serialization.encoding.e h(Object obj, kotlinx.serialization.descriptors.f inlineDescriptor) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        if (!E.a(inlineDescriptor)) {
            Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
            this.a.add(tag);
            return this;
        }
        kotlinx.serialization.json.h r = r(tag);
        String h = inlineDescriptor.h();
        if (r instanceof kotlinx.serialization.json.z) {
            String a = ((kotlinx.serialization.json.z) r).a();
            kotlinx.serialization.json.b bVar = this.c;
            return new j(com.amplitude.core.utilities.y.c(bVar, a), bVar);
        }
        throw o.e("Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.z.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(r.getClass()).getSimpleName() + " as the serialized body of " + h + " at element: " + u(tag), r.toString(), -1);
    }

    @Override // kotlinx.serialization.internal.AbstractC1152n0
    public final int i(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.h r = r(tag);
        if (r instanceof kotlinx.serialization.json.z) {
            kotlinx.serialization.json.z zVar = (kotlinx.serialization.json.z) r;
            try {
                return kotlinx.serialization.json.i.a(zVar);
            } catch (IllegalArgumentException unused) {
                v(zVar, "int", tag);
                throw null;
            }
        }
        throw o.e("Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.z.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(r.getClass()).getSimpleName() + " as the serialized body of int at element: " + u(tag), r.toString(), -1);
    }

    @Override // kotlinx.serialization.internal.AbstractC1152n0
    public final long j(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.h r = r(tag);
        if (!(r instanceof kotlinx.serialization.json.z)) {
            throw o.e("Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.z.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(r.getClass()).getSimpleName() + " as the serialized body of long at element: " + u(tag), r.toString(), -1);
        }
        kotlinx.serialization.json.z zVar = (kotlinx.serialization.json.z) r;
        try {
            S s = kotlinx.serialization.json.i.a;
            Intrinsics.checkNotNullParameter(zVar, "<this>");
            try {
                return new F(zVar.a()).h();
            } catch (k e) {
                throw new NumberFormatException(e.getMessage());
            }
        } catch (IllegalArgumentException unused) {
            v(zVar, "long", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.AbstractC1152n0
    public final short k(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.h r = r(tag);
        if (!(r instanceof kotlinx.serialization.json.z)) {
            throw o.e("Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.z.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(r.getClass()).getSimpleName() + " as the serialized body of short at element: " + u(tag), r.toString(), -1);
        }
        kotlinx.serialization.json.z zVar = (kotlinx.serialization.json.z) r;
        try {
            int a = kotlinx.serialization.json.i.a(zVar);
            Short valueOf = (-32768 > a || a > 32767) ? null : Short.valueOf((short) a);
            if (valueOf != null) {
                return valueOf.shortValue();
            }
            v(zVar, "short", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            v(zVar, "short", tag);
            throw null;
        }
    }

    @Override // kotlinx.serialization.internal.AbstractC1152n0
    public final String l(Object obj) {
        String tag = (String) obj;
        Intrinsics.checkNotNullParameter(tag, "tag");
        kotlinx.serialization.json.h r = r(tag);
        if (!(r instanceof kotlinx.serialization.json.z)) {
            throw o.e("Expected " + Reflection.getOrCreateKotlinClass(kotlinx.serialization.json.z.class).getSimpleName() + ", but had " + Reflection.getOrCreateKotlinClass(r.getClass()).getSimpleName() + " as the serialized body of string at element: " + u(tag), r.toString(), -1);
        }
        kotlinx.serialization.json.z zVar = (kotlinx.serialization.json.z) r;
        if (!(zVar instanceof kotlinx.serialization.json.r)) {
            StringBuilder a = androidx.appcompat.view.a.a("Expected string value for a non-null key '", tag, "', got null literal instead at element: ");
            a.append(u(tag));
            throw o.e(a.toString(), s().toString(), -1);
        }
        kotlinx.serialization.json.r rVar = (kotlinx.serialization.json.r) zVar;
        if (rVar.a) {
            return rVar.b;
        }
        kotlinx.serialization.json.f fVar = this.c.a;
        StringBuilder a2 = androidx.appcompat.view.a.a("String literal for key '", tag, "' should be quoted at element: ");
        a2.append(u(tag));
        a2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw o.e(a2.toString(), s().toString(), -1);
    }

    public abstract kotlinx.serialization.json.h r(String str);

    public final kotlinx.serialization.json.h s() {
        kotlinx.serialization.json.h r;
        String str = (String) CollectionsKt.lastOrNull((List) this.a);
        return (str == null || (r = r(str)) == null) ? t() : r;
    }

    public abstract kotlinx.serialization.json.h t();

    public final String u(String currentTag) {
        Intrinsics.checkNotNullParameter(currentTag, "currentTag");
        return q() + '.' + currentTag;
    }

    public final void v(kotlinx.serialization.json.z zVar, String str, String str2) {
        boolean startsWith$default;
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "i", false, 2, null);
        throw o.e("Failed to parse literal '" + zVar + "' as " + (startsWith$default ? "an " : "a ").concat(str) + " value at element: " + u(str2), s().toString(), -1);
    }
}
