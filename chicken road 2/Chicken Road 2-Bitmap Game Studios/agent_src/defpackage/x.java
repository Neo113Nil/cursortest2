package defpackage;

import android.graphics.Typeface;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.DispatchQueue;
import androidx.room.TransactionExecutor;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.sidecar.SidecarWindowBackend;
import com.door.brass.knob.Hilt_MainActivity;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.android.HandlerContext;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ Object b41X89IqSbKt;
    public final /* synthetic */ Object gmXBnHsR2YSm;
    public final /* synthetic */ int oyjLVtGms9eZwJ0;

    public /* synthetic */ x(int i, Object obj, Object obj2) {
        this.oyjLVtGms9eZwJ0 = i;
        this.b41X89IqSbKt = obj;
        this.gmXBnHsR2YSm = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.oyjLVtGms9eZwJ0;
        Object obj = this.gmXBnHsR2YSm;
        Object obj2 = this.b41X89IqSbKt;
        switch (i) {
            case 0:
                Hilt_MainActivity hilt_MainActivity = (Hilt_MainActivity) obj2;
                int i2 = ComponentActivity.XrorSzThrtvJ4A;
                hilt_MainActivity.oyjLVtGms9eZwJ0.yzPsTade5rL7D3(new z(0, (OnBackPressedDispatcher) obj, hilt_MainActivity));
                return;
            case 1:
                ((DispatchQueue) obj2).getClass();
                throw null;
            case 2:
                int i3 = HandlerContext.UEutaskTsxaI;
                ((CancellableContinuationImpl) obj2).dKtTSxQHF2Mg8U((HandlerContext) obj, Unit.yzPsTade5rL7D3);
                return;
            case 3:
                ((ResourcesCompat.FontCallback) obj2).ra306ClFT3HT((Typeface) obj);
                return;
            case 4:
                ((SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) obj2).ra306ClFT3HT.accept((WindowLayoutInfo) obj);
                return;
            default:
                TransactionExecutor transactionExecutor = (TransactionExecutor) obj;
                try {
                    ((Runnable) obj2).run();
                    return;
                } finally {
                    transactionExecutor.yzPsTade5rL7D3();
                }
        }
    }
}
