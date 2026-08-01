package com.vungle.ads.internal.signals;

import com.vungle.ads.internal.model.q3;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class c {
    public static final b Companion = new b();

    /* renamed from: a, reason: collision with root package name */
    public final int f12120a;
    public final String b;
    public long c;
    public List d;
    public long e;
    public int f;
    public List g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;

    public c(int i) {
        this.f12120a = i;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.b = uuid;
        this.c = System.currentTimeMillis() / 1000;
        this.d = new ArrayList();
        this.g = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, r2) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(c self, CompositeEncoder output, PluginGeneratedSerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeIntElement(serialDesc, 0, self.f12120a);
        if (!output.shouldEncodeElementDefault(serialDesc, 1)) {
            String str = self.b;
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        }
        output.encodeStringElement(serialDesc, 1, self.b);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.c != System.currentTimeMillis() / 1000) {
            output.encodeLongElement(serialDesc, 2, self.c);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.d, new ArrayList())) {
            output.encodeSerializableElement(serialDesc, 3, new ArrayListSerializer(k.f12128a), self.d);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.e != 0) {
            output.encodeLongElement(serialDesc, 4, self.e);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.f != 0) {
            output.encodeIntElement(serialDesc, 5, self.f);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !Intrinsics.areEqual(self.g, new ArrayList())) {
            output.encodeSerializableElement(serialDesc, 6, new ArrayListSerializer(q3.f12007a), self.g);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.h != 0) {
            output.encodeIntElement(serialDesc, 7, self.h);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.i != 0) {
            output.encodeIntElement(serialDesc, 8, self.i);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.j != 0) {
            output.encodeIntElement(serialDesc, 9, self.j);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.k != 0) {
            output.encodeIntElement(serialDesc, 10, self.k);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 11) && self.l == 0) {
            return;
        }
        output.encodeIntElement(serialDesc, 11, self.l);
    }

    public final List b() {
        return this.d;
    }

    public final List c() {
        return this.g;
    }

    public final void d(int i) {
        this.k = i;
    }

    public final void e(int i) {
        this.i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f12120a == ((c) obj).f12120a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12120a);
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("SessionData(sessionCount=").append(this.f12120a).append(')').toString();
    }

    public final void b(int i) {
        this.l = i;
    }

    public final void c(int i) {
        this.j = i;
    }

    public /* synthetic */ c(int i, int i2, String str, long j, List list, long j2, int i3, List list2, int i4, int i5, int i6, int i7, int i8) {
        String str2;
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, a.f12119a.getDescriptor());
        }
        this.f12120a = i2;
        if ((i & 2) == 0) {
            str2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str2, "randomUUID().toString()");
        } else {
            str2 = str;
        }
        this.b = str2;
        this.c = (i & 4) == 0 ? System.currentTimeMillis() / 1000 : j;
        this.d = (i & 8) == 0 ? new ArrayList() : list;
        this.e = (i & 16) == 0 ? 0L : j2;
        if ((i & 32) == 0) {
            this.f = 0;
        } else {
            this.f = i3;
        }
        this.g = (i & 64) == 0 ? new ArrayList() : list2;
        if ((i & 128) == 0) {
            this.h = 0;
        } else {
            this.h = i4;
        }
        if ((i & 256) == 0) {
            this.i = 0;
        } else {
            this.i = i5;
        }
        if ((i & 512) == 0) {
            this.j = 0;
        } else {
            this.j = i6;
        }
        if ((i & 1024) == 0) {
            this.k = 0;
        } else {
            this.k = i7;
        }
        if ((i & 2048) == 0) {
            this.l = 0;
        } else {
            this.l = i8;
        }
    }

    public final String a() {
        return this.b;
    }

    public final void a(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.g = arrayList;
    }

    public final void a(int i) {
        this.h = i;
    }
}
