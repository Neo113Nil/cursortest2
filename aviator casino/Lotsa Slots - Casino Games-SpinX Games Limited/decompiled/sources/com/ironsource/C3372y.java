package com.ironsource;

/* renamed from: com.ironsource.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3372y implements com.ironsource.InterfaceC3245qf<org.json.JSONObject>, com.ironsource.InterfaceC3209of<com.ironsource.C3336w> {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.String, com.ironsource.I0> f6842a = new java.util.LinkedHashMap();
    private int b;

    /* renamed from: com.ironsource.y$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6843a;

        static {
            int[] iArr = new int[com.ironsource.EnumC3191nf.values().length];
            try {
                iArr[com.ironsource.EnumC3191nf.LoadRequest.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.ironsource.EnumC3191nf.LoadSuccess.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.ironsource.EnumC3191nf.ShowSuccess.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.ironsource.EnumC3191nf.ShowFailed.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.ironsource.EnumC3191nf.Destroyed.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            f6843a = iArr;
        }
    }

    private final void b(com.ironsource.C3336w c3336w) {
        int i;
        int i2 = com.ironsource.C3372y.a.f6843a[c3336w.f().ordinal()];
        if (i2 == 2) {
            this.b++;
        } else if ((i2 == 3 || i2 == 4 || i2 == 5) && (i = this.b) > 0) {
            this.b = i - 1;
        }
    }

    public final int a() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC3209of
    public void a(com.ironsource.C3336w record) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "record");
        java.lang.String c = record.c();
        java.util.Map<java.lang.String, com.ironsource.I0> map = this.f6842a;
        com.ironsource.I0 i0 = map.get(c);
        if (i0 == null) {
            i0 = new com.ironsource.I0();
            map.put(c, i0);
        }
        i0.a(record.a(new com.ironsource.C3354x()));
        b(record);
    }

    @Override // com.ironsource.InterfaceC3004d7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public org.json.JSONObject a(com.ironsource.EnumC3227pf mode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "mode");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry<java.lang.String, com.ironsource.I0> entry : this.f6842a.entrySet()) {
            java.lang.String key = entry.getKey();
            org.json.JSONObject a2 = entry.getValue().a(mode);
            if (a2.length() > 0) {
                jSONObject.put(key, a2);
            }
        }
        return jSONObject;
    }

    public final boolean b() {
        return !this.f6842a.isEmpty();
    }
}
