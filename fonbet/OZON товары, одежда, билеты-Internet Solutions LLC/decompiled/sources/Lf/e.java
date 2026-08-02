package Lf;

/* loaded from: classes10.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final c[] f17050a;

    /* renamed from: b, reason: collision with root package name */
    private a[] f17051b = new a[16];

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Class<?> f17052a;

        /* renamed from: b, reason: collision with root package name */
        final c f17053b;

        a(Class<?> cls, c cVar) {
            this.f17052a = cls;
            this.f17053b = cVar;
        }
    }

    e(c[] cVarArr) {
        this.f17050a = cVarArr;
    }

    final e a(int i11) {
        c[] cVarArr = this.f17050a;
        int length = cVarArr.length;
        if (i11 >= length) {
            throw new IndexOutOfBoundsException();
        }
        c[] cVarArr2 = new c[length - 1];
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            if (i13 != i11) {
                cVarArr2[i12] = cVarArr[i13];
                i12++;
            }
        }
        return new e(cVarArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x000e, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fb, code lost:
    
        r6 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final c b(Class<?> cls) throws IllegalStateException {
        int i11;
        c cVar;
        int i12;
        a[] aVarArr = this.f17051b;
        int length = aVarArr.length;
        if (cls != null) {
            i11 = cls.hashCode() & (length - 1);
            while (true) {
                a aVar = aVarArr[i11];
                if (aVar == null) {
                    c[] cVarArr = this.f17050a;
                    int length2 = cVarArr.length;
                    e eVar = this;
                    int i13 = length2;
                    while (true) {
                        length2--;
                        if (length2 >= 0) {
                            cVar = cVarArr[length2];
                            Class<?> v11 = cVar.v();
                            if (v11 == cls) {
                                break;
                            }
                            if (v11 == null || (cls != null && !v11.isAssignableFrom(cls))) {
                                eVar = eVar.a(length2);
                                cVarArr = eVar.f17050a;
                                i13 = cVarArr.length;
                            }
                        } else {
                            cVar = null;
                            if (cls != null && i13 != 0) {
                                if (i13 == 1) {
                                    cVar = cVarArr[0];
                                } else {
                                    e eVar2 = eVar;
                                    int i14 = i13;
                                    while (true) {
                                        i13--;
                                        if (i13 < 0) {
                                            break;
                                        }
                                        Class<?> v12 = cVarArr[i13].v();
                                        e eVar3 = eVar2;
                                        int i15 = i14;
                                        while (true) {
                                            i14--;
                                            if (i14 >= 0) {
                                                if (i14 != i13 && cVarArr[i14].v().isAssignableFrom(v12)) {
                                                    eVar3 = eVar3.a(i14);
                                                    cVarArr = eVar3.f17050a;
                                                    i15 = cVarArr.length;
                                                    i13 = i15 - 1;
                                                }
                                            }
                                        }
                                        i14 = i15;
                                        eVar2 = eVar3;
                                    }
                                    if (i14 != 1) {
                                        StringBuilder sb2 = new StringBuilder("Unable to find best converter for type \"");
                                        sb2.append(cls.getName());
                                        sb2.append("\" from remaining set: ");
                                        for (int i16 = 0; i16 < i14; i16++) {
                                            c cVar2 = cVarArr[i16];
                                            Class<?> v13 = cVar2.v();
                                            sb2.append(cVar2.getClass().getName());
                                            sb2.append('[');
                                            sb2.append(v13 == null ? null : v13.getName());
                                            sb2.append("], ");
                                        }
                                        throw new IllegalStateException(sb2.toString());
                                    }
                                    cVar = cVarArr[0];
                                }
                            }
                        }
                    }
                    a aVar2 = new a(cls, cVar);
                    a[] aVarArr2 = (a[]) aVarArr.clone();
                    aVarArr2[i11] = aVar2;
                    for (int i17 = 0; i17 < length; i17++) {
                        if (aVarArr2[i17] == null) {
                            this.f17051b = aVarArr2;
                            return cVar;
                        }
                    }
                    int i18 = length << 1;
                    a[] aVarArr3 = new a[i18];
                    for (int i19 = 0; i19 < length; i19++) {
                        a aVar3 = aVarArr2[i19];
                        Class<?> cls2 = aVar3.f17052a;
                        if (cls2 != null) {
                            i12 = cls2.hashCode() & (i18 - 1);
                            while (aVarArr3[i12] != null) {
                                i12++;
                                if (i12 >= i18) {
                                }
                            }
                            aVarArr3[i12] = aVar3;
                        }
                        i12 = 0;
                    }
                    this.f17051b = aVarArr3;
                    return cVar;
                }
                if (aVar.f17052a == cls) {
                    return aVar.f17053b;
                }
                i11++;
                if (i11 >= length) {
                }
            }
        }
        i11 = 0;
    }

    final int c() {
        return this.f17050a.length;
    }
}
