package F;

import android.util.Log;
import android.view.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import o.AbstractC0071c;

/* loaded from: classes.dex */
public final class D implements H {

    /* renamed from: b, reason: collision with root package name */
    public final P.f f34b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f35c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f36d;

    /* renamed from: e, reason: collision with root package name */
    public final E f37e;

    public D(P.f fVar) {
        HashMap hashMap = new HashMap();
        this.f36d = hashMap;
        this.f37e = new E();
        this.f34b = fVar;
        J j2 = N.f50a;
        M m2 = new M();
        m2.f49a = false;
        M m3 = new M[]{m2}[0];
        m3.getClass();
        hashMap.put(4294967556L, m3);
    }

    public final void a(A a2, final F f2) {
        long j2;
        long j3;
        byte[] bArr = null;
        P.e eVar = f2 == null ? null : new P.e() { // from class: F.B
            @Override // P.e
            public final void a(ByteBuffer byteBuffer) {
                Boolean bool = Boolean.FALSE;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    if (byteBuffer.capacity() != 0) {
                        bool = Boolean.valueOf(byteBuffer.get() != 0);
                    }
                } else {
                    Log.w("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
                }
                F.this.a(bool.booleanValue());
            }
        };
        try {
            String str = a2.f27g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            int length = bArr == null ? 0 : bArr.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(a2.f21a);
            int i2 = a2.f22b;
            if (i2 == 1) {
                j2 = 0;
            } else if (i2 == 2) {
                j2 = 1;
            } else {
                if (i2 != 3) {
                    throw null;
                }
                j2 = 2;
            }
            allocateDirect.putLong(j2);
            allocateDirect.putLong(a2.f23c);
            allocateDirect.putLong(a2.f24d);
            allocateDirect.putLong(a2.f25e ? 1L : 0L);
            int i3 = a2.f26f;
            if (i3 == 1) {
                j3 = 0;
            } else if (i3 == 2) {
                j3 = 1;
            } else if (i3 == 3) {
                j3 = 2;
            } else if (i3 == 4) {
                j3 = 3;
            } else {
                if (i3 != 5) {
                    throw null;
                }
                j3 = 4;
            }
            allocateDirect.putLong(j3);
            if (bArr != null) {
                allocateDirect.put(bArr);
            }
            this.f34b.b("flutter/keydata", allocateDirect, eVar);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0304  */
    @Override // F.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(final KeyEvent keyEvent, F f2) {
        Long l2;
        boolean z2;
        Long l3;
        String str;
        int i2;
        M m2;
        int i3;
        Boolean[] boolArr;
        int i4;
        int i5;
        HashMap hashMap;
        K[] kArr;
        boolean[] zArr;
        final long j2;
        int i6;
        int i7;
        D d2 = this;
        if (keyEvent.getScanCode() != 0 || keyEvent.getKeyCode() != 0) {
            long scanCode = keyEvent.getScanCode();
            if (scanCode == 0) {
                l2 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            } else {
                l2 = (Long) N.f50a.get(Long.valueOf(scanCode));
                if (l2 == null) {
                    l2 = Long.valueOf((keyEvent.getScanCode() & 4294967295L) | 73014444032L);
                }
            }
            Long l4 = l2;
            Long l5 = (Long) N.f51b.get(Long.valueOf(keyEvent.getKeyCode()));
            if (l5 == null) {
                l5 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            }
            Long l6 = l5;
            ArrayList arrayList = new ArrayList();
            L[] lArr = N.f52c;
            int length = lArr.length;
            int i8 = 0;
            while (true) {
                int i9 = 2;
                HashMap hashMap2 = d2.f35c;
                if (i8 >= length) {
                    Long l7 = l6;
                    HashMap hashMap3 = d2.f36d;
                    for (M m3 : hashMap3.values()) {
                        int metaState = keyEvent.getMetaState();
                        m3.getClass();
                        boolean z3 = (metaState & 1048576) != 0;
                        if (4294967556L != l7.longValue() && m3.f49a != z3) {
                            boolean containsKey = hashMap2.containsKey(458809L);
                            boolean z4 = !containsKey;
                            if (!containsKey) {
                                m3.f49a = !m3.f49a;
                            }
                            d2.c(z4, 4294967556L, 458809L, keyEvent.getEventTime());
                            if (containsKey) {
                                m3.f49a = !m3.f49a;
                            }
                            c(containsKey, 4294967556L, 458809L, keyEvent.getEventTime());
                        }
                        d2 = this;
                    }
                    int action = keyEvent.getAction();
                    if (action == 0) {
                        z2 = true;
                    } else if (action != 1) {
                        d2 = this;
                    } else {
                        z2 = false;
                    }
                    Long l8 = (Long) hashMap2.get(l4);
                    if (z2) {
                        if (l8 == null) {
                            i3 = 1;
                            d2 = this;
                        } else if (keyEvent.getRepeatCount() > 0) {
                            d2 = this;
                            i3 = 3;
                        } else {
                            d2 = this;
                            l3 = l4;
                            d2.c(false, l8, l3, keyEvent.getEventTime());
                            i3 = 1;
                            char charValue = d2.f37e.a(keyEvent.getUnicodeChar()).charValue();
                            i2 = i3;
                            str = charValue == 0 ? "" + charValue : null;
                        }
                        l3 = l4;
                        char charValue2 = d2.f37e.a(keyEvent.getUnicodeChar()).charValue();
                        if (charValue2 == 0) {
                        }
                        i2 = i3;
                        str = charValue2 == 0 ? "" + charValue2 : null;
                    } else {
                        d2 = this;
                        l3 = l4;
                        if (l8 != null) {
                            str = null;
                            i2 = 2;
                        }
                    }
                    if (i2 != 3) {
                        d2.d(l3, z2 ? l7 : null);
                    }
                    if (i2 == 1 && (m2 = (M) hashMap3.get(l7)) != null) {
                        m2.f49a = !m2.f49a;
                    }
                    A a2 = new A();
                    int source = keyEvent.getSource();
                    if (source == 513) {
                        a2.f26f = 2;
                    } else if (source == 1025) {
                        a2.f26f = 3;
                    } else if (source == 16777232) {
                        a2.f26f = 4;
                    } else if (source != 33554433) {
                        a2.f26f = 1;
                    } else {
                        a2.f26f = 5;
                    }
                    a2.f21a = keyEvent.getEventTime();
                    a2.f22b = i2;
                    a2.f24d = l7.longValue();
                    a2.f23c = l3.longValue();
                    a2.f27g = str;
                    a2.f25e = false;
                    d2.a(a2, f2);
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((Runnable) obj).run();
                    }
                    return;
                }
                L l9 = lArr[i8];
                boolean z5 = (l9.f47a & keyEvent.getMetaState()) != 0;
                long longValue = l6.longValue();
                long longValue2 = l4.longValue();
                K[] kArr2 = l9.f48b;
                boolean[] zArr2 = new boolean[2];
                Boolean[] boolArr2 = new Boolean[2];
                int i11 = 0;
                boolean z6 = false;
                while (i11 < i9) {
                    final K k2 = kArr2[i11];
                    Long l10 = l6;
                    boolean containsKey2 = hashMap2.containsKey(Long.valueOf(k2.f45a));
                    zArr2[i11] = containsKey2;
                    int i12 = i8;
                    if (k2.f46b == longValue) {
                        boolean z7 = keyEvent.getRepeatCount() > 0;
                        int action2 = keyEvent.getAction();
                        if (action2 != 0) {
                            i6 = 1;
                            if (action2 != 1) {
                                throw new AssertionError("Unexpected event type");
                            }
                            i7 = 2;
                        } else {
                            i6 = 1;
                            i7 = z7 ? 3 : 1;
                        }
                        int a3 = AbstractC0071c.a(i7);
                        if (a3 == 0) {
                            hashMap = hashMap2;
                            boolArr = boolArr2;
                            i4 = i12;
                            i5 = 2;
                            long j3 = longValue2;
                            kArr = kArr2;
                            zArr = zArr2;
                            j2 = j3;
                            boolArr[i11] = Boolean.FALSE;
                            if (!z5) {
                                final int i13 = 0;
                                arrayList.add(new Runnable(this) { // from class: F.C

                                    /* renamed from: c, reason: collision with root package name */
                                    public final /* synthetic */ D f30c;

                                    {
                                        this.f30c = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                D d3 = this.f30c;
                                                d3.getClass();
                                                d3.c(false, Long.valueOf(k2.f46b), Long.valueOf(j2), keyEvent.getEventTime());
                                                break;
                                            default:
                                                D d4 = this.f30c;
                                                d4.getClass();
                                                d4.c(false, Long.valueOf(k2.f46b), Long.valueOf(j2), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                        } else if (a3 == i6) {
                            hashMap = hashMap2;
                            boolArr = boolArr2;
                            i4 = i12;
                            i5 = 2;
                            long j4 = longValue2;
                            kArr = kArr2;
                            zArr = zArr2;
                            j2 = j4;
                            boolArr[i11] = Boolean.valueOf(zArr[i11]);
                        } else if (a3 != 2) {
                            hashMap = hashMap2;
                            boolArr = boolArr2;
                            i4 = i12;
                            i5 = 2;
                            long j5 = longValue2;
                            kArr = kArr2;
                            zArr = zArr2;
                            j2 = j5;
                        } else {
                            if (z5) {
                                hashMap = hashMap2;
                                boolArr = boolArr2;
                                i4 = i12;
                                i5 = 2;
                                long j6 = longValue2;
                                kArr = kArr2;
                                zArr = zArr2;
                                j2 = j6;
                            } else {
                                Boolean[] boolArr3 = boolArr2;
                                final int i14 = 1;
                                boolArr = boolArr3;
                                i4 = i12;
                                i5 = 2;
                                hashMap = hashMap2;
                                long j7 = longValue2;
                                kArr = kArr2;
                                zArr = zArr2;
                                j2 = j7;
                                arrayList.add(new Runnable(this) { // from class: F.C

                                    /* renamed from: c, reason: collision with root package name */
                                    public final /* synthetic */ D f30c;

                                    {
                                        this.f30c = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                D d3 = this.f30c;
                                                d3.getClass();
                                                d3.c(false, Long.valueOf(k2.f46b), Long.valueOf(j2), keyEvent.getEventTime());
                                                break;
                                            default:
                                                D d4 = this.f30c;
                                                d4.getClass();
                                                d4.c(false, Long.valueOf(k2.f46b), Long.valueOf(j2), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                            boolArr[i11] = Boolean.valueOf(zArr[i11]);
                        }
                        z6 = true;
                    } else {
                        boolArr = boolArr2;
                        i4 = i12;
                        i5 = 2;
                        hashMap = hashMap2;
                        long j8 = longValue2;
                        kArr = kArr2;
                        zArr = zArr2;
                        j2 = j8;
                        z6 = z6 || containsKey2;
                    }
                    i11++;
                    i9 = i5;
                    i8 = i4;
                    zArr2 = zArr;
                    boolArr2 = boolArr;
                    l6 = l10;
                    long j9 = j2;
                    hashMap2 = hashMap;
                    kArr2 = kArr;
                    longValue2 = j9;
                }
                int i15 = i8;
                K[] kArr3 = kArr2;
                boolean[] zArr3 = zArr2;
                Boolean[] boolArr4 = boolArr2;
                Long l11 = l6;
                int i16 = i9;
                boolean z8 = keyEvent.getDeviceId() == -1;
                if (z5) {
                    for (int i17 = 0; i17 < i16; i17++) {
                        if (boolArr4[i17] == null) {
                            if (z6 || z8) {
                                boolArr4[i17] = Boolean.valueOf(zArr3[i17]);
                            } else {
                                boolArr4[i17] = Boolean.TRUE;
                                z6 = true;
                            }
                        }
                    }
                    if (!z6 && !z8) {
                        boolArr4[0] = Boolean.TRUE;
                    }
                } else {
                    for (int i18 = 0; i18 < i16; i18++) {
                        if (boolArr4[i18] == null) {
                            boolArr4[i18] = Boolean.FALSE;
                        }
                    }
                }
                for (int i19 = 0; i19 < i16; i19++) {
                    if (zArr3[i19] != boolArr4[i19].booleanValue()) {
                        K k3 = kArr3[i19];
                        c(boolArr4[i19].booleanValue(), Long.valueOf(k3.f46b), Long.valueOf(k3.f45a), keyEvent.getEventTime());
                    }
                }
                d2 = this;
                i8 = i15 + 1;
                l6 = l11;
            }
        }
        d2.c(true, 0L, 0L, 0L);
        f2.a(true);
    }

    public final void c(boolean z2, Long l2, Long l3, long j2) {
        A a2 = new A();
        a2.f21a = j2;
        a2.f22b = z2 ? 1 : 2;
        a2.f24d = l2.longValue();
        a2.f23c = l3.longValue();
        a2.f27g = null;
        a2.f25e = true;
        a2.f26f = 1;
        if (l3.longValue() != 0 && l2.longValue() != 0) {
            if (!z2) {
                l2 = null;
            }
            d(l3, l2);
        }
        a(a2, null);
    }

    public final void d(Long l2, Long l3) {
        HashMap hashMap = this.f35c;
        if (l3 != null) {
            if (((Long) hashMap.put(l2, l3)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) hashMap.remove(l2)) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
