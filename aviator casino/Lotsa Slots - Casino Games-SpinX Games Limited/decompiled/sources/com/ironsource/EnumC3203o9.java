package com.ironsource;

/* renamed from: com.ironsource.o9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC3203o9 {
    NonBidder(1),
    Bidder(2),
    NotSupported(-1);

    public static final com.ironsource.EnumC3203o9.a b = new com.ironsource.EnumC3203o9.a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f6540a;

    /* renamed from: com.ironsource.o9$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.ironsource.EnumC3203o9 a(int i) {
            com.ironsource.EnumC3203o9 enumC3203o9;
            com.ironsource.EnumC3203o9[] values = com.ironsource.EnumC3203o9.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC3203o9 = null;
                    break;
                }
                enumC3203o9 = values[i2];
                if (enumC3203o9.f6540a == i) {
                    break;
                }
                i2++;
            }
            return enumC3203o9 == null ? com.ironsource.EnumC3203o9.NotSupported : enumC3203o9;
        }

        private a() {
        }
    }

    EnumC3203o9(int i) {
        this.f6540a = i;
    }

    public final int b() {
        return this.f6540a;
    }

    public final boolean b(com.ironsource.EnumC3203o9 instanceType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        return instanceType.b() == this.f6540a;
    }
}
