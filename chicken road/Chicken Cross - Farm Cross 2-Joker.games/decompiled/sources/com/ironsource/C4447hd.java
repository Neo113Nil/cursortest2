package com.ironsource;

import com.ironsource.H7;
import com.unity3d.mediation.LevelPlay;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.hd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4447hd implements H7, H7.a {

    /* renamed from: a, reason: collision with root package name */
    private final B3 f8228a;
    private final K4 b;

    /* renamed from: com.ironsource.hd$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8229a;

        static {
            int[] iArr = new int[F3.values().length];
            try {
                iArr[F3.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F3.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[F3.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8229a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4447hd() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.H7
    public synchronized D3 a(String placementName, LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        String a2 = new C4554nd(placementName, adFormat).a();
        D3 a3 = this.b.a(a2);
        if (a3.d()) {
            return a3;
        }
        return this.f8228a.a(a2);
    }

    @Override // com.ironsource.H7.a
    public synchronized void b(String placementName, LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        String a2 = new C4554nd(placementName, adFormat).a();
        if (!this.b.a(a2).d()) {
            this.f8228a.b(a2);
        }
    }

    public C4447hd(B3 cappingService, K4 deliveryHandler) {
        Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        Intrinsics.checkNotNullParameter(deliveryHandler, "deliveryHandler");
        this.f8228a = cappingService;
        this.b = deliveryHandler;
    }

    public /* synthetic */ C4447hd(B3 b3, K4 k4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new B3(null, null, null, 7, null) : b3, (i & 2) != 0 ? new K4() : k4);
    }

    @Override // com.ironsource.H7.a
    public synchronized Object a(String placementName, LevelPlay.AdFormat adFormat, F3 cappingType, InterfaceC4494k7 cappingConfig) {
        Object a2;
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        String a3 = new C4554nd(placementName, adFormat).a();
        int i = a.f8229a[cappingType.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            a2 = this.f8228a.a(a3, cappingType, cappingConfig);
        } else {
            a2 = this.b.a(a3, cappingType, cappingConfig);
        }
        return a2;
    }
}
