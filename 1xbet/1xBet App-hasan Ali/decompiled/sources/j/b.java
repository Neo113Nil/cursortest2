package j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;
import r.AbstractC2339q;
import r.C2338p;
import r.S;
import s.AbstractC2351a;

/* loaded from: classes.dex */
public final class b extends Drawable.ConstantState {

    /* renamed from: A, reason: collision with root package name */
    public boolean f17347A;

    /* renamed from: B, reason: collision with root package name */
    public ColorFilter f17348B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f17349C;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f17350D;

    /* renamed from: E, reason: collision with root package name */
    public PorterDuff.Mode f17351E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f17352F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f17353G;

    /* renamed from: H, reason: collision with root package name */
    public int[][] f17354H;

    /* renamed from: I, reason: collision with root package name */
    public C2338p f17355I;
    public S J;

    /* renamed from: a, reason: collision with root package name */
    public final e f17356a;

    /* renamed from: b, reason: collision with root package name */
    public Resources f17357b;

    /* renamed from: c, reason: collision with root package name */
    public int f17358c;

    /* renamed from: d, reason: collision with root package name */
    public int f17359d;

    /* renamed from: e, reason: collision with root package name */
    public int f17360e;
    public SparseArray f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable[] f17361g;

    /* renamed from: h, reason: collision with root package name */
    public int f17362h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17363j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f17364k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f17365l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17366m;

    /* renamed from: n, reason: collision with root package name */
    public int f17367n;

    /* renamed from: o, reason: collision with root package name */
    public int f17368o;

    /* renamed from: p, reason: collision with root package name */
    public int f17369p;

    /* renamed from: q, reason: collision with root package name */
    public int f17370q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f17371r;

    /* renamed from: s, reason: collision with root package name */
    public int f17372s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f17373t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f17374u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f17375v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f17376w;

    /* renamed from: x, reason: collision with root package name */
    public int f17377x;

    /* renamed from: y, reason: collision with root package name */
    public int f17378y;

    /* renamed from: z, reason: collision with root package name */
    public int f17379z;

    public b(b bVar, e eVar, Resources resources) {
        this.i = false;
        this.f17365l = false;
        this.f17376w = true;
        this.f17378y = 0;
        this.f17379z = 0;
        this.f17356a = eVar;
        this.f17357b = resources != null ? resources : bVar != null ? bVar.f17357b : null;
        int i = bVar != null ? bVar.f17358c : 0;
        int i5 = e.f17385D;
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? 160 : i;
        this.f17358c = i;
        if (bVar != null) {
            this.f17359d = bVar.f17359d;
            this.f17360e = bVar.f17360e;
            this.f17374u = true;
            this.f17375v = true;
            this.i = bVar.i;
            this.f17365l = bVar.f17365l;
            this.f17376w = bVar.f17376w;
            this.f17377x = bVar.f17377x;
            this.f17378y = bVar.f17378y;
            this.f17379z = bVar.f17379z;
            this.f17347A = bVar.f17347A;
            this.f17348B = bVar.f17348B;
            this.f17349C = bVar.f17349C;
            this.f17350D = bVar.f17350D;
            this.f17351E = bVar.f17351E;
            this.f17352F = bVar.f17352F;
            this.f17353G = bVar.f17353G;
            if (bVar.f17358c == i) {
                if (bVar.f17363j) {
                    this.f17364k = bVar.f17364k != null ? new Rect(bVar.f17364k) : null;
                    this.f17363j = true;
                }
                if (bVar.f17366m) {
                    this.f17367n = bVar.f17367n;
                    this.f17368o = bVar.f17368o;
                    this.f17369p = bVar.f17369p;
                    this.f17370q = bVar.f17370q;
                    this.f17366m = true;
                }
            }
            if (bVar.f17371r) {
                this.f17372s = bVar.f17372s;
                this.f17371r = true;
            }
            if (bVar.f17373t) {
                this.f17373t = true;
            }
            Drawable[] drawableArr = bVar.f17361g;
            this.f17361g = new Drawable[drawableArr.length];
            this.f17362h = bVar.f17362h;
            SparseArray sparseArray = bVar.f;
            if (sparseArray != null) {
                this.f = sparseArray.clone();
            } else {
                this.f = new SparseArray(this.f17362h);
            }
            int i6 = this.f17362h;
            for (int i7 = 0; i7 < i6; i7++) {
                Drawable drawable = drawableArr[i7];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f.put(i7, constantState);
                    } else {
                        this.f17361g[i7] = drawableArr[i7];
                    }
                }
            }
        } else {
            this.f17361g = new Drawable[10];
            this.f17362h = 0;
        }
        if (bVar != null) {
            this.f17354H = bVar.f17354H;
        } else {
            this.f17354H = new int[this.f17361g.length][];
        }
        if (bVar != null) {
            this.f17355I = bVar.f17355I;
            this.J = bVar.J;
        } else {
            this.f17355I = new C2338p((Object) null);
            this.J = new S(0);
        }
    }

    public final int a(Drawable drawable) {
        int i = this.f17362h;
        if (i >= this.f17361g.length) {
            int i5 = i + 10;
            Drawable[] drawableArr = new Drawable[i5];
            Drawable[] drawableArr2 = this.f17361g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f17361g = drawableArr;
            int[][] iArr = new int[i5][];
            System.arraycopy(this.f17354H, 0, iArr, 0, i);
            this.f17354H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f17356a);
        this.f17361g[i] = drawable;
        this.f17362h++;
        this.f17360e = drawable.getChangingConfigurations() | this.f17360e;
        this.f17371r = false;
        this.f17373t = false;
        this.f17364k = null;
        this.f17363j = false;
        this.f17366m = false;
        this.f17374u = false;
        return i;
    }

    public final void b() {
        this.f17366m = true;
        c();
        int i = this.f17362h;
        Drawable[] drawableArr = this.f17361g;
        this.f17368o = -1;
        this.f17367n = -1;
        this.f17370q = 0;
        this.f17369p = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Drawable drawable = drawableArr[i5];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f17367n) {
                this.f17367n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f17368o) {
                this.f17368o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f17369p) {
                this.f17369p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f17370q) {
                this.f17370q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.f.keyAt(i);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.valueAt(i);
                Drawable[] drawableArr = this.f17361g;
                Drawable newDrawable = constantState.newDrawable(this.f17357b);
                newDrawable.setLayoutDirection(this.f17377x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f17356a);
                drawableArr[keyAt] = mutate;
            }
            this.f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.f17362h;
        Drawable[] drawableArr = this.f17361g;
        for (int i5 = 0; i5 < i; i5++) {
            Drawable drawable = drawableArr[i5];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.get(i5);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i) {
        int indexOfKey;
        Drawable drawable = this.f17361g[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f.valueAt(indexOfKey)).newDrawable(this.f17357b);
        newDrawable.setLayoutDirection(this.f17377x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f17356a);
        this.f17361g[i] = mutate;
        this.f.removeAt(indexOfKey);
        if (this.f.size() == 0) {
            this.f = null;
        }
        return mutate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public final int e(int i) {
        ?? r5;
        if (i < 0) {
            return 0;
        }
        S s2 = this.J;
        int i5 = 0;
        int a5 = AbstractC2351a.a(s2.f18965n, i, s2.f18963l);
        if (a5 >= 0 && (r5 = s2.f18964m[a5]) != AbstractC2339q.f19035c) {
            i5 = r5;
        }
        return i5.intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.f17354H;
        int i = this.f17362h;
        for (int i5 = 0; i5 < i; i5++) {
            if (StateSet.stateSetMatches(iArr2[i5], iArr)) {
                return i5;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f17359d | this.f17360e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
