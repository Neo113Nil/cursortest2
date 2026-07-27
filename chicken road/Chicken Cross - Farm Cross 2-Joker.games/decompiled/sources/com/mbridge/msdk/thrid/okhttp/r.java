package com.mbridge.msdk.thrid.okhttp;

import io.ktor.sse.ServerSentEventKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* compiled from: Headers.java */
/* loaded from: classes6.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f9946a;

    r(a aVar) {
        List<String> list = aVar.f9947a;
        this.f9946a = (String[]) list.toArray(new String[list.size()]);
    }

    public String a(int i) {
        return this.f9946a[i * 2];
    }

    @Nullable
    public String b(String str) {
        return a(this.f9946a, str);
    }

    public List<String> c(String str) {
        int b = b();
        ArrayList arrayList = null;
        for (int i = 0; i < b; i++) {
            if (str.equalsIgnoreCase(a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(b(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof r) && Arrays.equals(((r) obj).f9946a, this.f9946a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f9946a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int b = b();
        for (int i = 0; i < b; i++) {
            sb.append(a(i)).append(": ").append(b(i)).append("\n");
        }
        return sb.toString();
    }

    /* compiled from: Headers.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final List<String> f9947a = new ArrayList(20);

        a a(String str) {
            int indexOf = str.indexOf(ServerSentEventKt.COLON, 1);
            return indexOf != -1 ? b(str.substring(0, indexOf), str.substring(indexOf + 1)) : str.startsWith(ServerSentEventKt.COLON) ? b("", str.substring(1)) : b("", str);
        }

        a b(String str, String str2) {
            this.f9947a.add(str);
            this.f9947a.add(str2.trim());
            return this;
        }

        public a c(String str, String str2) {
            r.a(str);
            r.a(str2, str);
            b(str);
            b(str, str2);
            return this;
        }

        public a b(String str) {
            int i = 0;
            while (i < this.f9947a.size()) {
                if (str.equalsIgnoreCase(this.f9947a.get(i))) {
                    this.f9947a.remove(i);
                    this.f9947a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public a a(String str, String str2) {
            r.a(str);
            r.a(str2, str);
            return b(str, str2);
        }

        public r a() {
            return new r(this);
        }
    }

    public a a() {
        a aVar = new a();
        Collections.addAll(aVar.f9947a, this.f9946a);
        return aVar;
    }

    public int b() {
        return this.f9946a.length / 2;
    }

    public String b(int i) {
        return this.f9946a[(i * 2) + 1];
    }

    private static String a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    static void a(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt <= ' ' || charAt >= 127) {
                        throw new IllegalArgumentException(com.mbridge.msdk.thrid.okhttp.internal.c.a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty");
        }
        throw new NullPointerException("name == null");
    }

    static void a(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                    throw new IllegalArgumentException(com.mbridge.msdk.thrid.okhttp.internal.c.a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException("value for name " + str2 + " == null");
    }
}
