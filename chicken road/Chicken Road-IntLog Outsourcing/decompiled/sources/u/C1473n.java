package u;

import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: u.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1473n extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12002e;

    /* renamed from: f, reason: collision with root package name */
    public Object f12003f;

    public C1473n(int i2) {
        this.f12002e = i2;
        switch (i2) {
            case 1:
                this.f12003f = new ArrayList();
                break;
        }
    }

    @Override // u.r
    public final void a(R4.u uVar) {
        switch (this.f12002e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) uVar.f2722d).setBigContentTitle(this.f12028b).bigText((CharSequence) this.f12003f);
                if (this.f12030d) {
                    bigText.setSummaryText(this.f12029c);
                    break;
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) uVar.f2722d).setBigContentTitle(this.f12028b);
                if (this.f12030d) {
                    bigContentTitle.setSummaryText(this.f12029c);
                }
                Iterator it = ((ArrayList) this.f12003f).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                break;
        }
    }

    @Override // u.r
    public final String b() {
        switch (this.f12002e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }
}
