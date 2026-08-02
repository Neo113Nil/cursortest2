package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.S;
import java.util.Set;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* renamed from: com.facebook.internal.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0706b extends BroadcastReceiver {
    public static final a Companion = new a();
    public static C0706b b;
    public final Context a;

    /* renamed from: com.facebook.internal.b$a */
    public static final class a {
        @JvmStatic
        public static void a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (C0706b.a() != null) {
                C0706b.a();
                return;
            }
            C0706b c0706b = new C0706b(context);
            if (!com.facebook.internal.instrument.crashshield.a.b(C0706b.class)) {
                try {
                    if (!com.facebook.internal.instrument.crashshield.a.b(c0706b)) {
                        try {
                            LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(c0706b.a);
                            Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(applicationContext)");
                            localBroadcastManager.registerReceiver(c0706b, new IntentFilter("com.parse.bolts.measurement_event"));
                        } catch (Throwable th) {
                            com.facebook.internal.instrument.crashshield.a.a(th, c0706b);
                        }
                    }
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.a.a(th2, C0706b.class);
                }
            }
            if (!com.facebook.internal.instrument.crashshield.a.b(C0706b.class)) {
                try {
                    C0706b.b = c0706b;
                } catch (Throwable th3) {
                    com.facebook.internal.instrument.crashshield.a.a(th3, C0706b.class);
                }
            }
            C0706b.a();
        }
    }

    public C0706b(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.a = applicationContext;
    }

    public static final /* synthetic */ C0706b a() {
        if (com.facebook.internal.instrument.crashshield.a.b(C0706b.class)) {
            return null;
        }
        try {
            return b;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, C0706b.class);
            return null;
        }
    }

    public final void finalize() throws Throwable {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                try {
                    LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.a);
                    Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(applicationContext)");
                    localBroadcastManager.unregisterReceiver(this);
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, this);
                }
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            com.facebook.appevents.p loggerImpl = new com.facebook.appevents.p(context, (String) null);
            Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
            StringBuilder sb = new StringBuilder("bf_");
            sb.append(intent != null ? intent.getStringExtra("event_name") : null);
            String sb2 = sb.toString();
            Bundle bundleExtra = intent != null ? intent.getBundleExtra("event_args") : null;
            Bundle bundle = new Bundle();
            Set<String> keySet = bundleExtra != null ? bundleExtra.keySet() : null;
            if (keySet != null) {
                for (String key : keySet) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    bundle.putString(new Regex("[ -]*$").replace(new Regex("^[ -]*").replace(new Regex("[^0-9a-zA-Z _-]").replace(key, "-"), ""), ""), (String) bundleExtra.get(key));
                }
            }
            com.facebook.w wVar = com.facebook.w.a;
            if (S.c()) {
                loggerImpl.e(sb2, bundle);
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }
}
