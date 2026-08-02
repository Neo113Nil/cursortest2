package com.facetec.sdk;

/* loaded from: classes8.dex */
final class ab {
    private android.content.Context b;

    /* renamed from: a, reason: collision with root package name */
    java.util.List<com.facetec.sdk.v> f3375a = new java.util.ArrayList();
    private int c = 2;
    private int h = 0;
    int e = 0;
    int d = 0;
    private boolean j = false;
    private boolean f = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static final class b {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;

        /* renamed from: a, reason: collision with root package name */
        public static final com.facetec.sdk.ab.b f3376a;
        public static final com.facetec.sdk.ab.b b;
        public static final com.facetec.sdk.ab.b c;
        public static final com.facetec.sdk.ab.b d;
        public static final com.facetec.sdk.ab.b e;
        public static final com.facetec.sdk.ab.b f;
        private static char[] h;
        private static long i;
        private static final /* synthetic */ com.facetec.sdk.ab.b[] j;
        private static int k;
        private static int l;
        private static int m;

        /* renamed from: o, reason: collision with root package name */
        private static int f3377o;
        final java.lang.String g;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static java.lang.String $$c(int i2, short s, int i3) {
            int i4;
            byte[] bArr = $$a;
            int i5 = 106 - s;
            int i6 = 4 - (i3 * 2);
            int i7 = i2 * 4;
            byte[] bArr2 = new byte[1 - i7];
            int i8 = 0 - i7;
            if (bArr == null) {
                int i9 = i6;
                int i10 = 0;
                int i11 = i8;
                i5 = (-i5) + i11;
                i6 = i9 + 1;
                i4 = i10;
                bArr2[i4] = (byte) i5;
                if (i4 == i8) {
                    return new java.lang.String(bArr2, 0);
                }
                int i12 = bArr[i6];
                int i13 = i6;
                i11 = i5;
                i5 = i12;
                i10 = i4 + 1;
                i9 = i13;
                i5 = (-i5) + i11;
                i6 = i9 + 1;
                i4 = i10;
                bArr2[i4] = (byte) i5;
                if (i4 == i8) {
                }
            } else {
                i4 = 0;
                bArr2[i4] = (byte) i5;
                if (i4 == i8) {
                }
            }
        }

        static void init$0() {
            $$a = new byte[]{64, com.google.common.base.Ascii.SYN, -17, -83};
            $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE;
        }

        private static /* synthetic */ com.facetec.sdk.ab.b[] a() {
            int i2 = m + 81;
            k = i2 % 128;
            if (i2 % 2 == 0) {
                return new com.facetec.sdk.ab.b[]{c, f3376a, e, d, b, f};
            }
            com.facetec.sdk.ab.b[] bVarArr = new com.facetec.sdk.ab.b[61];
            bVarArr[0] = c;
            bVarArr[1] = f3376a;
            bVarArr[4] = e;
            bVarArr[2] = d;
            bVarArr[5] = b;
            bVarArr[5] = f;
            return bVarArr;
        }

        public static com.facetec.sdk.ab.b valueOf(java.lang.String str) {
            int i2 = k + 47;
            m = i2 % 128;
            com.facetec.sdk.ab.b bVar = (com.facetec.sdk.ab.b) java.lang.Enum.valueOf(com.facetec.sdk.ab.b.class, str);
            if (i2 % 2 == 0) {
                int i3 = 75 / 0;
            }
            return bVar;
        }

        public static com.facetec.sdk.ab.b[] values() {
            m = (k + 73) % 128;
            com.facetec.sdk.ab.b[] bVarArr = (com.facetec.sdk.ab.b[]) j.clone();
            m = (k + 7) % 128;
            return bVarArr;
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            l = 0;
            f3377o = 1;
            k = 0;
            m = 1;
            c();
            c = new com.facetec.sdk.ab.b("HASH_SET_ARRAY", 0, "haia");
            f3376a = new com.facetec.sdk.ab.b("VERSION", 1, "v");
            java.lang.Object[] objArr = new java.lang.Object[1];
            n(-android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.View.MeasureSpec.getMode(0), android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr);
            e = new com.facetec.sdk.ab.b("REVISION", 2, ((java.lang.String) objArr[0]).intern());
            d = new com.facetec.sdk.ab.b("SIZE", 3, lib.android.paypal.com.magnessdk.g.n2);
            b = new com.facetec.sdk.ab.b("SESSION_COUNT", 4, "sc");
            f = new com.facetec.sdk.ab.b("TAMPERING_DETECTED", 5, lib.android.paypal.com.magnessdk.g.q2);
            j = a();
            int i2 = f3377o + 103;
            l = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        private b(java.lang.String str, int i2, java.lang.String str2) {
            this.g = str2;
        }

        private static void n(int i2, char c2, int i3, java.lang.Object[] objArr) {
            com.facetec.sdk.hh hhVar = new com.facetec.sdk.hh();
            long[] jArr = new long[i2];
            hhVar.e = 0;
            while (hhVar.e < i2) {
                $10 = ($11 + 13) % 128;
                int i4 = hhVar.e;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(h[i3 + i4])};
                    java.lang.Object d2 = com.facetec.sdk.al.d(-719238807);
                    if (d2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        d2 = com.facetec.sdk.al.c((char) (45149 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), 2151 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 23 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 1926116241, false, $$c(b2, b3, (byte) (b3 - 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) d2).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i4), java.lang.Long.valueOf(i), java.lang.Integer.valueOf(c2)};
                    java.lang.Object d3 = com.facetec.sdk.al.d(671690243);
                    if (d3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        d3 = com.facetec.sdk.al.c((char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.graphics.Color.red(0) + 1834, 25 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1880730373, false, $$c(b4, b5, b5), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) d3).invoke(null, objArr3)).longValue();
                    java.lang.Object[] objArr4 = {hhVar, hhVar};
                    java.lang.Object d4 = com.facetec.sdk.al.d(898558648);
                    if (d4 == null) {
                        char resolveSizeAndState = (char) android.view.View.resolveSizeAndState(0, 0, 0);
                        int keyCodeFromString = android.view.KeyEvent.keyCodeFromString("");
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        byte length = (byte) $$a.length;
                        d4 = com.facetec.sdk.al.c(resolveSizeAndState, 2341 - keyCodeFromString, (elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)) + 23, -1839099840, false, $$c((byte) 0, length, (byte) (length - 4)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) d4).invoke(null, objArr4);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i2];
            hhVar.e = 0;
            while (hhVar.e < i2) {
                cArr[hhVar.e] = (char) jArr[hhVar.e];
                java.lang.Object[] objArr5 = {hhVar, hhVar};
                java.lang.Object d5 = com.facetec.sdk.al.d(898558648);
                if (d5 == null) {
                    char argb = (char) android.graphics.Color.argb(0, 0, 0, 0);
                    int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
                    int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    byte length2 = (byte) $$a.length;
                    d5 = com.facetec.sdk.al.c(argb, (scrollBarFadeDuration >> 16) + 2341, 23 - indexOf, -1839099840, false, $$c((byte) 0, length2, (byte) (length2 - 4)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) d5).invoke(null, objArr5);
            }
            java.lang.String str = new java.lang.String(cArr);
            $11 = ($10 + 115) % 128;
            objArr[0] = str;
        }

        static void c() {
            h = new char[]{27752};
            i = 5852963399183560383L;
        }
    }

    static final class e {

        /* renamed from: a, reason: collision with root package name */
        int f3378a;
        int d;

        e(int i, int i2) {
            this.d = i;
            this.f3378a = i2;
        }
    }

    ab(android.content.Context context) {
        this.b = context.getApplicationContext();
    }

    final java.util.List<com.facetec.sdk.ab.e> c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.f3375a.size(); i++) {
            com.facetec.sdk.ab.e eVar = new com.facetec.sdk.ab.e(i, i);
            if (this.f3375a.get(i).b == com.facetec.sdk.x.DETECTED) {
                eVar.f3378a -= this.f3375a.size();
            }
            if (this.f3375a.get(i).e == com.facetec.sdk.x.DETECTED) {
                eVar.f3378a -= this.f3375a.size();
            }
            if (this.f3375a.get(i).h == com.facetec.sdk.x.DETECTED) {
                eVar.f3378a -= this.f3375a.size();
            }
            arrayList.add(eVar);
        }
        java.util.Collections.sort(arrayList, new java.util.Comparator() { // from class: com.facetec.sdk.ab$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int a2;
                a2 = com.facetec.sdk.ab.a((com.facetec.sdk.ab.e) obj, (com.facetec.sdk.ab.e) obj2);
                return a2;
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(com.facetec.sdk.ab.e eVar, com.facetec.sdk.ab.e eVar2) {
        return eVar.f3378a - eVar2.f3378a;
    }

    final org.json.JSONObject e() {
        int i;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<com.facetec.sdk.v> it = this.f3375a.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().b());
        }
        try {
        } catch (org.json.JSONException e2) {
            android.content.Context context = this.b;
            com.facetec.sdk.c cVar = com.facetec.sdk.c.F2F_ERROR;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error 4470: ");
            sb.append(e2.getMessage());
            com.facetec.sdk.t.c(context, cVar, sb.toString(), e2);
            return jSONObject;
        }
        for (com.facetec.sdk.ab.b bVar : com.facetec.sdk.ab.b.values()) {
            switch (com.facetec.sdk.ab.AnonymousClass4.c[bVar.ordinal()]) {
                case 1:
                    jSONObject.put(bVar.g, jSONArray);
                    continue;
                case 2:
                    jSONObject.put(bVar.g, this.c);
                    continue;
                case 3:
                    jSONObject.put(bVar.g, this.h);
                    continue;
                case 4:
                    jSONObject.put(bVar.g, this.e);
                    continue;
                case 5:
                    jSONObject.put(bVar.g, this.d);
                    continue;
                case 6:
                    jSONObject.put(bVar.g, this.j);
                    continue;
                default:
                    continue;
            }
            android.content.Context context2 = this.b;
            com.facetec.sdk.c cVar2 = com.facetec.sdk.c.F2F_ERROR;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Error 4470: ");
            sb2.append(e2.getMessage());
            com.facetec.sdk.t.c(context2, cVar2, sb2.toString(), e2);
            return jSONObject;
        }
        return jSONObject;
    }

    /* renamed from: com.facetec.sdk.ab$4, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[com.facetec.sdk.ab.b.values().length];
            c = iArr;
            try {
                iArr[com.facetec.sdk.ab.b.c.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                c[com.facetec.sdk.ab.b.f3376a.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                c[com.facetec.sdk.ab.b.e.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                c[com.facetec.sdk.ab.b.d.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                c[com.facetec.sdk.ab.b.b.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                c[com.facetec.sdk.ab.b.f.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    static com.facetec.sdk.ab e(android.content.Context context, java.lang.String str) {
        com.facetec.sdk.ab abVar = new com.facetec.sdk.ab(context);
        if (str != null && !str.isEmpty()) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                org.json.JSONArray jSONArray = jSONObject.getJSONArray(com.facetec.sdk.ab.b.c.g);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(com.facetec.sdk.v.b(jSONArray.getJSONObject(i).toString()));
                }
                for (com.facetec.sdk.ab.b bVar : com.facetec.sdk.ab.b.values()) {
                    switch (com.facetec.sdk.ab.AnonymousClass4.c[bVar.ordinal()]) {
                        case 1:
                            abVar.f3375a = arrayList;
                            break;
                        case 2:
                            abVar.c = jSONObject.getInt(bVar.g);
                            break;
                        case 3:
                            abVar.h = jSONObject.getInt(bVar.g);
                            break;
                        case 4:
                            abVar.e = jSONObject.getInt(bVar.g);
                            break;
                        case 5:
                            abVar.d = jSONObject.getInt(bVar.g);
                            break;
                        case 6:
                            abVar.j = jSONObject.getBoolean(bVar.g);
                            break;
                    }
                }
                abVar.f = true;
                abVar.h++;
                return abVar;
            } catch (java.lang.Exception e2) {
                abVar.j = true;
                com.facetec.sdk.c cVar = com.facetec.sdk.c.F2F_ERROR;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error 4471: ");
                sb.append(e2.getMessage());
                com.facetec.sdk.t.c(context, cVar, sb.toString(), e2);
            }
        }
        return abVar;
    }
}
