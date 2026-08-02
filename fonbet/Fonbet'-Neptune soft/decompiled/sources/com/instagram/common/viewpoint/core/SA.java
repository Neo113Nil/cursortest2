package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: assets/audience_network.dex */
public class SA implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ SF A01;

    public SA(SF sf, SB sb) {
        this.A01 = sf;
        new Handler(Looper.getMainLooper()).post(new C1178dk(this, sf, sb));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(SB sb) {
        SQ sq;
        SQ sq2;
        long currentTimeMillis = System.currentTimeMillis();
        sq = this.A01.A04;
        C1212eJ A06 = C1212eJ.A06(sq.A02());
        Uri A00 = WQ.A00(sb.A08);
        long j = sb.A00;
        if (j == -1) {
            sq2 = this.A01.A04;
            j = U7.A0S(sq2);
        }
        A06.A0I(A00, new C1177dj(this, sb, j, currentTimeMillis), j);
    }
}
