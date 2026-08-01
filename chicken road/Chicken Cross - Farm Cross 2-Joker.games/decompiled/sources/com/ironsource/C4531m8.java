package com.ironsource;

/* renamed from: com.ironsource.m8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4531m8 {

    /* renamed from: com.ironsource.m8$a */
    public enum a {
        None,
        Device,
        Controller
    }

    /* renamed from: com.ironsource.m8$b */
    public enum b {
        None,
        Loading,
        Loaded,
        Ready,
        Failed
    }

    /* renamed from: com.ironsource.m8$c */
    public enum c {
        Web,
        Native,
        None
    }

    /* renamed from: com.ironsource.m8$d */
    public enum d {
        MODE_0(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3);


        /* renamed from: a, reason: collision with root package name */
        private int f8357a;

        d(int i) {
            this.f8357a = i;
        }

        public int b() {
            return this.f8357a;
        }
    }

    /* renamed from: com.ironsource.m8$e */
    public enum e {
        Banner,
        Interstitial,
        RewardedVideo,
        NativeAd,
        None
    }
}
