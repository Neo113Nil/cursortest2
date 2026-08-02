package P0;

import android.os.Handler;

/* loaded from: classes.dex */
public class m extends l {
    @Override // P0.l
    public final void a(G.D d5) {
        d5.closeConnection();
    }

    @Override // P0.l, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i5) {
        G.D d5 = this.f4664b;
        if (d5 != null) {
            return d5.deleteSurroundingTextInCodePoints(i, i5);
        }
        return false;
    }

    @Override // P0.l, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }
}
