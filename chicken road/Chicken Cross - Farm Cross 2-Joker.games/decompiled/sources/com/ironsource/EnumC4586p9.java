package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.p9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC4586p9 {
    NonBidder(1),
    Bidder(2),
    NotSupported(-1);

    public static final a b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f8478a;

    /* renamed from: com.ironsource.p9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC4586p9 a(int i) {
            EnumC4586p9 enumC4586p9;
            EnumC4586p9[] values = EnumC4586p9.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC4586p9 = null;
                    break;
                }
                enumC4586p9 = values[i2];
                if (enumC4586p9.f8478a == i) {
                    break;
                }
                i2++;
            }
            return enumC4586p9 == null ? EnumC4586p9.NotSupported : enumC4586p9;
        }

        private a() {
        }
    }

    EnumC4586p9(int i) {
        this.f8478a = i;
    }

    public final int b() {
        return this.f8478a;
    }

    public final boolean b(EnumC4586p9 instanceType) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        return instanceType.b() == this.f8478a;
    }
}
