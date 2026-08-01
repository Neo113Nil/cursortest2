package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class W8 {
    private static final a c = new a(null);

    @Deprecated
    public static final String d = "pub";

    @Deprecated
    public static final String e = "sdk";

    /* renamed from: a, reason: collision with root package name */
    private final C4577p0 f7994a;
    private volatile LevelPlayImpressionDataListener b;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public W8(C4577p0 adTools) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        this.f7994a = adTools;
    }

    public final LevelPlayImpressionDataListener a() {
        return this.b;
    }

    public final void b() {
        a((LevelPlayImpressionDataListener) null, "sdk");
    }

    public final void a(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        a(levelPlayImpressionDataListener, d);
    }

    private final void a(LevelPlayImpressionDataListener levelPlayImpressionDataListener, String str) {
        boolean z = this.b != null;
        this.b = levelPlayImpressionDataListener;
        C4557ng h = this.f7994a.f().h();
        if (levelPlayImpressionDataListener == null) {
            h.a(str, z);
        } else {
            h.a(z);
        }
    }

    public final void a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (this.b == null || adInfo.getAuctionId().length() == 0) {
            return;
        }
        final LevelPlayImpressionData levelPlayImpressionData = new LevelPlayImpressionData(adInfo.impressionData$mediationsdk_release());
        IronLog ironLog = IronLog.CALLBACK;
        C4577p0 c4577p0 = this.f7994a;
        LevelPlayImpressionDataListener levelPlayImpressionDataListener = this.b;
        ironLog.verbose(C4577p0.a(c4577p0, "onImpressionSuccess " + (levelPlayImpressionDataListener != null ? levelPlayImpressionDataListener.getClass().getSimpleName() : null), (String) null, 2, (Object) null));
        this.f7994a.b(new Runnable() { // from class: com.ironsource.W8$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                W8.a(W8.this, levelPlayImpressionData);
            }
        });
        this.f7994a.f().h().a(levelPlayImpressionData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(W8 this$0, LevelPlayImpressionData impressionData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(impressionData, "$impressionData");
        LevelPlayImpressionDataListener levelPlayImpressionDataListener = this$0.b;
        if (levelPlayImpressionDataListener != null) {
            levelPlayImpressionDataListener.onImpressionSuccess(impressionData);
        }
    }
}
