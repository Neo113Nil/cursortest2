package defpackage;

import android.os.CancellationSignal;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.text.TextRange;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ Object hRNgd2zGCE5kj;
    public final /* synthetic */ int yzPsTade5rL7D3;

    public /* synthetic */ h0(int i, Object obj) {
        this.yzPsTade5rL7D3 = i;
        this.hRNgd2zGCE5kj = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.yzPsTade5rL7D3;
        Object obj = this.hRNgd2zGCE5kj;
        switch (i) {
            case 0:
                ((JobSupport) ((Job) obj)).yzPsTade5rL7D3(null);
                break;
            default:
                TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) obj;
                if (textFieldSelectionManager != null) {
                    LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.oyjLVtGms9eZwJ0;
                    if (legacyTextFieldState != null) {
                        legacyTextFieldState.b41X89IqSbKt(TextRange.hRNgd2zGCE5kj);
                    }
                    LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.oyjLVtGms9eZwJ0;
                    if (legacyTextFieldState2 != null) {
                        legacyTextFieldState2.gmXBnHsR2YSm(TextRange.hRNgd2zGCE5kj);
                        break;
                    }
                }
                break;
        }
    }
}
