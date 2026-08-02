package kotlinx.serialization.json.internal;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.m;
import kotlinx.serialization.descriptors.n;
import kotlinx.serialization.internal.AbstractC1127b;
import kotlinx.serialization.internal.C1175z0;

@SourceDebugExtension({"SMAP\nStreamingJsonEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonEncoder.kt\nkotlinx/serialization/json/internal/StreamingJsonEncoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n178#1,2:259\n178#1,2:261\n21#2,12:233\n35#2,13:246\n1#3:245\n1#3:263\n*S KotlinDebug\n*F\n+ 1 StreamingJsonEncoder.kt\nkotlinx/serialization/json/internal/StreamingJsonEncoder\n*L\n168#1:259,2\n169#1:261,2\n68#1:233,12\n68#1:246,13\n68#1:245\n*E\n"})
/* loaded from: classes5.dex */
public final class D extends kotlinx.serialization.encoding.b implements kotlinx.serialization.json.q {
    public final C1182f a;
    public final kotlinx.serialization.json.b b;
    public final H c;
    public final kotlinx.serialization.json.q[] d;
    public final kotlinx.serialization.modules.d e;
    public final kotlinx.serialization.json.f f;
    public boolean g;
    public String h;
    public String i;

    public D(C1182f composer, kotlinx.serialization.json.b json, H mode, kotlinx.serialization.json.q[] qVarArr) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.a = composer;
        this.b = json;
        this.c = mode;
        this.d = qVarArr;
        this.e = json.b;
        this.f = json.a;
        int ordinal = mode.ordinal();
        if (qVarArr != null) {
            kotlinx.serialization.json.q qVar = qVarArr[ordinal];
            if (qVar == null && qVar == this) {
                return;
            }
            qVarArr[ordinal] = this;
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final kotlinx.serialization.encoding.d beginStructure(kotlinx.serialization.descriptors.f descriptor) {
        kotlinx.serialization.json.q qVar;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        kotlinx.serialization.json.b bVar = this.b;
        H b = I.b(descriptor, bVar);
        char c = b.a;
        C1182f c1182f = this.a;
        c1182f.c(c);
        c1182f.b = true;
        String str = this.h;
        if (str != null) {
            String str2 = this.i;
            if (str2 == null) {
                str2 = descriptor.h();
            }
            c1182f.a();
            encodeString(str);
            c1182f.c(':');
            encodeString(str2);
            this.h = null;
            this.i = null;
        }
        if (this.c == b) {
            return this;
        }
        kotlinx.serialization.json.q[] qVarArr = this.d;
        return (qVarArr == null || (qVar = qVarArr[b.ordinal()]) == null) ? new D(c1182f, bVar, b, qVarArr) : qVar;
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final void encodeBoolean(boolean z) {
        if (this.g) {
            encodeString(String.valueOf(z));
        } else {
            this.a.a.c(String.valueOf(z));
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final void encodeByte(byte b) {
        if (this.g) {
            encodeString(String.valueOf((int) b));
        } else {
            this.a.b(b);
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final void encodeChar(char c) {
        encodeString(String.valueOf(c));
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final void encodeDouble(double d) {
        boolean z = this.g;
        C1182f c1182f = this.a;
        if (z) {
            encodeString(String.valueOf(d));
        } else {
            c1182f.a.c(String.valueOf(d));
        }
        this.f.getClass();
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw o.b(c1182f.a.toString(), Double.valueOf(d));
        }
    }

    @Override // kotlinx.serialization.encoding.b
    public final boolean encodeElement(kotlinx.serialization.descriptors.f descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int ordinal = this.c.ordinal();
        C1182f c1182f = this.a;
        if (ordinal == 1) {
            if (!c1182f.b) {
                c1182f.c(',');
            }
            c1182f.a();
            return true;
        }
        boolean z = false;
        if (ordinal == 2) {
            if (c1182f.b) {
                this.g = true;
                c1182f.a();
                return true;
            }
            if (i % 2 == 0) {
                c1182f.c(',');
                c1182f.a();
                z = true;
            } else {
                c1182f.c(':');
                c1182f.i();
            }
            this.g = z;
            return true;
        }
        if (ordinal == 3) {
            if (i == 0) {
                this.g = true;
            }
            if (i == 1) {
                c1182f.c(',');
                c1182f.i();
                this.g = false;
            }
            return true;
        }
        if (!c1182f.b) {
            c1182f.c(',');
        }
        c1182f.a();
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        kotlinx.serialization.json.b json = this.b;
        Intrinsics.checkNotNullParameter(json, "json");
        q.c(descriptor, json);
        encodeString(descriptor.e(i));
        c1182f.c(':');
        c1182f.i();
        return true;
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final void encodeEnum(kotlinx.serialization.descriptors.f enumDescriptor, int i) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        encodeString(enumDescriptor.e(i));
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final void encodeFloat(float f) {
        boolean z = this.g;
        C1182f c1182f = this.a;
        if (z) {
            encodeString(String.valueOf(f));
        } else {
            c1182f.a.c(String.valueOf(f));
        }
        this.f.getClass();
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            throw o.b(c1182f.a.toString(), Float.valueOf(f));
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final kotlinx.serialization.encoding.f encodeInline(kotlinx.serialization.descriptors.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        boolean a = E.a(descriptor);
        H h = this.c;
        kotlinx.serialization.json.b bVar = this.b;
        C1182f c1182f = this.a;
        if (a) {
            if (!(c1182f instanceof C1184h)) {
                c1182f = new C1184h(c1182f.a, this.g);
            }
            return new D(c1182f, bVar, h, null);
        }
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        if (descriptor.isInline() && Intrinsics.areEqual(descriptor, kotlinx.serialization.json.i.a)) {
            if (!(c1182f instanceof C1183g)) {
                c1182f = new C1183g(c1182f.a, this.g);
            }
            return new D(c1182f, bVar, h, null);
        }
        if (this.h == null) {
            return super.encodeInline(descriptor);
        }
        this.i = descriptor.h();
        return this;
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final void encodeInt(int i) {
        if (this.g) {
            encodeString(String.valueOf(i));
        } else {
            this.a.d(i);
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final void encodeLong(long j) {
        if (this.g) {
            encodeString(String.valueOf(j));
        } else {
            this.a.e(j);
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final void encodeNull() {
        this.a.f("null");
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.d
    public final <T> void encodeNullableSerializableElement(kotlinx.serialization.descriptors.f descriptor, int i, kotlinx.serialization.k<? super T> serializer, T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (t != null || this.f.a) {
            super.encodeNullableSerializableElement(descriptor, i, serializer, t);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0040, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, kotlinx.serialization.descriptors.n.d.a) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r1.e != kotlinx.serialization.json.EnumC1176a.a) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> void encodeSerializableValue(kotlinx.serialization.k<? super T> serializer, T t) {
        String a;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        kotlinx.serialization.json.b bVar = this.b;
        kotlinx.serialization.json.f fVar = bVar.a;
        boolean z = serializer instanceof AbstractC1127b;
        if (!z) {
            int ordinal = fVar.e.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    kotlinx.serialization.descriptors.m kind = serializer.getDescriptor().getKind();
                    if (!Intrinsics.areEqual(kind, n.a.a)) {
                    }
                    a = B.a(serializer.getDescriptor(), bVar);
                } else if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            a = null;
        }
        if (z) {
            AbstractC1127b abstractC1127b = (AbstractC1127b) serializer;
            if (t == 0) {
                throw new IllegalArgumentException(("Value for serializer " + abstractC1127b.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            kotlinx.serialization.k<? super T> b = kotlinx.serialization.g.b(abstractC1127b, this, t);
            if (a != null && (serializer instanceof kotlinx.serialization.h)) {
                kotlinx.serialization.descriptors.f descriptor = b.getDescriptor();
                Intrinsics.checkNotNullParameter(descriptor, "<this>");
                if (C1175z0.a(descriptor).contains(a)) {
                    ((kotlinx.serialization.h) serializer).getClass();
                    throw null;
                }
            }
            kotlinx.serialization.descriptors.m kind2 = b.getDescriptor().getKind();
            Intrinsics.checkNotNullParameter(kind2, "kind");
            if (kind2 instanceof m.b) {
                throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            }
            if (kind2 instanceof kotlinx.serialization.descriptors.e) {
                throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            }
            if (kind2 instanceof kotlinx.serialization.descriptors.d) {
                throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
            }
            Intrinsics.checkNotNull(b, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            serializer = b;
        }
        if (a != null) {
            String h = serializer.getDescriptor().h();
            this.h = a;
            this.i = h;
        }
        serializer.serialize(this, t);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final void encodeShort(short s) {
        if (this.g) {
            encodeString(String.valueOf((int) s));
        } else {
            this.a.g(s);
        }
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.f
    public final void encodeString(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.a.h(value);
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.d
    public final void endStructure(kotlinx.serialization.descriptors.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        H h = this.c;
        char c = h.b;
        C1182f c1182f = this.a;
        c1182f.getClass();
        c1182f.b = false;
        c1182f.c(h.b);
    }

    @Override // kotlinx.serialization.encoding.f
    public final kotlinx.serialization.modules.d getSerializersModule() {
        return this.e;
    }

    @Override // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.d
    public final boolean shouldEncodeElementDefault(kotlinx.serialization.descriptors.f descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f.getClass();
        return false;
    }
}
