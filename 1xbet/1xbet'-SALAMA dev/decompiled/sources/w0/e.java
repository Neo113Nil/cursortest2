package w0;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.InputEvent;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final d a(Context context) {
        h.e(context, "context");
        StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
        int i7 = Build.VERSION.SDK_INT;
        p144u0.a aVar = p144u0.a.f16541a;
        sb.append(i7 >= 30 ? aVar.a() : 0);
        Log.d("MeasurementManager", sb.toString());
        p166y0.b bVar = (i7 >= 30 ? aVar.a() : 0) >= 5 ? new p166y0.b(context) : null;
        if (bVar != null) {
            return new d(bVar);
        }
        return null;
    }

    public abstract I3.b b(Uri uri, InputEvent inputEvent);
}
