package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes7.dex */
public class an {

    /* renamed from: a, reason: collision with root package name */
    public static int f11617a = -1;
    public static String b = null;
    public static List<String> c = null;
    private static String d = "api16-access-ttp.tiktokpangle.us";
    public static final String[] e = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};
    private static int f = Integer.MIN_VALUE;
    private static int g = 0;
    public static String h = "";

    public static String a() {
        return f11617a == 1 ? "VA" : "SG";
    }

    public static String a(Context context) {
        List<String> list;
        if (TextUtils.isEmpty(b)) {
            try {
                if (f == Integer.MIN_VALUE) {
                    f = aw.a(context, "domain_index", 0);
                }
                String[] strArr = e;
                return strArr[f % strArr.length];
            } catch (Throwable unused) {
                return d;
            }
        }
        if (g <= 0 || (list = c) == null || list.isEmpty()) {
            return b;
        }
        List<String> list2 = c;
        return list2.get((g - 1) % list2.size());
    }

    public static void a(int i) {
        f11617a = i;
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        b = str;
    }

    public static void a(Set<String> set) {
        if (set != null) {
            c = new ArrayList(set);
        }
    }

    public static String b() {
        return h;
    }

    public static void b(Context context) {
        if (TextUtils.isEmpty(b)) {
            int i = f;
            if (i >= Integer.MAX_VALUE) {
                f = 0;
                return;
            }
            int i2 = i + 1;
            f = i2;
            aw.b(context, "domain_index", i2);
            return;
        }
        List<String> list = c;
        if (list == null || list.isEmpty() || g >= c.size()) {
            g = 0;
        } else {
            g++;
        }
    }

    public static void b(String str) {
        h = str;
    }

    public static void c() {
        g = 0;
    }
}
