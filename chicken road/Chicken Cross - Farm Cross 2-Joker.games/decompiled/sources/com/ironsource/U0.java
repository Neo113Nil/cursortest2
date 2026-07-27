package com.ironsource;

import com.ironsource.L6;
import com.ironsource.mediationsdk.IronSource;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class U0 {

    /* renamed from: a, reason: collision with root package name */
    public static final U0 f7926a = new U0();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7927a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f7927a = iArr;
        }
    }

    private U0() {
    }

    @JvmStatic
    public static final L6.a a(IronSource.a adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        int i = a.f7927a[adUnit.ordinal()];
        if (i == 1) {
            return L6.a.REWARDED_VIDEO;
        }
        if (i == 2) {
            return L6.a.INTERSTITIAL;
        }
        if (i == 3) {
            return L6.a.BANNER;
        }
        if (i == 4) {
            return L6.a.NATIVE_AD;
        }
        throw new NoWhenBranchMatchedException();
    }
}
