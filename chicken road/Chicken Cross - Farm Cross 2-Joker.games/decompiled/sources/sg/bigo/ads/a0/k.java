package sg.bigo.ads.a0;

import android.app.Activity;
import android.content.Intent;
import sg.bigo.ads.api.AdActivity;

/* loaded from: classes3.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f12675a;
    public final /* synthetic */ l b;

    public k(l lVar, m mVar) {
        this.b = lVar;
        this.f12675a = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Intent intent;
        m mVar = this.f12675a;
        Activity activity = this.b.f12676a;
        sg.bigo.ads.e.h hVar = (sg.bigo.ads.e.h) mVar;
        hVar.getClass();
        if (activity != null && (activity instanceof AdActivity) && (intent = activity.getIntent()) != null && intent.getIntExtra("ad_identifier", -1) == hVar.hashCode() && intent.getBooleanExtra("create_error_flag", false)) {
            String stringExtra = intent.getStringExtra("create_error_msg");
            hVar.b(2005, 0, "Activity create error");
            sg.bigo.ads.s1.b.a(3000, 10117, stringExtra, hVar.e());
        }
    }
}
