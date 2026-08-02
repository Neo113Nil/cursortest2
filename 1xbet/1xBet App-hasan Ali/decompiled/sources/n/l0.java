package n;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18281a;

    public /* synthetic */ l0(int i) {
        this.f18281a = i;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f18281a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute != null) {
                    try {
                        Drawable drawable = (Drawable) l0.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                        k.a.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                        break;
                    } catch (Exception e3) {
                        Log.e("DrawableDelegate", "Exception while inflating <drawable>", e3);
                        return null;
                    }
                }
                break;
            case 1:
                try {
                    break;
                } catch (Exception e5) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e5);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    b2.d dVar = new b2.d(context);
                    dVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    break;
                } catch (Exception e6) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e6);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    b2.p pVar = new b2.p();
                    pVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    break;
                } catch (Exception e7) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e7);
                    return null;
                }
        }
        return null;
    }
}
