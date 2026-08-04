package p154w;

import java.util.ArrayList;
import java.util.Iterator;
import p149v.d;
import p149v.e;
import p149v.f;

/* JADX INFO: loaded from: classes.dex */
public final class c extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f17229k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17230l;

    public c(e eVar, int i7) {
        e eVar2;
        super(eVar);
        this.f17229k = new ArrayList();
        this.f17260f = i7;
        e eVar3 = this.f17256b;
        e eVarN = eVar3.n(i7);
        while (true) {
            e eVar4 = eVarN;
            eVar2 = eVar3;
            eVar3 = eVar4;
            if (eVar3 == null) {
                break;
            } else {
                eVarN = eVar3.n(this.f17260f);
            }
        }
        this.f17256b = eVar2;
        int i8 = this.f17260f;
        n nVar = i8 == 0 ? eVar2.f16954d : i8 == 1 ? eVar2.f16956e : null;
        ArrayList<n> arrayList = this.f17229k;
        arrayList.add(nVar);
        e eVarM = eVar2.m(this.f17260f);
        while (eVarM != null) {
            int i9 = this.f17260f;
            arrayList.add(i9 == 0 ? eVarM.f16954d : i9 == 1 ? eVarM.f16956e : null);
            eVarM = eVarM.m(this.f17260f);
        }
        for (n nVar2 : arrayList) {
            int i10 = this.f17260f;
            if (i10 == 0) {
                nVar2.f17256b.f16951b = this;
            } else if (i10 == 1) {
                nVar2.f17256b.f16953c = this;
            }
        }
        if (this.f17260f == 0 && ((f) this.f17256b.f16944V).f17014z0 && arrayList.size() > 1) {
            this.f17256b = ((n) arrayList.get(arrayList.size() - 1)).f17256b;
        }
        this.f17230l = this.f17260f == 0 ? this.f17256b.f16970l0 : this.f17256b.f16972m0;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0235  */
    /* JADX WARN: Code duplicated, block: B:147:0x0244 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x0246  */
    /* JADX WARN: Code duplicated, block: B:149:0x024a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x024c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0250  */
    /* JADX WARN: Code duplicated, block: B:153:0x0253  */
    /* JADX WARN: Code duplicated, block: B:156:0x0259 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x025b  */
    /* JADX WARN: Code duplicated, block: B:158:0x0260  */
    /* JADX WARN: Code duplicated, block: B:161:0x0273  */
    /* JADX WARN: Code duplicated, block: B:162:0x027e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0280 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x0282  */
    /* JADX WARN: Code duplicated, block: B:165:0x0284  */
    /* JADX WARN: Code duplicated, block: B:169:0x028b  */
    /* JADX WARN: Code duplicated, block: B:170:0x028f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0294  */
    /* JADX WARN: Code duplicated, block: B:173:0x0298  */
    /* JADX WARN: Code duplicated, block: B:176:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:178:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:179:0x02af  */
    /* JADX WARN: Code duplicated, block: B:181:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:182:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:184:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:186:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:194:0x02da  */
    /* JADX WARN: Code duplicated, block: B:196:0x02de  */
    /* JADX WARN: Code duplicated, block: B:198:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:201:0x02ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:202:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:203:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:206:0x0304  */
    /* JADX WARN: Code duplicated, block: B:207:0x030b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:208:0x030d  */
    /* JADX WARN: Code duplicated, block: B:209:0x030f  */
    /* JADX WARN: Code duplicated, block: B:213:0x0316  */
    /* JADX WARN: Code duplicated, block: B:214:0x031a  */
    /* JADX WARN: Code duplicated, block: B:216:0x031f  */
    /* JADX WARN: Code duplicated, block: B:217:0x0323  */
    /* JADX WARN: Code duplicated, block: B:224:0x033b  */
    /* JADX WARN: Code duplicated, block: B:225:0x033d  */
    /* JADX WARN: Code duplicated, block: B:227:0x0340  */
    /* JADX WARN: Code duplicated, block: B:228:0x0344  */
    /* JADX WARN: Code duplicated, block: B:235:0x0359  */
    /* JADX WARN: Code duplicated, block: B:237:0x035c  */
    /* JADX WARN: Code duplicated, block: B:239:0x0360  */
    /* JADX WARN: Code duplicated, block: B:240:0x0365  */
    /* JADX WARN: Code duplicated, block: B:242:0x036b  */
    /* JADX WARN: Code duplicated, block: B:246:0x037a  */
    /* JADX WARN: Code duplicated, block: B:248:0x037d  */
    /* JADX WARN: Code duplicated, block: B:249:0x0380  */
    /* JADX WARN: Code duplicated, block: B:252:0x0385 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x0387  */
    /* JADX WARN: Code duplicated, block: B:254:0x038c  */
    /* JADX WARN: Code duplicated, block: B:257:0x039f  */
    /* JADX WARN: Code duplicated, block: B:258:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:261:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:262:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:264:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:265:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:273:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:274:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:276:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:277:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:297:0x00ec A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00de  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0166  */
    @Override // p154w.d
    public final void a(d dVar) {
        int i7;
        d dVar2;
        ArrayList arrayList;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f7;
        boolean z4;
        d dVar3;
        ArrayList arrayList2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        d dVar4;
        float f8;
        int i19;
        int i20;
        int i21;
        int i22;
        n nVar;
        int i23;
        e eVar;
        e eVar2;
        f fVar;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        n nVar2;
        int i29;
        e eVar3;
        e eVar4;
        int i30;
        f fVar2;
        int iMin;
        int i31;
        int i32;
        int i33;
        int i34;
        n nVar3;
        int i35;
        e eVar5;
        e eVar6;
        f fVar3;
        int i36;
        d dVar5;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        float f9;
        e eVar7 = this.f17262h;
        if (eVar7.j) {
            e eVar8 = this.f17263i;
            if (eVar8.j) {
                e eVar9 = this.f17256b.f16944V;
                boolean z7 = eVar9 instanceof f ? ((f) eVar9).f17014z0 : false;
                int i43 = eVar8.f17237g - eVar7.f17237g;
                ArrayList arrayList3 = this.f17229k;
                int size = arrayList3.size();
                int i44 = 0;
                while (true) {
                    i7 = -1;
                    if (i44 >= size) {
                        i44 = -1;
                        break;
                    } else if (((n) arrayList3.get(i44)).f17256b.f16965i0 != 8) {
                        break;
                    } else {
                        i44++;
                    }
                }
                int i45 = size - 1;
                for (int i46 = i45; i46 >= 0; i46--) {
                    if (((n) arrayList3.get(i46)).f17256b.f16965i0 != 8) {
                        i7 = i46;
                        break;
                    }
                }
                int i47 = 0;
                while (true) {
                    dVar2 = d.f16920c;
                    if (i47 >= 2) {
                        arrayList = arrayList3;
                        i8 = size;
                        i9 = i44;
                        i10 = 0;
                        i11 = 0;
                        i12 = 0;
                        f7 = 0.0f;
                        break;
                    }
                    int i48 = 0;
                    i12 = 0;
                    int i49 = 0;
                    int i50 = 0;
                    f7 = 0.0f;
                    while (i48 < size) {
                        n nVar4 = (n) arrayList3.get(i48);
                        e eVar10 = nVar4.f17256b;
                        ArrayList arrayList4 = arrayList3;
                        int i51 = size;
                        if (eVar10.f16965i0 == 8) {
                            i41 = i44;
                        } else {
                            i50++;
                            if (i48 > 0 && i48 >= i44) {
                                i12 += nVar4.f17262h.f17236f;
                            }
                            f fVar4 = nVar4.f17259e;
                            int i52 = fVar4.f17237g;
                            boolean z8 = nVar4.f17258d != dVar2;
                            if (z8) {
                                int i53 = this.f17260f;
                                if (i53 == 0 && !eVar10.f16954d.f17259e.j) {
                                    return;
                                }
                                if (i53 == 1 && !eVar10.f16956e.f17259e.j) {
                                    return;
                                } else {
                                    i41 = i44;
                                }
                            } else {
                                i41 = i44;
                                if (nVar4.f17255a == 1 && i47 == 0) {
                                    i42 = fVar4.f17242m;
                                    i49++;
                                } else {
                                    if (fVar4.j) {
                                        i42 = i52;
                                    }
                                    if (z8) {
                                        i12 += i42;
                                    } else {
                                        i49++;
                                        f9 = eVar10.f16974n0[this.f17260f];
                                        if (f9 >= 0.0f) {
                                            f7 += f9;
                                        }
                                    }
                                    if (i48 >= i45 && i48 < i7) {
                                        i12 += -nVar4.f17263i.f17236f;
                                    }
                                }
                                z8 = true;
                                if (z8) {
                                    i49++;
                                    f9 = eVar10.f16974n0[this.f17260f];
                                    if (f9 >= 0.0f) {
                                        f7 += f9;
                                    }
                                } else {
                                    i12 += i42;
                                }
                                if (i48 >= i45) {
                                }
                            }
                            i42 = i52;
                            if (z8) {
                                i49++;
                                f9 = eVar10.f16974n0[this.f17260f];
                                if (f9 >= 0.0f) {
                                    f7 += f9;
                                }
                            } else {
                                i12 += i42;
                            }
                            if (i48 >= i45) {
                            }
                        }
                        i48++;
                        arrayList3 = arrayList4;
                        size = i51;
                        i44 = i41;
                    }
                    arrayList = arrayList3;
                    i8 = size;
                    i9 = i44;
                    if (i12 < i43 || i49 == 0) {
                        i10 = i49;
                        i11 = i50;
                        break;
                    } else {
                        i47++;
                        arrayList3 = arrayList;
                        size = i8;
                        i44 = i9;
                    }
                }
                int i54 = eVar7.f17237g;
                if (z7) {
                    i54 = eVar8.f17237g;
                }
                if (i12 > i43) {
                    i54 = z7 ? i54 + ((int) (((i12 - i43) / 2.0f) + 0.5f)) : i54 - ((int) (((i12 - i43) / 2.0f) + 0.5f));
                }
                if (i10 > 0) {
                    float f10 = i43 - i12;
                    int i55 = (int) ((f10 / i10) + 0.5f);
                    i13 = i8;
                    int i56 = 0;
                    int i57 = 0;
                    while (i56 < i13) {
                        ArrayList arrayList5 = arrayList;
                        int i58 = i55;
                        n nVar5 = (n) arrayList5.get(i56);
                        int i59 = i12;
                        e eVar11 = nVar5.f17256b;
                        int i60 = i54;
                        boolean z9 = z7;
                        if (eVar11.f16965i0 != 8 && nVar5.f17258d == dVar2) {
                            f fVar5 = nVar5.f17259e;
                            if (fVar5.j) {
                                dVar2 = dVar2;
                            } else {
                                int i61 = f7 > 0.0f ? (int) (((eVar11.f16974n0[this.f17260f] * f10) / f7) + 0.5f) : i58;
                                if (this.f17260f == 0) {
                                    i39 = eVar11.f16988v;
                                    i40 = eVar11.f16987u;
                                } else {
                                    i39 = eVar11.f16991y;
                                    i40 = eVar11.f16990x;
                                }
                                int iMax = Math.max(i40, nVar5.f17255a == 1 ? Math.min(i61, fVar5.f17242m) : i61);
                                if (i39 > 0) {
                                    iMax = Math.min(i39, iMax);
                                }
                                if (iMax != i61) {
                                    i57++;
                                    i61 = iMax;
                                }
                                fVar5.d(i61);
                            }
                        } else {
                            dVar2 = dVar2;
                        }
                        i56++;
                        i12 = i59;
                        i55 = i58;
                        i54 = i60;
                        z7 = z9;
                        dVar2 = dVar2;
                        f10 = f10;
                        arrayList = arrayList5;
                    }
                    i16 = i54;
                    z4 = z7;
                    dVar3 = dVar2;
                    int i62 = i12;
                    arrayList2 = arrayList;
                    if (i57 > 0) {
                        i10 -= i57;
                        int i63 = 0;
                        i12 = 0;
                        while (i63 < i13) {
                            n nVar6 = (n) arrayList2.get(i63);
                            if (nVar6.f17256b.f16965i0 == 8) {
                                i38 = i9;
                            } else {
                                i38 = i9;
                                if (i63 > 0 && i63 >= i38) {
                                    i12 += nVar6.f17262h.f17236f;
                                }
                                i12 += nVar6.f17259e.f17237g;
                                if (i63 < i45 && i63 < i7) {
                                    i12 += -nVar6.f17263i.f17236f;
                                }
                            }
                            i63++;
                            i9 = i38;
                        }
                        i14 = i9;
                    } else {
                        i14 = i9;
                        i12 = i62;
                    }
                    i15 = 2;
                    if (this.f17230l == 2 && i57 == 0) {
                        i17 = 0;
                        this.f17230l = 0;
                    }
                    if (i12 > i43) {
                        this.f17230l = i15;
                    }
                    if (i11 > 0 && i10 == 0 && i14 == i7) {
                        this.f17230l = i15;
                    }
                    i18 = this.f17230l;
                    if (i18 == 1) {
                        if (i11 > 1) {
                            i31 = (i43 - i12) / (i11 - 1);
                        } else if (i11 == 1) {
                            i31 = (i43 - i12) / 2;
                        } else {
                            i31 = i17;
                        }
                        if (i10 > 0) {
                            i31 = i17;
                        }
                        i32 = i17;
                        i33 = i16;
                        while (i32 < i13) {
                            if (z4) {
                                i34 = i13 - (i32 + 1);
                            } else {
                                i34 = i32;
                            }
                            nVar3 = (n) arrayList2.get(i34);
                            i35 = nVar3.f17256b.f16965i0;
                            eVar5 = nVar3.f17263i;
                            eVar6 = nVar3.f17262h;
                            if (i35 == 8) {
                                eVar6.d(i33);
                                eVar5.d(i33);
                                i37 = i31;
                                dVar5 = dVar3;
                            } else {
                                if (i32 > 0) {
                                    if (z4) {
                                        i33 -= i31;
                                    } else {
                                        i33 += i31;
                                    }
                                }
                                if (i32 > 0 && i32 >= i14) {
                                    if (z4) {
                                        i33 -= eVar6.f17236f;
                                    } else {
                                        i33 += eVar6.f17236f;
                                    }
                                }
                                if (z4) {
                                    eVar5.d(i33);
                                } else {
                                    eVar6.d(i33);
                                }
                                fVar3 = nVar3.f17259e;
                                i36 = fVar3.f17237g;
                                dVar5 = dVar3;
                                if (nVar3.f17258d == dVar5) {
                                    i37 = i31;
                                    if (nVar3.f17255a == 1) {
                                        i36 = fVar3.f17242m;
                                    }
                                } else {
                                    i37 = i31;
                                }
                                if (z4) {
                                    i33 -= i36;
                                } else {
                                    i33 += i36;
                                }
                                if (z4) {
                                    eVar6.d(i33);
                                } else {
                                    eVar5.d(i33);
                                }
                                nVar3.f17261g = true;
                                if (i32 >= i45 && i32 < i7) {
                                    i33 = z4 ? i33 - (-eVar5.f17236f) : i33 + (-eVar5.f17236f);
                                }
                            }
                            i32++;
                            i31 = i37;
                            dVar3 = dVar5;
                        }
                        return;
                    }
                    dVar4 = dVar3;
                    if (i18 == 0) {
                        i25 = (i43 - i12) / (i11 + 1);
                        if (i10 > 0) {
                            i25 = i17;
                        }
                        i27 = i16;
                        for (i26 = i17; i26 < i13; i26++) {
                            if (z4) {
                                i28 = i13 - (i26 + 1);
                            } else {
                                i28 = i26;
                            }
                            nVar2 = (n) arrayList2.get(i28);
                            i29 = nVar2.f17256b.f16965i0;
                            eVar3 = nVar2.f17263i;
                            eVar4 = nVar2.f17262h;
                            if (i29 == 8) {
                                eVar4.d(i27);
                                eVar3.d(i27);
                            } else {
                                if (z4) {
                                    i30 = i27 - i25;
                                } else {
                                    i30 = i27 + i25;
                                }
                                if (i26 > 0 && i26 >= i14) {
                                    if (z4) {
                                        i30 -= eVar4.f17236f;
                                    } else {
                                        i30 += eVar4.f17236f;
                                    }
                                }
                                if (z4) {
                                    eVar3.d(i30);
                                } else {
                                    eVar4.d(i30);
                                }
                                fVar2 = nVar2.f17259e;
                                iMin = fVar2.f17237g;
                                if (nVar2.f17258d == dVar4 && nVar2.f17255a == 1) {
                                    iMin = Math.min(iMin, fVar2.f17242m);
                                }
                                if (z4) {
                                    i27 = i30 - iMin;
                                } else {
                                    i27 = i30 + iMin;
                                }
                                if (z4) {
                                    eVar4.d(i27);
                                } else {
                                    eVar3.d(i27);
                                }
                                if (i26 >= i45 && i26 < i7) {
                                    i27 = z4 ? i27 - (-eVar3.f17236f) : i27 + (-eVar3.f17236f);
                                }
                            }
                        }
                        return;
                    }
                    if (i18 == 2) {
                        if (this.f17260f == 0) {
                            f8 = this.f17256b.f16959f0;
                        } else {
                            f8 = this.f17256b.f16961g0;
                        }
                        if (z4) {
                            f8 = 1.0f - f8;
                        }
                        i19 = (int) (((i43 - i12) * f8) + 0.5f);
                        if (i19 >= 0 || i10 > 0) {
                            i19 = i17;
                        }
                        if (z4) {
                            i20 = i16 - i19;
                        } else {
                            i20 = i16 + i19;
                        }
                        for (i21 = i17; i21 < i13; i21++) {
                            if (z4) {
                                i22 = i13 - (i21 + 1);
                            } else {
                                i22 = i21;
                            }
                            nVar = (n) arrayList2.get(i22);
                            i23 = nVar.f17256b.f16965i0;
                            eVar = nVar.f17263i;
                            eVar2 = nVar.f17262h;
                            if (i23 == 8) {
                                eVar2.d(i20);
                                eVar.d(i20);
                            } else {
                                if (i21 > 0 && i21 >= i14) {
                                    if (z4) {
                                        i20 -= eVar2.f17236f;
                                    } else {
                                        i20 += eVar2.f17236f;
                                    }
                                }
                                if (z4) {
                                    eVar.d(i20);
                                } else {
                                    eVar2.d(i20);
                                }
                                fVar = nVar.f17259e;
                                i24 = fVar.f17237g;
                                if (nVar.f17258d == dVar4 && nVar.f17255a == 1) {
                                    i24 = fVar.f17242m;
                                }
                                if (z4) {
                                    i20 -= i24;
                                } else {
                                    i20 += i24;
                                }
                                if (z4) {
                                    eVar2.d(i20);
                                } else {
                                    eVar.d(i20);
                                }
                                if (i21 >= i45 && i21 < i7) {
                                    i20 = z4 ? i20 - (-eVar.f17236f) : i20 + (-eVar.f17236f);
                                }
                            }
                        }
                    }
                }
                z4 = z7;
                dVar3 = dVar2;
                arrayList2 = arrayList;
                i13 = i8;
                i14 = i9;
                i15 = 2;
                i16 = i54;
                i17 = 0;
                if (i12 > i43) {
                    this.f17230l = i15;
                }
                if (i11 > 0) {
                    this.f17230l = i15;
                }
                i18 = this.f17230l;
                if (i18 == 1) {
                    if (i11 > 1) {
                        i31 = (i43 - i12) / (i11 - 1);
                    } else if (i11 == 1) {
                        i31 = (i43 - i12) / 2;
                    } else {
                        i31 = i17;
                    }
                    if (i10 > 0) {
                        i31 = i17;
                    }
                    i32 = i17;
                    i33 = i16;
                    while (i32 < i13) {
                        if (z4) {
                            i34 = i13 - (i32 + 1);
                        } else {
                            i34 = i32;
                        }
                        nVar3 = (n) arrayList2.get(i34);
                        i35 = nVar3.f17256b.f16965i0;
                        eVar5 = nVar3.f17263i;
                        eVar6 = nVar3.f17262h;
                        if (i35 == 8) {
                            eVar6.d(i33);
                            eVar5.d(i33);
                            i37 = i31;
                            dVar5 = dVar3;
                        } else {
                            if (i32 > 0) {
                                if (z4) {
                                    i33 -= i31;
                                } else {
                                    i33 += i31;
                                }
                            }
                            if (i32 > 0) {
                                if (z4) {
                                    i33 -= eVar6.f17236f;
                                } else {
                                    i33 += eVar6.f17236f;
                                }
                            }
                            if (z4) {
                                eVar5.d(i33);
                            } else {
                                eVar6.d(i33);
                            }
                            fVar3 = nVar3.f17259e;
                            i36 = fVar3.f17237g;
                            dVar5 = dVar3;
                            if (nVar3.f17258d == dVar5) {
                                i37 = i31;
                                if (nVar3.f17255a == 1) {
                                    i36 = fVar3.f17242m;
                                }
                            } else {
                                i37 = i31;
                            }
                            if (z4) {
                                i33 -= i36;
                            } else {
                                i33 += i36;
                            }
                            if (z4) {
                                eVar6.d(i33);
                            } else {
                                eVar5.d(i33);
                            }
                            nVar3.f17261g = true;
                            if (i32 >= i45) {
                            }
                        }
                        i32++;
                        i31 = i37;
                        dVar3 = dVar5;
                    }
                    return;
                }
                dVar4 = dVar3;
                if (i18 == 0) {
                    i25 = (i43 - i12) / (i11 + 1);
                    if (i10 > 0) {
                        i25 = i17;
                    }
                    i27 = i16;
                    while (i26 < i13) {
                        if (z4) {
                            i28 = i13 - (i26 + 1);
                        } else {
                            i28 = i26;
                        }
                        nVar2 = (n) arrayList2.get(i28);
                        i29 = nVar2.f17256b.f16965i0;
                        eVar3 = nVar2.f17263i;
                        eVar4 = nVar2.f17262h;
                        if (i29 == 8) {
                            eVar4.d(i27);
                            eVar3.d(i27);
                        } else {
                            if (z4) {
                                i30 = i27 - i25;
                            } else {
                                i30 = i27 + i25;
                            }
                            if (i26 > 0) {
                                if (z4) {
                                    i30 -= eVar4.f17236f;
                                } else {
                                    i30 += eVar4.f17236f;
                                }
                            }
                            if (z4) {
                                eVar3.d(i30);
                            } else {
                                eVar4.d(i30);
                            }
                            fVar2 = nVar2.f17259e;
                            iMin = fVar2.f17237g;
                            if (nVar2.f17258d == dVar4) {
                                iMin = Math.min(iMin, fVar2.f17242m);
                            }
                            if (z4) {
                                i27 = i30 - iMin;
                            } else {
                                i27 = i30 + iMin;
                            }
                            if (z4) {
                                eVar4.d(i27);
                            } else {
                                eVar3.d(i27);
                            }
                            if (i26 >= i45) {
                            }
                        }
                    }
                    return;
                }
                if (i18 == 2) {
                    if (this.f17260f == 0) {
                        f8 = this.f17256b.f16959f0;
                    } else {
                        f8 = this.f17256b.f16961g0;
                    }
                    if (z4) {
                        f8 = 1.0f - f8;
                    }
                    i19 = (int) (((i43 - i12) * f8) + 0.5f);
                    if (i19 >= 0) {
                        i19 = i17;
                    } else {
                        i19 = i17;
                    }
                    if (z4) {
                        i20 = i16 - i19;
                    } else {
                        i20 = i16 + i19;
                    }
                    while (i21 < i13) {
                        if (z4) {
                            i22 = i13 - (i21 + 1);
                        } else {
                            i22 = i21;
                        }
                        nVar = (n) arrayList2.get(i22);
                        i23 = nVar.f17256b.f16965i0;
                        eVar = nVar.f17263i;
                        eVar2 = nVar.f17262h;
                        if (i23 == 8) {
                            eVar2.d(i20);
                            eVar.d(i20);
                        } else {
                            if (i21 > 0) {
                                if (z4) {
                                    i20 -= eVar2.f17236f;
                                } else {
                                    i20 += eVar2.f17236f;
                                }
                            }
                            if (z4) {
                                eVar.d(i20);
                            } else {
                                eVar2.d(i20);
                            }
                            fVar = nVar.f17259e;
                            i24 = fVar.f17237g;
                            if (nVar.f17258d == dVar4) {
                                i24 = fVar.f17242m;
                            }
                            if (z4) {
                                i20 -= i24;
                            } else {
                                i20 += i24;
                            }
                            if (z4) {
                                eVar2.d(i20);
                            } else {
                                eVar.d(i20);
                            }
                            if (i21 >= i45) {
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p154w.n
    public final void d() {
        ArrayList arrayList = this.f17229k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((n) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        e eVar = ((n) arrayList.get(0)).f17256b;
        e eVar2 = ((n) arrayList.get(size - 1)).f17256b;
        int i7 = this.f17260f;
        e eVar3 = this.f17263i;
        e eVar4 = this.f17262h;
        if (i7 == 0) {
            p149v.c cVar = eVar.f16932J;
            p149v.c cVar2 = eVar2.f16934L;
            e eVarI = n.i(cVar, 0);
            int iE = cVar.e();
            e eVarM = m();
            if (eVarM != null) {
                iE = eVarM.f16932J.e();
            }
            if (eVarI != null) {
                n.b(eVar4, eVarI, iE);
            }
            e eVarI2 = n.i(cVar2, 0);
            int iE2 = cVar2.e();
            e eVarN = n();
            if (eVarN != null) {
                iE2 = eVarN.f16934L.e();
            }
            if (eVarI2 != null) {
                n.b(eVar3, eVarI2, -iE2);
            }
        } else {
            p149v.c cVar3 = eVar.f16933K;
            p149v.c cVar4 = eVar2.f16935M;
            e eVarI3 = n.i(cVar3, 1);
            int iE3 = cVar3.e();
            e eVarM2 = m();
            if (eVarM2 != null) {
                iE3 = eVarM2.f16933K.e();
            }
            if (eVarI3 != null) {
                n.b(eVar4, eVarI3, iE3);
            }
            e eVarI4 = n.i(cVar4, 1);
            int iE4 = cVar4.e();
            e eVarN2 = n();
            if (eVarN2 != null) {
                iE4 = eVarN2.f16935M.e();
            }
            if (eVarI4 != null) {
                n.b(eVar3, eVarI4, -iE4);
            }
        }
        eVar4.f17231a = this;
        eVar3.f17231a = this;
    }

    @Override // p154w.n
    public final void e() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f17229k;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((n) arrayList.get(i7)).e();
            i7++;
        }
    }

    @Override // p154w.n
    public final void f() {
        this.f17257c = null;
        Iterator it = this.f17229k.iterator();
        while (it.hasNext()) {
            ((n) it.next()).f();
        }
    }

    @Override // p154w.n
    public final long j() {
        ArrayList arrayList = this.f17229k;
        int size = arrayList.size();
        long j = 0;
        for (int i7 = 0; i7 < size; i7++) {
            n nVar = (n) arrayList.get(i7);
            j = ((long) nVar.f17263i.f17236f) + nVar.j() + j + ((long) nVar.f17262h.f17236f);
        }
        return j;
    }

    @Override // p154w.n
    public final boolean k() {
        ArrayList arrayList = this.f17229k;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!((n) arrayList.get(i7)).k()) {
                return false;
            }
        }
        return true;
    }

    public final e m() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f17229k;
            if (i7 >= arrayList.size()) {
                return null;
            }
            e eVar = ((n) arrayList.get(i7)).f17256b;
            if (eVar.f16965i0 != 8) {
                return eVar;
            }
            i7++;
        }
    }

    public final e n() {
        ArrayList arrayList = this.f17229k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e eVar = ((n) arrayList.get(size)).f17256b;
            if (eVar.f16965i0 != 8) {
                return eVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f17260f == 0 ? "horizontal : " : "vertical : ");
        for (n nVar : this.f17229k) {
            sb.append("<");
            sb.append(nVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
