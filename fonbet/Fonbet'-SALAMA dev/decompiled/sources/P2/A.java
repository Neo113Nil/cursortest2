package P2;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f5400a;

    /* renamed from: b, reason: collision with root package name */
    public SharedPreferences.Editor f5401b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f5402c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5403d = new Object();

    public A(Context context) {
        this.f5402c = context;
    }

    public final String a(String str) {
        String string;
        e();
        synchronized (this.f5403d) {
            string = this.f5400a.getString(str, null);
            this.f5401b.remove(str).commit();
        }
        return string;
    }

    public final HashMap b() {
        HashMap hashMap;
        e();
        synchronized (this.f5403d) {
            try {
                Map<String, ?> all = this.f5400a.getAll();
                hashMap = new HashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    if ((entry.getValue() instanceof String) && !Objects.equals(entry.getKey(), "pn") && !Objects.equals(entry.getKey(), "vc") && !Objects.equals(entry.getKey(), "dm") && !Objects.equals(entry.getKey(), "aav")) {
                        hashMap.put(entry.getKey(), (String) entry.getValue());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    public final void c() {
        e();
        synchronized (this.f5403d) {
            this.f5401b.clear().commit();
        }
    }

    public final void d(int i7, int i8, String str, String str2) {
        e();
        synchronized (this.f5403d) {
            this.f5401b.putString("pn", str).putInt("vc", i7).putString("dm", str2).putInt("aav", i8).commit();
        }
    }

    public final void e() {
        synchronized (this.f5403d) {
            try {
                if (this.f5400a != null) {
                    return;
                }
                SharedPreferences sharedPreferences = this.f5402c.getSharedPreferences("query_info_shared_prefs", 0);
                this.f5400a = sharedPreferences;
                this.f5401b = sharedPreferences.edit();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
