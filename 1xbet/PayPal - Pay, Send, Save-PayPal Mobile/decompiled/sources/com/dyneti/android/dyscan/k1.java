package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class k1 extends com.dyneti.android.dyscan.j1 {
    public java.nio.ByteBuffer A;
    public android.graphics.Bitmap B;
    public java.util.ArrayList C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final java.util.List G;
    public final java.util.List H;
    public final java.lang.Boolean I;
    public final java.lang.String J;
    public final java.lang.String K;
    public final float[][] j;
    public final float[][][] k;
    public final float[][] l;
    public boolean m;
    public final int n;

    /* renamed from: o, reason: collision with root package name */
    public final float f3317o;
    public final float p;
    public final java.util.ArrayList q;
    public final long r;
    public final int s;
    public com.dyneti.android.dyscan.p0 t;
    public com.dyneti.android.dyscan.y u;
    public java.lang.Long v;
    public com.dyneti.android.dyscan.p0 w;
    public com.dyneti.android.dyscan.y x;
    public int y;
    public int z;

    public k1(android.content.Context context, java.nio.ByteBuffer byteBuffer, com.dyneti.android.dyscan.l2 l2Var, com.dyneti.android.dyscan.t1 t1Var, java.lang.Boolean bool, java.lang.String str, java.lang.String str2) {
        super(context, byteBuffer, l2Var, t1Var);
        boolean z = false;
        this.m = false;
        this.n = 50;
        this.f3317o = 0.37f;
        this.p = 0.3f;
        this.q = new java.util.ArrayList();
        this.r = 350L;
        this.s = 50;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = 0;
        this.z = 0;
        this.C = new java.util.ArrayList();
        this.G = java.util.Arrays.asList("corner", com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.BRAND_VISA, "visaholo", "mc", "mcholo", com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.BRAND_AMEX, "amextext");
        this.H = java.util.Arrays.asList("0", "1", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "4", "5", "6", "7", "8", "9");
        float[][] fArr = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, 1, 50);
        this.j = fArr;
        float[][] fArr2 = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, 1, 50);
        this.l = fArr2;
        float[][][] fArr3 = (float[][][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, 1, 50, 4);
        this.k = fArr3;
        this.f3314a.put(0, fArr3);
        this.f3314a.put(1, fArr);
        this.f3314a.put(2, fArr2);
        this.f3314a.put(3, new float[1]);
        if (bool.booleanValue() && ((str != null && !str.isEmpty()) || (str2 != null && !str2.isEmpty()))) {
            z = true;
        }
        this.I = java.lang.Boolean.valueOf(z);
        this.J = str;
        this.K = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0325, code lost:
    
        if (r22.u.c().equals(r22.K) != false) goto L157;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0388 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0399 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0404 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c5 A[LOOP:7: B:88:0x01bf->B:90:0x01c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.dyneti.android.dyscan.c2 a(java.util.ArrayList arrayList, android.graphics.Bitmap bitmap, boolean z, com.dyneti.android.dyscan.h1 h1Var) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean equals;
        java.lang.String str;
        java.util.Iterator it;
        int i;
        com.dyneti.android.dyscan.f2[] f2VarArr;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.addAll(java.util.Arrays.asList(((com.dyneti.android.dyscan.o2) it2.next()).b));
        }
        com.dyneti.android.dyscan.f2[] f2VarArr2 = (com.dyneti.android.dyscan.f2[]) arrayList2.toArray(new com.dyneti.android.dyscan.f2[arrayList2.size()]);
        java.lang.Integer[] numArr = new java.lang.Integer[f2VarArr2.length];
        for (int i2 = 0; i2 < f2VarArr2.length; i2++) {
            numArr[i2] = java.lang.Integer.valueOf(i2);
        }
        if (!z) {
            f2VarArr2 = a(f2VarArr2, numArr, 0.30000001192092896d, this.s);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (com.dyneti.android.dyscan.f2 f2Var : f2VarArr2) {
            if (f2Var.b.equals("corner") && f2Var.f3302a > this.p) {
                arrayList3.add(f2Var);
            }
            if (!this.G.contains(f2Var.b) && !f2Var.b.equals("-") && f2Var.f3302a > this.f3317o) {
                arrayList5.add(f2Var);
            }
            if (this.G.contains(f2Var.b) && !f2Var.b.equals("corner") && f2Var.f3302a > this.f3317o) {
                arrayList4.add(f2Var);
            }
        }
        this.D = this.D || arrayList3.size() > 1;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (i3 < this.C.size() && i4 < arrayList4.size() && arrayList6.size() < 2) {
            if (((com.dyneti.android.dyscan.f2) this.C.get(i3)).f3302a > ((com.dyneti.android.dyscan.f2) arrayList4.get(i4)).f3302a) {
                arrayList6.add((com.dyneti.android.dyscan.f2) this.C.get(i3));
                i3++;
            } else {
                arrayList6.add((com.dyneti.android.dyscan.f2) arrayList4.get(i4));
                i4++;
            }
        }
        while (i3 < this.C.size() && arrayList6.size() < 2) {
            arrayList6.add((com.dyneti.android.dyscan.f2) this.C.get(i3));
            i3++;
        }
        while (i4 < arrayList4.size() && arrayList6.size() < 2) {
            arrayList6.add((com.dyneti.android.dyscan.f2) arrayList4.get(i4));
            i4++;
        }
        this.C = arrayList6;
        com.dyneti.android.dyscan.f2[] f2VarArr3 = (com.dyneti.android.dyscan.f2[]) this.C.toArray(new com.dyneti.android.dyscan.f2[arrayList6.size()]);
        java.util.ArrayList a2 = a(a(arrayList5));
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        for (int i5 = 0; i5 < a2.size(); i5++) {
            com.dyneti.android.dyscan.e0 e0Var = (com.dyneti.android.dyscan.e0) a2.get(i5);
            com.dyneti.android.dyscan.y yVar = new com.dyneti.android.dyscan.y(e0Var, f2VarArr3, z, h1Var);
            if (yVar.c) {
                arrayList7.add(yVar);
                java.nio.ByteBuffer byteBuffer = this.A;
                if (byteBuffer == null) {
                    java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(this.g.capacity());
                    this.A = allocateDirect;
                    allocateDirect.order(java.nio.ByteOrder.nativeOrder());
                } else {
                    byteBuffer.rewind();
                }
                java.nio.ByteBuffer byteBuffer2 = this.g;
                if (byteBuffer2 != null) {
                    byteBuffer2.rewind();
                    this.A.put(this.g);
                    this.A.rewind();
                    this.B = bitmap;
                    it = e0Var.d.iterator();
                    java.lang.String str2 = "";
                    while (it.hasNext()) {
                        str2 = str2.concat((java.lang.String) it.next());
                    }
                    java.lang.String[] strArr = com.dyneti.android.dyscan.p0.e;
                    i = 0;
                    while (i < 4) {
                        int length = strArr[i].length();
                        int i6 = 0;
                        while (true) {
                            f2VarArr = f2VarArr3;
                            if (i6 <= str2.length() - length) {
                                java.util.ArrayList arrayList9 = a2;
                                com.dyneti.android.dyscan.p0 p0Var = new com.dyneti.android.dyscan.p0(str2.substring(i6, i6 + length), e0Var.f3299a);
                                if (p0Var.b) {
                                    arrayList8.add(p0Var);
                                }
                                i6++;
                                a2 = arrayList9;
                                f2VarArr3 = f2VarArr;
                            }
                        }
                        i++;
                        f2VarArr3 = f2VarArr;
                    }
                }
            }
            it = e0Var.d.iterator();
            java.lang.String str22 = "";
            while (it.hasNext()) {
            }
            java.lang.String[] strArr2 = com.dyneti.android.dyscan.p0.e;
            i = 0;
            while (i < 4) {
            }
        }
        if (arrayList7.size() > 0) {
            if (!z) {
                arrayList.clear();
            }
            java.util.Collections.sort(arrayList7, com.dyneti.android.dyscan.y.k);
            com.dyneti.android.dyscan.y yVar2 = (com.dyneti.android.dyscan.y) arrayList7.get(0);
            this.F = this.F || yVar2.d;
            this.E = this.E || yVar2.f;
            com.dyneti.android.dyscan.y yVar3 = this.u;
            if (yVar3 == null || !yVar2.b.equals(yVar3.b)) {
                this.z = 1;
            } else {
                this.z++;
            }
            this.u = yVar2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (arrayList8.size() > 0) {
            java.util.Collections.sort(arrayList8, com.dyneti.android.dyscan.p0.f);
            if (!z) {
                arrayList.clear();
            }
            com.dyneti.android.dyscan.p0 p0Var2 = (com.dyneti.android.dyscan.p0) arrayList8.get(0);
            if (this.t != null) {
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                calendar.setTime(p0Var2.f3330a);
                z3 = true;
                z3 = true;
                int i7 = calendar.get(1);
                int i8 = calendar.get(2);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(i8 + 1);
                sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                sb.append(i7);
                java.lang.String obj = sb.toString();
                com.dyneti.android.dyscan.p0 p0Var3 = this.t;
                java.util.Calendar calendar2 = java.util.Calendar.getInstance();
                calendar2.setTime(p0Var3.f3330a);
                int i9 = calendar2.get(1);
                int i10 = calendar2.get(2);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(i10 + 1);
                sb2.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                sb2.append(i9);
                if (obj.equals(sb2.toString())) {
                    this.y++;
                    this.t = p0Var2;
                    z4 = z3 ? 1 : 0;
                }
            } else {
                z3 = true;
            }
            this.y = z3 ? 1 : 0;
            this.t = p0Var2;
            z4 = z3 ? 1 : 0;
        } else {
            z3 = true;
            z4 = false;
        }
        if (this.I.booleanValue()) {
            if (this.u != null) {
                java.lang.String str3 = this.J;
                if (str3 == null || str3.isEmpty() || (str = this.K) == null || str.isEmpty()) {
                    java.lang.String str4 = this.J;
                    if (str4 == null || str4.isEmpty()) {
                        java.lang.String str5 = this.K;
                        if (str5 != null && !str5.isEmpty()) {
                            equals = this.u.c().equals(this.K);
                        }
                    } else {
                        equals = this.u.a().equals(this.J);
                    }
                    z5 = equals;
                    com.dyneti.android.dyscan.c2 c2Var = new com.dyneti.android.dyscan.c2(arrayList3, this.x, null, this.C, false, false, false, null, null, this.h.f3321a.r, false);
                    if (this.z < 2 || (z && z2)) {
                        z6 = true;
                        this.m = true;
                        this.x = this.u;
                    } else {
                        z6 = true;
                    }
                    if (this.y < 2 || (z && z4)) {
                        this.w = this.t;
                    }
                    if (this.v != null) {
                        boolean z7 = java.lang.System.currentTimeMillis() - this.v.longValue() > 1500 ? z6 : false;
                        com.dyneti.android.dyscan.y yVar4 = this.x;
                        if (yVar4 == null || this.w == null) {
                            z6 = false;
                        }
                        if ((z7 || z6) && z5) {
                            c2Var = new com.dyneti.android.dyscan.c2(arrayList3, yVar4, this.w, this.C, this.F, this.E, this.D, this.A, this.B, this.h.f3321a.r, true);
                        }
                    } else if (this.x != null) {
                        this.v = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                    }
                    com.dyneti.android.dyscan.c2 c2Var2 = c2Var;
                    c2Var2.i = this.m;
                    if (this.I.booleanValue() && !z5) {
                        this.C.clear();
                        this.E = false;
                        this.F = false;
                        this.D = false;
                        this.v = null;
                    }
                    return c2Var2;
                }
                if (this.u.a().equals(this.J)) {
                }
            }
            z5 = false;
            com.dyneti.android.dyscan.c2 c2Var3 = new com.dyneti.android.dyscan.c2(arrayList3, this.x, null, this.C, false, false, false, null, null, this.h.f3321a.r, false);
            if (this.z < 2) {
            }
            z6 = true;
            this.m = true;
            this.x = this.u;
            if (this.y < 2) {
            }
            this.w = this.t;
            if (this.v != null) {
            }
            com.dyneti.android.dyscan.c2 c2Var22 = c2Var3;
            c2Var22.i = this.m;
            if (this.I.booleanValue()) {
                this.C.clear();
                this.E = false;
                this.F = false;
                this.D = false;
                this.v = null;
            }
            return c2Var22;
        }
        z5 = z3;
        com.dyneti.android.dyscan.c2 c2Var32 = new com.dyneti.android.dyscan.c2(arrayList3, this.x, null, this.C, false, false, false, null, null, this.h.f3321a.r, false);
        if (this.z < 2) {
        }
        z6 = true;
        this.m = true;
        this.x = this.u;
        if (this.y < 2) {
        }
        this.w = this.t;
        if (this.v != null) {
        }
        com.dyneti.android.dyscan.c2 c2Var222 = c2Var32;
        c2Var222.i = this.m;
        if (this.I.booleanValue()) {
        }
        return c2Var222;
    }

    public final com.dyneti.android.dyscan.f2[] a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.n; i++) {
            float f = this.l[0][i];
            if (f > java.lang.Math.min(this.f3317o, this.p)) {
                float[] fArr = this.k[0][i];
                if (f <= 1.0f) {
                    float f2 = fArr[1];
                    float f3 = fArr[3];
                    if (f2 < f3) {
                        float f4 = fArr[0];
                        float f5 = fArr[2];
                        if (f4 < f5) {
                            com.dyneti.android.dyscan.l lVar = new com.dyneti.android.dyscan.l(f4, f2, f5, f3);
                            int i2 = (int) this.j[0][i];
                            if (i2 >= 0) {
                                java.lang.String[] strArr = this.f;
                                if (i2 < strArr.length) {
                                    java.lang.String str = strArr[i2];
                                    arrayList.add(new com.dyneti.android.dyscan.f2(f, str, lVar));
                                    if (this.H.contains(str)) {
                                        com.dyneti.android.dyscan.t1 t1Var = this.i;
                                        if (t1Var.h == null) {
                                            t1Var.h = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - t1Var.f3341a);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        com.dyneti.android.dyscan.f2[] f2VarArr = (com.dyneti.android.dyscan.f2[]) arrayList.toArray(new com.dyneti.android.dyscan.f2[arrayList.size()]);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i3 = 0; i3 < this.f.length; i3++) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (int i4 = 0; i4 < f2VarArr.length; i4++) {
                if (f2VarArr[i4].b.equals(this.f[i3])) {
                    arrayList3.add(java.lang.Integer.valueOf(i4));
                }
            }
            arrayList2.addAll(java.util.Arrays.asList(a(f2VarArr, (java.lang.Integer[]) arrayList3.toArray(new java.lang.Integer[arrayList3.size()]), 0.6000000238418579d, 20)));
        }
        return (com.dyneti.android.dyscan.f2[]) arrayList2.toArray(new com.dyneti.android.dyscan.f2[arrayList2.size()]);
    }

    public static com.dyneti.android.dyscan.f2[] a(com.dyneti.android.dyscan.f2[] f2VarArr, java.lang.Integer[] numArr, double d, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Integer num : numArr) {
            arrayList.add(f2VarArr[num.intValue()]);
        }
        java.util.Collections.sort(arrayList, com.dyneti.android.dyscan.f2.e);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.dyneti.android.dyscan.f2 f2Var = (com.dyneti.android.dyscan.f2) it.next();
            if (arrayList2.size() >= i) {
                break;
            }
            java.util.Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList2.add(f2Var);
                    break;
                }
                if (com.dyneti.android.dyscan.l.a(f2Var.c, ((com.dyneti.android.dyscan.f2) it2.next()).c) > d) {
                    break;
                }
            }
        }
        int size = arrayList2.size();
        com.dyneti.android.dyscan.f2[] f2VarArr2 = new com.dyneti.android.dyscan.f2[size];
        for (int i2 = 0; i2 < size; i2++) {
            f2VarArr2[i2] = (com.dyneti.android.dyscan.f2) arrayList2.get(i2);
        }
        return f2VarArr2;
    }

    public static com.dyneti.android.dyscan.d0[] a(java.util.ArrayList arrayList) {
        com.dyneti.android.dyscan.l[] lVarArr = new com.dyneti.android.dyscan.l[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            lVarArr[i] = ((com.dyneti.android.dyscan.f2) arrayList.get(i)).c;
        }
        int[] a2 = a(lVarArr, 0.6f, -0.9f);
        int a3 = a(a2);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i2 = 0; i2 < a3; i2++) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (a2[i3] == i2) {
                    arrayList3.add((com.dyneti.android.dyscan.f2) arrayList.get(i3));
                }
            }
            arrayList2.add(new com.dyneti.android.dyscan.d0(arrayList3));
        }
        return (com.dyneti.android.dyscan.d0[]) arrayList2.toArray(new com.dyneti.android.dyscan.d0[arrayList2.size()]);
    }

    public static int[] a(com.dyneti.android.dyscan.l[] lVarArr, float f, float f2) {
        int[] iArr = new int[lVarArr.length];
        java.util.Arrays.fill(iArr, -1);
        int i = 0;
        for (int i2 = 0; i2 < lVarArr.length; i2++) {
            if (iArr[i2] == -1) {
                iArr[i2] = i;
                java.util.Iterator it = a(i2, lVarArr, new java.util.ArrayList(), iArr, f, f2).iterator();
                while (it.hasNext()) {
                    iArr[((java.lang.Integer) it.next()).intValue()] = i;
                }
                i++;
            }
        }
        return iArr;
    }

    public static java.util.ArrayList a(int i, com.dyneti.android.dyscan.l[] lVarArr, java.util.ArrayList arrayList, int[] iArr, float f, float f2) {
        double d;
        double d2;
        java.util.ArrayList a2;
        if (arrayList.size() > iArr.length) {
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
        for (int i2 = 0; i2 < lVarArr.length; i2++) {
            com.dyneti.android.dyscan.l lVar = lVarArr[i2];
            if (iArr[i2] == -1) {
                com.dyneti.android.dyscan.l lVar2 = lVarArr[i];
                float f3 = lVar2.d;
                float f4 = lVar2.c;
                float f5 = f3 - f4;
                float f6 = lVar2.b;
                float f7 = lVar2.f3318a;
                float f8 = f6 - f7;
                float f9 = f4 - ((f2 * f5) / 2.0f);
                float f10 = ((f2 + 1.0f) * f5) + f9;
                float f11 = f7 - ((f * f8) / 2.0f);
                float f12 = ((f + 1.0f) * f8) + f11;
                double d3 = (f10 - f9) * (f12 - f11);
                if (d3 > 0.0d) {
                    float f13 = lVar.b;
                    float f14 = lVar.f3318a;
                    double d4 = (lVar.d - lVar.c) * (f13 - f14);
                    if (d4 <= 0.0d) {
                        d = 0.0d;
                    } else {
                        float max = java.lang.Math.max(f11, f14);
                        float max2 = java.lang.Math.max(f9, lVar.c);
                        float min = java.lang.Math.min(f12, lVar.b);
                        d = 0.0d;
                        double max3 = java.lang.Math.max(min - max, 0.0d) * java.lang.Math.max(java.lang.Math.min(f10, lVar.d) - max2, 0.0d);
                        d2 = max3 / ((d3 + d4) - max3);
                        if (d2 > d && !arrayList2.contains(java.lang.Integer.valueOf(i2))) {
                            arrayList2.add(java.lang.Integer.valueOf(i2));
                            a2 = a(i2, lVarArr, arrayList2, iArr, f, f2);
                            if (arrayList2.size() >= 5000 || a2.size() < 5000) {
                                arrayList2.addAll(a2);
                            }
                        }
                    }
                } else {
                    d = 0.0d;
                }
                d2 = d;
                if (d2 > d) {
                    arrayList2.add(java.lang.Integer.valueOf(i2));
                    a2 = a(i2, lVarArr, arrayList2, iArr, f, f2);
                    if (arrayList2.size() >= 5000) {
                    }
                    arrayList2.addAll(a2);
                }
            }
        }
        return arrayList2;
    }

    public static java.util.ArrayList a(com.dyneti.android.dyscan.d0[] d0VarArr) {
        int i;
        java.util.ArrayList arrayList;
        boolean z;
        int i2;
        com.dyneti.android.dyscan.l[] lVarArr = new com.dyneti.android.dyscan.l[d0VarArr.length];
        int i3 = 0;
        for (int i4 = 0; i4 < d0VarArr.length; i4++) {
            lVarArr[i4] = d0VarArr[i4].f3296a;
        }
        int[] a2 = a(lVarArr, 2.0f, -0.9f);
        int a3 = a(a2);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (com.dyneti.android.dyscan.d0 d0Var : d0VarArr) {
            if (d0Var.b.length() == 4) {
                arrayList2.add(d0Var);
                arrayList3.add(d0Var.f3296a);
            }
        }
        int size = arrayList3.size();
        com.dyneti.android.dyscan.l[] lVarArr2 = new com.dyneti.android.dyscan.l[size];
        for (int i5 = 0; i5 < size; i5++) {
            lVarArr2[i5] = (com.dyneti.android.dyscan.l) arrayList3.get(i5);
        }
        int[] a4 = a(lVarArr2, -0.75f, 1.5f);
        int a5 = a(a4);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (int i6 = 0; i6 < a3; i6++) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            for (int i7 = 0; i7 < d0VarArr.length; i7++) {
                if (a2[i7] == i6) {
                    arrayList5.add(d0VarArr[i7]);
                }
            }
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            arrayList4.add(new com.dyneti.android.dyscan.e0(arrayList5, bool, bool));
        }
        for (int i8 = 0; i8 < a5; i8++) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                if (a4[i9] == i8) {
                    arrayList6.add((com.dyneti.android.dyscan.d0) arrayList2.get(i9));
                }
            }
            arrayList4.add(new com.dyneti.android.dyscan.e0(arrayList6, java.lang.Boolean.TRUE, java.lang.Boolean.FALSE));
        }
        if (size >= 4) {
            int i10 = 0;
            while (true) {
                boolean z2 = true;
                if (i10 >= arrayList2.size() - 1) {
                    break;
                }
                int i11 = a4[i10] + a3;
                if (i11 >= 0 && i11 < arrayList4.size()) {
                    com.dyneti.android.dyscan.e0 e0Var = (com.dyneti.android.dyscan.e0) arrayList4.get(i11);
                    int i12 = 2;
                    if (e0Var.b.size() == 2) {
                        com.dyneti.android.dyscan.d0 d0Var2 = (com.dyneti.android.dyscan.d0) e0Var.b.get(i3);
                        for (com.dyneti.android.dyscan.d0 d0Var3 : e0Var.b) {
                            if (java.lang.Float.compare(d0Var2.f3296a.c, d0Var3.f3296a.c) > 0) {
                                d0Var2 = d0Var3;
                            }
                        }
                        com.dyneti.android.dyscan.d0 d0Var4 = (com.dyneti.android.dyscan.d0) e0Var.b.get(i3);
                        for (com.dyneti.android.dyscan.d0 d0Var5 : e0Var.b) {
                            if (java.lang.Float.compare(d0Var4.f3296a.c, d0Var5.f3296a.c) < 0) {
                                d0Var4 = d0Var5;
                            }
                        }
                        int i13 = i10 + 1;
                        while (i13 < arrayList2.size()) {
                            int i14 = a4[i13] + a3;
                            if (i14 >= 0 && i14 < arrayList4.size()) {
                                com.dyneti.android.dyscan.e0 e0Var2 = (com.dyneti.android.dyscan.e0) arrayList4.get(i14);
                                if (e0Var2.b.size() == i12) {
                                    com.dyneti.android.dyscan.d0 d0Var6 = (com.dyneti.android.dyscan.d0) e0Var2.b.get(i3);
                                    for (com.dyneti.android.dyscan.d0 d0Var7 : e0Var2.b) {
                                        if (java.lang.Float.compare(d0Var6.f3296a.c, d0Var7.f3296a.c) > 0) {
                                            d0Var6 = d0Var7;
                                        }
                                    }
                                    com.dyneti.android.dyscan.d0 d0Var8 = (com.dyneti.android.dyscan.d0) e0Var2.b.get(i3);
                                    for (com.dyneti.android.dyscan.d0 d0Var9 : e0Var2.b) {
                                        if (java.lang.Float.compare(d0Var8.f3296a.c, d0Var9.f3296a.c) < 0) {
                                            d0Var8 = d0Var9;
                                        }
                                    }
                                    if (java.util.Objects.equals(d0Var2.b, d0Var6.b) || java.util.Objects.equals(d0Var4.b, d0Var8.b)) {
                                        i = a3;
                                        arrayList = arrayList2;
                                        z = z2;
                                        i2 = 2;
                                    } else {
                                        com.dyneti.android.dyscan.l lVar = d0Var2.f3296a;
                                        float f = lVar.d;
                                        float f2 = lVar.c;
                                        com.dyneti.android.dyscan.l lVar2 = d0Var6.f3296a;
                                        float f3 = lVar2.d;
                                        float f4 = lVar2.c;
                                        com.dyneti.android.dyscan.l lVar3 = d0Var4.f3296a;
                                        float f5 = lVar3.d;
                                        float f6 = lVar3.c;
                                        i = a3;
                                        com.dyneti.android.dyscan.l lVar4 = d0Var8.f3296a;
                                        arrayList = arrayList2;
                                        java.util.List asList = java.util.Arrays.asList(java.lang.Float.valueOf(f - f2), java.lang.Float.valueOf(f3 - f4), java.lang.Float.valueOf(f5 - f6), java.lang.Float.valueOf(lVar4.d - lVar4.c));
                                        java.util.List asList2 = java.util.Arrays.asList(java.lang.Float.valueOf(d0Var2.f3296a.f3318a), java.lang.Float.valueOf(d0Var6.f3296a.f3318a), java.lang.Float.valueOf(d0Var4.f3296a.f3318a), java.lang.Float.valueOf(d0Var8.f3296a.f3318a));
                                        if (java.lang.Math.abs(((java.lang.Float) asList.get(0)).floatValue() - ((java.lang.Float) asList.get(1)).floatValue()) < 0.025f) {
                                            i2 = 2;
                                            if (java.lang.Math.abs(((java.lang.Float) asList.get(2)).floatValue() - ((java.lang.Float) asList.get(3)).floatValue()) < 0.025f) {
                                                i3 = 0;
                                                z = true;
                                                arrayList4.add(new com.dyneti.android.dyscan.e0(((java.lang.Float) asList2.get(0)).floatValue() < ((java.lang.Float) asList2.get(1)).floatValue() ? new java.util.ArrayList(java.util.Arrays.asList(d0Var2, d0Var6, d0Var4, d0Var8)) : new java.util.ArrayList(java.util.Arrays.asList(d0Var6, d0Var2, d0Var8, d0Var4)), java.lang.Boolean.FALSE, java.lang.Boolean.TRUE));
                                            } else {
                                                i3 = 0;
                                            }
                                        } else {
                                            i3 = 0;
                                            i2 = 2;
                                        }
                                        z = true;
                                    }
                                    i13++;
                                    i12 = i2;
                                    z2 = z;
                                    a3 = i;
                                    arrayList2 = arrayList;
                                }
                            }
                            i = a3;
                            arrayList = arrayList2;
                            z = z2;
                            i2 = i12;
                            i13++;
                            i12 = i2;
                            z2 = z;
                            a3 = i;
                            arrayList2 = arrayList;
                        }
                    }
                }
                i10++;
                a3 = a3;
                arrayList2 = arrayList2;
            }
        }
        return arrayList4;
    }

    public static int a(int[] iArr) {
        int i = -1;
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i + 1;
    }
}
