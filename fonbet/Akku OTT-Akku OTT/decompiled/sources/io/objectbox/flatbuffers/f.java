package io.objectbox.flatbuffers;

import androidx.collection.SieveCacheKt;
import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class f {
    public final io.objectbox.flatbuffers.a a;
    public final ArrayList<b> b;
    public final HashMap<String, Integer> c;
    public final HashMap<String, Integer> d;
    public final int e;
    public final a f;

    public class a implements Comparator<b> {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(b bVar, b bVar2) {
            byte b;
            byte b2;
            int i = bVar.e;
            int i2 = bVar2.e;
            do {
                byte[] bArr = f.this.a.a;
                b = bArr[i];
                b2 = bArr[i2];
                if (b == 0) {
                    return b - b2;
                }
                i++;
                i2++;
            } while (b == b2);
            return b - b2;
        }
    }

    public f() {
        this(new io.objectbox.flatbuffers.a(256), 1);
    }

    public static int m(long j) {
        if (j <= 255) {
            return 0;
        }
        if (j <= 65535) {
            return 1;
        }
        return j <= (((long) (-1)) & KeyboardMap.kValueMask) ? 2 : 3;
    }

    public final int a(int i) {
        int i2 = 1 << i;
        io.objectbox.flatbuffers.a aVar = this.a;
        int i3 = (i2 - 1) & ((~aVar.b) + 1);
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return i2;
            }
            aVar.c((byte) 0);
            i3 = i4;
        }
    }

    public final b b(int i, int i2, int i3, b bVar) {
        int i4;
        ArrayList<b> arrayList;
        long j = i3;
        int max = Math.max(0, m(j));
        io.objectbox.flatbuffers.a aVar = this.a;
        if (bVar != null) {
            max = Math.max(max, b.a(bVar.a, bVar.b, bVar.d, aVar.b, 0));
            i4 = 3;
        } else {
            i4 = 1;
        }
        int i5 = max;
        int i6 = i2;
        while (true) {
            arrayList = this.b;
            if (i6 >= arrayList.size()) {
                break;
            }
            b bVar2 = arrayList.get(i6);
            i5 = Math.max(i5, b.a(bVar2.a, bVar2.b, bVar2.d, aVar.b, i6 + i4));
            i6++;
        }
        int a2 = a(i5);
        if (bVar != null) {
            p((int) (aVar.b - bVar.d), a2);
            p(1 << bVar.b, a2);
        }
        p(j, a2);
        int i7 = aVar.b;
        for (int i8 = i2; i8 < arrayList.size(); i8++) {
            n(arrayList.get(i8), a2);
        }
        for (int i9 = i2; i9 < arrayList.size(); i9++) {
            b bVar3 = arrayList.get(i9);
            int i10 = bVar3.b;
            int i11 = bVar3.a;
            if (i11 <= 3 || i11 == 26) {
                i10 = Math.max(i10, i5);
            }
            aVar.c((byte) ((i11 << 2) | i10));
        }
        return new b(i, bVar != null ? 9 : 10, i5, i7);
    }

    public final void c(int i, String str) {
        io.objectbox.flatbuffers.a aVar;
        int k = k(str);
        ArrayList<b> arrayList = this.b;
        Collections.sort(arrayList.subList(i, arrayList.size()), this.f);
        long size = arrayList.size() - i;
        int max = Math.max(0, m(size));
        int i2 = i;
        while (true) {
            int size2 = arrayList.size();
            aVar = this.a;
            if (i2 >= size2) {
                break;
            }
            int i3 = i2 + 1;
            max = Math.max(max, b.a(4, 0, arrayList.get(i2).e, aVar.b, i3));
            i2 = i3;
        }
        int a2 = a(max);
        p(size, a2);
        int i4 = aVar.b;
        for (int i5 = i; i5 < arrayList.size(); i5++) {
            int i6 = arrayList.get(i5).e;
            p((int) (aVar.b - arrayList.get(i5).e), a2);
        }
        b b2 = b(k, i, arrayList.size() - i, new b(-1, 4 - (-10), max, i4));
        while (arrayList.size() > i) {
            arrayList.remove(arrayList.size() - 1);
        }
        arrayList.add(b2);
    }

    public final ByteBuffer d() {
        ArrayList<b> arrayList = this.b;
        b bVar = arrayList.get(0);
        io.objectbox.flatbuffers.a aVar = this.a;
        int a2 = a(b.a(bVar.a, bVar.b, bVar.d, aVar.b, 0));
        n(arrayList.get(0), a2);
        b bVar2 = arrayList.get(0);
        int i = bVar2.b;
        int i2 = bVar2.a;
        if (i2 <= 3 || i2 == 26) {
            i = Math.max(i, 0);
        }
        aVar.c((byte) ((i2 << 2) | i));
        aVar.c((byte) a2);
        return ByteBuffer.wrap(aVar.a, 0, aVar.b);
    }

    public final int e(String str, byte[] bArr) {
        b o = o(k(str), bArr, 25, false);
        this.b.add(o);
        return (int) o.d;
    }

    public final void f(String str, boolean z) {
        this.b.add(new b(k(str), 26, 0, z ? 1L : 0L));
    }

    public final void g(String str, double d) {
        this.b.add(new b(k(str), 3, d));
    }

    public final void h(String str, float f) {
        this.b.add(new b(k(str), 2, f));
    }

    public final void i(int i) {
        j(null, i);
    }

    public final void j(String str, long j) {
        int k = k(str);
        ArrayList<b> arrayList = this.b;
        if (-128 <= j && j <= 127) {
            arrayList.add(new b(k, 1, 0, (int) j));
            return;
        }
        if (-32768 <= j && j <= 32767) {
            arrayList.add(new b(k, 1, 1, (int) j));
        } else if (SieveCacheKt.NodeMetaAndPreviousMask > j || j > SieveCacheKt.NodeLinkMask) {
            arrayList.add(new b(k, 1, 3, j));
        } else {
            arrayList.add(new b(k, 1, 2, (int) j));
        }
    }

    public final int k(String str) {
        if (str == null) {
            return -1;
        }
        io.objectbox.flatbuffers.a aVar = this.a;
        int i = aVar.b;
        int i2 = this.e & 1;
        HashMap<String, Integer> hashMap = this.c;
        if (i2 == 0) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            aVar.d(bytes, bytes.length);
            aVar.c((byte) 0);
            hashMap.put(str, Integer.valueOf(i));
            return i;
        }
        Integer num = hashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        aVar.d(bytes2, bytes2.length);
        aVar.c((byte) 0);
        hashMap.put(str, Integer.valueOf(i));
        return i;
    }

    public final int l(String str, String str2) {
        int k = k(str);
        int i = this.e & 2;
        ArrayList<b> arrayList = this.b;
        if (i == 0) {
            b o = o(k, str2.getBytes(StandardCharsets.UTF_8), 5, true);
            arrayList.add(o);
            return (int) o.d;
        }
        HashMap<String, Integer> hashMap = this.d;
        Integer num = hashMap.get(str2);
        if (num != null) {
            arrayList.add(new b(k, 5, m(str2.length()), num.intValue()));
            return num.intValue();
        }
        b o2 = o(k, str2.getBytes(StandardCharsets.UTF_8), 5, true);
        int i2 = (int) o2.d;
        hashMap.put(str2, Integer.valueOf(i2));
        arrayList.add(o2);
        return i2;
    }

    public final void n(b bVar, int i) {
        int i2 = bVar.a;
        long j = bVar.d;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            io.objectbox.flatbuffers.a aVar = this.a;
            if (i2 == 3) {
                double d = bVar.c;
                if (i == 4) {
                    float f = (float) d;
                    int i3 = aVar.b;
                    aVar.e(i3 + 4);
                    int floatToRawIntBits = Float.floatToRawIntBits(f);
                    byte[] bArr = aVar.a;
                    bArr[i3] = (byte) (floatToRawIntBits & 255);
                    bArr[i3 + 1] = (byte) ((floatToRawIntBits >> 8) & 255);
                    bArr[i3 + 2] = (byte) ((floatToRawIntBits >> 16) & 255);
                    bArr[i3 + 3] = (byte) ((floatToRawIntBits >> 24) & 255);
                    aVar.b += 4;
                    return;
                }
                if (i == 8) {
                    int i4 = aVar.b;
                    aVar.e(i4 + 8);
                    long doubleToRawLongBits = Double.doubleToRawLongBits(d);
                    int i5 = (int) doubleToRawLongBits;
                    byte[] bArr2 = aVar.a;
                    bArr2[i4] = (byte) (i5 & 255);
                    bArr2[i4 + 1] = (byte) ((i5 >> 8) & 255);
                    bArr2[i4 + 2] = (byte) ((i5 >> 16) & 255);
                    bArr2[i4 + 3] = (byte) ((i5 >> 24) & 255);
                    int i6 = (int) (doubleToRawLongBits >> 32);
                    bArr2[i4 + 4] = (byte) (i6 & 255);
                    bArr2[i4 + 5] = (byte) ((i6 >> 8) & 255);
                    bArr2[i4 + 6] = (byte) ((i6 >> 16) & 255);
                    bArr2[i4 + 7] = (byte) ((i6 >> 24) & 255);
                    aVar.b += 8;
                    return;
                }
                return;
            }
            if (i2 != 26) {
                p((int) (aVar.b - j), i);
                return;
            }
        }
        p(j, i);
    }

    public final b o(int i, byte[] bArr, int i2, boolean z) {
        int m = m(bArr.length);
        p(bArr.length, a(m));
        io.objectbox.flatbuffers.a aVar = this.a;
        int i3 = aVar.b;
        aVar.d(bArr, bArr.length);
        if (z) {
            aVar.c((byte) 0);
        }
        return new b(i, i2, m, i3);
    }

    public final void p(long j, int i) {
        io.objectbox.flatbuffers.a aVar = this.a;
        if (i == 1) {
            aVar.c((byte) j);
            return;
        }
        if (i == 2) {
            short s = (short) j;
            int i2 = aVar.b;
            aVar.e(i2 + 2);
            byte[] bArr = aVar.a;
            bArr[i2] = (byte) (s & 255);
            bArr[i2 + 1] = (byte) ((s >> 8) & 255);
            aVar.b += 2;
            return;
        }
        if (i == 4) {
            int i3 = (int) j;
            int i4 = aVar.b;
            aVar.e(i4 + 4);
            byte[] bArr2 = aVar.a;
            bArr2[i4] = (byte) (i3 & 255);
            bArr2[i4 + 1] = (byte) ((i3 >> 8) & 255);
            bArr2[i4 + 2] = (byte) ((i3 >> 16) & 255);
            bArr2[i4 + 3] = (byte) ((i3 >> 24) & 255);
            aVar.b += 4;
            return;
        }
        if (i != 8) {
            return;
        }
        int i5 = aVar.b;
        aVar.e(i5 + 8);
        int i6 = (int) j;
        byte[] bArr3 = aVar.a;
        bArr3[i5] = (byte) (i6 & 255);
        bArr3[i5 + 1] = (byte) ((i6 >> 8) & 255);
        bArr3[i5 + 2] = (byte) ((i6 >> 16) & 255);
        bArr3[i5 + 3] = (byte) ((i6 >> 24) & 255);
        int i7 = (int) (j >> 32);
        bArr3[i5 + 4] = (byte) (i7 & 255);
        bArr3[i5 + 5] = (byte) ((i7 >> 8) & 255);
        bArr3[i5 + 6] = (byte) ((i7 >> 16) & 255);
        bArr3[i5 + 7] = (byte) ((i7 >> 24) & 255);
        aVar.b += 8;
    }

    public f(io.objectbox.flatbuffers.a aVar, int i) {
        this.b = new ArrayList<>();
        this.c = new HashMap<>();
        this.d = new HashMap<>();
        this.f = new a();
        this.a = aVar;
        this.e = i;
    }

    public static class b {
        public final int a;
        public final int b;
        public final double c;
        public final long d;
        public final int e;

        public b(int i, int i2, int i3, long j) {
            this.e = i;
            this.a = i2;
            this.b = i3;
            this.d = j;
            this.c = Double.MIN_VALUE;
        }

        public static int a(int i, int i2, long j, int i3, int i4) {
            if (i <= 3 || i == 26) {
                return i2;
            }
            for (int i5 = 1; i5 <= 32; i5 *= 2) {
                int m = f.m(((i4 * i5) + ((((~i3) + 1) & (i5 - 1)) + i3)) - j);
                if ((1 << m) == i5) {
                    return m;
                }
            }
            return 3;
        }

        public b(int i, int i2, double d) {
            this.e = i;
            this.a = 3;
            this.b = i2;
            this.c = d;
            this.d = Long.MIN_VALUE;
        }
    }
}
