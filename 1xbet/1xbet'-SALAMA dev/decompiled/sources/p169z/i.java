package p169z;

import B.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashSet;
import p143u.e;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC1062c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18287e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f18288f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18289g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18290h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f18291i = Float.NaN;
    public float j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f18292k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f18293l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f18294m = 0;

    @Override // p169z.AbstractC1062c
    /* JADX INFO: renamed from: a */
    public final AbstractC1062c clone() {
        i iVar = new i();
        iVar.f18265a = this.f18265a;
        iVar.f18266b = this.f18266b;
        iVar.f18267c = this.f18267c;
        iVar.f18268d = this.f18268d;
        iVar.f18288f = this.f18288f;
        iVar.f18289g = this.f18289g;
        iVar.f18290h = this.f18290h;
        iVar.f18291i = this.f18291i;
        iVar.j = Float.NaN;
        iVar.f18292k = this.f18292k;
        iVar.f18293l = this.f18293l;
        return iVar;
    }

    @Override // p169z.AbstractC1062c
    public final void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f939k);
        SparseIntArray sparseIntArray = h.f18286a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            SparseIntArray sparseIntArray2 = h.f18286a;
            switch (sparseIntArray2.get(index)) {
                case 1:
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
                case 2:
                    this.f18265a = typedArrayObtainStyledAttributes.getInt(index, this.f18265a);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f18288f = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f18288f = e.f16507d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f18287e = typedArrayObtainStyledAttributes.getInteger(index, this.f18287e);
                    break;
                case 5:
                    this.f18290h = typedArrayObtainStyledAttributes.getInt(index, this.f18290h);
                    break;
                case 6:
                    this.f18292k = typedArrayObtainStyledAttributes.getFloat(index, this.f18292k);
                    break;
                case 7:
                    this.f18293l = typedArrayObtainStyledAttributes.getFloat(index, this.f18293l);
                    break;
                case 8:
                    float f7 = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                    this.f18291i = f7;
                    this.j = f7;
                    break;
                case 9:
                    this.f18294m = typedArrayObtainStyledAttributes.getInt(index, this.f18294m);
                    break;
                case 10:
                    this.f18289g = typedArrayObtainStyledAttributes.getInt(index, this.f18289g);
                    break;
                case 11:
                    this.f18291i = typedArrayObtainStyledAttributes.getFloat(index, this.f18291i);
                    break;
                case 12:
                    this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                    break;
                default:
                    Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
        if (this.f18265a == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }

    public final void f(Object obj, String str) {
        switch (str) {
            case "transitionEasing":
                this.f18288f = obj.toString();
                break;
            case "percentWidth":
                this.f18291i = AbstractC1062c.e((Number) obj);
                break;
            case "percentHeight":
                this.j = AbstractC1062c.e((Number) obj);
                break;
            case "drawPath":
                Number number = (Number) obj;
                this.f18290h = number instanceof Integer ? ((Integer) number).intValue() : Integer.parseInt(number.toString());
                break;
            case "sizePercent":
                float fE = AbstractC1062c.e((Number) obj);
                this.f18291i = fE;
                this.j = fE;
                break;
            case "percentX":
                this.f18292k = AbstractC1062c.e((Number) obj);
                break;
            case "percentY":
                this.f18293l = AbstractC1062c.e((Number) obj);
                break;
        }
    }

    @Override // p169z.AbstractC1062c
    public final void b(HashSet hashSet) {
    }
}
