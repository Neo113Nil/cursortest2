package B;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import u.C1616e;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f872n;

    /* renamed from: a, reason: collision with root package name */
    public boolean f873a;

    /* renamed from: b, reason: collision with root package name */
    public int f874b;

    /* renamed from: c, reason: collision with root package name */
    public int f875c;

    /* renamed from: d, reason: collision with root package name */
    public String f876d;

    /* renamed from: e, reason: collision with root package name */
    public int f877e;

    /* renamed from: f, reason: collision with root package name */
    public int f878f;

    /* renamed from: g, reason: collision with root package name */
    public float f879g;

    /* renamed from: h, reason: collision with root package name */
    public float f880h;

    /* renamed from: i, reason: collision with root package name */
    public float f881i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public String f882k;

    /* renamed from: l, reason: collision with root package name */
    public int f883l;

    /* renamed from: m, reason: collision with root package name */
    public int f884m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f872n = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(j jVar) {
        this.f873a = jVar.f873a;
        this.f874b = jVar.f874b;
        this.f876d = jVar.f876d;
        this.f877e = jVar.f877e;
        this.f878f = jVar.f878f;
        this.f880h = jVar.f880h;
        this.f879g = jVar.f879g;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f942n);
        this.f873a = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            switch (f872n.get(index)) {
                case 1:
                    this.f880h = obtainStyledAttributes.getFloat(index, this.f880h);
                    break;
                case 2:
                    this.f877e = obtainStyledAttributes.getInt(index, this.f877e);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f876d = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f876d = C1616e.f16501d[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    this.f878f = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f874b = m.l(obtainStyledAttributes, index, this.f874b);
                    break;
                case 6:
                    this.f875c = obtainStyledAttributes.getInteger(index, this.f875c);
                    break;
                case 7:
                    this.f879g = obtainStyledAttributes.getFloat(index, this.f879g);
                    break;
                case 8:
                    this.j = obtainStyledAttributes.getInteger(index, this.j);
                    break;
                case 9:
                    this.f881i = obtainStyledAttributes.getFloat(index, this.f881i);
                    break;
                case 10:
                    int i8 = obtainStyledAttributes.peekValue(index).type;
                    if (i8 == 1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        this.f884m = resourceId;
                        if (resourceId != -1) {
                            this.f883l = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i8 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f882k = string;
                        if (string.indexOf("/") > 0) {
                            this.f884m = obtainStyledAttributes.getResourceId(index, -1);
                            this.f883l = -2;
                            break;
                        } else {
                            this.f883l = -1;
                            break;
                        }
                    } else {
                        this.f883l = obtainStyledAttributes.getInteger(index, this.f884m);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
