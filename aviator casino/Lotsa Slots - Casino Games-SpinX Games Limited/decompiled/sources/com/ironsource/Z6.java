package com.ironsource;

/* loaded from: classes5.dex */
public enum Z6 {
    SendEvent(0),
    NativeController(1);

    public static final com.ironsource.Z6.a b = new com.ironsource.Z6.a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f6114a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.ironsource.Z6 a(int i) {
            com.ironsource.Z6 z6;
            com.ironsource.Z6[] values = com.ironsource.Z6.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z6 = null;
                    break;
                }
                z6 = values[i2];
                if (z6.b() == i) {
                    break;
                }
                i2++;
            }
            return z6 == null ? com.ironsource.Z6.SendEvent : z6;
        }

        private a() {
        }
    }

    Z6(int i) {
        this.f6114a = i;
    }

    public final int b() {
        return this.f6114a;
    }
}
