package D;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import w1.L;

/* loaded from: classes.dex */
public final class c extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1603a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1604b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1605c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1606d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1607e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1608f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1609g;

    /* renamed from: h, reason: collision with root package name */
    public int f1610h;

    /* renamed from: i, reason: collision with root package name */
    public int f1611i;
    public View j;

    /* renamed from: k, reason: collision with root package name */
    public View f1612k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f1613l;

    public c() {
        super(-2, -2);
        this.f1603a = false;
        this.f1604b = 0;
        this.f1605c = 0;
        this.f1606d = -1;
        this.f1607e = -1;
        this.f1608f = 0;
        this.f1609g = 0;
        this.f1613l = new Rect();
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1603a = false;
        this.f1604b = 0;
        this.f1605c = 0;
        this.f1606d = -1;
        this.f1607e = -1;
        this.f1608f = 0;
        this.f1609g = 0;
        this.f1613l = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C.a.f1210b);
        this.f1604b = obtainStyledAttributes.getInteger(0, 0);
        this.f1607e = obtainStyledAttributes.getResourceId(1, -1);
        this.f1605c = obtainStyledAttributes.getInteger(2, 0);
        this.f1606d = obtainStyledAttributes.getInteger(6, -1);
        this.f1608f = obtainStyledAttributes.getInt(5, 0);
        this.f1609g = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f1603a = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f9027G;
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f9027G;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f9029I;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = context.getClassLoader().loadClass(string).getConstructor(CoordinatorLayout.f9028H);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    if (constructor.newInstance(context, attributeSet) != null) {
                        throw new ClassCastException();
                    }
                } catch (Exception e7) {
                    throw new RuntimeException(L.i("Could not inflate Behavior subclass ", string), e7);
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public c(c cVar) {
        super((ViewGroup.MarginLayoutParams) cVar);
        this.f1603a = false;
        this.f1604b = 0;
        this.f1605c = 0;
        this.f1606d = -1;
        this.f1607e = -1;
        this.f1608f = 0;
        this.f1609g = 0;
        this.f1613l = new Rect();
    }

    public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1603a = false;
        this.f1604b = 0;
        this.f1605c = 0;
        this.f1606d = -1;
        this.f1607e = -1;
        this.f1608f = 0;
        this.f1609g = 0;
        this.f1613l = new Rect();
    }

    public c(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1603a = false;
        this.f1604b = 0;
        this.f1605c = 0;
        this.f1606d = -1;
        this.f1607e = -1;
        this.f1608f = 0;
        this.f1609g = 0;
        this.f1613l = new Rect();
    }
}
