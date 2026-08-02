package com.google.common.base;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class h {

    public static final class a {
        public final String a;
        public final C0130a b;
        public C0130a c;

        /* renamed from: com.google.common.base.h$a$a, reason: collision with other inner class name */
        public static class C0130a {
            public Object a;
            public C0130a b;
        }

        public a(String str) {
            C0130a c0130a = new C0130a();
            this.b = c0130a;
            this.c = c0130a;
            this.a = str;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.a);
            sb.append('{');
            C0130a c0130a = this.b.b;
            String str = "";
            while (c0130a != null) {
                Object obj = c0130a.a;
                sb.append(str);
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                }
                c0130a = c0130a.b;
                str = ", ";
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static <T> T a(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }
}
