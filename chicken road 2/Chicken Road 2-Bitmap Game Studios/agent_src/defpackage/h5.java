package defpackage;

import android.content.Context;
import androidx.profileinstaller.ProfileInstaller;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class h5 implements Runnable {
    public final /* synthetic */ Context b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ h5(Context context, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.oyjLVtGms9eZwJ0;
        int i2 = 1;
        Context context = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new h5(context, i2));
                break;
            default:
                ProfileInstaller.hRNgd2zGCE5kj(context, new LQLHPA8xotOb(1), ProfileInstaller.yzPsTade5rL7D3, false);
                break;
        }
    }
}
