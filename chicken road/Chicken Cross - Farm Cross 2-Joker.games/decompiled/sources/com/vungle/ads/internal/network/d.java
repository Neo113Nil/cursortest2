package com.vungle.ads.internal.network;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes7.dex */
public final class d {
    public static final c Companion = new c();

    /* renamed from: a, reason: collision with root package name */
    public final g f12044a;
    public final Map b;
    public final String c;
    public int d;
    public int e;
    public String f;

    public /* synthetic */ d(int i, g gVar, Map map, String str, int i2, int i3, String str2) {
        if (16 != (i & 16)) {
            PluginExceptionsKt.throwMissingFieldException(i, 16, b.f12040a.getDescriptor());
        }
        this.f12044a = (i & 1) == 0 ? g.GET : gVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = map;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i2;
        }
        this.e = i3;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
    }

    public static d a(d dVar, int i) {
        g method = dVar.f12044a;
        Map map = dVar.b;
        String str = dVar.c;
        int i2 = dVar.e;
        String str2 = dVar.f;
        Intrinsics.checkNotNullParameter(method, "method");
        return new d(method, map, str, i, i2, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f12044a == dVar.f12044a && Intrinsics.areEqual(this.b, dVar.b) && Intrinsics.areEqual(this.c, dVar.c) && this.d == dVar.d && this.e == dVar.e && Intrinsics.areEqual(this.f, dVar.f);
    }

    public final int hashCode() {
        int hashCode = this.f12044a.hashCode() * 31;
        Map map = this.b;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (Integer.hashCode(this.e) + ((Integer.hashCode(this.d) + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.f;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("FailedTpat(method=").append(this.f12044a).append(", headers=").append(this.b).append(", body=").append(this.c).append(", retryAttempt=").append(this.d).append(", retryCount=").append(this.e).append(", tpatKey=").append(this.f).append(')').toString();
    }

    public static final void a(d self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.f12044a != g.GET) {
            output.encodeSerializableElement(serialDesc, 0, e.f12046a, self.f12044a);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.b != null) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            output.encodeNullableSerializableElement(serialDesc, 1, new LinkedHashMapSerializer(stringSerializer, stringSerializer), self.b);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.c != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.c);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.d != 0) {
            output.encodeIntElement(serialDesc, 3, self.d);
        }
        output.encodeIntElement(serialDesc, 4, self.e);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.f == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.f);
    }

    public d(g method, Map map, String str, int i, int i2, String str2) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.f12044a = method;
        this.b = map;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = str2;
    }

    public final int a() {
        return this.d;
    }
}
