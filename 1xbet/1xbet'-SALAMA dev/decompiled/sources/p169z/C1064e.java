package p169z;

import B.q;
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
import p155w1.L;

/* JADX INFO: renamed from: z.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1064e extends AbstractC1062c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18270e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f18271f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f18272g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18273h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f18274i = Float.NaN;
    public float j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f18275k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f18276l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f18277m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f18278n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f18279o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f18280p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f18281q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f18282r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f18283s = Float.NaN;

    public C1064e() {
        this.f18268d = new HashMap();
    }

    @Override // p169z.AbstractC1062c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC1062c clone() {
        C1064e c1064e = new C1064e();
        c1064e.f18265a = this.f18265a;
        c1064e.f18266b = this.f18266b;
        c1064e.f18267c = this.f18267c;
        c1064e.f18268d = this.f18268d;
        c1064e.f18270e = this.f18270e;
        c1064e.f18271f = this.f18271f;
        c1064e.f18272g = this.f18272g;
        c1064e.f18273h = this.f18273h;
        c1064e.f18274i = this.f18274i;
        c1064e.j = this.j;
        c1064e.f18275k = this.f18275k;
        c1064e.f18276l = this.f18276l;
        c1064e.f18277m = this.f18277m;
        c1064e.f18278n = this.f18278n;
        c1064e.f18279o = this.f18279o;
        c1064e.f18280p = this.f18280p;
        c1064e.f18281q = this.f18281q;
        c1064e.f18282r = this.f18282r;
        c1064e.f18283s = this.f18283s;
        return c1064e;
    }

    @Override // p169z.AbstractC1062c
    public final void b(HashSet hashSet) {
        if (!Float.isNaN(this.f18271f)) {
            hashSet.add(ViewHierarchyNode.JsonKeys.ALPHA);
        }
        if (!Float.isNaN(this.f18272g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f18273h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f18274i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f18275k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f18276l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f18280p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f18281q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f18282r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f18277m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f18278n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f18279o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f18283s)) {
            hashSet.add("progress");
        }
        if (this.f18268d.size() > 0) {
            Iterator it = this.f18268d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // p169z.AbstractC1062c
    public final void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.j);
        SparseIntArray sparseIntArray = AbstractC1063d.f18269a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            SparseIntArray sparseIntArray2 = AbstractC1063d.f18269a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f18271f = typedArrayObtainStyledAttributes.getFloat(index, this.f18271f);
                    break;
                case 2:
                    this.f18272g = typedArrayObtainStyledAttributes.getDimension(index, this.f18272g);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f18273h = typedArrayObtainStyledAttributes.getFloat(index, this.f18273h);
                    break;
                case 5:
                    this.f18274i = typedArrayObtainStyledAttributes.getFloat(index, this.f18274i);
                    break;
                case 6:
                    this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                    break;
                case 7:
                    this.f18278n = typedArrayObtainStyledAttributes.getFloat(index, this.f18278n);
                    break;
                case 8:
                    this.f18277m = typedArrayObtainStyledAttributes.getFloat(index, this.f18277m);
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 10:
                    if (MotionLayout.f8824Y0) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f18266b);
                        this.f18266b = resourceId;
                        if (resourceId == -1) {
                            this.f18267c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f18267c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f18266b = typedArrayObtainStyledAttributes.getResourceId(index, this.f18266b);
                    }
                    break;
                case 12:
                    this.f18265a = typedArrayObtainStyledAttributes.getInt(index, this.f18265a);
                    break;
                case 13:
                    this.f18270e = typedArrayObtainStyledAttributes.getInteger(index, this.f18270e);
                    break;
                case 14:
                    this.f18279o = typedArrayObtainStyledAttributes.getFloat(index, this.f18279o);
                    break;
                case 15:
                    this.f18280p = typedArrayObtainStyledAttributes.getDimension(index, this.f18280p);
                    break;
                case 16:
                    this.f18281q = typedArrayObtainStyledAttributes.getDimension(index, this.f18281q);
                    break;
                case 17:
                    this.f18282r = typedArrayObtainStyledAttributes.getDimension(index, this.f18282r);
                    break;
                case 18:
                    this.f18283s = typedArrayObtainStyledAttributes.getFloat(index, this.f18283s);
                    break;
                case 19:
                    this.f18275k = typedArrayObtainStyledAttributes.getDimension(index, this.f18275k);
                    break;
                case 20:
                    this.f18276l = typedArrayObtainStyledAttributes.getDimension(index, this.f18276l);
                    break;
            }
        }
    }

    @Override // p169z.AbstractC1062c
    public final void d(HashMap map) {
        if (this.f18270e == -1) {
            return;
        }
        if (!Float.isNaN(this.f18271f)) {
            map.put(ViewHierarchyNode.JsonKeys.ALPHA, Integer.valueOf(this.f18270e));
        }
        if (!Float.isNaN(this.f18272g)) {
            map.put("elevation", Integer.valueOf(this.f18270e));
        }
        if (!Float.isNaN(this.f18273h)) {
            map.put("rotation", Integer.valueOf(this.f18270e));
        }
        if (!Float.isNaN(this.f18274i)) {
            map.put("rotationX", Integer.valueOf(this.f18270e));
        }
        if (!Float.isNaN(this.j)) {
            map.put("rotationY", Integer.valueOf(this.f18270e));
        }
        if (!Float.isNaN(this.f18275k)) {
            map.put("transformPivotX", Integer.valueOf(this.f18270e));
        }
        if (!Float.isNaN(this.f18276l)) {
            map.put("transformPivotY", Integer.valueOf(this.f18270e));
        }
        if (!Float.isNaN(this.f18280p)) {
            map.put("translationX", Integer.valueOf(this.f18270e));
        }
        if (!Float.isNaN(this.f18281q)) {
            map.put("translationY", Integer.valueOf(this.f18270e));
        }
        if (!Float.isNaN(this.f18282r)) {
            map.put("translationZ", Integer.valueOf(this.f18270e));
        }
        if (!Float.isNaN(this.f18277m)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f18270e));
        }
        if (!Float.isNaN(this.f18278n)) {
            map.put("scaleX", Integer.valueOf(this.f18270e));
        }
        if (!Float.isNaN(this.f18279o)) {
            map.put("scaleY", Integer.valueOf(this.f18270e));
        }
        if (!Float.isNaN(this.f18283s)) {
            map.put("progress", Integer.valueOf(this.f18270e));
        }
        if (this.f18268d.size() > 0) {
            Iterator it = this.f18268d.keySet().iterator();
            while (it.hasNext()) {
                map.put(L.i("CUSTOM,", (String) it.next()), Integer.valueOf(this.f18270e));
            }
        }
    }

    public final void f(Object obj, String str) {
        switch (str) {
            case "motionProgress":
                this.f18283s = AbstractC1062c.e((Number) obj);
                break;
            case "transitionEasing":
                obj.toString();
                break;
            case "rotationX":
                this.f18274i = AbstractC1062c.e((Number) obj);
                break;
            case "rotationY":
                this.j = AbstractC1062c.e((Number) obj);
                break;
            case "translationX":
                this.f18280p = AbstractC1062c.e((Number) obj);
                break;
            case "translationY":
                this.f18281q = AbstractC1062c.e((Number) obj);
                break;
            case "translationZ":
                this.f18282r = AbstractC1062c.e((Number) obj);
                break;
            case "scaleX":
                this.f18278n = AbstractC1062c.e((Number) obj);
                break;
            case "scaleY":
                this.f18279o = AbstractC1062c.e((Number) obj);
                break;
            case "transformPivotX":
                this.f18275k = AbstractC1062c.e((Number) obj);
                break;
            case "transformPivotY":
                this.f18276l = AbstractC1062c.e((Number) obj);
                break;
            case "rotation":
                this.f18273h = AbstractC1062c.e((Number) obj);
                break;
            case "elevation":
                this.f18272g = AbstractC1062c.e((Number) obj);
                break;
            case "transitionPathRotate":
                this.f18277m = AbstractC1062c.e((Number) obj);
                break;
            case "alpha":
                this.f18271f = AbstractC1062c.e((Number) obj);
                break;
            case "curveFit":
                Number number = (Number) obj;
                this.f18270e = number instanceof Integer ? ((Integer) number).intValue() : Integer.parseInt(number.toString());
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
