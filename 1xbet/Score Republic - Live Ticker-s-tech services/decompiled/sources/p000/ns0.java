package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ns0 {

    /* JADX INFO: renamed from: a */
    public final Context f5510a;

    /* JADX INFO: renamed from: e */
    public CharSequence f5514e;

    /* JADX INFO: renamed from: f */
    public CharSequence f5515f;

    /* JADX INFO: renamed from: g */
    public PendingIntent f5516g;

    /* JADX INFO: renamed from: h */
    public IconCompat f5517h;

    /* JADX INFO: renamed from: i */
    public int f5518i;

    /* JADX INFO: renamed from: j */
    public int f5519j;

    /* JADX INFO: renamed from: l */
    public sq1 f5521l;

    /* JADX INFO: renamed from: n */
    public Bundle f5523n;

    /* JADX INFO: renamed from: q */
    public String f5526q;

    /* JADX INFO: renamed from: r */
    public final boolean f5527r;

    /* JADX INFO: renamed from: s */
    public final Notification f5528s;

    /* JADX INFO: renamed from: t */
    public final ArrayList f5529t;

    /* JADX INFO: renamed from: b */
    public final ArrayList f5511b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f5512c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f5513d = new ArrayList();

    /* JADX INFO: renamed from: k */
    public boolean f5520k = true;

    /* JADX INFO: renamed from: m */
    public boolean f5522m = false;

    /* JADX INFO: renamed from: o */
    public int f5524o = 0;

    /* JADX INFO: renamed from: p */
    public int f5525p = 0;

    public ns0(Context context, String str) {
        Notification notification = new Notification();
        this.f5528s = notification;
        this.f5510a = context;
        this.f5526q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f5519j = 0;
        this.f5529t = new ArrayList();
        this.f5527r = true;
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m3584b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX INFO: renamed from: a */
    public final Notification m3585a() {
        Bundle bundle;
        f71 f71Var = new f71(this);
        ns0 ns0Var = (ns0) f71Var.f2336m;
        sq1 sq1Var = ns0Var.f5521l;
        if (sq1Var != null) {
            sq1Var.mo3289g(f71Var);
        }
        Notification notificationBuild = ((Notification.Builder) f71Var.f2335l).build();
        if (sq1Var != null) {
            ns0Var.f5521l.getClass();
        }
        if (sq1Var != null && (bundle = notificationBuild.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", sq1Var.mo3290h());
        }
        return notificationBuild;
    }

    /* JADX INFO: renamed from: c */
    public final void m3586c(boolean z) {
        Notification notification = this.f5528s;
        if (z) {
            notification.flags |= 16;
        } else {
            notification.flags &= -17;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3587d(sq1 sq1Var) {
        if (this.f5521l != sq1Var) {
            this.f5521l = sq1Var;
            if (((ns0) sq1Var.f7192j) != this) {
                sq1Var.f7192j = this;
                m3587d(sq1Var);
            }
        }
    }
}
