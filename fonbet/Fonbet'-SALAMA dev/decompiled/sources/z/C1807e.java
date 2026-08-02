package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import w1.L;

/* renamed from: z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1807e extends AbstractC1805c {

    /* renamed from: e, reason: collision with root package name */
    public int f18264e = -1;

    /* renamed from: f, reason: collision with root package name */
    public float f18265f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f18266g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public float f18267h = Float.NaN;

    /* renamed from: i, reason: collision with root package name */
    public float f18268i = Float.NaN;
    public float j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    public float f18269k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    public float f18270l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    public float f18271m = Float.NaN;

    /* renamed from: n, reason: collision with root package name */
    public float f18272n = Float.NaN;

    /* renamed from: o, reason: collision with root package name */
    public float f18273o = Float.NaN;

    /* renamed from: p, reason: collision with root package name */
    public float f18274p = Float.NaN;

    /* renamed from: q, reason: collision with root package name */
    public float f18275q = Float.NaN;

    /* renamed from: r, reason: collision with root package name */
    public float f18276r = Float.NaN;

    /* renamed from: s, reason: collision with root package name */
    public float f18277s = Float.NaN;

    public C1807e() {
        this.f18262d = new HashMap();
    }

    @Override // z.AbstractC1805c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC1805c clone() {
        C1807e c1807e = new C1807e();
        c1807e.f18259a = this.f18259a;
        c1807e.f18260b = this.f18260b;
        c1807e.f18261c = this.f18261c;
        c1807e.f18262d = this.f18262d;
        c1807e.f18264e = this.f18264e;
        c1807e.f18265f = this.f18265f;
        c1807e.f18266g = this.f18266g;
        c1807e.f18267h = this.f18267h;
        c1807e.f18268i = this.f18268i;
        c1807e.j = this.j;
        c1807e.f18269k = this.f18269k;
        c1807e.f18270l = this.f18270l;
        c1807e.f18271m = this.f18271m;
        c1807e.f18272n = this.f18272n;
        c1807e.f18273o = this.f18273o;
        c1807e.f18274p = this.f18274p;
        c1807e.f18275q = this.f18275q;
        c1807e.f18276r = this.f18276r;
        c1807e.f18277s = this.f18277s;
        return c1807e;
    }

    @Override // z.AbstractC1805c
    public final void b(HashSet hashSet) {
        if (!Float.isNaN(this.f18265f)) {
            hashSet.add(ViewHierarchyNode.JsonKeys.ALPHA);
        }
        if (!Float.isNaN(this.f18266g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f18267h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f18268i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f18269k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f18270l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f18274p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f18275q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f18276r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f18271m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f18272n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f18273o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f18277s)) {
            hashSet.add("progress");
        }
        if (this.f18262d.size() > 0) {
            Iterator it = this.f18262d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // z.AbstractC1805c
    public final void c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B.q.j);
        SparseIntArray sparseIntArray = AbstractC1806d.f18263a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            SparseIntArray sparseIntArray2 = AbstractC1806d.f18263a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f18265f = obtainStyledAttributes.getFloat(index, this.f18265f);
                    break;
                case 2:
                    this.f18266g = obtainStyledAttributes.getDimension(index, this.f18266g);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f18267h = obtainStyledAttributes.getFloat(index, this.f18267h);
                    break;
                case 5:
                    this.f18268i = obtainStyledAttributes.getFloat(index, this.f18268i);
                    break;
                case 6:
                    this.j = obtainStyledAttributes.getFloat(index, this.j);
                    break;
                case 7:
                    this.f18272n = obtainStyledAttributes.getFloat(index, this.f18272n);
                    break;
                case 8:
                    this.f18271m = obtainStyledAttributes.getFloat(index, this.f18271m);
                    break;
                case 9:
                    obtainStyledAttributes.getString(index);
                    break;
                case 10:
                    if (MotionLayout.f8824Y0) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f18260b);
                        this.f18260b = resourceId;
                        if (resourceId == -1) {
                            this.f18261c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f18261c = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f18260b = obtainStyledAttributes.getResourceId(index, this.f18260b);
                        break;
                    }
                case 12:
                    this.f18259a = obtainStyledAttributes.getInt(index, this.f18259a);
                    break;
                case 13:
                    this.f18264e = obtainStyledAttributes.getInteger(index, this.f18264e);
                    break;
                case 14:
                    this.f18273o = obtainStyledAttributes.getFloat(index, this.f18273o);
                    break;
                case 15:
                    this.f18274p = obtainStyledAttributes.getDimension(index, this.f18274p);
                    break;
                case 16:
                    this.f18275q = obtainStyledAttributes.getDimension(index, this.f18275q);
                    break;
                case 17:
                    this.f18276r = obtainStyledAttributes.getDimension(index, this.f18276r);
                    break;
                case 18:
                    this.f18277s = obtainStyledAttributes.getFloat(index, this.f18277s);
                    break;
                case 19:
                    this.f18269k = obtainStyledAttributes.getDimension(index, this.f18269k);
                    break;
                case 20:
                    this.f18270l = obtainStyledAttributes.getDimension(index, this.f18270l);
                    break;
            }
        }
    }

    @Override // z.AbstractC1805c
    public final void d(HashMap hashMap) {
        if (this.f18264e == -1) {
            return;
        }
        if (!Float.isNaN(this.f18265f)) {
            hashMap.put(ViewHierarchyNode.JsonKeys.ALPHA, Integer.valueOf(this.f18264e));
        }
        if (!Float.isNaN(this.f18266g)) {
            hashMap.put("elevation", Integer.valueOf(this.f18264e));
        }
        if (!Float.isNaN(this.f18267h)) {
            hashMap.put("rotation", Integer.valueOf(this.f18264e));
        }
        if (!Float.isNaN(this.f18268i)) {
            hashMap.put("rotationX", Integer.valueOf(this.f18264e));
        }
        if (!Float.isNaN(this.j)) {
            hashMap.put("rotationY", Integer.valueOf(this.f18264e));
        }
        if (!Float.isNaN(this.f18269k)) {
            hashMap.put("transformPivotX", Integer.valueOf(this.f18264e));
        }
        if (!Float.isNaN(this.f18270l)) {
            hashMap.put("transformPivotY", Integer.valueOf(this.f18264e));
        }
        if (!Float.isNaN(this.f18274p)) {
            hashMap.put("translationX", Integer.valueOf(this.f18264e));
        }
        if (!Float.isNaN(this.f18275q)) {
            hashMap.put("translationY", Integer.valueOf(this.f18264e));
        }
        if (!Float.isNaN(this.f18276r)) {
            hashMap.put("translationZ", Integer.valueOf(this.f18264e));
        }
        if (!Float.isNaN(this.f18271m)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f18264e));
        }
        if (!Float.isNaN(this.f18272n)) {
            hashMap.put("scaleX", Integer.valueOf(this.f18264e));
        }
        if (!Float.isNaN(this.f18273o)) {
            hashMap.put("scaleY", Integer.valueOf(this.f18264e));
        }
        if (!Float.isNaN(this.f18277s)) {
            hashMap.put("progress", Integer.valueOf(this.f18264e));
        }
        if (this.f18262d.size() > 0) {
            Iterator it = this.f18262d.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put(L.i("CUSTOM,", (String) it.next()), Integer.valueOf(this.f18264e));
            }
        }
    }

    public final void f(Object obj, String str) {
        switch (str) {
            case "motionProgress":
                this.f18277s = AbstractC1805c.e((Number) obj);
                break;
            case "transitionEasing":
                obj.toString();
                break;
            case "rotationX":
                this.f18268i = AbstractC1805c.e((Number) obj);
                break;
            case "rotationY":
                this.j = AbstractC1805c.e((Number) obj);
                break;
            case "translationX":
                this.f18274p = AbstractC1805c.e((Number) obj);
                break;
            case "translationY":
                this.f18275q = AbstractC1805c.e((Number) obj);
                break;
            case "translationZ":
                this.f18276r = AbstractC1805c.e((Number) obj);
                break;
            case "scaleX":
                this.f18272n = AbstractC1805c.e((Number) obj);
                break;
            case "scaleY":
                this.f18273o = AbstractC1805c.e((Number) obj);
                break;
            case "transformPivotX":
                this.f18269k = AbstractC1805c.e((Number) obj);
                break;
            case "transformPivotY":
                this.f18270l = AbstractC1805c.e((Number) obj);
                break;
            case "rotation":
                this.f18267h = AbstractC1805c.e((Number) obj);
                break;
            case "elevation":
                this.f18266g = AbstractC1805c.e((Number) obj);
                break;
            case "transitionPathRotate":
                this.f18271m = AbstractC1805c.e((Number) obj);
                break;
            case "alpha":
                this.f18265f = AbstractC1805c.e((Number) obj);
                break;
            case "curveFit":
                Number number = (Number) obj;
                this.f18264e = number instanceof Integer ? ((Integer) number).intValue() : Integer.parseInt(number.toString());
                break;
            case "visibility":
                if (!(obj instanceof Boolean)) {
                    Boolean.parseBoolean(obj.toString());
                    break;
                }
                break;
        }
    }
}
