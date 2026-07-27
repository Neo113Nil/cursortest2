package com.unity3d.ironsourceads.internal.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.C4491k4;
import com.ironsource.C4689v5;
import com.ironsource.EnumC4514l9;
import com.ironsource.EnumC4707w5;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4433h;
import com.ironsource.O9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.utils.Logger;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class InlineStoreActivity extends Activity {
    private static final String c = "InlineStoreActivity";
    private static final int d = 1001;

    /* renamed from: a, reason: collision with root package name */
    private v f11659a;
    private boolean b = false;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        static final String f11660a = "inline_store_intent";
        static final String b = "destroy_inline_store";

        private a() {
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC4433h f11661a;
        private Intent b;

        public b(InterfaceC4433h interfaceC4433h) {
            this.f11661a = interfaceC4433h;
        }

        public b a(Intent intent) {
            this.b = intent;
            return this;
        }

        public Intent a(Context context) {
            Intent a2 = this.f11661a.a(context);
            a2.putExtra("inline_store_intent", this.b);
            return a2;
        }
    }

    private void a() {
        getWindow().setFlags(1024, 1024);
    }

    private void b() {
        requestWindowFeature(1);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            v vVar = this.f11659a;
            if (vVar != null) {
                vVar.a(i2, this.b);
            }
            Map<String, Object> hashMap = new HashMap<>();
            String str = "resultCode:" + i2;
            if (this.b) {
                str = str + ",destroyCalled:true";
            }
            hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
            a(EnumC4707w5.INLINE_STORE_CLOSED, hashMap);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(c, "onCreate()");
        try {
            this.f11659a = (v) O9.b((Context) this).a().k();
            b();
            a();
            a((Intent) getIntent().getExtras().getParcelable("inline_store_intent"));
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            v vVar = this.f11659a;
            if (vVar != null) {
                vVar.j(e.toString());
            }
            a(EnumC4707w5.INLINE_STORE_ACTIVITY_FAILED, (Map<String, Object>) null);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        v vVar = this.f11659a;
        if (vVar != null) {
            vVar.a(true, "inlineStoreClose");
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.hasExtra("destroy_inline_store")) {
            IronLog.INTERNAL.verbose("onNewIntent() - destroy inline store request detected");
            this.b = true;
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        v vVar = this.f11659a;
        if (vVar != null) {
            vVar.a(false, "inlineStoreOpen");
        }
    }

    private void a(Intent intent) {
        startActivityForResult(intent, 1001);
        v vVar = this.f11659a;
        if (vVar != null) {
            vVar.z();
        }
        a(EnumC4707w5.INLINE_STORE_LAUNCHED, (Map<String, Object>) null);
    }

    private void a(final EnumC4707w5 enumC4707w5, final Map<String, Object> map) {
        new Thread(new Runnable() { // from class: com.unity3d.ironsourceads.internal.services.InlineStoreActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                InlineStoreActivity.a(map, enumC4707w5);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Map map, EnumC4707w5 enumC4707w5) {
        try {
            HashMap hashMap = map != null ? new HashMap(map) : new HashMap();
            String str = "strategy:" + EnumC4514l9.APP_ACTIVITY.b();
            Object obj = hashMap.get(IronSourceConstants.EVENTS_EXT1);
            if ((obj instanceof String) && !TextUtils.isEmpty((String) obj)) {
                hashMap.put(IronSourceConstants.EVENTS_EXT1, str + "," + obj);
            } else {
                hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
            }
            Ib.a0().q().a(new C4689v5(enumC4707w5, new JSONObject(hashMap)));
        } catch (Exception e) {
            C4491k4.d().a(e);
        }
    }
}
