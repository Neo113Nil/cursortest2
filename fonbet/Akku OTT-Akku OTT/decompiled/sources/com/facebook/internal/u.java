package com.facebook.internal;

import java.util.HashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u {
    public static final a Companion = new a();
    public static final HashMap<String, String> c = new HashMap<>();
    public final String a;
    public StringBuilder b;

    public static final class a {
        @JvmStatic
        public static void a(com.facebook.G behavior, String tag, String string) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(string, "string");
            c(behavior, tag, string);
        }

        @JvmStatic
        public static void b(com.facebook.G behavior, String tag, String format, Object... args) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            com.facebook.w.h(behavior);
        }

        @JvmStatic
        public static void c(com.facebook.G behavior, String tag, String string) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(string, "string");
            com.facebook.w.h(behavior);
        }

        @JvmStatic
        public final synchronized void d(String original) {
            Intrinsics.checkNotNullParameter(original, "accessToken");
            com.facebook.w.h(com.facebook.G.b);
            synchronized (this) {
                Intrinsics.checkNotNullParameter(original, "original");
                Intrinsics.checkNotNullParameter("ACCESS_TOKEN_REMOVED", "replace");
                u.c.put(original, "ACCESS_TOKEN_REMOVED");
            }
        }
    }

    public u() {
        com.facebook.G behavior = com.facebook.G.a;
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter("Request", "tag");
        F.e("Request", "tag");
        this.a = "FacebookSDK.Request";
        this.b = new StringBuilder();
    }

    public final void a(Object value, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] args = {key, value};
        Intrinsics.checkNotNullParameter("  %s:\t%s\n", "format");
        Intrinsics.checkNotNullParameter(args, "args");
        c();
    }

    public final void b() {
        String string = this.b.toString();
        Intrinsics.checkNotNullExpressionValue(string, "contents.toString()");
        Intrinsics.checkNotNullParameter(string, "string");
        Companion.getClass();
        a.c(com.facebook.G.a, this.a, string);
        this.b = new StringBuilder();
    }

    public final void c() {
        com.facebook.w.h(com.facebook.G.a);
    }
}
