package p000;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class z00 implements View.OnClickListener {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0047b2 f9558j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Activity f9559k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ d10 f9560l;

    public z00(d10 d10Var, C0047b2 c0047b2, Activity activity) {
        this.f9560l = d10Var;
        this.f9558j = c0047b2;
        this.f9559k = activity;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c3  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent intent;
        ResolveInfo resolveInfoResolveActivity;
        String scheme;
        C0047b2 c0047b2 = this.f9558j;
        String str = c0047b2.f684a;
        d10 d10Var = this.f9560l;
        int i = 0;
        if (d10Var.f1517t != null) {
            m80.m3347n("Calling callback for click action");
            C0963zt c0963zt = (C0963zt) d10Var.f1517t;
            if (!c0963zt.f9948g.m2543n()) {
                c0963zt.m6034c("message click to metrics logger");
            } else if (str == null) {
                c0963zt.m6036f(e10.f1899l);
            } else {
                n80.m3496e("Attempting to record: message click to metrics logger");
                C0398kj c0398kj = new C0398kj(i, new C0926yt(c0963zt, c0047b2));
                if (!c0963zt.f9951j) {
                    c0963zt.m6033b();
                }
                C0963zt.m6031e(c0398kj.m1876e(), c0963zt.f9944c.f5991a);
            }
        }
        Uri uri = Uri.parse(str);
        Activity activity = this.f9559k;
        if (uri == null || (scheme = uri.getScheme()) == null || (!scheme.equalsIgnoreCase("http") && !scheme.equalsIgnoreCase("https"))) {
            intent = new Intent("android.intent.action.VIEW", uri);
            resolveInfoResolveActivity = activity.getPackageManager().resolveActivity(intent, 0);
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            if (resolveInfoResolveActivity != null) {
                activity.startActivity(intent);
            } else {
                m80.m3346m("Device cannot resolve intent for: android.intent.action.VIEW");
            }
        } else {
            Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage("com.android.chrome");
            List<ResolveInfo> listQueryIntentServices = activity.getPackageManager().queryIntentServices(intent2, 0);
            if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                intent = new Intent("android.intent.action.VIEW", uri);
                resolveInfoResolveActivity = activity.getPackageManager().resolveActivity(intent, 0);
                intent.addFlags(1073741824);
                intent.addFlags(268435456);
                if (resolveInfoResolveActivity != null) {
                    activity.startActivity(intent);
                } else {
                    m80.m3346m("Device cannot resolve intent for: android.intent.action.VIEW");
                }
            } else {
                C0312i6 c0312i6M5176g = new C0809vn().m5176g();
                Intent intent3 = (Intent) c0312i6M5176g.f3447k;
                intent3.addFlags(1073741824);
                intent3.addFlags(268435456);
                intent3.setData(uri);
                activity.startActivity(intent3, (Bundle) c0312i6M5176g.f3448l);
            }
        }
        d10Var.m1079c(activity);
        d10Var.f1516s = null;
        d10Var.f1517t = null;
    }
}
