package p000;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: o7 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0534o7 {

    /* JADX INFO: renamed from: b */
    public static final Class[] f5639b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c */
    public static final int[] f5640c = {R.attr.onClick};

    /* JADX INFO: renamed from: d */
    public static final String[] f5641d = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: e */
    public static final w71 f5642e = new w71(0);

    /* JADX INFO: renamed from: a */
    public final Object[] f5643a = new Object[2];

    /* JADX INFO: renamed from: a */
    public final View m3633a(Context context, String str, String str2) {
        String strConcat;
        w71 w71Var = f5642e;
        Constructor constructor = (Constructor) w71Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f5639b);
            w71Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f5643a);
    }
}
