package M4;

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

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4591a;

    public h(Context context, String str) {
        this.f4591a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        try {
            long j = this.f4591a.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f4591a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f4591a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f4591a.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.f4591a.edit();
            int i7 = 0;
            for (Map.Entry<String, ?> entry : this.f4591a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String d7 = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(d7)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d7);
                        i7++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i7 == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i7);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList c() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f4591a.getAll().entrySet()) {
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
                this.f4591a.edit().putLong("fire-global", currentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
        }
        instant = new Date(j).toInstant();
        zoneOffset = ZoneOffset.UTC;
        atOffset = instant.atOffset(zoneOffset);
        localDateTime = atOffset.toLocalDateTime();
        dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        format = localDateTime.format(dateTimeFormatter);
        return format;
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f4591a.getAll().entrySet()) {
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
            String e7 = e(str);
            if (e7 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f4591a.getStringSet(e7, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f4591a.edit().remove(e7).commit();
            } else {
                this.f4591a.edit().putStringSet(e7, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean g(long j) {
        if (!this.f4591a.contains("fire-global")) {
            this.f4591a.edit().putLong("fire-global", j).commit();
            return true;
        }
        long j3 = this.f4591a.getLong("fire-global", -1L);
        synchronized (this) {
            if (d(j3).equals(d(j))) {
                return false;
            }
            this.f4591a.edit().putLong("fire-global", j).commit();
            return true;
        }
    }

    public final synchronized void h(String str, long j) {
        String d7 = d(j);
        if (this.f4591a.getString("last-used-date", "").equals(d7)) {
            String e7 = e(d7);
            if (e7 == null) {
                return;
            }
            if (e7.equals(str)) {
                return;
            }
            i(str, d7);
            return;
        }
        long j3 = this.f4591a.getLong("fire-count", 0L);
        if (j3 + 1 == 30) {
            a();
            j3 = this.f4591a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f4591a.getStringSet(str, new HashSet()));
        hashSet.add(d7);
        this.f4591a.edit().putStringSet(str, hashSet).putLong("fire-count", j3 + 1).putString("last-used-date", d7).commit();
    }

    public final synchronized void i(String str, String str2) {
        f(str2);
        HashSet hashSet = new HashSet(this.f4591a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f4591a.edit().putStringSet(str, hashSet).commit();
    }
}
