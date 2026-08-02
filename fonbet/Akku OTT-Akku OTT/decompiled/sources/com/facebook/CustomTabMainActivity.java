package com.facebook;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.internal.C0708d;
import com.facebook.internal.q;
import com.facebook.login.A;
import com.facebook.login.C0721c;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/facebook/CustomTabMainActivity;", "Landroid/app/Activity;", "<init>", "()V", "Companion", "a", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomTabMainActivity extends Activity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public boolean a = true;
    public c b;

    /* renamed from: com.facebook.CustomTabMainActivity$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.facebook.login.A.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            CustomTabMainActivity customTabMainActivity = CustomTabMainActivity.this;
            Intent intent2 = new Intent(customTabMainActivity, (Class<?>) CustomTabMainActivity.class);
            Companion companion = CustomTabMainActivity.INSTANCE;
            intent2.setAction("CustomTabMainActivity.action_refresh");
            intent2.putExtra("CustomTabMainActivity.extra_url", intent.getStringExtra("CustomTabMainActivity.extra_url"));
            intent2.addFlags(603979776);
            customTabMainActivity.startActivity(intent2);
        }
    }

    public final void a(int i, Intent intent) {
        Bundle bundle;
        c cVar = this.b;
        if (cVar != null) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(cVar);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
            if (stringExtra != null) {
                INSTANCE.getClass();
                Uri parse = Uri.parse(stringExtra);
                bundle = com.facebook.internal.E.E(parse.getQuery());
                bundle.putAll(com.facebook.internal.E.E(parse.getFragment()));
            } else {
                bundle = new Bundle();
            }
            Intent intent2 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "intent");
            Intent f = com.facebook.internal.w.f(intent2, bundle, null);
            if (f != null) {
                intent = f;
            }
            setResult(i, intent);
        } else {
            Intent intent3 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent3, "intent");
            setResult(i, com.facebook.internal.w.f(intent3, null, null));
        }
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        String action;
        com.facebook.login.A a;
        C0708d c0708d;
        boolean z;
        super.onCreate(bundle);
        if (Intrinsics.areEqual("CustomTabActivity.action_customTabRedirect", getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle != null || (action = getIntent().getStringExtra("CustomTabMainActivity.extra_action")) == null) {
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra("CustomTabMainActivity.extra_params");
        String stringExtra = getIntent().getStringExtra("CustomTabMainActivity.extra_chromePackage");
        A.a aVar = com.facebook.login.A.Companion;
        String stringExtra2 = getIntent().getStringExtra("CustomTabMainActivity.extra_targetApp");
        aVar.getClass();
        com.facebook.login.A[] values = com.facebook.login.A.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                a = com.facebook.login.A.FACEBOOK;
                break;
            }
            a = values[i];
            if (Intrinsics.areEqual(a.a, stringExtra2)) {
                break;
            } else {
                i++;
            }
        }
        if (b.$EnumSwitchMapping$0[a.ordinal()] == 1) {
            Intrinsics.checkNotNullParameter(action, "action");
            c0708d = new com.facebook.internal.q(action, bundleExtra);
            if (bundleExtra == null) {
                bundleExtra = new Bundle();
            }
            com.facebook.internal.q.Companion.getClass();
            Uri a2 = q.a.a(bundleExtra, action);
            if (!com.facebook.internal.instrument.crashshield.a.b(c0708d)) {
                try {
                    Intrinsics.checkNotNullParameter(a2, "<set-?>");
                    c0708d.a = a2;
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, c0708d);
                }
            }
        } else {
            c0708d = new C0708d(action, bundleExtra);
        }
        if (!com.facebook.internal.instrument.crashshield.a.b(c0708d)) {
            try {
                Intrinsics.checkNotNullParameter(this, "activity");
                C0721c.Companion.getClass();
                ReentrantLock reentrantLock = C0721c.c;
                reentrantLock.lock();
                CustomTabsSession customTabsSession = C0721c.b;
                C0721c.b = null;
                reentrantLock.unlock();
                CustomTabsIntent build = new CustomTabsIntent.Builder(customTabsSession).build();
                build.intent.setPackage(stringExtra);
                try {
                    build.launchUrl(this, c0708d.a);
                    z = true;
                } catch (ActivityNotFoundException unused) {
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.a.a(th2, c0708d);
            }
            this.a = false;
            if (z) {
                setResult(0, getIntent().putExtra("CustomTabMainActivity.no_activity_exception", true));
                finish();
                return;
            } else {
                c cVar = new c();
                this.b = cVar;
                LocalBroadcastManager.getInstance(this).registerReceiver(cVar, new IntentFilter("CustomTabActivity.action_customTabRedirect"));
                return;
            }
        }
        z = false;
        this.a = false;
        if (z) {
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        if (Intrinsics.areEqual("CustomTabMainActivity.action_refresh", intent.getAction())) {
            LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent("CustomTabActivity.action_destroy"));
            a(-1, intent);
        } else if (Intrinsics.areEqual("CustomTabActivity.action_customTabRedirect", intent.getAction())) {
            a(-1, intent);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.a) {
            a(0, null);
        }
        this.a = true;
    }
}
