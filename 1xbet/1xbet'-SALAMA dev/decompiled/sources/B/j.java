package B;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SparseIntArray f872n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f881i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f883l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f942n);
        this.f873a = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            switch (f872n.get(index)) {
                case 1:
                    this.f880h = typedArrayObtainStyledAttributes.getFloat(index, this.f880h);
                    break;
                case 2:
                    this.f877e = typedArrayObtainStyledAttributes.getInt(index, this.f877e);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f876d = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f876d = p143u.e.f16507d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f878f = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f874b = m.l(typedArrayObtainStyledAttributes, index, this.f874b);
                    break;
                case 6:
                    this.f875c = typedArrayObtainStyledAttributes.getInteger(index, this.f875c);
                    break;
                case 7:
                    this.f879g = typedArrayObtainStyledAttributes.getFloat(index, this.f879g);
                    break;
                case 8:
                    this.j = typedArrayObtainStyledAttributes.getInteger(index, this.j);
                    break;
                case 9:
                    this.f881i = typedArrayObtainStyledAttributes.getFloat(index, this.f881i);
                    break;
                case 10:
                    int i8 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i8 == 1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f884m = resourceId;
                        if (resourceId != -1) {
                            this.f883l = -2;
                        }
                    } else if (i8 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f882k = string;
                        if (string.indexOf("/") > 0) {
                            this.f884m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f883l = -2;
                        } else {
                            this.f883l = -1;
                        }
                    } else {
                        this.f883l = typedArrayObtainStyledAttributes.getInteger(index, this.f884m);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
