package com.ironsource;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public enum P7 {
    UnknownProvider(0),
    DeliverySonic(1),
    MarketPlaceISX(3);

    public static final a b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f7846a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final P7 a(Integer num) {
            P7 p7;
            P7[] values = P7.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    p7 = null;
                    break;
                }
                p7 = values[i];
                int b = p7.b();
                if (num != null && b == num.intValue()) {
                    break;
                }
                i++;
            }
            return p7 == null ? P7.UnknownProvider : p7;
        }

        private a() {
        }

        public final P7 a(String dynamicDemandSourceId) {
            Intrinsics.checkNotNullParameter(dynamicDemandSourceId, "dynamicDemandSourceId");
            List split$default = StringsKt.split$default((CharSequence) dynamicDemandSourceId, new String[]{"_"}, false, 0, 6, (Object) null);
            return split$default.size() < 2 ? P7.UnknownProvider : a(StringsKt.toIntOrNull((String) split$default.get(1)));
        }
    }

    P7(int i) {
        this.f7846a = i;
    }

    public final int b() {
        return this.f7846a;
    }
}
