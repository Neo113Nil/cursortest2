package com.inmobi.media;

/* renamed from: com.inmobi.media.c9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2323c9 extends com.inmobi.media.AbstractC2395f2 {
    public static final com.inmobi.media.C2323c9 c = new com.inmobi.media.C2323c9();
    public static final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean(true);

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = d;
        jSONObject.put("a-audioBannerEnabled", java.lang.String.valueOf(atomicBoolean.get()));
        if (atomicBoolean.get()) {
            long j = this.f5190a / 1000;
            if (j != 0) {
                jSONObject.put("a-lastAudioBannerPlayedTs", java.lang.String.valueOf(j));
            }
            int i = this.b;
            if (i > 0) {
                jSONObject.put("a-audioBannerFreq", java.lang.String.valueOf(i));
            }
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            if (context != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "banner_audio_pref_file");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("user_mute_count", com.ironsource.X3.i.W);
                int i2 = a2.f4815a.getInt("user_mute_count", -1);
                if (i2 > 0) {
                    jSONObject.put("a-b-umc", java.lang.String.valueOf(i2));
                }
            }
        }
        return jSONObject;
    }
}
