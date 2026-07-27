package q1;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: q1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1172b {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f10258c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static volatile C1172b f10259d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f10260a;

    /* renamed from: b, reason: collision with root package name */
    public volatile ArrayList f10261b;

    public C1172b(Context context) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        this.f10260a = applicationContext;
        f10258c.put("FireTVFOSDAT", d.a(applicationContext));
    }

    public static C1172b b(Context context) {
        if (f10259d == null) {
            synchronized (C1172b.class) {
                try {
                    if (f10259d == null) {
                        f10259d = new C1172b(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10259d;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0021 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a() {
        c cVar;
        if (this.f10261b != null) {
            return this.f10261b;
        }
        synchronized (this) {
            if (this.f10261b != null) {
                return this.f10261b;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : f10258c.entrySet()) {
                    if (((d) entry.getValue()).b()) {
                        String str = (String) entry.getKey();
                        Context context = this.f10260a;
                        if (str != null && context != null) {
                            if ("FireTVFOSDAT".equals(str)) {
                                cVar = new c(context);
                                if (cVar == null) {
                                    arrayList.add(cVar);
                                }
                            }
                        }
                        cVar = null;
                        if (cVar == null) {
                        }
                    }
                }
                this.f10261b = arrayList;
                return this.f10261b;
            } catch (Exception unused) {
                this.f10261b = new ArrayList();
                return this.f10261b;
            }
        }
    }
}
