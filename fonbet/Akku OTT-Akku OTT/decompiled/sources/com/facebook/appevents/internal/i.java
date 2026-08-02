package com.facebook.appevents.internal;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.w;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i {
    public static final a Companion = new a();
    public static volatile i b;
    public final Lazy a = LazyKt.lazy(b.a);

    @SourceDebugExtension({"SMAP\nAppLinkManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppLinkManager.kt\ncom/facebook/appevents/internal/AppLinkManager$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:32:0x004e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:5:0x0015  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final i a() {
            i iVar;
            i iVar2 = null;
            if (!com.facebook.internal.instrument.crashshield.a.b(i.class)) {
                try {
                    iVar = i.b;
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, i.class);
                }
                if (iVar == null) {
                    return iVar;
                }
                synchronized (this) {
                    if (!w.q.get()) {
                        return null;
                    }
                    if (!com.facebook.internal.instrument.crashshield.a.b(i.class)) {
                        try {
                            iVar2 = i.b;
                        } catch (Throwable th2) {
                            com.facebook.internal.instrument.crashshield.a.a(th2, i.class);
                        }
                    }
                    if (iVar2 == null) {
                        iVar2 = new i();
                        if (!com.facebook.internal.instrument.crashshield.a.b(i.class)) {
                            try {
                                i.b = iVar2;
                            } catch (Throwable th3) {
                                com.facebook.internal.instrument.crashshield.a.a(th3, i.class);
                            }
                        }
                    }
                    return iVar2;
                }
            }
            iVar = null;
            if (iVar == null) {
            }
        }
    }

    public static final class b extends Lambda implements Function0<SharedPreferences> {
        public static final b a = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return w.a().getSharedPreferences("com.facebook.sdk.APPLINK_INFO", 0);
        }
    }

    public final String a(String key) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(key, "key");
            return b().getString(key, null);
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return null;
        }
    }

    public final SharedPreferences b() {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            Object value = this.a.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-preferences>(...)");
            return (SharedPreferences) value;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return null;
        }
    }

    public final void c(Activity activity) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Uri uri = activity.getIntent().getData();
            if (uri == null) {
                return;
            }
            Intent intent = activity.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "activity.intent");
            d(intent, uri);
            if (com.facebook.internal.instrument.crashshield.a.b(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(uri, "uri");
                String queryParameter = uri.getQueryParameter("fbclid");
                if (queryParameter != null && queryParameter.length() != 0) {
                    b().edit().putString("click_id", queryParameter).apply();
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #3 {all -> 0x0067, blocks: (B:4:0x000c, B:9:0x003a, B:19:0x0051, B:21:0x0057, B:34:0x0034, B:13:0x0041, B:16:0x004b, B:27:0x001f, B:30:0x0029), top: B:3:0x000c, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #3 {all -> 0x0067, blocks: (B:4:0x000c, B:9:0x003a, B:19:0x0051, B:21:0x0057, B:34:0x0034, B:13:0x0041, B:16:0x004b, B:27:0x001f, B:30:0x0029), top: B:3:0x000c, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Intent intent, Uri uri) {
        String queryParameter;
        String string;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(intent, "intent");
            String str = null;
            if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                try {
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    queryParameter = uri.getQueryParameter("al_applink_data");
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, this);
                }
                if (queryParameter != null) {
                    try {
                        string = new JSONObject(queryParameter).getString("campaign_ids");
                    } catch (Exception unused) {
                    }
                    if (string == null) {
                        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                            try {
                                Intrinsics.checkNotNullParameter(intent, "intent");
                                Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
                                if (bundleExtra != null) {
                                    str = bundleExtra.getString("campaign_ids");
                                }
                            } catch (Throwable th2) {
                                com.facebook.internal.instrument.crashshield.a.a(th2, this);
                            }
                        }
                        string = str;
                    }
                    if (string == null) {
                        b().edit().putString("campaign_ids", string).apply();
                        return;
                    }
                    return;
                }
            }
            string = null;
            if (string == null) {
            }
            if (string == null) {
            }
        } catch (Throwable th3) {
            com.facebook.internal.instrument.crashshield.a.a(th3, this);
        }
    }
}
