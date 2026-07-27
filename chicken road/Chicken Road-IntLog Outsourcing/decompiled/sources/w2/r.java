package w2;

import G0.F;
import G0.P;
import android.util.Log;
import android.view.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r implements s {

    /* renamed from: a, reason: collision with root package name */
    public final H2.f f12208a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f12209b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f12210c;

    /* renamed from: d, reason: collision with root package name */
    public final K4.i f12211d;

    public r(H2.f fVar) {
        HashMap hashMap = new HashMap();
        this.f12210c = hashMap;
        this.f12211d = new K4.i(1, false);
        this.f12208a = fVar;
        J2.a aVar = v.f12215a;
        u uVar = new u();
        uVar.f12214a = false;
        u uVar2 = new u[]{uVar}[0];
        uVar2.getClass();
        hashMap.put(4294967556L, uVar2);
    }

    public final void a(o oVar, final P p5) {
        long j2;
        long j6;
        byte[] bArr = null;
        H2.e eVar = p5 == null ? null : new H2.e() { // from class: w2.p
            @Override // H2.e
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
                P.this.d(bool.booleanValue());
            }
        };
        try {
            String str = oVar.f12201g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            int length = bArr == null ? 0 : bArr.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(oVar.f12195a);
            int i2 = oVar.f12196b;
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
            allocateDirect.putLong(oVar.f12197c);
            allocateDirect.putLong(oVar.f12198d);
            allocateDirect.putLong(oVar.f12199e ? 1L : 0L);
            int i3 = oVar.f12200f;
            if (i3 == 1) {
                j6 = 0;
            } else if (i3 == 2) {
                j6 = 1;
            } else if (i3 == 3) {
                j6 = 2;
            } else if (i3 == 4) {
                j6 = 3;
            } else {
                if (i3 != 5) {
                    throw null;
                }
                j6 = 4;
            }
            allocateDirect.putLong(j6);
            if (bArr != null) {
                allocateDirect.put(bArr);
            }
            this.f12208a.w("flutter/keydata", allocateDirect, eVar);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02fc  */
    @Override // w2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(final KeyEvent keyEvent, P p5) {
        Long l2;
        boolean z;
        int i2;
        int i3;
        String str;
        u uVar;
        long j2;
        HashMap hashMap;
        Boolean[] boolArr;
        HashMap hashMap2;
        int i6;
        F[] fArr;
        boolean[] zArr;
        int i7;
        int i8;
        int i9;
        int i10;
        if (keyEvent.getScanCode() == 0 && keyEvent.getKeyCode() == 0) {
            j2 = 0;
        } else {
            long scanCode = keyEvent.getScanCode();
            if (scanCode == 0) {
                l2 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            } else {
                l2 = (Long) v.f12215a.get(Long.valueOf(scanCode));
                if (l2 == null) {
                    l2 = Long.valueOf((keyEvent.getScanCode() & 4294967295L) | 73014444032L);
                }
            }
            Long l6 = l2;
            Long l7 = (Long) v.f12216b.get(Long.valueOf(keyEvent.getKeyCode()));
            if (l7 == null) {
                l7 = Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            }
            Long l8 = l7;
            ArrayList arrayList = new ArrayList();
            F[] fArr2 = v.f12217c;
            int length = fArr2.length;
            int i11 = 0;
            while (true) {
                HashMap hashMap3 = this.f12209b;
                int i12 = 2;
                if (i11 >= length) {
                    HashMap hashMap4 = hashMap3;
                    boolean z5 = false;
                    HashMap hashMap5 = this.f12210c;
                    for (u uVar2 : hashMap5.values()) {
                        int metaState = keyEvent.getMetaState();
                        uVar2.getClass();
                        boolean z6 = (metaState & 1048576) != 0 ? true : z5;
                        if (4294967556L == l8.longValue() || uVar2.f12214a == z6) {
                            hashMap = hashMap4;
                        } else {
                            HashMap hashMap6 = hashMap4;
                            boolean containsKey = hashMap6.containsKey(458809L);
                            boolean z7 = !containsKey;
                            if (!containsKey) {
                                uVar2.f12214a = !uVar2.f12214a;
                            }
                            hashMap = hashMap6;
                            c(z7, 4294967556L, 458809L, keyEvent.getEventTime());
                            if (containsKey) {
                                uVar2.f12214a = !uVar2.f12214a;
                            }
                            c(containsKey, 4294967556L, 458809L, keyEvent.getEventTime());
                        }
                        hashMap4 = hashMap;
                        z5 = false;
                    }
                    HashMap hashMap7 = hashMap4;
                    int action = keyEvent.getAction();
                    if (action != 0) {
                        z = action != 1;
                        j2 = 0;
                    }
                    Long l9 = (Long) hashMap7.get(l6);
                    if (z) {
                        if (l9 != null) {
                            if (keyEvent.getRepeatCount() > 0) {
                                i3 = 3;
                                char charValue = this.f12211d.a(keyEvent.getUnicodeChar()).charValue();
                                str = charValue == 0 ? "" + charValue : null;
                                i2 = 1;
                            } else {
                                c(false, l9, l6, keyEvent.getEventTime());
                            }
                        }
                        i3 = 1;
                        char charValue2 = this.f12211d.a(keyEvent.getUnicodeChar()).charValue();
                        if (charValue2 == 0) {
                        }
                        str = charValue2 == 0 ? "" + charValue2 : null;
                        i2 = 1;
                    } else {
                        if (l9 != null) {
                            i2 = 1;
                            i3 = 2;
                            str = null;
                        }
                        j2 = 0;
                    }
                    if (i3 != 3) {
                        d(l6, z ? l8 : null);
                    }
                    if (i3 == i2 && (uVar = (u) hashMap5.get(l8)) != null) {
                        uVar.f12214a = (uVar.f12214a ? 1 : 0) ^ i2;
                    }
                    o oVar = new o();
                    int source = keyEvent.getSource();
                    if (source == 513) {
                        oVar.f12200f = 2;
                    } else if (source == 1025) {
                        oVar.f12200f = 3;
                    } else if (source == 16777232) {
                        oVar.f12200f = 4;
                    } else if (source != 33554433) {
                        oVar.f12200f = 1;
                    } else {
                        oVar.f12200f = 5;
                    }
                    oVar.f12195a = keyEvent.getEventTime();
                    oVar.f12196b = i3;
                    oVar.f12198d = l8.longValue();
                    oVar.f12197c = l6.longValue();
                    oVar.f12201g = str;
                    oVar.f12199e = false;
                    a(oVar, p5);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                F f3 = fArr2[i11];
                boolean z8 = (keyEvent.getMetaState() & f3.f753b) != 0;
                long longValue = l8.longValue();
                final long longValue2 = l6.longValue();
                t[] tVarArr = (t[]) f3.f754c;
                boolean[] zArr2 = new boolean[2];
                Boolean[] boolArr2 = new Boolean[2];
                int i13 = 0;
                boolean z9 = false;
                while (i13 < i12) {
                    final t tVar = tVarArr[i13];
                    boolean[] zArr3 = zArr2;
                    boolean containsKey2 = hashMap3.containsKey(Long.valueOf(tVar.f12212a));
                    zArr3[i13] = containsKey2;
                    int i14 = i13;
                    if (tVar.f12213b == longValue) {
                        boolean z10 = keyEvent.getRepeatCount() > 0;
                        int action2 = keyEvent.getAction();
                        if (action2 == 0) {
                            i9 = z10 ? 3 : 1;
                        } else {
                            if (action2 != 1) {
                                throw new AssertionError("Unexpected event type");
                            }
                            i9 = 2;
                        }
                        int b6 = O.j.b(i9);
                        if (b6 == 0) {
                            boolArr = boolArr2;
                            hashMap2 = hashMap3;
                            i6 = length;
                            fArr = fArr2;
                            zArr = zArr3;
                            i7 = 2;
                            i8 = i11;
                            boolArr[i14] = Boolean.FALSE;
                            if (!z8) {
                                final int i15 = 0;
                                arrayList.add(new Runnable(this) { // from class: w2.q

                                    /* renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ r f12204b;

                                    {
                                        this.f12204b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                r rVar = this.f12204b;
                                                rVar.getClass();
                                                rVar.c(false, Long.valueOf(tVar.f12213b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                            default:
                                                r rVar2 = this.f12204b;
                                                rVar2.getClass();
                                                rVar2.c(false, Long.valueOf(tVar.f12213b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                        } else if (b6 == 1) {
                            boolArr = boolArr2;
                            hashMap2 = hashMap3;
                            i6 = length;
                            fArr = fArr2;
                            zArr = zArr3;
                            i7 = 2;
                            i8 = i11;
                            boolArr[i14] = Boolean.valueOf(zArr[i14]);
                        } else if (b6 != 2) {
                            boolArr = boolArr2;
                            i7 = 2;
                            hashMap2 = hashMap3;
                            i6 = length;
                            fArr = fArr2;
                            zArr = zArr3;
                            i8 = i11;
                        } else {
                            if (z8) {
                                boolArr = boolArr2;
                                i10 = 2;
                                hashMap2 = hashMap3;
                                i6 = length;
                                fArr = fArr2;
                                zArr = zArr3;
                                i8 = i11;
                            } else {
                                final int i16 = 1;
                                boolArr = boolArr2;
                                i10 = 2;
                                zArr = zArr3;
                                i8 = i11;
                                hashMap2 = hashMap3;
                                fArr = fArr2;
                                i6 = length;
                                arrayList.add(new Runnable(this) { // from class: w2.q

                                    /* renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ r f12204b;

                                    {
                                        this.f12204b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                r rVar = this.f12204b;
                                                rVar.getClass();
                                                rVar.c(false, Long.valueOf(tVar.f12213b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                            default:
                                                r rVar2 = this.f12204b;
                                                rVar2.getClass();
                                                rVar2.c(false, Long.valueOf(tVar.f12213b), Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                            boolArr[i14] = Boolean.valueOf(zArr[i14]);
                            i7 = i10;
                        }
                        z9 = true;
                    } else {
                        boolArr = boolArr2;
                        hashMap2 = hashMap3;
                        i6 = length;
                        fArr = fArr2;
                        zArr = zArr3;
                        i7 = 2;
                        i8 = i11;
                        z9 = z9 || containsKey2;
                    }
                    i13 = i14 + 1;
                    i12 = i7;
                    zArr2 = zArr;
                    length = i6;
                    boolArr2 = boolArr;
                    i11 = i8;
                    fArr2 = fArr;
                    hashMap3 = hashMap2;
                }
                Boolean[] boolArr3 = boolArr2;
                int i17 = i12;
                boolean[] zArr4 = zArr2;
                int i18 = i11;
                int i19 = length;
                F[] fArr3 = fArr2;
                boolean z11 = keyEvent.getDeviceId() == -1;
                if (z8) {
                    for (int i20 = 0; i20 < i17; i20++) {
                        if (boolArr3[i20] == null) {
                            if (z9 || z11) {
                                boolArr3[i20] = Boolean.valueOf(zArr4[i20]);
                            } else {
                                boolArr3[i20] = Boolean.TRUE;
                                z9 = true;
                            }
                        }
                    }
                    if (!z9 && !z11) {
                        boolArr3[0] = Boolean.TRUE;
                    }
                } else {
                    for (int i21 = 0; i21 < i17; i21++) {
                        if (boolArr3[i21] == null) {
                            boolArr3[i21] = Boolean.FALSE;
                        }
                    }
                }
                for (int i22 = 0; i22 < i17; i22++) {
                    if (zArr4[i22] != boolArr3[i22].booleanValue()) {
                        t tVar2 = tVarArr[i22];
                        c(boolArr3[i22].booleanValue(), Long.valueOf(tVar2.f12213b), Long.valueOf(tVar2.f12212a), keyEvent.getEventTime());
                    }
                }
                i11 = i18 + 1;
                length = i19;
                fArr2 = fArr3;
            }
        }
        c(true, Long.valueOf(j2), Long.valueOf(j2), 0L);
        p5.d(true);
    }

    public final void c(boolean z, Long l2, Long l6, long j2) {
        o oVar = new o();
        oVar.f12195a = j2;
        oVar.f12196b = z ? 1 : 2;
        oVar.f12198d = l2.longValue();
        oVar.f12197c = l6.longValue();
        oVar.f12201g = null;
        oVar.f12199e = true;
        oVar.f12200f = 1;
        if (l6.longValue() != 0 && l2.longValue() != 0) {
            if (!z) {
                l2 = null;
            }
            d(l6, l2);
        }
        a(oVar, null);
    }

    public final void d(Long l2, Long l6) {
        HashMap hashMap = this.f12209b;
        if (l6 != null) {
            if (((Long) hashMap.put(l2, l6)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) hashMap.remove(l2)) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
