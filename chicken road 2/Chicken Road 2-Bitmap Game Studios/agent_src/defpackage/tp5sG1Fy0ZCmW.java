package defpackage;

import android.os.Trace;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class tp5sG1Fy0ZCmW implements Runnable {
    public final /* synthetic */ AndroidComposeView b41X89IqSbKt;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ tp5sG1Fy0ZCmW(AndroidComposeView androidComposeView, int i) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = androidComposeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.oyjLVtGms9eZwJ0;
        AndroidComposeView androidComposeView = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                ArrayDeque arrayDeque = androidComposeView.kSPEzfraxudm4i;
                Class cls = AndroidComposeView.EURemBBPR88w6;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!arrayDeque.isEmpty()) {
                    try {
                        ((Function0) arrayDeque.removeLast()).hRNgd2zGCE5kj();
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            case 1:
                androidComposeView.LQLHPA8xotOb = false;
                MotionEvent motionEvent = androidComposeView.nyjtcQGvI9u5;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    androidComposeView.eRG1z4EECsZxdV1(motionEvent);
                    return;
                } else {
                    yzPsTade5rL7D3.kSPEzfraxudm4i("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                AndroidComposeView.LKH4PK2NjbMM(androidComposeView.getRoot());
                return;
            default:
                AndroidComposeView.LKH4PK2NjbMM(androidComposeView.getRoot());
                return;
        }
    }
}
