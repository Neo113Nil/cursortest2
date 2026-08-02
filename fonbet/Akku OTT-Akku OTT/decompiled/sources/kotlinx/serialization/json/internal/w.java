package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w extends AbstractC1177a {
    public final kotlinx.serialization.json.c f;
    public final int g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(kotlinx.serialization.json.b json, kotlinx.serialization.json.c value) {
        super(json, value, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f = value;
        this.g = value.a.size();
        this.h = -1;
    }

    @Override // kotlinx.serialization.encoding.c
    public final int decodeElementIndex(kotlinx.serialization.descriptors.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i = this.h;
        if (i >= this.g - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.h = i2;
        return i2;
    }

    @Override // kotlinx.serialization.internal.AbstractC1152n0
    public final String m(kotlinx.serialization.descriptors.f descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC1177a
    public final kotlinx.serialization.json.h r(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return this.f.a.get(Integer.parseInt(tag));
    }

    @Override // kotlinx.serialization.json.internal.AbstractC1177a
    public final kotlinx.serialization.json.h t() {
        return this.f;
    }
}
