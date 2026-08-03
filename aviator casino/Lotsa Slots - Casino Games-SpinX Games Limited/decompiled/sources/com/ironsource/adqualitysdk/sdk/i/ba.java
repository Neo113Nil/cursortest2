package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ba {

    /* renamed from: ﾒ, reason: contains not printable characters */
    private java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.az> f668 = new java.util.HashMap();

    public interface d extends com.ironsource.adqualitysdk.sdk.i.t {
    }

    public ba() {
        new android.os.Handler(android.os.Looper.getMainLooper());
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ba$3, reason: invalid class name */
    final class AnonymousClass3 extends com.ironsource.adqualitysdk.sdk.i.je {

        /* renamed from: ｋ, reason: contains not printable characters */
        private /* synthetic */ com.ironsource.adqualitysdk.sdk.i.az.b f670;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private /* synthetic */ java.lang.String f672;

        AnonymousClass3(java.lang.String str, com.ironsource.adqualitysdk.sdk.i.az.b bVar) {
            this.f672 = str;
            this.f670 = bVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.je
        /* renamed from: ｋ */
        public final void mo5825() {
            com.ironsource.adqualitysdk.sdk.i.az m6264 = com.ironsource.adqualitysdk.sdk.i.ba.m6264(com.ironsource.adqualitysdk.sdk.i.ba.this, this.f672);
            if (m6264 != null) {
                m6264.m6255(this.f670);
            }
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ba$5, reason: invalid class name */
    final class AnonymousClass5 extends com.ironsource.adqualitysdk.sdk.i.je {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private /* synthetic */ java.lang.String f677;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private /* synthetic */ com.ironsource.adqualitysdk.sdk.i.az.a f678;

        AnonymousClass5(java.lang.String str, com.ironsource.adqualitysdk.sdk.i.az.a aVar) {
            this.f677 = str;
            this.f678 = aVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.je
        /* renamed from: ｋ */
        public final void mo5825() {
            com.ironsource.adqualitysdk.sdk.i.az m6264 = com.ironsource.adqualitysdk.sdk.i.ba.m6264(com.ironsource.adqualitysdk.sdk.i.ba.this, this.f677);
            if (m6264 != null) {
                m6264.m6258(this.f678);
            }
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean m6265(java.util.List<java.lang.String> list) {
        for (java.lang.String str : list) {
            java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.az> map = this.f668;
            com.ironsource.adqualitysdk.sdk.i.az azVar = map != null ? map.get(str) : null;
            if (azVar == null || azVar.m6256() != com.ironsource.adqualitysdk.sdk.i.az.a.f649) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    final void m6269(java.lang.String str) {
        this.f668.put(str, new com.ironsource.adqualitysdk.sdk.i.az(str));
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized boolean m6270(boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z) {
            java.util.Iterator<java.lang.String> it = com.ironsource.adqualitysdk.sdk.i.ay.m6245().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toLowerCase());
            }
        } else {
            arrayList.add(com.ironsource.adqualitysdk.sdk.i.ay.m6237().toLowerCase());
        }
        if (m6265(arrayList)) {
            if (m6266(arrayList)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean m6266(java.util.List<java.lang.String> list) {
        java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.az> map = this.f668;
        if (map != null && !map.isEmpty()) {
            for (java.lang.String str : map.keySet()) {
                if (!list.contains(str)) {
                    java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.az> map2 = this.f668;
                    com.ironsource.adqualitysdk.sdk.i.az azVar = map2 != null ? map2.get(str) : null;
                    if (azVar != null && azVar.m6256() == com.ironsource.adqualitysdk.sdk.i.az.a.f649) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    final java.lang.String m6268(java.lang.String str) {
        java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.az> map = this.f668;
        com.ironsource.adqualitysdk.sdk.i.az azVar = map != null ? map.get(str) : null;
        if (azVar != null) {
            return azVar.m6254();
        }
        return null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ com.ironsource.adqualitysdk.sdk.i.az m6264(com.ironsource.adqualitysdk.sdk.i.ba baVar, java.lang.String str) {
        java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.az> map = baVar.f668;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
