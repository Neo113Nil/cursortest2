package H2;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d1;
import i.C1228f;
import l.AbstractC1364b;

/* loaded from: classes.dex */
public final class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3239a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3240b;

    public /* synthetic */ e(Object obj, int i7) {
        this.f3239a = i7;
        this.f3240b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
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
                ((AbstractC1364b) this.f3240b).a();
                break;
            case 2:
                d1 d1Var = ((Toolbar) this.f3240b).f8543g0;
                m.m mVar = d1Var == null ? null : d1Var.f8613b;
                if (mVar != null) {
                    mVar.collapseActionView();
                    break;
                }
                break;
            default:
                C1228f c1228f = (C1228f) this.f3240b;
                Message obtain = (view != c1228f.f13685i || (message3 = c1228f.f13686k) == null) ? (view != c1228f.f13687l || (message2 = c1228f.f13689n) == null) ? (view != c1228f.f13690o || (message = c1228f.f13692q) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (obtain != null) {
                    obtain.sendToTarget();
                }
                c1228f.f13675E.obtainMessage(1, c1228f.f13678b).sendToTarget();
                break;
        }
    }
}
