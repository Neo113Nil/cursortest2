package okio;

import androidx.media3.session.legacy.PlaybackStateCompat;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 2 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n51#1:146\n51#1:152\n51#1:157\n51#1:162\n51#1:167\n51#1:172\n51#1:175\n51#1:176\n51#1:180\n51#1:185\n51#1:188\n51#1:192\n51#1:201\n51#1:210\n51#1:215\n51#1:220\n51#1:225\n51#1:230\n51#1:235\n51#1:240\n51#1:245\n51#1:250\n51#1:255\n51#1:261\n51#1:267\n51#1:279\n34#2:143\n35#2:145\n36#2,2:147\n40#2:149\n41#2:151\n42#2:153\n50#2:154\n51#2:156\n52#2:158\n56#2:159\n57#2:161\n58#2:163\n66#2:164\n67#2:166\n68#2:168\n72#2:169\n73#2:171\n74#2:173\n78#2:177\n79#2:179\n80#2:181\n88#2:182\n89#2:184\n90#2:186\n94#2,3:189\n97#2,5:193\n105#2,3:198\n108#2,5:202\n116#2:207\n117#2:209\n118#2:211\n122#2:212\n123#2:214\n124#2:216\n128#2:217\n129#2:219\n130#2:221\n134#2:222\n135#2:224\n136#2:226\n140#2:227\n141#2:229\n142#2:231\n146#2:232\n147#2:234\n148#2:236\n152#2:237\n153#2:239\n154#2:241\n158#2:242\n159#2:244\n160#2:246\n164#2:247\n165#2:249\n166#2:251\n170#2:252\n171#2:254\n172#2,2:256\n177#2:258\n178#2:260\n179#2,2:262\n184#2:264\n185#2:266\n186#2,4:268\n192#2,7:272\n199#2,16:280\n216#2:296\n218#2:297\n1#3:144\n1#3:150\n1#3:155\n1#3:160\n1#3:165\n1#3:170\n1#3:174\n1#3:178\n1#3:183\n1#3:187\n1#3:208\n1#3:213\n1#3:218\n1#3:223\n1#3:228\n1#3:233\n1#3:238\n1#3:243\n1#3:248\n1#3:253\n1#3:259\n1#3:265\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n55#1:146\n56#1:152\n58#1:157\n59#1:162\n61#1:167\n63#1:172\n67#1:175\n78#1:176\n82#1:180\n84#1:185\n88#1:188\n93#1:192\n94#1:201\n95#1:210\n96#1:215\n97#1:220\n98#1:225\n99#1:230\n100#1:235\n101#1:240\n102#1:245\n103#1:250\n104#1:255\n105#1:261\n134#1:267\n138#1:279\n55#1:143\n55#1:145\n55#1:147,2\n56#1:149\n56#1:151\n56#1:153\n58#1:154\n58#1:156\n58#1:158\n59#1:159\n59#1:161\n59#1:163\n61#1:164\n61#1:166\n61#1:168\n63#1:169\n63#1:171\n63#1:173\n82#1:177\n82#1:179\n82#1:181\n84#1:182\n84#1:184\n84#1:186\n93#1:189,3\n93#1:193,5\n94#1:198,3\n94#1:202,5\n95#1:207\n95#1:209\n95#1:211\n96#1:212\n96#1:214\n96#1:216\n97#1:217\n97#1:219\n97#1:221\n98#1:222\n98#1:224\n98#1:226\n99#1:227\n99#1:229\n99#1:231\n100#1:232\n100#1:234\n100#1:236\n101#1:237\n101#1:239\n101#1:241\n102#1:242\n102#1:244\n102#1:246\n103#1:247\n103#1:249\n103#1:251\n104#1:252\n104#1:254\n104#1:256,2\n105#1:258\n105#1:260\n105#1:262,2\n134#1:264\n134#1:266\n134#1:268,4\n138#1:272,7\n138#1:280,16\n139#1:296\n140#1:297\n55#1:144\n56#1:150\n58#1:155\n59#1:160\n61#1:165\n63#1:170\n82#1:178\n84#1:183\n95#1:208\n96#1:213\n97#1:218\n98#1:223\n99#1:228\n100#1:233\n101#1:238\n102#1:243\n103#1:248\n104#1:253\n105#1:259\n134#1:265\n*E\n"})
/* loaded from: classes5.dex */
public final class E implements InterfaceC1191f {

    @JvmField
    public final J a;

    @JvmField
    public final C1190e b;

    @JvmField
    public boolean c;

    public E(J sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.a = sink;
        this.b = new C1190e();
    }

    @Override // okio.InterfaceC1191f
    public final InterfaceC1191f B(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.d0(j);
        j();
        return this;
    }

    @Override // okio.InterfaceC1191f
    public final InterfaceC1191f L(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.e0(j);
        j();
        return this;
    }

    @Override // okio.InterfaceC1191f
    public final InterfaceC1191f O(int i, int i2, String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.j0(i, i2, string);
        j();
        return this;
    }

    @Override // okio.InterfaceC1191f
    public final InterfaceC1191f R(C1193h byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.b0(byteString);
        j();
        return this;
    }

    @Override // okio.InterfaceC1191f
    public final OutputStream S() {
        return new a();
    }

    @Override // okio.InterfaceC1191f
    public final C1190e a() {
        return this.b;
    }

    @Override // okio.J, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        J j = this.a;
        if (this.c) {
            return;
        }
        try {
            C1190e c1190e = this.b;
            long j2 = c1190e.b;
            if (j2 > 0) {
                j.write(c1190e, j2);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            j.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.InterfaceC1191f
    public final InterfaceC1191f e() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        C1190e c1190e = this.b;
        long j = c1190e.b;
        if (j > 0) {
            this.a.write(c1190e, j);
        }
        return this;
    }

    @Override // okio.InterfaceC1191f
    public final InterfaceC1191f f(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.l0(i);
        j();
        return this;
    }

    @Override // okio.InterfaceC1191f, okio.J, java.io.Flushable
    public final void flush() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        C1190e c1190e = this.b;
        long j = c1190e.b;
        J j2 = this.a;
        if (j > 0) {
            j2.write(c1190e, j);
        }
        j2.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // okio.InterfaceC1191f
    public final InterfaceC1191f j() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        C1190e c1190e = this.b;
        long q = c1190e.q();
        if (q > 0) {
            this.a.write(c1190e, q);
        }
        return this;
    }

    @Override // okio.InterfaceC1191f
    public final InterfaceC1191f m(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.k0(string);
        j();
        return this;
    }

    @Override // okio.InterfaceC1191f
    public final long o(K source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long read = source.read(this.b, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (read == -1) {
                return j;
            }
            j += read;
            j();
        }
    }

    @Override // okio.J
    public final L timeout() {
        return this.a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        int write = this.b.write(source);
        j();
        return write;
    }

    @Override // okio.InterfaceC1191f
    public final InterfaceC1191f writeByte(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.c0(i);
        j();
        return this;
    }

    @Override // okio.InterfaceC1191f
    public final InterfaceC1191f writeInt(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.f0(i);
        j();
        return this;
    }

    @Override // okio.InterfaceC1191f
    public final InterfaceC1191f writeShort(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.h0(i);
        j();
        return this;
    }

    @SourceDebugExtension({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink$outputStream$1\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n1#1,142:1\n51#2:143\n51#2:144\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink$outputStream$1\n*L\n111#1:143\n117#1:144\n*E\n"})
    public static final class a extends OutputStream {
        public a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            E.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            E e = E.this;
            if (e.c) {
                return;
            }
            e.flush();
        }

        public final String toString() {
            return E.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            E e = E.this;
            if (e.c) {
                throw new IOException("closed");
            }
            e.b.c0((byte) i);
            e.j();
        }

        @Override // java.io.OutputStream
        public final void write(byte[] data, int i, int i2) {
            Intrinsics.checkNotNullParameter(data, "data");
            E e = E.this;
            if (!e.c) {
                e.b.m3358write(data, i, i2);
                e.j();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // okio.J
    public final void write(C1190e source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.c) {
            this.b.write(source, j);
            j();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.InterfaceC1191f
    public final InterfaceC1191f write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.c) {
            this.b.m3357write(source);
            j();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.InterfaceC1191f
    public final InterfaceC1191f write(byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.c) {
            this.b.m3358write(source, i, i2);
            j();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
