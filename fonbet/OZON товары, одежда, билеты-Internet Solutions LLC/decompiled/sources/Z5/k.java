package Z5;

import C.o0;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class k implements i {

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, List<j>> f35529b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Map<String, String> f35530c;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        private static final Map<String, List<j>> f35531b;

        /* renamed from: a, reason: collision with root package name */
        private Map<String, List<j>> f35532a = f35531b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb2 = new StringBuilder(property.length());
                for (int i11 = 0; i11 < length; i11++) {
                    char charAt = property.charAt(i11);
                    if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                        sb2.append(charAt);
                    } else {
                        sb2.append('?');
                    }
                }
                property = sb2.toString();
            }
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(property)));
            }
            f35531b = Collections.unmodifiableMap(hashMap);
        }

        public final k a() {
            return new k(this.f35532a);
        }
    }

    static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final String f35533a;

        b(@NonNull String str) {
            this.f35533a = str;
        }

        @Override // Z5.j
        public final String a() {
            return this.f35533a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f35533a.equals(((b) obj).f35533a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f35533a.hashCode();
        }

        public final String toString() {
            return o0.c(new StringBuilder("StringHeaderFactory{value='"), this.f35533a, "'}");
        }
    }

    k(Map<String, List<j>> map) {
        this.f35529b = Collections.unmodifiableMap(map);
    }

    private HashMap a() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<j>> entry : this.f35529b.entrySet()) {
            List<j> value = entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = value.size();
            for (int i11 = 0; i11 < size; i11++) {
                String a11 = value.get(i11).a();
                if (!TextUtils.isEmpty(a11)) {
                    sb2.append(a11);
                    if (i11 != value.size() - 1) {
                        sb2.append(',');
                    }
                }
            }
            String sb3 = sb2.toString();
            if (!TextUtils.isEmpty(sb3)) {
                hashMap.put(entry.getKey(), sb3);
            }
        }
        return hashMap;
    }

    public final Map<String, String> b() {
        if (this.f35530c == null) {
            synchronized (this) {
                try {
                    if (this.f35530c == null) {
                        this.f35530c = Collections.unmodifiableMap(a());
                    }
                } finally {
                }
            }
        }
        return this.f35530c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f35529b.equals(((k) obj).f35529b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35529b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f35529b + '}';
    }
}
