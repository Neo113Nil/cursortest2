package s0;

import Q.E;
import android.util.Log;
import android.view.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p.AbstractC0819i;

/* loaded from: classes.dex */
public final class t implements u {

    /* renamed from: a, reason: collision with root package name */
    public final D0.f f6590a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6591b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f6592c;

    /* renamed from: d, reason: collision with root package name */
    public final h1.i f6593d;

    public t(D0.f fVar) {
        HashMap hashMap = new HashMap();
        this.f6592c = hashMap;
        this.f6593d = new h1.i();
        this.f6590a = fVar;
        F0.a aVar = x.f6597a;
        w wVar = new w();
        wVar.f6596a = false;
        w wVar2 = new w[]{wVar}[0];
        wVar2.getClass();
        hashMap.put(4294967556L, wVar2);
    }

    public final void a(q qVar, final E e2) {
        long j2;
        long j3;
        byte[] bArr = null;
        D0.e eVar = e2 == null ? null : new D0.e() { // from class: s0.r
            @Override // D0.e
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
                E.this.a(bool.booleanValue());
            }
        };
        try {
            String str = qVar.f6583g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            int length = bArr == null ? 0 : bArr.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(qVar.f6577a);
            int i2 = qVar.f6578b;
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
            allocateDirect.putLong(qVar.f6579c);
            allocateDirect.putLong(qVar.f6580d);
            allocateDirect.putLong(qVar.f6581e ? 1L : 0L);
            int i3 = qVar.f6582f;
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
            this.f6590a.g("flutter/keydata", allocateDirect, eVar);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    public final void b(boolean z2, Long l2, Long l3, long j2) {
        q qVar = new q();
        qVar.f6577a = j2;
        qVar.f6578b = z2 ? 1 : 2;
        qVar.f6580d = l2.longValue();
        qVar.f6579c = l3.longValue();
        qVar.f6583g = null;
        qVar.f6581e = true;
        qVar.f6582f = 1;
        if (l3.longValue() != 0 && l2.longValue() != 0) {
            if (!z2) {
                l2 = null;
            }
            c(l3, l2);
        }
        a(qVar, null);
    }

    public final void c(Long l2, Long l3) {
        HashMap hashMap = this.f6591b;
        if (l3 != null) {
            if (((Long) hashMap.put(l2, l3)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) hashMap.remove(l2)) == null) {
            throw new AssertionError("The key was empty");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02fc  */
    @Override // s0.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(final KeyEvent keyEvent, E e2) {
        Long l2;
        boolean z2;
        int i2;
        int i3;
        String str;
        w wVar;
        long j2;
        HashMap hashMap;
        Boolean[] boolArr;
        HashMap hashMap2;
        int i4;
        P.B[] bArr;
        boolean[] zArr;
        int i5;
        int i6;
        int i7;
        int i8;
        if (keyEvent.getScanCode() == 0 && keyEvent.getKeyCode() == 0) {
            j2 = 0;
        } else {
            long scanCode = keyEvent.getScanCode();
            if (scanCode == 0) {
                l2 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            } else {
                l2 = (Long) x.f6597a.get(Long.valueOf(scanCode));
                if (l2 == null) {
                    l2 = Long.valueOf((keyEvent.getScanCode() & 4294967295L) | 73014444032L);
                }
            }
            Long l3 = l2;
            Long l4 = (Long) x.f6598b.get(Long.valueOf(keyEvent.getKeyCode()));
            if (l4 == null) {
                l4 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            }
            Long l5 = l4;
            ArrayList arrayList = new ArrayList();
            P.B[] bArr2 = x.f6599c;
            int length = bArr2.length;
            int i9 = 0;
            while (true) {
                HashMap hashMap3 = this.f6591b;
                int i10 = 2;
                if (i9 >= length) {
                    HashMap hashMap4 = hashMap3;
                    boolean z3 = false;
                    HashMap hashMap5 = this.f6592c;
                    for (w wVar2 : hashMap5.values()) {
                        int metaState = keyEvent.getMetaState();
                        wVar2.getClass();
                        boolean z4 = (metaState & 1048576) != 0 ? true : z3;
                        if (4294967556L == l5.longValue() || wVar2.f6596a == z4) {
                            hashMap = hashMap4;
                        } else {
                            HashMap hashMap6 = hashMap4;
                            boolean containsKey = hashMap6.containsKey(458809L);
                            boolean z5 = !containsKey;
                            if (!containsKey) {
                                wVar2.f6596a = !wVar2.f6596a;
                            }
                            hashMap = hashMap6;
                            b(z5, 4294967556L, 458809L, keyEvent.getEventTime());
                            if (containsKey) {
                                wVar2.f6596a = !wVar2.f6596a;
                            }
                            b(containsKey, 4294967556L, 458809L, keyEvent.getEventTime());
                        }
                        hashMap4 = hashMap;
                        z3 = false;
                    }
                    HashMap hashMap7 = hashMap4;
                    int action = keyEvent.getAction();
                    if (action != 0) {
                        z2 = action != 1;
                        j2 = 0;
                    }
                    Long l6 = (Long) hashMap7.get(l3);
                    if (z2) {
                        if (l6 != null) {
                            if (keyEvent.getRepeatCount() > 0) {
                                i3 = 3;
                                char charValue = this.f6593d.a(keyEvent.getUnicodeChar()).charValue();
                                str = charValue == 0 ? "" + charValue : null;
                                i2 = 1;
                            } else {
                                b(false, l6, l3, keyEvent.getEventTime());
                            }
                        }
                        i3 = 1;
                        char charValue2 = this.f6593d.a(keyEvent.getUnicodeChar()).charValue();
                        if (charValue2 == 0) {
                        }
                        str = charValue2 == 0 ? "" + charValue2 : null;
                        i2 = 1;
                    } else {
                        if (l6 != null) {
                            i2 = 1;
                            i3 = 2;
                            str = null;
                        }
                        j2 = 0;
                    }
                    if (i3 != 3) {
                        c(l3, z2 ? l5 : null);
                    }
                    if (i3 == i2 && (wVar = (w) hashMap5.get(l5)) != null) {
                        wVar.f6596a = (wVar.f6596a ? 1 : 0) ^ i2;
                    }
                    q qVar = new q();
                    int source = keyEvent.getSource();
                    if (source == 513) {
                        qVar.f6582f = 2;
                    } else if (source == 1025) {
                        qVar.f6582f = 3;
                    } else if (source == 16777232) {
                        qVar.f6582f = 4;
                    } else if (source != 33554433) {
                        qVar.f6582f = 1;
                    } else {
                        qVar.f6582f = 5;
                    }
                    qVar.f6577a = keyEvent.getEventTime();
                    qVar.f6578b = i3;
                    qVar.f6580d = l5.longValue();
                    qVar.f6579c = l3.longValue();
                    qVar.f6583g = str;
                    qVar.f6581e = false;
                    a(qVar, e2);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                P.B b2 = bArr2[i9];
                boolean z6 = (keyEvent.getMetaState() & b2.f286a) != 0;
                long longValue = l5.longValue();
                final long longValue2 = l3.longValue();
                v[] vVarArr = (v[]) b2.f287b;
                boolean[] zArr2 = new boolean[2];
                Boolean[] boolArr2 = new Boolean[2];
                int i11 = 0;
                boolean z7 = false;
                while (i11 < i10) {
                    final v vVar = vVarArr[i11];
                    boolean[] zArr3 = zArr2;
                    boolean containsKey2 = hashMap3.containsKey(Long.valueOf(vVar.f6594a));
                    zArr3[i11] = containsKey2;
                    int i12 = i11;
                    if (vVar.f6595b == longValue) {
                        boolean z8 = keyEvent.getRepeatCount() > 0;
                        int action2 = keyEvent.getAction();
                        if (action2 == 0) {
                            i7 = z8 ? 3 : 1;
                        } else {
                            if (action2 != 1) {
                                throw new AssertionError("Unexpected event type");
                            }
                            i7 = 2;
                        }
                        int c2 = AbstractC0819i.c(i7);
                        if (c2 == 0) {
                            boolArr = boolArr2;
                            hashMap2 = hashMap3;
                            i4 = length;
                            bArr = bArr2;
                            zArr = zArr3;
                            i5 = 2;
                            i6 = i9;
                            boolArr[i12] = Boolean.FALSE;
                            if (!z6) {
                                final int i13 = 0;
                                arrayList.add(new Runnable(this) { // from class: s0.s

                                    /* renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ t f6586b;

                                    {
                                        this.f6586b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                t tVar = this.f6586b;
                                                tVar.getClass();
                                                tVar.b(false, Long.valueOf(vVar.f6595b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                            default:
                                                t tVar2 = this.f6586b;
                                                tVar2.getClass();
                                                tVar2.b(false, Long.valueOf(vVar.f6595b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                        } else if (c2 == 1) {
                            boolArr = boolArr2;
                            hashMap2 = hashMap3;
                            i4 = length;
                            bArr = bArr2;
                            zArr = zArr3;
                            i5 = 2;
                            i6 = i9;
                            boolArr[i12] = Boolean.valueOf(zArr[i12]);
                        } else if (c2 != 2) {
                            boolArr = boolArr2;
                            i5 = 2;
                            hashMap2 = hashMap3;
                            i4 = length;
                            bArr = bArr2;
                            zArr = zArr3;
                            i6 = i9;
                        } else {
                            if (z6) {
                                boolArr = boolArr2;
                                i8 = 2;
                                hashMap2 = hashMap3;
                                i4 = length;
                                bArr = bArr2;
                                zArr = zArr3;
                                i6 = i9;
                            } else {
                                final int i14 = 1;
                                boolArr = boolArr2;
                                i8 = 2;
                                zArr = zArr3;
                                i6 = i9;
                                hashMap2 = hashMap3;
                                bArr = bArr2;
                                i4 = length;
                                arrayList.add(new Runnable(this) { // from class: s0.s

                                    /* renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ t f6586b;

                                    {
                                        this.f6586b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                t tVar = this.f6586b;
                                                tVar.getClass();
                                                tVar.b(false, Long.valueOf(vVar.f6595b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                            default:
                                                t tVar2 = this.f6586b;
                                                tVar2.getClass();
                                                tVar2.b(false, Long.valueOf(vVar.f6595b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                            boolArr[i12] = Boolean.valueOf(zArr[i12]);
                            i5 = i8;
                        }
                        z7 = true;
                    } else {
                        boolArr = boolArr2;
                        hashMap2 = hashMap3;
                        i4 = length;
                        bArr = bArr2;
                        zArr = zArr3;
                        i5 = 2;
                        i6 = i9;
                        z7 = z7 || containsKey2;
                    }
                    i11 = i12 + 1;
                    i10 = i5;
                    zArr2 = zArr;
                    length = i4;
                    boolArr2 = boolArr;
                    i9 = i6;
                    bArr2 = bArr;
                    hashMap3 = hashMap2;
                }
                Boolean[] boolArr3 = boolArr2;
                int i15 = i10;
                boolean[] zArr4 = zArr2;
                int i16 = i9;
                int i17 = length;
                P.B[] bArr3 = bArr2;
                boolean z9 = keyEvent.getDeviceId() == -1;
                if (z6) {
                    for (int i18 = 0; i18 < i15; i18++) {
                        if (boolArr3[i18] == null) {
                            if (z7 || z9) {
                                boolArr3[i18] = Boolean.valueOf(zArr4[i18]);
                            } else {
                                boolArr3[i18] = Boolean.TRUE;
                                z7 = true;
                            }
                        }
                    }
                    if (!z7 && !z9) {
                        boolArr3[0] = Boolean.TRUE;
                    }
                } else {
                    for (int i19 = 0; i19 < i15; i19++) {
                        if (boolArr3[i19] == null) {
                            boolArr3[i19] = Boolean.FALSE;
                        }
                    }
                }
                for (int i20 = 0; i20 < i15; i20++) {
                    if (zArr4[i20] != boolArr3[i20].booleanValue()) {
                        v vVar2 = vVarArr[i20];
                        b(boolArr3[i20].booleanValue(), Long.valueOf(vVar2.f6595b), Long.valueOf(vVar2.f6594a), keyEvent.getEventTime());
                    }
                }
                i9 = i16 + 1;
                length = i17;
                bArr2 = bArr3;
            }
        }
        b(true, Long.valueOf(j2), Long.valueOf(j2), 0L);
        e2.a(true);
    }
}
