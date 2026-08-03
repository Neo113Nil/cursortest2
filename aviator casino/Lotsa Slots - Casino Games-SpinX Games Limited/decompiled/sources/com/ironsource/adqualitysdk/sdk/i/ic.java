package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ic {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.dl f2482;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.ic f2483;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static java.util.List<java.lang.reflect.Method> m7920(java.lang.Class cls, com.ironsource.adqualitysdk.sdk.i.ie ieVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        m7923(cls, ieVar, arrayList);
        return arrayList;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m7923(java.lang.Class cls, com.ironsource.adqualitysdk.sdk.i.ie ieVar, java.util.List<java.lang.reflect.Method> list) {
        com.ironsource.adqualitysdk.sdk.i.ic.c cVar = new com.ironsource.adqualitysdk.sdk.i.ic.c((byte) 0);
        cVar.m7932(ieVar);
        m7921(cls, cVar, list);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m7921(java.lang.Class cls, com.ironsource.adqualitysdk.sdk.i.ic.c cVar, java.util.List<java.lang.reflect.Method> list) {
        java.util.List<java.lang.reflect.Method> asList;
        com.ironsource.adqualitysdk.sdk.i.ie m7931 = cVar.m7931();
        if (m7931 != null && m7931.m7873()) {
            asList = m7924(cls, m7931.m7873(), m7931.m7875());
        } else {
            asList = java.util.Arrays.asList(cls.getDeclaredMethods());
        }
        for (java.lang.reflect.Method method : asList) {
            if (cVar.m7933(method)) {
                list.add(method);
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.util.List<java.lang.reflect.Method> m7924(java.lang.Class cls, boolean z, int i) {
        java.lang.reflect.Method[] methodArr = new java.lang.reflect.Method[0];
        if (cls != null) {
            methodArr = com.ironsource.adqualitysdk.sdk.i.kk.m8427(cls.getDeclaredMethods(), cls.getMethods());
            if (!z) {
                return java.util.Arrays.asList(methodArr);
            }
            java.lang.Class superclass = cls.getSuperclass();
            for (int i2 = 0; superclass != null && i2 != i; i2++) {
                methodArr = com.ironsource.adqualitysdk.sdk.i.kk.m8427(com.ironsource.adqualitysdk.sdk.i.kk.m8427(methodArr, superclass.getDeclaredMethods()), superclass.getMethods());
                superclass = superclass.getSuperclass();
            }
        }
        return java.util.Arrays.asList(methodArr);
    }

    static class c {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private com.ironsource.adqualitysdk.sdk.i.ie f2484;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private int f2485;

        private c() {
        }

        /* synthetic */ c(byte b) {
            this();
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final void m7932(com.ironsource.adqualitysdk.sdk.i.ie ieVar) {
            this.f2484 = ieVar;
            this.f2485 = ieVar.m7949();
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.ie m7931() {
            return this.f2484;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00a5, code lost:
        
            if (r7 != false) goto L36;
         */
        /* renamed from: ｋ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean m7933(java.lang.reflect.Method method) {
            boolean isAssignableFrom;
            if (this.f2484 == null || (method.getModifiers() & this.f2484.m7874()) != this.f2484.m7874() || (method.getModifiers() & this.f2484.m7877()) != 0 || this.f2484.m7946().contains(method.getReturnType())) {
                return false;
            }
            java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
            if (this.f2484.m7944() != -1 && this.f2484.m7944() != parameterTypes.length) {
                return false;
            }
            java.util.List<java.lang.Class> m7947 = this.f2484.m7947();
            if (m7947 != null) {
                if (m7947.size() != parameterTypes.length) {
                    return false;
                }
                for (int i = 0; i < m7947.size(); i++) {
                    if (!m7947.get(i).equals(parameterTypes[i])) {
                        return false;
                    }
                }
            }
            if (this.f2484.m7948() != null) {
                if (this.f2484.m7945()) {
                    isAssignableFrom = method.getReturnType().equals(this.f2484.m7948());
                } else {
                    isAssignableFrom = this.f2484.m7948().isAssignableFrom(method.getReturnType());
                }
            }
            int i2 = this.f2485;
            if (i2 == 0) {
                return true;
            }
            this.f2485 = i2 - 1;
            return false;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static java.lang.reflect.Method m7922(java.lang.Class cls, com.ironsource.adqualitysdk.sdk.i.ie ieVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        m7923(cls, ieVar, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (java.lang.reflect.Method) arrayList.get(0);
    }

    public ic() {
    }

    public ic(com.ironsource.adqualitysdk.sdk.i.dl dlVar, com.ironsource.adqualitysdk.sdk.i.ic icVar) {
        this.f2482 = dlVar;
        this.f2483 = icVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final java.lang.String m7925() {
        return this.f2482.m7577();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.ic m7928() {
        return this.f2483;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final java.util.List<java.lang.String> m7929() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f2482.m7578());
        com.ironsource.adqualitysdk.sdk.i.ic icVar = this.f2483;
        if (icVar != null) {
            arrayList.addAll(icVar.m7929());
        }
        return arrayList;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final java.util.List<com.ironsource.adqualitysdk.sdk.i.dm> m7927() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f2482.m7575());
        com.ironsource.adqualitysdk.sdk.i.ic icVar = this.f2483;
        if (icVar != null) {
            arrayList.addAll(icVar.m7927());
        }
        return arrayList;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.dh m7926(java.lang.String str) {
        com.ironsource.adqualitysdk.sdk.i.dh dhVar;
        com.ironsource.adqualitysdk.sdk.i.ic icVar = this;
        do {
            dhVar = icVar.f2482.m7574().get(str);
            if (dhVar != null) {
                break;
            }
            icVar = icVar.f2483;
        } while (icVar != null);
        return dhVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final com.ironsource.adqualitysdk.sdk.i.dz m7930(java.lang.String str) {
        com.ironsource.adqualitysdk.sdk.i.dz dzVar;
        com.ironsource.adqualitysdk.sdk.i.ic icVar = this;
        do {
            dzVar = icVar.f2482.m7580().get(str);
            if (dzVar != null) {
                break;
            }
            icVar = icVar.f2483;
        } while (icVar != null);
        return dzVar;
    }
}
