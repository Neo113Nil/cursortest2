package kotlinx.serialization.json.internal;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.S;

/* loaded from: classes5.dex */
public final class x extends v {
    public final kotlinx.serialization.json.x j;
    public final List<String> k;
    public final int l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kotlinx.serialization.json.b json, kotlinx.serialization.json.x value) {
        super(json, value, (String) null, 12);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.j = value;
        List<String> list = CollectionsKt.toList(value.a.keySet());
        this.k = list;
        this.l = list.size() * 2;
        this.m = -1;
    }

    @Override // kotlinx.serialization.json.internal.v, kotlinx.serialization.encoding.c
    public final int decodeElementIndex(kotlinx.serialization.descriptors.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i = this.m;
        if (i >= this.l - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.m = i2;
        return i2;
    }

    @Override // kotlinx.serialization.json.internal.v, kotlinx.serialization.json.internal.AbstractC1177a, kotlinx.serialization.encoding.c
    public final void endStructure(kotlinx.serialization.descriptors.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.json.internal.v, kotlinx.serialization.internal.AbstractC1152n0
    public final String m(kotlinx.serialization.descriptors.f descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.k.get(i / 2);
    }

    @Override // kotlinx.serialization.json.internal.v, kotlinx.serialization.json.internal.AbstractC1177a
    public final kotlinx.serialization.json.h r(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (this.m % 2 != 0) {
            return (kotlinx.serialization.json.h) MapsKt.getValue(this.j, tag);
        }
        S s = kotlinx.serialization.json.i.a;
        return tag == null ? kotlinx.serialization.json.u.INSTANCE : new kotlinx.serialization.json.r(tag, true);
    }

    @Override // kotlinx.serialization.json.internal.v, kotlinx.serialization.json.internal.AbstractC1177a
    public final kotlinx.serialization.json.h t() {
        return this.j;
    }

    @Override // kotlinx.serialization.json.internal.v
    /* renamed from: w */
    public final kotlinx.serialization.json.x t() {
        return this.j;
    }
}
