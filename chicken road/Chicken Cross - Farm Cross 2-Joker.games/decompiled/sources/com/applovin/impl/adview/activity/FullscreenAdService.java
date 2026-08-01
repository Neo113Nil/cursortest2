package com.applovin.impl.adview.activity;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.r2;
import com.applovin.impl.sdk.p;
import com.applovin.impl.t7;
import com.applovin.impl.x2;

/* loaded from: classes5.dex */
public class FullscreenAdService extends Service {
    public static final String DATA_KEY_RAW_FULL_AD_RESPONSE = "raw_full_ad_response";
    private static final String TAG = "FullscreenAdService";

    private static class b extends Handler {
        private b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                r2 r2Var = AppLovinFullscreenActivity.parentInterstitialWrapper;
                if (r2Var == null) {
                    if (t7.a(1.0d)) {
                        throw new RuntimeException("parentWrapper is null for " + message.what);
                    }
                    super.handleMessage(message);
                    return;
                }
                com.applovin.impl.sdk.ad.b f = r2Var.f();
                int i = message.what;
                c cVar = c.AD;
                if (i == cVar.b()) {
                    Bundle bundle = new Bundle();
                    bundle.putString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE, f.getRawFullResponse());
                    Message obtain = Message.obtain((Handler) null, cVar.b());
                    obtain.setData(bundle);
                    try {
                        message.replyTo.send(obtain);
                        return;
                    } catch (RemoteException e) {
                        p.c(FullscreenAdService.TAG, "Failed to respond to Fullscreen Activity in another process with ad", e);
                        return;
                    }
                }
                if (message.what == c.AD_DISPLAYED.b()) {
                    x2.a(r2Var.c(), f);
                    return;
                }
                if (message.what == c.AD_CLICKED.b()) {
                    x2.a(r2Var.b(), f);
                    return;
                }
                if (message.what == c.AD_VIDEO_STARTED.b()) {
                    x2.a(r2Var.d(), f);
                    return;
                }
                if (message.what == c.AD_VIDEO_ENDED.b()) {
                    Bundle data = message.getData();
                    x2.a(r2Var.d(), f, data.getDouble("percent_viewed"), data.getBoolean("fully_watched"));
                    return;
                }
                if (message.what == c.AD_HIDDEN.b()) {
                    x2.b(r2Var.c(), f);
                } else {
                    super.handleMessage(message);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public enum c {
        AD(0),
        AD_DISPLAYED(1),
        AD_CLICKED(2),
        AD_VIDEO_STARTED(3),
        AD_VIDEO_ENDED(4),
        AD_HIDDEN(5);


        /* renamed from: a, reason: collision with root package name */
        private final int f4123a;

        c(int i) {
            this.f4123a = i;
        }

        public int b() {
            return this.f4123a;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new Messenger(new b()).getBinder();
    }
}
