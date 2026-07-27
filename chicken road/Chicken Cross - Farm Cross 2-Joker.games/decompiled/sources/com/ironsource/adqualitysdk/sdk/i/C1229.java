package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import com.chartboost.sdk.ChartboostDelegate;
import com.chartboost.sdk.Model.CBError;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺣ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1229 extends ChartboostDelegate implements InterfaceC0997 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1221 f3501;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0807 f3502;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ChartboostDelegate f3503;

    public C1229(C1221 c1221, ChartboostDelegate chartboostDelegate, C0807 c0807) {
        this.f3501 = c1221;
        this.f3503 = chartboostDelegate;
        this.f3502 = c0807;
    }

    public final void didCacheInPlay(String str) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("dftnLZwWLz9F50I6hBEnMUL2KDuBEAMxVftjFoYkLDFP\n", "NpMGX+h0QFA=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCacheInPlay(str);
        }
    }

    public final void didCacheInterstitial(String str) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("3RvShTVVBKDtB/eSLVIMruoWnZMoUyiu/RvWvi9DDr3tB9qDKFYH\n", "nnOz90E3a88=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCacheInterstitial(str);
        }
    }

    public final void didCacheMoreApps(String str) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("KmtLwX92L6gad27WZ3Enph1mBNdicAOmCmtP/mRmJYYZc1k=\n", "aQMqswsUQMc=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCacheMoreApps(str);
        }
    }

    public final void didCacheRewardedVideo(String str) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("rMpNtaMsK0yc1miiuysjQpvHAqO+KgdCjMpJlbI5JVGLx0iRviohTA==\n", "76Isx9dORCM=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCacheRewardedVideo(str);
        }
    }

    public final void didClickInterstitial(String str) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("mSbHniWZtxupOuKJPZ6/Fa4riIg4n5sYsy3NpT+PvQapOs+YOJq0\n", "2k6m7FH72HQ=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didClickInterstitial(str);
        }
    }

    public final void didClickMoreApps(String str) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("wJ1lSDx3odjwgUBfJHCp1veQKl4hcY3b6pZvdydnq/bzhXc=\n", "g/UEOkgVzrc=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didClickMoreApps(str);
        }
    }

    public final void didClickRewardedVideo(String str) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("E+lRhJqksMAj9XSTgqO4ziTkHpKHopzDOeJbpIuxvt005FSgh6K6wA==\n", "UIEw9u7G368=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didClickRewardedVideo(str);
        }
    }

    public final void didCloseInterstitial(String str) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("InyhbLxy4x0SYIR7pHXrExVx7nqhdM8eDmelV6Zk6QASYKlqoXHg\n", "YRTAHsgQjHI=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCloseInterstitial(str);
        }
    }

    public final void didCloseMoreApps(String str) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("7U6LFsxG+2jdUq4B1EHzZtpDxADRQNdrwVWPKddW8UbeVpk=\n", "ribqZLgklAc=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCloseMoreApps(str);
        }
    }

    public final void didCloseRewardedVideo(String str) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("sFANhicN+yuATCiRPwrzJYddQpA6C9conEsJpjYY9TaXXQiiOgvxKw==\n", "8zhs9FNvlEQ=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCloseRewardedVideo(str);
        }
    }

    public final void didCompleteInterstitial(String str) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("q4khcZc+7OCblQRmjznk7pyEbmeKOMDghZEsZpc5yuGchDJwlzX35omN\n", "6OFAA+Ncg48=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCompleteInterstitial(str);
        }
    }

    public final void didCompleteRewardedVideo(String str, int i) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("awH9/KbMA35bHdjrvssLcFwMsuq7yi9+RRnw66bLPnRfCO7qt8o6eEwM8w==\n", "KGmcjtKubBE=\n"), str, Integer.valueOf(i));
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didCompleteRewardedVideo(str, i);
        }
    }

    public final void didDismissInterstitial(String str) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("mKgT4tFdcKaotDb1yVp4qK+lXPTMW1ugqK0b49Z2cb2+sgHkzEt2qLc=\n", "28BykKU/H8k=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didDismissInterstitial(str);
        }
    }

    public final void didDismissMoreApps(String str) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("dhSLOSddU/9GCK4uP1pb8UEZxC86W3j5RhGDOCByU+JQPZo7IA==\n", "NXzqS1M/PJA=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didDismissMoreApps(str);
        }
    }

    public final void didDismissRewardedVideo(String str) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("/L4Ze8LqURDMojxs2u1ZHsuzVm3f7HoWzLsResXaWwjepBxs0t5XG9q5\n", "v9Z4CbaIPn8=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didDismissRewardedVideo(str);
        }
    }

    public final void didDisplayInterstitial(String str) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("JghyN4J9ouIWFFcgmnqq7BEFPSGfe4nkFhB/JI9Wo/kAEmAxn2uk7Ak=\n", "ZWATRfYfzY0=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didDisplayInterstitial(str);
        }
    }

    public final void didDisplayMoreApps(String str) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("rf9Bfg6hvpGd42RpFqa2n5ryDmgTp5WXnedMbQOOvoyL1lB8CQ==\n", "7pcgDHrD0f4=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didDisplayMoreApps(str);
        }
    }

    public final void didDisplayRewardedVideo(String str) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("5K/3EVcdiGLUs9IGTxqAbNOiuAdKG6Nk1Lf6AlotgnrGtfIGRymOacKo\n", "p8eWYyN/5w0=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didDisplayRewardedVideo(str);
        }
    }

    public final void didFailToLoadInPlay(String str, CBError.CBImpressionError cBImpressionError) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("aVEwTloyVc5ZTRVZQjVdwF5cf1hHNHzAQ1UFU2I/W8VjVwFQTyk=\n", "KjlRPC5QOqE=\n"), str, cBImpressionError);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didFailToLoadInPlay(str, cBImpressionError);
        }
    }

    public final void didFailToLoadInterstitial(String str, CBError.CBImpressionError cBImpressionError) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("5mLXAnvoGrPWfvIVY+8SvdFvmBRm7jO9zGbiH0PlFLjsZMIVffkBtdFj1xw=\n", "pQq2cA+Kddw=\n"), str, cBImpressionError);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didFailToLoadInterstitial(str, cBImpressionError);
        }
    }

    public final void didFailToLoadMoreApps(String str, CBError.CBImpressionError cBImpressionError) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("xt+BakoOd/72w6R9Ugl/8PHSznxXCF7w7Nu0d3IDefXI2JJ9fxxo4g==\n", "hbfgGD5sGJE=\n"), str, cBImpressionError);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didFailToLoadMoreApps(str, cBImpressionError);
        }
    }

    public final void didFailToLoadRewardedVideo(String str, CBError.CBImpressionError cBImpressionError) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("55JyuJUET53XjlevjQNHk9CfPa6IAmaTzZZHpa0JQZb2n2SrkwJFlvKTd6+O\n", "pPoTyuFmIPI=\n"), str, cBImpressionError);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didFailToLoadRewardedVideo(str, cBImpressionError);
        }
    }

    public final void didFailToRecordClick(String str, CBError.CBClickError cBClickError) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("bqOflz/VSMZev7qAJ9JAyFmu0IEi02HIRKeqihnSRMZfr72JItRM\n", "Lcv+5Uu3J6k=\n"), str, cBClickError);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didFailToRecordClick(str, cBClickError);
        }
    }

    public final void didInitialize() {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("Iqs3Coz23QgStxIdlPHVBhWmeByR8PsJCLc/GZT9yAI=\n", "YcNWePiUsmc=\n"), new Object[0]);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.didInitialize();
        }
    }

    public final void didPauseClickForConfirmation(Activity activity) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("zRr71k5j50b9Bt7BVmTvSPoXtMBTZdhI+wH/51Zo60LIHejnVW/uQPwf+9BTbuY=\n", "jnKapDoBiCk=\n"), activity);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            try {
                chartboostDelegate.getClass().getDeclaredMethod(StringFog.decrypt("3jbxlDfaIxn5M/ynPek/Dvkw+6I/3T0dzjb6qg==\n", "ul+VxFavUHw=\n"), Activity.class).invoke(this.f3503, activity);
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean shouldDisplayInterstitial(String str) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("/8k0AUcPscTP1REWXwi5ysjEewBbAqvH2OU8AEMBv9L1zyEWQR6qwsjINB8=\n", "vKFVczNt3qs=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            return chartboostDelegate.shouldDisplayInterstitial(str);
        }
        return false;
    }

    public final boolean shouldDisplayMoreApps(String str) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("1MxfbK6Tzu7k0Hp7tpTG4OPBEG2yntTt8+BXbaqdwPjay0x7m4HR8g==\n", "l6Q+HtrxoYE=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            return chartboostDelegate.shouldDisplayMoreApps(str);
        }
        return false;
    }

    public final boolean shouldDisplayRewardedVideo(String str) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("nkLtIMR3RtCuXsg33HBO3qlPoiHYelzTuW7lIcB5SMaPT/szwnFM24tD6Dff\n", "3SqMUrAVKb8=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            return chartboostDelegate.shouldDisplayRewardedVideo(str);
        }
        return false;
    }

    public final boolean shouldRequestInterstitial(String str) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("EnBW/rrOh1kibHPposmPVyV9Gf+mw51aNUpS/bvJm0IYdkPpvN+cXyVxVuA=\n", "URg3jM6s6DY=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            return chartboostDelegate.shouldRequestInterstitial(str);
        }
        return false;
    }

    public final boolean shouldRequestMoreApps(String str) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("ak4eOXSbJldaUjsubJwuWV1DUTholjxUTXQaOnWcOkxkSQ0uQYk5Sw==\n", "KSZ/SwD5STg=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            return chartboostDelegate.shouldRequestMoreApps(str);
        }
        return false;
    }

    public final void willDisplayVideo(String str) {
        this.f3501.m5529(this, this.f3502, StringFog.decrypt("9vDjhZTp5VHG7MaSjO7tX8H9rICJ5+Z63Ovym4Hy3FfR/e0=\n", "tZiC9+CLij4=\n"), str);
        ChartboostDelegate chartboostDelegate = this.f3503;
        if (chartboostDelegate != null) {
            chartboostDelegate.willDisplayVideo(str);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0997
    /* renamed from: ﾒ */
    public final Object mo5381() {
        return this.f3503;
    }
}
