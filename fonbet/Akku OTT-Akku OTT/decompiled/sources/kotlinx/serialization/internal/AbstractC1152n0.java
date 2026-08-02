package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlinx.serialization.internal.n0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1152n0 implements kotlinx.serialization.encoding.e, kotlinx.serialization.encoding.c {
    public final ArrayList<String> a = new ArrayList<>();
    public boolean b;

    public abstract boolean b(String str);

    public abstract byte c(String str);

    public abstract char d(String str);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.e
    public final boolean decodeBoolean() {
        return b(p());
    }

    @Override // kotlinx.serialization.encoding.c
    public final boolean decodeBooleanElement(kotlinx.serialization.descriptors.f descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return b(o(descriptor, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.e
    public final byte decodeByte() {
        return c(p());
    }

    @Override // kotlinx.serialization.encoding.c
    public final byte decodeByteElement(kotlinx.serialization.descriptors.f descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return c(o(descriptor, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.e
    public final char decodeChar() {
        return d(p());
    }

    @Override // kotlinx.serialization.encoding.c
    public final char decodeCharElement(kotlinx.serialization.descriptors.f descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return d(o(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.c
    public final int decodeCollectionSize(kotlinx.serialization.descriptors.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.e
    public final double decodeDouble() {
        return e(p());
    }

    @Override // kotlinx.serialization.encoding.c
    public final double decodeDoubleElement(kotlinx.serialization.descriptors.f descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return e(o(descriptor, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.e
    public final int decodeEnum(kotlinx.serialization.descriptors.f enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return f(p(), enumDescriptor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.e
    public final float decodeFloat() {
        return g(p());
    }

    @Override // kotlinx.serialization.encoding.c
    public final float decodeFloatElement(kotlinx.serialization.descriptors.f descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return g(o(descriptor, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.e
    public kotlinx.serialization.encoding.e decodeInline(kotlinx.serialization.descriptors.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return h(p(), descriptor);
    }

    @Override // kotlinx.serialization.encoding.c
    public final kotlinx.serialization.encoding.e decodeInlineElement(kotlinx.serialization.descriptors.f descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return h(o(descriptor, i), ((AbstractC1132d0) descriptor).g(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.e
    public final int decodeInt() {
        return i(p());
    }

    @Override // kotlinx.serialization.encoding.c
    public final int decodeIntElement(kotlinx.serialization.descriptors.f descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return i(o(descriptor, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.e
    public final long decodeLong() {
        return j(p());
    }

    @Override // kotlinx.serialization.encoding.c
    public final long decodeLongElement(kotlinx.serialization.descriptors.f descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return j(o(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.e
    public final Void decodeNull() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.c
    public final <T> T decodeNullableSerializableElement(kotlinx.serialization.descriptors.f descriptor, int i, kotlinx.serialization.a<? extends T> deserializer, T t) {
        T t2;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.a.add(o(descriptor, i));
        if (deserializer.getDescriptor().b() || decodeNotNullMark()) {
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            t2 = (T) decodeSerializableValue(deserializer);
        } else {
            t2 = null;
        }
        if (!this.b) {
            p();
        }
        this.b = false;
        return t2;
    }

    @Override // kotlinx.serialization.encoding.c
    public final boolean decodeSequentially() {
        return false;
    }

    @Override // kotlinx.serialization.encoding.c
    public final <T> T decodeSerializableElement(kotlinx.serialization.descriptors.f descriptor, int i, kotlinx.serialization.a<? extends T> deserializer, T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.a.add(o(descriptor, i));
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        T t2 = (T) decodeSerializableValue(deserializer);
        if (!this.b) {
            p();
        }
        this.b = false;
        return t2;
    }

    @Override // kotlinx.serialization.encoding.e
    public abstract <T> T decodeSerializableValue(kotlinx.serialization.a<? extends T> aVar);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.e
    public final short decodeShort() {
        return k(p());
    }

    @Override // kotlinx.serialization.encoding.c
    public final short decodeShortElement(kotlinx.serialization.descriptors.f descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return k(o(descriptor, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.e
    public final String decodeString() {
        return l(p());
    }

    @Override // kotlinx.serialization.encoding.c
    public final String decodeStringElement(kotlinx.serialization.descriptors.f descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return l(o(descriptor, i));
    }

    public abstract double e(String str);

    public abstract int f(String str, kotlinx.serialization.descriptors.f fVar);

    public abstract float g(String str);

    public abstract kotlinx.serialization.encoding.e h(String str, kotlinx.serialization.descriptors.f fVar);

    public abstract int i(String str);

    public abstract long j(String str);

    public abstract short k(String str);

    public abstract String l(String str);

    public String m(kotlinx.serialization.descriptors.f descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return descriptor.e(i);
    }

    public final String n(kotlinx.serialization.descriptors.f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String childName = m(fVar, i);
        Intrinsics.checkNotNullParameter(childName, "nestedName");
        String parentName = (String) CollectionsKt.lastOrNull((List) this.a);
        if (parentName == null) {
            parentName = "";
        }
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    public final /* bridge */ String o(kotlinx.serialization.descriptors.f fVar, int i) {
        return n(fVar, i);
    }

    public final String p() {
        ArrayList<String> arrayList = this.a;
        String remove = arrayList.remove(CollectionsKt.getLastIndex(arrayList));
        this.b = true;
        return remove;
    }

    public final String q() {
        String joinToString$default;
        ArrayList<String> arrayList = this.a;
        if (arrayList.isEmpty()) {
            return "$";
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ".", "$.", null, 0, null, null, 60, null);
        return joinToString$default;
    }
}
