package W1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f3405a;

    public i(Context context, String str) {
        this.f3405a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        try {
            long j2 = this.f3405a.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f3405a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f3405a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f3405a.edit().putStringSet(str, hashSet).putLong("fire-count", j2 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.f3405a.edit();
            int i2 = 0;
            for (Map.Entry<String, ?> entry : this.f3405a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String d6 = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(d6)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d6);
                        i2++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i2 == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i2);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList c() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f3405a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f3405a.edit().putLong("fire-global", currentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j2) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j2));
        }
        instant = new Date(j2).toInstant();
        zoneOffset = ZoneOffset.UTC;
        atOffset = instant.atOffset(zoneOffset);
        localDateTime = atOffset.toLocalDateTime();
        dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        format = localDateTime.format(dateTimeFormatter);
        return format;
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f3405a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void f(String str) {
        try {
            String e3 = e(str);
            if (e3 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f3405a.getStringSet(e3, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f3405a.edit().remove(e3).commit();
            } else {
                this.f3405a.edit().putStringSet(e3, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean g(long j2) {
        if (!this.f3405a.contains("fire-global")) {
            this.f3405a.edit().putLong("fire-global", j2).commit();
            return true;
        }
        long j6 = this.f3405a.getLong("fire-global", -1L);
        synchronized (this) {
            if (d(j6).equals(d(j2))) {
                return false;
            }
            this.f3405a.edit().putLong("fire-global", j2).commit();
            return true;
        }
    }

    public final synchronized void h(long j2, String str) {
        String d6 = d(j2);
        if (this.f3405a.getString("last-used-date", "").equals(d6)) {
            String e3 = e(d6);
            if (e3 == null) {
                return;
            }
            if (e3.equals(str)) {
                return;
            }
            i(str, d6);
            return;
        }
        long j6 = this.f3405a.getLong("fire-count", 0L);
        if (j6 + 1 == 30) {
            a();
            j6 = this.f3405a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f3405a.getStringSet(str, new HashSet()));
        hashSet.add(d6);
        this.f3405a.edit().putStringSet(str, hashSet).putLong("fire-count", j6 + 1).putString("last-used-date", d6).commit();
    }

    public final synchronized void i(String str, String str2) {
        f(str2);
        HashSet hashSet = new HashSet(this.f3405a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f3405a.edit().putStringSet(str, hashSet).commit();
    }
}
