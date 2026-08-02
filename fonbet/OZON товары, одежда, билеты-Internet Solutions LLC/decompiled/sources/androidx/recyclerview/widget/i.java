package androidx.recyclerview.widget;

import B0.A0;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<g> f44916a = new a();

    static class a implements Comparator<g> {
        @Override // java.util.Comparator
        public final int compare(g gVar, g gVar2) {
            g gVar3 = gVar;
            g gVar4 = gVar2;
            int i11 = gVar3.f44931a - gVar4.f44931a;
            return i11 == 0 ? gVar3.f44932b - gVar4.f44932b : i11;
        }
    }

    public static abstract class b {
        public abstract boolean areContentsTheSame(int i11, int i12);

        public abstract boolean areItemsTheSame(int i11, int i12);

        public Object getChangePayload(int i11, int i12) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f44917a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f44918b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f44919c;

        /* renamed from: d, reason: collision with root package name */
        private final b f44920d;

        /* renamed from: e, reason: collision with root package name */
        private final int f44921e;

        /* renamed from: f, reason: collision with root package name */
        private final int f44922f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f44923g;

        c(b bVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z11) {
            this.f44917a = arrayList;
            this.f44918b = iArr;
            this.f44919c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f44920d = bVar;
            int oldListSize = bVar.getOldListSize();
            this.f44921e = oldListSize;
            int newListSize = bVar.getNewListSize();
            this.f44922f = newListSize;
            this.f44923g = z11;
            g gVar = arrayList.isEmpty() ? null : (g) arrayList.get(0);
            if (gVar == null || gVar.f44931a != 0 || gVar.f44932b != 0) {
                g gVar2 = new g();
                gVar2.f44931a = 0;
                gVar2.f44932b = 0;
                gVar2.f44934d = false;
                gVar2.f44933c = 0;
                gVar2.f44935e = false;
                arrayList.add(0, gVar2);
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                g gVar3 = (g) arrayList.get(size);
                int i11 = gVar3.f44931a;
                int i12 = gVar3.f44933c;
                int i13 = i11 + i12;
                int i14 = gVar3.f44932b + i12;
                boolean z12 = this.f44923g;
                int[] iArr3 = this.f44919c;
                int[] iArr4 = this.f44918b;
                if (z12) {
                    while (oldListSize > i13) {
                        if (iArr4[oldListSize - 1] == 0) {
                            d(oldListSize, newListSize, size, false);
                        }
                        oldListSize--;
                    }
                    while (newListSize > i14) {
                        if (iArr3[newListSize - 1] == 0) {
                            d(oldListSize, newListSize, size, true);
                        }
                        newListSize--;
                    }
                }
                for (int i15 = 0; i15 < gVar3.f44933c; i15++) {
                    int i16 = gVar3.f44931a + i15;
                    int i17 = gVar3.f44932b + i15;
                    int i18 = this.f44920d.areContentsTheSame(i16, i17) ? 1 : 2;
                    iArr4[i16] = (i17 << 5) | i18;
                    iArr3[i17] = (i16 << 5) | i18;
                }
                oldListSize = gVar3.f44931a;
                newListSize = gVar3.f44932b;
            }
        }

        private void d(int i11, int i12, int i13, boolean z11) {
            int i14;
            int i15;
            int i16;
            if (z11) {
                i12--;
                i15 = i11;
                i14 = i12;
            } else {
                i14 = i11 - 1;
                i15 = i14;
            }
            while (i13 >= 0) {
                g gVar = (g) this.f44917a.get(i13);
                int i17 = gVar.f44931a;
                int i18 = gVar.f44933c;
                int i19 = i17 + i18;
                int i21 = gVar.f44932b + i18;
                int[] iArr = this.f44918b;
                int[] iArr2 = this.f44919c;
                b bVar = this.f44920d;
                if (z11) {
                    for (int i22 = i15 - 1; i22 >= i19; i22--) {
                        if (bVar.areItemsTheSame(i22, i14)) {
                            i16 = bVar.areContentsTheSame(i22, i14) ? 8 : 4;
                            iArr2[i14] = (i22 << 5) | 16;
                            iArr[i22] = (i14 << 5) | i16;
                            return;
                        }
                    }
                } else {
                    for (int i23 = i12 - 1; i23 >= i21; i23--) {
                        if (bVar.areItemsTheSame(i14, i23)) {
                            i16 = bVar.areContentsTheSame(i14, i23) ? 8 : 4;
                            int i24 = i11 - 1;
                            iArr[i24] = (i23 << 5) | 16;
                            iArr2[i23] = (i24 << 5) | i16;
                            return;
                        }
                    }
                }
                i15 = gVar.f44931a;
                i12 = gVar.f44932b;
                i13--;
            }
        }

        private static e e(int i11, ArrayList arrayList, boolean z11) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                e eVar = (e) arrayList.get(size);
                if (eVar.f44924a == i11 && eVar.f44926c == z11) {
                    arrayList.remove(size);
                    while (size < arrayList.size()) {
                        ((e) arrayList.get(size)).f44925b += z11 ? 1 : -1;
                        size++;
                    }
                    return eVar;
                }
                size--;
            }
            return null;
        }

        public final int a(int i11) {
            int i12 = this.f44921e;
            if (i11 < 0 || i11 >= i12) {
                throw new IndexOutOfBoundsException(A0.a(i11, i12, "Index out of bounds - passed position = ", ", old list size = "));
            }
            int i13 = this.f44918b[i11];
            if ((i13 & 31) == 0) {
                return -1;
            }
            return i13 >> 5;
        }

        public final void b(@NonNull u uVar) {
            boolean z11;
            int i11;
            int i12;
            C5471e c5471e = uVar instanceof C5471e ? (C5471e) uVar : new C5471e(uVar);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f44917a;
            int size = arrayList2.size() - 1;
            int i13 = this.f44921e;
            int i14 = this.f44922f;
            while (size >= 0) {
                g gVar = (g) arrayList2.get(size);
                int i15 = gVar.f44933c;
                int i16 = gVar.f44931a + i15;
                int i17 = gVar.f44932b + i15;
                int[] iArr = this.f44918b;
                boolean z12 = this.f44923g;
                b bVar = this.f44920d;
                if (i16 < i13) {
                    int i18 = i13 - i16;
                    if (z12) {
                        int i19 = i18 - 1;
                        while (i19 >= 0) {
                            ArrayList arrayList3 = arrayList2;
                            int i21 = i16 + i19;
                            int i22 = iArr[i21];
                            int i23 = size;
                            int i24 = i22 & 31;
                            if (i24 != 0) {
                                z11 = z12;
                                if (i24 == 4 || i24 == 8) {
                                    int i25 = i22 >> 5;
                                    i11 = i19;
                                    i12 = i15;
                                    e e11 = e(i25, arrayList, false);
                                    c5471e.onMoved(i21, e11.f44925b - 1);
                                    if (i24 == 4) {
                                        c5471e.onChanged(e11.f44925b - 1, 1, bVar.getChangePayload(i21, i25));
                                    }
                                } else {
                                    if (i24 != 16) {
                                        StringBuilder f7 = P4.f.f(i21, "unknown flag for pos ", " ");
                                        f7.append(Long.toBinaryString(i24));
                                        throw new IllegalStateException(f7.toString());
                                    }
                                    arrayList.add(new e(i21, i21, true));
                                    i11 = i19;
                                    i12 = i15;
                                }
                            } else {
                                z11 = z12;
                                i11 = i19;
                                i12 = i15;
                                int i26 = 1;
                                c5471e.onRemoved(i21, 1);
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((e) it.next()).f44925b -= i26;
                                    i26 = 1;
                                }
                            }
                            i19 = i11 - 1;
                            arrayList2 = arrayList3;
                            size = i23;
                            z12 = z11;
                            i15 = i12;
                        }
                    } else {
                        c5471e.onRemoved(i16, i18);
                    }
                }
                ArrayList arrayList4 = arrayList2;
                int i27 = size;
                boolean z13 = z12;
                int i28 = i15;
                if (i17 < i14) {
                    int i29 = i14 - i17;
                    if (z13) {
                        for (int i31 = i29 - 1; i31 >= 0; i31--) {
                            int i32 = i17 + i31;
                            int i33 = this.f44919c[i32];
                            int i34 = i33 & 31;
                            if (i34 != 0) {
                                if (i34 != 4 && i34 != 8) {
                                    if (i34 != 16) {
                                        StringBuilder f11 = P4.f.f(i32, "unknown flag for pos ", " ");
                                        f11.append(Long.toBinaryString(i34));
                                        throw new IllegalStateException(f11.toString());
                                    }
                                    arrayList.add(new e(i32, i16, false));
                                }
                                int i35 = i33 >> 5;
                                c5471e.onMoved(e(i35, arrayList, true).f44925b, i16);
                                if (i34 == 4) {
                                    c5471e.onChanged(i16, 1, bVar.getChangePayload(i35, i32));
                                }
                            } else {
                                int i36 = 1;
                                c5471e.onInserted(i16, 1);
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    ((e) it2.next()).f44925b += i36;
                                    i36 = 1;
                                }
                            }
                        }
                    } else {
                        c5471e.onInserted(i16, i29);
                    }
                }
                for (int i37 = i28 - 1; i37 >= 0; i37--) {
                    int i38 = gVar.f44931a + i37;
                    if ((iArr[i38] & 31) == 2) {
                        c5471e.onChanged(i38, 1, bVar.getChangePayload(i38, gVar.f44932b + i37));
                    }
                }
                i13 = gVar.f44931a;
                i14 = gVar.f44932b;
                size = i27 - 1;
                arrayList2 = arrayList4;
            }
            c5471e.a();
        }

        public final void c(@NonNull RecyclerView.g gVar) {
            b(new C5468b(gVar));
        }
    }

    public static abstract class d<T> {
        public abstract boolean areContentsTheSame(@NonNull T t2, @NonNull T t11);

        public abstract boolean areItemsTheSame(@NonNull T t2, @NonNull T t11);

        public Object getChangePayload(@NonNull T t2, @NonNull T t11) {
            return null;
        }
    }

    /* loaded from: classes8.dex */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        int f44924a;

        /* renamed from: b, reason: collision with root package name */
        int f44925b;

        /* renamed from: c, reason: collision with root package name */
        boolean f44926c;

        public e(int i11, int i12, boolean z11) {
            this.f44924a = i11;
            this.f44925b = i12;
            this.f44926c = z11;
        }
    }

    static class f {

        /* renamed from: a, reason: collision with root package name */
        int f44927a;

        /* renamed from: b, reason: collision with root package name */
        int f44928b;

        /* renamed from: c, reason: collision with root package name */
        int f44929c;

        /* renamed from: d, reason: collision with root package name */
        int f44930d;
    }

    static class g {

        /* renamed from: a, reason: collision with root package name */
        int f44931a;

        /* renamed from: b, reason: collision with root package name */
        int f44932b;

        /* renamed from: c, reason: collision with root package name */
        int f44933c;

        /* renamed from: d, reason: collision with root package name */
        boolean f44934d;

        /* renamed from: e, reason: collision with root package name */
        boolean f44935e;

        g() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0197, code lost:
    
        r0 = r25 + 2;
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x016d, code lost:
    
        r25 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0148, code lost:
    
        r10 = r22[(r18 + r2) - 1];
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x019c, code lost:
    
        r9 = r9 + 1;
        r0 = r19;
        r10 = r20;
        r5 = r21;
        r2 = r22;
        r11 = r24;
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009e, code lost:
    
        if (r5[r20 - 1] < r21[r20 + 1]) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x011a, code lost:
    
        r22 = r2;
        r21 = r5;
        r20 = r10;
        r24 = r11;
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0124, code lost:
    
        if (r0 > r9) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0126, code lost:
    
        r2 = r0 + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012a, code lost:
    
        if (r2 == (r9 + r14)) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x012e, code lost:
    
        if (r2 == (r6 + r14)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0130, code lost:
    
        r10 = r18 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013a, code lost:
    
        if (r22[r10 - 1] >= r22[r10 + 1]) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x013d, code lost:
    
        r10 = r22[(r18 + r2) + 1] - 1;
        r11 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x014f, code lost:
    
        r16 = r10 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0151, code lost:
    
        if (r10 <= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0153, code lost:
    
        if (r16 <= 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0155, code lost:
    
        r25 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0163, code lost:
    
        if (r27.areItemsTheSame((r20 + r10) - 1, (r12 + r16) - 1) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0165, code lost:
    
        r10 = r10 - 1;
        r16 = r16 - 1;
        r0 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x016f, code lost:
    
        r0 = r18 + r2;
        r22[r0] = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0173, code lost:
    
        if (r19 != 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0175, code lost:
    
        if (r2 < r6) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0177, code lost:
    
        if (r2 > r9) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x017b, code lost:
    
        if (r21[r0] < r10) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017d, code lost:
    
        r5 = new androidx.recyclerview.widget.i.g();
        r6 = r22[r0];
        r5.f44931a = r6;
        r5.f44932b = r6 - r2;
        r5.f44933c = r21[r0] - r6;
        r5.f44934d = r11;
        r5.f44935e = r17;
        r2 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d5 A[LOOP:3: B:20:0x00c3->B:24:0x00d5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00de A[EDGE_INSN: B:25:0x00de->B:26:0x00de BREAK  A[LOOP:3: B:20:0x00c3->B:24:0x00d5], SYNTHETIC] */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c a(@NonNull b bVar, boolean z11) {
        int i11;
        int[] iArr;
        int[] iArr2;
        g gVar;
        int i12;
        boolean z12;
        int i13;
        int i14;
        int i15;
        int i16;
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        f fVar = new f();
        int i17 = 0;
        fVar.f44927a = 0;
        fVar.f44928b = oldListSize;
        fVar.f44929c = 0;
        fVar.f44930d = newListSize;
        arrayList2.add(fVar);
        int abs = Math.abs(oldListSize - newListSize) + oldListSize + newListSize;
        int i18 = abs * 2;
        int[] iArr3 = new int[i18];
        int[] iArr4 = new int[i18];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            f fVar2 = (f) arrayList2.remove(arrayList2.size() - 1);
            int i19 = fVar2.f44927a;
            int i21 = fVar2.f44928b;
            int i22 = fVar2.f44929c;
            int i23 = i21 - i19;
            int i24 = fVar2.f44930d - i22;
            if (i23 >= 1 && i24 >= 1) {
                int i25 = i23 - i24;
                int i26 = ((i23 + i24) + 1) / 2;
                boolean z13 = true;
                int i27 = (abs - i26) - 1;
                i11 = abs;
                int i28 = abs + i26 + 1;
                Arrays.fill(iArr3, i27, i28, i17);
                Arrays.fill(iArr4, i27 + i25, i28 + i25, i23);
                int i29 = i25 % 2 != 0 ? 1 : i17;
                int i31 = i17;
                while (i31 <= i26) {
                    int i32 = -i31;
                    int i33 = i29;
                    int i34 = i32;
                    while (true) {
                        if (i34 > i31) {
                            break;
                        }
                        if (i34 != i32) {
                            if (i34 != i31) {
                                int i35 = i11 + i34;
                                iArr = iArr4;
                                iArr2 = iArr3;
                            } else {
                                iArr = iArr4;
                                iArr2 = iArr3;
                            }
                            i12 = iArr2[(i11 + i34) - 1] + 1;
                            z12 = z13;
                            i13 = i19;
                            i14 = i12 - i34;
                            while (i12 < i23 && i14 < i24) {
                                i16 = i14;
                                i15 = i23;
                                if (bVar.areItemsTheSame(i13 + i12, i22 + i16)) {
                                    break;
                                }
                                i12++;
                                i14 = i16 + 1;
                                i23 = i15;
                            }
                            i15 = i23;
                            int i36 = i11 + i34;
                            iArr2[i36] = i12;
                            if (i33 == 0 && i34 >= (i25 - i31) + 1 && i34 <= (i25 + i31) - 1 && i12 >= iArr[i36]) {
                                gVar = new g();
                                int i37 = iArr[i36];
                                gVar.f44931a = i37;
                                gVar.f44932b = i37 - i34;
                                gVar.f44933c = iArr2[i36] - i37;
                                gVar.f44934d = z12;
                                gVar.f44935e = false;
                                break;
                            }
                            i34 += 2;
                            i19 = i13;
                            iArr3 = iArr2;
                            iArr4 = iArr;
                            i23 = i15;
                        } else {
                            iArr = iArr4;
                            iArr2 = iArr3;
                        }
                        i12 = iArr2[i11 + i34 + 1];
                        z12 = false;
                        i13 = i19;
                        i14 = i12 - i34;
                        while (i12 < i23) {
                            i16 = i14;
                            i15 = i23;
                            if (bVar.areItemsTheSame(i13 + i12, i22 + i16)) {
                            }
                        }
                        i15 = i23;
                        int i362 = i11 + i34;
                        iArr2[i362] = i12;
                        if (i33 == 0) {
                        }
                        i34 += 2;
                        i19 = i13;
                        iArr3 = iArr2;
                        iArr4 = iArr;
                        i23 = i15;
                    }
                }
                throw new IllegalStateException("DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.");
            }
            i11 = abs;
            iArr = iArr4;
            iArr2 = iArr3;
            gVar = null;
            if (gVar != null) {
                if (gVar.f44933c > 0) {
                    arrayList.add(gVar);
                }
                gVar.f44931a += fVar2.f44927a;
                gVar.f44932b += fVar2.f44929c;
                f fVar3 = arrayList3.isEmpty() ? new f() : (f) arrayList3.remove(arrayList3.size() - 1);
                fVar3.f44927a = fVar2.f44927a;
                fVar3.f44929c = fVar2.f44929c;
                if (gVar.f44935e) {
                    fVar3.f44928b = gVar.f44931a;
                    fVar3.f44930d = gVar.f44932b;
                } else if (gVar.f44934d) {
                    fVar3.f44928b = gVar.f44931a - 1;
                    fVar3.f44930d = gVar.f44932b;
                } else {
                    fVar3.f44928b = gVar.f44931a;
                    fVar3.f44930d = gVar.f44932b - 1;
                }
                arrayList2.add(fVar3);
                if (!gVar.f44935e) {
                    int i38 = gVar.f44931a;
                    int i39 = gVar.f44933c;
                    fVar2.f44927a = i38 + i39;
                    fVar2.f44929c = gVar.f44932b + i39;
                } else if (gVar.f44934d) {
                    int i41 = gVar.f44931a;
                    int i42 = gVar.f44933c;
                    fVar2.f44927a = i41 + i42 + 1;
                    fVar2.f44929c = gVar.f44932b + i42;
                } else {
                    int i43 = gVar.f44931a;
                    int i44 = gVar.f44933c;
                    fVar2.f44927a = i43 + i44;
                    fVar2.f44929c = gVar.f44932b + i44 + 1;
                }
                arrayList2.add(fVar2);
            } else {
                arrayList3.add(fVar2);
            }
            abs = i11;
            iArr3 = iArr2;
            iArr4 = iArr;
            i17 = 0;
        }
        int[] iArr5 = iArr3;
        Collections.sort(arrayList, f44916a);
        return new c(bVar, arrayList, iArr5, iArr4, z11);
    }
}
