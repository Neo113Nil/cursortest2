package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴦ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0931 {

    /* renamed from: טּ, reason: contains not printable characters */
    public static Field f2584;

    /* renamed from: סּ, reason: contains not printable characters */
    public static Field f2585;

    /* renamed from: ףּ, reason: contains not printable characters */
    public static Field f2586;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static Field f2587;

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static Object f2588;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static Class f2589;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f2601 = StringFog.decrypt("uVQYvbslXHGMUxC8\n", "+Dp8z9RMOCQ=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String f2600 = StringFog.decrypt("WBHKb2oMFg95N9dYYwsQFg==\n", "NV6kLAZldWQ=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2599 = StringFog.decrypt("0Zlr83j8wWnwv3bTcufHcw==\n", "vNYFpxeJogE=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f2598 = StringFog.decrypt("VmsZykYt\n", "Oz1wrzFeqz4=\n");

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f2597 = StringFog.decrypt("M87TTJ4ewZUsy9RZhQ==\n", "XoK6P+p7r/A=\n");

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f2596 = StringFog.decrypt("f8QaXSGKX6d2wgs=\n", "GKFuFE/5K8Y=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f2595 = StringFog.decrypt("Kz8g/7VupZkgLg==\n", "TFpUu9AIxOw=\n");

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f2594 = StringFog.decrypt("yCeGBdFOBT3MG5wp0U0Y\n", "pWjoTL8oanE=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f2593 = StringFog.decrypt("FGHwqz5pLoocWveHP0g3lQ1L8I0j\n", "eS6e6FEEXuY=\n");

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f2592 = StringFog.decrypt("gxoZNak2aGicMBMpsiBsbIAwBQ==\n", "7lV3ZdtTGAk=\n");

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final String f2591 = StringFog.decrypt("ML78jUg4j0gynOKySCmBRzSC5rtDOJY=\n", "XfGS3i1d5As=\n");

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f2590 = StringFog.decrypt("S34A6MdkBdhHSgD+\n", "JjNljK4FVbQ=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public static View.OnTouchListener m5740(View view) {
        try {
            Object m5742 = m5742(view);
            if (m5742 == null) {
                return null;
            }
            Class<?> cls = m5742.getClass();
            synchronized (AbstractC0494.class) {
                if (f2584 == null) {
                    f2584 = m5743(cls, f2599);
                }
            }
            return (View.OnTouchListener) f2584.get(m5742);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static View.OnClickListener m5741(View view) {
        try {
            Object m5742 = m5742(view);
            if (m5742 == null) {
                return null;
            }
            Class<?> cls = m5742.getClass();
            synchronized (AbstractC0494.class) {
                if (f2585 == null) {
                    f2585 = m5743(cls, f2600);
                }
            }
            return (View.OnClickListener) f2585.get(m5742);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ArrayList m5744() {
        try {
            if (f2589 == null || f2588 == null) {
                Class<?> cls = Class.forName(StringFog.decrypt("HnwjqGcq8FEJeyKtJhT9ERt9MJdpLfUYGmAAtmch9RM=\n", "fxJH2ghDlH8=\n"));
                f2589 = cls;
                f2588 = cls.getMethod(f2596, null).invoke(null, null);
            }
            Class cls2 = f2589;
            Object obj = f2588;
            if (f2587 == null) {
                Field declaredField = cls2.getDeclaredField(f2598);
                f2587 = declaredField;
                declaredField.setAccessible(true);
            }
            Object obj2 = f2587.get(obj);
            if (obj2 instanceof List) {
                return new ArrayList((List) obj2);
            }
            if (obj2 instanceof View[]) {
                return new ArrayList(Arrays.asList((View[]) obj2));
            }
            return new ArrayList();
        } catch (Throwable th) {
            AbstractC0544.m5503(f2601, StringFog.decrypt("R4NzsQfmW2V2hWiwEuZraWyVbqk4p1JhZZRz/gOvWXdxyyE=\n", "AvEB3nXGPAA=\n") + th.getLocalizedMessage());
            return new ArrayList();
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5747(MediaPlayer mediaPlayer, InterfaceC0984 interfaceC0984) {
        try {
            Field m5743 = m5743(MediaPlayer.class, f2594);
            MediaPlayer.OnInfoListener onInfoListener = (MediaPlayer.OnInfoListener) m5743.get(mediaPlayer);
            if (onInfoListener instanceof C0976) {
                return;
            }
            m5743.set(mediaPlayer, new C0976(onInfoListener, interfaceC0984));
        } catch (Exception e) {
            AbstractC0480.m5464(f2601, StringFog.decrypt("t+bGfdiSN7Py5tFixtM9uJ36+XfO2z+UvPLbXsPBKri88cY=\n", "0pS0EqqyXt0=\n"), (Throwable) e, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5748(MediaPlayer mediaPlayer, InterfaceC1010 interfaceC1010) {
        try {
            Field m5743 = m5743(MediaPlayer.class, f2593);
            MediaPlayer.OnCompletionListener onCompletionListener = (MediaPlayer.OnCompletionListener) m5743.get(mediaPlayer);
            if (onCompletionListener instanceof C1003) {
                return;
            }
            m5743.set(mediaPlayer, new C1003(onCompletionListener, interfaceC1010));
        } catch (Exception e) {
            AbstractC0480.m5464(f2601, StringFog.decrypt("gJ8+qNi4XL3Fnym3xvlWtqqDAaLO8VSQioA8q8/sXLyLoSW03v1btpc=\n", "5e1Mx6qYNdM=\n"), (Throwable) e, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5746(MediaPlayer mediaPlayer, InterfaceC0961 interfaceC0961) {
        try {
            Field m5743 = m5743(MediaPlayer.class, f2592);
            MediaPlayer.OnPreparedListener onPreparedListener = (MediaPlayer.OnPreparedListener) m5743.get(mediaPlayer);
            if (onPreparedListener instanceof C0953) {
                return;
            }
            m5743.set(mediaPlayer, new C0953(onPreparedListener, interfaceC0961));
        } catch (Exception e) {
            AbstractC0480.m5464(f2601, StringFog.decrypt("FTzQYCBfuZpQPMd/Ph6zkT8g72o2FrGkAivSbiAatLgZPdZqPBqi\n", "cE6iD1J/0PQ=\n"), (Throwable) e, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5745(MediaPlayer mediaPlayer, InterfaceC0924 interfaceC0924) {
        try {
            Field m5743 = m5743(MediaPlayer.class, f2591);
            MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = (MediaPlayer.OnSeekCompleteListener) m5743.get(mediaPlayer);
            if (onSeekCompleteListener instanceof C0881) {
                return;
            }
            m5743.set(mediaPlayer, new C0881(onSeekCompleteListener, interfaceC0924));
        } catch (Exception e) {
            AbstractC0480.m5464(f2601, StringFog.decrypt("HYYquMvGVBtYhj2n1YdeEDeaC7LcjX4aFYQ0ss2DcRwLgD253JQ=\n", "ePRY17nmPXU=\n"), (Throwable) e, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Object m5742(View view) {
        try {
            synchronized (AbstractC0494.class) {
                if (f2586 == null) {
                    f2586 = m5743(View.class, f2597);
                }
            }
            return f2586.get(view);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Field m5743(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Exception e) {
            AbstractC0480.m5464(f2601, StringFog.decrypt("U0l4z1h641EWXG/Ubj/pU1dJb8RsM+9TUg==\n", "NjsKoCpaij8=\n"), (Throwable) e, false);
            return null;
        }
    }
}
