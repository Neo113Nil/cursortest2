package p121q5;

import A5.e;
import A5.f;
import B.v;
import B3.g;
import C5.a;
import android.util.Log;
import android.view.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p023d1.n;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f15956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f15957b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f15958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f15959d;

    public r(f fVar) {
        HashMap map = new HashMap();
        this.f15958c = map;
        this.f15959d = new n();
        this.f15956a = fVar;
        a aVar = x.f15966a;
        w wVar = new w();
        wVar.f15965a = false;
        w wVar2 = new w[]{wVar}[0];
        wVar2.getClass();
        map.put(4294967556L, wVar2);
    }

    public final void a(o oVar, final g gVar) {
        long j;
        long j3;
        byte[] bytes = null;
        e eVar = gVar == null ? null : new e() { // from class: q5.p
            @Override // A5.e
            public final void a(ByteBuffer byteBuffer) {
                Boolean boolValueOf = Boolean.FALSE;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    if (byteBuffer.capacity() != 0) {
                        boolValueOf = Boolean.valueOf(byteBuffer.get() != 0);
                    }
                } else {
                    Log.w("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
                }
                gVar.g(boolValueOf.booleanValue());
            }
        };
        try {
            String str = oVar.f15949g;
            if (str != null) {
                bytes = str.getBytes("UTF-8");
            }
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(length + 56);
            byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocateDirect.putLong(length);
            byteBufferAllocateDirect.putLong(oVar.f15943a);
            int i7 = oVar.f15944b;
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
            byteBufferAllocateDirect.putLong(j);
            byteBufferAllocateDirect.putLong(oVar.f15945c);
            byteBufferAllocateDirect.putLong(oVar.f15946d);
            byteBufferAllocateDirect.putLong(oVar.f15947e ? 1L : 0L);
            int i8 = oVar.f15948f;
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
            byteBufferAllocateDirect.putLong(j3);
            if (bytes != null) {
                byteBufferAllocateDirect.put(bytes);
            }
            this.f15956a.k("flutter/keydata", byteBufferAllocateDirect, eVar);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    public final void b(boolean z4, Long l7, Long l8, long j) {
        o oVar = new o();
        oVar.f15943a = j;
        oVar.f15944b = z4 ? 1 : 2;
        oVar.f15946d = l7.longValue();
        oVar.f15945c = l8.longValue();
        oVar.f15949g = null;
        oVar.f15947e = true;
        oVar.f15948f = 1;
        if (l8.longValue() != 0 && l7.longValue() != 0) {
            if (!z4) {
                l7 = null;
            }
            c(l8, l7);
        }
        a(oVar, null);
    }

    public final void c(Long l7, Long l8) {
        HashMap map = this.f15957b;
        if (l8 != null) {
            if (((Long) map.put(l7, l8)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) map.remove(l7)) == null) {
            throw new AssertionError("The key was empty");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p121q5.s
    public final void f(KeyEvent keyEvent, g gVar) {
        Long lValueOf;
        boolean z4;
        int i7;
        int i8;
        String str;
        w wVar;
        long j;
        HashMap map;
        HashMap map2;
        int i9;
        int i10;
        if (keyEvent.getScanCode() == 0 && keyEvent.getKeyCode() == 0) {
            j = 0;
        } else {
            long scanCode = keyEvent.getScanCode();
            if (scanCode == 0) {
                lValueOf = Long.valueOf((((long) keyEvent.getKeyCode()) & 4294967295L) | 73014444032L);
            } else {
                lValueOf = (Long) x.f15966a.get(Long.valueOf(scanCode));
                if (lValueOf == null) {
                    lValueOf = Long.valueOf((((long) keyEvent.getScanCode()) & 4294967295L) | 73014444032L);
                }
            }
            Long l7 = lValueOf;
            Long lValueOf2 = (Long) x.f15967b.get(Long.valueOf(keyEvent.getKeyCode()));
            if (lValueOf2 == null) {
                lValueOf2 = Long.valueOf((((long) keyEvent.getKeyCode()) & 4294967295L) | 73014444032L);
            }
            Long l8 = lValueOf2;
            ArrayList arrayList = new ArrayList();
            v[] vVarArr = x.f15968c;
            int length = vVarArr.length;
            int i11 = 0;
            while (true) {
                HashMap map3 = this.f15957b;
                int i12 = 2;
                if (i11 >= length) {
                    HashMap map4 = map3;
                    boolean z7 = false;
                    HashMap map5 = this.f15958c;
                    for (w wVar2 : map5.values()) {
                        int metaState = keyEvent.getMetaState();
                        wVar2.getClass();
                        boolean z8 = (metaState & 1048576) != 0 ? true : z7;
                        if (4294967556L == l8.longValue() || wVar2.f15965a == z8) {
                            map = map4;
                        } else {
                            HashMap map6 = map4;
                            boolean zContainsKey = map6.containsKey(458809L);
                            boolean z9 = !zContainsKey;
                            if (!zContainsKey) {
                                wVar2.f15965a = !wVar2.f15965a;
                            }
                            map = map6;
                            b(z9, 4294967556L, 458809L, keyEvent.getEventTime());
                            if (zContainsKey) {
                                wVar2.f15965a = !wVar2.f15965a;
                            }
                            b(zContainsKey, 4294967556L, 458809L, keyEvent.getEventTime());
                        }
                        map4 = map;
                        z7 = false;
                    }
                    HashMap map7 = map4;
                    int action = keyEvent.getAction();
                    if (action != 0) {
                        z4 = action != 1;
                        j = 0;
                        break;
                    }
                    Long l9 = (Long) map7.get(l7);
                    if (!z4) {
                        if (l9 != null) {
                            i7 = 1;
                            i8 = 2;
                            str = null;
                        }
                        j = 0;
                        break;
                    }
                    if (l9 == null) {
                        i8 = 1;
                    } else if (keyEvent.getRepeatCount() > 0) {
                        i8 = 3;
                    } else {
                        b(false, l9, l7, keyEvent.getEventTime());
                        i8 = 1;
                    }
                    char cCharValue = this.f15959d.a(keyEvent.getUnicodeChar()).charValue();
                    str = cCharValue != 0 ? "" + cCharValue : null;
                    i7 = 1;
                    if (i8 != 3) {
                        c(l7, z4 ? l8 : null);
                    }
                    if (i8 == i7 && (wVar = (w) map5.get(l8)) != null) {
                        wVar.f15965a = (wVar.f15965a ? 1 : 0) ^ i7;
                    }
                    o oVar = new o();
                    int source = keyEvent.getSource();
                    if (source == 513) {
                        oVar.f15948f = 2;
                    } else if (source == 1025) {
                        oVar.f15948f = 3;
                    } else if (source == 16777232) {
                        oVar.f15948f = 4;
                    } else if (source != 33554433) {
                        oVar.f15948f = 1;
                    } else {
                        oVar.f15948f = 5;
                    }
                    oVar.f15943a = keyEvent.getEventTime();
                    oVar.f15944b = i8;
                    oVar.f15946d = l8.longValue();
                    oVar.f15945c = l7.longValue();
                    oVar.f15949g = str;
                    oVar.f15947e = false;
                    a(oVar, gVar);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                v vVar = vVarArr[i11];
                boolean z10 = (keyEvent.getMetaState() & vVar.f965b) != 0;
                long jLongValue = l8.longValue();
                long jLongValue2 = l7.longValue();
                v[] vVarArr2 = (v[]) vVar.f966c;
                boolean[] zArr = new boolean[2];
                Boolean[] boolArr = new Boolean[2];
                int i13 = 0;
                boolean z11 = false;
                while (i13 < i12) {
                    v vVar2 = vVarArr2[i13];
                    boolean[] zArr2 = zArr;
                    boolean zContainsKey2 = map3.containsKey(Long.valueOf(vVar2.f15963a));
                    zArr2[i13] = zContainsKey2;
                    int i14 = i13;
                    if (vVar2.f15964b == jLongValue) {
                        boolean z12 = keyEvent.getRepeatCount() > 0;
                        int action2 = keyEvent.getAction();
                        if (action2 == 0) {
                            i10 = z12 ? 3 : 1;
                        } else {
                            if (action2 != 1) {
                                throw new AssertionError("Unexpected event type");
                            }
                            i10 = 2;
                        }
                        int iE = p136t.e.e(i10);
                        if (iE == 0) {
                            boolArr = boolArr;
                            map2 = map3;
                            length = length;
                            vVarArr = vVarArr;
                            zArr2 = zArr2;
                            i9 = 2;
                            i11 = i11;
                            boolArr[i14] = Boolean.FALSE;
                            if (!z10) {
                                arrayList.add(new q(this, vVar2, jLongValue2, keyEvent, 0));
                            }
                        } else if (iE == 1) {
                            boolArr = boolArr;
                            map2 = map3;
                            length = length;
                            vVarArr = vVarArr;
                            zArr2 = zArr2;
                            i9 = 2;
                            i11 = i11;
                            boolArr[i14] = Boolean.valueOf(zArr2[i14]);
                        } else if (iE != 2) {
                            boolArr = boolArr;
                            i9 = 2;
                            map2 = map3;
                            length = length;
                            vVarArr = vVarArr;
                            zArr2 = zArr2;
                            i11 = i11;
                        } else {
                            if (z10) {
                                map2 = map3;
                            } else {
                                map2 = map3;
                                arrayList.add(new q(this, vVar2, jLongValue2, keyEvent, 1));
                            }
                            boolArr[i14] = Boolean.valueOf(zArr2[i14]);
                            i9 = 2;
                        }
                        z11 = true;
                    } else {
                        boolArr = boolArr;
                        map2 = map3;
                        length = length;
                        vVarArr = vVarArr;
                        zArr2 = zArr2;
                        i9 = 2;
                        i11 = i11;
                        z11 = z11 || zContainsKey2;
                    }
                    i13 = i14 + 1;
                    i12 = i9;
                    zArr = zArr2;
                    length = length;
                    boolArr = boolArr;
                    i11 = i11;
                    vVarArr = vVarArr;
                    map3 = map2;
                }
                Boolean[] boolArr2 = boolArr;
                int i15 = i12;
                boolean[] zArr3 = zArr;
                int i16 = i11;
                int i17 = length;
                v[] vVarArr3 = vVarArr;
                if (z10) {
                    for (int i18 = 0; i18 < i15; i18++) {
                        if (boolArr2[i18] == null) {
                            if (z11) {
                                boolArr2[i18] = Boolean.valueOf(zArr3[i18]);
                            } else {
                                boolArr2[i18] = Boolean.TRUE;
                                z11 = true;
                            }
                        }
                    }
                    if (!z11) {
                        boolArr2[0] = Boolean.TRUE;
                    }
                } else {
                    for (int i19 = 0; i19 < i15; i19++) {
                        if (boolArr2[i19] == null) {
                            boolArr2[i19] = Boolean.FALSE;
                        }
                    }
                }
                for (int i20 = 0; i20 < i15; i20++) {
                    if (zArr3[i20] != boolArr2[i20].booleanValue()) {
                        v vVar3 = vVarArr2[i20];
                        b(boolArr2[i20].booleanValue(), Long.valueOf(vVar3.f15964b), Long.valueOf(vVar3.f15963a), keyEvent.getEventTime());
                    }
                }
                i11 = i16 + 1;
                length = i17;
                vVarArr = vVarArr3;
            }
        }
        b(true, Long.valueOf(j), Long.valueOf(j), 0L);
        gVar.g(true);
    }
}
