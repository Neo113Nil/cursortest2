package a3;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f6641a;

    /* renamed from: b, reason: collision with root package name */
    public SharedPreferences.Editor f6642b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f6643c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6644d = new Object();

    public z(Context context) {
        this.f6643c = context;
    }

    public final int a() {
        int i;
        h();
        synchronized (this.f6644d) {
            i = this.f6641a.getInt("aav", -1);
        }
        return i;
    }

    public final int b() {
        int i;
        h();
        synchronized (this.f6644d) {
            i = this.f6641a.getInt("vc", -1);
        }
        return i;
    }

    public final String c(String str) {
        String string;
        h();
        synchronized (this.f6644d) {
            string = this.f6641a.getString(str, null);
            this.f6642b.remove(str).commit();
        }
        return string;
    }

    public final String d() {
        String string;
        h();
        synchronized (this.f6644d) {
            string = this.f6641a.getString("dm", null);
        }
        return string;
    }

    public final HashMap e() {
        HashMap hashMap;
        h();
        synchronized (this.f6644d) {
            try {
                Map<String, ?> all = this.f6641a.getAll();
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

    public final void f() {
        h();
        synchronized (this.f6644d) {
            this.f6642b.clear().commit();
        }
    }

    public final void g(int i, int i5, String str) {
        String str2 = Build.MODEL;
        h();
        synchronized (this.f6644d) {
            this.f6642b.putString("pn", str).putInt("vc", i).putString("dm", str2).putInt("aav", i5).commit();
        }
    }

    public final void h() {
        synchronized (this.f6644d) {
            try {
                if (this.f6641a != null) {
                    return;
                }
                SharedPreferences sharedPreferences = this.f6643c.getSharedPreferences("query_info_shared_prefs", 0);
                this.f6641a = sharedPreferences;
                this.f6642b = sharedPreferences.edit();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
