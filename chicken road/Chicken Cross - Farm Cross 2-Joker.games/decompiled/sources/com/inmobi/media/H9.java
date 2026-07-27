package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class H9 extends B2 {
    public static final H9 c = new H9();
    public static final AtomicBoolean d = new AtomicBoolean(true);

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        AtomicBoolean atomicBoolean = d;
        jSONObject.put("a-audioBannerEnabled", String.valueOf(atomicBoolean.get()));
        if (atomicBoolean.get()) {
            long j = this.f6466a / 1000;
            if (j != 0) {
                jSONObject.put("a-lastAudioBannerPlayedTs", String.valueOf(j));
            }
            int i = this.b;
            if (i > 0) {
                jSONObject.put("a-audioBannerFreq", String.valueOf(i));
            }
            Context context = AbstractC3914mk.f7252a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Db.b;
                Db a2 = Cb.a(context, "banner_audio_pref_file");
                Intrinsics.checkNotNullParameter("user_mute_count", "key");
                int i2 = a2.f6510a.getInt("user_mute_count", -1);
                if (i2 > 0) {
                    jSONObject.put("a-b-umc", String.valueOf(i2));
                }
            }
        }
        return jSONObject;
    }
}
