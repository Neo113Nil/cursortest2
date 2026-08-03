package com.ironsource.mediationsdk.adquality;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.mediationsdk.adquality.a.b f6396a = new com.ironsource.mediationsdk.adquality.a.b(null);
    private static com.ironsource.mediationsdk.adquality.a.EnumC0156a b = com.ironsource.mediationsdk.adquality.a.EnumC0156a.DONT_INITIALIZE;

    /* renamed from: com.ironsource.mediationsdk.adquality.a$a, reason: collision with other inner class name */
    public enum EnumC0156a {
        DONT_INITIALIZE(0),
        LEVELPLAY_ONLY(1),
        ALL_MEDIATIONS(2),
        OTHER_ONLY(3);

        public static final com.ironsource.mediationsdk.adquality.a.EnumC0156a.C0157a b = new com.ironsource.mediationsdk.adquality.a.EnumC0156a.C0157a(null);

        /* renamed from: a, reason: collision with root package name */
        private final int f6397a;

        /* renamed from: com.ironsource.mediationsdk.adquality.a$a$a, reason: collision with other inner class name */
        public static final class C0157a {
            public /* synthetic */ C0157a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final com.ironsource.mediationsdk.adquality.a.EnumC0156a a(int i) {
                com.ironsource.mediationsdk.adquality.a.EnumC0156a enumC0156a;
                com.ironsource.mediationsdk.adquality.a.EnumC0156a[] values = com.ironsource.mediationsdk.adquality.a.EnumC0156a.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        enumC0156a = null;
                        break;
                    }
                    enumC0156a = values[i2];
                    if (enumC0156a.b() == i) {
                        break;
                    }
                    i2++;
                }
                return enumC0156a == null ? com.ironsource.mediationsdk.adquality.a.EnumC0156a.DONT_INITIALIZE : enumC0156a;
            }

            private C0157a() {
            }
        }

        EnumC0156a(int i) {
            this.f6397a = i;
        }

        public final int b() {
            return this.f6397a;
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.ironsource.mediationsdk.adquality.a.EnumC0156a a() {
            return com.ironsource.mediationsdk.adquality.a.b;
        }

        private b() {
        }

        public final void a(com.ironsource.mediationsdk.adquality.a.EnumC0156a enumC0156a) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumC0156a, "<set-?>");
            com.ironsource.mediationsdk.adquality.a.b = enumC0156a;
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6398a;

        static {
            int[] iArr = new int[com.ironsource.mediationsdk.adquality.a.EnumC0156a.values().length];
            try {
                iArr[com.ironsource.mediationsdk.adquality.a.EnumC0156a.LEVELPLAY_ONLY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.ironsource.mediationsdk.adquality.a.EnumC0156a.ALL_MEDIATIONS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.ironsource.mediationsdk.adquality.a.EnumC0156a.OTHER_ONLY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f6398a = iArr;
        }
    }

    public final boolean b() {
        com.ironsource.EnumC3315ue enumC3315ue;
        org.json.JSONArray optJSONArray = new com.ironsource.C3006d9().a().optJSONArray(com.ironsource.M6.g0);
        if (optJSONArray == null) {
            return false;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            int i2 = optJSONArray.getInt(i);
            com.ironsource.EnumC3315ue[] values = com.ironsource.EnumC3315ue.values();
            int length2 = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    enumC3315ue = null;
                    break;
                }
                enumC3315ue = values[i3];
                if (enumC3315ue.b() == i2) {
                    break;
                }
                i3++;
            }
            if (enumC3315ue != null) {
                linkedHashSet.add(enumC3315ue);
            }
        }
        int i4 = com.ironsource.mediationsdk.adquality.a.c.f6398a[b.ordinal()];
        if (i4 == 1) {
            return linkedHashSet.contains(com.ironsource.EnumC3315ue.LEVEL_PLAY_INIT);
        }
        if (i4 == 2) {
            return linkedHashSet.contains(com.ironsource.EnumC3315ue.LEVEL_PLAY_INIT) || linkedHashSet.contains(com.ironsource.EnumC3315ue.EXTERNAL_MEDIATION_INIT);
        }
        if (i4 != 3) {
            return false;
        }
        return linkedHashSet.contains(com.ironsource.EnumC3315ue.EXTERNAL_MEDIATION_INIT);
    }

    public final void a(int i) {
        b = com.ironsource.mediationsdk.adquality.a.EnumC0156a.b.a(i);
    }
}
