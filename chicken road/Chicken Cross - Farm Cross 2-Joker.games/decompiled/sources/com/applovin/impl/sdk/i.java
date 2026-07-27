package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.applovin.impl.c5;
import com.applovin.impl.h2;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.t7;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class i implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final l f4468a;
    private final AtomicReference b;
    private final Handler c;
    private final Handler d;
    private final AtomicLong e = new AtomicLong(0);
    private long f;
    private long g;
    private long h;

    private enum b {
        INELIGIBLE,
        IDLE,
        MONITORING
    }

    private class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (i.this.b.get() != b.MONITORING) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - i.this.e.get();
            if (currentTimeMillis >= 0 && currentTimeMillis <= i.this.f) {
                i.this.d.postDelayed(this, i.this.h);
                return;
            }
            i.this.b.set(b.INELIGIBLE);
            AppLovinBroadcastManager.unregisterReceiver(i.this);
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            if (stackTrace.length > 0) {
                StackTraceElement stackTraceElement = stackTrace[0];
                str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str = "None";
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - l.o());
            HashMap hashMap = new HashMap(3);
            hashMap.put("top_main_method", str);
            hashMap.put("source", i.this.f4468a.B0() ? "non_first_session" : "first_session");
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "seconds_since_app_launch", String.valueOf(seconds));
            List a2 = i.this.f4468a.h().a();
            if (!CollectionUtils.isEmpty(a2)) {
                JsonUtils.putJsonArray(jSONObject, "ad_info", new JSONArray((Collection) a2));
            }
            hashMap.put("details", jSONObject.toString());
            i.this.f4468a.E().d(h2.R0, hashMap);
        }
    }

    private class d implements Runnable {
        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (i.this.b.get() != b.MONITORING) {
                return;
            }
            i.this.e.set(System.currentTimeMillis());
            i.this.c.postDelayed(this, i.this.g);
        }
    }

    public i(l lVar) {
        this.f4468a = lVar;
        this.b = new AtomicReference(!t7.c(lVar) ? b.IDLE : b.INELIGIBLE);
        this.c = new Handler(l.p().getMainLooper());
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:anr_detector");
        handlerThread.start();
        this.d = new Handler(handlerThread.getLooper());
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            b();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    private void b() {
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.b, b.MONITORING, b.IDLE)) {
            this.c.removeCallbacksAndMessages(null);
            this.d.removeCallbacksAndMessages(null);
        }
        this.f4468a.h().b(this);
    }

    private void c() {
        if (this.f4468a.o0().getCurrentApplicationState() == SessionTracker.e.PAUSED) {
            return;
        }
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.b, b.IDLE, b.MONITORING)) {
            this.c.post(new d());
            this.d.postDelayed(new c(), this.h / 2);
        }
        this.f4468a.h().a(this);
    }

    private void d() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f = ((Long) this.f4468a.a(c5.m6)).longValue();
        this.g = ((Long) this.f4468a.a(c5.n6)).longValue();
        this.h = ((Long) this.f4468a.a(c5.o6)).longValue();
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void a() {
        if (this.b.get() == b.INELIGIBLE) {
            return;
        }
        if (!((Boolean) this.f4468a.a(c5.l6)).booleanValue()) {
            b();
        } else {
            d();
            c();
        }
    }
}
