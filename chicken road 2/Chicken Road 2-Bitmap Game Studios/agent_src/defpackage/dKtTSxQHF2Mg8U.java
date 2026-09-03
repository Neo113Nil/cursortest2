package defpackage;

import android.os.Build;
import androidx.collection.MutableObjectList;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class dKtTSxQHF2Mg8U implements Runnable {
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ dKtTSxQHF2Mg8U(int i) {
        this.oyjLVtGms9eZwJ0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.oyjLVtGms9eZwJ0) {
            case 0:
                MutableObjectList mutableObjectList = AndroidComposeView.Tq1wTdNjhzJEqe;
                synchronized (mutableObjectList) {
                    try {
                        int i = Build.VERSION.SDK_INT;
                        Object[] objArr = mutableObjectList.yzPsTade5rL7D3;
                        int i2 = mutableObjectList.hRNgd2zGCE5kj;
                        int i3 = 0;
                        if (i < 30) {
                            while (i3 < i2) {
                                AndroidComposeView androidComposeView = (AndroidComposeView) objArr[i3];
                                boolean showLayoutBounds = androidComposeView.getShowLayoutBounds();
                                Class cls = AndroidComposeView.EURemBBPR88w6;
                                androidComposeView.setShowLayoutBounds(AndroidComposeView.Companion.yzPsTade5rL7D3());
                                if (showLayoutBounds != androidComposeView.getShowLayoutBounds()) {
                                    androidComposeView.post(new tp5sG1Fy0ZCmW(androidComposeView, 2));
                                }
                                i3++;
                            }
                        } else {
                            while (i3 < i2) {
                                AndroidComposeView androidComposeView2 = (AndroidComposeView) objArr[i3];
                                androidComposeView2.post(new tp5sG1Fy0ZCmW(androidComposeView2, 3));
                                i3++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                throw null;
        }
    }
}
