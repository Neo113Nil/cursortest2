package com.facetec.sdk;

/* loaded from: classes8.dex */
final class y {
    com.facetec.sdk.q d = new com.facetec.sdk.q();
    com.facetec.sdk.w b = new com.facetec.sdk.w();
    boolean e = false;

    /* renamed from: a, reason: collision with root package name */
    boolean f3774a = false;
    boolean c = false;

    y() {
    }

    final boolean e(java.util.List<java.util.List<java.lang.Integer>> list, int i, com.facetec.sdk.u uVar) {
        int i2;
        int i3;
        java.util.List list2;
        int i4;
        java.util.List<java.lang.Integer> list3;
        int i5;
        int i6;
        java.util.List<java.lang.Integer> list4;
        int i7;
        boolean z;
        int i8;
        int i9;
        int i10;
        int i11;
        java.util.List<java.lang.Integer> list5;
        com.facetec.sdk.aa aaVar;
        int intValue;
        java.util.List<java.util.List<java.lang.Integer>> list6 = list;
        int i12 = i;
        int i13 = 0;
        if (list.size() <= i12) {
            return false;
        }
        java.util.List asList = java.util.Arrays.asList(com.facetec.sdk.ad.c(com.facetec.sdk.ad.i(list6.subList(0, i12))));
        int i14 = i12;
        int i15 = 0;
        while (true) {
            int i16 = 1;
            if (i14 >= list.size()) {
                return i15 > 0;
            }
            java.util.List<java.lang.Integer> list7 = list6.get(i14);
            int i17 = i13;
            while (true) {
                if (i17 >= list7.size()) {
                    i2 = i13;
                    i3 = i2;
                    break;
                }
                if (asList.contains(list7.get(i17))) {
                    i2 = java.lang.Math.max(i13, i17 - 4);
                    i3 = 1;
                    break;
                }
                i17 += 3;
            }
            if (uVar == com.facetec.sdk.u.INTRA_SESSION || i3 != 0) {
                while (i2 < list7.size()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    int i18 = i13;
                    while (true) {
                        int i19 = i2 + i18;
                        if (i19 >= list7.size()) {
                            break;
                        }
                        int intValue2 = list7.get(i19).intValue();
                        arrayList.add(java.lang.Integer.valueOf(intValue2));
                        if (e(arrayList)) {
                            break;
                        }
                        if (intValue2 == ((java.lang.Integer) arrayList.get(arrayList.size() - i16)).intValue()) {
                            while (true) {
                                i19 += i16;
                                if (i19 < list7.size() && intValue2 == (intValue = list7.get(i19).intValue())) {
                                    arrayList.add(java.lang.Integer.valueOf(intValue));
                                    i18++;
                                }
                            }
                        }
                        i18 += i16;
                    }
                    if (e(arrayList)) {
                        int i20 = i13;
                        while (i20 < list.size() && (uVar == com.facetec.sdk.u.INTRA_SESSION || i20 < i12)) {
                            java.util.List<java.lang.Integer> list8 = list6.get(i20);
                            int i21 = i13;
                            while (i21 < list8.size() - arrayList.size()) {
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                int i22 = i13;
                                while (i22 < arrayList.size()) {
                                    int intValue3 = list8.get(i21 + i22).intValue();
                                    boolean z2 = intValue3 == ((java.lang.Integer) arrayList.get(i22)).intValue();
                                    boolean z3 = i21 == i2 && i20 == i14;
                                    if (z2 && !z3) {
                                        arrayList2.add(java.lang.Integer.valueOf(intValue3));
                                        if (arrayList2.size() == arrayList.size()) {
                                            int i23 = i15 + 1;
                                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                            list2 = asList;
                                            if (uVar == com.facetec.sdk.u.INTER_FACETEC_SESSION) {
                                                int i24 = 0;
                                                while (i24 < arrayList.size()) {
                                                    java.util.List<java.lang.Integer> list9 = list7;
                                                    int i25 = 0;
                                                    int i26 = 0;
                                                    while (true) {
                                                        if (i25 < this.b.d.size()) {
                                                            com.facetec.sdk.q qVar = this.b.d.get(i25);
                                                            i9 = i23;
                                                            i10 = i22;
                                                            list5 = list8;
                                                            int i27 = i26;
                                                            int i28 = 0;
                                                            int i29 = 0;
                                                            while (i28 < qVar.e.size()) {
                                                                java.util.List<java.lang.Integer> list10 = qVar.e.get(i28);
                                                                i11 = i2;
                                                                int i30 = i2 + i24 + i29;
                                                                i8 = i14;
                                                                if (i27 == i14 && i30 < qVar.b.size()) {
                                                                    aaVar = qVar.b.get(i30);
                                                                    break;
                                                                }
                                                                i27++;
                                                                i29 += list10.size();
                                                                i28++;
                                                                i14 = i8;
                                                                i2 = i11;
                                                            }
                                                            i25++;
                                                            i26 = i27;
                                                            list8 = list5;
                                                            i22 = i10;
                                                            i23 = i9;
                                                        } else {
                                                            i8 = i14;
                                                            i9 = i23;
                                                            i10 = i22;
                                                            i11 = i2;
                                                            list5 = list8;
                                                            aaVar = new com.facetec.sdk.aa();
                                                            break;
                                                        }
                                                    }
                                                    arrayList3.add(aaVar);
                                                    i24++;
                                                    list7 = list9;
                                                    list8 = list5;
                                                    i22 = i10;
                                                    i23 = i9;
                                                    i14 = i8;
                                                    i2 = i11;
                                                }
                                                i4 = i14;
                                                i7 = i23;
                                                list3 = list7;
                                                i5 = i22;
                                                i6 = i2;
                                                list4 = list8;
                                                for (int i31 = 0; i31 < arrayList2.size(); i31++) {
                                                    arrayList4.add(b(i20, i21 + i31));
                                                }
                                                this.d.g.add(new java.util.ArrayList(java.util.Arrays.asList(arrayList3, arrayList4)));
                                                z = true;
                                            } else {
                                                i4 = i14;
                                                i7 = i23;
                                                list3 = list7;
                                                i5 = i22;
                                                i6 = i2;
                                                list4 = list8;
                                                int i32 = uVar != com.facetec.sdk.u.INTRA_SESSION ? 0 : this.b.f3772a;
                                                for (int i33 = 0; i33 < arrayList.size(); i33++) {
                                                    arrayList3.add(b(i32 + i4, i6 + i33));
                                                }
                                                for (int i34 = 0; i34 < arrayList2.size(); i34++) {
                                                    arrayList4.add(b(i32 + i20, i21 + i34));
                                                }
                                                if (uVar == com.facetec.sdk.u.INTRA_SESSION) {
                                                    z = true;
                                                    this.d.d.add(new java.util.ArrayList(java.util.Arrays.asList(arrayList3, arrayList4)));
                                                } else {
                                                    z = true;
                                                    this.d.c.add(new java.util.ArrayList(java.util.Arrays.asList(arrayList3, arrayList4)));
                                                }
                                            }
                                            int i35 = i7;
                                            if (i35 == 5) {
                                                return z;
                                            }
                                            i15 = i35;
                                        } else {
                                            list2 = asList;
                                            i4 = i14;
                                            list3 = list7;
                                            i5 = i22;
                                            i6 = i2;
                                            list4 = list8;
                                        }
                                        i22 = i5 + 1;
                                        asList = list2;
                                        list7 = list3;
                                        list8 = list4;
                                        i14 = i4;
                                        i2 = i6;
                                    }
                                    i21++;
                                    asList = asList;
                                    list7 = list7;
                                    list8 = list8;
                                    i14 = i14;
                                    i2 = i2;
                                    i13 = 0;
                                }
                                i21++;
                                asList = asList;
                                list7 = list7;
                                list8 = list8;
                                i14 = i14;
                                i2 = i2;
                                i13 = 0;
                            }
                            i20++;
                            list6 = list;
                            i12 = i;
                            i13 = 0;
                        }
                    }
                    i2++;
                    list6 = list;
                    i12 = i;
                    asList = asList;
                    list7 = list7;
                    i14 = i14;
                    i13 = 0;
                    i16 = 1;
                }
            }
            i14++;
            list6 = list;
            i12 = i;
            asList = asList;
            i13 = 0;
        }
    }

    private com.facetec.sdk.aa b(int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < this.b.c.size(); i4++) {
            com.facetec.sdk.q qVar = this.b.c.get(i4);
            int i5 = 0;
            for (int i6 = 0; i6 < qVar.e.size(); i6++) {
                java.util.List<java.lang.Integer> list = qVar.e.get(i6);
                int i7 = i2 + i5;
                if (i3 == i && i7 < qVar.b.size()) {
                    return qVar.b.get(i7);
                }
                i3++;
                i5 += list.size();
            }
        }
        return new com.facetec.sdk.aa();
    }

    private static boolean e(java.util.List<java.lang.Integer> list) {
        return list.size() >= 3 && com.facetec.sdk.ad.h(list);
    }
}
