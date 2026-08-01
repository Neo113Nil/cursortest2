package sg.bigo.ads.w;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import sg.bigo.ads.K0.AbstractC4963u;

/* loaded from: classes3.dex */
public final class c extends View {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f13362a;
    public final HashMap b;
    public final ArrayList c;
    public String d;
    public int e;
    public final Paint f;
    public final Paint g;
    public final int h;
    public final int i;

    public c(Activity activity) {
        super(activity, null, 0);
        int i;
        this.f13362a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        this.d = null;
        this.e = 1;
        this.h = AbstractC4963u.a(activity, 2);
        this.i = AbstractC4963u.a(activity, 8);
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint(1);
        this.g = paint2;
        if (this.e == 1) {
            paint.setColor(-1);
            i = 872415231;
        } else {
            paint.setColor(ViewCompat.MEASURED_STATE_MASK);
            i = 855638016;
        }
        paint2.setColor(i);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f13362a.isEmpty()) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i = this.h;
        int i2 = (height - i) / 2;
        int i3 = i + i2;
        int size = this.f13362a.size();
        if (size == 0) {
            return;
        }
        int i4 = (width - ((size - 1) * this.i)) / size;
        Iterator it = this.c.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            Integer num = (Integer) this.f13362a.get(str);
            Integer num2 = (Integer) this.b.get(str);
            if (num != null && num2 != null && num.intValue() > 0) {
                int i6 = (this.i + i4) * i5;
                int i7 = 0;
                while (i7 < num.intValue()) {
                    canvas.drawRect((i7 * (i4 / num.intValue())) + i6, i2, i7 == num.intValue() + (-1) ? i6 + i4 : r11 + r12, i3, i7 < num2.intValue() ? this.f : this.g);
                    i7++;
                }
                i5++;
            }
        }
    }

    public void setTotalNum(Map<String, Integer> map) {
        this.f13362a.clear();
        this.b.clear();
        this.c.clear();
        this.d = null;
        if (map != null) {
            this.f13362a.putAll(map);
            this.c.addAll(map.keySet());
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                this.b.put(it.next(), 0);
            }
        }
    }
}
