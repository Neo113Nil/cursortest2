package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.os.SystemClock;
import android.util.Pair;
import android.widget.VideoView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴝ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0927 extends AbstractC0599 {
    static {
        StringFog.decrypt("EWoiBtMdu+c0fTkr2B27+AJCNyTdGb/5P2ElPt0Que4=\n", "dg9WSrx+2os=\n");
        StringFog.decrypt("tncgEkbs5L+GYCgaUfvgvrBAIhhQ8feotg==\n", "xBJHezWYgc0=\n");
        StringFog.decrypt("m3H+kcx1plKLbc6GxH2xRY9s+KbOf7BPmHr+\n", "7h+M9Ksc1SY=\n");
        StringFog.decrypt("s381RQAYfeG9aDJhLhNlwrdu\n", "1BpBFWFxD6c=\n");
        StringFog.decrypt("6sbjAK0ZhdrowPg+qD+V4+jA4w==\n", "jaOXUMxw94k=\n");
        StringFog.decrypt("VMRDn7UTN4FjzVartQU=\n", "M6E30tB3XuA=\n");
        StringFog.decrypt("EJjzjs55BxASqPeewmILOhmw7qbCfA==\n", "d/2HyqsPbnM=\n");
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static void m5728(ArrayList arrayList) {
        Context context = (Context) AbstractC0599.m5554(arrayList, 0, Context.class);
        BroadcastReceiver broadcastReceiver = (BroadcastReceiver) AbstractC0599.m5554(arrayList, 1, BroadcastReceiver.class);
        Object m5665 = AbstractC0779.m5665(context);
        try {
            AbstractC0940.m5780(m5665, StringFog.decrypt("fkFdDSJo8OxuXX0NJmTq7m5d\n", "Cy8vaEUBg5g=\n"), Arrays.asList(broadcastReceiver)).invoke(m5665, broadcastReceiver);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m5729(ArrayList arrayList) {
        Context context = (Context) AbstractC0599.m5554(arrayList, 0, Context.class);
        BroadcastReceiver broadcastReceiver = (BroadcastReceiver) AbstractC0599.m5554(arrayList, 1, BroadcastReceiver.class);
        IntentFilter intentFilter = (IntentFilter) AbstractC0599.m5554(arrayList, 2, IntentFilter.class);
        Object m5665 = AbstractC0779.m5665(context);
        try {
            AbstractC0940.m5780(m5665, StringFog.decrypt("Jyt042kKLKEHK3DvcwgsoQ==\n", "VU4Tihp+SdM=\n"), Arrays.asList(broadcastReceiver, intentFilter)).invoke(m5665, broadcastReceiver, intentFilter);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static Object m5730(ArrayList arrayList) {
        return ((Pair) AbstractC0599.m5554(arrayList, 0, Pair.class)).second;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Object m5731(ArrayList arrayList) {
        return ((Pair) AbstractC0599.m5554(arrayList, 0, Pair.class)).first;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static MediaPlayer m5732(ArrayList arrayList) {
        VideoView videoView = (VideoView) AbstractC0599.m5554(arrayList, 0, VideoView.class);
        try {
            Field m5743 = AbstractC0931.m5743(VideoView.class, AbstractC0931.f2590);
            if (m5743 != null) {
                return (MediaPlayer) m5743.get(videoView);
            }
        } catch (Exception e) {
            AbstractC0480.m5464(AbstractC0931.f2601, StringFog.decrypt("DRuInOFPRJZIDp+H3gpJkQk5lpLqCl8=\n", "aGn685NvLfg=\n"), (Throwable) e, false);
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Object m5734(ArrayList arrayList) {
        return AbstractC0779.m5665((Context) AbstractC0599.m5554(arrayList, 0, Context.class));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static long m5733() {
        String str = AbstractC0494.f1141;
        return SystemClock.elapsedRealtime();
    }
}
