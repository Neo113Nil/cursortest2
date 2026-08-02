package com.google.android.exoplayer2.offline;

import android.content.Context;
import com.razorpay.CoreInitializer;
import java.io.IOException;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((DownloadHelper) this.b).lambda$onMediaPreparationFailed$5((IOException) this.c);
                break;
            default:
                CoreInitializer.m1695create$lambda1((CoreInitializer) this.b, (Context) this.c);
                break;
        }
    }
}
