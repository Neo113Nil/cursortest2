package I1;

import android.util.Log;
import android.view.KeyEvent;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class w implements z {

    /* renamed from: a, reason: collision with root package name */
    public final T1.f f678a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f679b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f680c;

    /* renamed from: d, reason: collision with root package name */
    public final D2.i f681d;

    public w(T1.f fVar) {
        HashMap hashMap = new HashMap();
        this.f680c = hashMap;
        this.f681d = new D2.i();
        this.f678a = fVar;
        B b3 = E.f576a;
        D d3 = new D();
        d3.f575a = false;
        D d4 = new D[]{d3}[0];
        d4.getClass();
        hashMap.put(4294967556L, d4);
    }

    public final void a(t tVar, final x xVar) {
        long j3;
        long j4;
        byte[] bArr = null;
        T1.e eVar = xVar == null ? null : new T1.e() { // from class: I1.u
            @Override // T1.e
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
                x.this.a(bool.booleanValue());
            }
        };
        try {
            String str = tVar.f671g;
            if (str != null) {
                bArr = str.getBytes(CharEncoding.UTF_8);
            }
            int length = bArr == null ? 0 : bArr.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(tVar.f666a);
            int i3 = tVar.f667b;
            if (i3 == 1) {
                j3 = 0;
            } else if (i3 == 2) {
                j3 = 1;
            } else {
                if (i3 != 3) {
                    throw null;
                }
                j3 = 2;
            }
            allocateDirect.putLong(j3);
            allocateDirect.putLong(tVar.f668c);
            allocateDirect.putLong(tVar.f669d);
            allocateDirect.putLong(tVar.f670e ? 1L : 0L);
            int i4 = tVar.f;
            if (i4 == 1) {
                j4 = 0;
            } else if (i4 == 2) {
                j4 = 1;
            } else if (i4 == 3) {
                j4 = 2;
            } else if (i4 == 4) {
                j4 = 3;
            } else {
                if (i4 != 5) {
                    throw null;
                }
                j4 = 4;
            }
            allocateDirect.putLong(j4);
            if (bArr != null) {
                allocateDirect.put(bArr);
            }
            this.f678a.i("flutter/keydata", allocateDirect, eVar);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    public final void b(boolean z3, Long l3, Long l4, long j3) {
        t tVar = new t();
        tVar.f666a = j3;
        tVar.f667b = z3 ? 1 : 2;
        tVar.f669d = l3.longValue();
        tVar.f668c = l4.longValue();
        tVar.f671g = null;
        tVar.f670e = true;
        tVar.f = 1;
        if (l4.longValue() != 0 && l3.longValue() != 0) {
            if (!z3) {
                l3 = null;
            }
            c(l4, l3);
        }
        a(tVar, null);
    }

    public final void c(Long l3, Long l4) {
        HashMap hashMap = this.f679b;
        if (l4 != null) {
            if (((Long) hashMap.put(l3, l4)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) hashMap.remove(l3)) == null) {
            throw new AssertionError("The key was empty");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02fe  */
    @Override // I1.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(final KeyEvent keyEvent, x xVar) {
        Long l3;
        long j3;
        boolean z3;
        Long l4;
        String str;
        int i3;
        D d3;
        int i4;
        boolean[] zArr;
        long j4;
        int i5;
        Boolean[] boolArr;
        HashMap hashMap;
        boolean z4;
        int i6;
        final long j5;
        boolean z5;
        int i7;
        HashMap hashMap2;
        HashMap hashMap3;
        long j6;
        boolean z6;
        int i8;
        w wVar = this;
        long j7 = 0;
        if (keyEvent.getScanCode() == 0 && keyEvent.getKeyCode() == 0) {
            j3 = 0;
        } else {
            long scanCode = keyEvent.getScanCode();
            if (scanCode == 0) {
                l3 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            } else {
                l3 = (Long) E.f576a.get(Long.valueOf(scanCode));
                if (l3 == null) {
                    l3 = Long.valueOf((keyEvent.getScanCode() & 4294967295L) | 73014444032L);
                }
            }
            Long l5 = l3;
            Long l6 = (Long) E.f577b.get(Long.valueOf(keyEvent.getKeyCode()));
            if (l6 == null) {
                l6 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            }
            Long l7 = l6;
            ArrayList arrayList = new ArrayList();
            m0.E[] eArr = E.f578c;
            int length = eArr.length;
            int i9 = 0;
            while (true) {
                HashMap hashMap4 = wVar.f679b;
                int i10 = 2;
                if (i9 >= length) {
                    j3 = j7;
                    HashMap hashMap5 = wVar.f680c;
                    for (D d4 : hashMap5.values()) {
                        int metaState = keyEvent.getMetaState();
                        d4.getClass();
                        boolean z7 = (metaState & 1048576) != 0;
                        if (4294967556L != l7.longValue() && d4.f575a != z7) {
                            boolean containsKey = hashMap4.containsKey(458809L);
                            boolean z8 = !containsKey;
                            if (!containsKey) {
                                d4.f575a = !d4.f575a;
                            }
                            wVar.b(z8, 4294967556L, 458809L, keyEvent.getEventTime());
                            if (containsKey) {
                                d4.f575a = !d4.f575a;
                            }
                            b(containsKey, 4294967556L, 458809L, keyEvent.getEventTime());
                        }
                        wVar = this;
                    }
                    int action = keyEvent.getAction();
                    if (action == 0) {
                        z3 = true;
                    } else if (action != 1) {
                        wVar = this;
                    } else {
                        z3 = false;
                    }
                    Long l8 = (Long) hashMap4.get(l5);
                    if (z3) {
                        if (l8 == null) {
                            i4 = 1;
                            wVar = this;
                        } else if (keyEvent.getRepeatCount() > 0) {
                            wVar = this;
                            i4 = 3;
                        } else {
                            wVar = this;
                            l4 = l5;
                            wVar.b(false, l8, l4, keyEvent.getEventTime());
                            i4 = 1;
                            char charValue = wVar.f681d.a(keyEvent.getUnicodeChar()).charValue();
                            str = charValue == 0 ? "" + charValue : null;
                            i3 = i4;
                        }
                        l4 = l5;
                        char charValue2 = wVar.f681d.a(keyEvent.getUnicodeChar()).charValue();
                        if (charValue2 == 0) {
                        }
                        str = charValue2 == 0 ? "" + charValue2 : null;
                        i3 = i4;
                    } else {
                        wVar = this;
                        l4 = l5;
                        if (l8 != null) {
                            str = null;
                            i3 = 2;
                        }
                    }
                    if (i3 != 3) {
                        wVar.c(l4, z3 ? l7 : null);
                    }
                    if (i3 == 1 && (d3 = (D) hashMap5.get(l7)) != null) {
                        d3.f575a = !d3.f575a;
                    }
                    t tVar = new t();
                    int source = keyEvent.getSource();
                    if (source == 513) {
                        tVar.f = 2;
                    } else if (source == 1025) {
                        tVar.f = 3;
                    } else if (source == 16777232) {
                        tVar.f = 4;
                    } else if (source != 33554433) {
                        tVar.f = 1;
                    } else {
                        tVar.f = 5;
                    }
                    tVar.f666a = keyEvent.getEventTime();
                    tVar.f667b = i3;
                    tVar.f669d = l7.longValue();
                    tVar.f668c = l4.longValue();
                    tVar.f671g = str;
                    tVar.f670e = false;
                    wVar.a(tVar, xVar);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                m0.E e3 = eArr[i9];
                boolean z9 = (keyEvent.getMetaState() & e3.f9945a) != 0;
                long longValue = l7.longValue();
                long longValue2 = l5.longValue();
                C[] cArr = (C[]) e3.f9946b;
                boolean[] zArr2 = new boolean[2];
                Boolean[] boolArr2 = new Boolean[2];
                long j8 = j7;
                int i11 = 0;
                boolean z10 = false;
                while (i11 < i10) {
                    int i12 = i9;
                    final C c3 = cArr[i11];
                    boolean containsKey2 = hashMap4.containsKey(Long.valueOf(c3.f573a));
                    zArr2[i11] = containsKey2;
                    int i13 = i11;
                    if (c3.f574b == longValue) {
                        boolean z11 = keyEvent.getRepeatCount() > 0;
                        int action2 = keyEvent.getAction();
                        if (action2 == 0) {
                            i6 = z11 ? 3 : 1;
                        } else {
                            if (action2 != 1) {
                                throw new AssertionError("Unexpected event type");
                            }
                            i6 = 2;
                        }
                        int b3 = M.j.b(i6);
                        if (b3 != 0) {
                            if (b3 == 1) {
                                zArr = zArr2;
                                hashMap3 = hashMap4;
                                j6 = longValue2;
                                z6 = false;
                                i8 = 2;
                                boolArr = boolArr2;
                                boolArr[i13] = Boolean.valueOf(zArr[i13]);
                            } else if (b3 != 2) {
                                zArr = zArr2;
                                hashMap3 = hashMap4;
                                i8 = 2;
                                j6 = longValue2;
                                z6 = false;
                                boolArr = boolArr2;
                            } else {
                                if (z9) {
                                    zArr = zArr2;
                                    hashMap2 = hashMap4;
                                    i7 = 2;
                                    j5 = longValue2;
                                    z5 = false;
                                    boolArr = boolArr2;
                                } else {
                                    Boolean[] boolArr3 = boolArr2;
                                    final int i14 = 1;
                                    z5 = false;
                                    zArr = zArr2;
                                    hashMap2 = hashMap4;
                                    i7 = 2;
                                    long j9 = longValue2;
                                    boolArr = boolArr3;
                                    j5 = j9;
                                    arrayList.add(new Runnable(this) { // from class: I1.v

                                        /* renamed from: b, reason: collision with root package name */
                                        public final /* synthetic */ w f674b;

                                        {
                                            this.f674b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    w wVar2 = this.f674b;
                                                    wVar2.getClass();
                                                    wVar2.b(false, Long.valueOf(c3.f574b), Long.valueOf(j5), keyEvent.getEventTime());
                                                    break;
                                                default:
                                                    w wVar3 = this.f674b;
                                                    wVar3.getClass();
                                                    wVar3.b(false, Long.valueOf(c3.f574b), Long.valueOf(j5), keyEvent.getEventTime());
                                                    break;
                                            }
                                        }
                                    });
                                }
                                boolArr[i13] = Boolean.valueOf(zArr[i13]);
                            }
                            z4 = z10;
                            i5 = i8;
                            hashMap2 = hashMap3;
                            j4 = j6;
                            hashMap = hashMap2;
                        } else {
                            zArr = zArr2;
                            HashMap hashMap6 = hashMap4;
                            j5 = longValue2;
                            z5 = false;
                            i7 = 2;
                            boolArr = boolArr2;
                            boolArr[i13] = Boolean.FALSE;
                            hashMap2 = hashMap6;
                            if (!z9) {
                                final int i15 = 0;
                                i5 = 2;
                                j4 = j5;
                                arrayList.add(new Runnable(this) { // from class: I1.v

                                    /* renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ w f674b;

                                    {
                                        this.f674b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                w wVar2 = this.f674b;
                                                wVar2.getClass();
                                                wVar2.b(false, Long.valueOf(c3.f574b), Long.valueOf(j5), keyEvent.getEventTime());
                                                break;
                                            default:
                                                w wVar3 = this.f674b;
                                                wVar3.getClass();
                                                wVar3.b(false, Long.valueOf(c3.f574b), Long.valueOf(j5), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                                z4 = true;
                                hashMap = hashMap2;
                            }
                        }
                        j4 = j5;
                        i5 = i7;
                        z4 = true;
                        hashMap = hashMap2;
                    } else {
                        zArr = zArr2;
                        j4 = longValue2;
                        i5 = 2;
                        boolArr = boolArr2;
                        hashMap = hashMap4;
                        z4 = z10 || containsKey2;
                    }
                    z10 = z4;
                    i11 = i13 + 1;
                    hashMap4 = hashMap;
                    i10 = i5;
                    boolArr2 = boolArr;
                    i9 = i12;
                    longValue2 = j4;
                    zArr2 = zArr;
                }
                boolean[] zArr3 = zArr2;
                int i16 = i9;
                int i17 = i10;
                Boolean[] boolArr4 = boolArr2;
                boolean z12 = keyEvent.getDeviceId() == -1;
                if (z9) {
                    for (int i18 = 0; i18 < i17; i18++) {
                        if (boolArr4[i18] == null) {
                            if (z10 || z12) {
                                boolArr4[i18] = Boolean.valueOf(zArr3[i18]);
                            } else {
                                boolArr4[i18] = Boolean.TRUE;
                                z10 = true;
                            }
                        }
                    }
                    if (!z10 && !z12) {
                        boolArr4[0] = Boolean.TRUE;
                    }
                } else {
                    for (int i19 = 0; i19 < i17; i19++) {
                        if (boolArr4[i19] == null) {
                            boolArr4[i19] = Boolean.FALSE;
                        }
                    }
                }
                for (int i20 = 0; i20 < i17; i20++) {
                    if (zArr3[i20] != boolArr4[i20].booleanValue()) {
                        C c4 = cArr[i20];
                        b(boolArr4[i20].booleanValue(), Long.valueOf(c4.f574b), Long.valueOf(c4.f573a), keyEvent.getEventTime());
                    }
                }
                wVar = this;
                i9 = i16 + 1;
                j7 = j8;
            }
        }
        wVar.b(true, Long.valueOf(j3), Long.valueOf(j3), 0L);
        xVar.a(true);
    }
}
