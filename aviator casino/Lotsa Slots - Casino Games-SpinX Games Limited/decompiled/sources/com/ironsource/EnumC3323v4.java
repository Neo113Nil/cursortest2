package com.ironsource;

/* renamed from: com.ironsource.v4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC3323v4 {
    IADS("iads"),
    UADS("uads"),
    SHARED("shared"),
    NONE("none");

    public static final com.ironsource.EnumC3323v4.a b = new com.ironsource.EnumC3323v4.a(null);

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6771a;

    /* renamed from: com.ironsource.v4$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final com.ironsource.EnumC3323v4 a(java.lang.String str) {
            com.ironsource.EnumC3323v4 enumC3323v4;
            com.ironsource.EnumC3323v4[] values = com.ironsource.EnumC3323v4.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    enumC3323v4 = null;
                    break;
                }
                enumC3323v4 = values[i];
                if (kotlin.jvm.internal.Intrinsics.areEqual(enumC3323v4.b(), str)) {
                    break;
                }
                i++;
            }
            return enumC3323v4 == null ? com.ironsource.EnumC3323v4.NONE : enumC3323v4;
        }

        private a() {
        }
    }

    EnumC3323v4(java.lang.String str) {
        this.f6771a = str;
    }

    public final java.lang.String b() {
        return this.f6771a;
    }

    @kotlin.jvm.JvmStatic
    public static final com.ironsource.EnumC3323v4 a(java.lang.String str) {
        return b.a(str);
    }
}
