package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.auto.value.AutoValue;
import java.util.Map;
import java.util.Set;

@AutoValue
/* loaded from: classes.dex */
public abstract class f {

    @AutoValue
    public static abstract class a {
        public abstract long a();

        public abstract Set<b> b();

        public abstract long c();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final /* synthetic */ b[] d;

        static {
            b bVar = new b("NETWORK_UNMETERED", 0);
            a = bVar;
            b bVar2 = new b("DEVICE_IDLE", 1);
            b = bVar2;
            b bVar3 = new b("DEVICE_CHARGING", 2);
            c = bVar3;
            d = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    public abstract com.google.android.datatransport.runtime.time.a a();

    public final long b(com.google.android.datatransport.e eVar, long j, int i) {
        long a2 = j - a().a();
        a aVar = c().get(eVar);
        long a3 = aVar.a();
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * a3 * Math.max(1.0d, Math.log(10000.0d) / Math.log((a3 > 1 ? a3 : 2L) * r12))), a2), aVar.c());
    }

    public abstract Map<com.google.android.datatransport.e, a> c();
}
