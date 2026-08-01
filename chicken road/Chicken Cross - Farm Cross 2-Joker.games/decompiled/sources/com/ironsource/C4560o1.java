package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.o1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4560o1 implements InterfaceC4578p1 {

    /* renamed from: a, reason: collision with root package name */
    private final IronSource.a f8460a;

    /* renamed from: com.ironsource.o1$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8461a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8461a = iArr;
        }
    }

    public C4560o1(IronSource.a adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f8460a = adFormat;
    }

    @Override // com.ironsource.InterfaceC4578p1
    public InterfaceC4596q1 a(InterfaceC4506l1 eventBaseData) {
        Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
        int i = a.f8461a[this.f8460a.ordinal()];
        if (i == 1) {
            return new C9(eventBaseData);
        }
        if (i == 2) {
            return new C4358ce(eventBaseData);
        }
        if (i == 3) {
            return new P2(eventBaseData);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + this.f8460a);
    }
}
