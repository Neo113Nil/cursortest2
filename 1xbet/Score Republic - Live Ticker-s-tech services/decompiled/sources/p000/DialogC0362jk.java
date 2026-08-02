package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0030a;
import live.football.scorerepublic.R;

/* JADX INFO: renamed from: jk */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class DialogC0362jk extends Dialog implements yh0, x41 {

    /* JADX INFO: renamed from: j */
    public C0030a f3949j;

    /* JADX INFO: renamed from: k */
    public final m81 f3950k;

    /* JADX INFO: renamed from: l */
    public final jc1 f3951l;

    /* JADX INFO: renamed from: m */
    public final jc1 f3952m;

    public DialogC0362jk(Context context, int i) {
        super(context, i);
        this.f3950k = new m81((x41) this);
        this.f3951l = new jc1(new C0325ik(0, this));
        this.f3952m = new jc1(new C0325ik(1, this));
    }

    /* JADX INFO: renamed from: b */
    public static void m2917b(DialogC0362jk dialogC0362jk) {
        super.onBackPressed();
    }

    @Override // p000.x41
    /* JADX INFO: renamed from: a */
    public final C0086c5 mo859a() {
        return (C0086c5) this.f3950k.f5011m;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        m2919e();
        super.addContentView(view, layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public final gu0 m2918c() {
        return (gu0) this.f3952m.m2847a();
    }

    @Override // p000.yh0
    /* JADX INFO: renamed from: d */
    public final C0030a mo862d() {
        C0030a c0030a = this.f3949j;
        if (c0030a != null) {
            return c0030a;
        }
        C0030a c0030a2 = new C0030a(this);
        this.f3949j = c0030a2;
        return c0030a2;
    }

    /* JADX INFO: renamed from: e */
    public final void m2919e() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((C0149dt) this.f3951l.m2847a()).m3288a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            gu0 gu0VarM2918c = m2918c();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            gu0VarM2918c.m2153c(onBackInvokedDispatcher);
        }
        this.f3950k.m3358g(bundle);
        C0030a c0030a = this.f3949j;
        if (c0030a == null) {
            c0030a = new C0030a(this);
            this.f3949j = c0030a;
        }
        c0030a.m440d(ph0.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.f3950k.m3359h(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0030a c0030a = this.f3949j;
        if (c0030a == null) {
            c0030a = new C0030a(this);
            this.f3949j = c0030a;
        }
        c0030a.m440d(ph0.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C0030a c0030a = this.f3949j;
        if (c0030a == null) {
            c0030a = new C0030a(this);
            this.f3949j = c0030a;
        }
        c0030a.m440d(ph0.ON_DESTROY);
        this.f3949j = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        m2919e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m2919e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        m2919e();
        super.setContentView(view, layoutParams);
    }
}
