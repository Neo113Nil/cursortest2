package sg.bigo.ads.U0;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f12573a;
    public final long b;
    public final int c;
    public final long d;

    public i(JSONObject jSONObject) {
        this.f12573a = jSONObject.optInt("video_impression_area_rate", 0);
        this.b = jSONObject.optLong("video_impression_time", 0L);
        this.c = jSONObject.optInt("image_impression_area_rate", 0);
        this.d = jSONObject.optLong("image_impression_time", 0L);
    }
}
