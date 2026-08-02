package p000;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: d2 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0123d2 implements View.OnClickListener {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1520j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1521k;

    public /* synthetic */ ViewOnClickListenerC0123d2(int i, Object obj) {
        this.f1520j = i;
        this.f1521k = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        int i = this.f1520j;
        Message messageObtain = null;
        messageObtain = null;
        Object obj = this.f1521k;
        switch (i) {
            case 0:
                ((AbstractC0751u2) obj).mo2101a();
                break;
            case 1:
                C0641r3 c0641r3 = (C0641r3) obj;
                if (view == c0641r3.f6679g && (message3 = c0641r3.f6681i) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view == c0641r3.f6682j && (message2 = c0641r3.f6684l) != null) {
                    messageObtain = Message.obtain(message2);
                } else if (view == c0641r3.f6685m && (message = c0641r3.f6687o) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                c0641r3.f6671C.obtainMessage(1, c0641r3.f6674b).sendToTarget();
                break;
            default:
                sd1 sd1Var = ((Toolbar) obj).f436U;
                rn0 rn0Var = sd1Var != null ? sd1Var.f7099k : null;
                if (rn0Var != null) {
                    rn0Var.collapseActionView();
                }
                break;
        }
    }
}
