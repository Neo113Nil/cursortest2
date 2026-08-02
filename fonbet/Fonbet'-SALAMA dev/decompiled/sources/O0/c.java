package O0;

import P.U;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4835a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Class cls, String str, int i7) {
        super(cls, str);
        this.f4835a = i7;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f4835a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(t.f4897a.D((View) obj));
            case 6:
                WeakHashMap weakHashMap = U.f5037a;
                return ((View) obj).getClipBounds();
            default:
                return Float.valueOf(((SwitchCompat) obj).f8478Q);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f4835a) {
            case 0:
                f fVar = (f) obj;
                PointF pointF = (PointF) obj2;
                fVar.getClass();
                fVar.f4838a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                fVar.f4839b = round;
                int i7 = fVar.f4843f + 1;
                fVar.f4843f = i7;
                if (i7 == fVar.f4844g) {
                    t.a(fVar.f4842e, fVar.f4838a, round, fVar.f4840c, fVar.f4841d);
                    fVar.f4843f = 0;
                    fVar.f4844g = 0;
                    break;
                }
                break;
            case 1:
                f fVar2 = (f) obj;
                PointF pointF2 = (PointF) obj2;
                fVar2.getClass();
                fVar2.f4840c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                fVar2.f4841d = round2;
                int i8 = fVar2.f4844g + 1;
                fVar2.f4844g = i8;
                if (fVar2.f4843f == i8) {
                    t.a(fVar2.f4842e, fVar2.f4838a, fVar2.f4839b, fVar2.f4840c, round2);
                    fVar2.f4843f = 0;
                    fVar2.f4844g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                t.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                t.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                t.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                t.f4897a.S((View) obj, floatValue);
                break;
            case 6:
                WeakHashMap weakHashMap = U.f5037a;
                ((View) obj).setClipBounds((Rect) obj2);
                break;
            default:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
        }
    }
}
