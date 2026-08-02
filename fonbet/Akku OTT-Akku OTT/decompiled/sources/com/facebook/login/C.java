package com.facebook.login;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.VisibleForTesting;
import com.facebook.C0688a;
import com.facebook.C0724m;
import com.facebook.C0728q;
import com.facebook.EnumC0718l;
import com.facebook.login.u;
import com.facebook.login.z;
import com.google.firebase.messaging.Constants;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@VisibleForTesting(otherwise = 3)
/* loaded from: classes3.dex */
public abstract class C extends z {
    public final EnumC0718l c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(u loginClient) {
        super(loginClient);
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        this.c = EnumC0718l.FACEBOOK_APPLICATION_WEB;
    }

    @Override // com.facebook.login.z
    public final boolean r(int i, int i2, Intent data) {
        String string;
        String string2;
        Object obj;
        final u.c cVar = n().i;
        if (data == null) {
            u.d.Companion.getClass();
            v(u.d.c.a(cVar, "Operation canceled"));
            return true;
        }
        if (i2 == 0) {
            Intrinsics.checkNotNullParameter(data, "data");
            Bundle extras = data.getExtras();
            if (extras == null || (string = extras.getString(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) == null) {
                string = extras != null ? extras.getString("error_type") : null;
            }
            String obj2 = (extras == null || (obj = extras.get("error_code")) == null) ? null : obj.toString();
            int i3 = com.facebook.internal.A.a;
            if (!Intrinsics.areEqual("CONNECTION_FAILURE", obj2)) {
                u.d.Companion.getClass();
                v(u.d.c.a(cVar, string));
                return true;
            }
            if (extras != null && (string2 = extras.getString("error_message")) != null) {
                r5 = string2;
            } else if (extras != null) {
                r5 = extras.getString("error_description");
            }
            u.d.Companion.getClass();
            v(u.d.c.b(cVar, string, r5, obj2));
            return true;
        }
        if (i2 != -1) {
            v(u.d.c.c(u.d.Companion, cVar, "Unexpected resultCode from authorization.", null));
            return true;
        }
        final Bundle extras2 = data.getExtras();
        if (extras2 == null) {
            v(u.d.c.c(u.d.Companion, cVar, "Unexpected null from returned authorization data.", null));
            return true;
        }
        String string3 = extras2.getString(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        if (string3 == null) {
            string3 = extras2.getString("error_type");
        }
        Object obj3 = extras2.get("error_code");
        r5 = obj3 != null ? obj3.toString() : null;
        String string4 = extras2.getString("error_message");
        if (string4 == null) {
            string4 = extras2.getString("error_description");
        }
        String string5 = extras2.getString("e2e");
        if (!com.facebook.internal.E.z(string5)) {
            q(string5);
        }
        if (string3 != null || r5 != null || string4 != null || cVar == null) {
            x(cVar, string3, string4, r5);
            return true;
        }
        if (!extras2.containsKey("code") || com.facebook.internal.E.z(extras2.getString("code"))) {
            y(extras2, cVar);
            return true;
        }
        com.facebook.w.c().execute(new Runnable() { // from class: com.facebook.login.B
            @Override // java.lang.Runnable
            public final void run() {
                C this$0 = C.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                u.c request = cVar;
                Intrinsics.checkNotNullParameter(request, "$request");
                Bundle extras3 = extras2;
                Intrinsics.checkNotNullParameter(extras3, "$extras");
                try {
                    this$0.s(extras3, request);
                    this$0.y(extras3, request);
                } catch (com.facebook.y e) {
                    com.facebook.t tVar = e.b;
                    this$0.x(request, tVar.d, tVar.h(), String.valueOf(tVar.b));
                } catch (C0728q e2) {
                    this$0.x(request, null, e2.getMessage(), null);
                }
            }
        });
        return true;
    }

    public final void v(u.d dVar) {
        if (dVar != null) {
            n().n(dVar);
        } else {
            n().t();
        }
    }

    public EnumC0718l w() {
        return this.c;
    }

    public final void x(u.c cVar, String str, String str2, String str3) {
        if (str != null && Intrinsics.areEqual(str, "logged_out")) {
            C0720b.k = true;
            v(null);
            return;
        }
        int i = com.facebook.internal.A.a;
        if (CollectionsKt.contains(CollectionsKt.listOf((Object[]) new String[]{"service_disabled", "AndroidAuthKillSwitchException"}), str)) {
            v(null);
        } else if (CollectionsKt.contains(CollectionsKt.listOf((Object[]) new String[]{"access_denied", "OAuthAccessDeniedException"}), str)) {
            u.d.Companion.getClass();
            v(u.d.c.a(cVar, null));
        } else {
            u.d.Companion.getClass();
            v(u.d.c.b(cVar, str, str2, str3));
        }
    }

    public final void y(Bundle extras, u.c request) {
        u.c cVar;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(extras, "extras");
        try {
            z.a aVar = z.Companion;
            HashSet hashSet = request.b;
            EnumC0718l w = w();
            String str = request.d;
            aVar.getClass();
            C0688a b = z.a.b(hashSet, extras, w, str);
            C0724m c = z.a.c(extras, request.u);
            u.d.Companion.getClass();
            cVar = request;
            try {
                v(new u.d(cVar, u.d.a.SUCCESS, b, c, null, null));
            } catch (C0728q e) {
                e = e;
                v(u.d.c.c(u.d.Companion, cVar, null, e.getMessage()));
            }
        } catch (C0728q e2) {
            e = e2;
            cVar = request;
        }
    }

    public final boolean z(Intent intent) {
        if (intent == null) {
            return false;
        }
        List<ResolveInfo> queryIntentActivities = com.facebook.w.a().getPackageManager().queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "getApplicationContext()\n…nager.MATCH_DEFAULT_ONLY)");
        if (queryIntentActivities.isEmpty()) {
            return false;
        }
        v vVar = n().c;
        Unit unit = null;
        if (vVar == null) {
            vVar = null;
        }
        if (vVar != null) {
            ActivityResultLauncher<Intent> activityResultLauncher = vVar.d;
            if (activityResultLauncher == null) {
                Intrinsics.throwUninitializedPropertyAccessException("launcher");
                activityResultLauncher = null;
            }
            if (activityResultLauncher != null) {
                activityResultLauncher.launch(intent);
                unit = Unit.INSTANCE;
            }
        }
        return unit != null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.c = EnumC0718l.FACEBOOK_APPLICATION_WEB;
    }
}
