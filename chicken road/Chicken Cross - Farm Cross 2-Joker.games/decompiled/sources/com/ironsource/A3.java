package com.ironsource;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class A3 {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7541a;

        static {
            int[] iArr = new int[F3.values().length];
            try {
                iArr[F3.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F3.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[F3.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7541a = iArr;
        }
    }

    public final int a(F3 cappingType) {
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        int i = a.f7541a[cappingType.ordinal()];
        if (i == 1 || i == 2) {
            return 3000;
        }
        if (i == 3) {
            return 3001;
        }
        throw new NoWhenBranchMatchedException();
    }
}
