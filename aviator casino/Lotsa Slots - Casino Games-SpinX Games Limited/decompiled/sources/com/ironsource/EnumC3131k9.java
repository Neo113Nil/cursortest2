package com.ironsource;

/* renamed from: com.ironsource.k9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC3131k9 {
    APP_ACTIVITY(0),
    DIRECT_INTENT(1);

    public static final com.ironsource.EnumC3131k9.a b = new com.ironsource.EnumC3131k9.a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f6344a;

    /* renamed from: com.ironsource.k9$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.ironsource.EnumC3131k9 a(int i) {
            com.ironsource.EnumC3131k9 enumC3131k9;
            com.ironsource.EnumC3131k9[] values = com.ironsource.EnumC3131k9.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC3131k9 = null;
                    break;
                }
                enumC3131k9 = values[i2];
                if (enumC3131k9.b() == i) {
                    break;
                }
                i2++;
            }
            return enumC3131k9 == null ? com.ironsource.EnumC3131k9.APP_ACTIVITY : enumC3131k9;
        }

        private a() {
        }
    }

    EnumC3131k9(int i) {
        this.f6344a = i;
    }

    public final int b() {
        return this.f6344a;
    }
}
