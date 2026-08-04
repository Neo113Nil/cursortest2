package L5;

import R5.C0407c;
import android.content.Context;
import android.util.Log;
import android.view.View;
import java.util.HashMap;
import java.util.Locale;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes2.dex */
public final class W extends io.flutter.plugin.platform.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4449a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
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
                AbstractC0331j abstractC0331j = (AbstractC0331j) ((HashMap) ((C1050x1) this.f4450b).f17932c).get(num);
                if (abstractC0331j != null && abstractC0331j.c() != null) {
                    return abstractC0331j.c();
                }
                Log.e(W.class.getSimpleName(), String.format(Locale.getDefault(), "This ad may have not been loaded or has been disposed. Ad with the following id could not be found: %d.", num));
                return new K(context, 2);
            default:
                Integer num2 = (Integer) obj;
                if (num2 == null) {
                    throw new IllegalStateException("An identifier is required to retrieve a View instance.");
                }
                Object objE = ((C0407c) this.f4450b).e(num2.intValue());
                if (objE instanceof io.flutter.plugin.platform.f) {
                    return (io.flutter.plugin.platform.f) objE;
                }
                if (objE instanceof View) {
                    return new K((View) objE, 1);
                }
                throw new IllegalStateException("Unable to find a PlatformView or View instance: " + obj + ", " + objE);
        }
    }

    public W(C1050x1 c1050x1) {
        A5.x xVar = A5.x.f685a;
        this.f4450b = c1050x1;
    }
}
