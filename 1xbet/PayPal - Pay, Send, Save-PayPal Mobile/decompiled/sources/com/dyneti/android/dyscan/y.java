package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public class y {
    public static final com.dyneti.android.dyscan.v k = new com.dyneti.android.dyscan.v();

    /* renamed from: a, reason: collision with root package name */
    public final com.dyneti.android.dyscan.w f3352a;
    public java.lang.String b;
    public final boolean c;
    public final boolean d;
    public final int[] e;
    public final boolean f;
    public boolean g;
    public final boolean h;
    public com.dyneti.android.dyscan.l i;
    public final java.util.ArrayList j;

    public y(com.dyneti.android.dyscan.e0 e0Var, com.dyneti.android.dyscan.f2[] f2VarArr, boolean z, com.dyneti.android.dyscan.h1 h1Var) {
        int i;
        int[] iArr;
        int i2;
        int[] iArr2;
        int i3;
        com.dyneti.android.dyscan.l[] lVarArr;
        java.lang.String str;
        com.dyneti.android.dyscan.w wVar;
        boolean z2;
        boolean z3;
        boolean z4;
        this.c = false;
        this.d = false;
        this.j = e0Var.b;
        this.g = e0Var.e;
        this.h = e0Var.f;
        this.i = e0Var.f3299a;
        java.lang.String join = java.lang.String.join("", e0Var.d);
        if (join.contains(".") || join.contains(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) || join.contains("-")) {
            return;
        }
        java.lang.String replace = join.replace(" ", "");
        if (replace.matches("\\d+")) {
            java.lang.String obj = new java.lang.StringBuilder(replace).reverse().toString();
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = 1;
                if (i4 >= obj.length()) {
                    break;
                }
                int charAt = obj.charAt(i4) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                i5 = i4 % 2 == 1 ? charAt == 9 ? i5 + 9 : ((charAt * 2) % 9) + i5 : i5 + charAt;
                i4++;
            }
            if (i5 % 10 == 0) {
                if (this.h) {
                    this.e = new int[]{4, 4, 4, 4};
                    this.d = true;
                } else if (this.g) {
                    this.e = new int[]{4, 4, 4, 4};
                    this.d = true;
                } else {
                    com.dyneti.android.dyscan.l[] lVarArr2 = e0Var.c;
                    int size = e0Var.d.size();
                    androidx.collection.SparseArrayCompat sparseArrayCompat = new androidx.collection.SparseArrayCompat();
                    sparseArrayCompat.put(15, new int[]{2});
                    sparseArrayCompat.put(16, new int[]{3});
                    sparseArrayCompat.put(18, new int[]{1, 2});
                    sparseArrayCompat.put(19, new int[]{0, 2, 3, 4});
                    int[] iArr3 = (int[]) sparseArrayCompat.get(join.length());
                    if (iArr3 != null) {
                        int length = iArr3.length;
                        int i6 = 0;
                        while (i6 < length) {
                            int i7 = iArr3[i6];
                            int i8 = i7 + 1;
                            if (size <= i8) {
                                int length2 = lVarArr2.length;
                                double[] dArr = new double[length2];
                                i2 = size;
                                iArr2 = iArr3;
                                int i9 = 0;
                                while (i9 < lVarArr2.length - i) {
                                    dArr[i9] = lVarArr2[r4].f3318a - lVarArr2[i9].b;
                                    lVarArr2 = lVarArr2;
                                    i9++;
                                    length = length;
                                    i = 1;
                                }
                                i3 = length;
                                com.dyneti.android.dyscan.l[] lVarArr3 = lVarArr2;
                                java.lang.Integer[] numArr = new java.lang.Integer[length2];
                                for (int i10 = 0; i10 < length2; i10++) {
                                    numArr[i10] = java.lang.Integer.valueOf(i10);
                                }
                                java.util.Arrays.sort(numArr, new com.dyneti.android.dyscan.u(dArr));
                                int[] iArr4 = new int[i7];
                                for (int i11 = 0; i11 < i7; i11++) {
                                    iArr4[i11] = numArr[i11].intValue();
                                }
                                java.util.Arrays.sort(iArr4);
                                if (i7 > 0) {
                                    java.lang.String str2 = "";
                                    int i12 = 0;
                                    int i13 = 0;
                                    while (i12 < i8) {
                                        int length3 = i12 < i7 ? iArr4[i12] : join.length() - 1;
                                        while (i13 <= length3) {
                                            int i14 = i13 + 1;
                                            str2 = str2.concat(join.substring(i13, i14));
                                            i13 = i14;
                                        }
                                        if (i13 < join.length()) {
                                            str2 = str2.concat(" ");
                                        }
                                        i12++;
                                    }
                                    androidx.collection.SparseArrayCompat sparseArrayCompat2 = new androidx.collection.SparseArrayCompat();
                                    sparseArrayCompat2.put(0, new int[]{4, 4, 4, 4});
                                    sparseArrayCompat2.put(1, new int[]{4, 6, 5});
                                    sparseArrayCompat2.put(2, new int[]{8, 10});
                                    sparseArrayCompat2.put(3, new int[]{6, 4, 5, 4});
                                    lVarArr = lVarArr3;
                                    sparseArrayCompat2.put(4, new int[]{6, 12});
                                    sparseArrayCompat2.put(5, new int[]{10, 5, 3});
                                    sparseArrayCompat2.put(6, new int[]{8, 8, 3});
                                    iArr = new int[0];
                                    java.lang.String[] split = str2.split(" ");
                                    boolean z5 = false;
                                    for (int i15 = 0; i15 < sparseArrayCompat2.size(); i15++) {
                                        int[] iArr5 = (int[]) sparseArrayCompat2.get(i15);
                                        if (iArr5.length == split.length) {
                                            boolean z6 = z5;
                                            int i16 = 0;
                                            while (true) {
                                                if (i16 >= iArr5.length) {
                                                    z5 = z6;
                                                    break;
                                                } else if (iArr5[i16] != split[i16].length()) {
                                                    z5 = false;
                                                    break;
                                                } else {
                                                    i16++;
                                                    iArr = iArr5;
                                                    z6 = true;
                                                }
                                            }
                                        }
                                        if (z5) {
                                            break;
                                        }
                                    }
                                    iArr = z5 ? iArr : new int[0];
                                    if (iArr.length > 0) {
                                        break;
                                    }
                                } else {
                                    lVarArr = lVarArr3;
                                }
                            } else {
                                i2 = size;
                                iArr2 = iArr3;
                                i3 = length;
                                lVarArr = lVarArr2;
                            }
                            i6++;
                            size = i2;
                            iArr3 = iArr2;
                            lVarArr2 = lVarArr;
                            length = i3;
                            i = 1;
                        }
                    }
                    iArr = new int[0];
                    this.e = iArr;
                    this.d = iArr.length > 0;
                }
                boolean z7 = this.d;
                boolean z8 = h1Var != null;
                if (join.length() != 15 && join.length() != 16 && !z7 && !z8) {
                    if (join.length() < 10 || !z) {
                        return;
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.util.Iterator it = this.j.iterator();
                    while (it.hasNext()) {
                        sb.append(((com.dyneti.android.dyscan.d0) it.next()).b);
                        sb.append(" ");
                    }
                    java.lang.String trim = sb.toString().trim();
                    java.lang.String substring = trim.substring(0, 2);
                    java.lang.String substring2 = trim.substring(2);
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(substring);
                    sb2.append(substring2.replaceAll("[0-9]", "0"));
                    java.lang.String obj2 = sb2.toString();
                    com.dyneti.android.dyscan.t1 a2 = com.dyneti.android.dyscan.t1.a();
                    if (a2.e.contains(obj2)) {
                        return;
                    }
                    a2.e.add(obj2);
                    return;
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                com.dyneti.android.dyscan.w wVar2 = com.dyneti.android.dyscan.w.visa;
                hashMap.put(wVar2, new java.lang.String[]{"4"});
                com.dyneti.android.dyscan.w wVar3 = com.dyneti.android.dyscan.w.mastercard;
                hashMap.put(wVar3, new java.lang.String[]{"603", "51", "52", "53", "54", "55", "23", "24", "25", "26", "271", "2720", "2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229"});
                com.dyneti.android.dyscan.w wVar4 = com.dyneti.android.dyscan.w.amex;
                hashMap.put(wVar4, new java.lang.String[]{"34", "37"});
                com.dyneti.android.dyscan.w wVar5 = com.dyneti.android.dyscan.w.discover;
                hashMap.put(wVar5, new java.lang.String[]{"6011", "64", "65"});
                com.dyneti.android.dyscan.w wVar6 = com.dyneti.android.dyscan.w.jcb;
                hashMap.put(wVar6, new java.lang.String[]{"3528", "3529", "353", "354", "355", "356", "357", "358"});
                com.dyneti.android.dyscan.w wVar7 = com.dyneti.android.dyscan.w.unionpay;
                hashMap.put(wVar7, new java.lang.String[]{"62"});
                com.dyneti.android.dyscan.w wVar8 = com.dyneti.android.dyscan.w.dinersclub;
                hashMap.put(wVar8, new java.lang.String[]{"36", "300", "301", "302", com.paypal.oslo.feature.pushnotification.shared.domain.CommsEventTypes.V1, "304", "305", "3095", "38", "39"});
                com.dyneti.android.dyscan.w wVar9 = com.dyneti.android.dyscan.w.maestro;
                hashMap.put(wVar9, new java.lang.String[]{"50", "56", "57", "58", "639", "67"});
                com.dyneti.android.dyscan.w wVar10 = com.dyneti.android.dyscan.w.nationalVietnam;
                hashMap.put(wVar10, new java.lang.String[]{"9704"});
                com.dyneti.android.dyscan.w wVar11 = com.dyneti.android.dyscan.w.national;
                hashMap.put(wVar11, new java.lang.String[]{"9004", "9008", "9010", "9012", "9016", "9020", "9024", "9028", "9031", "9032", "9036", "9040", "9044", "9048", "9050", "9051", "9052", "9056", "9060", "9064", "9068", "9070", "9072", "9074", "9076", "9084", "9086", "9090", "9092", "9096", "9100", "9104", "9108", "9112", "9116", "9120", "9124", "9132", "9136", "9140", "9144", "9148", "9152", "9156", "9158", "9162", "9166", "9170", "9174", "9175", "9178", "9180", "9184", "9188", "9191", "9192", "9196", "9203", "9204", "9208", "9212", "9214", "9218", "9222", "9226", "9231", "9232", "9233", "9234", "9238", "9239", "9242", "9246", "9248", "9250", "9254", "9258", "9260", "9262", "9266", "9268", "9270", "9275", "9276", "9288", "9292", "9296", "9300", "9304", "9308", "9312", "9316", "9320", "9324", "9328", "9332", "9334", "9336", "9340", "9344", "9348", "9352", "9356", "9360", "9364", "9368", "9372", "9376", "9380", "9384", "9388", "9392", "9398", "9400", "9404", "9408", "9410", "9414", "9417", "9418", "9422", "9426", "9428", "9430", "9434", "9438", "9440", "9442", "9446", "9450", "9454", "9458", "9462", "9466", "9470", "9474", "9478", "9480", "9484", "9492", "9496", "9498", "9499", "9500", "9504", "9508", "9512", "9516", "9520", "9524", "9528", "9531", "9533", "9534", "9535", "9540", "9548", "9554", "9558", "9562", "9566", "9570", "9574", "9578", "9580", "9581", "9583", "9584", "9585", "9586", "9591", "9598", "9600", "9604", "9608", "9612", "9616", "9620", "9624", "9626", "9630", "9634", "9638", "9642", "9643", "9646", "9652", "9654", "9659", "9660", "9662", "9663", "9666", "9670", "9674", "9678", "9682", "9686", "9688", "9690", "9694", "9702", "9703", "9705", "9706", "9710", "9716", "9724", "9728", "9729", "9732", "9740", "9744", "9748", "9752", "9756", "9760", "9762", "9764", "9768", "9772", "9776", "9780", "9784", "9788", "9792", "9795", "9796", "9798", "9800", "9804", "9807", "9818", "9826", "9831", "9832", "9833", "9834", "9840", "9850", "9854", "9858", "9860", "9862", "9876", "9882", "9887", "9894"});
                com.dyneti.android.dyscan.w wVar12 = com.dyneti.android.dyscan.w.mealcard;
                hashMap.put(wVar12, new java.lang.String[]{"637"});
                java.util.HashMap hashMap2 = new java.util.HashMap();
                java.lang.String str3 = join;
                hashMap2.put(wVar2, new int[]{16, 19});
                hashMap2.put(wVar3, new int[]{16, 19});
                hashMap2.put(wVar4, new int[]{15});
                hashMap2.put(wVar5, new int[]{16});
                hashMap2.put(wVar6, new int[]{16});
                hashMap2.put(wVar7, new int[]{16});
                hashMap2.put(wVar8, new int[]{16});
                hashMap2.put(wVar9, new int[]{12, 13, 14, 15, 16, 17, 18, 19});
                hashMap2.put(wVar10, new int[]{16, 19});
                hashMap2.put(wVar11, new int[]{16});
                hashMap2.put(wVar12, new int[]{16});
                java.util.Iterator it2 = hashMap.keySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        str = str3;
                        wVar = com.dyneti.android.dyscan.w.other;
                        break;
                    }
                    wVar = (com.dyneti.android.dyscan.w) it2.next();
                    java.lang.String[] strArr = (java.lang.String[]) hashMap.get(wVar);
                    if (strArr != null && strArr.length > 0) {
                        int length4 = strArr.length;
                        int i17 = 0;
                        while (i17 < length4) {
                            str = str3;
                            if (str.startsWith(strArr[i17])) {
                                z3 = true;
                                break;
                            } else {
                                i17++;
                                str3 = str;
                            }
                        }
                    }
                    str = str3;
                    z3 = false;
                    int[] iArr6 = (int[]) hashMap2.get(wVar);
                    if (iArr6 != null && iArr6.length > 0) {
                        for (int i18 : iArr6) {
                            if (str.length() == i18) {
                                z4 = true;
                                break;
                            }
                        }
                    }
                    z4 = false;
                    if (z3 && z4) {
                        break;
                    } else {
                        str3 = str;
                    }
                }
                this.f3352a = wVar;
                if ((h1Var == null || h1Var.a(str)) && wVar != com.dyneti.android.dyscan.w.other) {
                    this.b = str;
                    this.c = true;
                    if (f2VarArr != null && f2VarArr.length != 0) {
                        int ordinal = wVar.ordinal();
                        if (ordinal == 0) {
                            for (com.dyneti.android.dyscan.f2 f2Var : f2VarArr) {
                                if (f2Var.b.equals(com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.BRAND_VISA) || f2Var.b.equals("visaholo")) {
                                }
                            }
                            z2 = true;
                        } else if (ordinal == 1) {
                            for (com.dyneti.android.dyscan.f2 f2Var2 : f2VarArr) {
                                if (f2Var2.b.equals("mc") || f2Var2.b.equals("mcholo") || f2Var2.b.equals("elite")) {
                                }
                            }
                            z2 = true;
                        } else if (ordinal == 2) {
                            for (com.dyneti.android.dyscan.f2 f2Var3 : f2VarArr) {
                                if (f2Var3.b.equals(com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.BRAND_AMEX) || f2Var3.b.equals("amextext")) {
                                }
                            }
                            z2 = true;
                        } else if (ordinal == 3) {
                            for (com.dyneti.android.dyscan.f2 f2Var4 : f2VarArr) {
                                if (f2Var4.b.equals(com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper.BRAND_DISCOVER)) {
                                }
                            }
                            z2 = true;
                        }
                        this.f = z2;
                    }
                    z2 = false;
                    this.f = z2;
                }
            }
        }
    }

    public final java.lang.String a() {
        java.lang.String str = this.b;
        if (str == null) {
            return null;
        }
        java.lang.String replaceAll = str.replaceAll("\\D", "");
        return replaceAll.length() < 6 ? "" : replaceAll.substring(0, 6);
    }

    public java.lang.String b() {
        java.lang.String str = this.b;
        java.lang.String str2 = "";
        for (int i : this.e) {
            if (!android.text.TextUtils.isEmpty(str2)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str2);
                sb.append(" ");
                str2 = sb.toString();
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str2);
            sb2.append(str.substring(0, i));
            str2 = sb2.toString();
            str = str.substring(i);
        }
        return str2.isEmpty() ? this.b : str2;
    }

    public final java.lang.String c() {
        java.lang.String str = this.b;
        if (str == null) {
            return null;
        }
        java.lang.String replaceAll = str.replaceAll("\\D", "");
        if (replaceAll.length() < 4) {
            return null;
        }
        return replaceAll.substring(replaceAll.length() - 4);
    }

    public y() {
        this.c = false;
        this.d = false;
    }
}
