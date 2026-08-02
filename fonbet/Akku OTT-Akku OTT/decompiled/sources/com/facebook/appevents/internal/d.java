package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.w;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (f.h == null) {
            m.Companion.getClass();
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(w.a());
            long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
            long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
            m mVar = null;
            mVar = null;
            mVar = null;
            String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
            if (j != 0 && j2 != 0 && string != null) {
                m mVar2 = new m(Long.valueOf(j), Long.valueOf(j2));
                mVar2.d = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
                o.Companion.getClass();
                SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(w.a());
                mVar2.f = defaultSharedPreferences2.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage") ? new o(defaultSharedPreferences2.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences2.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false)) : null;
                mVar2.e = Long.valueOf(System.currentTimeMillis());
                UUID fromString = UUID.fromString(string);
                Intrinsics.checkNotNullExpressionValue(fromString, "fromString(sessionIDStr)");
                Intrinsics.checkNotNullParameter(fromString, "<set-?>");
                mVar2.c = fromString;
                mVar = mVar2;
            }
            f.h = mVar;
        }
    }
}
