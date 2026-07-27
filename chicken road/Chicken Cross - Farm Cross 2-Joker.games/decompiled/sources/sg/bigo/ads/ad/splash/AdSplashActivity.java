package sg.bigo.ads.ad.splash;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.adjust.sdk.Constants;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.C.l;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.L.C4967a;
import sg.bigo.ads.L.N;
import sg.bigo.ads.P.e;
import sg.bigo.ads.Y0.D;
import sg.bigo.ads.e.h;

/* loaded from: classes3.dex */
public class AdSplashActivity extends Activity {
    public static final HashMap c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public N f12683a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        try {
            if (this.f12683a == null || !this.b.compareAndSet(false, true)) {
                return;
            }
            this.f12683a.W.onAdClosed();
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
            Window window = getWindow();
            if (window != null) {
                window.setFlags(1024, 1024);
            }
            Intent intent = getIntent();
            if (intent == null) {
                finish();
                return;
            }
            int intExtra = intent.getIntExtra("splash_hash", -1);
            HashMap hashMap = c;
            N n = (N) hashMap.get(Integer.valueOf(intExtra));
            if (n == null) {
                finish();
                return;
            }
            hashMap.remove(Integer.valueOf(intExtra));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(-1);
            setContentView(frameLayout);
            this.f12683a = n;
            n.W.b = new C4967a(this);
            n.a(frameLayout, this);
            N n2 = this.f12683a;
            if (n2 != null) {
                n2.W.onAdOpened();
            }
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        try {
            if (this.f12683a != null && this.b.compareAndSet(false, true)) {
                this.f12683a.W.onAdClosed();
            }
            N n = this.f12683a;
            if (n != null) {
                n.destroy();
                this.f12683a = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        N n = this.f12683a;
        if (n == null || !n.isSkippable()) {
            return true;
        }
        this.f12683a.c(8);
        return true;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        l lVar = this.f12683a.U;
        if (lVar != null) {
            D.a((Activity) this, (h) lVar);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        View decorView;
        super.onResume();
        try {
            Window window = getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                decorView.setSystemUiVisibility(4098);
            }
            l lVar = this.f12683a.U;
            e eVar = lVar.I;
            if (eVar == null || eVar.f12477a != 4 || eVar.d) {
                return;
            }
            eVar.d = true;
            D.a((Activity) this, (h) lVar);
            String str = eVar.b;
            String packageName = getPackageName();
            String str2 = eVar.c;
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage("com.android.vending");
                intent.setData(Uri.parse("https://play.google.com/d?id=" + str));
                intent.putExtra("overlay", true);
                intent.putExtra("callerId", packageName);
                if (!I.a((CharSequence) str2)) {
                    intent.putExtra(Constants.REFERRER, str2);
                }
                startActivityForResult(intent, 0);
            } catch (Throwable th) {
                th.getMessage();
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
