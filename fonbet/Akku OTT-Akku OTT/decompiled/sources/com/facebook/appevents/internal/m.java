package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.w;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m {
    public static final a Companion = new a();
    public final Long a;
    public Long b;
    public UUID c;
    public int d;
    public Long e;
    public o f;

    public static final class a {
    }

    public m(Long l, Long l2) {
        UUID sessionId = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(sessionId, "randomUUID()");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.a = l;
        this.b = l2;
        this.c = sessionId;
    }

    public final void a() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(w.a()).edit();
        Long l = this.a;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l != null ? l.longValue() : 0L);
        Long l2 = this.b;
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l2 != null ? l2.longValue() : 0L);
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.d);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.c.toString());
        edit.apply();
        o oVar = this.f;
        if (oVar == null || oVar == null) {
            return;
        }
        SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(w.a()).edit();
        edit2.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", oVar.a);
        edit2.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", oVar.b);
        edit2.apply();
    }
}
