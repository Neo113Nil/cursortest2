package androidx.exifinterface.media;

import N3.C3660k;
import T7.E;
import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.b;
import g.C6594f;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: U, reason: collision with root package name */
    private static final e f42784U;

    /* renamed from: V, reason: collision with root package name */
    static final e[][] f42785V;

    /* renamed from: W, reason: collision with root package name */
    private static final e[] f42786W;

    /* renamed from: X, reason: collision with root package name */
    private static final HashMap<Integer, e>[] f42787X;

    /* renamed from: Y, reason: collision with root package name */
    private static final HashMap<String, e>[] f42788Y;

    /* renamed from: Z, reason: collision with root package name */
    private static final HashSet<String> f42789Z;

    /* renamed from: a0, reason: collision with root package name */
    private static final HashMap<Integer, Integer> f42790a0;

    /* renamed from: b0, reason: collision with root package name */
    static final Charset f42791b0;

    /* renamed from: c0, reason: collision with root package name */
    static final byte[] f42792c0;

    /* renamed from: d0, reason: collision with root package name */
    private static final byte[] f42793d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final Pattern f42794e0;

    /* renamed from: f0, reason: collision with root package name */
    private static final Pattern f42795f0;

    /* renamed from: g0, reason: collision with root package name */
    private static final Pattern f42796g0;

    /* renamed from: a, reason: collision with root package name */
    private String f42804a;

    /* renamed from: b, reason: collision with root package name */
    private FileDescriptor f42805b;

    /* renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f42806c;

    /* renamed from: d, reason: collision with root package name */
    private int f42807d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, d>[] f42808e;

    /* renamed from: f, reason: collision with root package name */
    private HashSet f42809f;

    /* renamed from: g, reason: collision with root package name */
    private ByteOrder f42810g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f42811h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f42812i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f42813j;

    /* renamed from: k, reason: collision with root package name */
    private int f42814k;

    /* renamed from: l, reason: collision with root package name */
    private int f42815l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f42816m;

    /* renamed from: n, reason: collision with root package name */
    private int f42817n;

    /* renamed from: o, reason: collision with root package name */
    private int f42818o;

    /* renamed from: p, reason: collision with root package name */
    private int f42819p;

    /* renamed from: q, reason: collision with root package name */
    private int f42820q;

    /* renamed from: r, reason: collision with root package name */
    private int f42821r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f42822s;

    /* renamed from: t, reason: collision with root package name */
    private static final boolean f42797t = Log.isLoggable("ExifInterface", 3);

    /* renamed from: u, reason: collision with root package name */
    private static final List<Integer> f42798u = Arrays.asList(1, 6, 3, 8);

    /* renamed from: v, reason: collision with root package name */
    private static final List<Integer> f42799v = Arrays.asList(2, 7, 4, 5);

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f42800w = {8, 8, 8};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f42801x = {8};

    /* renamed from: y, reason: collision with root package name */
    static final byte[] f42802y = {-1, -40, -1};

    /* renamed from: z, reason: collision with root package name */
    private static final byte[] f42803z = {102, 116, 121, 112};

    /* renamed from: A, reason: collision with root package name */
    private static final byte[] f42764A = {109, 105, 102, 49};

    /* renamed from: B, reason: collision with root package name */
    private static final byte[] f42765B = {104, 101, 105, 99};

    /* renamed from: C, reason: collision with root package name */
    private static final byte[] f42766C = {79, 76, 89, 77, 80, 0};

    /* renamed from: D, reason: collision with root package name */
    private static final byte[] f42767D = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: E, reason: collision with root package name */
    private static final byte[] f42768E = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: F, reason: collision with root package name */
    private static final byte[] f42769F = {101, 88, 73, 102};

    /* renamed from: G, reason: collision with root package name */
    private static final byte[] f42770G = {73, 72, 68, 82};

    /* renamed from: H, reason: collision with root package name */
    private static final byte[] f42771H = {73, 69, 78, 68};

    /* renamed from: I, reason: collision with root package name */
    private static final byte[] f42772I = {82, 73, 70, 70};

    /* renamed from: J, reason: collision with root package name */
    private static final byte[] f42773J = {87, 69, 66, 80};

    /* renamed from: K, reason: collision with root package name */
    private static final byte[] f42774K = {69, 88, 73, 70};

    /* renamed from: L, reason: collision with root package name */
    private static final byte[] f42775L = {-99, 1, 42};

    /* renamed from: M, reason: collision with root package name */
    private static final byte[] f42776M = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: N, reason: collision with root package name */
    private static final byte[] f42777N = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: O, reason: collision with root package name */
    private static final byte[] f42778O = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: P, reason: collision with root package name */
    private static final byte[] f42779P = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: Q, reason: collision with root package name */
    private static final byte[] f42780Q = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: R, reason: collision with root package name */
    static final String[] f42781R = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: S, reason: collision with root package name */
    static final int[] f42782S = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: T, reason: collision with root package name */
    static final byte[] f42783T = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: androidx.exifinterface.media.a$a, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    final class C0784a extends MediaDataSource {

        /* renamed from: a, reason: collision with root package name */
        long f42823a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f42824b;

        C0784a(g gVar) {
            this.f42824b = gVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public final long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public final int readAt(long j11, byte[] bArr, int i11, int i12) throws IOException {
            if (i12 == 0) {
                return 0;
            }
            if (j11 < 0) {
                return -1;
            }
            try {
                long j12 = this.f42823a;
                g gVar = this.f42824b;
                if (j12 != j11) {
                    if (j12 >= 0 && j11 >= j12 + gVar.f42827a.available()) {
                        return -1;
                    }
                    gVar.j(j11);
                    this.f42823a = j11;
                }
                if (i12 > gVar.f42827a.available()) {
                    i12 = gVar.f42827a.available();
                }
                int read = gVar.read(bArr, i11, i12);
                if (read >= 0) {
                    this.f42823a += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f42823a = -1L;
            return -1;
        }
    }

    private static class b extends InputStream implements DataInput {

        /* renamed from: e, reason: collision with root package name */
        private static final ByteOrder f42825e = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: f, reason: collision with root package name */
        private static final ByteOrder f42826f = ByteOrder.BIG_ENDIAN;

        /* renamed from: a, reason: collision with root package name */
        final DataInputStream f42827a;

        /* renamed from: b, reason: collision with root package name */
        private ByteOrder f42828b;

        /* renamed from: c, reason: collision with root package name */
        int f42829c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f42830d;

        b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            return this.f42827a.available();
        }

        public final void c(ByteOrder byteOrder) {
            this.f42828b = byteOrder;
        }

        public final void d(int i11) throws IOException {
            int i12 = 0;
            while (i12 < i11) {
                DataInputStream dataInputStream = this.f42827a;
                int i13 = i11 - i12;
                int skip = (int) dataInputStream.skip(i13);
                if (skip <= 0) {
                    if (this.f42830d == null) {
                        this.f42830d = new byte[8192];
                    }
                    skip = dataInputStream.read(this.f42830d, 0, Math.min(8192, i13));
                    if (skip == -1) {
                        throw new EOFException(E.a(i11, "Reached EOF while skipping ", " bytes."));
                    }
                }
                i12 += skip;
            }
            this.f42829c += i12;
        }

        @Override // java.io.InputStream
        public final void mark(int i11) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            this.f42829c++;
            return this.f42827a.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() throws IOException {
            this.f42829c++;
            return this.f42827a.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            this.f42829c++;
            int read = this.f42827a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() throws IOException {
            this.f42829c += 2;
            return this.f42827a.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i11, int i12) throws IOException {
            this.f42829c += i12;
            this.f42827a.readFully(bArr, i11, i12);
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            this.f42829c += 4;
            DataInputStream dataInputStream = this.f42827a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f42828b;
            if (byteOrder == f42825e) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f42826f) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f42828b);
        }

        @Override // java.io.DataInput
        public final String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            long j11;
            long j12;
            this.f42829c += 8;
            DataInputStream dataInputStream = this.f42827a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            int read5 = dataInputStream.read();
            int read6 = dataInputStream.read();
            int read7 = dataInputStream.read();
            int read8 = dataInputStream.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f42828b;
            if (byteOrder == f42825e) {
                j11 = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
                j12 = read;
            } else {
                if (byteOrder != f42826f) {
                    throw new IOException("Invalid byte order: " + this.f42828b);
                }
                j11 = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
                j12 = read8;
            }
            return j11 + j12;
        }

        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            this.f42829c += 2;
            DataInputStream dataInputStream = this.f42827a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f42828b;
            if (byteOrder == f42825e) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == f42826f) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f42828b);
        }

        @Override // java.io.DataInput
        public final String readUTF() throws IOException {
            this.f42829c += 2;
            return this.f42827a.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() throws IOException {
            this.f42829c++;
            return this.f42827a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            this.f42829c += 2;
            DataInputStream dataInputStream = this.f42827a;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f42828b;
            if (byteOrder == f42825e) {
                return (read2 << 8) + read;
            }
            if (byteOrder == f42826f) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f42828b);
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i11) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f42828b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f42827a = dataInputStream;
            dataInputStream.mark(0);
            this.f42829c = 0;
            this.f42828b = byteOrder;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i11, int i12) throws IOException {
            int read = this.f42827a.read(bArr, i11, i12);
            this.f42829c += read;
            return read;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            this.f42829c += bArr.length;
            this.f42827a.readFully(bArr);
        }
    }

    /* loaded from: classes8.dex */
    private static class c extends FilterOutputStream {

        /* renamed from: a, reason: collision with root package name */
        final OutputStream f42831a;

        /* renamed from: b, reason: collision with root package name */
        private ByteOrder f42832b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f42831a = outputStream;
            this.f42832b = byteOrder;
        }

        public final void c(ByteOrder byteOrder) {
            this.f42832b = byteOrder;
        }

        public final void d(int i11) throws IOException {
            this.f42831a.write(i11);
        }

        public final void j(int i11) throws IOException {
            ByteOrder byteOrder = this.f42832b;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            OutputStream outputStream = this.f42831a;
            if (byteOrder == byteOrder2) {
                outputStream.write(i11 & 255);
                outputStream.write((i11 >>> 8) & 255);
                outputStream.write((i11 >>> 16) & 255);
                outputStream.write((i11 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                outputStream.write((i11 >>> 24) & 255);
                outputStream.write((i11 >>> 16) & 255);
                outputStream.write((i11 >>> 8) & 255);
                outputStream.write(i11 & 255);
            }
        }

        public final void k(short s11) throws IOException {
            ByteOrder byteOrder = this.f42832b;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            OutputStream outputStream = this.f42831a;
            if (byteOrder == byteOrder2) {
                outputStream.write(s11 & 255);
                outputStream.write((s11 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                outputStream.write((s11 >>> 8) & 255);
                outputStream.write(s11 & 255);
            }
        }

        public final void m(long j11) throws IOException {
            j((int) j11);
        }

        public final void o(int i11) throws IOException {
            k((short) i11);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.f42831a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i11, int i12) throws IOException {
            this.f42831a.write(bArr, i11, i12);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f42833a;

        /* renamed from: b, reason: collision with root package name */
        public final int f42834b;

        /* renamed from: c, reason: collision with root package name */
        public final long f42835c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f42836d;

        d(int i11, int i12, byte[] bArr) {
            this(-1L, bArr, i11, i12);
        }

        public static d a(String str) {
            byte[] bytes = str.concat("\u0000").getBytes(a.f42791b0);
            return new d(2, bytes.length, bytes);
        }

        public static d b(long j11, ByteOrder byteOrder) {
            return c(new long[]{j11}, byteOrder);
        }

        public static d c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f42782S[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j11 : jArr) {
                wrap.putInt((int) j11);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f42782S[5] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f42841a);
                wrap.putInt((int) fVar.f42842b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        public static d e(int i11, ByteOrder byteOrder) {
            return f(new int[]{i11}, byteOrder);
        }

        public static d f(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.f42782S[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i11 : iArr) {
                wrap.putShort((short) i11);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public final double g(ByteOrder byteOrder) {
            Object j11 = j(byteOrder);
            if (j11 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (j11 instanceof String) {
                return Double.parseDouble((String) j11);
            }
            if (j11 instanceof long[]) {
                if (((long[]) j11).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (j11 instanceof int[]) {
                if (((int[]) j11).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (j11 instanceof double[]) {
                double[] dArr = (double[]) j11;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(j11 instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) j11;
            if (fVarArr.length == 1) {
                return fVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public final int h(ByteOrder byteOrder) {
            Object j11 = j(byteOrder);
            if (j11 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (j11 instanceof String) {
                return Integer.parseInt((String) j11);
            }
            if (j11 instanceof long[]) {
                long[] jArr = (long[]) j11;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(j11 instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) j11;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public final String i(ByteOrder byteOrder) {
            Object j11 = j(byteOrder);
            if (j11 == null) {
                return null;
            }
            if (j11 instanceof String) {
                return (String) j11;
            }
            StringBuilder sb2 = new StringBuilder();
            int i11 = 0;
            if (j11 instanceof long[]) {
                long[] jArr = (long[]) j11;
                while (i11 < jArr.length) {
                    sb2.append(jArr[i11]);
                    i11++;
                    if (i11 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (j11 instanceof int[]) {
                int[] iArr = (int[]) j11;
                while (i11 < iArr.length) {
                    sb2.append(iArr[i11]);
                    i11++;
                    if (i11 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (j11 instanceof double[]) {
                double[] dArr = (double[]) j11;
                while (i11 < dArr.length) {
                    sb2.append(dArr[i11]);
                    i11++;
                    if (i11 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(j11 instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) j11;
            while (i11 < fVarArr.length) {
                sb2.append(fVarArr[i11].f42841a);
                sb2.append('/');
                sb2.append(fVarArr[i11].f42842b);
                i11++;
                if (i11 != fVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Not initialized variable reg: 6, insn: 0x0034: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:162:0x0034 */
        /* JADX WARN: Removed duplicated region for block: B:165:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r15v22, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v23, types: [java.io.Serializable, long[]] */
        /* JADX WARN: Type inference failed for: r15v24, types: [androidx.exifinterface.media.a$f[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v25, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v27, types: [androidx.exifinterface.media.a$f[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v28, types: [double[], java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final Serializable j(ByteOrder byteOrder) {
            b bVar;
            InputStream inputStream;
            byte b11;
            String sb2;
            int i11 = 0;
            byte[] bArr = this.f42836d;
            InputStream inputStream2 = null;
            try {
                try {
                    try {
                        bVar = new b(bArr);
                        try {
                            bVar.c(byteOrder);
                            int i12 = this.f42833a;
                            int i13 = this.f42834b;
                            switch (i12) {
                                case 1:
                                case 6:
                                    if (bArr.length != 1 || (b11 = bArr[0]) < 0 || b11 > 1) {
                                        String str = new String(bArr, a.f42791b0);
                                        try {
                                            bVar.close();
                                            return str;
                                        } catch (IOException e11) {
                                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                            return str;
                                        }
                                    }
                                    String str2 = new String(new char[]{(char) (b11 + 48)});
                                    try {
                                        bVar.close();
                                        return str2;
                                    } catch (IOException e12) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                        return str2;
                                    }
                                case 2:
                                case 7:
                                    if (i13 >= a.f42783T.length) {
                                        int i14 = 0;
                                        while (true) {
                                            byte[] bArr2 = a.f42783T;
                                            if (i14 >= bArr2.length) {
                                                i11 = bArr2.length;
                                            } else if (bArr[i14] == bArr2[i14]) {
                                                i14++;
                                            }
                                        }
                                    }
                                    StringBuilder sb3 = new StringBuilder();
                                    try {
                                        while (i11 < i13) {
                                            byte b12 = bArr[i11];
                                            if (b12 == 0) {
                                                sb2 = sb3.toString();
                                                bVar.close();
                                                return sb2;
                                            }
                                            if (b12 >= 32) {
                                                sb3.append((char) b12);
                                            } else {
                                                sb3.append('?');
                                            }
                                            i11++;
                                        }
                                        bVar.close();
                                        return sb2;
                                    } catch (IOException e13) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                                        return sb2;
                                    }
                                    sb2 = sb3.toString();
                                case 3:
                                    ?? r15 = new int[i13];
                                    while (i11 < i13) {
                                        r15[i11] = bVar.readUnsignedShort();
                                        i11++;
                                    }
                                    try {
                                        bVar.close();
                                        return r15;
                                    } catch (IOException e14) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                                        return r15;
                                    }
                                case 4:
                                    ?? r152 = new long[i13];
                                    while (i11 < i13) {
                                        r152[i11] = bVar.readInt() & 4294967295L;
                                        i11++;
                                    }
                                    try {
                                        bVar.close();
                                        return r152;
                                    } catch (IOException e15) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                                        return r152;
                                    }
                                case 5:
                                    ?? r153 = new f[i13];
                                    while (i11 < i13) {
                                        r153[i11] = new f(bVar.readInt() & 4294967295L, bVar.readInt() & 4294967295L);
                                        i11++;
                                    }
                                    try {
                                        bVar.close();
                                        return r153;
                                    } catch (IOException e16) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                                        return r153;
                                    }
                                case 8:
                                    ?? r154 = new int[i13];
                                    while (i11 < i13) {
                                        r154[i11] = bVar.readShort();
                                        i11++;
                                    }
                                    try {
                                        bVar.close();
                                        return r154;
                                    } catch (IOException e17) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
                                        return r154;
                                    }
                                case 9:
                                    ?? r155 = new int[i13];
                                    while (i11 < i13) {
                                        r155[i11] = bVar.readInt();
                                        i11++;
                                    }
                                    try {
                                        bVar.close();
                                        return r155;
                                    } catch (IOException e18) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e18);
                                        return r155;
                                    }
                                case 10:
                                    ?? r156 = new f[i13];
                                    while (i11 < i13) {
                                        r156[i11] = new f(bVar.readInt(), bVar.readInt());
                                        i11++;
                                    }
                                    try {
                                        bVar.close();
                                        return r156;
                                    } catch (IOException e19) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e19);
                                        return r156;
                                    }
                                case 11:
                                    ?? r157 = new double[i13];
                                    while (i11 < i13) {
                                        r157[i11] = bVar.readFloat();
                                        i11++;
                                    }
                                    try {
                                        bVar.close();
                                        return r157;
                                    } catch (IOException e21) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e21);
                                        return r157;
                                    }
                                case 12:
                                    ?? r158 = new double[i13];
                                    while (i11 < i13) {
                                        r158[i11] = bVar.readDouble();
                                        i11++;
                                    }
                                    try {
                                        bVar.close();
                                        return r158;
                                    } catch (IOException e22) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e22);
                                        return r158;
                                    }
                                default:
                                    bVar.close();
                                    return null;
                            }
                        } catch (IOException e23) {
                            e = e23;
                            Log.w("ExifInterface", "IOException occurred during reading a value", e);
                            if (bVar != null) {
                                bVar.close();
                            }
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream2 = inputStream;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException e24) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e24);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e25) {
                    e = e25;
                    bVar = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (inputStream2 != null) {
                    }
                    throw th;
                }
            } catch (IOException e26) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", e26);
            }
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("(");
            sb2.append(a.f42781R[this.f42833a]);
            sb2.append(", data length:");
            return K00.b.e(this.f42836d.length, ")", sb2);
        }

        d(long j11, byte[] bArr, int i11, int i12) {
            this.f42833a = i11;
            this.f42834b = i12;
            this.f42835c = j11;
            this.f42836d = bArr;
        }
    }

    /* loaded from: classes8.dex */
    private static class f {

        /* renamed from: a, reason: collision with root package name */
        public final long f42841a;

        /* renamed from: b, reason: collision with root package name */
        public final long f42842b;

        f(double d11) {
            this((long) (d11 * 10000.0d), 10000L);
        }

        public final double a() {
            return this.f42841a / this.f42842b;
        }

        public final String toString() {
            return this.f42841a + "/" + this.f42842b;
        }

        f(long j11, long j12) {
            if (j12 == 0) {
                this.f42841a = 0L;
                this.f42842b = 1L;
            } else {
                this.f42841a = j11;
                this.f42842b = j12;
            }
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f42784U = new e("StripOffsets", 273, 3);
        f42785V = new e[][]{eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, new e[]{new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)}, new e[]{new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)}, new e[]{new e("AspectFrame", 4371, 3)}, new e[]{new e("ColorSpace", 55, 3)}};
        f42786W = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f42787X = new HashMap[10];
        f42788Y = new HashMap[10];
        f42789Z = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f42790a0 = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        f42791b0 = forName;
        f42792c0 = "Exif\u0000\u0000".getBytes(forName);
        f42793d0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i11 = 0;
        while (true) {
            e[][] eVarArr6 = f42785V;
            if (i11 >= eVarArr6.length) {
                HashMap<Integer, Integer> hashMap = f42790a0;
                e[] eVarArr7 = f42786W;
                hashMap.put(Integer.valueOf(eVarArr7[0].f42837a), 5);
                hashMap.put(Integer.valueOf(eVarArr7[1].f42837a), 1);
                hashMap.put(Integer.valueOf(eVarArr7[2].f42837a), 2);
                hashMap.put(Integer.valueOf(eVarArr7[3].f42837a), 3);
                hashMap.put(Integer.valueOf(eVarArr7[4].f42837a), 7);
                hashMap.put(Integer.valueOf(eVarArr7[5].f42837a), 8);
                Pattern.compile(".*[1-9].*");
                f42794e0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f42795f0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f42796g0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f42787X[i11] = new HashMap<>();
            f42788Y[i11] = new HashMap<>();
            for (e eVar : eVarArr6[i11]) {
                f42787X[i11].put(Integer.valueOf(eVar.f42837a), eVar);
                f42788Y[i11].put(eVar.f42838b, eVar);
            }
            i11++;
        }
    }

    public a(@NonNull String str) throws IOException {
        FileInputStream fileInputStream;
        boolean z11;
        e[][] eVarArr = f42785V;
        this.f42808e = new HashMap[eVarArr.length];
        this.f42809f = new HashSet(eVarArr.length);
        this.f42810g = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f42806c = null;
        this.f42804a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            try {
                b.a.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                z11 = true;
            } catch (Exception unused) {
                if (f42797t) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                z11 = false;
            }
            if (z11) {
                this.f42805b = fileInputStream.getFD();
            } else {
                this.f42805b = null;
            }
            v(fileInputStream);
            androidx.exifinterface.media.b.c(fileInputStream);
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            androidx.exifinterface.media.b.c(fileInputStream2);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A(g gVar, int i11) throws IOException {
        HashMap<String, d>[] hashMapArr;
        short s11;
        boolean z11;
        short s12;
        HashMap<String, d>[] hashMapArr2;
        HashSet hashSet;
        long j11;
        boolean z12;
        int i12;
        HashSet hashSet2;
        int i13;
        int i14;
        int readUnsignedShort;
        long j12;
        int i15 = i11;
        Integer valueOf = Integer.valueOf(gVar.f42829c);
        HashSet hashSet3 = this.f42809f;
        hashSet3.add(valueOf);
        short readShort = gVar.readShort();
        boolean z13 = f42797t;
        if (z13) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort <= 0) {
            return;
        }
        short s13 = 0;
        while (true) {
            hashMapArr = this.f42808e;
            if (s13 >= readShort) {
                break;
            }
            int readUnsignedShort2 = gVar.readUnsignedShort();
            int readUnsignedShort3 = gVar.readUnsignedShort();
            int readInt = gVar.readInt();
            long j13 = gVar.f42829c + 4;
            e eVar = f42787X[i15].get(Integer.valueOf(readUnsignedShort2));
            if (z13) {
                s11 = readShort;
                z11 = z13;
                s12 = s13;
                hashMapArr2 = hashMapArr;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i15), Integer.valueOf(readUnsignedShort2), eVar != null ? eVar.f42838b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
            } else {
                s11 = readShort;
                z11 = z13;
                s12 = s13;
                hashMapArr2 = hashMapArr;
            }
            if (eVar != null) {
                if (readUnsignedShort3 > 0) {
                    if (readUnsignedShort3 < f42782S.length) {
                        int i16 = eVar.f42839c;
                        if (i16 == 7 || readUnsignedShort3 == 7 || i16 == readUnsignedShort3 || (i12 = eVar.f42840d) == readUnsignedShort3 || (((i16 == 4 || i12 == 4) && readUnsignedShort3 == 3) || (((i16 == 9 || i12 == 9) && readUnsignedShort3 == 8) || ((i16 == 12 || i12 == 12) && readUnsignedShort3 == 11)))) {
                            if (readUnsignedShort3 == 7) {
                                readUnsignedShort3 = i16;
                            }
                            hashSet = hashSet3;
                            j11 = readInt * r6[readUnsignedShort3];
                            if (j11 < 0 || j11 > 2147483647L) {
                                if (z11) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + readInt);
                                }
                                z12 = false;
                                if (z12) {
                                    gVar.j(j13);
                                } else {
                                    if (j11 > 4) {
                                        int readInt2 = gVar.readInt();
                                        if (z11) {
                                            hashSet2 = hashSet;
                                            Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                        } else {
                                            hashSet2 = hashSet;
                                        }
                                        if (this.f42807d == 7) {
                                            if ("MakerNote".equals(eVar.f42838b)) {
                                                this.f42819p = readInt2;
                                            } else if (i15 == 6 && "ThumbnailImage".equals(eVar.f42838b)) {
                                                this.f42820q = readInt2;
                                                this.f42821r = readInt;
                                                d e11 = d.e(6, this.f42810g);
                                                i13 = readUnsignedShort2;
                                                d b11 = d.b(this.f42820q, this.f42810g);
                                                i14 = readInt;
                                                d b12 = d.b(this.f42821r, this.f42810g);
                                                hashMapArr2[4].put("Compression", e11);
                                                hashMapArr2[4].put("JPEGInterchangeFormat", b11);
                                                hashMapArr2[4].put("JPEGInterchangeFormatLength", b12);
                                                gVar.j(readInt2);
                                            }
                                        }
                                        i13 = readUnsignedShort2;
                                        i14 = readInt;
                                        gVar.j(readInt2);
                                    } else {
                                        hashSet2 = hashSet;
                                        i13 = readUnsignedShort2;
                                        i14 = readInt;
                                    }
                                    Integer num = f42790a0.get(Integer.valueOf(i13));
                                    if (z11) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j11);
                                    }
                                    if (num != null) {
                                        if (readUnsignedShort3 != 3) {
                                            if (readUnsignedShort3 == 4) {
                                                j12 = gVar.readInt() & 4294967295L;
                                            } else if (readUnsignedShort3 == 8) {
                                                readUnsignedShort = gVar.readShort();
                                            } else if (readUnsignedShort3 == 9 || readUnsignedShort3 == 13) {
                                                readUnsignedShort = gVar.readInt();
                                            } else {
                                                j12 = -1;
                                            }
                                            if (z11) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j12), eVar.f42838b));
                                            }
                                            if (j12 <= 0) {
                                                hashSet = hashSet2;
                                                if (!hashSet.contains(Integer.valueOf((int) j12))) {
                                                    gVar.j(j12);
                                                    A(gVar, num.intValue());
                                                } else if (z11) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j12 + ")");
                                                }
                                            } else {
                                                hashSet = hashSet2;
                                                if (z11) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j12);
                                                }
                                            }
                                            gVar.j(j13);
                                        } else {
                                            readUnsignedShort = gVar.readUnsignedShort();
                                        }
                                        j12 = readUnsignedShort;
                                        if (z11) {
                                        }
                                        if (j12 <= 0) {
                                        }
                                        gVar.j(j13);
                                    } else {
                                        hashSet = hashSet2;
                                        int i17 = gVar.f42829c + this.f42818o;
                                        byte[] bArr = new byte[(int) j11];
                                        gVar.readFully(bArr);
                                        d dVar = new d(i17, bArr, readUnsignedShort3, i14);
                                        hashMapArr2[i11].put(eVar.f42838b, dVar);
                                        String str = eVar.f42838b;
                                        if ("DNGVersion".equals(str)) {
                                            this.f42807d = 3;
                                        }
                                        if ((("Make".equals(str) || "Model".equals(str)) && dVar.i(this.f42810g).contains("PENTAX")) || ("Compression".equals(str) && dVar.h(this.f42810g) == 65535)) {
                                            this.f42807d = 8;
                                        }
                                        if (gVar.f42829c != j13) {
                                            gVar.j(j13);
                                        }
                                    }
                                }
                                s13 = (short) (s12 + 1);
                                i15 = i11;
                                hashSet3 = hashSet;
                                readShort = s11;
                                z13 = z11;
                            } else {
                                z12 = true;
                                if (z12) {
                                }
                                s13 = (short) (s12 + 1);
                                i15 = i11;
                                hashSet3 = hashSet;
                                readShort = s11;
                                z13 = z11;
                            }
                        } else if (z11) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f42781R[readUnsignedShort3] + ") is unexpected for tag: " + eVar.f42838b);
                        }
                    }
                }
                hashSet = hashSet3;
                if (z11) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                }
                j11 = 0;
                z12 = false;
                if (z12) {
                }
                s13 = (short) (s12 + 1);
                i15 = i11;
                hashSet3 = hashSet;
                readShort = s11;
                z13 = z11;
            } else if (z11) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
            }
            hashSet = hashSet3;
            j11 = 0;
            z12 = false;
            if (z12) {
            }
            s13 = (short) (s12 + 1);
            i15 = i11;
            hashSet3 = hashSet;
            readShort = s11;
            z13 = z11;
        }
        HashSet hashSet4 = hashSet3;
        boolean z14 = z13;
        int readInt3 = gVar.readInt();
        if (z14) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
        }
        long j14 = readInt3;
        if (j14 <= 0) {
            if (z14) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        if (hashSet4.contains(Integer.valueOf(readInt3))) {
            if (z14) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                return;
            }
            return;
        }
        gVar.j(j14);
        if (hashMapArr[4].isEmpty()) {
            A(gVar, 4);
        } else if (hashMapArr[5].isEmpty()) {
            A(gVar, 5);
        }
    }

    private void B(String str) {
        for (int i11 = 0; i11 < f42785V.length; i11++) {
            this.f42808e[i11].remove(str);
        }
    }

    private void C(int i11, String str, String str2) {
        HashMap<String, d>[] hashMapArr = this.f42808e;
        if (hashMapArr[i11].isEmpty() || hashMapArr[i11].get(str) == null) {
            return;
        }
        HashMap<String, d> hashMap = hashMapArr[i11];
        hashMap.put(str2, hashMap.get(str));
        hashMapArr[i11].remove(str);
    }

    private void E(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        if (f42797t) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        b bVar = new b(bufferedInputStream);
        c cVar = new c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.d(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.d(-40);
        String d11 = d("Xmp");
        HashMap<String, d>[] hashMapArr = this.f42808e;
        d remove = (d11 == null || !this.f42822s) ? null : hashMapArr[0].remove("Xmp");
        cVar.d(-1);
        cVar.d(-31);
        M(cVar);
        if (remove != null) {
            hashMapArr[0].put("Xmp", remove);
        }
        byte[] bArr = new byte[4096];
        while (bVar.readByte() == -1) {
            byte readByte = bVar.readByte();
            if (readByte == -39 || readByte == -38) {
                cVar.d(-1);
                cVar.d(readByte);
                androidx.exifinterface.media.b.e(bVar, cVar);
                return;
            }
            if (readByte != -31) {
                cVar.d(-1);
                cVar.d(readByte);
                int readUnsignedShort = bVar.readUnsignedShort();
                cVar.o(readUnsignedShort);
                int i11 = readUnsignedShort - 2;
                if (i11 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i11 > 0) {
                    int read = bVar.read(bArr, 0, Math.min(i11, 4096));
                    if (read >= 0) {
                        cVar.write(bArr, 0, read);
                        i11 -= read;
                    }
                }
            } else {
                int readUnsignedShort2 = bVar.readUnsignedShort();
                int i12 = readUnsignedShort2 - 2;
                if (i12 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i12 >= 6) {
                    if (bVar.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, f42792c0)) {
                        bVar.d(readUnsignedShort2 - 8);
                    }
                }
                cVar.d(-1);
                cVar.d(readByte);
                cVar.o(readUnsignedShort2);
                if (i12 >= 6) {
                    i12 = readUnsignedShort2 - 8;
                    cVar.write(bArr2);
                }
                while (i12 > 0) {
                    int read2 = bVar.read(bArr, 0, Math.min(i12, 4096));
                    if (read2 >= 0) {
                        cVar.write(bArr, 0, read2);
                        i12 -= read2;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    private void F(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        if (f42797t) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        b bVar = new b(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(bufferedOutputStream, byteOrder);
        androidx.exifinterface.media.b.f(bVar, cVar, f42768E.length);
        if (this.f42818o == 0) {
            int readInt = bVar.readInt();
            cVar.j(readInt);
            androidx.exifinterface.media.b.f(bVar, cVar, readInt + 8);
        } else {
            androidx.exifinterface.media.b.f(bVar, cVar, (r2 - r7.length) - 8);
            bVar.d(bVar.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                M(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f42831a).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.j((int) crc32.getValue());
                androidx.exifinterface.media.b.c(byteArrayOutputStream2);
                androidx.exifinterface.media.b.e(bVar, cVar);
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                androidx.exifinterface.media.b.c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    private void G(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ?? r16;
        c cVar;
        if (f42797t) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(bufferedInputStream, byteOrder);
        c cVar2 = new c(bufferedOutputStream, byteOrder);
        byte[] bArr = f42772I;
        androidx.exifinterface.media.b.f(bVar, cVar2, bArr.length);
        byte[] bArr2 = f42773J;
        bVar.d(bArr2.length + 4);
        b bVar2 = null;
        try {
            try {
                ?? byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    c cVar3 = new c(byteArrayOutputStream, byteOrder);
                    int i16 = this.f42818o;
                    try {
                        try {
                            if (i16 != 0) {
                                androidx.exifinterface.media.b.f(bVar, cVar3, (i16 - ((bArr.length + 4) + bArr2.length)) - 8);
                                bVar.d(4);
                                int readInt = bVar.readInt();
                                if (readInt % 2 != 0) {
                                    readInt++;
                                }
                                bVar.d(readInt);
                                M(cVar3);
                            } else {
                                byte[] bArr3 = new byte[4];
                                if (bVar.read(bArr3) != 4) {
                                    throw new IOException("Encountered invalid length while parsing WebP chunk type");
                                }
                                byte[] bArr4 = f42776M;
                                boolean equals = Arrays.equals(bArr3, bArr4);
                                byte[] bArr5 = f42778O;
                                byte[] bArr6 = f42777N;
                                if (equals) {
                                    int readInt2 = bVar.readInt();
                                    byte[] bArr7 = new byte[readInt2 % 2 == 1 ? readInt2 + 1 : readInt2];
                                    bVar.read(bArr7);
                                    byte b11 = (byte) (bArr7[0] | 8);
                                    bArr7[0] = b11;
                                    boolean z11 = ((b11 >> 1) & 1) == 1;
                                    cVar3.write(bArr4);
                                    cVar3.j(readInt2);
                                    cVar3.write(bArr7);
                                    if (z11) {
                                        c(bVar, cVar3, f42779P, null);
                                        while (true) {
                                            byte[] bArr8 = new byte[4];
                                            bufferedInputStream.read(bArr8);
                                            if (!Arrays.equals(bArr8, f42780Q)) {
                                                break;
                                            }
                                            int readInt3 = bVar.readInt();
                                            cVar3.write(bArr8);
                                            cVar3.j(readInt3);
                                            if (readInt3 % 2 == 1) {
                                                readInt3++;
                                            }
                                            androidx.exifinterface.media.b.f(bVar, cVar3, readInt3);
                                        }
                                        M(cVar3);
                                    } else {
                                        c(bVar, cVar3, bArr5, bArr6);
                                        M(cVar3);
                                    }
                                } else if (Arrays.equals(bArr3, bArr5) || Arrays.equals(bArr3, bArr6)) {
                                    int readInt4 = bVar.readInt();
                                    int i17 = readInt4 % 2 == 1 ? readInt4 + 1 : readInt4;
                                    byte[] bArr9 = new byte[3];
                                    boolean equals2 = Arrays.equals(bArr3, bArr5);
                                    boolean z12 = true;
                                    byte[] bArr10 = f42775L;
                                    if (equals2) {
                                        bVar.read(bArr9);
                                        byte[] bArr11 = new byte[3];
                                        int i18 = i17;
                                        if (bVar.read(bArr11) != 3 || !Arrays.equals(bArr10, bArr11)) {
                                            throw new IOException("Encountered error while checking VP8 signature");
                                        }
                                        i11 = bVar.readInt();
                                        i12 = (i11 << 18) >> 18;
                                        i13 = i18 - 10;
                                        i14 = (i11 << 2) >> 18;
                                        z12 = false;
                                    } else {
                                        int i19 = i17;
                                        if (!Arrays.equals(bArr3, bArr6)) {
                                            i11 = 0;
                                            i12 = 0;
                                            z12 = false;
                                            i13 = i19;
                                            i14 = 0;
                                        } else {
                                            if (bVar.readByte() != 47) {
                                                throw new IOException("Encountered error while checking VP8L signature");
                                            }
                                            i11 = bVar.readInt();
                                            int i21 = (i11 & 16383) + 1;
                                            int i22 = ((268419072 & i11) >>> 14) + 1;
                                            if ((i11 & 268435456) == 0) {
                                                z12 = false;
                                            }
                                            i12 = i21;
                                            i13 = i19 - 5;
                                            i14 = i22;
                                        }
                                    }
                                    cVar3.write(bArr4);
                                    cVar3.j(10);
                                    byte[] bArr12 = new byte[10];
                                    if (z12) {
                                        i15 = i12;
                                        bArr12[0] = (byte) (bArr12[0] | 16);
                                    } else {
                                        i15 = i12;
                                    }
                                    bArr12[0] = (byte) (bArr12[0] | 8);
                                    int i23 = i15 - 1;
                                    r16 = byteArrayOutputStream;
                                    int i24 = i14 - 1;
                                    cVar = cVar2;
                                    try {
                                        bArr12[4] = (byte) i23;
                                        bArr12[5] = (byte) (i23 >> 8);
                                        bArr12[6] = (byte) (i23 >> 16);
                                        bArr12[7] = (byte) i24;
                                        bArr12[8] = (byte) (i24 >> 8);
                                        bArr12[9] = (byte) (i24 >> 16);
                                        cVar3.write(bArr12);
                                        cVar3.write(bArr3);
                                        cVar3.j(readInt4);
                                        try {
                                            if (!Arrays.equals(bArr3, bArr5)) {
                                                if (Arrays.equals(bArr3, bArr6)) {
                                                    cVar3.write(47);
                                                    cVar3.j(i11);
                                                }
                                                androidx.exifinterface.media.b.f(bVar, cVar3, i13);
                                                M(cVar3);
                                                r16 = r16;
                                                androidx.exifinterface.media.b.e(bVar, cVar3);
                                                c cVar4 = cVar;
                                                cVar4.j(r16.size() + bArr2.length);
                                                cVar4.write(bArr2);
                                                ByteArrayOutputStream byteArrayOutputStream2 = r16;
                                                byteArrayOutputStream2.writeTo(cVar4);
                                                androidx.exifinterface.media.b.c(byteArrayOutputStream2);
                                            }
                                            cVar3.write(bArr9);
                                            cVar3.write(bArr10);
                                            cVar3.j(i11);
                                            androidx.exifinterface.media.b.f(bVar, cVar3, i13);
                                            M(cVar3);
                                            r16 = r16;
                                            androidx.exifinterface.media.b.e(bVar, cVar3);
                                            c cVar42 = cVar;
                                            cVar42.j(r16.size() + bArr2.length);
                                            cVar42.write(bArr2);
                                            ByteArrayOutputStream byteArrayOutputStream22 = r16;
                                            byteArrayOutputStream22.writeTo(cVar42);
                                            androidx.exifinterface.media.b.c(byteArrayOutputStream22);
                                        } catch (Exception e11) {
                                            e = e11;
                                            throw new IOException("Failed to save WebP file", e);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            bVar2 = r16;
                                            androidx.exifinterface.media.b.c(bVar2);
                                            throw th;
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        bVar = r16;
                                        throw new IOException("Failed to save WebP file", e);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        bVar = r16;
                                        bVar2 = bVar;
                                        androidx.exifinterface.media.b.c(bVar2);
                                        throw th;
                                    }
                                }
                            }
                            cVar = cVar2;
                            r16 = byteArrayOutputStream;
                            androidx.exifinterface.media.b.e(bVar, cVar3);
                            c cVar422 = cVar;
                            cVar422.j(r16.size() + bArr2.length);
                            cVar422.write(bArr2);
                            ByteArrayOutputStream byteArrayOutputStream222 = r16;
                            byteArrayOutputStream222.writeTo(cVar422);
                            androidx.exifinterface.media.b.c(byteArrayOutputStream222);
                        } catch (Exception e13) {
                            e = e13;
                        } catch (Throwable th4) {
                            th = th4;
                            bVar2 = byteArrayOutputStream;
                        }
                    } catch (Exception e14) {
                        e = e14;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Exception e15) {
                    e = e15;
                    bVar = byteArrayOutputStream;
                } catch (Throwable th6) {
                    th = th6;
                    bVar = byteArrayOutputStream;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e16) {
            e = e16;
        }
    }

    private void I(b bVar) throws IOException {
        d dVar;
        int h11;
        HashMap<String, d> hashMap = this.f42808e[4];
        d dVar2 = hashMap.get("Compression");
        if (dVar2 == null) {
            this.f42817n = 6;
            t(bVar, hashMap);
            return;
        }
        int h12 = dVar2.h(this.f42810g);
        this.f42817n = h12;
        if (h12 != 1) {
            if (h12 == 6) {
                t(bVar, hashMap);
                return;
            } else if (h12 != 7) {
                return;
            }
        }
        d dVar3 = hashMap.get("BitsPerSample");
        if (dVar3 != null) {
            int[] iArr = (int[]) dVar3.j(this.f42810g);
            int[] iArr2 = f42800w;
            if (Arrays.equals(iArr2, iArr) || (this.f42807d == 3 && (dVar = hashMap.get("PhotometricInterpretation")) != null && (((h11 = dVar.h(this.f42810g)) == 1 && Arrays.equals(iArr, f42801x)) || (h11 == 6 && Arrays.equals(iArr, iArr2))))) {
                d dVar4 = hashMap.get("StripOffsets");
                d dVar5 = hashMap.get("StripByteCounts");
                if (dVar4 == null || dVar5 == null) {
                    return;
                }
                long[] d11 = androidx.exifinterface.media.b.d(dVar4.j(this.f42810g));
                long[] d12 = androidx.exifinterface.media.b.d(dVar5.j(this.f42810g));
                if (d11 == null || d11.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (d12 == null || d12.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (d11.length != d12.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j11 = 0;
                for (long j12 : d12) {
                    j11 += j12;
                }
                int i11 = (int) j11;
                byte[] bArr = new byte[i11];
                this.f42813j = true;
                this.f42812i = true;
                this.f42811h = true;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < d11.length; i14++) {
                    int i15 = (int) d11[i14];
                    int i16 = (int) d12[i14];
                    if (i14 < d11.length - 1 && i15 + i16 != d11[i14 + 1]) {
                        this.f42813j = false;
                    }
                    int i17 = i15 - i12;
                    if (i17 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j13 = i17;
                    if (bVar.skip(j13) != j13) {
                        Log.d("ExifInterface", "Failed to skip " + i17 + " bytes.");
                        return;
                    }
                    int i18 = i12 + i17;
                    byte[] bArr2 = new byte[i16];
                    if (bVar.read(bArr2) != i16) {
                        Log.d("ExifInterface", "Failed to read " + i16 + " bytes.");
                        return;
                    }
                    i12 = i18 + i16;
                    System.arraycopy(bArr2, 0, bArr, i13, i16);
                    i13 += i16;
                }
                this.f42816m = bArr;
                if (this.f42813j) {
                    this.f42814k = (int) d11[0];
                    this.f42815l = i11;
                    return;
                }
                return;
            }
        }
        if (f42797t) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    private void J(int i11, int i12) throws IOException {
        HashMap<String, d>[] hashMapArr = this.f42808e;
        boolean isEmpty = hashMapArr[i11].isEmpty();
        boolean z11 = f42797t;
        if (isEmpty || hashMapArr[i12].isEmpty()) {
            if (z11) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = hashMapArr[i11].get("ImageLength");
        d dVar2 = hashMapArr[i11].get("ImageWidth");
        d dVar3 = hashMapArr[i12].get("ImageLength");
        d dVar4 = hashMapArr[i12].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (z11) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (z11) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int h11 = dVar.h(this.f42810g);
        int h12 = dVar2.h(this.f42810g);
        int h13 = dVar3.h(this.f42810g);
        int h14 = dVar4.h(this.f42810g);
        if (h11 >= h13 || h12 >= h14) {
            return;
        }
        HashMap<String, d> hashMap = hashMapArr[i11];
        hashMapArr[i11] = hashMapArr[i12];
        hashMapArr[i12] = hashMap;
    }

    private void K(g gVar, int i11) throws IOException {
        d e11;
        d e12;
        HashMap<String, d>[] hashMapArr = this.f42808e;
        d dVar = hashMapArr[i11].get("DefaultCropSize");
        d dVar2 = hashMapArr[i11].get("SensorTopBorder");
        d dVar3 = hashMapArr[i11].get("SensorLeftBorder");
        d dVar4 = hashMapArr[i11].get("SensorBottomBorder");
        d dVar5 = hashMapArr[i11].get("SensorRightBorder");
        if (dVar != null) {
            if (dVar.f42833a == 5) {
                f[] fVarArr = (f[]) dVar.j(this.f42810g);
                if (fVarArr == null || fVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                    return;
                } else {
                    e11 = d.d(new f[]{fVarArr[0]}, this.f42810g);
                    e12 = d.d(new f[]{fVarArr[1]}, this.f42810g);
                }
            } else {
                int[] iArr = (int[]) dVar.j(this.f42810g);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                e11 = d.e(iArr[0], this.f42810g);
                e12 = d.e(iArr[1], this.f42810g);
            }
            hashMapArr[i11].put("ImageWidth", e11);
            hashMapArr[i11].put("ImageLength", e12);
            return;
        }
        if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
            int h11 = dVar2.h(this.f42810g);
            int h12 = dVar4.h(this.f42810g);
            int h13 = dVar5.h(this.f42810g);
            int h14 = dVar3.h(this.f42810g);
            if (h12 <= h11 || h13 <= h14) {
                return;
            }
            d e13 = d.e(h12 - h11, this.f42810g);
            d e14 = d.e(h13 - h14, this.f42810g);
            hashMapArr[i11].put("ImageLength", e13);
            hashMapArr[i11].put("ImageWidth", e14);
            return;
        }
        d dVar6 = hashMapArr[i11].get("ImageLength");
        d dVar7 = hashMapArr[i11].get("ImageWidth");
        if (dVar6 == null || dVar7 == null) {
            d dVar8 = hashMapArr[i11].get("JPEGInterchangeFormat");
            d dVar9 = hashMapArr[i11].get("JPEGInterchangeFormatLength");
            if (dVar8 == null || dVar9 == null) {
                return;
            }
            int h15 = dVar8.h(this.f42810g);
            int h16 = dVar8.h(this.f42810g);
            gVar.j(h15);
            byte[] bArr = new byte[h16];
            gVar.read(bArr);
            i(new b(bArr), h15, i11);
        }
    }

    private void L() throws IOException {
        J(0, 5);
        J(0, 4);
        J(5, 4);
        HashMap<String, d>[] hashMapArr = this.f42808e;
        d dVar = hashMapArr[1].get("PixelXDimension");
        d dVar2 = hashMapArr[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            hashMapArr[0].put("ImageWidth", dVar);
            hashMapArr[0].put("ImageLength", dVar2);
        }
        if (hashMapArr[4].isEmpty() && u(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!u(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        C(0, "ThumbnailOrientation", "Orientation");
        C(0, "ThumbnailImageLength", "ImageLength");
        C(0, "ThumbnailImageWidth", "ImageWidth");
        C(5, "ThumbnailOrientation", "Orientation");
        C(5, "ThumbnailImageLength", "ImageLength");
        C(5, "ThumbnailImageWidth", "ImageWidth");
        C(4, "Orientation", "ThumbnailOrientation");
        C(4, "ImageLength", "ThumbnailImageLength");
        C(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014d A[EDGE_INSN: B:55:0x014d->B:56:0x014d BREAK  A[LOOP:3: B:42:0x0111->B:54:0x0143], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void M(c cVar) throws IOException {
        HashMap<String, d>[] hashMapArr;
        char c11;
        char c12;
        int i11;
        int[] iArr;
        int i12;
        int length;
        int[] iArr2;
        int i13;
        int i14;
        int i15;
        int[] iArr3;
        e[][] eVarArr = f42785V;
        int[] iArr4 = new int[eVarArr.length];
        int[] iArr5 = new int[eVarArr.length];
        e[] eVarArr2 = f42786W;
        for (e eVar : eVarArr2) {
            B(eVar.f42838b);
        }
        if (this.f42811h) {
            if (this.f42812i) {
                B("StripOffsets");
                B("StripByteCounts");
            } else {
                B("JPEGInterchangeFormat");
                B("JPEGInterchangeFormatLength");
            }
        }
        int i16 = 0;
        while (true) {
            int length2 = eVarArr.length;
            hashMapArr = this.f42808e;
            if (i16 >= length2) {
                break;
            }
            Object[] array = hashMapArr[i16].entrySet().toArray();
            int length3 = array.length;
            int i17 = 0;
            while (i17 < length3) {
                Map.Entry entry = (Map.Entry) array[i17];
                if (entry.getValue() == null) {
                    iArr3 = iArr4;
                    hashMapArr[i16].remove(entry.getKey());
                } else {
                    iArr3 = iArr4;
                }
                i17++;
                iArr4 = iArr3;
            }
            i16++;
        }
        int[] iArr6 = iArr4;
        if (!hashMapArr[1].isEmpty()) {
            hashMapArr[0].put(eVarArr2[1].f42838b, d.b(0L, this.f42810g));
        }
        if (hashMapArr[2].isEmpty()) {
            c11 = 2;
        } else {
            c11 = 2;
            hashMapArr[0].put(eVarArr2[2].f42838b, d.b(0L, this.f42810g));
        }
        if (hashMapArr[3].isEmpty()) {
            c12 = 3;
        } else {
            c12 = 3;
            hashMapArr[1].put(eVarArr2[3].f42838b, d.b(0L, this.f42810g));
        }
        if (this.f42811h) {
            if (!this.f42812i) {
                hashMapArr[4].put("JPEGInterchangeFormat", d.b(0L, this.f42810g));
                i11 = 1;
                iArr = iArr5;
                hashMapArr[4].put("JPEGInterchangeFormatLength", d.b(this.f42815l, this.f42810g));
                i12 = 0;
                while (true) {
                    length = eVarArr.length;
                    iArr2 = f42782S;
                    if (i12 < length) {
                        break;
                    }
                    Iterator<Map.Entry<String, d>> it = hashMapArr[i12].entrySet().iterator();
                    int i18 = 0;
                    while (it.hasNext()) {
                        d value = it.next().getValue();
                        value.getClass();
                        int i19 = iArr2[value.f42833a] * value.f42834b;
                        if (i19 > 4) {
                            i18 += i19;
                        }
                    }
                    iArr[i12] = iArr[i12] + i18;
                    i12++;
                }
                int i21 = 8;
                for (i13 = 0; i13 < eVarArr.length; i13++) {
                    if (!hashMapArr[i13].isEmpty()) {
                        iArr6[i13] = i21;
                        i21 = (hashMapArr[i13].size() * 12) + 6 + iArr[i13] + i21;
                    }
                }
                if (this.f42811h) {
                    if (this.f42812i) {
                        hashMapArr[4].put("StripOffsets", d.e(i21, this.f42810g));
                    } else {
                        hashMapArr[4].put("JPEGInterchangeFormat", d.b(i21, this.f42810g));
                    }
                    this.f42814k = i21;
                    i21 += this.f42815l;
                }
                if (this.f42807d == 4) {
                    i21 += 8;
                }
                if (f42797t) {
                    for (int i22 = 0; i22 < eVarArr.length; i22++) {
                        Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i22), Integer.valueOf(iArr6[i22]), Integer.valueOf(hashMapArr[i22].size()), Integer.valueOf(iArr[i22]), Integer.valueOf(i21)));
                    }
                }
                if (!hashMapArr[i11].isEmpty()) {
                    hashMapArr[0].put(eVarArr2[i11].f42838b, d.b(iArr6[i11], this.f42810g));
                }
                if (!hashMapArr[c11].isEmpty()) {
                    hashMapArr[0].put(eVarArr2[c11].f42838b, d.b(iArr6[c11], this.f42810g));
                }
                if (!hashMapArr[c12].isEmpty()) {
                    hashMapArr[i11].put(eVarArr2[c12].f42838b, d.b(iArr6[c12], this.f42810g));
                }
                i14 = this.f42807d;
                if (i14 != 4) {
                    cVar.o(i21);
                    cVar.write(f42792c0);
                } else if (i14 == 13) {
                    cVar.j(i21);
                    cVar.write(f42769F);
                } else if (i14 == 14) {
                    cVar.write(f42774K);
                    cVar.j(i21);
                }
                cVar.k(this.f42810g != ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
                cVar.c(this.f42810g);
                cVar.o(42);
                cVar.m(8L);
                for (i15 = 0; i15 < eVarArr.length; i15++) {
                    if (!hashMapArr[i15].isEmpty()) {
                        cVar.o(hashMapArr[i15].size());
                        int size = (hashMapArr[i15].size() * 12) + iArr6[i15] + 2 + 4;
                        for (Map.Entry<String, d> entry2 : hashMapArr[i15].entrySet()) {
                            int i23 = f42788Y[i15].get(entry2.getKey()).f42837a;
                            d value2 = entry2.getValue();
                            value2.getClass();
                            int i24 = value2.f42833a;
                            int i25 = iArr2[i24];
                            int i26 = value2.f42834b;
                            int i27 = i25 * i26;
                            cVar.o(i23);
                            cVar.o(i24);
                            cVar.j(i26);
                            if (i27 > 4) {
                                cVar.m(size);
                                size += i27;
                            } else {
                                cVar.write(value2.f42836d);
                                if (i27 < 4) {
                                    while (i27 < 4) {
                                        cVar.d(0);
                                        i27++;
                                    }
                                }
                            }
                        }
                        if (i15 != 0 || hashMapArr[4].isEmpty()) {
                            cVar.m(0L);
                        } else {
                            cVar.m(iArr6[4]);
                        }
                        Iterator<Map.Entry<String, d>> it2 = hashMapArr[i15].entrySet().iterator();
                        while (it2.hasNext()) {
                            byte[] bArr = it2.next().getValue().f42836d;
                            if (bArr.length > 4) {
                                cVar.write(bArr, 0, bArr.length);
                            }
                        }
                    }
                }
                if (this.f42811h) {
                    cVar.write(q());
                }
                if (this.f42807d == 14 && i21 % 2 == i11) {
                    cVar.d(0);
                }
                cVar.c(ByteOrder.BIG_ENDIAN);
            }
            hashMapArr[4].put("StripOffsets", d.e(0, this.f42810g));
            hashMapArr[4].put("StripByteCounts", d.e(this.f42815l, this.f42810g));
        }
        i11 = 1;
        iArr = iArr5;
        i12 = 0;
        while (true) {
            length = eVarArr.length;
            iArr2 = f42782S;
            if (i12 < length) {
            }
            iArr[i12] = iArr[i12] + i18;
            i12++;
        }
        int i212 = 8;
        while (i13 < eVarArr.length) {
        }
        if (this.f42811h) {
        }
        if (this.f42807d == 4) {
        }
        if (f42797t) {
        }
        if (!hashMapArr[i11].isEmpty()) {
        }
        if (!hashMapArr[c11].isEmpty()) {
        }
        if (!hashMapArr[c12].isEmpty()) {
        }
        i14 = this.f42807d;
        if (i14 != 4) {
        }
        cVar.k(this.f42810g != ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.c(this.f42810g);
        cVar.o(42);
        cVar.m(8L);
        while (i15 < eVarArr.length) {
        }
        if (this.f42811h) {
        }
        if (this.f42807d == 14) {
            cVar.d(0);
        }
        cVar.c(ByteOrder.BIG_ENDIAN);
    }

    private void a() {
        String d11 = d("DateTimeOriginal");
        HashMap<String, d>[] hashMapArr = this.f42808e;
        if (d11 != null && d("DateTime") == null) {
            hashMapArr[0].put("DateTime", d.a(d11));
        }
        if (d("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", d.b(0L, this.f42810g));
        }
        if (d("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", d.b(0L, this.f42810g));
        }
        if (d("Orientation") == null) {
            hashMapArr[0].put("Orientation", d.b(0L, this.f42810g));
        }
        if (d("LightSource") == null) {
            hashMapArr[1].put("LightSource", d.b(0L, this.f42810g));
        }
    }

    private static double b(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            double parseDouble2 = Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim());
            String[] split4 = split[2].split("/", -1);
            double parseDouble3 = ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d) + (parseDouble2 / 60.0d) + parseDouble;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble3;
            }
            return -parseDouble3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    private static void c(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb2 = new StringBuilder("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f42791b0;
                sb2.append(new String(bArr, charset));
                sb2.append(bArr2 == null ? "" : " or ".concat(new String(bArr2, charset)));
                throw new IOException(sb2.toString());
            }
            int readInt = bVar.readInt();
            cVar.write(bArr3);
            cVar.j(readInt);
            if (readInt % 2 == 1) {
                readInt++;
            }
            androidx.exifinterface.media.b.f(bVar, cVar, readInt);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private d g(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f42797t) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i11 = 0; i11 < f42785V.length; i11++) {
            d dVar = this.f42808e[i11].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    private void h(g gVar) throws IOException {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                b.C0785b.a(mediaMetadataRetriever, new C0784a(gVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap<String, d>[] hashMapArr = this.f42808e;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", d.e(Integer.parseInt(str), this.f42810g));
                }
                if (str2 != null) {
                    hashMapArr[0].put("ImageLength", d.e(Integer.parseInt(str2), this.f42810g));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    hashMapArr[0].put("Orientation", d.e(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f42810g));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.j(parseInt2);
                    byte[] bArr = new byte[6];
                    if (gVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i11 = parseInt2 + 6;
                    int i12 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f42792c0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i12];
                    if (gVar.read(bArr2) != i12) {
                        throw new IOException("Can't read exif");
                    }
                    this.f42818o = i11;
                    z(0, bArr2);
                }
                if (f42797t) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x017c, code lost:
    
        r24.c(r23.f42810g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0181, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void i(b bVar, int i11, int i12) throws IOException {
        int i13;
        boolean z11 = f42797t;
        if (z11) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + bVar);
        }
        bVar.c(ByteOrder.BIG_ENDIAN);
        byte readByte = bVar.readByte();
        byte b11 = -1;
        if (readByte != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(readByte & 255));
        }
        int i14 = 2;
        while (true) {
            byte readByte2 = bVar.readByte();
            if (readByte2 != b11) {
                throw new IOException("Invalid marker:" + Integer.toHexString(readByte2 & 255));
            }
            byte readByte3 = bVar.readByte();
            if (z11) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = bVar.readUnsignedShort();
                int i15 = readUnsignedShort - 2;
                int i16 = i14 + 4;
                if (z11) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                }
                if (i15 < 0) {
                    throw new IOException("Invalid length");
                }
                HashMap<String, d>[] hashMapArr = this.f42808e;
                if (readByte3 == -31) {
                    byte[] bArr = new byte[i15];
                    bVar.readFully(bArr);
                    int i17 = i16 + i15;
                    byte[] bArr2 = f42792c0;
                    if (androidx.exifinterface.media.b.g(bArr, bArr2)) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr2.length, i15);
                        this.f42818o = i11 + i16 + bArr2.length;
                        z(i12, copyOfRange);
                        I(new b(copyOfRange));
                    } else {
                        byte[] bArr3 = f42793d0;
                        if (androidx.exifinterface.media.b.g(bArr, bArr3)) {
                            int length = i16 + bArr3.length;
                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length, i15);
                            if (d("Xmp") == null) {
                                i13 = i17;
                                hashMapArr[0].put("Xmp", new d(length, copyOfRange2, 1, copyOfRange2.length));
                                this.f42822s = true;
                                i15 = 0;
                                i16 = i13;
                            }
                        }
                    }
                    i13 = i17;
                    i15 = 0;
                    i16 = i13;
                } else if (readByte3 != -2) {
                    switch (readByte3) {
                        default:
                            switch (readByte3) {
                                default:
                                    switch (readByte3) {
                                        default:
                                            switch (readByte3) {
                                            }
                                        case -55:
                                        case -54:
                                        case -53:
                                            bVar.d(1);
                                            hashMapArr[i12].put(i12 != 4 ? "ImageLength" : "ThumbnailImageLength", d.b(bVar.readUnsignedShort(), this.f42810g));
                                            hashMapArr[i12].put(i12 != 4 ? "ImageWidth" : "ThumbnailImageWidth", d.b(bVar.readUnsignedShort(), this.f42810g));
                                            i15 = readUnsignedShort - 7;
                                            break;
                                    }
                                case -59:
                                case -58:
                                case -57:
                                    break;
                            }
                        case -64:
                        case -63:
                        case -62:
                        case -61:
                            break;
                    }
                } else {
                    byte[] bArr4 = new byte[i15];
                    if (bVar.read(bArr4) != i15) {
                        throw new IOException("Invalid exif");
                    }
                    if (d("UserComment") == null) {
                        hashMapArr[1].put("UserComment", d.a(new String(bArr4, f42791b0)));
                    }
                    i15 = 0;
                }
                if (i15 < 0) {
                    throw new IOException("Invalid length");
                }
                bVar.d(i15);
                i14 = i16 + i15;
                b11 = -1;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:14|15|16|17|18|19|(16:106|(2:108|109)(1:152)|111|112|(1:114)|115|(3:118|119|(4:124|(3:129|(1:131)(2:139|(1:141))|(3:134|135|136))(2:126|127)|128|120))|117|22|23|24|25|26|(1:92)(1:30)|31|(1:33)(8:35|36|37|38|39|(1:41)(1:78)|42|(1:44)(3:45|(2:46|(2:48|(2:51|52)(1:50))(2:76|77))|(1:54)(4:55|(2:56|(2:58|(1:61)(1:60))(3:66|67|(2:68|(2:70|(1:73)(1:72))(2:74|75))))|62|(1:64)(1:65)))))|21|22|23|24|25|26|(1:28)|92|31|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x00fb, code lost:
    
        if (r6 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00fd, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0100, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f9, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00f7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0061, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00ce, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0101, code lost:
    
        if (r2 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0103, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0106, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00f5, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int k(BufferedInputStream bufferedInputStream) throws IOException {
        int i11;
        b bVar;
        int i12;
        int i13;
        int i14;
        int i15;
        long readInt;
        byte[] bArr;
        long j11;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i16 = 0;
        while (true) {
            byte[] bArr3 = f42802y;
            if (i16 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i16] != bArr3[i16]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i17 = 0; i17 < bytes.length; i17++) {
                    if (bArr2[i17] != bytes[i17]) {
                        b bVar2 = null;
                        try {
                            bVar = new b(bArr2);
                            try {
                                try {
                                    readInt = bVar.readInt();
                                    bArr = new byte[4];
                                    bVar.read(bArr);
                                } catch (Exception e11) {
                                    e = e11;
                                    i11 = 0;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                bVar2 = bVar;
                                if (bVar2 != null) {
                                    bVar2.close();
                                }
                                throw th;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            i11 = 0;
                            bVar = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        if (Arrays.equals(bArr, f42803z)) {
                            if (readInt == 1) {
                                readInt = bVar.readLong();
                                j11 = 16;
                            } else {
                                j11 = 8;
                            }
                            i11 = 0;
                            long j12 = 5000;
                            if (readInt > j12) {
                                readInt = j12;
                            }
                            long j13 = readInt - j11;
                            if (j13 >= 8) {
                                try {
                                    byte[] bArr4 = new byte[4];
                                    boolean z11 = false;
                                    boolean z12 = false;
                                    for (long j14 = 0; j14 < j13 / 4 && bVar.read(bArr4) == 4; j14++) {
                                        if (j14 != 1) {
                                            if (Arrays.equals(bArr4, f42764A)) {
                                                z11 = true;
                                            } else if (Arrays.equals(bArr4, f42765B)) {
                                                z12 = true;
                                            }
                                            if (z11 && z12) {
                                                bVar.close();
                                                return 12;
                                            }
                                        }
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    if (f42797t) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                }
                            }
                            bVar.close();
                            b bVar3 = new b(bArr2);
                            ByteOrder y11 = y(bVar3);
                            this.f42810g = y11;
                            bVar3.c(y11);
                            short readShort = bVar3.readShort();
                            i12 = (readShort != 20306 || readShort == 21330) ? 1 : i11;
                            bVar3.close();
                            if (i12 != 0) {
                                return 7;
                            }
                            try {
                                b bVar4 = new b(bArr2);
                                try {
                                    ByteOrder y12 = y(bVar4);
                                    this.f42810g = y12;
                                    bVar4.c(y12);
                                    i13 = bVar4.readShort() == 85 ? 1 : i11;
                                    bVar4.close();
                                } catch (Exception unused) {
                                    bVar2 = bVar4;
                                    if (bVar2 != null) {
                                        bVar2.close();
                                    }
                                    i13 = i11;
                                    if (i13 == 0) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    bVar2 = bVar4;
                                    if (bVar2 != null) {
                                        bVar2.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused2) {
                            } catch (Throwable th5) {
                                th = th5;
                            }
                            if (i13 == 0) {
                                return 10;
                            }
                            int i18 = i11;
                            while (true) {
                                byte[] bArr5 = f42768E;
                                if (i18 >= bArr5.length) {
                                    i14 = 1;
                                    break;
                                }
                                if (bArr2[i18] != bArr5[i18]) {
                                    i14 = i11;
                                    break;
                                }
                                i18++;
                            }
                            if (i14 != 0) {
                                return 13;
                            }
                            int i19 = i11;
                            while (true) {
                                byte[] bArr6 = f42772I;
                                if (i19 >= bArr6.length) {
                                    int i21 = i11;
                                    while (true) {
                                        byte[] bArr7 = f42773J;
                                        if (i21 >= bArr7.length) {
                                            i15 = 1;
                                            break;
                                        }
                                        if (bArr2[bArr6.length + i21 + 4] != bArr7[i21]) {
                                            break;
                                        }
                                        i21++;
                                    }
                                } else {
                                    if (bArr2[i19] != bArr6[i19]) {
                                        break;
                                    }
                                    i19++;
                                }
                            }
                            i15 = i11;
                            if (i15 != 0) {
                                return 14;
                            }
                            return i11;
                        }
                        bVar.close();
                        i11 = 0;
                        b bVar32 = new b(bArr2);
                        ByteOrder y112 = y(bVar32);
                        this.f42810g = y112;
                        bVar32.c(y112);
                        short readShort2 = bVar32.readShort();
                        if (readShort2 != 20306) {
                        }
                        bVar32.close();
                        if (i12 != 0) {
                        }
                    }
                }
                return 9;
            }
            i16++;
        }
    }

    private void l(g gVar) throws IOException {
        int i11;
        int i12;
        o(gVar);
        HashMap<String, d>[] hashMapArr = this.f42808e;
        d dVar = hashMapArr[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f42836d);
            gVar2.c(this.f42810g);
            byte[] bArr = f42766C;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.j(0L);
            byte[] bArr3 = f42767D;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.j(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.j(12L);
            }
            A(gVar2, 6);
            d dVar2 = hashMapArr[7].get("PreviewImageStart");
            d dVar3 = hashMapArr[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", dVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = hashMapArr[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.j(this.f42810g);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i13 = iArr[2];
                int i14 = iArr[0];
                if (i13 <= i14 || (i11 = iArr[3]) <= (i12 = iArr[1])) {
                    return;
                }
                int i15 = (i13 - i14) + 1;
                int i16 = (i11 - i12) + 1;
                if (i15 < i16) {
                    int i17 = i15 + i16;
                    i16 = i17 - i16;
                    i15 = i17 - i16;
                }
                d e11 = d.e(i15, this.f42810g);
                d e12 = d.e(i16, this.f42810g);
                hashMapArr[0].put("ImageWidth", e11);
                hashMapArr[0].put("ImageLength", e12);
            }
        }
    }

    private void m(b bVar) throws IOException {
        if (f42797t) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.c(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f42768E;
        bVar.d(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i11 = length + 8;
                if (i11 == 16 && !Arrays.equals(bArr2, f42770G)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f42771H)) {
                    return;
                }
                if (Arrays.equals(bArr2, f42769F)) {
                    byte[] bArr3 = new byte[readInt];
                    if (bVar.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.b.a(bArr2));
                    }
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f42818o = i11;
                        z(0, bArr3);
                        L();
                        I(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i12 = readInt + 4;
                bVar.d(i12);
                length = i11 + i12;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void n(b bVar) throws IOException {
        boolean z11 = f42797t;
        if (z11) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.d(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i11 = ByteBuffer.wrap(bArr).getInt();
        int i12 = ByteBuffer.wrap(bArr2).getInt();
        int i13 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i12];
        bVar.d(i11 - bVar.f42829c);
        bVar.read(bArr4);
        i(new b(bArr4), i11, 5);
        bVar.d(i13 - bVar.f42829c);
        bVar.c(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z11) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i14 = 0; i14 < readInt; i14++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f42784U.f42837a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d e11 = d.e(readShort, this.f42810g);
                d e12 = d.e(readShort2, this.f42810g);
                HashMap<String, d>[] hashMapArr = this.f42808e;
                hashMapArr[0].put("ImageLength", e11);
                hashMapArr[0].put("ImageWidth", e12);
                if (z11) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.d(readUnsignedShort2);
        }
    }

    private void o(g gVar) throws IOException {
        w(gVar);
        A(gVar, 0);
        K(gVar, 0);
        K(gVar, 5);
        K(gVar, 4);
        L();
        if (this.f42807d == 8) {
            HashMap<String, d>[] hashMapArr = this.f42808e;
            d dVar = hashMapArr[1].get("MakerNote");
            if (dVar != null) {
                g gVar2 = new g(dVar.f42836d);
                gVar2.c(this.f42810g);
                gVar2.d(6);
                A(gVar2, 9);
                d dVar2 = hashMapArr[9].get("ColorSpace");
                if (dVar2 != null) {
                    hashMapArr[1].put("ColorSpace", dVar2);
                }
            }
        }
    }

    private void p(g gVar) throws IOException {
        if (f42797t) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        o(gVar);
        HashMap<String, d>[] hashMapArr = this.f42808e;
        d dVar = hashMapArr[0].get("JpgFromRaw");
        if (dVar != null) {
            i(new b(dVar.f42836d), (int) dVar.f42835c, 5);
        }
        d dVar2 = hashMapArr[0].get("ISO");
        d dVar3 = hashMapArr[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", dVar2);
    }

    private void r(b bVar) throws IOException {
        if (f42797t) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.c(ByteOrder.LITTLE_ENDIAN);
        bVar.d(f42772I.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f42773J;
        bVar.d(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = bVar.readInt();
                int i11 = length + 8;
                if (Arrays.equals(f42774K, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    if (bVar.read(bArr3) == readInt2) {
                        this.f42818o = i11;
                        z(0, bArr3);
                        I(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.b.a(bArr2));
                    }
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i11 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.d(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private static Pair<Integer, Integer> s(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> s11 = s(split[0]);
            if (((Integer) s11.first).intValue() == 2) {
                return s11;
            }
            for (int i11 = 1; i11 < split.length; i11++) {
                Pair<Integer, Integer> s12 = s(split[i11]);
                int intValue = (((Integer) s12.first).equals(s11.first) || ((Integer) s12.second).equals(s11.first)) ? ((Integer) s11.first).intValue() : -1;
                int intValue2 = (((Integer) s11.second).intValue() == -1 || !(((Integer) s12.first).equals(s11.second) || ((Integer) s12.second).equals(s11.second))) ? -1 : ((Integer) s11.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    s11 = new Pair<>(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    s11 = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return s11;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long parseLong = Long.parseLong(str);
                    return (parseLong < 0 || parseLong > 65535) ? parseLong < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
        String[] split2 = str.split("/", -1);
        if (split2.length == 2) {
            try {
                long parseDouble = (long) Double.parseDouble(split2[0]);
                long parseDouble2 = (long) Double.parseDouble(split2[1]);
                if (parseDouble >= 0 && parseDouble2 >= 0) {
                    if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    private void t(b bVar, HashMap hashMap) throws IOException {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int h11 = dVar.h(this.f42810g);
        int h12 = dVar2.h(this.f42810g);
        if (this.f42807d == 7) {
            h11 += this.f42819p;
        }
        if (h11 > 0 && h12 > 0) {
            this.f42811h = true;
            if (this.f42804a == null && this.f42806c == null && this.f42805b == null) {
                byte[] bArr = new byte[h12];
                bVar.skip(h11);
                bVar.read(bArr);
                this.f42816m = bArr;
            }
            this.f42814k = h11;
            this.f42815l = h12;
        }
        if (f42797t) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + h11 + ", length: " + h12);
        }
    }

    private boolean u(HashMap hashMap) throws IOException {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.h(this.f42810g) <= 512 && dVar2.h(this.f42810g) <= 512;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091 A[Catch: all -> 0x0017, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:5:0x0006, B:7:0x000b, B:9:0x0020, B:15:0x003d, B:17:0x0048, B:18:0x005e, B:27:0x004f, B:30:0x0057, B:31:0x005b, B:32:0x0068, B:34:0x0071, B:36:0x0077, B:38:0x007d, B:40:0x0083, B:50:0x0091), top: B:4:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void v(@NonNull InputStream inputStream) {
        boolean z11 = f42797t;
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i11 = 0; i11 < f42785V.length; i11++) {
            try {
                try {
                    this.f42808e[i11] = new HashMap<>();
                } catch (Throwable th2) {
                    a();
                    if (z11) {
                        x();
                    }
                    throw th2;
                }
            } catch (IOException e11) {
                e = e11;
                if (z11) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (z11) {
                    return;
                }
                x();
                return;
            } catch (UnsupportedOperationException e12) {
                e = e12;
                if (z11) {
                }
                a();
                if (z11) {
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int k11 = k(bufferedInputStream);
        this.f42807d = k11;
        if (k11 != 4 && k11 != 9 && k11 != 13 && k11 != 14) {
            g gVar = new g(bufferedInputStream);
            int i12 = this.f42807d;
            if (i12 == 12) {
                h(gVar);
            } else if (i12 == 7) {
                l(gVar);
            } else if (i12 == 10) {
                p(gVar);
            } else {
                o(gVar);
            }
            gVar.j(this.f42818o);
            I(gVar);
            a();
            if (z11) {
                return;
            }
            x();
            return;
        }
        b bVar = new b(bufferedInputStream);
        int i13 = this.f42807d;
        if (i13 == 4) {
            i(bVar, 0, 0);
        } else if (i13 == 13) {
            m(bVar);
        } else if (i13 == 9) {
            n(bVar);
        } else if (i13 == 14) {
            r(bVar);
        }
        a();
        if (z11) {
        }
    }

    private void w(g gVar) throws IOException {
        ByteOrder y11 = y(gVar);
        this.f42810g = y11;
        gVar.c(y11);
        int readUnsignedShort = gVar.readUnsignedShort();
        int i11 = this.f42807d;
        if (i11 != 7 && i11 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = gVar.readInt();
        if (readInt < 8) {
            throw new IOException(Ej.b.a(readInt, "Invalid first Ifd offset: "));
        }
        int i12 = readInt - 8;
        if (i12 > 0) {
            gVar.d(i12);
        }
    }

    private void x() {
        int i11 = 0;
        while (true) {
            HashMap<String, d>[] hashMapArr = this.f42808e;
            if (i11 >= hashMapArr.length) {
                return;
            }
            StringBuilder f7 = P4.f.f(i11, "The size of tag group[", "]: ");
            f7.append(hashMapArr[i11].size());
            Log.d("ExifInterface", f7.toString());
            for (Map.Entry<String, d> entry : hashMapArr[i11].entrySet()) {
                d value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.i(this.f42810g) + "'");
            }
            i11++;
        }
    }

    private static ByteOrder y(b bVar) throws IOException {
        short readShort = bVar.readShort();
        boolean z11 = f42797t;
        if (readShort == 18761) {
            if (z11) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (z11) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    private void z(int i11, byte[] bArr) throws IOException {
        g gVar = new g(bArr);
        w(gVar);
        A(gVar, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00fa A[Catch: all -> 0x010a, Exception -> 0x010d, TryCatch #19 {Exception -> 0x010d, all -> 0x010a, blocks: (B:66:0x00f6, B:68:0x00fa, B:70:0x0118, B:74:0x0110), top: B:65:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0110 A[Catch: all -> 0x010a, Exception -> 0x010d, TryCatch #19 {Exception -> 0x010d, all -> 0x010a, blocks: (B:66:0x00f6, B:68:0x00fa, B:70:0x0118, B:74:0x0110), top: B:65:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D() throws IOException {
        FileOutputStream fileOutputStream;
        File createTempFile;
        InputStream fileInputStream;
        Closeable closeable;
        FileOutputStream fileOutputStream2;
        InputStream fileInputStream2;
        FileOutputStream fileOutputStream3;
        InputStream fileInputStream3;
        Object obj;
        BufferedInputStream bufferedInputStream;
        int i11 = this.f42807d;
        if (i11 != 4 && i11 != 13 && i11 != 14) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (this.f42805b == null && this.f42804a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (this.f42811h && this.f42812i && !this.f42813j) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        int i12 = this.f42817n;
        InputStream inputStream = null;
        this.f42816m = (i12 == 6 || i12 == 7) ? q() : null;
        try {
            createTempFile = File.createTempFile("temp", "tmp");
            if (this.f42804a != null) {
                fileInputStream = new FileInputStream(this.f42804a);
            } else {
                b.a.c(this.f42805b, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.f42805b);
            }
            try {
                fileOutputStream = new FileOutputStream(createTempFile);
            } catch (Exception e11) {
                e = e11;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Exception e12) {
            e = e12;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        try {
            androidx.exifinterface.media.b.e(fileInputStream, fileOutputStream);
            androidx.exifinterface.media.b.c(fileInputStream);
            androidx.exifinterface.media.b.c(fileOutputStream);
            try {
                try {
                    try {
                        fileInputStream3 = new FileInputStream(createTempFile);
                        try {
                            if (this.f42804a != null) {
                                fileOutputStream2 = new FileOutputStream(this.f42804a);
                            } else {
                                b.a.c(this.f42805b, 0L, OsConstants.SEEK_SET);
                                fileOutputStream2 = new FileOutputStream(this.f42805b);
                            }
                            try {
                                bufferedInputStream = new BufferedInputStream(fileInputStream3);
                            } catch (Exception e13) {
                                e = e13;
                                obj = null;
                                inputStream = fileInputStream3;
                                try {
                                    try {
                                        fileInputStream2 = new FileInputStream(createTempFile);
                                    } catch (Exception e14) {
                                        e = e14;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                try {
                                    if (this.f42804a != null) {
                                        b.a.c(this.f42805b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream3 = new FileOutputStream(this.f42805b);
                                    } else {
                                        fileOutputStream3 = new FileOutputStream(this.f42804a);
                                    }
                                    fileOutputStream2 = fileOutputStream3;
                                    androidx.exifinterface.media.b.e(fileInputStream2, fileOutputStream2);
                                    androidx.exifinterface.media.b.c(fileInputStream2);
                                    androidx.exifinterface.media.b.c(fileOutputStream2);
                                    throw new IOException("Failed to save new file", e);
                                } catch (Exception e15) {
                                    e = e15;
                                    inputStream = fileInputStream2;
                                    throw new IOException("Failed to save new file. Original file is stored in " + createTempFile.getAbsolutePath(), e);
                                } catch (Throwable th5) {
                                    th = th5;
                                    inputStream = fileInputStream2;
                                    androidx.exifinterface.media.b.c(inputStream);
                                    androidx.exifinterface.media.b.c(fileOutputStream2);
                                    throw th;
                                }
                            }
                        } catch (Exception e16) {
                            e = e16;
                            fileOutputStream2 = null;
                            obj = null;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Exception e17) {
                    e = e17;
                    fileOutputStream2 = null;
                }
            } catch (Throwable th7) {
                th = th7;
                closeable = null;
                androidx.exifinterface.media.b.c(inputStream);
                androidx.exifinterface.media.b.c(closeable);
                if (0 == 0) {
                    createTempFile.delete();
                }
                throw th;
            }
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                try {
                    int i13 = this.f42807d;
                    if (i13 == 4) {
                        E(bufferedInputStream, bufferedOutputStream);
                    } else if (i13 == 13) {
                        F(bufferedInputStream, bufferedOutputStream);
                    } else if (i13 == 14) {
                        G(bufferedInputStream, bufferedOutputStream);
                    }
                    androidx.exifinterface.media.b.c(bufferedInputStream);
                    androidx.exifinterface.media.b.c(bufferedOutputStream);
                    createTempFile.delete();
                    this.f42816m = null;
                } catch (Exception e18) {
                    e = e18;
                    inputStream = fileInputStream3;
                    fileInputStream2 = new FileInputStream(createTempFile);
                    if (this.f42804a != null) {
                    }
                    fileOutputStream2 = fileOutputStream3;
                    androidx.exifinterface.media.b.e(fileInputStream2, fileOutputStream2);
                    androidx.exifinterface.media.b.c(fileInputStream2);
                    androidx.exifinterface.media.b.c(fileOutputStream2);
                    throw new IOException("Failed to save new file", e);
                }
            } catch (Exception e19) {
                e = e19;
            } catch (Throwable th8) {
                th = th8;
                closeable = null;
                inputStream = bufferedInputStream;
                androidx.exifinterface.media.b.c(inputStream);
                androidx.exifinterface.media.b.c(closeable);
                if (0 == 0) {
                }
                throw th;
            }
        } catch (Exception e21) {
            e = e21;
            inputStream = fileInputStream;
            try {
                throw new IOException("Failed to copy original file to temp file", e);
            } catch (Throwable th9) {
                th = th9;
                androidx.exifinterface.media.b.c(inputStream);
                androidx.exifinterface.media.b.c(fileOutputStream);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            inputStream = fileInputStream;
            androidx.exifinterface.media.b.c(inputStream);
            androidx.exifinterface.media.b.c(fileOutputStream);
            throw th;
        }
    }

    public final void H(@NonNull String str, String str2) {
        e eVar;
        int i11;
        int i12;
        d dVar;
        int i13;
        boolean z11;
        String str3 = str;
        String str4 = str2;
        int i14 = 1;
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && str4 != null) {
            boolean find = f42795f0.matcher(str4).find();
            boolean find2 = f42796g0.matcher(str4).find();
            if (str4.length() != 19 || (!find && !find2)) {
                Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                return;
            }
            if (find2) {
                str4 = str4.replaceAll("-", ProductContainerDTO.RATIO_DELIMITER);
            }
        }
        boolean equals = "ISOSpeedRatings".equals(str3);
        boolean z12 = f42797t;
        if (equals) {
            if (z12) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = "PhotographicSensitivity";
        }
        int i15 = 2;
        if (str4 != null && f42789Z.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = f42794e0.matcher(str4);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                    return;
                }
                str4 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    str4 = new f(Double.parseDouble(str4)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                    return;
                }
            }
        }
        int i16 = 0;
        while (i16 < f42785V.length) {
            if ((i16 != 4 || this.f42811h) && (eVar = f42788Y[i16].get(str3)) != null) {
                HashMap<String, d>[] hashMapArr = this.f42808e;
                if (str4 == null) {
                    hashMapArr[i16].remove(str3);
                } else {
                    Pair<Integer, Integer> s11 = s(str4);
                    int intValue = ((Integer) s11.first).intValue();
                    int i17 = -1;
                    int i18 = eVar.f42839c;
                    if (i18 != intValue && i18 != ((Integer) s11.second).intValue()) {
                        int i19 = eVar.f42840d;
                        if (i19 != -1 && (i19 == ((Integer) s11.first).intValue() || i19 == ((Integer) s11.second).intValue())) {
                            i18 = i19;
                        } else if (i18 != i14 && i18 != 7 && i18 != i15) {
                            if (z12) {
                                StringBuilder b11 = C6594f.b("Given tag (", str3, ") value didn't match with one of expected formats: ");
                                String[] strArr = f42781R;
                                b11.append(strArr[i18]);
                                b11.append(i19 == -1 ? "" : ", " + strArr[i19]);
                                b11.append(" (guess: ");
                                b11.append(strArr[((Integer) s11.first).intValue()]);
                                b11.append(((Integer) s11.second).intValue() != -1 ? ", " + strArr[((Integer) s11.second).intValue()] : "");
                                b11.append(")");
                                Log.d("ExifInterface", b11.toString());
                            }
                        }
                    }
                    int[] iArr = f42782S;
                    switch (i18) {
                        case 1:
                            i11 = i16;
                            HashMap<String, d> hashMap = hashMapArr[i11];
                            i12 = i14;
                            if (str4.length() == i12 && str4.charAt(0) >= '0' && str4.charAt(0) <= '1') {
                                byte[] bArr = new byte[i12];
                                bArr[0] = (byte) (str4.charAt(0) - '0');
                                dVar = new d(i12, i12, bArr);
                                hashMap.put(str3, dVar);
                                break;
                            }
                            byte[] bytes = str4.getBytes(f42791b0);
                            dVar = new d(i12, bytes.length, bytes);
                            hashMap.put(str3, dVar);
                            break;
                        case 2:
                        case 7:
                            i13 = i14;
                            i11 = i16;
                            z11 = false;
                            hashMapArr[i11].put(str3, d.a(str4));
                            i12 = i13;
                            break;
                        case 3:
                            i13 = i14;
                            i11 = i16;
                            z11 = false;
                            String[] split = str4.split(",", -1);
                            int[] iArr2 = new int[split.length];
                            for (int i21 = 0; i21 < split.length; i21++) {
                                iArr2[i21] = Integer.parseInt(split[i21]);
                            }
                            hashMapArr[i11].put(str3, d.f(iArr2, this.f42810g));
                            i12 = i13;
                            break;
                        case 4:
                            i13 = i14;
                            i11 = i16;
                            z11 = false;
                            String[] split2 = str4.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i22 = 0; i22 < split2.length; i22++) {
                                jArr[i22] = Long.parseLong(split2[i22]);
                            }
                            hashMapArr[i11].put(str3, d.c(jArr, this.f42810g));
                            i12 = i13;
                            break;
                        case 5:
                            i13 = i14;
                            i11 = i16;
                            int i23 = -1;
                            z11 = false;
                            String[] split3 = str4.split(",", -1);
                            f[] fVarArr = new f[split3.length];
                            int i24 = 0;
                            while (i24 < split3.length) {
                                String[] split4 = split3[i24].split("/", i23);
                                fVarArr[i24] = new f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[i13]));
                                i24++;
                                i23 = -1;
                            }
                            hashMapArr[i11].put(str3, d.d(fVarArr, this.f42810g));
                            i12 = i13;
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (z12) {
                                Log.d("ExifInterface", "Data format isn't one of expected formats: " + i18);
                                break;
                            }
                            break;
                        case 9:
                            i13 = i14;
                            i11 = i16;
                            z11 = false;
                            String[] split5 = str4.split(",", -1);
                            int length = split5.length;
                            int[] iArr3 = new int[length];
                            for (int i25 = 0; i25 < split5.length; i25++) {
                                iArr3[i25] = Integer.parseInt(split5[i25]);
                            }
                            HashMap<String, d> hashMap2 = hashMapArr[i11];
                            ByteOrder byteOrder = this.f42810g;
                            ByteBuffer wrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                            wrap.order(byteOrder);
                            for (int i26 = 0; i26 < length; i26++) {
                                wrap.putInt(iArr3[i26]);
                            }
                            hashMap2.put(str3, new d(9, length, wrap.array()));
                            i12 = i13;
                            break;
                        case 10:
                            String[] split6 = str4.split(",", -1);
                            int length2 = split6.length;
                            f[] fVarArr2 = new f[length2];
                            int i27 = 0;
                            z11 = false;
                            while (i27 < split6.length) {
                                String[] split7 = split6[i27].split("/", i17);
                                int i28 = i14;
                                f[] fVarArr3 = fVarArr2;
                                fVarArr3[i27] = new f((long) Double.parseDouble(split7[0]), (long) Double.parseDouble(split7[i28]));
                                i27++;
                                i14 = i28;
                                i16 = i16;
                                fVarArr2 = fVarArr3;
                                iArr = iArr;
                                i17 = -1;
                            }
                            i13 = i14;
                            i11 = i16;
                            f[] fVarArr4 = fVarArr2;
                            HashMap<String, d> hashMap3 = hashMapArr[i11];
                            ByteOrder byteOrder2 = this.f42810g;
                            ByteBuffer wrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                            wrap2.order(byteOrder2);
                            for (int i29 = 0; i29 < length2; i29++) {
                                f fVar = fVarArr4[i29];
                                wrap2.putInt((int) fVar.f42841a);
                                wrap2.putInt((int) fVar.f42842b);
                            }
                            hashMap3.put(str3, new d(10, length2, wrap2.array()));
                            i12 = i13;
                            break;
                        case 12:
                            String[] split8 = str4.split(",", -1);
                            int length3 = split8.length;
                            double[] dArr = new double[length3];
                            for (int i31 = 0; i31 < split8.length; i31 += i14) {
                                dArr[i31] = Double.parseDouble(split8[i31]);
                            }
                            HashMap<String, d> hashMap4 = hashMapArr[i16];
                            ByteOrder byteOrder3 = this.f42810g;
                            ByteBuffer wrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                            wrap3.order(byteOrder3);
                            for (int i32 = 0; i32 < length3; i32 += i14) {
                                wrap3.putDouble(dArr[i32]);
                            }
                            hashMap4.put(str3, new d(12, length3, wrap3.array()));
                            break;
                    }
                    i16 = i11 + 1;
                    i14 = i12;
                    i15 = 2;
                }
            }
            i12 = i14;
            i11 = i16;
            i16 = i11 + 1;
            i14 = i12;
            i15 = 2;
        }
    }

    public final String d(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d g10 = g(str);
        if (g10 != null) {
            if (!f42789Z.contains(str)) {
                return g10.i(this.f42810g);
            }
            if (str.equals("GPSTimeStamp")) {
                int i11 = g10.f42833a;
                if (i11 != 5 && i11 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i11);
                    return null;
                }
                f[] fVarArr = (f[]) g10.j(this.f42810g);
                if (fVarArr == null || fVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                    return null;
                }
                f fVar = fVarArr[0];
                Integer valueOf = Integer.valueOf((int) (fVar.f42841a / fVar.f42842b));
                f fVar2 = fVarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (fVar2.f42841a / fVar2.f42842b));
                f fVar3 = fVarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (fVar3.f42841a / fVar3.f42842b)));
            }
            try {
                return Double.toString(g10.g(this.f42810g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final double e(@NonNull String str, double d11) {
        d g10 = g(str);
        if (g10 != null) {
            try {
                return g10.g(this.f42810g);
            } catch (NumberFormatException unused) {
            }
        }
        return d11;
    }

    public final int f(int i11, @NonNull String str) {
        d g10 = g(str);
        if (g10 == null) {
            return i11;
        }
        try {
            return g10.h(this.f42810g);
        } catch (NumberFormatException unused) {
            return i11;
        }
    }

    public final double[] j() {
        String d11 = d("GPSLatitude");
        String d12 = d("GPSLatitudeRef");
        String d13 = d("GPSLongitude");
        String d14 = d("GPSLongitudeRef");
        if (d11 == null || d12 == null || d13 == null || d14 == null) {
            return null;
        }
        try {
            return new double[]{b(d11, d12), b(d13, d14)};
        } catch (IllegalArgumentException unused) {
            StringBuilder d15 = C3660k.d("latValue=", d11, ", latRef=", d12, ", lngValue=");
            d15.append(d13);
            d15.append(", lngRef=");
            d15.append(d14);
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. ".concat(d15.toString()));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[Catch: all -> 0x0087, Exception -> 0x0089, TRY_ENTER, TryCatch #3 {Exception -> 0x0089, blocks: (B:16:0x005a, B:19:0x0070, B:21:0x007c, B:26:0x008b, B:27:0x0090, B:28:0x0091, B:29:0x0096), top: B:15:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091 A[Catch: all -> 0x0087, Exception -> 0x0089, TryCatch #3 {Exception -> 0x0089, blocks: (B:16:0x005a, B:19:0x0070, B:21:0x007c, B:26:0x008b, B:27:0x0090, B:28:0x0091, B:29:0x0096), top: B:15:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] q() {
        FileDescriptor fileDescriptor;
        Exception e11;
        FileDescriptor fileDescriptor2;
        FileInputStream fileInputStream;
        Closeable closeable = null;
        if (this.f42811h) {
            ?? r12 = this.f42816m;
            try {
                if (r12 != 0) {
                    return r12;
                }
                try {
                    r12 = this.f42806c;
                    try {
                        if (r12 != 0) {
                            try {
                                if (!r12.markSupported()) {
                                    Log.d("ExifInterface", "Cannot read thumbnail from inputstream without mark/reset support");
                                    androidx.exifinterface.media.b.c(r12);
                                    return null;
                                }
                                r12.reset();
                                fileInputStream = r12;
                            } catch (Exception e12) {
                                e11 = e12;
                                fileDescriptor2 = null;
                                Log.d("ExifInterface", "Encountered exception while getting thumbnail", e11);
                                androidx.exifinterface.media.b.c(r12);
                                if (fileDescriptor2 != null) {
                                }
                                return null;
                            } catch (Throwable th2) {
                                th = th2;
                                fileDescriptor = null;
                                closeable = r12;
                                androidx.exifinterface.media.b.c(closeable);
                                if (fileDescriptor != null) {
                                }
                                throw th;
                            }
                        } else {
                            if (this.f42804a == null) {
                                FileDescriptor b11 = b.a.b(this.f42805b);
                                try {
                                    b.a.c(b11, 0L, OsConstants.SEEK_SET);
                                    fileDescriptor2 = b11;
                                    r12 = new FileInputStream(b11);
                                    if (r12.skip(this.f42814k + this.f42818o) == this.f42814k + this.f42818o) {
                                        throw new IOException("Corrupted image");
                                    }
                                    byte[] bArr = new byte[this.f42815l];
                                    if (r12.read(bArr) != this.f42815l) {
                                        throw new IOException("Corrupted image");
                                    }
                                    this.f42816m = bArr;
                                    androidx.exifinterface.media.b.c(r12);
                                    if (fileDescriptor2 != null) {
                                        androidx.exifinterface.media.b.b(fileDescriptor2);
                                    }
                                    return bArr;
                                } catch (Exception e13) {
                                    e11 = e13;
                                    fileDescriptor2 = b11;
                                    r12 = 0;
                                    Log.d("ExifInterface", "Encountered exception while getting thumbnail", e11);
                                    androidx.exifinterface.media.b.c(r12);
                                    if (fileDescriptor2 != null) {
                                    }
                                    return null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileDescriptor = b11;
                                    androidx.exifinterface.media.b.c(closeable);
                                    if (fileDescriptor != null) {
                                        androidx.exifinterface.media.b.b(fileDescriptor);
                                    }
                                    throw th;
                                }
                            }
                            fileInputStream = new FileInputStream(this.f42804a);
                        }
                        if (r12.skip(this.f42814k + this.f42818o) == this.f42814k + this.f42818o) {
                        }
                    } catch (Exception e14) {
                        e11 = e14;
                        Log.d("ExifInterface", "Encountered exception while getting thumbnail", e11);
                        androidx.exifinterface.media.b.c(r12);
                        if (fileDescriptor2 != null) {
                            androidx.exifinterface.media.b.b(fileDescriptor2);
                        }
                        return null;
                    }
                    fileDescriptor2 = null;
                    r12 = fileInputStream;
                } catch (Exception e15) {
                    r12 = 0;
                    e11 = e15;
                    fileDescriptor2 = null;
                } catch (Throwable th4) {
                    th = th4;
                    fileDescriptor = null;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        return null;
    }

    private static class g extends b {
        g(byte[] bArr) throws IOException {
            super(bArr);
            this.f42827a.mark(Integer.MAX_VALUE);
        }

        public final void j(long j11) throws IOException {
            int i11 = this.f42829c;
            if (i11 > j11) {
                this.f42829c = 0;
                this.f42827a.reset();
            } else {
                j11 -= i11;
            }
            d((int) j11);
        }

        g(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f42827a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f42837a;

        /* renamed from: b, reason: collision with root package name */
        public final String f42838b;

        /* renamed from: c, reason: collision with root package name */
        public final int f42839c;

        /* renamed from: d, reason: collision with root package name */
        public final int f42840d;

        e(String str, int i11, int i12) {
            this.f42838b = str;
            this.f42837a = i11;
            this.f42839c = i12;
            this.f42840d = -1;
        }

        e(String str, int i11, int i12, int i13) {
            this.f42838b = str;
            this.f42837a = i11;
            this.f42839c = i12;
            this.f42840d = i13;
        }
    }

    public a(@NonNull InputStream inputStream) throws IOException {
        e[][] eVarArr = f42785V;
        this.f42808e = new HashMap[eVarArr.length];
        this.f42809f = new HashSet(eVarArr.length);
        this.f42810g = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f42804a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f42806c = (AssetManager.AssetInputStream) inputStream;
                this.f42805b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        b.a.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                        this.f42806c = null;
                        this.f42805b = fileInputStream.getFD();
                    } catch (Exception unused) {
                        if (f42797t) {
                            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                        }
                    }
                }
                this.f42806c = null;
                this.f42805b = null;
            }
            v(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
