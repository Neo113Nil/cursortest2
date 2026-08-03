package com.ironsource;

/* loaded from: classes5.dex */
public final class W1 implements com.ironsource.E0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3178n2 f6035a;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6036a;

        static {
            int[] iArr = new int[com.ironsource.C0.values().length];
            try {
                iArr[com.ironsource.C0.LOAD_AD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.ironsource.C0.LOAD_AD_SUCCESS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.ironsource.C0.LOAD_AD_FAILED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.ironsource.C0.LOAD_AD_FAILED_WITH_REASON.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.ironsource.C0.AUCTION_SUCCESS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.ironsource.C0.AUCTION_FAILED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.ironsource.C0.AUCTION_FAILED_NO_CANDIDATES.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.ironsource.C0.LOAD_AD_NO_FILL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.ironsource.C0.AD_OPENED.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.ironsource.C0.AD_CLOSED.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.ironsource.C0.SHOW_AD.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[com.ironsource.C0.SHOW_AD_FAILED.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[com.ironsource.C0.AD_CLICKED.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[com.ironsource.C0.AD_REWARDED.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[com.ironsource.C0.RELOAD_AD_FAILED_WITH_REASON.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[com.ironsource.C0.RELOAD_AD_SUCCESS.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[com.ironsource.C0.AD_LEFT_APPLICATION.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            f6036a = iArr;
        }
    }

    public W1(com.ironsource.C3178n2 auctionData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        this.f6035a = auctionData;
    }

    private final boolean b(com.ironsource.C0 c0) {
        switch (com.ironsource.W1.a.f6036a[c0.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return true;
            default:
                return false;
        }
    }

    @Override // com.ironsource.E0
    public java.util.Map<java.lang.String, java.lang.Object> a(com.ironsource.C0 event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONObject h = this.f6035a.h();
        if (h != null && h.length() > 0) {
            hashMap.put("genericParams", h);
        }
        if (b(event)) {
            hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.AUCTION_TRIALS, java.lang.Integer.valueOf(this.f6035a.i()));
            if (!android.text.TextUtils.isEmpty(this.f6035a.f())) {
                hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.AUCTION_FALLBACK, this.f6035a.f());
            }
        }
        if (!android.text.TextUtils.isEmpty(this.f6035a.g())) {
            hashMap.put("auctionId", this.f6035a.g());
        }
        return hashMap;
    }
}
