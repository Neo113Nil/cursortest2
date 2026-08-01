package com.bykv.vk.openvk.pcc.pcc.sf.oo;

import android.os.Build;
import android.view.View;
import io.ktor.sse.ServerSentEventKt;

/* loaded from: classes5.dex */
public class pcc {
    private static final int pcc = Build.VERSION.SDK_INT;

    public static int pcc(long j, long j2) {
        return Math.min(Math.max(0, j2 > 0 ? (int) (((j * 1.0d) / j2) * 100.0d) : 0), 100);
    }

    public static String pcc(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j / 60000;
        long j3 = ((j % 3600000) % 60000) / 1000;
        if (j2 >= 10) {
            sb.append(j2);
        } else if (j2 > 0) {
            sb.append(0);
            sb.append(j2);
        } else {
            sb.append("00");
        }
        sb.append(ServerSentEventKt.COLON);
        if (j3 >= 10) {
            sb.append(j3);
        } else if (j3 > 0) {
            sb.append(0);
            sb.append(j3);
        } else {
            sb.append("00");
        }
        return sb.toString();
    }

    public static void pcc(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            view.setSystemUiVisibility(0);
            return;
        }
        int i = pcc;
        if (i >= 19) {
            view.setSystemUiVisibility(3846);
        } else if (i >= 16) {
            view.setSystemUiVisibility(5);
        } else {
            view.setSystemUiVisibility(1);
        }
    }
}
