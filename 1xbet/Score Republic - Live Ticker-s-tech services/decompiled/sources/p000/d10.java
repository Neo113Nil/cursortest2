package p000;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.WindowManager;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class d10 implements FirebaseInAppMessagingDisplay, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: j */
    public final x00 f1507j;

    /* JADX INFO: renamed from: k */
    public final Map f1508k;

    /* JADX INFO: renamed from: l */
    public final C0784uz f1509l;

    /* JADX INFO: renamed from: m */
    public final an0 f1510m;

    /* JADX INFO: renamed from: n */
    public final an0 f1511n;

    /* JADX INFO: renamed from: o */
    public final C0858wz f1512o;

    /* JADX INFO: renamed from: p */
    public final C0093cc f1513p;

    /* JADX INFO: renamed from: q */
    public final Application f1514q;

    /* JADX INFO: renamed from: r */
    public final C0710sz f1515r;

    /* JADX INFO: renamed from: s */
    public zc0 f1516s;

    /* JADX INFO: renamed from: t */
    public g10 f1517t;

    /* JADX INFO: renamed from: u */
    public String f1518u;

    public d10(x00 x00Var, Map map, C0784uz c0784uz, an0 an0Var, an0 an0Var2, C0858wz c0858wz, Application application, C0093cc c0093cc, C0710sz c0710sz) {
        this.f1507j = x00Var;
        this.f1508k = map;
        this.f1509l = c0784uz;
        this.f1510m = an0Var;
        this.f1511n = an0Var2;
        this.f1512o = c0858wz;
        this.f1514q = application;
        this.f1513p = c0093cc;
        this.f1515r = c0710sz;
    }

    /* JADX INFO: renamed from: a */
    public final void m1077a(Activity activity) {
        m80.m3343j("Pausing activity: ".concat(activity.getClass().getName()));
    }

    /* JADX INFO: renamed from: b */
    public final void m1078b(Activity activity) {
        m80.m3343j("Resumed activity: ".concat(activity.getClass().getName()));
    }

    /* JADX INFO: renamed from: c */
    public final void m1079c(Activity activity) {
        AbstractC0057bc abstractC0057bc = this.f1512o.f8722a;
        if (abstractC0057bc == null ? false : abstractC0057bc.mo632d().isShown()) {
            C0784uz c0784uz = this.f1509l;
            Class<?> cls = activity.getClass();
            c0784uz.getClass();
            String simpleName = cls.getSimpleName();
            synchronized (simpleName) {
                try {
                    if (c0784uz.f7971b.containsKey(simpleName)) {
                        for (AbstractC0846wn abstractC0846wn : (Set) c0784uz.f7971b.get(simpleName)) {
                            if (abstractC0846wn != null) {
                                c0784uz.f7970a.m3461d(abstractC0846wn);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C0858wz c0858wz = this.f1512o;
            AbstractC0057bc abstractC0057bc2 = c0858wz.f8722a;
            if (abstractC0057bc2 != null ? abstractC0057bc2.mo632d().isShown() : false) {
                ((WindowManager) activity.getSystemService("window")).removeViewImmediate(c0858wz.f8722a.mo632d());
                c0858wz.f8722a = null;
            }
            an0 an0Var = this.f1510m;
            CountDownTimer countDownTimer = (CountDownTimer) an0Var.f254k;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                an0Var.f254k = null;
            }
            an0 an0Var2 = this.f1511n;
            CountDownTimer countDownTimer2 = (CountDownTimer) an0Var2.f254k;
            if (countDownTimer2 != null) {
                countDownTimer2.cancel();
                an0Var2.f254k = null;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1080d(Activity activity) {
        Object obj;
        zc0 zc0Var = this.f1516s;
        if (zc0Var == null) {
            m80.m3346m("No active message found to render");
            return;
        }
        this.f1507j.getClass();
        if (zc0Var.f9732a.equals(MessageType.UNSUPPORTED)) {
            m80.m3346m("The message being triggered is not supported by this version of the sdk.");
            return;
        }
        MessageType messageType = this.f1516s.f9732a;
        int i = 2;
        String str = null;
        if (this.f1514q.getResources().getConfiguration().orientation == 1) {
            int i2 = od0.f5701a[messageType.ordinal()];
            if (i2 == 1) {
                str = "MODAL_PORTRAIT";
            } else if (i2 == 2) {
                str = "CARD_PORTRAIT";
            } else if (i2 == 3) {
                str = "IMAGE_ONLY_PORTRAIT";
            } else if (i2 == 4) {
                str = "BANNER_PORTRAIT";
            }
        } else {
            int i3 = od0.f5701a[messageType.ordinal()];
            if (i3 == 1) {
                str = "MODAL_LANDSCAPE";
            } else if (i3 == 2) {
                str = "CARD_LANDSCAPE";
            } else if (i3 == 3) {
                str = "IMAGE_ONLY_LANDSCAPE";
            } else if (i3 == 4) {
                str = "BANNER_LANDSCAPE";
            }
        }
        ad0 ad0Var = (ad0) ((ny0) this.f1508k.get(str)).get();
        int i4 = c10.f1065a[this.f1516s.f9732a.ordinal()];
        int i5 = 0;
        C0093cc c0093cc = this.f1513p;
        if (i4 == 1) {
            zc0 zc0Var2 = this.f1516s;
            nu1 nu1Var = new nu1(12);
            nu1Var.f5551k = new qd0(zc0Var2, ad0Var, c0093cc.f1214a, i5);
            obj = (C0056bb) ((ly0) nu1Var.m3590a().f5767f).get();
        } else if (i4 == 2) {
            zc0 zc0Var3 = this.f1516s;
            nu1 nu1Var2 = new nu1(12);
            nu1Var2.f5551k = new qd0(zc0Var3, ad0Var, c0093cc.f1214a, i5);
            obj = (cq0) ((ly0) nu1Var2.m3590a().f5766e).get();
        } else if (i4 == 3) {
            zc0 zc0Var4 = this.f1516s;
            nu1 nu1Var3 = new nu1(12);
            nu1Var3.f5551k = new qd0(zc0Var4, ad0Var, c0093cc.f1214a, i5);
            obj = (bc0) ((ly0) nu1Var3.m3590a().f5765d).get();
        } else {
            if (i4 != 4) {
                m80.m3346m("No bindings found for this message type");
                return;
            }
            zc0 zc0Var5 = this.f1516s;
            nu1 nu1Var4 = new nu1(12);
            nu1Var4.f5551k = new qd0(zc0Var5, ad0Var, c0093cc.f1214a, i5);
            obj = (C0209ff) ((ly0) nu1Var4.m3590a().f5768g).get();
        }
        activity.findViewById(R.id.content).post(new RunnableC0702sr(this, activity, obj, i));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m80.m3343j("Created activity: ".concat(activity.getClass().getName()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m80.m3343j("Destroyed activity: ".concat(activity.getClass().getName()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        String str = this.f1518u;
        x00 x00Var = this.f1507j;
        if (str != null && str.equals(activity.getLocalClassName())) {
            m80.m3347n("Unbinding from activity: " + activity.getLocalClassName());
            x00Var.getClass();
            n80.m3497f("Removing display event component");
            x00Var.f8732c = null;
            m1079c(activity);
            this.f1518u = null;
        }
        C0666rs c0666rs = x00Var.f8731b;
        c0666rs.f6946a.clear();
        c0666rs.f6949d.clear();
        c0666rs.f6948c.clear();
        c0666rs.f6947b.clear();
        m1077a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m1078b(activity);
        String str = this.f1518u;
        if (str == null || !str.equals(activity.getLocalClassName())) {
            m80.m3347n("Binding to activity: " + activity.getLocalClassName());
            C0615qe c0615qe = new C0615qe(5, this, activity);
            x00 x00Var = this.f1507j;
            x00Var.getClass();
            n80.m3497f("Setting display event component");
            x00Var.f8732c = c0615qe;
            this.f1518u = activity.getLocalClassName();
        }
        if (this.f1516s != null) {
            m1080d(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m80.m3343j("SavedInstance activity: ".concat(activity.getClass().getName()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m80.m3343j("Started activity: ".concat(activity.getClass().getName()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m80.m3343j("Stopped activity: ".concat(activity.getClass().getName()));
    }

    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay
    public final void displayMessage(zc0 zc0Var, g10 g10Var) {
    }
}
