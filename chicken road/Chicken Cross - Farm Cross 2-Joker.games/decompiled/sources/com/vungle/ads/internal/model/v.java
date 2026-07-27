package com.vungle.ads.internal.model;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes7.dex */
public final class v {
    public static final u Companion = new u();

    /* renamed from: a, reason: collision with root package name */
    public final Map f12019a;
    public final Map b;

    public /* synthetic */ v(int i, Map map, Map map2) {
        if ((i & 1) == 0) {
            this.f12019a = null;
        } else {
            this.f12019a = map;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = map2;
        }
    }

    public static final void a(v self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.f12019a != null) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            output.encodeNullableSerializableElement(serialDesc, 0, new LinkedHashMapSerializer(stringSerializer, stringSerializer), self.f12019a);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.b == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, new LinkedHashMapSerializer(StringSerializer.INSTANCE, m.f11990a), self.b);
    }

    public final Map b() {
        return this.f12019a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.areEqual(this.f12019a, vVar.f12019a) && Intrinsics.areEqual(this.b, vVar.b);
    }

    public final int hashCode() {
        Map map = this.f12019a;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map map2 = this.b;
        return hashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("TemplateSettings(normalReplacements=").append(this.f12019a).append(", cacheableReplacements=").append(this.b).append(')').toString();
    }

    public final Map a() {
        return this.b;
    }
}
