package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public class hw {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private java.util.List<java.lang.reflect.Field> f2444;

    /* renamed from: ｋ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.hw.d f2445;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.hz f2446;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final java.lang.reflect.Field m7865(java.lang.Class cls, final java.lang.String str) {
        com.ironsource.adqualitysdk.sdk.i.hw.d dVar = new com.ironsource.adqualitysdk.sdk.i.hw.d(this) { // from class: com.ironsource.adqualitysdk.sdk.i.hw.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.hw.d
            /* renamed from: ﻐ, reason: contains not printable characters */
            public final boolean mo7869(java.lang.reflect.Field field) {
                return field.getType().getName().toLowerCase().startsWith(str.toLowerCase());
            }
        };
        synchronized (com.ironsource.adqualitysdk.sdk.i.hw.class) {
            if (this.f2444 == null) {
                this.f2444 = new java.util.ArrayList();
            }
            this.f2444.clear();
            m7863(cls, dVar, this.f2444);
            if (this.f2444.isEmpty()) {
                return null;
            }
            return this.f2444.get(0);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final <T> java.lang.reflect.Field m7866(java.lang.Class cls, java.lang.Class<T> cls2) {
        java.lang.reflect.Field m7868;
        synchronized (com.ironsource.adqualitysdk.sdk.i.ke.class) {
            if (this.f2446 == null) {
                this.f2446 = new com.ironsource.adqualitysdk.sdk.i.hz();
            }
            this.f2446.m7886(cls2);
            m7868 = m7868(cls, this.f2446);
        }
        return m7868;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final java.lang.reflect.Field m7868(java.lang.Class cls, com.ironsource.adqualitysdk.sdk.i.hz hzVar) {
        synchronized (com.ironsource.adqualitysdk.sdk.i.ke.class) {
            if (this.f2444 == null) {
                this.f2444 = new java.util.ArrayList();
            }
            this.f2444.clear();
            m7860(cls, hzVar, this.f2444);
            if (this.f2444.isEmpty()) {
                return null;
            }
            return this.f2444.get(0);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final java.util.List<java.lang.reflect.Field> m7867(java.lang.Class cls, com.ironsource.adqualitysdk.sdk.i.hz hzVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        m7860(cls, hzVar, arrayList);
        return arrayList;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m7860(java.lang.Class cls, com.ironsource.adqualitysdk.sdk.i.hz hzVar, java.util.List<java.lang.reflect.Field> list) {
        synchronized (com.ironsource.adqualitysdk.sdk.i.hw.class) {
            if (this.f2445 == null) {
                this.f2445 = new com.ironsource.adqualitysdk.sdk.i.hw.d(this);
            }
            this.f2445.m7871(hzVar);
            m7863(cls, this.f2445, list);
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static com.ironsource.adqualitysdk.sdk.i.hz.d m7861() {
        return new com.ironsource.adqualitysdk.sdk.i.hz.d();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static java.lang.reflect.Field[] m7864(java.lang.Class cls, boolean z, int i, java.util.List<java.lang.String> list) {
        while (cls != null && !com.ironsource.adqualitysdk.sdk.i.kk.m8429(cls, list)) {
            cls = cls.getSuperclass();
        }
        java.lang.reflect.Field[] fieldArr = new java.lang.reflect.Field[0];
        if (cls != null) {
            java.lang.reflect.Field[] fieldArr2 = new java.lang.reflect.Field[0];
            java.lang.reflect.Field[] fieldArr3 = new java.lang.reflect.Field[0];
            try {
                fieldArr2 = cls.getDeclaredFields();
            } catch (java.lang.Error unused) {
            }
            try {
                fieldArr3 = cls.getFields();
            } catch (java.lang.Error unused2) {
            }
            fieldArr = com.ironsource.adqualitysdk.sdk.i.kk.m8436(fieldArr2, fieldArr3);
            if (!z) {
                return fieldArr;
            }
            java.lang.Class superclass = cls.getSuperclass();
            for (int i2 = 0; superclass != null && i2 != i; i2++) {
                try {
                    fieldArr = com.ironsource.adqualitysdk.sdk.i.kk.m8436(fieldArr, superclass.getDeclaredFields());
                } catch (java.lang.Error unused3) {
                }
                try {
                    fieldArr = com.ironsource.adqualitysdk.sdk.i.kk.m8436(fieldArr, superclass.getFields());
                } catch (java.lang.Error unused4) {
                }
                superclass = superclass.getSuperclass();
            }
        }
        return fieldArr;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m7863(java.lang.Class cls, com.ironsource.adqualitysdk.sdk.i.hw.d dVar, java.util.List<java.lang.reflect.Field> list) {
        for (java.lang.reflect.Field field : m7862(cls, dVar.m7870())) {
            if (dVar.mo7869(field)) {
                field.setAccessible(true);
                list.add(field);
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static java.lang.reflect.Field[] m7862(java.lang.Class cls, com.ironsource.adqualitysdk.sdk.i.hz hzVar) {
        if (hzVar != null && hzVar.m7873()) {
            return m7864(cls, hzVar.m7873(), hzVar.m7875(), null);
        }
        try {
            return cls.getDeclaredFields();
        } catch (java.lang.Error unused) {
            return cls.getFields();
        }
    }

    class d {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private int f2448;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private com.ironsource.adqualitysdk.sdk.i.hz f2449;

        private d() {
        }

        /* synthetic */ d(com.ironsource.adqualitysdk.sdk.i.hw hwVar) {
            this();
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final void m7871(com.ironsource.adqualitysdk.sdk.i.hz hzVar) {
            this.f2449 = hzVar;
            this.f2448 = hzVar.m7882();
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.hz m7870() {
            return this.f2449;
        }

        /* renamed from: ﻐ */
        public boolean mo7869(java.lang.reflect.Field field) {
            boolean isAssignableFrom;
            if (this.f2449 == null || (field.getModifiers() & this.f2449.m7874()) != this.f2449.m7874() || (field.getModifiers() & this.f2449.m7877()) != 0 || this.f2449.m7884().contains(field.getType())) {
                return false;
            }
            if (this.f2449.m7883()) {
                isAssignableFrom = field.getType().equals(this.f2449.m7885());
            } else {
                isAssignableFrom = this.f2449.m7885().isAssignableFrom(field.getType());
            }
            if (isAssignableFrom) {
                int i = this.f2448;
                if (i == 0) {
                    return true;
                }
                this.f2448 = i - 1;
            }
            return false;
        }
    }
}
