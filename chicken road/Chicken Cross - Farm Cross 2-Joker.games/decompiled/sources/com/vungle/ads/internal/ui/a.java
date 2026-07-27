package com.vungle.ads.internal.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vungle.ads.internal.v0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class a {
    public static final String a(Intent intent) {
        v0 v0Var = l.h;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return extras.getString("request_eventId");
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final String b(Intent intent) {
        v0 v0Var = l.h;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return extras.getString("request");
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static void a(com.vungle.ads.internal.presenter.a aVar) {
        l.i = aVar;
    }

    public static void a(v0 v0Var) {
        l.h = v0Var;
    }

    public static Intent a(Context context, String placement, String str) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intent intent = new Intent(context, (Class<?>) VungleActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        Bundle bundle = new Bundle();
        bundle.putString("request", placement);
        bundle.putString("request_eventId", str);
        intent.putExtras(bundle);
        return intent;
    }
}
