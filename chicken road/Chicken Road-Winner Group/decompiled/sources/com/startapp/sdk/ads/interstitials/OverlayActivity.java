package com.startapp.sdk.ads.interstitials;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import com.startapp.sdk.ads.video.c;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.components.a;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.hh;
import com.startapp.sdk.internal.og;
import com.startapp.sdk.internal.pg;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.t7;
import com.startapp.sdk.internal.u7;
import com.startapp.sdk.internal.u8;
import com.startapp.sdk.internal.vd;
import com.startapp.sdk.internal.wa;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class OverlayActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private u7 f2974a;

    /* renamed from: b, reason: collision with root package name */
    private Ad f2975b;

    @Override // android.app.Activity
    public final void finish() {
        u7 u7Var = this.f2974a;
        if (u7Var != null) {
            u7Var.h();
        }
        super.finish();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        u7 u7Var = this.f2974a;
        if (u7Var == null || !u7Var.c()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        u7 u7Var = this.f2974a;
        if (u7Var != null) {
            u7Var.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0171  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        u7 vdVar;
        u7 u7Var;
        long longExtra;
        long longExtra2;
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("placement", -1);
        int intExtra2 = getIntent().getIntExtra("ad", -1);
        if (intExtra2 <= 0) {
            finish();
            return;
        }
        Ad ad = (Ad) hh.a(intExtra2, Ad.class);
        this.f2975b = ad;
        if (ad == null) {
            finish();
            return;
        }
        if (intExtra >= 0) {
            pg pgVar = (pg) a.a(getApplicationContext()).f3364l.a();
            AdPreferences.Placement byIndex = AdPreferences.Placement.getByIndex(intExtra);
            String adId = this.f2975b.getAdId();
            if (adId != null) {
                pgVar.f4227a.put(new og(byIndex), adId);
            }
        }
        boolean booleanExtra = getIntent().getBooleanExtra("videoAd", false);
        requestWindowFeature(1);
        if (getIntent().getBooleanExtra("fullscreen", false) || booleanExtra) {
            getWindow().setFlags(1024, 1024);
        }
        if (this.f2975b == null) {
            finish();
        } else {
            int intExtra3 = getIntent().getIntExtra("placement", 0);
            Intent intent = getIntent();
            AdPreferences.Placement byIndex2 = AdPreferences.Placement.getByIndex(intExtra3);
            Ad ad2 = this.f2975b;
            switch (t7.f4364a[byIndex2.ordinal()]) {
                case 1:
                    WeakHashMap weakHashMap = si.f4343a;
                    vdVar = new vd();
                    vdVar.f4423a = this;
                    vdVar.f4428g = intent.getStringExtra("position");
                    vdVar.f4429h = intent.getStringArrayExtra("tracking");
                    vdVar.f4430i = intent.getStringArrayExtra("trackingClickUrl");
                    vdVar.f4431j = intent.getStringArrayExtra("packageNames");
                    vdVar.f4426d = intent.getStringArrayExtra("closingUrl");
                    vdVar.f4427e = intent.getBooleanArrayExtra("smartRedirect");
                    vdVar.f = intent.getBooleanArrayExtra("browserEnabled");
                    vdVar.f4435n = intent.getStringExtra("adTag");
                    vdVar.f4434m = (AdInformationOverrides) intent.getSerializableExtra("adInfoOverride");
                    vdVar.f4433l = byIndex2;
                    vdVar.f4426d = intent.getStringArrayExtra("closingUrl");
                    vdVar.f4438q = intent.getIntExtra("rewardDuration", 0);
                    vdVar.f4439r = intent.getBooleanExtra("rewardedHideTimer", false);
                    if (vdVar.f4427e == null) {
                        vdVar.f4427e = new boolean[]{true};
                    }
                    if (vdVar.f == null) {
                        vdVar.f = new boolean[]{true};
                    }
                    vdVar.f4432k = ad2;
                    longExtra = intent.getLongExtra("delayCloseInterval", -1L);
                    if (longExtra != -1) {
                        vdVar.f4440s = Long.valueOf(longExtra);
                    }
                    longExtra2 = intent.getLongExtra("delayImpressionSeconds", -1L);
                    if (longExtra2 != -1) {
                        vdVar.f4436o = Long.valueOf(longExtra2);
                    }
                    vdVar.f4437p = (Boolean[]) intent.getSerializableExtra("sendRedirectHops");
                    u7Var = vdVar;
                    break;
                case 2:
                    vdVar = intent.getBooleanExtra("videoAd", false) ? new c() : new wa();
                    vdVar.f4423a = this;
                    vdVar.f4428g = intent.getStringExtra("position");
                    vdVar.f4429h = intent.getStringArrayExtra("tracking");
                    vdVar.f4430i = intent.getStringArrayExtra("trackingClickUrl");
                    vdVar.f4431j = intent.getStringArrayExtra("packageNames");
                    vdVar.f4426d = intent.getStringArrayExtra("closingUrl");
                    vdVar.f4427e = intent.getBooleanArrayExtra("smartRedirect");
                    vdVar.f = intent.getBooleanArrayExtra("browserEnabled");
                    vdVar.f4435n = intent.getStringExtra("adTag");
                    vdVar.f4434m = (AdInformationOverrides) intent.getSerializableExtra("adInfoOverride");
                    vdVar.f4433l = byIndex2;
                    vdVar.f4426d = intent.getStringArrayExtra("closingUrl");
                    vdVar.f4438q = intent.getIntExtra("rewardDuration", 0);
                    vdVar.f4439r = intent.getBooleanExtra("rewardedHideTimer", false);
                    if (vdVar.f4427e == null) {
                    }
                    if (vdVar.f == null) {
                    }
                    vdVar.f4432k = ad2;
                    longExtra = intent.getLongExtra("delayCloseInterval", -1L);
                    if (longExtra != -1) {
                    }
                    longExtra2 = intent.getLongExtra("delayImpressionSeconds", -1L);
                    if (longExtra2 != -1) {
                    }
                    vdVar.f4437p = (Boolean[]) intent.getSerializableExtra("sendRedirectHops");
                    u7Var = vdVar;
                    break;
                case 5:
                case 6:
                    WeakHashMap weakHashMap2 = si.f4343a;
                    Uri data = intent.getData();
                    if (data != null) {
                        vdVar = new u8(data.toString());
                        vdVar.f4423a = this;
                        vdVar.f4428g = intent.getStringExtra("position");
                        vdVar.f4429h = intent.getStringArrayExtra("tracking");
                        vdVar.f4430i = intent.getStringArrayExtra("trackingClickUrl");
                        vdVar.f4431j = intent.getStringArrayExtra("packageNames");
                        vdVar.f4426d = intent.getStringArrayExtra("closingUrl");
                        vdVar.f4427e = intent.getBooleanArrayExtra("smartRedirect");
                        vdVar.f = intent.getBooleanArrayExtra("browserEnabled");
                        vdVar.f4435n = intent.getStringExtra("adTag");
                        vdVar.f4434m = (AdInformationOverrides) intent.getSerializableExtra("adInfoOverride");
                        vdVar.f4433l = byIndex2;
                        vdVar.f4426d = intent.getStringArrayExtra("closingUrl");
                        vdVar.f4438q = intent.getIntExtra("rewardDuration", 0);
                        vdVar.f4439r = intent.getBooleanExtra("rewardedHideTimer", false);
                        if (vdVar.f4427e == null) {
                        }
                        if (vdVar.f == null) {
                        }
                        vdVar.f4432k = ad2;
                        longExtra = intent.getLongExtra("delayCloseInterval", -1L);
                        if (longExtra != -1) {
                        }
                        longExtra2 = intent.getLongExtra("delayImpressionSeconds", -1L);
                        if (longExtra2 != -1) {
                        }
                        vdVar.f4437p = (Boolean[]) intent.getSerializableExtra("sendRedirectHops");
                        u7Var = vdVar;
                        break;
                    }
                    break;
                case 3:
                case 4:
                    u7Var = null;
                    break;
                default:
                    vdVar = new wa();
                    vdVar.f4423a = this;
                    vdVar.f4428g = intent.getStringExtra("position");
                    vdVar.f4429h = intent.getStringArrayExtra("tracking");
                    vdVar.f4430i = intent.getStringArrayExtra("trackingClickUrl");
                    vdVar.f4431j = intent.getStringArrayExtra("packageNames");
                    vdVar.f4426d = intent.getStringArrayExtra("closingUrl");
                    vdVar.f4427e = intent.getBooleanArrayExtra("smartRedirect");
                    vdVar.f = intent.getBooleanArrayExtra("browserEnabled");
                    vdVar.f4435n = intent.getStringExtra("adTag");
                    vdVar.f4434m = (AdInformationOverrides) intent.getSerializableExtra("adInfoOverride");
                    vdVar.f4433l = byIndex2;
                    vdVar.f4426d = intent.getStringArrayExtra("closingUrl");
                    vdVar.f4438q = intent.getIntExtra("rewardDuration", 0);
                    vdVar.f4439r = intent.getBooleanExtra("rewardedHideTimer", false);
                    if (vdVar.f4427e == null) {
                    }
                    if (vdVar.f == null) {
                    }
                    vdVar.f4432k = ad2;
                    longExtra = intent.getLongExtra("delayCloseInterval", -1L);
                    if (longExtra != -1) {
                    }
                    longExtra2 = intent.getLongExtra("delayImpressionSeconds", -1L);
                    if (longExtra2 != -1) {
                    }
                    vdVar.f4437p = (Boolean[]) intent.getSerializableExtra("sendRedirectHops");
                    u7Var = vdVar;
                    break;
            }
            this.f2974a = u7Var;
            if (u7Var == null) {
                finish();
            }
        }
        u7 u7Var2 = this.f2974a;
        if (u7Var2 != null) {
            u7Var2.a(bundle);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        u7 u7Var = this.f2974a;
        if (u7Var != null) {
            u7Var.e();
            this.f2974a = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        u7 u7Var = this.f2974a;
        if (u7Var == null || u7Var.a(i3, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i3, keyEvent);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        u7 u7Var = this.f2974a;
        if (u7Var != null) {
            u7Var.f();
        }
        g0.d(this);
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        u7 u7Var = this.f2974a;
        if (u7Var != null) {
            u7Var.g();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        u7 u7Var = this.f2974a;
        if (u7Var != null) {
            u7Var.b(bundle);
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
    }
}
