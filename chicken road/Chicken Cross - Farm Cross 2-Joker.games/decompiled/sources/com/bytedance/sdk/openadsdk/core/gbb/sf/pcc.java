package com.bytedance.sdk.openadsdk.core.gbb.sf;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.openadsdk.core.gbb.sf.gm;
import io.ktor.sse.ServerSentEventKt;

/* loaded from: classes4.dex */
public class pcc extends gm implements Comparable<pcc> {
    public long pcc;

    protected pcc(long j, String str, gm.EnumC0148gm enumC0148gm, Boolean bool) {
        super(str, enumC0148gm, bool);
        this.pcc = j;
    }

    public long pcc() {
        return this.pcc;
    }

    public static int pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        String[] split = str.split(ServerSentEventKt.COLON);
        if (split.length == 3) {
            try {
                return (int) ((Integer.parseInt(split[0]) * Constants.ONE_HOUR) + (Integer.parseInt(split[1]) * 60000) + (Float.parseFloat(split[2]) * 1000.0f));
            } catch (Throwable unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    public boolean pcc(long j) {
        return this.pcc <= j && !oo();
    }

    @Override // java.lang.Comparable
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public int compareTo(pcc pccVar) {
        if (pccVar == null) {
            return 1;
        }
        long j = this.pcc;
        long j2 = pccVar.pcc;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.gbb.sf.pcc$pcc, reason: collision with other inner class name */
    public static class C0149pcc {
        private gm.EnumC0148gm gm = gm.EnumC0148gm.TRACKING_URL;
        private final String pcc;
        private final long sf;

        public C0149pcc(String str, long j) {
            this.pcc = str;
            this.sf = j;
        }

        public pcc pcc() {
            return new pcc(this.sf, this.pcc, this.gm, Boolean.FALSE);
        }
    }

    public String toString() {
        return super.toString();
    }
}
