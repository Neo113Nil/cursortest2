package A0;

import P.AbstractC0321v;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import game.betting133.sports1xbet.R;
import java.util.LinkedHashMap;
import p4.AbstractC2282w;
import u2.C2496k;

/* loaded from: classes.dex */
public abstract class G1 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f273a = new LinkedHashMap();

    public static final s4.K a(Context context) {
        s4.K k5;
        LinkedHashMap linkedHashMap = f273a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    r4.c a5 = r4.j.a(-1, 6, null);
                    C2496k c2496k = new C2496k(new E1(contentResolver, uriFor, new F1(a5, G4.d.l(Looper.getMainLooper())), a5, context, null));
                    p4.i0 b3 = AbstractC2282w.b();
                    w4.e eVar = p4.D.f18743a;
                    obj = s4.C.j(c2496k, new u4.c(G4.l.H(b3, u4.m.f20109a)), new s4.J(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, obj);
                }
                k5 = (s4.K) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return k5;
    }

    public static final AbstractC0321v b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC0321v) {
            return (AbstractC0321v) tag;
        }
        return null;
    }
}
