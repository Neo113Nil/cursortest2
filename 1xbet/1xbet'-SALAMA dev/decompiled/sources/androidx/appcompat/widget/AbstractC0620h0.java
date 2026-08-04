package androidx.appcompat.widget;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.appcompat.widget.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0620h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f8627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f8628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f8629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f8630d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f8627a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f8628b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f8629c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f8630d = true;
        } catch (NoSuchMethodException e7) {
            e7.printStackTrace();
        }
    }
}
