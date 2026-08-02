package n;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: n.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2121O {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f18175a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f18176b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f18177c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f18178d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f18175a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f18176b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f18177c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f18178d = true;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        }
    }
}
