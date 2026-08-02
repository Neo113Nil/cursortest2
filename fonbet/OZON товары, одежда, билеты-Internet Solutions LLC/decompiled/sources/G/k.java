package G;

import G.j;
import androidx.annotation.NonNull;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public final class k extends FilterOutputStream {

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f9633g = "Exif\u0000\u0000".getBytes(i.f9612d);

    /* renamed from: a, reason: collision with root package name */
    private final j f9634a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f9635b;

    /* renamed from: c, reason: collision with root package name */
    private final ByteBuffer f9636c;

    /* renamed from: d, reason: collision with root package name */
    private int f9637d;

    /* renamed from: e, reason: collision with root package name */
    private int f9638e;

    /* renamed from: f, reason: collision with root package name */
    private int f9639f;

    public k(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull j jVar) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.f9635b = new byte[1];
        this.f9636c = ByteBuffer.allocate(4);
        this.f9637d = 0;
        this.f9634a = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x039d, code lost:
    
        ((java.io.FilterOutputStream) r18).out.write(r19, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x03a2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x039b, code lost:
    
        if (r5 <= 0) goto L160;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void write(@NonNull byte[] bArr, int i11, int i12) throws IOException {
        j jVar;
        int i13;
        int i14;
        boolean z11;
        int i15 = 1;
        int i16 = i11;
        int i17 = i12;
        while (true) {
            int i18 = this.f9638e;
            if ((i18 > 0 || this.f9639f > 0 || this.f9637d != 2) && i17 > 0) {
                if (i18 > 0) {
                    int min = Math.min(i17, i18);
                    i17 -= min;
                    this.f9638e -= min;
                    i16 += min;
                }
                int i19 = this.f9639f;
                if (i19 > 0) {
                    int min2 = Math.min(i17, i19);
                    ((FilterOutputStream) this).out.write(bArr, i16, min2);
                    i17 -= min2;
                    this.f9639f -= min2;
                    i16 += min2;
                }
                if (i17 == 0) {
                    return;
                }
                int i21 = this.f9637d;
                boolean z12 = false;
                int i22 = 4;
                ByteBuffer byteBuffer = this.f9636c;
                if (i21 != 0) {
                    if (i21 == i15) {
                        int min3 = Math.min(i17, 4 - byteBuffer.position());
                        byteBuffer.put(bArr, i16, min3);
                        i16 += min3;
                        i17 -= min3;
                        if (byteBuffer.position() == 2 && byteBuffer.getShort() == -39) {
                            ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                            byteBuffer.rewind();
                        }
                        if (byteBuffer.position() < 4) {
                            return;
                        }
                        byteBuffer.rewind();
                        short s11 = byteBuffer.getShort();
                        if (s11 == -31) {
                            this.f9638e = (byteBuffer.getShort() & 65535) - 2;
                            this.f9637d = 2;
                        } else if (s11 < -64 || s11 > -49 || s11 == -60 || s11 == -56 || s11 == -52) {
                            ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                            this.f9639f = (byteBuffer.getShort() & 65535) - 2;
                        } else {
                            ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                            this.f9637d = 2;
                        }
                        byteBuffer.rewind();
                    }
                    i13 = i15;
                } else {
                    int min4 = Math.min(i17, 2 - byteBuffer.position());
                    byteBuffer.put(bArr, i16, min4);
                    i16 += min4;
                    i17 -= min4;
                    if (byteBuffer.position() < 2) {
                        return;
                    }
                    byteBuffer.rewind();
                    if (byteBuffer.getShort() != -40) {
                        throw new IOException("Not a valid jpeg image, cannot write exif");
                    }
                    ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                    this.f9637d = i15;
                    byteBuffer.rewind();
                    OutputStream outputStream = ((FilterOutputStream) this).out;
                    ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                    b bVar = new b(outputStream);
                    bVar.j((short) -31);
                    int[] iArr = new int[4];
                    int[] iArr2 = new int[4];
                    l[] lVarArr = j.f9618c;
                    int i23 = 0;
                    while (true) {
                        jVar = this.f9634a;
                        if (i23 >= i22) {
                            break;
                        }
                        l lVar = lVarArr[i23];
                        int i24 = 0;
                        while (true) {
                            l[] lVarArr2 = j.f9618c;
                            if (i24 < i22) {
                                jVar.b(i24).remove(lVar.f9641b);
                                i24 += i15;
                                i22 = 4;
                            }
                        }
                        i23 += i15;
                        i22 = 4;
                    }
                    if (!jVar.b(i15).isEmpty()) {
                        jVar.b(0).put(j.f9618c[i15].f9641b, i.a(0L, jVar.c()));
                    }
                    if (!jVar.b(2).isEmpty()) {
                        jVar.b(0).put(j.f9618c[2].f9641b, i.a(0L, jVar.c()));
                    }
                    if (!jVar.b(3).isEmpty()) {
                        jVar.b(i15).put(j.f9618c[3].f9641b, i.a(0L, jVar.c()));
                    }
                    int i25 = 0;
                    while (true) {
                        l[] lVarArr3 = j.f9618c;
                        if (i25 >= 4) {
                            break;
                        }
                        Iterator<Map.Entry<String, i>> it = jVar.b(i25).entrySet().iterator();
                        int i26 = 0;
                        while (it.hasNext()) {
                            i value = it.next().getValue();
                            int i27 = i.f9614f[value.f9615a] * value.f9616b;
                            if (i27 > 4) {
                                i26 += i27;
                            }
                        }
                        iArr2[i25] = iArr2[i25] + i26;
                        i25 += i15;
                    }
                    int i28 = 0;
                    int i29 = 8;
                    while (true) {
                        l[] lVarArr4 = j.f9618c;
                        if (i28 >= 4) {
                            break;
                        }
                        if (!jVar.b(i28).isEmpty()) {
                            iArr[i28] = i29;
                            i29 += (jVar.b(i28).size() * 12) + 6 + iArr2[i28];
                        }
                        i28 += i15;
                    }
                    int i31 = i29 + 8;
                    if (!jVar.b(i15).isEmpty()) {
                        jVar.b(0).put(j.f9618c[i15].f9641b, i.a(iArr[i15], jVar.c()));
                    }
                    if (!jVar.b(2).isEmpty()) {
                        jVar.b(0).put(j.f9618c[2].f9641b, i.a(iArr[2], jVar.c()));
                    }
                    if (!jVar.b(3).isEmpty()) {
                        jVar.b(i15).put(j.f9618c[3].f9641b, i.a(iArr[3], jVar.c()));
                    }
                    bVar.j((short) i31);
                    bVar.write(f9633g);
                    bVar.j(jVar.c() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
                    bVar.c(jVar.c());
                    bVar.j((short) 42);
                    bVar.d((int) 8);
                    int i32 = 0;
                    while (true) {
                        l[] lVarArr5 = j.f9618c;
                        if (i32 >= 4) {
                            break;
                        }
                        if (jVar.b(i32).isEmpty()) {
                            i14 = i15;
                            z11 = z12;
                        } else {
                            bVar.j((short) jVar.b(i32).size());
                            int size = (jVar.b(i32).size() * 12) + iArr[i32] + 2 + 4;
                            for (Map.Entry<String, i> entry : jVar.b(i32).entrySet()) {
                                l lVar2 = (l) ((HashMap) j.b.f9627f.get(i32)).get(entry.getKey());
                                int i33 = i15;
                                x2.i.e(lVar2, "Tag not supported: " + entry.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.");
                                i value2 = entry.getValue();
                                int i34 = i.f9614f[value2.f9615a];
                                int i35 = value2.f9616b;
                                int i36 = i34 * i35;
                                bVar.j((short) lVar2.f9640a);
                                bVar.j((short) value2.f9615a);
                                bVar.d(i35);
                                if (i36 > 4) {
                                    bVar.d(size);
                                    size += i36;
                                } else {
                                    bVar.write(value2.f9617c);
                                    if (i36 < 4) {
                                        for (int i37 = 4; i36 < i37; i37 = 4) {
                                            bVar.f9598a.write(0);
                                            i36++;
                                        }
                                    }
                                }
                                i15 = i33;
                            }
                            i14 = i15;
                            bVar.d((int) 0);
                            Iterator<Map.Entry<String, i>> it2 = jVar.b(i32).entrySet().iterator();
                            while (it2.hasNext()) {
                                byte[] bArr2 = it2.next().getValue().f9617c;
                                if (bArr2.length > 4) {
                                    bVar.write(bArr2, 0, bArr2.length);
                                }
                            }
                            z11 = false;
                        }
                        i32++;
                        z12 = z11;
                        i15 = i14;
                    }
                    i13 = i15;
                    bVar.c(ByteOrder.BIG_ENDIAN);
                }
                i15 = i13;
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i11) throws IOException {
        byte[] bArr = this.f9635b;
        bArr[0] = (byte) (i11 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
