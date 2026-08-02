package L5;

import R5.C0407c;
import android.content.Context;
import android.util.Log;
import android.view.View;
import java.util.HashMap;
import java.util.Locale;
import w1.C1759x1;

/* loaded from: classes2.dex */
public final class W extends io.flutter.plugin.platform.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4449a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4450b;

    public W(C0407c c0407c) {
        A5.x xVar = A5.x.f685a;
        this.f4450b = c0407c;
    }

    @Override // io.flutter.plugin.platform.g
    public final io.flutter.plugin.platform.f create(Context context, int i7, Object obj) {
        switch (this.f4449a) {
            case 0:
                if (obj == null) {
                    Log.e(W.class.getSimpleName(), String.format(Locale.getDefault(), "This ad may have not been loaded or has been disposed. Ad with the following id could not be found: %d.", 0));
                    return new K(context, 2);
                }
                Integer num = (Integer) obj;
                AbstractC0331j abstractC0331j = (AbstractC0331j) ((HashMap) ((C1759x1) this.f4450b).f17926c).get(num);
                if (abstractC0331j != null && abstractC0331j.c() != null) {
                    return abstractC0331j.c();
                }
                Log.e(W.class.getSimpleName(), String.format(Locale.getDefault(), "This ad may have not been loaded or has been disposed. Ad with the following id could not be found: %d.", num));
                return new K(context, 2);
            default:
                if (((Integer) obj) == null) {
                    throw new IllegalStateException("An identifier is required to retrieve a View instance.");
                }
                Object e7 = ((C0407c) this.f4450b).e(r4.intValue());
                if (e7 instanceof io.flutter.plugin.platform.f) {
                    return (io.flutter.plugin.platform.f) e7;
                }
                if (e7 instanceof View) {
                    return new K((View) e7, 1);
                }
                throw new IllegalStateException("Unable to find a PlatformView or View instance: " + obj + ", " + e7);
        }
    }

    public W(C1759x1 c1759x1) {
        A5.x xVar = A5.x.f685a;
        this.f4450b = c1759x1;
    }
}
