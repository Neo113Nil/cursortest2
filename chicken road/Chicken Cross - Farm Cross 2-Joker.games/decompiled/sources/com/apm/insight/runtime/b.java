package com.apm.insight.runtime;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: AppAliveTrack.java */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static long f4061a = -30000;
    private static File b;

    public static void a(long j) {
        if (j - f4061a < 30000) {
            return;
        }
        f4061a = j;
        try {
            if (b == null) {
                long currentTimeMillis = System.currentTimeMillis();
                b = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/TrackInfo/" + ((currentTimeMillis - (currentTimeMillis % 86400000)) / 86400000) + "/" + com.apm.insight.e.f());
            }
            com.apm.insight.l.f.a(b, String.valueOf(System.currentTimeMillis()), false);
        } catch (IOException unused) {
        }
    }

    public static String a(long j, String str) {
        try {
            return com.apm.insight.l.f.a(new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/TrackInfo/" + ((j - (j % 86400000)) / 86400000) + "/" + str), "\n");
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    public static void a() {
        File file = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/TrackInfo/");
        String[] list = file.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            for (int i = 0; i < list.length - 5; i++) {
                com.apm.insight.l.f.a(new File(file, list[i]));
            }
        }
    }
}
