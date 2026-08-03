package com.ironsource;

/* loaded from: classes5.dex */
public enum R7 {
    UnknownProvider(0),
    DeliverySonic(1),
    MarketPlaceISX(3);

    public static final com.ironsource.R7.a b = new com.ironsource.R7.a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f5947a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.ironsource.R7 a(java.lang.Integer num) {
            com.ironsource.R7 r7;
            com.ironsource.R7[] values = com.ironsource.R7.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    r7 = null;
                    break;
                }
                r7 = values[i];
                int b = r7.b();
                if (num != null && b == num.intValue()) {
                    break;
                }
                i++;
            }
            return r7 == null ? com.ironsource.R7.UnknownProvider : r7;
        }

        private a() {
        }

        public final com.ironsource.R7 a(java.lang.String dynamicDemandSourceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicDemandSourceId, "dynamicDemandSourceId");
            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) dynamicDemandSourceId, new java.lang.String[]{"_"}, false, 0, 6, (java.lang.Object) null);
            return split$default.size() < 2 ? com.ironsource.R7.UnknownProvider : a(kotlin.text.StringsKt.toIntOrNull((java.lang.String) split$default.get(1)));
        }
    }

    R7(int i) {
        this.f5947a = i;
    }

    public final int b() {
        return this.f5947a;
    }
}
