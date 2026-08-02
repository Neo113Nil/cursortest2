package q5;

import android.util.Log;
import android.view.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class r implements s {

    /* renamed from: a, reason: collision with root package name */
    public final A5.f f15950a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f15951b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f15952c;

    /* renamed from: d, reason: collision with root package name */
    public final d1.n f15953d;

    public r(A5.f fVar) {
        HashMap hashMap = new HashMap();
        this.f15952c = hashMap;
        this.f15953d = new d1.n();
        this.f15950a = fVar;
        C5.a aVar = x.f15960a;
        w wVar = new w();
        wVar.f15959a = false;
        w wVar2 = new w[]{wVar}[0];
        wVar2.getClass();
        hashMap.put(4294967556L, wVar2);
    }

    public final void a(o oVar, final B3.g gVar) {
        long j;
        long j3;
        byte[] bArr = null;
        A5.e eVar = gVar == null ? null : new A5.e() { // from class: q5.p
            @Override // A5.e
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
                B3.g.this.g(bool.booleanValue());
            }
        };
        try {
            String str = oVar.f15943g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            int length = bArr == null ? 0 : bArr.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(oVar.f15937a);
            int i7 = oVar.f15938b;
            if (i7 == 1) {
                j = 0;
            } else if (i7 == 2) {
                j = 1;
            } else {
                if (i7 != 3) {
                    throw null;
                }
                j = 2;
            }
            allocateDirect.putLong(j);
            allocateDirect.putLong(oVar.f15939c);
            allocateDirect.putLong(oVar.f15940d);
            allocateDirect.putLong(oVar.f15941e ? 1L : 0L);
            int i8 = oVar.f15942f;
            if (i8 == 1) {
                j3 = 0;
            } else if (i8 == 2) {
                j3 = 1;
            } else if (i8 == 3) {
                j3 = 2;
            } else if (i8 == 4) {
                j3 = 3;
            } else {
                if (i8 != 5) {
                    throw null;
                }
                j3 = 4;
            }
            allocateDirect.putLong(j3);
            if (bArr != null) {
                allocateDirect.put(bArr);
            }
            this.f15950a.k("flutter/keydata", allocateDirect, eVar);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    public final void b(boolean z4, Long l7, Long l8, long j) {
        o oVar = new o();
        oVar.f15937a = j;
        oVar.f15938b = z4 ? 1 : 2;
        oVar.f15940d = l7.longValue();
        oVar.f15939c = l8.longValue();
        oVar.f15943g = null;
        oVar.f15941e = true;
        oVar.f15942f = 1;
        if (l8.longValue() != 0 && l7.longValue() != 0) {
            if (!z4) {
                l7 = null;
            }
            c(l8, l7);
        }
        a(oVar, null);
    }

    public final void c(Long l7, Long l8) {
        HashMap hashMap = this.f15951b;
        if (l8 != null) {
            if (((Long) hashMap.put(l7, l8)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) hashMap.remove(l7)) == null) {
            throw new AssertionError("The key was empty");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02ed  */
    @Override // q5.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(KeyEvent keyEvent, B3.g gVar) {
        Long l7;
        boolean z4;
        int i7;
        int i8;
        String str;
        w wVar;
        long j;
        HashMap hashMap;
        Boolean[] boolArr;
        HashMap hashMap2;
        int i9;
        B.v[] vVarArr;
        boolean[] zArr;
        int i10;
        int i11;
        int i12;
        int i13;
        if (keyEvent.getScanCode() == 0 && keyEvent.getKeyCode() == 0) {
            j = 0;
        } else {
            long scanCode = keyEvent.getScanCode();
            if (scanCode == 0) {
                l7 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            } else {
                l7 = (Long) x.f15960a.get(Long.valueOf(scanCode));
                if (l7 == null) {
                    l7 = Long.valueOf((keyEvent.getScanCode() & 4294967295L) | 73014444032L);
                }
            }
            Long l8 = l7;
            Long l9 = (Long) x.f15961b.get(Long.valueOf(keyEvent.getKeyCode()));
            if (l9 == null) {
                l9 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            }
            Long l10 = l9;
            ArrayList arrayList = new ArrayList();
            B.v[] vVarArr2 = x.f15962c;
            int length = vVarArr2.length;
            int i14 = 0;
            while (true) {
                HashMap hashMap3 = this.f15951b;
                int i15 = 2;
                if (i14 >= length) {
                    HashMap hashMap4 = hashMap3;
                    boolean z7 = false;
                    HashMap hashMap5 = this.f15952c;
                    for (w wVar2 : hashMap5.values()) {
                        int metaState = keyEvent.getMetaState();
                        wVar2.getClass();
                        boolean z8 = (metaState & 1048576) != 0 ? true : z7;
                        if (4294967556L == l10.longValue() || wVar2.f15959a == z8) {
                            hashMap = hashMap4;
                        } else {
                            HashMap hashMap6 = hashMap4;
                            boolean containsKey = hashMap6.containsKey(458809L);
                            boolean z9 = !containsKey;
                            if (!containsKey) {
                                wVar2.f15959a = !wVar2.f15959a;
                            }
                            hashMap = hashMap6;
                            b(z9, 4294967556L, 458809L, keyEvent.getEventTime());
                            if (containsKey) {
                                wVar2.f15959a = !wVar2.f15959a;
                            }
                            b(containsKey, 4294967556L, 458809L, keyEvent.getEventTime());
                        }
                        hashMap4 = hashMap;
                        z7 = false;
                    }
                    HashMap hashMap7 = hashMap4;
                    int action = keyEvent.getAction();
                    if (action != 0) {
                        z4 = action != 1;
                        j = 0;
                    }
                    Long l11 = (Long) hashMap7.get(l8);
                    if (z4) {
                        if (l11 != null) {
                            if (keyEvent.getRepeatCount() > 0) {
                                i8 = 3;
                                char charValue = this.f15953d.a(keyEvent.getUnicodeChar()).charValue();
                                str = charValue == 0 ? "" + charValue : null;
                                i7 = 1;
                            } else {
                                b(false, l11, l8, keyEvent.getEventTime());
                            }
                        }
                        i8 = 1;
                        char charValue2 = this.f15953d.a(keyEvent.getUnicodeChar()).charValue();
                        if (charValue2 == 0) {
                        }
                        str = charValue2 == 0 ? "" + charValue2 : null;
                        i7 = 1;
                    } else {
                        if (l11 != null) {
                            i7 = 1;
                            i8 = 2;
                            str = null;
                        }
                        j = 0;
                    }
                    if (i8 != 3) {
                        c(l8, z4 ? l10 : null);
                    }
                    if (i8 == i7 && (wVar = (w) hashMap5.get(l10)) != null) {
                        wVar.f15959a = (wVar.f15959a ? 1 : 0) ^ i7;
                    }
                    o oVar = new o();
                    int source = keyEvent.getSource();
                    if (source == 513) {
                        oVar.f15942f = 2;
                    } else if (source == 1025) {
                        oVar.f15942f = 3;
                    } else if (source == 16777232) {
                        oVar.f15942f = 4;
                    } else if (source != 33554433) {
                        oVar.f15942f = 1;
                    } else {
                        oVar.f15942f = 5;
                    }
                    oVar.f15937a = keyEvent.getEventTime();
                    oVar.f15938b = i8;
                    oVar.f15940d = l10.longValue();
                    oVar.f15939c = l8.longValue();
                    oVar.f15943g = str;
                    oVar.f15941e = false;
                    a(oVar, gVar);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                B.v vVar = vVarArr2[i14];
                boolean z10 = (keyEvent.getMetaState() & vVar.f965b) != 0;
                long longValue = l10.longValue();
                long longValue2 = l8.longValue();
                v[] vVarArr3 = (v[]) vVar.f966c;
                boolean[] zArr2 = new boolean[2];
                Boolean[] boolArr2 = new Boolean[2];
                int i16 = 0;
                boolean z11 = false;
                while (i16 < i15) {
                    v vVar2 = vVarArr3[i16];
                    boolean[] zArr3 = zArr2;
                    boolean containsKey2 = hashMap3.containsKey(Long.valueOf(vVar2.f15957a));
                    zArr3[i16] = containsKey2;
                    int i17 = i16;
                    if (vVar2.f15958b == longValue) {
                        boolean z12 = keyEvent.getRepeatCount() > 0;
                        int action2 = keyEvent.getAction();
                        if (action2 == 0) {
                            i12 = z12 ? 3 : 1;
                        } else {
                            if (action2 != 1) {
                                throw new AssertionError("Unexpected event type");
                            }
                            i12 = 2;
                        }
                        int e7 = t.e.e(i12);
                        if (e7 == 0) {
                            boolArr = boolArr2;
                            hashMap2 = hashMap3;
                            i9 = length;
                            vVarArr = vVarArr2;
                            zArr = zArr3;
                            i10 = 2;
                            i11 = i14;
                            boolArr[i17] = Boolean.FALSE;
                            if (!z10) {
                                arrayList.add(new q(this, vVar2, longValue2, keyEvent, 0));
                            }
                        } else if (e7 == 1) {
                            boolArr = boolArr2;
                            hashMap2 = hashMap3;
                            i9 = length;
                            vVarArr = vVarArr2;
                            zArr = zArr3;
                            i10 = 2;
                            i11 = i14;
                            boolArr[i17] = Boolean.valueOf(zArr[i17]);
                        } else if (e7 != 2) {
                            boolArr = boolArr2;
                            i10 = 2;
                            hashMap2 = hashMap3;
                            i9 = length;
                            vVarArr = vVarArr2;
                            zArr = zArr3;
                            i11 = i14;
                        } else {
                            if (z10) {
                                boolArr = boolArr2;
                                i13 = 2;
                                hashMap2 = hashMap3;
                                i9 = length;
                                vVarArr = vVarArr2;
                                zArr = zArr3;
                                i11 = i14;
                            } else {
                                boolArr = boolArr2;
                                i13 = 2;
                                zArr = zArr3;
                                i11 = i14;
                                hashMap2 = hashMap3;
                                vVarArr = vVarArr2;
                                i9 = length;
                                arrayList.add(new q(this, vVar2, longValue2, keyEvent, 1));
                            }
                            boolArr[i17] = Boolean.valueOf(zArr[i17]);
                            i10 = i13;
                        }
                        z11 = true;
                    } else {
                        boolArr = boolArr2;
                        hashMap2 = hashMap3;
                        i9 = length;
                        vVarArr = vVarArr2;
                        zArr = zArr3;
                        i10 = 2;
                        i11 = i14;
                        z11 = z11 || containsKey2;
                    }
                    i16 = i17 + 1;
                    i15 = i10;
                    zArr2 = zArr;
                    length = i9;
                    boolArr2 = boolArr;
                    i14 = i11;
                    vVarArr2 = vVarArr;
                    hashMap3 = hashMap2;
                }
                Boolean[] boolArr3 = boolArr2;
                int i18 = i15;
                boolean[] zArr4 = zArr2;
                int i19 = i14;
                int i20 = length;
                B.v[] vVarArr4 = vVarArr2;
                if (z10) {
                    for (int i21 = 0; i21 < i18; i21++) {
                        if (boolArr3[i21] == null) {
                            if (z11) {
                                boolArr3[i21] = Boolean.valueOf(zArr4[i21]);
                            } else {
                                boolArr3[i21] = Boolean.TRUE;
                                z11 = true;
                            }
                        }
                    }
                    if (!z11) {
                        boolArr3[0] = Boolean.TRUE;
                    }
                } else {
                    for (int i22 = 0; i22 < i18; i22++) {
                        if (boolArr3[i22] == null) {
                            boolArr3[i22] = Boolean.FALSE;
                        }
                    }
                }
                for (int i23 = 0; i23 < i18; i23++) {
                    if (zArr4[i23] != boolArr3[i23].booleanValue()) {
                        v vVar3 = vVarArr3[i23];
                        b(boolArr3[i23].booleanValue(), Long.valueOf(vVar3.f15958b), Long.valueOf(vVar3.f15957a), keyEvent.getEventTime());
                    }
                }
                i14 = i19 + 1;
                length = i20;
                vVarArr2 = vVarArr4;
            }
        }
        b(true, Long.valueOf(j), Long.valueOf(j), 0L);
        gVar.g(true);
    }
}
