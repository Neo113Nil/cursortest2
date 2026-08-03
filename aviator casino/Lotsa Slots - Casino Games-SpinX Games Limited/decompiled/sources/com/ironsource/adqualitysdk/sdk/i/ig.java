package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ig {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.hx f2502;

    /* renamed from: ｋ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.ii f2503;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.ig.e f2504;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m7968(int i, int i2) {
        return i >= i2;
    }

    /* synthetic */ ig(byte b) {
        this();
    }

    private ig() {
        this.f2504 = new com.ironsource.adqualitysdk.sdk.i.ig.e();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.ii m7976() {
        return this.f2503;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.hx m7977() {
        return this.f2502;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final java.util.List<java.lang.String> m7972() {
        return this.f2504.f2515;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final int m7970() {
        return this.f2504.f2516;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m7973(int i) {
        return m7968(i, this.f2504.f2514);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final int m7974(int i) {
        if (m7968(i, this.f2504.f2512)) {
            return this.f2504.f2513;
        }
        return 0;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m7971(int i) {
        return m7968(i, this.f2504.f2511);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m7978(int i) {
        return m7968(i, this.f2504.f2508);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m7980(int i) {
        return m7968(i, this.f2504.f2507);
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final boolean m7969(int i) {
        return m7968(i, this.f2504.f2510);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m7979() {
        return this.f2504.f2509;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.ig.e m7975(java.lang.Class cls) {
        this.f2504.f2519 = cls;
        return this.f2504;
    }

    static class e {

        /* renamed from: ﭖ, reason: contains not printable characters */
        private java.lang.Object f2506;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private java.util.List<java.lang.String> f2515;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private int f2516;

        /* renamed from: ｋ, reason: contains not printable characters */
        private java.lang.Class f2517;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private java.lang.Class f2518;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private java.lang.Class f2519;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private int f2514 = -1;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private int f2512 = -1;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private int f2513 = -1;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private int f2511 = -1;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private int f2510 = Integer.MAX_VALUE;

        /* renamed from: ﮉ, reason: contains not printable characters */
        private int f2508 = Integer.MAX_VALUE;

        /* renamed from: ﭴ, reason: contains not printable characters */
        private int f2507 = Integer.MAX_VALUE;

        /* renamed from: ﮌ, reason: contains not printable characters */
        private boolean f2509 = true;

        e() {
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                com.ironsource.adqualitysdk.sdk.i.ig.e eVar = (com.ironsource.adqualitysdk.sdk.i.ig.e) obj;
                if (this.f2516 != eVar.f2516 || this.f2514 != eVar.f2514 || this.f2512 != eVar.f2512 || this.f2513 != eVar.f2513 || this.f2511 != eVar.f2511 || this.f2510 != eVar.f2510 || this.f2508 != eVar.f2508 || this.f2507 != eVar.f2507 || this.f2509 != eVar.f2509) {
                    return false;
                }
                java.lang.Class cls = this.f2519;
                if (cls == null ? eVar.f2519 != null : !cls.equals(eVar.f2519)) {
                    return false;
                }
                java.lang.Class cls2 = this.f2518;
                if (cls2 == null ? eVar.f2518 != null : !cls2.equals(eVar.f2518)) {
                    return false;
                }
                java.lang.Class cls3 = this.f2517;
                if (cls3 == null ? eVar.f2517 != null : !cls3.equals(eVar.f2517)) {
                    return false;
                }
                java.util.List<java.lang.String> list = this.f2515;
                if (list == null ? eVar.f2515 != null : !list.equals(eVar.f2515)) {
                    return false;
                }
                java.lang.Object obj2 = this.f2506;
                java.lang.Object obj3 = eVar.f2506;
                if (obj2 != null) {
                    return obj2.equals(obj3);
                }
                if (obj3 == null) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            java.lang.Class cls = this.f2519;
            int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
            java.lang.Class cls2 = this.f2518;
            int hashCode2 = (hashCode + (cls2 != null ? cls2.hashCode() : 0)) * 31;
            java.lang.Class cls3 = this.f2517;
            int hashCode3 = (hashCode2 + (cls3 != null ? cls3.hashCode() : 0)) * 31;
            java.util.List<java.lang.String> list = this.f2515;
            int hashCode4 = (((((((((((((((((((hashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.f2516) * 31) + this.f2514) * 31) + this.f2512) * 31) + this.f2513) * 31) + this.f2511) * 31) + this.f2510) * 31) + this.f2508) * 31) + this.f2507) * 31) + (this.f2509 ? 1 : 0)) * 31;
            java.lang.Object obj = this.f2506;
            return hashCode4 + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static class d {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private com.ironsource.adqualitysdk.sdk.i.ig f2505 = new com.ironsource.adqualitysdk.sdk.i.ig(0);

        /* renamed from: ﾒ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.ig.d m7994(int i) {
            this.f2505.f2504.f2514 = i;
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.ig.d m7986(int i) {
            this.f2505.f2504.f2512 = i;
            return this;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.ig.d m7988(int i) {
            this.f2505.f2504.f2513 = i;
            return this;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.ig.d m7991(int i) {
            this.f2505.f2504.f2511 = i;
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.ig.d m7984(int i) {
            this.f2505.f2504.f2508 = i;
            return this;
        }

        /* renamed from: ﱟ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.ig.d m7981(int i) {
            this.f2505.f2504.f2510 = i;
            return this;
        }

        /* renamed from: ﻏ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.ig.d m7983(int i) {
            this.f2505.f2504.f2507 = i;
            return this;
        }

        /* renamed from: ﱡ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.ig.d m7982(boolean z) {
            this.f2505.f2504.f2509 = z;
            return this;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.ig.d m7989(java.lang.Object obj) {
            this.f2505.f2504.f2506 = obj;
            return this;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.ig m7996(com.ironsource.adqualitysdk.sdk.i.ii iiVar, java.util.List<java.lang.String> list, int i) {
            return m7993(iiVar, null, list, i);
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.ig m7993(com.ironsource.adqualitysdk.sdk.i.ii iiVar, com.ironsource.adqualitysdk.sdk.i.hx hxVar, java.util.List<java.lang.String> list, int i) {
            this.f2505.f2503 = iiVar;
            this.f2505.f2502 = hxVar;
            this.f2505.f2504.f2515 = list;
            this.f2505.f2504.f2516 = i;
            this.f2505.f2504.f2518 = iiVar.getClass();
            this.f2505.f2504.f2517 = hxVar != null ? hxVar.getClass() : null;
            return this.f2505;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.ig.d m7990(boolean z) {
            this.f2505.f2504.f2512 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.ig.d m7992(boolean z) {
            this.f2505.f2504.f2511 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.ig.d m7987(boolean z) {
            this.f2505.f2504.f2508 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.ig.d m7985(boolean z) {
            this.f2505.f2504.f2510 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.ig.d m7995(boolean z) {
            this.f2505.f2504.f2507 = z ? -1 : Integer.MAX_VALUE;
            return this;
        }
    }
}
