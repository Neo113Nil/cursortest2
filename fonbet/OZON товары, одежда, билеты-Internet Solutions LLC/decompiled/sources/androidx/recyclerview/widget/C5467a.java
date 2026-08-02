package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5467a {

    /* renamed from: d, reason: collision with root package name */
    final RecyclerView.f f44831d;

    /* renamed from: a, reason: collision with root package name */
    private x2.g f44828a = new x2.g(30);

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<C0815a> f44829b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<C0815a> f44830c = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private int f44833f = 0;

    /* renamed from: e, reason: collision with root package name */
    final v f44832e = new v(this);

    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    static class C0815a {

        /* renamed from: a, reason: collision with root package name */
        int f44834a;

        /* renamed from: b, reason: collision with root package name */
        int f44835b;

        /* renamed from: c, reason: collision with root package name */
        Object f44836c;

        /* renamed from: d, reason: collision with root package name */
        int f44837d;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj == null || C0815a.class != obj.getClass()) {
                    return false;
                }
                C0815a c0815a = (C0815a) obj;
                int i11 = this.f44834a;
                if (i11 != c0815a.f44834a) {
                    return false;
                }
                if (i11 != 8 || Math.abs(this.f44837d - this.f44835b) != 1 || this.f44837d != c0815a.f44835b || this.f44835b != c0815a.f44837d) {
                    if (this.f44837d != c0815a.f44837d || this.f44835b != c0815a.f44835b) {
                        return false;
                    }
                    Object obj2 = this.f44836c;
                    if (obj2 != null) {
                        if (!obj2.equals(c0815a.f44836c)) {
                            return false;
                        }
                    } else if (c0815a.f44836c != null) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f44834a * 31) + this.f44835b) * 31) + this.f44837d;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append("[");
            int i11 = this.f44834a;
            sb2.append(i11 != 1 ? i11 != 2 ? i11 != 4 ? i11 != 8 ? "??" : "mv" : "up" : "rm" : ProductAction.ACTION_ADD);
            sb2.append(",s:");
            sb2.append(this.f44835b);
            sb2.append("c:");
            sb2.append(this.f44837d);
            sb2.append(",p:");
            return T7.E.c(this.f44836c, "]", sb2);
        }
    }

    C5467a(RecyclerView.f fVar) {
        this.f44831d = fVar;
    }

    private boolean a(int i11) {
        ArrayList<C0815a> arrayList = this.f44830c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            C0815a c0815a = arrayList.get(i12);
            int i13 = c0815a.f44834a;
            if (i13 != 8) {
                if (i13 == 1) {
                    int i14 = c0815a.f44835b;
                    int i15 = c0815a.f44837d + i14;
                    while (i14 < i15) {
                        if (f(i14, i12 + 1) == i11) {
                            return true;
                        }
                        i14++;
                    }
                } else {
                    continue;
                }
            } else {
                if (f(c0815a.f44837d, i12 + 1) == i11) {
                    return true;
                }
            }
        }
        return false;
    }

    private void d(C0815a c0815a) {
        int i11;
        int i12 = c0815a.f44834a;
        if (i12 == 1 || i12 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int r11 = r(c0815a.f44835b, i12);
        int i13 = c0815a.f44835b;
        int i14 = c0815a.f44834a;
        if (i14 == 2) {
            i11 = 0;
        } else {
            if (i14 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0815a);
            }
            i11 = 1;
        }
        int i15 = 1;
        for (int i16 = 1; i16 < c0815a.f44837d; i16++) {
            int r12 = r((i11 * i16) + c0815a.f44835b, c0815a.f44834a);
            int i17 = c0815a.f44834a;
            if (i17 == 2 ? r12 != r11 : !(i17 == 4 && r12 == r11 + 1)) {
                C0815a i18 = i(c0815a.f44836c, i17, r11, i15);
                e(i18, i13);
                i18.f44836c = null;
                this.f44828a.b(i18);
                if (c0815a.f44834a == 4) {
                    i13 += i15;
                }
                i15 = 1;
                r11 = r12;
            } else {
                i15++;
            }
        }
        Object obj = c0815a.f44836c;
        c0815a.f44836c = null;
        this.f44828a.b(c0815a);
        if (i15 > 0) {
            C0815a i19 = i(obj, c0815a.f44834a, r11, i15);
            e(i19, i13);
            i19.f44836c = null;
            this.f44828a.b(i19);
        }
    }

    private void n(C0815a c0815a) {
        this.f44830c.add(c0815a);
        int i11 = c0815a.f44834a;
        RecyclerView.f fVar = this.f44831d;
        if (i11 == 1) {
            int i12 = c0815a.f44835b;
            int i13 = c0815a.f44837d;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForInsert(i12, i13);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i11 == 2) {
            int i14 = c0815a.f44835b;
            int i15 = c0815a.f44837d;
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.offsetPositionRecordsForRemove(i14, i15, false);
            recyclerView2.mItemsAddedOrRemoved = true;
            return;
        }
        if (i11 == 4) {
            int i16 = c0815a.f44835b;
            int i17 = c0815a.f44837d;
            Object obj = c0815a.f44836c;
            RecyclerView recyclerView3 = RecyclerView.this;
            recyclerView3.viewRangeUpdate(i16, i17, obj);
            recyclerView3.mItemsChanged = true;
            return;
        }
        if (i11 != 8) {
            throw new IllegalArgumentException("Unknown update op type for " + c0815a);
        }
        int i18 = c0815a.f44835b;
        int i19 = c0815a.f44837d;
        RecyclerView recyclerView4 = RecyclerView.this;
        recyclerView4.offsetPositionRecordsForMove(i18, i19);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    private int r(int i11, int i12) {
        int i13;
        int i14;
        ArrayList<C0815a> arrayList = this.f44830c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0815a c0815a = arrayList.get(size);
            int i15 = c0815a.f44834a;
            if (i15 == 8) {
                int i16 = c0815a.f44835b;
                int i17 = c0815a.f44837d;
                if (i16 < i17) {
                    i14 = i16;
                    i13 = i17;
                } else {
                    i13 = i16;
                    i14 = i17;
                }
                if (i11 < i14 || i11 > i13) {
                    if (i11 < i16) {
                        if (i12 == 1) {
                            c0815a.f44835b = i16 + 1;
                            c0815a.f44837d = i17 + 1;
                        } else if (i12 == 2) {
                            c0815a.f44835b = i16 - 1;
                            c0815a.f44837d = i17 - 1;
                        }
                    }
                } else if (i14 == i16) {
                    if (i12 == 1) {
                        c0815a.f44837d = i17 + 1;
                    } else if (i12 == 2) {
                        c0815a.f44837d = i17 - 1;
                    }
                    i11++;
                } else {
                    if (i12 == 1) {
                        c0815a.f44835b = i16 + 1;
                    } else if (i12 == 2) {
                        c0815a.f44835b = i16 - 1;
                    }
                    i11--;
                }
            } else {
                int i18 = c0815a.f44835b;
                if (i18 <= i11) {
                    if (i15 == 1) {
                        i11 -= c0815a.f44837d;
                    } else if (i15 == 2) {
                        i11 += c0815a.f44837d;
                    }
                } else if (i12 == 1) {
                    c0815a.f44835b = i18 + 1;
                } else if (i12 == 2) {
                    c0815a.f44835b = i18 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0815a c0815a2 = arrayList.get(size2);
            if (c0815a2.f44834a == 8) {
                int i19 = c0815a2.f44837d;
                if (i19 == c0815a2.f44835b || i19 < 0) {
                    arrayList.remove(size2);
                    c0815a2.f44836c = null;
                    this.f44828a.b(c0815a2);
                }
            } else if (c0815a2.f44837d <= 0) {
                arrayList.remove(size2);
                c0815a2.f44836c = null;
                this.f44828a.b(c0815a2);
            }
        }
        return i11;
    }

    final void b() {
        ArrayList<C0815a> arrayList = this.f44830c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f44831d.a(arrayList.get(i11));
        }
        p(arrayList);
        this.f44833f = 0;
    }

    final void c() {
        b();
        ArrayList<C0815a> arrayList = this.f44829b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0815a c0815a = arrayList.get(i11);
            int i12 = c0815a.f44834a;
            RecyclerView.f fVar = this.f44831d;
            if (i12 == 1) {
                fVar.a(c0815a);
                int i13 = c0815a.f44835b;
                int i14 = c0815a.f44837d;
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.offsetPositionRecordsForInsert(i13, i14);
                recyclerView.mItemsAddedOrRemoved = true;
            } else if (i12 == 2) {
                fVar.a(c0815a);
                int i15 = c0815a.f44835b;
                int i16 = c0815a.f44837d;
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.offsetPositionRecordsForRemove(i15, i16, true);
                recyclerView2.mItemsAddedOrRemoved = true;
                recyclerView2.mState.f44714c += i16;
            } else if (i12 == 4) {
                fVar.a(c0815a);
                int i17 = c0815a.f44835b;
                int i18 = c0815a.f44837d;
                Object obj = c0815a.f44836c;
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.viewRangeUpdate(i17, i18, obj);
                recyclerView3.mItemsChanged = true;
            } else if (i12 == 8) {
                fVar.a(c0815a);
                int i19 = c0815a.f44835b;
                int i21 = c0815a.f44837d;
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.offsetPositionRecordsForMove(i19, i21);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        p(arrayList);
        this.f44833f = 0;
    }

    final void e(C0815a c0815a, int i11) {
        RecyclerView.f fVar = this.f44831d;
        fVar.a(c0815a);
        int i12 = c0815a.f44834a;
        if (i12 == 2) {
            int i13 = c0815a.f44837d;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForRemove(i11, i13, true);
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f44714c += i13;
            return;
        }
        if (i12 != 4) {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i14 = c0815a.f44837d;
        Object obj = c0815a.f44836c;
        RecyclerView recyclerView2 = RecyclerView.this;
        recyclerView2.viewRangeUpdate(i11, i14, obj);
        recyclerView2.mItemsChanged = true;
    }

    final int f(int i11, int i12) {
        ArrayList<C0815a> arrayList = this.f44830c;
        int size = arrayList.size();
        while (i12 < size) {
            C0815a c0815a = arrayList.get(i12);
            int i13 = c0815a.f44834a;
            if (i13 == 8) {
                int i14 = c0815a.f44835b;
                if (i14 == i11) {
                    i11 = c0815a.f44837d;
                } else {
                    if (i14 < i11) {
                        i11--;
                    }
                    if (c0815a.f44837d <= i11) {
                        i11++;
                    }
                }
            } else {
                int i15 = c0815a.f44835b;
                if (i15 > i11) {
                    continue;
                } else if (i13 == 2) {
                    int i16 = c0815a.f44837d;
                    if (i11 < i15 + i16) {
                        return -1;
                    }
                    i11 -= i16;
                } else if (i13 == 1) {
                    i11 += c0815a.f44837d;
                }
            }
            i12++;
        }
        return i11;
    }

    final boolean g(int i11) {
        return (i11 & this.f44833f) != 0;
    }

    final boolean h() {
        return this.f44829b.size() > 0;
    }

    public final C0815a i(Object obj, int i11, int i12, int i13) {
        C0815a c0815a = (C0815a) this.f44828a.a();
        if (c0815a != null) {
            c0815a.f44834a = i11;
            c0815a.f44835b = i12;
            c0815a.f44837d = i13;
            c0815a.f44836c = obj;
            return c0815a;
        }
        C0815a c0815a2 = new C0815a();
        c0815a2.f44834a = i11;
        c0815a2.f44835b = i12;
        c0815a2.f44837d = i13;
        c0815a2.f44836c = obj;
        return c0815a2;
    }

    final boolean j(int i11, int i12, Object obj) {
        if (i12 < 1) {
            return false;
        }
        ArrayList<C0815a> arrayList = this.f44829b;
        arrayList.add(i(obj, 4, i11, i12));
        this.f44833f |= 4;
        return arrayList.size() == 1;
    }

    final boolean k(int i11, int i12) {
        if (i12 < 1) {
            return false;
        }
        ArrayList<C0815a> arrayList = this.f44829b;
        arrayList.add(i(null, 1, i11, i12));
        this.f44833f |= 1;
        return arrayList.size() == 1;
    }

    final boolean l(int i11, int i12, int i13) {
        if (i11 == i12) {
            return false;
        }
        if (i13 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        ArrayList<C0815a> arrayList = this.f44829b;
        arrayList.add(i(null, 8, i11, i12));
        this.f44833f |= 8;
        return arrayList.size() == 1;
    }

    final boolean m(int i11, int i12) {
        if (i12 < 1) {
            return false;
        }
        ArrayList<C0815a> arrayList = this.f44829b;
        arrayList.add(i(null, 2, i11, i12));
        this.f44833f |= 2;
        return arrayList.size() == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x01fd, code lost:
    
        if (r8.mChildHelper.f44869c.contains(r10.itemView) != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x026a, code lost:
    
        if (r12.mChildHelper.f44869c.contains(r14.itemView) != false) goto L164;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void o() {
        char c11;
        int i11;
        Object obj;
        int i12;
        Object obj2;
        int i13;
        boolean z11;
        char c12;
        C0815a i14;
        int i15;
        int i16;
        C0815a i17;
        boolean z12;
        boolean z13;
        C0815a i18;
        ArrayList<C0815a> arrayList = this.f44829b;
        v vVar = this.f44832e;
        vVar.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z14 = false;
            while (true) {
                c11 = 65535;
                i11 = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (arrayList.get(size).f44834a != 8) {
                    z14 = true;
                } else if (z14) {
                    break;
                }
                size--;
            }
            obj = null;
            i12 = 2;
            if (size == -1) {
                break;
            }
            int i19 = size + 1;
            C0815a c0815a = arrayList.get(size);
            C0815a c0815a2 = arrayList.get(i19);
            int i21 = c0815a2.f44834a;
            if (i21 != 1) {
                C5467a c5467a = vVar.f45025a;
                if (i21 == 2) {
                    int i22 = c0815a.f44835b;
                    int i23 = c0815a.f44837d;
                    if (i22 < i23) {
                        z13 = c0815a2.f44835b == i22 && c0815a2.f44837d == i23 - i22;
                        z12 = false;
                    } else if (c0815a2.f44835b == i23 + 1 && c0815a2.f44837d == i22 - i23) {
                        z13 = true;
                        z12 = true;
                    } else {
                        z12 = true;
                        z13 = false;
                    }
                    int i24 = c0815a2.f44835b;
                    if (i23 < i24) {
                        c0815a2.f44835b = i24 - 1;
                    } else {
                        int i25 = c0815a2.f44837d;
                        if (i23 < i24 + i25) {
                            c0815a2.f44837d = i25 - 1;
                            c0815a.f44834a = 2;
                            c0815a.f44837d = 1;
                            if (c0815a2.f44837d == 0) {
                                arrayList.remove(i19);
                                c0815a2.f44836c = null;
                                c5467a.f44828a.b(c0815a2);
                            }
                        }
                    }
                    int i26 = c0815a.f44835b;
                    int i27 = c0815a2.f44835b;
                    if (i26 <= i27) {
                        c0815a2.f44835b = i27 + 1;
                    } else {
                        int i28 = i27 + c0815a2.f44837d;
                        if (i26 < i28) {
                            i18 = c5467a.i(null, 2, i26 + 1, i28 - i26);
                            c0815a2.f44837d = c0815a.f44835b - c0815a2.f44835b;
                            if (z13) {
                                if (z12) {
                                    if (i18 != null) {
                                        int i29 = c0815a.f44835b;
                                        if (i29 > i18.f44835b) {
                                            c0815a.f44835b = i29 - i18.f44837d;
                                        }
                                        int i31 = c0815a.f44837d;
                                        if (i31 > i18.f44835b) {
                                            c0815a.f44837d = i31 - i18.f44837d;
                                        }
                                    }
                                    int i32 = c0815a.f44835b;
                                    if (i32 > c0815a2.f44835b) {
                                        c0815a.f44835b = i32 - c0815a2.f44837d;
                                    }
                                    int i33 = c0815a.f44837d;
                                    if (i33 > c0815a2.f44835b) {
                                        c0815a.f44837d = i33 - c0815a2.f44837d;
                                    }
                                } else {
                                    if (i18 != null) {
                                        int i34 = c0815a.f44835b;
                                        if (i34 >= i18.f44835b) {
                                            c0815a.f44835b = i34 - i18.f44837d;
                                        }
                                        int i35 = c0815a.f44837d;
                                        if (i35 >= i18.f44835b) {
                                            c0815a.f44837d = i35 - i18.f44837d;
                                        }
                                    }
                                    int i36 = c0815a.f44835b;
                                    if (i36 >= c0815a2.f44835b) {
                                        c0815a.f44835b = i36 - c0815a2.f44837d;
                                    }
                                    int i37 = c0815a.f44837d;
                                    if (i37 >= c0815a2.f44835b) {
                                        c0815a.f44837d = i37 - c0815a2.f44837d;
                                    }
                                }
                                arrayList.set(size, c0815a2);
                                if (c0815a.f44835b != c0815a.f44837d) {
                                    arrayList.set(i19, c0815a);
                                } else {
                                    arrayList.remove(i19);
                                }
                                if (i18 != null) {
                                    arrayList.add(size, i18);
                                }
                            } else {
                                arrayList.set(size, c0815a2);
                                arrayList.remove(i19);
                                c0815a.f44836c = null;
                                c5467a.f44828a.b(c0815a);
                            }
                        }
                    }
                    i18 = null;
                    if (z13) {
                    }
                } else if (i21 == 4) {
                    int i38 = c0815a.f44837d;
                    int i39 = c0815a2.f44835b;
                    if (i38 < i39) {
                        c0815a2.f44835b = i39 - 1;
                    } else {
                        int i41 = c0815a2.f44837d;
                        if (i38 < i39 + i41) {
                            c0815a2.f44837d = i41 - 1;
                            i14 = c5467a.i(c0815a2.f44836c, 4, c0815a.f44835b, 1);
                            i15 = c0815a.f44835b;
                            i16 = c0815a2.f44835b;
                            if (i15 > i16) {
                                c0815a2.f44835b = i16 + 1;
                            } else {
                                int i42 = i16 + c0815a2.f44837d;
                                if (i15 < i42) {
                                    int i43 = i42 - i15;
                                    i17 = c5467a.i(c0815a2.f44836c, 4, i15 + 1, i43);
                                    c0815a2.f44837d -= i43;
                                    arrayList.set(i19, c0815a);
                                    if (c0815a2.f44837d > 0) {
                                        arrayList.set(size, c0815a2);
                                    } else {
                                        arrayList.remove(size);
                                        c0815a2.f44836c = null;
                                        c5467a.f44828a.b(c0815a2);
                                    }
                                    if (i14 != null) {
                                        arrayList.add(size, i14);
                                    }
                                    if (i17 != null) {
                                        arrayList.add(size, i17);
                                    }
                                }
                            }
                            i17 = null;
                            arrayList.set(i19, c0815a);
                            if (c0815a2.f44837d > 0) {
                            }
                            if (i14 != null) {
                            }
                            if (i17 != null) {
                            }
                        }
                    }
                    i14 = null;
                    i15 = c0815a.f44835b;
                    i16 = c0815a2.f44835b;
                    if (i15 > i16) {
                    }
                    i17 = null;
                    arrayList.set(i19, c0815a);
                    if (c0815a2.f44837d > 0) {
                    }
                    if (i14 != null) {
                    }
                    if (i17 != null) {
                    }
                }
            } else {
                int i44 = c0815a.f44837d;
                int i45 = c0815a2.f44835b;
                int i46 = i44 < i45 ? -1 : 0;
                int i47 = c0815a.f44835b;
                if (i47 < i45) {
                    i46++;
                }
                if (i45 <= i47) {
                    c0815a.f44835b = i47 + c0815a2.f44837d;
                }
                int i48 = c0815a2.f44835b;
                if (i48 <= i44) {
                    c0815a.f44837d = i44 + c0815a2.f44837d;
                }
                c0815a2.f44835b = i48 + i46;
                arrayList.set(size, c0815a2);
                arrayList.set(i19, c0815a);
            }
        }
        int size2 = arrayList.size();
        int i49 = 0;
        while (i49 < size2) {
            C0815a c0815a3 = arrayList.get(i49);
            int i51 = c0815a3.f44834a;
            if (i51 != 1) {
                RecyclerView.f fVar = this.f44831d;
                if (i51 == i12) {
                    int i52 = c0815a3.f44835b;
                    int i53 = c0815a3.f44837d + i52;
                    int i54 = i52;
                    int i55 = 0;
                    char c13 = 65535;
                    while (i54 < i53) {
                        RecyclerView recyclerView = RecyclerView.this;
                        RecyclerView.C findViewHolderForPosition = recyclerView.findViewHolderForPosition(i54, true);
                        if (findViewHolderForPosition != null) {
                        }
                        findViewHolderForPosition = null;
                        if (findViewHolderForPosition != null || a(i54)) {
                            if (c13 == 0) {
                                d(i(null, 2, i52, i55));
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c12 = 1;
                        } else {
                            if (c13 == 1) {
                                n(i(null, 2, i52, i55));
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c12 = 0;
                        }
                        if (z11) {
                            i54 -= i55;
                            i53 -= i55;
                            i55 = 1;
                        } else {
                            i55++;
                        }
                        i54++;
                        c13 = c12;
                    }
                    obj2 = null;
                    if (i55 != c0815a3.f44837d) {
                        c0815a3.f44836c = null;
                        this.f44828a.b(c0815a3);
                        i13 = 2;
                        c0815a3 = i(null, 2, i52, i55);
                    } else {
                        i13 = 2;
                    }
                    if (c13 == 0) {
                        d(c0815a3);
                    } else {
                        n(c0815a3);
                    }
                } else if (i51 != 4) {
                    if (i51 == i11) {
                        n(c0815a3);
                    }
                    obj2 = obj;
                    i13 = i12;
                } else {
                    int i56 = c0815a3.f44835b;
                    int i57 = c0815a3.f44837d + i56;
                    int i58 = i56;
                    int i59 = 0;
                    while (i56 < i57) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.C findViewHolderForPosition2 = recyclerView2.findViewHolderForPosition(i56, true);
                        if (findViewHolderForPosition2 != null) {
                        }
                        findViewHolderForPosition2 = null;
                        if (findViewHolderForPosition2 != null || a(i56)) {
                            if (c11 == 0) {
                                d(i(c0815a3.f44836c, 4, i58, i59));
                                i58 = i56;
                                i59 = 0;
                            }
                            c11 = 1;
                        } else {
                            if (c11 == 1) {
                                n(i(c0815a3.f44836c, 4, i58, i59));
                                i58 = i56;
                                i59 = 0;
                            }
                            c11 = 0;
                        }
                        i59++;
                        i56++;
                    }
                    if (i59 != c0815a3.f44837d) {
                        Object obj3 = c0815a3.f44836c;
                        c0815a3.f44836c = null;
                        this.f44828a.b(c0815a3);
                        c0815a3 = i(obj3, 4, i58, i59);
                    }
                    if (c11 == 0) {
                        d(c0815a3);
                    } else {
                        n(c0815a3);
                    }
                    obj2 = null;
                    i13 = 2;
                }
            } else {
                obj2 = obj;
                i13 = i12;
                n(c0815a3);
            }
            i49++;
            obj = obj2;
            i12 = i13;
            c11 = 65535;
            i11 = 8;
        }
        arrayList.clear();
    }

    final void p(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0815a c0815a = (C0815a) arrayList.get(i11);
            c0815a.f44836c = null;
            this.f44828a.b(c0815a);
        }
        arrayList.clear();
    }

    final void q() {
        p(this.f44829b);
        p(this.f44830c);
        this.f44833f = 0;
    }
}
