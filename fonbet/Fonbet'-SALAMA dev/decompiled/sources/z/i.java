package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashSet;
import u.C1616e;

/* loaded from: classes.dex */
public final class i extends AbstractC1805c {

    /* renamed from: e, reason: collision with root package name */
    public int f18281e = -1;

    /* renamed from: f, reason: collision with root package name */
    public String f18282f = null;

    /* renamed from: g, reason: collision with root package name */
    public int f18283g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f18284h = 0;

    /* renamed from: i, reason: collision with root package name */
    public float f18285i = Float.NaN;
    public float j = Float.NaN;

    /* renamed from: k, reason: collision with root package name */
    public float f18286k = Float.NaN;

    /* renamed from: l, reason: collision with root package name */
    public float f18287l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    public int f18288m = 0;

    @Override // z.AbstractC1805c
    /* renamed from: a */
    public final AbstractC1805c clone() {
        i iVar = new i();
        iVar.f18259a = this.f18259a;
        iVar.f18260b = this.f18260b;
        iVar.f18261c = this.f18261c;
        iVar.f18262d = this.f18262d;
        iVar.f18282f = this.f18282f;
        iVar.f18283g = this.f18283g;
        iVar.f18284h = this.f18284h;
        iVar.f18285i = this.f18285i;
        iVar.j = Float.NaN;
        iVar.f18286k = this.f18286k;
        iVar.f18287l = this.f18287l;
        return iVar;
    }

    @Override // z.AbstractC1805c
    public final void c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B.q.f939k);
        SparseIntArray sparseIntArray = h.f18280a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            SparseIntArray sparseIntArray2 = h.f18280a;
            switch (sparseIntArray2.get(index)) {
                case 1:
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
                case 2:
                    this.f18259a = obtainStyledAttributes.getInt(index, this.f18259a);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f18282f = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f18282f = C1616e.f16501d[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    this.f18281e = obtainStyledAttributes.getInteger(index, this.f18281e);
                    break;
                case 5:
                    this.f18284h = obtainStyledAttributes.getInt(index, this.f18284h);
                    break;
                case 6:
                    this.f18286k = obtainStyledAttributes.getFloat(index, this.f18286k);
                    break;
                case 7:
                    this.f18287l = obtainStyledAttributes.getFloat(index, this.f18287l);
                    break;
                case 8:
                    float f7 = obtainStyledAttributes.getFloat(index, this.j);
                    this.f18285i = f7;
                    this.j = f7;
                    break;
                case 9:
                    this.f18288m = obtainStyledAttributes.getInt(index, this.f18288m);
                    break;
                case 10:
                    this.f18283g = obtainStyledAttributes.getInt(index, this.f18283g);
                    break;
                case 11:
                    this.f18285i = obtainStyledAttributes.getFloat(index, this.f18285i);
                    break;
                case 12:
                    this.j = obtainStyledAttributes.getFloat(index, this.j);
                    break;
                default:
                    Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
        if (this.f18259a == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }

    public final void f(Object obj, String str) {
        switch (str) {
            case "transitionEasing":
                this.f18282f = obj.toString();
                break;
            case "percentWidth":
                this.f18285i = AbstractC1805c.e((Number) obj);
                break;
            case "percentHeight":
                this.j = AbstractC1805c.e((Number) obj);
                break;
            case "drawPath":
                Number number = (Number) obj;
                this.f18284h = number instanceof Integer ? ((Integer) number).intValue() : Integer.parseInt(number.toString());
                break;
            case "sizePercent":
                float e7 = AbstractC1805c.e((Number) obj);
                this.f18285i = e7;
                this.j = e7;
                break;
            case "percentX":
                this.f18286k = AbstractC1805c.e((Number) obj);
                break;
            case "percentY":
                this.f18287l = AbstractC1805c.e((Number) obj);
                break;
        }
    }

    @Override // z.AbstractC1805c
    public final void b(HashSet hashSet) {
    }
}
