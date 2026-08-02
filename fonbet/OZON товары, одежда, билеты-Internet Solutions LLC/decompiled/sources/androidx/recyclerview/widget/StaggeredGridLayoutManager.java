package androidx.recyclerview.widget;

import C.o0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import y2.q;

/* loaded from: classes8.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.z.b {

    /* renamed from: a, reason: collision with root package name */
    private int f44772a;

    /* renamed from: b, reason: collision with root package name */
    f[] f44773b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    w f44774c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    w f44775d;

    /* renamed from: e, reason: collision with root package name */
    private int f44776e;

    /* renamed from: f, reason: collision with root package name */
    private int f44777f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    private final q f44778g;

    /* renamed from: h, reason: collision with root package name */
    boolean f44779h;

    /* renamed from: i, reason: collision with root package name */
    boolean f44780i;

    /* renamed from: j, reason: collision with root package name */
    private BitSet f44781j;

    /* renamed from: k, reason: collision with root package name */
    int f44782k;

    /* renamed from: l, reason: collision with root package name */
    int f44783l;

    /* renamed from: m, reason: collision with root package name */
    d f44784m;

    /* renamed from: n, reason: collision with root package name */
    private int f44785n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f44786o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f44787p;

    /* renamed from: q, reason: collision with root package name */
    private e f44788q;

    /* renamed from: r, reason: collision with root package name */
    private int f44789r;

    /* renamed from: s, reason: collision with root package name */
    private final Rect f44790s;

    /* renamed from: t, reason: collision with root package name */
    private final b f44791t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f44792u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f44793v;

    /* renamed from: w, reason: collision with root package name */
    private int[] f44794w;

    /* renamed from: x, reason: collision with root package name */
    private final Runnable f44795x;

    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.d();
        }
    }

    class b {

        /* renamed from: a, reason: collision with root package name */
        int f44797a;

        /* renamed from: b, reason: collision with root package name */
        int f44798b;

        /* renamed from: c, reason: collision with root package name */
        boolean f44799c;

        /* renamed from: d, reason: collision with root package name */
        boolean f44800d;

        /* renamed from: e, reason: collision with root package name */
        boolean f44801e;

        /* renamed from: f, reason: collision with root package name */
        int[] f44802f;

        b() {
            a();
        }

        final void a() {
            this.f44797a = -1;
            this.f44798b = LinearLayoutManager.INVALID_OFFSET;
            this.f44799c = false;
            this.f44800d = false;
            this.f44801e = false;
            int[] iArr = this.f44802f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.p {

        /* renamed from: e, reason: collision with root package name */
        f f44804e;

        /* renamed from: f, reason: collision with root package name */
        boolean f44805f;

        public final int c() {
            f fVar = this.f44804e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f44826e;
        }

        public final boolean d() {
            return this.f44805f;
        }

        public final void e(boolean z11) {
            this.f44805f = z11;
        }
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        int[] f44806a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList f44807b;

        @SuppressLint({"BanParcelableUsage"})
        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0814a();

            /* renamed from: a, reason: collision with root package name */
            int f44808a;

            /* renamed from: b, reason: collision with root package name */
            int f44809b;

            /* renamed from: c, reason: collision with root package name */
            int[] f44810c;

            /* renamed from: d, reason: collision with root package name */
            boolean f44811d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            static class C0814a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    a aVar = new a();
                    aVar.f44808a = parcel.readInt();
                    aVar.f44809b = parcel.readInt();
                    aVar.f44811d = parcel.readInt() == 1;
                    int readInt = parcel.readInt();
                    if (readInt > 0) {
                        int[] iArr = new int[readInt];
                        aVar.f44810c = iArr;
                        parcel.readIntArray(iArr);
                    }
                    return aVar;
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i11) {
                    return new a[i11];
                }
            }

            a() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f44808a + ", mGapDir=" + this.f44809b + ", mHasUnwantedGapAfter=" + this.f44811d + ", mGapPerSpan=" + Arrays.toString(this.f44810c) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i11) {
                parcel.writeInt(this.f44808a);
                parcel.writeInt(this.f44809b);
                parcel.writeInt(this.f44811d ? 1 : 0);
                int[] iArr = this.f44810c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f44810c);
                }
            }
        }

        public final void a(a aVar) {
            if (this.f44807b == null) {
                this.f44807b = new ArrayList();
            }
            int size = this.f44807b.size();
            for (int i11 = 0; i11 < size; i11++) {
                a aVar2 = (a) this.f44807b.get(i11);
                if (aVar2.f44808a == aVar.f44808a) {
                    this.f44807b.remove(i11);
                }
                if (aVar2.f44808a >= aVar.f44808a) {
                    this.f44807b.add(i11, aVar);
                    return;
                }
            }
            this.f44807b.add(aVar);
        }

        final void b(int i11) {
            int[] iArr = this.f44806a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i11, 10) + 1];
                this.f44806a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i11 >= iArr.length) {
                int length = iArr.length;
                while (length <= i11) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f44806a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f44806a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        final void c(int i11) {
            ArrayList arrayList = this.f44807b;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((a) this.f44807b.get(size)).f44808a >= i11) {
                        this.f44807b.remove(size);
                    }
                }
            }
            f(i11);
        }

        public final a d(int i11, int i12, int i13) {
            ArrayList arrayList = this.f44807b;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                a aVar = (a) this.f44807b.get(i14);
                int i15 = aVar.f44808a;
                if (i15 >= i12) {
                    return null;
                }
                if (i15 >= i11 && (i13 == 0 || aVar.f44809b == i13 || aVar.f44811d)) {
                    return aVar;
                }
            }
            return null;
        }

        public final a e(int i11) {
            ArrayList arrayList = this.f44807b;
            if (arrayList == null) {
                return null;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f44807b.get(size);
                if (aVar.f44808a == i11) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final int f(int i11) {
            int i12;
            int[] iArr = this.f44806a;
            if (iArr == null || i11 >= iArr.length) {
                return -1;
            }
            if (this.f44807b != null) {
                a e11 = e(i11);
                if (e11 != null) {
                    this.f44807b.remove(e11);
                }
                int size = this.f44807b.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size) {
                        i13 = -1;
                        break;
                    }
                    if (((a) this.f44807b.get(i13)).f44808a >= i11) {
                        break;
                    }
                    i13++;
                }
                if (i13 != -1) {
                    a aVar = (a) this.f44807b.get(i13);
                    this.f44807b.remove(i13);
                    i12 = aVar.f44808a;
                    if (i12 != -1) {
                        int[] iArr2 = this.f44806a;
                        Arrays.fill(iArr2, i11, iArr2.length, -1);
                        return this.f44806a.length;
                    }
                    int i14 = i12 + 1;
                    Arrays.fill(this.f44806a, i11, i14, -1);
                    return i14;
                }
            }
            i12 = -1;
            if (i12 != -1) {
            }
        }

        final void g(int i11, int i12) {
            int[] iArr = this.f44806a;
            if (iArr == null || i11 >= iArr.length) {
                return;
            }
            int i13 = i11 + i12;
            b(i13);
            int[] iArr2 = this.f44806a;
            System.arraycopy(iArr2, i11, iArr2, i13, (iArr2.length - i11) - i12);
            Arrays.fill(this.f44806a, i11, i13, -1);
            ArrayList arrayList = this.f44807b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f44807b.get(size);
                int i14 = aVar.f44808a;
                if (i14 >= i11) {
                    aVar.f44808a = i14 + i12;
                }
            }
        }

        final void h(int i11, int i12) {
            int[] iArr = this.f44806a;
            if (iArr == null || i11 >= iArr.length) {
                return;
            }
            int i13 = i11 + i12;
            b(i13);
            int[] iArr2 = this.f44806a;
            System.arraycopy(iArr2, i13, iArr2, i11, (iArr2.length - i11) - i12);
            int[] iArr3 = this.f44806a;
            Arrays.fill(iArr3, iArr3.length - i12, iArr3.length, -1);
            ArrayList arrayList = this.f44807b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f44807b.get(size);
                int i14 = aVar.f44808a;
                if (i14 >= i11) {
                    if (i14 < i13) {
                        this.f44807b.remove(size);
                    } else {
                        aVar.f44808a = i14 - i12;
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        int f44812a;

        /* renamed from: b, reason: collision with root package name */
        int f44813b;

        /* renamed from: c, reason: collision with root package name */
        int f44814c;

        /* renamed from: d, reason: collision with root package name */
        int[] f44815d;

        /* renamed from: e, reason: collision with root package name */
        int f44816e;

        /* renamed from: f, reason: collision with root package name */
        int[] f44817f;

        /* renamed from: g, reason: collision with root package name */
        ArrayList f44818g;

        /* renamed from: h, reason: collision with root package name */
        boolean f44819h;

        /* renamed from: i, reason: collision with root package name */
        boolean f44820i;

        /* renamed from: j, reason: collision with root package name */
        boolean f44821j;

        static class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                e eVar = new e();
                eVar.f44812a = parcel.readInt();
                eVar.f44813b = parcel.readInt();
                int readInt = parcel.readInt();
                eVar.f44814c = readInt;
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    eVar.f44815d = iArr;
                    parcel.readIntArray(iArr);
                }
                int readInt2 = parcel.readInt();
                eVar.f44816e = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    eVar.f44817f = iArr2;
                    parcel.readIntArray(iArr2);
                }
                eVar.f44819h = parcel.readInt() == 1;
                eVar.f44820i = parcel.readInt() == 1;
                eVar.f44821j = parcel.readInt() == 1;
                eVar.f44818g = parcel.readArrayList(d.a.class.getClassLoader());
                return eVar;
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i11) {
                return new e[i11];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f44812a);
            parcel.writeInt(this.f44813b);
            parcel.writeInt(this.f44814c);
            if (this.f44814c > 0) {
                parcel.writeIntArray(this.f44815d);
            }
            parcel.writeInt(this.f44816e);
            if (this.f44816e > 0) {
                parcel.writeIntArray(this.f44817f);
            }
            parcel.writeInt(this.f44819h ? 1 : 0);
            parcel.writeInt(this.f44820i ? 1 : 0);
            parcel.writeInt(this.f44821j ? 1 : 0);
            parcel.writeList(this.f44818g);
        }
    }

    class f {

        /* renamed from: a, reason: collision with root package name */
        ArrayList<View> f44822a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        int f44823b = LinearLayoutManager.INVALID_OFFSET;

        /* renamed from: c, reason: collision with root package name */
        int f44824c = LinearLayoutManager.INVALID_OFFSET;

        /* renamed from: d, reason: collision with root package name */
        int f44825d = 0;

        /* renamed from: e, reason: collision with root package name */
        final int f44826e;

        f(int i11) {
            this.f44826e = i11;
        }

        final void a(View view) {
            c cVar = (c) view.getLayoutParams();
            cVar.f44804e = this;
            ArrayList<View> arrayList = this.f44822a;
            arrayList.add(view);
            this.f44824c = LinearLayoutManager.INVALID_OFFSET;
            if (arrayList.size() == 1) {
                this.f44823b = LinearLayoutManager.INVALID_OFFSET;
            }
            if (cVar.f44747a.isRemoved() || cVar.f44747a.isUpdated()) {
                this.f44825d = StaggeredGridLayoutManager.this.f44774c.e(view) + this.f44825d;
            }
        }

        final void b() {
            d.a e11;
            View view = (View) o0.b(1, this.f44822a);
            c cVar = (c) view.getLayoutParams();
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            this.f44824c = staggeredGridLayoutManager.f44774c.d(view);
            if (cVar.f44805f && (e11 = staggeredGridLayoutManager.f44784m.e(cVar.f44747a.getLayoutPosition())) != null && e11.f44809b == 1) {
                int i11 = this.f44824c;
                int[] iArr = e11.f44810c;
                this.f44824c = i11 + (iArr == null ? 0 : iArr[this.f44826e]);
            }
        }

        final void c() {
            d.a e11;
            View view = this.f44822a.get(0);
            c cVar = (c) view.getLayoutParams();
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            this.f44823b = staggeredGridLayoutManager.f44774c.g(view);
            if (cVar.f44805f && (e11 = staggeredGridLayoutManager.f44784m.e(cVar.f44747a.getLayoutPosition())) != null && e11.f44809b == -1) {
                int i11 = this.f44823b;
                int[] iArr = e11.f44810c;
                this.f44823b = i11 - (iArr != null ? iArr[this.f44826e] : 0);
            }
        }

        final void d() {
            this.f44822a.clear();
            this.f44823b = LinearLayoutManager.INVALID_OFFSET;
            this.f44824c = LinearLayoutManager.INVALID_OFFSET;
            this.f44825d = 0;
        }

        public final int e() {
            boolean z11 = StaggeredGridLayoutManager.this.f44779h;
            ArrayList<View> arrayList = this.f44822a;
            return z11 ? g(arrayList.size() - 1, -1, false, true) : g(0, arrayList.size(), false, true);
        }

        public final int f() {
            boolean z11 = StaggeredGridLayoutManager.this.f44779h;
            ArrayList<View> arrayList = this.f44822a;
            return z11 ? g(0, arrayList.size(), false, true) : g(arrayList.size() - 1, -1, false, true);
        }

        final int g(int i11, int i12, boolean z11, boolean z12) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int n11 = staggeredGridLayoutManager.f44774c.n();
            int i13 = staggeredGridLayoutManager.f44774c.i();
            int i14 = i12 > i11 ? 1 : -1;
            while (i11 != i12) {
                View view = this.f44822a.get(i11);
                int g10 = staggeredGridLayoutManager.f44774c.g(view);
                int d11 = staggeredGridLayoutManager.f44774c.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? g10 >= i13 : g10 > i13;
                if (!z12 ? d11 > n11 : d11 >= n11) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z11) {
                        return staggeredGridLayoutManager.getPosition(view);
                    }
                    if (g10 < n11 || d11 > i13) {
                        return staggeredGridLayoutManager.getPosition(view);
                    }
                }
                i11 += i14;
            }
            return -1;
        }

        final int h(int i11) {
            int i12 = this.f44824c;
            if (i12 != Integer.MIN_VALUE) {
                return i12;
            }
            if (this.f44822a.size() == 0) {
                return i11;
            }
            b();
            return this.f44824c;
        }

        public final View i(int i11, int i12) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            ArrayList<View> arrayList = this.f44822a;
            View view = null;
            if (i12 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.f44779h && staggeredGridLayoutManager.getPosition(view2) >= i11) || ((!staggeredGridLayoutManager.f44779h && staggeredGridLayoutManager.getPosition(view2) <= i11) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = arrayList.size();
            int i13 = 0;
            while (i13 < size2) {
                View view3 = arrayList.get(i13);
                if ((staggeredGridLayoutManager.f44779h && staggeredGridLayoutManager.getPosition(view3) <= i11) || ((!staggeredGridLayoutManager.f44779h && staggeredGridLayoutManager.getPosition(view3) >= i11) || !view3.hasFocusable())) {
                    break;
                }
                i13++;
                view = view3;
            }
            return view;
        }

        final int j(int i11) {
            int i12 = this.f44823b;
            if (i12 != Integer.MIN_VALUE) {
                return i12;
            }
            if (this.f44822a.size() == 0) {
                return i11;
            }
            c();
            return this.f44823b;
        }

        final void k() {
            ArrayList<View> arrayList = this.f44822a;
            int size = arrayList.size();
            View remove = arrayList.remove(size - 1);
            c cVar = (c) remove.getLayoutParams();
            cVar.f44804e = null;
            if (cVar.f44747a.isRemoved() || cVar.f44747a.isUpdated()) {
                this.f44825d -= StaggeredGridLayoutManager.this.f44774c.e(remove);
            }
            if (size == 1) {
                this.f44823b = LinearLayoutManager.INVALID_OFFSET;
            }
            this.f44824c = LinearLayoutManager.INVALID_OFFSET;
        }

        final void l() {
            ArrayList<View> arrayList = this.f44822a;
            View remove = arrayList.remove(0);
            c cVar = (c) remove.getLayoutParams();
            cVar.f44804e = null;
            if (arrayList.size() == 0) {
                this.f44824c = LinearLayoutManager.INVALID_OFFSET;
            }
            if (cVar.f44747a.isRemoved() || cVar.f44747a.isUpdated()) {
                this.f44825d -= StaggeredGridLayoutManager.this.f44774c.e(remove);
            }
            this.f44823b = LinearLayoutManager.INVALID_OFFSET;
        }

        final void m(View view) {
            c cVar = (c) view.getLayoutParams();
            cVar.f44804e = this;
            ArrayList<View> arrayList = this.f44822a;
            arrayList.add(0, view);
            this.f44823b = LinearLayoutManager.INVALID_OFFSET;
            if (arrayList.size() == 1) {
                this.f44824c = LinearLayoutManager.INVALID_OFFSET;
            }
            if (cVar.f44747a.isRemoved() || cVar.f44747a.isUpdated()) {
                this.f44825d = StaggeredGridLayoutManager.this.f44774c.e(view) + this.f44825d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.f44772a = -1;
        this.f44779h = false;
        this.f44780i = false;
        this.f44782k = -1;
        this.f44783l = LinearLayoutManager.INVALID_OFFSET;
        this.f44784m = new d();
        this.f44785n = 2;
        this.f44790s = new Rect();
        this.f44791t = new b();
        this.f44792u = false;
        this.f44793v = true;
        this.f44795x = new a();
        RecyclerView.o.d properties = RecyclerView.o.getProperties(context, attributeSet, i11, i12);
        int i13 = properties.f44743a;
        if (i13 != 0 && i13 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i13 != this.f44776e) {
            this.f44776e = i13;
            w wVar = this.f44774c;
            this.f44774c = this.f44775d;
            this.f44775d = wVar;
            requestLayout();
        }
        z(properties.f44744b);
        boolean z11 = properties.f44745c;
        assertNotInLayoutOrScroll(null);
        e eVar = this.f44788q;
        if (eVar != null && eVar.f44819h != z11) {
            eVar.f44819h = z11;
        }
        this.f44779h = z11;
        requestLayout();
        this.f44778g = new q();
        this.f44774c = w.b(this, this.f44776e);
        this.f44775d = w.b(this, 1 - this.f44776e);
    }

    private void A(int i11, int i12) {
        for (int i13 = 0; i13 < this.f44772a; i13++) {
            if (!this.f44773b[i13].f44822a.isEmpty()) {
                C(this.f44773b[i13], i11, i12);
            }
        }
    }

    private void B(int i11, RecyclerView.A a11) {
        int i12;
        int i13;
        int i14;
        q qVar = this.f44778g;
        boolean z11 = false;
        qVar.f45016b = 0;
        qVar.f45017c = i11;
        if (!isSmoothScrolling() || (i14 = a11.f44712a) == -1) {
            i12 = 0;
            i13 = 0;
        } else {
            if (this.f44780i == (i14 < i11)) {
                i12 = this.f44774c.o();
                i13 = 0;
            } else {
                i13 = this.f44774c.o();
                i12 = 0;
            }
        }
        if (getClipToPadding()) {
            qVar.f45020f = this.f44774c.n() - i13;
            qVar.f45021g = this.f44774c.i() + i12;
        } else {
            qVar.f45021g = this.f44774c.h() + i12;
            qVar.f45020f = -i13;
        }
        qVar.f45022h = false;
        qVar.f45015a = true;
        if (this.f44774c.l() == 0 && this.f44774c.h() == 0) {
            z11 = true;
        }
        qVar.f45023i = z11;
    }

    private void C(f fVar, int i11, int i12) {
        int i13 = fVar.f44825d;
        int i14 = fVar.f44826e;
        if (i11 == -1) {
            int i15 = fVar.f44823b;
            if (i15 == Integer.MIN_VALUE) {
                fVar.c();
                i15 = fVar.f44823b;
            }
            if (i15 + i13 <= i12) {
                this.f44781j.set(i14, false);
                return;
            }
            return;
        }
        int i16 = fVar.f44824c;
        if (i16 == Integer.MIN_VALUE) {
            fVar.b();
            i16 = fVar.f44824c;
        }
        if (i16 - i13 >= i12) {
            this.f44781j.set(i14, false);
        }
    }

    private static int D(int i11, int i12, int i13) {
        int mode;
        return (!(i12 == 0 && i13 == 0) && ((mode = View.MeasureSpec.getMode(i11)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - i12) - i13), mode) : i11;
    }

    private int computeScrollExtent(RecyclerView.A a11) {
        if (getChildCount() == 0) {
            return 0;
        }
        w wVar = this.f44774c;
        boolean z11 = !this.f44793v;
        return B.a(a11, wVar, g(z11), f(z11), this, this.f44793v);
    }

    private int computeScrollOffset(RecyclerView.A a11) {
        if (getChildCount() == 0) {
            return 0;
        }
        w wVar = this.f44774c;
        boolean z11 = !this.f44793v;
        return B.b(a11, wVar, g(z11), f(z11), this, this.f44793v, this.f44780i);
    }

    private int computeScrollRange(RecyclerView.A a11) {
        if (getChildCount() == 0) {
            return 0;
        }
        w wVar = this.f44774c;
        boolean z11 = !this.f44793v;
        return B.c(a11, wVar, g(z11), f(z11), this, this.f44793v);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0358  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int e(RecyclerView.v vVar, q qVar, RecyclerView.A a11) {
        f fVar;
        int i11;
        int n11;
        int e11;
        int i12;
        int n12;
        int e12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        RecyclerView.v vVar2 = vVar;
        int i16 = 0;
        int i17 = 1;
        staggeredGridLayoutManager.f44781j.set(0, staggeredGridLayoutManager.f44772a, true);
        q qVar2 = staggeredGridLayoutManager.f44778g;
        int i18 = qVar2.f45023i ? qVar.f45019e == 1 ? Integer.MAX_VALUE : LinearLayoutManager.INVALID_OFFSET : qVar.f45019e == 1 ? qVar.f45021g + qVar.f45016b : qVar.f45020f - qVar.f45016b;
        staggeredGridLayoutManager.A(qVar.f45019e, i18);
        int i19 = staggeredGridLayoutManager.f44780i ? staggeredGridLayoutManager.f44774c.i() : staggeredGridLayoutManager.f44774c.n();
        boolean z12 = false;
        while (true) {
            int i21 = qVar.f45017c;
            if (((i21 < 0 || i21 >= a11.b()) ? i16 : i17) == 0 || (!qVar2.f45023i && staggeredGridLayoutManager.f44781j.isEmpty())) {
                break;
            }
            View g10 = vVar2.g(qVar.f45017c);
            qVar.f45017c += qVar.f45018d;
            c cVar = (c) g10.getLayoutParams();
            int layoutPosition = cVar.f44747a.getLayoutPosition();
            d dVar = staggeredGridLayoutManager.f44784m;
            int[] iArr = dVar.f44806a;
            int i22 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            int i23 = i22 == -1 ? i17 : i16;
            if (i23 != 0) {
                if (cVar.f44805f) {
                    fVar = staggeredGridLayoutManager.f44773b[i16];
                } else {
                    if (staggeredGridLayoutManager.t(qVar.f45019e)) {
                        i14 = staggeredGridLayoutManager.f44772a - i17;
                        i13 = -1;
                        i15 = -1;
                    } else {
                        i13 = staggeredGridLayoutManager.f44772a;
                        i14 = i16;
                        i15 = i17;
                    }
                    f fVar2 = null;
                    if (qVar.f45019e == i17) {
                        int n13 = staggeredGridLayoutManager.f44774c.n();
                        int i24 = Integer.MAX_VALUE;
                        while (i14 != i13) {
                            f fVar3 = staggeredGridLayoutManager.f44773b[i14];
                            int i25 = i14;
                            int h11 = fVar3.h(n13);
                            if (h11 < i24) {
                                i24 = h11;
                                fVar2 = fVar3;
                            }
                            i14 = i25 + i15;
                        }
                    } else {
                        int i26 = staggeredGridLayoutManager.f44774c.i();
                        int i27 = LinearLayoutManager.INVALID_OFFSET;
                        while (i14 != i13) {
                            f fVar4 = staggeredGridLayoutManager.f44773b[i14];
                            int i28 = i14;
                            int j11 = fVar4.j(i26);
                            if (j11 > i27) {
                                i27 = j11;
                                fVar2 = fVar4;
                            }
                            i14 = i28 + i15;
                        }
                    }
                    fVar = fVar2;
                }
                dVar.b(layoutPosition);
                dVar.f44806a[layoutPosition] = fVar.f44826e;
            } else {
                fVar = staggeredGridLayoutManager.f44773b[i22];
            }
            f fVar5 = fVar;
            cVar.f44804e = fVar5;
            if (qVar.f45019e == 1) {
                staggeredGridLayoutManager.addView(g10);
            } else {
                staggeredGridLayoutManager.addView(g10, 0);
            }
            if (!cVar.f44805f) {
                i11 = i23;
                if (staggeredGridLayoutManager.f44776e == 1) {
                    staggeredGridLayoutManager.r(g10, RecyclerView.o.getChildMeasureSpec(staggeredGridLayoutManager.f44777f, staggeredGridLayoutManager.getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.o.getChildMeasureSpec(staggeredGridLayoutManager.getHeight(), staggeredGridLayoutManager.getHeightMode(), staggeredGridLayoutManager.getPaddingBottom() + staggeredGridLayoutManager.getPaddingTop(), ((ViewGroup.MarginLayoutParams) cVar).height, true));
                } else {
                    staggeredGridLayoutManager.r(g10, RecyclerView.o.getChildMeasureSpec(staggeredGridLayoutManager.getWidth(), staggeredGridLayoutManager.getWidthMode(), staggeredGridLayoutManager.getPaddingRight() + staggeredGridLayoutManager.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.o.getChildMeasureSpec(staggeredGridLayoutManager.f44777f, staggeredGridLayoutManager.getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false));
                }
            } else if (staggeredGridLayoutManager.f44776e == 1) {
                i11 = i23;
                staggeredGridLayoutManager.r(g10, staggeredGridLayoutManager.f44789r, RecyclerView.o.getChildMeasureSpec(staggeredGridLayoutManager.getHeight(), staggeredGridLayoutManager.getHeightMode(), staggeredGridLayoutManager.getPaddingBottom() + staggeredGridLayoutManager.getPaddingTop(), ((ViewGroup.MarginLayoutParams) cVar).height, true));
            } else {
                i11 = i23;
                staggeredGridLayoutManager.r(g10, RecyclerView.o.getChildMeasureSpec(staggeredGridLayoutManager.getWidth(), staggeredGridLayoutManager.getWidthMode(), staggeredGridLayoutManager.getPaddingRight() + staggeredGridLayoutManager.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) cVar).width, true), staggeredGridLayoutManager.f44789r);
            }
            if (qVar.f45019e == 1) {
                e11 = cVar.f44805f ? staggeredGridLayoutManager.m(i19) : fVar5.h(i19);
                n11 = staggeredGridLayoutManager.f44774c.e(g10) + e11;
                if (i11 != 0 && cVar.f44805f) {
                    d.a aVar = new d.a();
                    aVar.f44810c = new int[staggeredGridLayoutManager.f44772a];
                    for (int i29 = 0; i29 < staggeredGridLayoutManager.f44772a; i29++) {
                        aVar.f44810c[i29] = e11 - staggeredGridLayoutManager.f44773b[i29].h(e11);
                    }
                    aVar.f44809b = -1;
                    aVar.f44808a = layoutPosition;
                    dVar.a(aVar);
                }
            } else {
                n11 = cVar.f44805f ? staggeredGridLayoutManager.n(i19) : fVar5.j(i19);
                e11 = n11 - staggeredGridLayoutManager.f44774c.e(g10);
                if (i11 != 0 && cVar.f44805f) {
                    d.a aVar2 = new d.a();
                    aVar2.f44810c = new int[staggeredGridLayoutManager.f44772a];
                    for (int i31 = 0; i31 < staggeredGridLayoutManager.f44772a; i31++) {
                        aVar2.f44810c[i31] = staggeredGridLayoutManager.f44773b[i31].j(n11) - n11;
                    }
                    aVar2.f44809b = 1;
                    aVar2.f44808a = layoutPosition;
                    dVar.a(aVar2);
                }
            }
            if (!cVar.f44805f || qVar.f45018d != -1) {
                i12 = 1;
            } else if (i11 != 0) {
                staggeredGridLayoutManager.f44792u = true;
                i12 = 1;
            } else {
                if (qVar.f45019e != 1) {
                    int j12 = staggeredGridLayoutManager.f44773b[0].j(LinearLayoutManager.INVALID_OFFSET);
                    int i32 = 1;
                    while (true) {
                        if (i32 >= staggeredGridLayoutManager.f44772a) {
                            z11 = true;
                            break;
                        }
                        if (staggeredGridLayoutManager.f44773b[i32].j(LinearLayoutManager.INVALID_OFFSET) != j12) {
                            z11 = false;
                            break;
                        }
                        i32++;
                    }
                } else {
                    int h12 = staggeredGridLayoutManager.f44773b[0].h(LinearLayoutManager.INVALID_OFFSET);
                    int i33 = 1;
                    while (true) {
                        if (i33 >= staggeredGridLayoutManager.f44772a) {
                            z11 = true;
                            break;
                        }
                        if (staggeredGridLayoutManager.f44773b[i33].h(LinearLayoutManager.INVALID_OFFSET) != h12) {
                            z11 = false;
                            break;
                        }
                        i33++;
                    }
                }
                i12 = 1;
                if (!z11) {
                    d.a e13 = dVar.e(layoutPosition);
                    if (e13 != null) {
                        e13.f44811d = true;
                    }
                    staggeredGridLayoutManager.f44792u = true;
                }
                if (qVar.f45019e != i12) {
                    if (cVar.f44805f) {
                        for (int i34 = staggeredGridLayoutManager.f44772a - i12; i34 >= 0; i34--) {
                            staggeredGridLayoutManager.f44773b[i34].a(g10);
                        }
                    } else {
                        cVar.f44804e.a(g10);
                    }
                } else if (cVar.f44805f) {
                    for (int i35 = staggeredGridLayoutManager.f44772a - 1; i35 >= 0; i35--) {
                        staggeredGridLayoutManager.f44773b[i35].m(g10);
                    }
                } else {
                    cVar.f44804e.m(g10);
                }
                if (staggeredGridLayoutManager.isLayoutRTL() || staggeredGridLayoutManager.f44776e != 1) {
                    n12 = !cVar.f44805f ? staggeredGridLayoutManager.f44775d.n() : staggeredGridLayoutManager.f44775d.n() + (fVar5.f44826e * staggeredGridLayoutManager.f44777f);
                    e12 = staggeredGridLayoutManager.f44775d.e(g10) + n12;
                } else {
                    e12 = cVar.f44805f ? staggeredGridLayoutManager.f44775d.i() : staggeredGridLayoutManager.f44775d.i() - (((staggeredGridLayoutManager.f44772a - 1) - fVar5.f44826e) * staggeredGridLayoutManager.f44777f);
                    n12 = e12 - staggeredGridLayoutManager.f44775d.e(g10);
                }
                int i36 = n12;
                int i37 = e12;
                if (staggeredGridLayoutManager.f44776e != 1) {
                    staggeredGridLayoutManager.layoutDecoratedWithMargins(g10, i36, e11, i37, n11);
                    staggeredGridLayoutManager = this;
                } else {
                    staggeredGridLayoutManager.layoutDecoratedWithMargins(g10, e11, i36, n11, i37);
                }
                if (cVar.f44805f) {
                    staggeredGridLayoutManager.C(fVar5, qVar2.f45019e, i18);
                } else {
                    staggeredGridLayoutManager.A(qVar2.f45019e, i18);
                }
                vVar2 = vVar;
                staggeredGridLayoutManager.v(vVar2, qVar2);
                if (qVar2.f45022h && g10.hasFocusable()) {
                    if (cVar.f44805f) {
                        staggeredGridLayoutManager.f44781j.set(fVar5.f44826e, false);
                    } else {
                        staggeredGridLayoutManager.f44781j.clear();
                    }
                }
                z12 = true;
                i17 = 1;
                i16 = 0;
            }
            if (qVar.f45019e != i12) {
            }
            if (staggeredGridLayoutManager.isLayoutRTL()) {
            }
            if (!cVar.f44805f) {
            }
            e12 = staggeredGridLayoutManager.f44775d.e(g10) + n12;
            int i362 = n12;
            int i372 = e12;
            if (staggeredGridLayoutManager.f44776e != 1) {
            }
            if (cVar.f44805f) {
            }
            vVar2 = vVar;
            staggeredGridLayoutManager.v(vVar2, qVar2);
            if (qVar2.f45022h) {
                if (cVar.f44805f) {
                }
            }
            z12 = true;
            i17 = 1;
            i16 = 0;
        }
        if (!z12) {
            staggeredGridLayoutManager.v(vVar2, qVar2);
        }
        int n14 = qVar2.f45019e == -1 ? staggeredGridLayoutManager.f44774c.n() - staggeredGridLayoutManager.n(staggeredGridLayoutManager.f44774c.n()) : staggeredGridLayoutManager.m(staggeredGridLayoutManager.f44774c.i()) - staggeredGridLayoutManager.f44774c.i();
        if (n14 > 0) {
            return Math.min(qVar.f45016b, n14);
        }
        return 0;
    }

    private void i(RecyclerView.v vVar, RecyclerView.A a11, boolean z11) {
        int i11;
        int m11 = m(LinearLayoutManager.INVALID_OFFSET);
        if (m11 != Integer.MIN_VALUE && (i11 = this.f44774c.i() - m11) > 0) {
            int i12 = i11 - (-scrollBy(-i11, vVar, a11));
            if (!z11 || i12 <= 0) {
                return;
            }
            this.f44774c.s(i12);
        }
    }

    private void j(RecyclerView.v vVar, RecyclerView.A a11, boolean z11) {
        int n11;
        int n12 = n(Integer.MAX_VALUE);
        if (n12 != Integer.MAX_VALUE && (n11 = n12 - this.f44774c.n()) > 0) {
            int scrollBy = n11 - scrollBy(n11, vVar, a11);
            if (!z11 || scrollBy <= 0) {
                return;
            }
            this.f44774c.s(-scrollBy);
        }
    }

    private int m(int i11) {
        int h11 = this.f44773b[0].h(i11);
        for (int i12 = 1; i12 < this.f44772a; i12++) {
            int h12 = this.f44773b[i12].h(i11);
            if (h12 > h11) {
                h11 = h12;
            }
        }
        return h11;
    }

    private int n(int i11) {
        int j11 = this.f44773b[0].j(i11);
        for (int i12 = 1; i12 < this.f44772a; i12++) {
            int j12 = this.f44773b[i12].j(i11);
            if (j12 < j11) {
                j11 = j12;
            }
        }
        return j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void p(int i11, int i12, int i13) {
        int i14;
        int i15;
        int l11 = this.f44780i ? l() : k();
        if (i13 != 8) {
            i14 = i11 + i12;
        } else {
            if (i11 >= i12) {
                i14 = i11 + 1;
                i15 = i12;
                d dVar = this.f44784m;
                dVar.f(i15);
                if (i13 != 1) {
                    dVar.g(i11, i12);
                } else if (i13 == 2) {
                    dVar.h(i11, i12);
                } else if (i13 == 8) {
                    dVar.h(i11, 1);
                    dVar.g(i12, 1);
                }
                if (i14 > l11) {
                    return;
                }
                if (i15 <= (this.f44780i ? k() : l())) {
                    requestLayout();
                    return;
                }
                return;
            }
            i14 = i12 + 1;
        }
        i15 = i11;
        d dVar2 = this.f44784m;
        dVar2.f(i15);
        if (i13 != 1) {
        }
        if (i14 > l11) {
        }
    }

    private void r(View view, int i11, int i12) {
        Rect rect = this.f44790s;
        calculateItemDecorationsForChild(view, rect);
        c cVar = (c) view.getLayoutParams();
        int D11 = D(i11, ((ViewGroup.MarginLayoutParams) cVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int D12 = D(i12, ((ViewGroup.MarginLayoutParams) cVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, D11, D12, cVar)) {
            view.measure(D11, D12);
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.f44776e == 1 || !isLayoutRTL()) {
            this.f44780i = this.f44779h;
        } else {
            this.f44780i = !this.f44779h;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a6, code lost:
    
        if ((r12 < k()) != r16.f44780i) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x042c, code lost:
    
        if (d() != false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0198, code lost:
    
        if (r16.f44780i != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a8, code lost:
    
        r12 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void s(RecyclerView.v vVar, RecyclerView.A a11, boolean z11) {
        e eVar;
        int i11;
        int i12;
        boolean z12;
        e eVar2 = this.f44788q;
        b bVar = this.f44791t;
        if (!(eVar2 == null && this.f44782k == -1) && a11.b() == 0) {
            removeAndRecycleAllViews(vVar);
            bVar.a();
            return;
        }
        boolean z13 = true;
        boolean z14 = (bVar.f44801e && this.f44782k == -1 && this.f44788q == null) ? false : true;
        d dVar = this.f44784m;
        StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
        if (z14) {
            bVar.a();
            e eVar3 = this.f44788q;
            if (eVar3 != null) {
                int i13 = eVar3.f44814c;
                if (i13 > 0) {
                    if (i13 == this.f44772a) {
                        for (int i14 = 0; i14 < this.f44772a; i14++) {
                            this.f44773b[i14].d();
                            e eVar4 = this.f44788q;
                            int i15 = eVar4.f44815d[i14];
                            if (i15 != Integer.MIN_VALUE) {
                                i15 += eVar4.f44820i ? this.f44774c.i() : this.f44774c.n();
                            }
                            f fVar = this.f44773b[i14];
                            fVar.f44823b = i15;
                            fVar.f44824c = i15;
                        }
                    } else {
                        eVar3.f44815d = null;
                        eVar3.f44814c = 0;
                        eVar3.f44816e = 0;
                        eVar3.f44817f = null;
                        eVar3.f44818g = null;
                        eVar3.f44812a = eVar3.f44813b;
                    }
                }
                e eVar5 = this.f44788q;
                this.f44787p = eVar5.f44821j;
                boolean z15 = eVar5.f44819h;
                assertNotInLayoutOrScroll(null);
                e eVar6 = this.f44788q;
                if (eVar6 != null && eVar6.f44819h != z15) {
                    eVar6.f44819h = z15;
                }
                this.f44779h = z15;
                requestLayout();
                resolveShouldLayoutReverse();
                e eVar7 = this.f44788q;
                int i16 = eVar7.f44812a;
                if (i16 != -1) {
                    this.f44782k = i16;
                    bVar.f44799c = eVar7.f44820i;
                } else {
                    bVar.f44799c = this.f44780i;
                }
                if (eVar7.f44816e > 1) {
                    dVar.f44806a = eVar7.f44817f;
                    dVar.f44807b = eVar7.f44818g;
                }
            } else {
                resolveShouldLayoutReverse();
                bVar.f44799c = this.f44780i;
            }
            if (!a11.f44718g && (i12 = this.f44782k) != -1) {
                if (i12 < 0 || i12 >= a11.b()) {
                    this.f44782k = -1;
                    this.f44783l = LinearLayoutManager.INVALID_OFFSET;
                } else {
                    e eVar8 = this.f44788q;
                    if (eVar8 == null || eVar8.f44812a == -1 || eVar8.f44814c < 1) {
                        View findViewByPosition = findViewByPosition(this.f44782k);
                        if (findViewByPosition != null) {
                            bVar.f44797a = this.f44780i ? l() : k();
                            if (this.f44783l != Integer.MIN_VALUE) {
                                if (bVar.f44799c) {
                                    bVar.f44798b = (this.f44774c.i() - this.f44783l) - this.f44774c.d(findViewByPosition);
                                } else {
                                    bVar.f44798b = (this.f44774c.n() + this.f44783l) - this.f44774c.g(findViewByPosition);
                                }
                            } else if (this.f44774c.e(findViewByPosition) > this.f44774c.o()) {
                                bVar.f44798b = bVar.f44799c ? this.f44774c.i() : this.f44774c.n();
                            } else {
                                int g10 = this.f44774c.g(findViewByPosition) - this.f44774c.n();
                                if (g10 < 0) {
                                    bVar.f44798b = -g10;
                                } else {
                                    int i17 = this.f44774c.i() - this.f44774c.d(findViewByPosition);
                                    if (i17 < 0) {
                                        bVar.f44798b = i17;
                                    } else {
                                        bVar.f44798b = LinearLayoutManager.INVALID_OFFSET;
                                    }
                                }
                            }
                        } else {
                            int i18 = this.f44782k;
                            bVar.f44797a = i18;
                            int i19 = this.f44783l;
                            if (i19 == Integer.MIN_VALUE) {
                                if (getChildCount() == 0) {
                                }
                                bVar.f44799c = z12;
                                bVar.f44798b = z12 ? staggeredGridLayoutManager.f44774c.i() : staggeredGridLayoutManager.f44774c.n();
                            } else if (bVar.f44799c) {
                                bVar.f44798b = staggeredGridLayoutManager.f44774c.i() - i19;
                            } else {
                                bVar.f44798b = staggeredGridLayoutManager.f44774c.n() + i19;
                            }
                            bVar.f44800d = true;
                        }
                    } else {
                        bVar.f44798b = LinearLayoutManager.INVALID_OFFSET;
                        bVar.f44797a = this.f44782k;
                    }
                    bVar.f44801e = true;
                }
            }
            if (this.f44786o) {
                int b11 = a11.b();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    i11 = getPosition(getChildAt(childCount));
                    if (i11 >= 0 && i11 < b11) {
                        break;
                    }
                }
                i11 = 0;
                bVar.f44797a = i11;
                bVar.f44798b = LinearLayoutManager.INVALID_OFFSET;
                bVar.f44801e = true;
            } else {
                int b12 = a11.b();
                int childCount2 = getChildCount();
                for (int i21 = 0; i21 < childCount2; i21++) {
                    int position = getPosition(getChildAt(i21));
                    if (position >= 0 && position < b12) {
                        i11 = position;
                        break;
                    }
                }
                i11 = 0;
                bVar.f44797a = i11;
                bVar.f44798b = LinearLayoutManager.INVALID_OFFSET;
                bVar.f44801e = true;
            }
        }
        if (this.f44788q == null && this.f44782k == -1 && (bVar.f44799c != this.f44786o || isLayoutRTL() != this.f44787p)) {
            int[] iArr = dVar.f44806a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            dVar.f44807b = null;
            bVar.f44800d = true;
        }
        if (getChildCount() > 0 && ((eVar = this.f44788q) == null || eVar.f44814c < 1)) {
            if (bVar.f44800d) {
                for (int i22 = 0; i22 < this.f44772a; i22++) {
                    this.f44773b[i22].d();
                    int i23 = bVar.f44798b;
                    if (i23 != Integer.MIN_VALUE) {
                        f fVar2 = this.f44773b[i22];
                        fVar2.f44823b = i23;
                        fVar2.f44824c = i23;
                    }
                }
            } else if (z14 || bVar.f44802f == null) {
                for (int i24 = 0; i24 < this.f44772a; i24++) {
                    f fVar3 = this.f44773b[i24];
                    boolean z16 = this.f44780i;
                    int i25 = bVar.f44798b;
                    int h11 = z16 ? fVar3.h(LinearLayoutManager.INVALID_OFFSET) : fVar3.j(LinearLayoutManager.INVALID_OFFSET);
                    fVar3.d();
                    if (h11 != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                        if ((!z16 || h11 >= staggeredGridLayoutManager2.f44774c.i()) && (z16 || h11 <= staggeredGridLayoutManager2.f44774c.n())) {
                            if (i25 != Integer.MIN_VALUE) {
                                h11 += i25;
                            }
                            fVar3.f44824c = h11;
                            fVar3.f44823b = h11;
                        }
                    }
                }
                f[] fVarArr = this.f44773b;
                int length = fVarArr.length;
                int[] iArr2 = bVar.f44802f;
                if (iArr2 == null || iArr2.length < length) {
                    bVar.f44802f = new int[staggeredGridLayoutManager.f44773b.length];
                }
                for (int i26 = 0; i26 < length; i26++) {
                    bVar.f44802f[i26] = fVarArr[i26].j(LinearLayoutManager.INVALID_OFFSET);
                }
            } else {
                for (int i27 = 0; i27 < this.f44772a; i27++) {
                    f fVar4 = this.f44773b[i27];
                    fVar4.d();
                    int i28 = bVar.f44802f[i27];
                    fVar4.f44823b = i28;
                    fVar4.f44824c = i28;
                }
            }
        }
        detachAndScrapAttachedViews(vVar);
        q qVar = this.f44778g;
        qVar.f45015a = false;
        this.f44792u = false;
        int o11 = this.f44775d.o();
        this.f44777f = o11 / this.f44772a;
        this.f44789r = View.MeasureSpec.makeMeasureSpec(o11, this.f44775d.l());
        B(bVar.f44797a, a11);
        if (bVar.f44799c) {
            y(-1);
            e(vVar, qVar, a11);
            y(1);
            qVar.f45017c = bVar.f44797a + qVar.f45018d;
            e(vVar, qVar, a11);
        } else {
            y(1);
            e(vVar, qVar, a11);
            y(-1);
            qVar.f45017c = bVar.f44797a + qVar.f45018d;
            e(vVar, qVar, a11);
        }
        if (this.f44775d.l() != 1073741824) {
            int childCount3 = getChildCount();
            float f7 = 0.0f;
            for (int i29 = 0; i29 < childCount3; i29++) {
                View childAt = getChildAt(i29);
                float e11 = this.f44775d.e(childAt);
                if (e11 >= f7) {
                    if (((c) childAt.getLayoutParams()).f44805f) {
                        e11 = (e11 * 1.0f) / this.f44772a;
                    }
                    f7 = Math.max(f7, e11);
                }
            }
            int i31 = this.f44777f;
            int round = Math.round(f7 * this.f44772a);
            if (this.f44775d.l() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f44775d.o());
            }
            this.f44777f = round / this.f44772a;
            this.f44789r = View.MeasureSpec.makeMeasureSpec(round, this.f44775d.l());
            if (this.f44777f != i31) {
                for (int i32 = 0; i32 < childCount3; i32++) {
                    View childAt2 = getChildAt(i32);
                    c cVar = (c) childAt2.getLayoutParams();
                    if (!cVar.f44805f) {
                        if (isLayoutRTL() && this.f44776e == 1) {
                            int i33 = -((this.f44772a - 1) - cVar.f44804e.f44826e);
                            childAt2.offsetLeftAndRight((this.f44777f * i33) - (i33 * i31));
                        } else {
                            int i34 = cVar.f44804e.f44826e;
                            int i35 = this.f44777f * i34;
                            int i36 = i34 * i31;
                            if (this.f44776e == 1) {
                                childAt2.offsetLeftAndRight(i35 - i36);
                            } else {
                                childAt2.offsetTopAndBottom(i35 - i36);
                            }
                        }
                    }
                }
            }
        }
        if (getChildCount() > 0) {
            if (this.f44780i) {
                i(vVar, a11, true);
                j(vVar, a11, false);
            } else {
                j(vVar, a11, true);
                i(vVar, a11, false);
            }
        }
        if (z11 && !a11.f44718g && this.f44785n != 0 && getChildCount() > 0 && (this.f44792u || q() != null)) {
            removeCallbacks(this.f44795x);
        }
        z13 = false;
        if (a11.f44718g) {
            bVar.a();
        }
        this.f44786o = bVar.f44799c;
        this.f44787p = isLayoutRTL();
        if (z13) {
            bVar.a();
            s(vVar, a11, false);
        }
    }

    private boolean t(int i11) {
        if (this.f44776e == 0) {
            return (i11 == -1) != this.f44780i;
        }
        return ((i11 == -1) == this.f44780i) == isLayoutRTL();
    }

    private void v(RecyclerView.v vVar, q qVar) {
        if (!qVar.f45015a || qVar.f45023i) {
            return;
        }
        if (qVar.f45016b == 0) {
            if (qVar.f45019e == -1) {
                w(qVar.f45021g, vVar);
                return;
            } else {
                x(qVar.f45020f, vVar);
                return;
            }
        }
        int i11 = 1;
        if (qVar.f45019e == -1) {
            int i12 = qVar.f45020f;
            int j11 = this.f44773b[0].j(i12);
            while (i11 < this.f44772a) {
                int j12 = this.f44773b[i11].j(i12);
                if (j12 > j11) {
                    j11 = j12;
                }
                i11++;
            }
            int i13 = i12 - j11;
            w(i13 < 0 ? qVar.f45021g : qVar.f45021g - Math.min(i13, qVar.f45016b), vVar);
            return;
        }
        int i14 = qVar.f45021g;
        int h11 = this.f44773b[0].h(i14);
        while (i11 < this.f44772a) {
            int h12 = this.f44773b[i11].h(i14);
            if (h12 < h11) {
                h11 = h12;
            }
            i11++;
        }
        int i15 = h11 - qVar.f45021g;
        x(i15 < 0 ? qVar.f45020f : Math.min(i15, qVar.f45016b) + qVar.f45020f, vVar);
    }

    private void w(int i11, RecyclerView.v vVar) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f44774c.g(childAt) < i11 || this.f44774c.r(childAt) < i11) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.f44805f) {
                for (int i12 = 0; i12 < this.f44772a; i12++) {
                    if (this.f44773b[i12].f44822a.size() == 1) {
                        return;
                    }
                }
                for (int i13 = 0; i13 < this.f44772a; i13++) {
                    this.f44773b[i13].k();
                }
            } else if (cVar.f44804e.f44822a.size() == 1) {
                return;
            } else {
                cVar.f44804e.k();
            }
            removeAndRecycleView(childAt, vVar);
        }
    }

    private void x(int i11, RecyclerView.v vVar) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f44774c.d(childAt) > i11 || this.f44774c.q(childAt) > i11) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.f44805f) {
                for (int i12 = 0; i12 < this.f44772a; i12++) {
                    if (this.f44773b[i12].f44822a.size() == 1) {
                        return;
                    }
                }
                for (int i13 = 0; i13 < this.f44772a; i13++) {
                    this.f44773b[i13].l();
                }
            } else if (cVar.f44804e.f44822a.size() == 1) {
                return;
            } else {
                cVar.f44804e.l();
            }
            removeAndRecycleView(childAt, vVar);
        }
    }

    private void y(int i11) {
        q qVar = this.f44778g;
        qVar.f45019e = i11;
        qVar.f45018d = this.f44780i != (i11 == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.f44788q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollHorizontally() {
        return this.f44776e == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollVertically() {
        return this.f44776e == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean checkLayoutParams(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void collectAdjacentPrefetchPositions(int i11, int i12, RecyclerView.A a11, RecyclerView.o.c cVar) {
        q qVar;
        int h11;
        int i13;
        if (this.f44776e != 0) {
            i11 = i12;
        }
        if (getChildCount() == 0 || i11 == 0) {
            return;
        }
        u(i11, a11);
        int[] iArr = this.f44794w;
        if (iArr == null || iArr.length < this.f44772a) {
            this.f44794w = new int[this.f44772a];
        }
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int i16 = this.f44772a;
            qVar = this.f44778g;
            if (i14 >= i16) {
                break;
            }
            if (qVar.f45018d == -1) {
                h11 = qVar.f45020f;
                i13 = this.f44773b[i14].j(h11);
            } else {
                h11 = this.f44773b[i14].h(qVar.f45021g);
                i13 = qVar.f45021g;
            }
            int i17 = h11 - i13;
            if (i17 >= 0) {
                this.f44794w[i15] = i17;
                i15++;
            }
            i14++;
        }
        Arrays.sort(this.f44794w, 0, i15);
        for (int i18 = 0; i18 < i15; i18++) {
            int i19 = qVar.f45017c;
            if (i19 < 0 || i19 >= a11.b()) {
                return;
            }
            cVar.a(qVar.f45017c, this.f44794w[i18]);
            qVar.f45017c += qVar.f45018d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeHorizontalScrollExtent(RecyclerView.A a11) {
        return computeScrollExtent(a11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeHorizontalScrollOffset(RecyclerView.A a11) {
        return computeScrollOffset(a11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeHorizontalScrollRange(RecyclerView.A a11) {
        return computeScrollRange(a11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if ((r4 < k()) != r3.f44780i) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.f44780i != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF computeScrollVectorForPosition(int i11) {
        int i12 = -1;
        if (getChildCount() == 0) {
        }
        PointF pointF = new PointF();
        if (i12 == 0) {
            return null;
        }
        if (this.f44776e == 0) {
            pointF.x = i12;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i12;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollExtent(RecyclerView.A a11) {
        return computeScrollExtent(a11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollOffset(RecyclerView.A a11) {
        return computeScrollOffset(a11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollRange(RecyclerView.A a11) {
        return computeScrollRange(a11);
    }

    final boolean d() {
        int k11;
        int l11;
        if (getChildCount() != 0 && this.f44785n != 0 && isAttachedToWindow()) {
            if (this.f44780i) {
                k11 = l();
                l11 = k();
            } else {
                k11 = k();
                l11 = l();
            }
            d dVar = this.f44784m;
            if (k11 == 0 && q() != null) {
                int[] iArr = dVar.f44806a;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                dVar.f44807b = null;
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
            if (this.f44792u) {
                int i11 = this.f44780i ? -1 : 1;
                int i12 = l11 + 1;
                d.a d11 = dVar.d(k11, i12, i11);
                if (d11 == null) {
                    this.f44792u = false;
                    dVar.c(i12);
                    return false;
                }
                d.a d12 = dVar.d(k11, d11.f44808a, i11 * (-1));
                if (d12 == null) {
                    dVar.c(d11.f44808a);
                } else {
                    dVar.c(d12.f44808a + 1);
                }
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    final View f(boolean z11) {
        int n11 = this.f44774c.n();
        int i11 = this.f44774c.i();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int g10 = this.f44774c.g(childAt);
            int d11 = this.f44774c.d(childAt);
            if (d11 > n11 && g10 < i11) {
                if (d11 <= i11 || !z11) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    final View g(boolean z11) {
        int n11 = this.f44774c.n();
        int i11 = this.f44774c.i();
        int childCount = getChildCount();
        View view = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            int g10 = this.f44774c.g(childAt);
            if (this.f44774c.d(childAt) > n11 && g10 < i11) {
                if (g10 >= n11 || !z11) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateDefaultLayoutParams() {
        return this.f44776e == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int getColumnCountForAccessibility(RecyclerView.v vVar, RecyclerView.A a11) {
        return this.f44776e == 1 ? this.f44772a : super.getColumnCountForAccessibility(vVar, a11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int getRowCountForAccessibility(RecyclerView.v vVar, RecyclerView.A a11) {
        return this.f44776e == 0 ? this.f44772a : super.getRowCountForAccessibility(vVar, a11);
    }

    public final int[] h() {
        int[] iArr = new int[this.f44772a];
        for (int i11 = 0; i11 < this.f44772a; i11++) {
            f fVar = this.f44773b[i11];
            boolean z11 = StaggeredGridLayoutManager.this.f44779h;
            ArrayList<View> arrayList = fVar.f44822a;
            iArr[i11] = z11 ? fVar.g(arrayList.size() - 1, -1, true, false) : fVar.g(0, arrayList.size(), true, false);
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean isAutoMeasureEnabled() {
        return this.f44785n != 0;
    }

    final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    final int k() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    final int l() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public final int o() {
        return this.f44772a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void offsetChildrenHorizontal(int i11) {
        super.offsetChildrenHorizontal(i11);
        for (int i12 = 0; i12 < this.f44772a; i12++) {
            f fVar = this.f44773b[i12];
            int i13 = fVar.f44823b;
            if (i13 != Integer.MIN_VALUE) {
                fVar.f44823b = i13 + i11;
            }
            int i14 = fVar.f44824c;
            if (i14 != Integer.MIN_VALUE) {
                fVar.f44824c = i14 + i11;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void offsetChildrenVertical(int i11) {
        super.offsetChildrenVertical(i11);
        for (int i12 = 0; i12 < this.f44772a; i12++) {
            f fVar = this.f44773b[i12];
            int i13 = fVar.f44823b;
            if (i13 != Integer.MIN_VALUE) {
                fVar.f44823b = i13 + i11;
            }
            int i14 = fVar.f44824c;
            if (i14 != Integer.MIN_VALUE) {
                fVar.f44824c = i14 + i11;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        removeCallbacks(this.f44795x);
        for (int i11 = 0; i11 < this.f44772a; i11++) {
            this.f44773b[i11].d();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x003a, code lost:
    
        if (r9.f44776e == 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0040, code lost:
    
        if (r9.f44776e == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x004c, code lost:
    
        if (isLayoutRTL() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0058, code lost:
    
        if (isLayoutRTL() == false) goto L29;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onFocusSearchFailed(View view, int i11, RecyclerView.v vVar, RecyclerView.A a11) {
        View findContainingItemView;
        int i12;
        View i13;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        if (i11 == 1) {
            if (this.f44776e != 1) {
            }
            i12 = -1;
        } else if (i11 == 2) {
            if (this.f44776e != 1) {
            }
            i12 = 1;
        } else if (i11 != 17) {
            if (i11 != 33) {
                if (i11 == 66) {
                }
            }
            i12 = Integer.MIN_VALUE;
        }
        if (i12 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) findContainingItemView.getLayoutParams();
        boolean z11 = cVar.f44805f;
        f fVar = cVar.f44804e;
        int l11 = i12 == 1 ? l() : k();
        B(l11, a11);
        y(i12);
        q qVar = this.f44778g;
        qVar.f45017c = qVar.f45018d + l11;
        qVar.f45016b = (int) (this.f44774c.o() * 0.33333334f);
        qVar.f45022h = true;
        qVar.f45015a = false;
        e(vVar, qVar, a11);
        this.f44786o = this.f44780i;
        if (!z11 && (i13 = fVar.i(l11, i12)) != null && i13 != findContainingItemView) {
            return i13;
        }
        if (t(i12)) {
            for (int i14 = this.f44772a - 1; i14 >= 0; i14--) {
                View i15 = this.f44773b[i14].i(l11, i12);
                if (i15 != null && i15 != findContainingItemView) {
                    return i15;
                }
            }
        } else {
            for (int i16 = 0; i16 < this.f44772a; i16++) {
                View i17 = this.f44773b[i16].i(l11, i12);
                if (i17 != null && i17 != findContainingItemView) {
                    return i17;
                }
            }
        }
        boolean z12 = (this.f44779h ^ true) == (i12 == -1);
        if (!z11) {
            View findViewByPosition = findViewByPosition(z12 ? fVar.e() : fVar.f());
            if (findViewByPosition != null && findViewByPosition != findContainingItemView) {
                return findViewByPosition;
            }
        }
        if (t(i12)) {
            for (int i18 = this.f44772a - 1; i18 >= 0; i18--) {
                if (i18 != fVar.f44826e) {
                    View findViewByPosition2 = findViewByPosition(z12 ? this.f44773b[i18].e() : this.f44773b[i18].f());
                    if (findViewByPosition2 != null && findViewByPosition2 != findContainingItemView) {
                        return findViewByPosition2;
                    }
                }
            }
        } else {
            for (int i19 = 0; i19 < this.f44772a; i19++) {
                View findViewByPosition3 = findViewByPosition(z12 ? this.f44773b[i19].e() : this.f44773b[i19].f());
                if (findViewByPosition3 != null && findViewByPosition3 != findContainingItemView) {
                    return findViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View g10 = g(false);
            View f7 = f(false);
            if (g10 == null || f7 == null) {
                return;
            }
            int position = getPosition(g10);
            int position2 = getPosition(f7);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.v vVar, RecyclerView.A a11, View view, y2.q qVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, qVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.f44776e == 0) {
            qVar.N(q.f.f(cVar.c(), cVar.f44805f ? this.f44772a : 1, -1, -1, false, false));
        } else {
            qVar.N(q.f.f(-1, -1, cVar.c(), cVar.f44805f ? this.f44772a : 1, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsAdded(RecyclerView recyclerView, int i11, int i12) {
        p(i11, i12, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsChanged(RecyclerView recyclerView) {
        d dVar = this.f44784m;
        int[] iArr = dVar.f44806a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        dVar.f44807b = null;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsMoved(RecyclerView recyclerView, int i11, int i12, int i13) {
        p(i11, i12, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsRemoved(RecyclerView recyclerView, int i11, int i12) {
        p(i11, i12, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onItemsUpdated(RecyclerView recyclerView, int i11, int i12, Object obj) {
        p(i11, i12, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutChildren(RecyclerView.v vVar, RecyclerView.A a11) {
        s(vVar, a11, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutCompleted(RecyclerView.A a11) {
        super.onLayoutCompleted(a11);
        this.f44782k = -1;
        this.f44783l = LinearLayoutManager.INVALID_OFFSET;
        this.f44788q = null;
        this.f44791t.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.f44788q = (e) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final Parcelable onSaveInstanceState() {
        int j11;
        int n11;
        int[] iArr;
        e eVar = this.f44788q;
        if (eVar != null) {
            e eVar2 = new e();
            eVar2.f44814c = eVar.f44814c;
            eVar2.f44812a = eVar.f44812a;
            eVar2.f44813b = eVar.f44813b;
            eVar2.f44815d = eVar.f44815d;
            eVar2.f44816e = eVar.f44816e;
            eVar2.f44817f = eVar.f44817f;
            eVar2.f44819h = eVar.f44819h;
            eVar2.f44820i = eVar.f44820i;
            eVar2.f44821j = eVar.f44821j;
            eVar2.f44818g = eVar.f44818g;
            return eVar2;
        }
        e eVar3 = new e();
        eVar3.f44819h = this.f44779h;
        eVar3.f44820i = this.f44786o;
        eVar3.f44821j = this.f44787p;
        d dVar = this.f44784m;
        if (dVar == null || (iArr = dVar.f44806a) == null) {
            eVar3.f44816e = 0;
        } else {
            eVar3.f44817f = iArr;
            eVar3.f44816e = iArr.length;
            eVar3.f44818g = dVar.f44807b;
        }
        if (getChildCount() <= 0) {
            eVar3.f44812a = -1;
            eVar3.f44813b = -1;
            eVar3.f44814c = 0;
            return eVar3;
        }
        eVar3.f44812a = this.f44786o ? l() : k();
        View f7 = this.f44780i ? f(true) : g(true);
        eVar3.f44813b = f7 != null ? getPosition(f7) : -1;
        int i11 = this.f44772a;
        eVar3.f44814c = i11;
        eVar3.f44815d = new int[i11];
        for (int i12 = 0; i12 < this.f44772a; i12++) {
            if (this.f44786o) {
                j11 = this.f44773b[i12].h(LinearLayoutManager.INVALID_OFFSET);
                if (j11 != Integer.MIN_VALUE) {
                    n11 = this.f44774c.i();
                    j11 -= n11;
                    eVar3.f44815d[i12] = j11;
                } else {
                    eVar3.f44815d[i12] = j11;
                }
            } else {
                j11 = this.f44773b[i12].j(LinearLayoutManager.INVALID_OFFSET);
                if (j11 != Integer.MIN_VALUE) {
                    n11 = this.f44774c.n();
                    j11 -= n11;
                    eVar3.f44815d[i12] = j11;
                } else {
                    eVar3.f44815d[i12] = j11;
                }
            }
        }
        return eVar3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onScrollStateChanged(int i11) {
        if (i11 == 0) {
            d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        if (r10 == r11) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d1, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cf, code lost:
    
        if (r10 == r11) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final View q() {
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        int childCount = getChildCount();
        int i12 = childCount - 1;
        BitSet bitSet = new BitSet(this.f44772a);
        bitSet.set(0, this.f44772a, true);
        char c11 = (this.f44776e == 1 && isLayoutRTL()) ? (char) 1 : (char) 65535;
        if (this.f44780i) {
            childCount = -1;
        } else {
            i12 = 0;
        }
        int i13 = i12 < childCount ? 1 : -1;
        while (i12 != childCount) {
            View childAt = getChildAt(i12);
            c cVar = (c) childAt.getLayoutParams();
            if (bitSet.get(cVar.f44804e.f44826e)) {
                f fVar = cVar.f44804e;
                if (this.f44780i) {
                    int i14 = fVar.f44824c;
                    if (i14 == Integer.MIN_VALUE) {
                        fVar.b();
                        i14 = fVar.f44824c;
                    }
                    if (i14 < this.f44774c.i()) {
                        z12 = ((c) ((View) o0.b(1, fVar.f44822a)).getLayoutParams()).f44805f;
                        z13 = !z12;
                    }
                    z13 = false;
                } else {
                    int i15 = fVar.f44823b;
                    if (i15 == Integer.MIN_VALUE) {
                        fVar.c();
                        i15 = fVar.f44823b;
                    }
                    if (i15 > this.f44774c.n()) {
                        z12 = ((c) fVar.f44822a.get(0).getLayoutParams()).f44805f;
                        z13 = !z12;
                    }
                    z13 = false;
                }
                if (z13) {
                    return childAt;
                }
                bitSet.clear(cVar.f44804e.f44826e);
            }
            if (!cVar.f44805f && (i11 = i12 + i13) != childCount) {
                View childAt2 = getChildAt(i11);
                if (this.f44780i) {
                    int d11 = this.f44774c.d(childAt);
                    int d12 = this.f44774c.d(childAt2);
                    if (d11 < d12) {
                        return childAt;
                    }
                } else {
                    int g10 = this.f44774c.g(childAt);
                    int g11 = this.f44774c.g(childAt2);
                    if (g10 > g11) {
                        return childAt;
                    }
                }
                if (z11) {
                    if ((cVar.f44804e.f44826e - ((c) childAt2.getLayoutParams()).f44804e.f44826e < 0) != (c11 < 0)) {
                        return childAt;
                    }
                } else {
                    continue;
                }
            }
            i12 += i13;
        }
        return null;
    }

    final int scrollBy(int i11, RecyclerView.v vVar, RecyclerView.A a11) {
        if (getChildCount() == 0 || i11 == 0) {
            return 0;
        }
        u(i11, a11);
        q qVar = this.f44778g;
        int e11 = e(vVar, qVar, a11);
        if (qVar.f45016b >= e11) {
            i11 = i11 < 0 ? -e11 : e11;
        }
        this.f44774c.s(-i11);
        this.f44786o = this.f44780i;
        qVar.f45016b = 0;
        v(vVar, qVar);
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int scrollHorizontallyBy(int i11, RecyclerView.v vVar, RecyclerView.A a11) {
        return scrollBy(i11, vVar, a11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void scrollToPosition(int i11) {
        e eVar = this.f44788q;
        if (eVar != null && eVar.f44812a != i11) {
            eVar.f44815d = null;
            eVar.f44814c = 0;
            eVar.f44812a = -1;
            eVar.f44813b = -1;
        }
        this.f44782k = i11;
        this.f44783l = LinearLayoutManager.INVALID_OFFSET;
        requestLayout();
    }

    public final void scrollToPositionWithOffset(int i11, int i12) {
        e eVar = this.f44788q;
        if (eVar != null) {
            eVar.f44815d = null;
            eVar.f44814c = 0;
            eVar.f44812a = -1;
            eVar.f44813b = -1;
        }
        this.f44782k = i11;
        this.f44783l = i12;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int scrollVerticallyBy(int i11, RecyclerView.v vVar, RecyclerView.A a11) {
        return scrollBy(i11, vVar, a11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void setMeasuredDimension(Rect rect, int i11, int i12) {
        int chooseSize;
        int chooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f44776e == 1) {
            chooseSize2 = RecyclerView.o.chooseSize(i12, rect.height() + paddingBottom, getMinimumHeight());
            chooseSize = RecyclerView.o.chooseSize(i11, (this.f44777f * this.f44772a) + paddingRight, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.o.chooseSize(i11, rect.width() + paddingRight, getMinimumWidth());
            chooseSize2 = RecyclerView.o.chooseSize(i12, (this.f44777f * this.f44772a) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.A a11, int i11) {
        r rVar = new r(recyclerView.getContext());
        rVar.setTargetPosition(i11);
        startSmoothScroll(rVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean supportsPredictiveItemAnimations() {
        return this.f44788q == null;
    }

    final void u(int i11, RecyclerView.A a11) {
        int k11;
        int i12;
        if (i11 > 0) {
            k11 = l();
            i12 = 1;
        } else {
            k11 = k();
            i12 = -1;
        }
        q qVar = this.f44778g;
        qVar.f45015a = true;
        B(k11, a11);
        y(i12);
        qVar.f45017c = k11 + qVar.f45018d;
        qVar.f45016b = Math.abs(i11);
    }

    public final void z(int i11) {
        assertNotInLayoutOrScroll(null);
        if (i11 != this.f44772a) {
            d dVar = this.f44784m;
            int[] iArr = dVar.f44806a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            dVar.f44807b = null;
            requestLayout();
            this.f44772a = i11;
            this.f44781j = new BitSet(this.f44772a);
            this.f44773b = new f[this.f44772a];
            for (int i12 = 0; i12 < this.f44772a; i12++) {
                this.f44773b[i12] = new f(i12);
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    public StaggeredGridLayoutManager(int i11, int i12) {
        this.f44772a = -1;
        this.f44779h = false;
        this.f44780i = false;
        this.f44782k = -1;
        this.f44783l = LinearLayoutManager.INVALID_OFFSET;
        this.f44784m = new d();
        this.f44785n = 2;
        this.f44790s = new Rect();
        this.f44791t = new b();
        this.f44792u = false;
        this.f44793v = true;
        this.f44795x = new a();
        this.f44776e = i12;
        z(i11);
        this.f44778g = new q();
        this.f44774c = w.b(this, this.f44776e);
        this.f44775d = w.b(this, 1 - this.f44776e);
    }
}
