package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0783b1 implements InterfaceC1229l1, Xu {

    /* renamed from: n, reason: collision with root package name */
    public static final long[] f12748n = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f12749o = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f12750p = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: k, reason: collision with root package name */
    public int f12751k;

    /* renamed from: l, reason: collision with root package name */
    public int f12752l;

    /* renamed from: m, reason: collision with root package name */
    public Object f12753m;

    public C0783b1(int i) {
        switch (i) {
            case 5:
                this.f12753m = new Er(4);
                this.f12751k = 8000;
                this.f12752l = 8000;
                break;
            default:
                this.f12753m = new byte[8];
                break;
        }
    }

    public static long e(int i, boolean z3, byte[] bArr) {
        long j5 = bArr[0] & 255;
        if (z3) {
            j5 &= ~f12748n[i - 1];
        }
        for (int i5 = 1; i5 < i; i5++) {
            j5 = (j5 << 8) | (bArr[i5] & 255);
        }
        return j5;
    }

    public static final void f(ByteBuffer byteBuffer, long j5, int i, int i5, boolean z3) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z3 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j5);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        long j6 = i5;
        AbstractC1400ot.d0((j6 >> 8) == 0, "out of range: %s", j6);
        byteBuffer.put((byte) j6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1229l1
    public int a() {
        return this.f12751k;
    }

    public String b(ArrayList arrayList, ArrayList arrayList2) {
        boolean z3;
        int i;
        boolean z5;
        Collections.sort(arrayList2, new C1589t2(4));
        HashSet hashSet = new HashSet();
        loop0: for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            String[] split = Normalizer.normalize((CharSequence) arrayList.get(((V5) arrayList2.get(i5)).f11865e), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                for (int i6 = 0; i6 < split.length; i6++) {
                    String str = split[i6];
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i7 = 1;
                        boolean z6 = false;
                        while (true) {
                            int i8 = i7 + 2;
                            if (i8 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i7) == '\'') {
                                if (sb.charAt(i7 - 1) != ' ') {
                                    int i9 = i7 + 1;
                                    z5 = true;
                                    if ((sb.charAt(i9) == 's' || sb.charAt(i9) == 'S') && (i8 == sb.length() || sb.charAt(i8) == ' ')) {
                                        sb.insert(i7, ' ');
                                        i7 = i8;
                                        z6 = z5;
                                    }
                                } else {
                                    z5 = true;
                                }
                                sb.setCharAt(i7, ' ');
                                z6 = z5;
                            }
                            i7++;
                        }
                        z3 = true;
                        String sb2 = z6 ? sb.toString() : null;
                        if (sb2 != null) {
                            str = sb2;
                        }
                    } else {
                        z3 = true;
                    }
                    String[] I5 = AbstractC1668us.I(str, z3);
                    int length = I5.length;
                    int i10 = this.f12752l;
                    if (length >= i10) {
                        int i11 = 0;
                        while (true) {
                            int length2 = I5.length;
                            i = this.f12751k;
                            if (i11 >= length2) {
                                break;
                            }
                            String str2 = "";
                            for (int i12 = 0; i12 < i10; i12++) {
                                int i13 = i11 + i12;
                                if (i13 >= I5.length) {
                                    break;
                                }
                                if (i12 > 0) {
                                    str2 = str2.concat(" ");
                                }
                                str2 = str2.concat(String.valueOf(I5[i13]));
                            }
                            hashSet.add(str2);
                            if (hashSet.size() >= i) {
                                break loop0;
                            }
                            i11++;
                        }
                        if (hashSet.size() >= i) {
                            break loop0;
                        }
                    }
                }
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(((Y5) this.f12753m).p1((String) it.next()));
            } catch (IOException e3) {
                U2.j.g("Error while writing hash to byteStream", e3);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e5) {
            U2.j.g("HashManager: Unable to convert to Base64.", e5);
        }
        try {
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toString();
        } catch (IOException e6) {
            U2.j.g("HashManager: Unable to convert to Base64.", e6);
            return "";
        }
    }

    public void c(OD od, List list) {
        int i;
        int i5;
        ByteBuffer byteBuffer;
        int i6;
        ByteBuffer byteBuffer2 = od.f10938e;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - od.f10938e.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.f12751k == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = od.f10938e;
        int position = byteBuffer3.position();
        int limit = byteBuffer3.limit();
        int i7 = limit - position;
        int i8 = (i7 + 255) / 255;
        int i9 = i8 + 27 + i7;
        if (this.f12751k == 2) {
            i = bArr != null ? bArr.length + 28 : 47;
            i9 += i + 44;
        } else {
            i = 0;
        }
        if (((ByteBuffer) this.f12753m).capacity() < i9) {
            this.f12753m = ByteBuffer.allocate(i9).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            ((ByteBuffer) this.f12753m).clear();
        }
        ByteBuffer byteBuffer4 = (ByteBuffer) this.f12753m;
        if (this.f12751k == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                i6 = 22;
                f(byteBuffer, 0L, 0, 1, true);
                int length = bArr.length;
                i5 = position;
                long j5 = length;
                AbstractC1400ot.d0((j5 >> 8) == 0, "out of range: %s", j5);
                byteBuffer.put((byte) j5);
                byteBuffer.put(bArr);
                int i10 = length + 28;
                byteBuffer.putInt(22, AbstractC1260lo.k(byteBuffer.arrayOffset(), i10, 0, byteBuffer.array()));
                byteBuffer.position(i10);
            } else {
                i5 = position;
                byteBuffer = byteBuffer4;
                i6 = 22;
                byteBuffer.put(f12749o);
            }
            byteBuffer.put(f12750p);
        } else {
            i5 = position;
            byteBuffer = byteBuffer4;
            i6 = 22;
        }
        int b02 = this.f12752l + ((int) ((AbstractC1803xs.b0(byteBuffer3.get(0), byteBuffer3.limit() > 1 ? byteBuffer3.get(1) : (byte) 0) * 48000) / 1000000));
        this.f12752l = b02;
        int i11 = i6;
        ByteBuffer byteBuffer5 = byteBuffer;
        f(byteBuffer5, b02, this.f12751k, i8, false);
        for (int i12 = 0; i12 < i8; i12++) {
            if (i7 >= 255) {
                byteBuffer5.put((byte) -1);
                i7 -= 255;
            } else {
                byteBuffer5.put((byte) i7);
                i7 = 0;
            }
        }
        for (int i13 = i5; i13 < limit; i13++) {
            byteBuffer5.put(byteBuffer3.get(i13));
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.f12751k == 2) {
            byteBuffer5.putInt(i + 66, AbstractC1260lo.k(byteBuffer5.arrayOffset() + i + 44, byteBuffer5.limit() - byteBuffer5.position(), 0, byteBuffer5.array()));
        } else {
            byteBuffer5.putInt(i11, AbstractC1260lo.k(byteBuffer5.arrayOffset(), byteBuffer5.limit() - byteBuffer5.position(), 0, byteBuffer5.array()));
        }
        this.f12751k++;
        this.f12753m = byteBuffer5;
        od.d();
        od.e(((ByteBuffer) this.f12753m).remaining());
        od.f10938e.put((ByteBuffer) this.f12753m);
        od.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1229l1
    public int d() {
        return this.f12752l;
    }

    public long g(B b3, boolean z3, boolean z5, int i) {
        int i5;
        int i6 = this.f12751k;
        byte[] bArr = (byte[]) this.f12753m;
        if (i6 == 0) {
            if (!b3.F(bArr, 0, 1, z3)) {
                return -1L;
            }
            int i7 = bArr[0] & 255;
            int i8 = 0;
            while (true) {
                if (i8 >= 8) {
                    i5 = -1;
                    break;
                }
                i5 = i8 + 1;
                if ((f12748n[i8] & i7) != 0) {
                    break;
                }
                i8 = i5;
            }
            this.f12752l = i5;
            if (i5 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f12751k = 1;
        }
        int i9 = this.f12752l;
        if (i9 > i) {
            this.f12751k = 0;
            return -2L;
        }
        if (i9 != 1) {
            b3.F(bArr, 1, i9 - 1, false);
        }
        this.f12751k = 0;
        return e(this.f12752l, z5, bArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1229l1
    public int i() {
        int i = this.f12751k;
        return i == -1 ? ((C1617tm) this.f12753m).y() : i;
    }

    @Override // com.google.android.gms.internal.ads.Xu
    /* renamed from: a, reason: collision with other method in class */
    public InterfaceC1402ov mo19a() {
        return new Dy(null, this.f12751k, this.f12752l, false, (Er) this.f12753m);
    }
}
