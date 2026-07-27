package com.vungle.ads.internal.signals;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes7.dex */
public final class m {
    public static final l Companion = new l();

    /* renamed from: a, reason: collision with root package name */
    public final Long f12129a;
    public final long b;
    public String c;
    public final long d;
    public String e;
    public long f;
    public int g;
    public long h;
    public long i;

    public /* synthetic */ m(int i, String str, long j, String str2, long j2, int i2) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, k.f12128a.getDescriptor());
        }
        this.f12129a = 0L;
        this.b = 0L;
        if ((i & 1) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        this.d = j;
        if ((i & 4) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 8) == 0) {
            this.f = 0L;
        } else {
            this.f = j2;
        }
        if ((i & 16) == 0) {
            this.g = 0;
        } else {
            this.g = i2;
        }
        this.h = 0L;
        this.i = 0L;
        this.d = a(0L, 0L);
    }

    public static final void a(m self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.c != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.c);
        }
        output.encodeLongElement(serialDesc, 1, self.d);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.e != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.e);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.f != 0) {
            output.encodeLongElement(serialDesc, 3, self.f);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.g == 0) {
            return;
        }
        output.encodeIntElement(serialDesc, 4, self.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.areEqual(this.f12129a, mVar.f12129a) && this.b == mVar.b;
    }

    public final int hashCode() {
        Long l = this.f12129a;
        return Long.hashCode(this.b) + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("SignaledAd(lastAdLoadTime=").append(this.f12129a).append(", loadAdTime=").append(this.b).append(')').toString();
    }

    public final void a(String str) {
        this.e = str;
    }

    public final void a(int i) {
        this.g = i;
    }

    public final void a(long j) {
        this.h = j;
    }

    public static long a(Long l, long j) {
        if (l == null) {
            return -1L;
        }
        long longValue = j - l.longValue();
        if (longValue < 0) {
            return -1L;
        }
        return longValue;
    }

    public m(Long l, long j) {
        this.f12129a = l;
        this.b = j;
        this.d = a(l, j);
    }
}
