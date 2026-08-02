package org.betup.ui.notifications;

import android.util.SparseArray;
import org.betup.ui.dialogs.MatchInfoDialog;

/* loaded from: classes4.dex */
public class NotificationDialogHolder {
    private SparseArray<MatchInfoDialog> dialogs = new SparseArray<>();

    public void displayDialog(MatchInfoDialog matchInfoDialog) {
        if (this.dialogs.get(matchInfoDialog.getMatchId()) != null) {
            try {
                this.dialogs.get(matchInfoDialog.getMatchId()).dismiss();
            } catch (Exception unused) {
            }
        }
        this.dialogs.put(matchInfoDialog.getMatchId(), matchInfoDialog);
        matchInfoDialog.show();
    }

    public void removeAll() {
        for (int i = 0; i < this.dialogs.size(); i++) {
            try {
                this.dialogs.get(this.dialogs.keyAt(i)).dismiss();
            } catch (Exception unused) {
            }
        }
        this.dialogs.clear();
    }
}
