package androidx.compose.ui.platform;

import Ae.C2399j;
import Ae.I0;
import Ae.InterfaceC2395h;
import De.C2862e;
import S0.AbstractC3984t;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ze.C11115c;

/* loaded from: classes.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap f41009a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f41010b = 0;

    public static final Ae.M0 a(Context context) {
        Ae.M0 m02;
        LinkedHashMap linkedHashMap = f41009a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    C11115c a11 = ze.k.a(-1, 6, null);
                    InterfaceC2395h A11 = C2399j.A(new p2(contentResolver, uriFor, new q2(a11, androidx.core.os.h.a(Looper.getMainLooper())), a11, context, null));
                    C2862e b11 = xe.N.b();
                    int i11 = Ae.I0.f818a;
                    obj = C2399j.M(A11, b11, I0.a.b(3), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, obj);
                }
                m02 = (Ae.M0) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m02;
    }

    public static final AbstractC3984t b(@NotNull View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC3984t) {
            return (AbstractC3984t) tag;
        }
        return null;
    }
}
