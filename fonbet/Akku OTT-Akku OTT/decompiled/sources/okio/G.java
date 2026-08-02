package okio;

import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSegment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Segment.kt\nokio/Segment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
/* loaded from: classes5.dex */
public final class G {
    public static final a Companion = new a();

    @JvmField
    public final byte[] a;

    @JvmField
    public int b;

    @JvmField
    public int c;

    @JvmField
    public boolean d;

    @JvmField
    public final boolean e;

    @JvmField
    public G f;

    @JvmField
    public G g;

    public static final class a {
    }

    public G() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final G a() {
        G g = this.f;
        if (g == this) {
            g = null;
        }
        G g2 = this.g;
        Intrinsics.checkNotNull(g2);
        g2.f = this.f;
        G g3 = this.f;
        Intrinsics.checkNotNull(g3);
        g3.g = this.g;
        this.f = null;
        this.g = null;
        return g;
    }

    public final void b(G segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.g = this;
        segment.f = this.f;
        G g = this.f;
        Intrinsics.checkNotNull(g);
        g.g = segment;
        this.f = segment;
    }

    public final G c() {
        this.d = true;
        return new G(this.a, this.b, this.c, true, false);
    }

    public final void d(G sink, int i) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        boolean z = sink.e;
        byte[] bArr = sink.a;
        if (!z) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = sink.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (sink.d) {
                throw new IllegalArgumentException();
            }
            int i4 = sink.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr, 0, i4, i2, 2, (Object) null);
            sink.c -= sink.b;
            sink.b = 0;
        }
        int i5 = sink.c;
        int i6 = this.b;
        ArraysKt.copyInto(this.a, bArr, i5, i6, i6 + i);
        sink.c += i;
        this.b += i;
    }

    public G(byte[] data, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.a = data;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
