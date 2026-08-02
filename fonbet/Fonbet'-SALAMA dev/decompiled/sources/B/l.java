package B;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: o, reason: collision with root package name */
    public static final SparseIntArray f890o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f891a;

    /* renamed from: b, reason: collision with root package name */
    public float f892b;

    /* renamed from: c, reason: collision with root package name */
    public float f893c;

    /* renamed from: d, reason: collision with root package name */
    public float f894d;

    /* renamed from: e, reason: collision with root package name */
    public float f895e;

    /* renamed from: f, reason: collision with root package name */
    public float f896f;

    /* renamed from: g, reason: collision with root package name */
    public float f897g;

    /* renamed from: h, reason: collision with root package name */
    public float f898h;

    /* renamed from: i, reason: collision with root package name */
    public int f899i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f900k;

    /* renamed from: l, reason: collision with root package name */
    public float f901l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f902m;

    /* renamed from: n, reason: collision with root package name */
    public float f903n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f890o = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(l lVar) {
        this.f891a = lVar.f891a;
        this.f892b = lVar.f892b;
        this.f893c = lVar.f893c;
        this.f894d = lVar.f894d;
        this.f895e = lVar.f895e;
        this.f896f = lVar.f896f;
        this.f897g = lVar.f897g;
        this.f898h = lVar.f898h;
        this.f899i = lVar.f899i;
        this.j = lVar.j;
        this.f900k = lVar.f900k;
        this.f901l = lVar.f901l;
        this.f902m = lVar.f902m;
        this.f903n = lVar.f903n;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f954z);
        this.f891a = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            switch (f890o.get(index)) {
                case 1:
                    this.f892b = obtainStyledAttributes.getFloat(index, this.f892b);
                    break;
                case 2:
                    this.f893c = obtainStyledAttributes.getFloat(index, this.f893c);
                    break;
                case 3:
                    this.f894d = obtainStyledAttributes.getFloat(index, this.f894d);
                    break;
                case 4:
                    this.f895e = obtainStyledAttributes.getFloat(index, this.f895e);
                    break;
                case 5:
                    this.f896f = obtainStyledAttributes.getFloat(index, this.f896f);
                    break;
                case 6:
                    this.f897g = obtainStyledAttributes.getDimension(index, this.f897g);
                    break;
                case 7:
                    this.f898h = obtainStyledAttributes.getDimension(index, this.f898h);
                    break;
                case 8:
                    this.j = obtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 9:
                    this.f900k = obtainStyledAttributes.getDimension(index, this.f900k);
                    break;
                case 10:
                    this.f901l = obtainStyledAttributes.getDimension(index, this.f901l);
                    break;
                case 11:
                    this.f902m = true;
                    this.f903n = obtainStyledAttributes.getDimension(index, this.f903n);
                    break;
                case 12:
                    this.f899i = m.l(obtainStyledAttributes, index, this.f899i);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
