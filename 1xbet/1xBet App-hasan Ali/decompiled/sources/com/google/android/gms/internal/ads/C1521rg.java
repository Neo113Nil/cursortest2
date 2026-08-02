package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.rg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1521rg implements InterfaceC1740wa {

    /* renamed from: k, reason: collision with root package name */
    public final Context f15327k;

    /* renamed from: l, reason: collision with root package name */
    public final J5 f15328l;

    /* renamed from: m, reason: collision with root package name */
    public final PowerManager f15329m;

    public C1521rg(Context context, J5 j5) {
        this.f15327k = context;
        this.f15328l = j5;
        this.f15329m = (PowerManager) context.getSystemService("power");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0221  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1740wa
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject o(C1611tg c1611tg) {
        float f;
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        K5 k5 = c1611tg.f15701e;
        if (k5 == null) {
            jSONObject = new JSONObject();
        } else {
            J5 j5 = this.f15328l;
            if (j5.f9860b == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", j5.f9862d).put("activeViewJSON", j5.f9860b).put("timestamp", c1611tg.f15699c).put("adFormat", j5.f9859a).put("hashCode", j5.f9861c).put("isMraid", false).put("isStopped", false).put("isPaused", c1611tg.f15698b).put("isNative", j5.f9863e).put("isScreenOn", this.f15329m.isInteractive()).put("appMuted", P2.o.f4767B.f4775h.d()).put("appVolume", r5.f4775h.a());
            Context context = this.f15327k;
            AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                int streamVolume = audioManager.getStreamVolume(3);
                if (streamMaxVolume != 0) {
                    f = streamVolume / streamMaxVolume;
                    put.put("deviceVolume", f);
                    Rect rect = new Rect();
                    Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                    rect.right = defaultDisplay.getWidth();
                    rect.bottom = defaultDisplay.getHeight();
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    JSONObject put2 = jSONObject3.put("windowVisibility", k5.f10122b).put("isAttachedToWindow", k5.f10121a);
                    JSONObject jSONObject4 = new JSONObject();
                    Rect rect2 = k5.f10123c;
                    JSONObject put3 = put2.put("viewBox", jSONObject4.put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    JSONObject jSONObject5 = new JSONObject();
                    Rect rect3 = k5.f10124d;
                    JSONObject put4 = put3.put("adBox", jSONObject5.put("top", rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put("right", rect3.right));
                    JSONObject jSONObject6 = new JSONObject();
                    Rect rect4 = k5.f10125e;
                    JSONObject put5 = put4.put("globalVisibleBox", jSONObject6.put("top", rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put("right", rect4.right)).put("globalVisibleBoxVisible", k5.f);
                    JSONObject jSONObject7 = new JSONObject();
                    Rect rect5 = k5.f10126g;
                    JSONObject put6 = put5.put("localVisibleBox", jSONObject7.put("top", rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put("right", rect5.right)).put("localVisibleBoxVisible", k5.f10127h);
                    JSONObject jSONObject8 = new JSONObject();
                    Rect rect6 = k5.i;
                    put6.put("hitBox", jSONObject8.put("top", rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put("right", rect6.right)).put("screenDensity", displayMetrics.density);
                    jSONObject3.put("isVisible", c1611tg.f15697a);
                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8879p1)).booleanValue()) {
                        JSONArray jSONArray2 = new JSONArray();
                        List<Rect> list = k5.f10129k;
                        if (list != null) {
                            for (Rect rect7 : list) {
                                jSONArray2.put(new JSONObject().put("top", rect7.top).put("bottom", rect7.bottom).put("left", rect7.left).put("right", rect7.right));
                            }
                        }
                        jSONObject3.put("scrollableContainerBoxes", jSONArray2);
                    }
                    if (!TextUtils.isEmpty(c1611tg.f15700d)) {
                        jSONObject3.put("doneReasonCode", "u");
                    }
                    jSONObject = jSONObject3;
                }
            }
            f = 0.0f;
            put.put("deviceVolume", f);
            Rect rect8 = new Rect();
            Display defaultDisplay2 = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            rect8.right = defaultDisplay2.getWidth();
            rect8.bottom = defaultDisplay2.getHeight();
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            JSONObject put22 = jSONObject3.put("windowVisibility", k5.f10122b).put("isAttachedToWindow", k5.f10121a);
            JSONObject jSONObject42 = new JSONObject();
            Rect rect22 = k5.f10123c;
            JSONObject put32 = put22.put("viewBox", jSONObject42.put("top", rect22.top).put("bottom", rect22.bottom).put("left", rect22.left).put("right", rect22.right));
            JSONObject jSONObject52 = new JSONObject();
            Rect rect32 = k5.f10124d;
            JSONObject put42 = put32.put("adBox", jSONObject52.put("top", rect32.top).put("bottom", rect32.bottom).put("left", rect32.left).put("right", rect32.right));
            JSONObject jSONObject62 = new JSONObject();
            Rect rect42 = k5.f10125e;
            JSONObject put52 = put42.put("globalVisibleBox", jSONObject62.put("top", rect42.top).put("bottom", rect42.bottom).put("left", rect42.left).put("right", rect42.right)).put("globalVisibleBoxVisible", k5.f);
            JSONObject jSONObject72 = new JSONObject();
            Rect rect52 = k5.f10126g;
            JSONObject put62 = put52.put("localVisibleBox", jSONObject72.put("top", rect52.top).put("bottom", rect52.bottom).put("left", rect52.left).put("right", rect52.right)).put("localVisibleBoxVisible", k5.f10127h);
            JSONObject jSONObject82 = new JSONObject();
            Rect rect62 = k5.i;
            put62.put("hitBox", jSONObject82.put("top", rect62.top).put("bottom", rect62.bottom).put("left", rect62.left).put("right", rect62.right)).put("screenDensity", displayMetrics2.density);
            jSONObject3.put("isVisible", c1611tg.f15697a);
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8879p1)).booleanValue()) {
            }
            if (!TextUtils.isEmpty(c1611tg.f15700d)) {
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
