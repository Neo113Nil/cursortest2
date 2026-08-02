package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.cH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0843cH extends C1787xc {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f12987u = 0;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f12988l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f12989m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f12990n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f12991o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f12992p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f12993q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f12994r;

    /* renamed from: s, reason: collision with root package name */
    public final SparseArray f12995s;

    /* renamed from: t, reason: collision with root package name */
    public final SparseBooleanArray f12996t;

    static {
        new C0843cH(new C0799bH());
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    public C0843cH(C0799bH c0799bH) {
        super(c0799bH);
        this.f12988l = c0799bH.f12801l;
        this.f12989m = c0799bH.f12802m;
        this.f12990n = c0799bH.f12803n;
        this.f12991o = c0799bH.f12804o;
        this.f12992p = c0799bH.f12805p;
        this.f12993q = c0799bH.f12806q;
        this.f12994r = c0799bH.f12807r;
        this.f12995s = c0799bH.f12808s;
        this.f12996t = c0799bH.f12809t;
    }

    @Override // com.google.android.gms.internal.ads.C1787xc
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0843cH.class == obj.getClass()) {
            C0843cH c0843cH = (C0843cH) obj;
            if (super.equals(c0843cH) && this.f12988l == c0843cH.f12988l && this.f12989m == c0843cH.f12989m && this.f12990n == c0843cH.f12990n && this.f12991o == c0843cH.f12991o && this.f12992p == c0843cH.f12992p && this.f12993q == c0843cH.f12993q && this.f12994r == c0843cH.f12994r) {
                SparseBooleanArray sparseBooleanArray = this.f12996t;
                int size = sparseBooleanArray.size();
                SparseBooleanArray sparseBooleanArray2 = c0843cH.f12996t;
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.f12995s;
                            int size2 = sparseArray.size();
                            SparseArray sparseArray2 = c0843cH.f12995s;
                            if (sparseArray2.size() == size2) {
                                for (int i5 = 0; i5 < size2; i5++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i5));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i5);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                TG tg = (TG) entry.getKey();
                                                if (map2.containsKey(tg) && Objects.equals(entry.getValue(), map2.get(tg))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.C1787xc
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f12988l ? 1 : 0)) * 961) + (this.f12989m ? 1 : 0)) * 961) + (this.f12990n ? 1 : 0)) * 28629151) + (this.f12991o ? 1 : 0)) * 31) + (this.f12992p ? 1 : 0)) * 31) + (this.f12993q ? 1 : 0)) * 961) + (this.f12994r ? 1 : 0)) * 31;
    }
}
