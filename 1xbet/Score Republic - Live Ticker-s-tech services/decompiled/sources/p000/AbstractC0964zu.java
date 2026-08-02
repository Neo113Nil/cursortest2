package p000;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: zu */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0964zu {

    /* JADX INFO: renamed from: a */
    public static final Method f9959a;

    /* JADX INFO: renamed from: b */
    public static final Method f9960b;

    /* JADX INFO: renamed from: c */
    public static final Method f9961c;

    /* JADX INFO: renamed from: d */
    public static final boolean f9962d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f9959a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f9960b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f9961c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f9962d = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
