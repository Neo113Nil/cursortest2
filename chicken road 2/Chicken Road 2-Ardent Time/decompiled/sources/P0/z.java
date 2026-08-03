package P0;

/* loaded from: classes.dex */
public final class z implements P0.B {

    /* renamed from: a, reason: collision with root package name */
    public final a1.f f1424a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f1425b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f1426c;

    /* renamed from: d, reason: collision with root package name */
    public final G1.i f1427d;

    public z(a1.f fVar) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f1426c = hashMap;
        this.f1427d = new G1.i();
        this.f1424a = fVar;
        P0.C c2 = P0.F.f1316a;
        P0.E e2 = new P0.E();
        e2.f1315a = false;
        P0.E e3 = new P0.E[]{e2}[0];
        e3.getClass();
        hashMap.put(4294967556L, e3);
    }

    public final void a(P0.w wVar, final P0.A a2) {
        long j2;
        long j3;
        byte[] bArr = null;
        a1.e eVar = a2 == null ? null : new a1.e() { // from class: P0.x
            @Override // a1.e
            public final void a(java.nio.ByteBuffer byteBuffer) {
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    if (byteBuffer.capacity() != 0) {
                        bool = java.lang.Boolean.valueOf(byteBuffer.get() != 0);
                    }
                } else {
                    android.util.Log.w("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
                }
                P0.A.this.a(bool.booleanValue());
            }
        };
        try {
            java.lang.String str = wVar.f1417g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            int length = bArr == null ? 0 : bArr.length;
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(wVar.f1411a);
            int i2 = wVar.f1412b;
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
            allocateDirect.putLong(wVar.f1413c);
            allocateDirect.putLong(wVar.f1414d);
            allocateDirect.putLong(wVar.f1415e ? 1L : 0L);
            int i3 = wVar.f1416f;
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
            this.f1424a.c("flutter/keydata", allocateDirect, eVar);
        } catch (java.io.UnsupportedEncodingException unused) {
            throw new java.lang.AssertionError("UTF-8 not supported");
        }
    }

    public final void b(boolean z2, java.lang.Long l2, java.lang.Long l3, long j2) {
        P0.w wVar = new P0.w();
        wVar.f1411a = j2;
        wVar.f1412b = z2 ? 1 : 2;
        wVar.f1414d = l2.longValue();
        wVar.f1413c = l3.longValue();
        wVar.f1417g = null;
        wVar.f1415e = true;
        wVar.f1416f = 1;
        if (l3.longValue() != 0 && l2.longValue() != 0) {
            if (!z2) {
                l2 = null;
            }
            c(l3, l2);
        }
        a(wVar, null);
    }

    public final void c(java.lang.Long l2, java.lang.Long l3) {
        java.util.HashMap hashMap = this.f1425b;
        if (l3 != null) {
            if (((java.lang.Long) hashMap.put(l2, l3)) != null) {
                throw new java.lang.AssertionError("The key was not empty");
            }
        } else if (((java.lang.Long) hashMap.remove(l2)) == null) {
            throw new java.lang.AssertionError("The key was empty");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02fc  */
    @Override // P0.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(final android.view.KeyEvent keyEvent, P0.A a2) {
        java.lang.Long l2;
        boolean z2;
        int i2;
        int i3;
        java.lang.String str;
        P0.E e2;
        long j2;
        java.util.HashMap hashMap;
        java.lang.Boolean[] boolArr;
        java.util.HashMap hashMap2;
        int i4;
        M1.n[] nVarArr;
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
                l2 = java.lang.Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            } else {
                l2 = (java.lang.Long) P0.F.f1316a.get(java.lang.Long.valueOf(scanCode));
                if (l2 == null) {
                    l2 = java.lang.Long.valueOf((keyEvent.getScanCode() & 4294967295L) | 73014444032L);
                }
            }
            java.lang.Long l3 = l2;
            java.lang.Long l4 = (java.lang.Long) P0.F.f1317b.get(java.lang.Long.valueOf(keyEvent.getKeyCode()));
            if (l4 == null) {
                l4 = java.lang.Long.valueOf((keyEvent.getKeyCode() & 4294967295L) | 73014444032L);
            }
            java.lang.Long l5 = l4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            M1.n[] nVarArr2 = P0.F.f1318c;
            int length = nVarArr2.length;
            int i9 = 0;
            while (true) {
                java.util.HashMap hashMap3 = this.f1425b;
                int i10 = 2;
                if (i9 >= length) {
                    java.util.HashMap hashMap4 = hashMap3;
                    boolean z3 = false;
                    java.util.HashMap hashMap5 = this.f1426c;
                    for (P0.E e3 : hashMap5.values()) {
                        int metaState = keyEvent.getMetaState();
                        e3.getClass();
                        boolean z4 = (metaState & 1048576) != 0 ? true : z3;
                        if (4294967556L == l5.longValue() || e3.f1315a == z4) {
                            hashMap = hashMap4;
                        } else {
                            java.util.HashMap hashMap6 = hashMap4;
                            boolean containsKey = hashMap6.containsKey(458809L);
                            boolean z5 = !containsKey;
                            if (!containsKey) {
                                e3.f1315a = !e3.f1315a;
                            }
                            hashMap = hashMap6;
                            b(z5, 4294967556L, 458809L, keyEvent.getEventTime());
                            if (containsKey) {
                                e3.f1315a = !e3.f1315a;
                            }
                            b(containsKey, 4294967556L, 458809L, keyEvent.getEventTime());
                        }
                        hashMap4 = hashMap;
                        z3 = false;
                    }
                    java.util.HashMap hashMap7 = hashMap4;
                    int action = keyEvent.getAction();
                    if (action != 0) {
                        z2 = action != 1;
                        j2 = 0;
                    }
                    java.lang.Long l6 = (java.lang.Long) hashMap7.get(l3);
                    if (z2) {
                        if (l6 != null) {
                            if (keyEvent.getRepeatCount() > 0) {
                                i3 = 3;
                                char charValue = this.f1427d.a(keyEvent.getUnicodeChar()).charValue();
                                str = charValue == 0 ? "" + charValue : null;
                                i2 = 1;
                            } else {
                                b(false, l6, l3, keyEvent.getEventTime());
                            }
                        }
                        i3 = 1;
                        char charValue2 = this.f1427d.a(keyEvent.getUnicodeChar()).charValue();
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
                    if (i3 == i2 && (e2 = (P0.E) hashMap5.get(l5)) != null) {
                        e2.f1315a = (e2.f1315a ? 1 : 0) ^ i2;
                    }
                    P0.w wVar = new P0.w();
                    int source = keyEvent.getSource();
                    if (source == 513) {
                        wVar.f1416f = 2;
                    } else if (source == 1025) {
                        wVar.f1416f = 3;
                    } else if (source == 16777232) {
                        wVar.f1416f = 4;
                    } else if (source != 33554433) {
                        wVar.f1416f = 1;
                    } else {
                        wVar.f1416f = 5;
                    }
                    wVar.f1411a = keyEvent.getEventTime();
                    wVar.f1412b = i3;
                    wVar.f1414d = l5.longValue();
                    wVar.f1413c = l3.longValue();
                    wVar.f1417g = str;
                    wVar.f1415e = false;
                    a(wVar, a2);
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((java.lang.Runnable) it.next()).run();
                    }
                    return;
                }
                M1.n nVar = nVarArr2[i9];
                boolean z6 = (keyEvent.getMetaState() & nVar.f1093a) != 0;
                long longValue = l5.longValue();
                final long longValue2 = l3.longValue();
                P0.D[] dArr = (P0.D[]) nVar.f1094b;
                boolean[] zArr2 = new boolean[2];
                java.lang.Boolean[] boolArr2 = new java.lang.Boolean[2];
                int i11 = 0;
                boolean z7 = false;
                while (i11 < i10) {
                    final P0.D d2 = dArr[i11];
                    boolean[] zArr3 = zArr2;
                    boolean containsKey2 = hashMap3.containsKey(java.lang.Long.valueOf(d2.f1313a));
                    zArr3[i11] = containsKey2;
                    int i12 = i11;
                    if (d2.f1314b == longValue) {
                        boolean z8 = keyEvent.getRepeatCount() > 0;
                        int action2 = keyEvent.getAction();
                        if (action2 == 0) {
                            i7 = z8 ? 3 : 1;
                        } else {
                            if (action2 != 1) {
                                throw new java.lang.AssertionError("Unexpected event type");
                            }
                            i7 = 2;
                        }
                        int b2 = H.j.b(i7);
                        if (b2 == 0) {
                            boolArr = boolArr2;
                            hashMap2 = hashMap3;
                            i4 = length;
                            nVarArr = nVarArr2;
                            zArr = zArr3;
                            i5 = 2;
                            i6 = i9;
                            boolArr[i12] = java.lang.Boolean.FALSE;
                            if (!z6) {
                                final int i13 = 0;
                                arrayList.add(new java.lang.Runnable(this) { // from class: P0.y

                                    /* renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ P0.z f1420b;

                                    {
                                        this.f1420b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                P0.z zVar = this.f1420b;
                                                zVar.getClass();
                                                zVar.b(false, java.lang.Long.valueOf(d2.f1314b), java.lang.Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                            default:
                                                P0.z zVar2 = this.f1420b;
                                                zVar2.getClass();
                                                zVar2.b(false, java.lang.Long.valueOf(d2.f1314b), java.lang.Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                        } else if (b2 == 1) {
                            boolArr = boolArr2;
                            hashMap2 = hashMap3;
                            i4 = length;
                            nVarArr = nVarArr2;
                            zArr = zArr3;
                            i5 = 2;
                            i6 = i9;
                            boolArr[i12] = java.lang.Boolean.valueOf(zArr[i12]);
                        } else if (b2 != 2) {
                            boolArr = boolArr2;
                            i5 = 2;
                            hashMap2 = hashMap3;
                            i4 = length;
                            nVarArr = nVarArr2;
                            zArr = zArr3;
                            i6 = i9;
                        } else {
                            if (z6) {
                                boolArr = boolArr2;
                                i8 = 2;
                                hashMap2 = hashMap3;
                                i4 = length;
                                nVarArr = nVarArr2;
                                zArr = zArr3;
                                i6 = i9;
                            } else {
                                final int i14 = 1;
                                boolArr = boolArr2;
                                i8 = 2;
                                zArr = zArr3;
                                i6 = i9;
                                hashMap2 = hashMap3;
                                nVarArr = nVarArr2;
                                i4 = length;
                                arrayList.add(new java.lang.Runnable(this) { // from class: P0.y

                                    /* renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ P0.z f1420b;

                                    {
                                        this.f1420b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                P0.z zVar = this.f1420b;
                                                zVar.getClass();
                                                zVar.b(false, java.lang.Long.valueOf(d2.f1314b), java.lang.Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                            default:
                                                P0.z zVar2 = this.f1420b;
                                                zVar2.getClass();
                                                zVar2.b(false, java.lang.Long.valueOf(d2.f1314b), java.lang.Long.valueOf(longValue2), keyEvent.getEventTime());
                                                break;
                                        }
                                    }
                                });
                            }
                            boolArr[i12] = java.lang.Boolean.valueOf(zArr[i12]);
                            i5 = i8;
                        }
                        z7 = true;
                    } else {
                        boolArr = boolArr2;
                        hashMap2 = hashMap3;
                        i4 = length;
                        nVarArr = nVarArr2;
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
                    nVarArr2 = nVarArr;
                    hashMap3 = hashMap2;
                }
                java.lang.Boolean[] boolArr3 = boolArr2;
                int i15 = i10;
                boolean[] zArr4 = zArr2;
                int i16 = i9;
                int i17 = length;
                M1.n[] nVarArr3 = nVarArr2;
                boolean z9 = keyEvent.getDeviceId() == -1;
                if (z6) {
                    for (int i18 = 0; i18 < i15; i18++) {
                        if (boolArr3[i18] == null) {
                            if (z7 || z9) {
                                boolArr3[i18] = java.lang.Boolean.valueOf(zArr4[i18]);
                            } else {
                                boolArr3[i18] = java.lang.Boolean.TRUE;
                                z7 = true;
                            }
                        }
                    }
                    if (!z7 && !z9) {
                        boolArr3[0] = java.lang.Boolean.TRUE;
                    }
                } else {
                    for (int i19 = 0; i19 < i15; i19++) {
                        if (boolArr3[i19] == null) {
                            boolArr3[i19] = java.lang.Boolean.FALSE;
                        }
                    }
                }
                for (int i20 = 0; i20 < i15; i20++) {
                    if (zArr4[i20] != boolArr3[i20].booleanValue()) {
                        P0.D d3 = dArr[i20];
                        b(boolArr3[i20].booleanValue(), java.lang.Long.valueOf(d3.f1314b), java.lang.Long.valueOf(d3.f1313a), keyEvent.getEventTime());
                    }
                }
                i9 = i16 + 1;
                length = i17;
                nVarArr2 = nVarArr3;
            }
        }
        b(true, java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j2), 0L);
        a2.a(true);
    }
}
