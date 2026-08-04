package H2;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d1;
import p058i.C0909f;

/* JADX INFO: loaded from: classes.dex */
public final class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3240b;

    public /* synthetic */ e(Object obj, int i7) {
        this.f3239a = i7;
        this.f3240b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message messageObtain;
        Message message;
        Message message2;
        Message message3;
        switch (this.f3239a) {
            case 0:
                j jVar = (j) this.f3240b;
                jVar.f3258M = 2;
                jVar.f3259a.finish();
                break;
            case 1:
                ((p078l.b) this.f3240b).a();
                break;
            case 2:
                d1 d1Var = ((Toolbar) this.f3240b).f8543g0;
                p086m.m mVar = d1Var == null ? null : d1Var.f8613b;
                if (mVar != null) {
                    mVar.collapseActionView();
                }
                break;
            default:
                C0909f c0909f = (C0909f) this.f3240b;
                if (view == c0909f.f13691i && (message3 = c0909f.f13692k) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view != c0909f.f13693l || (message2 = c0909f.f13695n) == null) {
                    messageObtain = (view != c0909f.f13696o || (message = c0909f.f13698q) == null) ? null : Message.obtain(message);
                } else {
                    messageObtain = Message.obtain(message2);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                c0909f.f13681E.obtainMessage(1, c0909f.f13684b).sendToTarget();
                break;
        }
    }
}
