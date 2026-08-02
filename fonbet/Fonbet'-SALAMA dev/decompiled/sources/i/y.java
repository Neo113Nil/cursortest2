package i;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f13802b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f13803c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f13804d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f13805e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f13806f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f13807g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    public static final r.l f13808h = new r.l();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f13809a = new Object[2];

    public final View a(Context context, String str, String str2) {
        String concat;
        r.l lVar = f13808h;
        Constructor constructor = (Constructor) lVar.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f13802b);
            lVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f13809a);
    }
}
