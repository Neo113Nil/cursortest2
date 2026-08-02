package P0;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public class n extends m {
    @Override // P0.l, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            return d5.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }
}
