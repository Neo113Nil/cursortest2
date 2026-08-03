package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public abstract class x<T> extends com.ironsource.adqualitysdk.sdk.i.u<android.webkit.WebView, T> {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.ja f3233;

    /* renamed from: ｋ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.z f3235;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private java.util.Map<T, com.ironsource.adqualitysdk.sdk.i.z> f3236 = new java.util.WeakHashMap();

    /* renamed from: ﻛ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.x<T>.a f3234 = new com.ironsource.adqualitysdk.sdk.i.x.a();

    /* renamed from: ﻐ */
    abstract android.view.View mo5780(T t);

    /* renamed from: ﾇ */
    abstract com.ironsource.adqualitysdk.sdk.i.t<android.webkit.WebView, T> mo5785();

    /* renamed from: ﾇ */
    abstract void mo5786(T t, java.util.List<android.webkit.WebView> list);

    /* renamed from: ﾒ */
    abstract com.ironsource.adqualitysdk.sdk.i.z mo5787();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.u, com.ironsource.adqualitysdk.sdk.i.t
    /* renamed from: ｋ */
    public final /* synthetic */ void mo5820(org.json.JSONObject jSONObject, java.lang.Object obj, java.lang.Object obj2) {
        super.mo5817(jSONObject, (org.json.JSONObject) obj, (android.webkit.WebView) obj2);
    }

    public x(com.ironsource.adqualitysdk.sdk.i.ja jaVar) {
        this.f3233 = jaVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    final void m8646(com.ironsource.adqualitysdk.sdk.i.ja jaVar) {
        this.f3233 = jaVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    final void m8648(com.ironsource.adqualitysdk.sdk.i.x<T>.a aVar) {
        this.f3234 = aVar;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    void mo8650(T t, java.lang.String str) {
        m8647(new org.json.JSONObject(), (org.json.JSONObject) t, str);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    final void m8647(final org.json.JSONObject jSONObject, final T t, java.lang.String str) {
        com.ironsource.adqualitysdk.sdk.i.z zVar;
        boolean z = ((com.ironsource.adqualitysdk.sdk.i.x.a) this.f3234).f3253 && !android.text.TextUtils.isEmpty(((com.ironsource.adqualitysdk.sdk.i.x.a) this.f3234).f3255);
        if (((com.ironsource.adqualitysdk.sdk.i.x.a) this.f3234).f3248) {
            zVar = this.f3236.get(t);
        } else {
            zVar = this.f3235;
        }
        if (zVar == null) {
            zVar = mo5787();
            if (((com.ironsource.adqualitysdk.sdk.i.x.a) this.f3234).f3248) {
                this.f3236.put(t, zVar);
            } else {
                this.f3235 = zVar;
            }
            zVar.m8628(mo5785());
        }
        zVar.m8732();
        zVar.m8729(((com.ironsource.adqualitysdk.sdk.i.x.a) this.f3234).f3255, ((com.ironsource.adqualitysdk.sdk.i.x.a) this.f3234).f3252, z, ((com.ironsource.adqualitysdk.sdk.i.x.a) this.f3234).f3251, ((com.ironsource.adqualitysdk.sdk.i.x.a) this.f3234).f3249);
        zVar.m8734(str);
        if (((com.ironsource.adqualitysdk.sdk.i.x.a) this.f3234).f3247) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            mo5786((com.ironsource.adqualitysdk.sdk.i.x<T>) t, (java.util.List<android.webkit.WebView>) arrayList);
            java.util.List<android.webkit.WebView> arrayList2 = new java.util.ArrayList<>();
            com.ironsource.adqualitysdk.sdk.i.ja jaVar = this.f3233;
            if (jaVar != null) {
                arrayList2 = jaVar.mo7214(t);
            }
            final java.util.List<android.webkit.WebView> m8355 = com.ironsource.adqualitysdk.sdk.i.ke.m8355(arrayList, arrayList2);
            if (m8355.isEmpty() || ((com.ironsource.adqualitysdk.sdk.i.x.a) this.f3234).f3250) {
                android.view.View mo5780 = mo5780((com.ironsource.adqualitysdk.sdk.i.x<T>) t);
                if (mo5780 != null) {
                    mo5780.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.x.2

                        /* renamed from: ﻐ, reason: contains not printable characters */
                        private static int f3237 = 1;

                        /* renamed from: ﾇ, reason: contains not printable characters */
                        private static char[] f3238 = {'k', 206, 205, 206, 200, 204, 186, 181, 185, kotlin.text.Typography.middleDot, 202, 204, 203, 203, 206, 191, 192, 211, 207, 128, 'S', io.ktor.util.date.GMTDateParser.SECONDS, kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, '|', 'o', 'v', 'Q', 130, 131, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ, 135, 'o', 'Z', '|', kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ, '.', '|', 'w', '.', 128, kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ, 128};

                        /* renamed from: ﾒ, reason: contains not printable characters */
                        private static int f3239;

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                            int i9 = 2 % 2;
                            java.lang.Object obj = null;
                            try {
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                com.ironsource.adqualitysdk.sdk.i.x.this.mo5786((com.ironsource.adqualitysdk.sdk.i.x) t, (java.util.List<android.webkit.WebView>) arrayList3);
                                if (arrayList3.isEmpty()) {
                                    return;
                                }
                                int i10 = f3237 + 57;
                                f3239 = i10 % 128;
                                int i11 = i10 % 2;
                                android.view.View mo57802 = com.ironsource.adqualitysdk.sdk.i.x.this.mo5780((com.ironsource.adqualitysdk.sdk.i.x) t);
                                if (mo57802 != null && (!com.ironsource.adqualitysdk.sdk.i.x.this.f3234.f3250)) {
                                    int i12 = f3239 + 57;
                                    f3237 = i12 % 128;
                                    if (i12 % 2 == 0) {
                                        mo57802.removeOnLayoutChangeListener(this);
                                        super.hashCode();
                                        throw null;
                                    }
                                    mo57802.removeOnLayoutChangeListener(this);
                                }
                                com.ironsource.adqualitysdk.sdk.i.x.this.m8645((com.ironsource.adqualitysdk.sdk.i.x) t, (java.util.List<android.webkit.WebView>) arrayList3);
                                com.ironsource.adqualitysdk.sdk.i.x.this.mo5822(new org.json.JSONObject(), arrayList3.get(0), t);
                            } catch (java.lang.Throwable th) {
                                com.ironsource.adqualitysdk.sdk.i.kl.m8455(m8651("\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000", new int[]{0, 19, 99, 15}, false).intern(), m8651(null, new int[]{19, 23, 14, 2}, true).intern(), th, false);
                            }
                        }

                        /* renamed from: ﻐ, reason: contains not printable characters */
                        private static java.lang.String m8651(java.lang.String str2, int[] iArr, boolean z2) {
                            java.lang.String str3;
                            byte[] bArr = str2;
                            if (str2 != null) {
                                bArr = str2.getBytes(com.google.android.exoplayer2.C.ISO88591_NAME);
                            }
                            byte[] bArr2 = bArr;
                            synchronized (com.ironsource.adqualitysdk.sdk.i.h.f2296) {
                                int i = iArr[0];
                                int i2 = iArr[1];
                                int i3 = iArr[2];
                                int i4 = iArr[3];
                                char[] cArr = new char[i2];
                                java.lang.System.arraycopy(f3238, i, cArr, 0, i2);
                                if (bArr2 != null) {
                                    char[] cArr2 = new char[i2];
                                    com.ironsource.adqualitysdk.sdk.i.h.f2297 = 0;
                                    char c = 0;
                                    while (com.ironsource.adqualitysdk.sdk.i.h.f2297 < i2) {
                                        if (bArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297] == 1) {
                                            cArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297] = (char) (((cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] << 1) + 1) - c);
                                        } else {
                                            cArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297] = (char) ((cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] << 1) - c);
                                        }
                                        c = cArr2[com.ironsource.adqualitysdk.sdk.i.h.f2297];
                                        com.ironsource.adqualitysdk.sdk.i.h.f2297++;
                                    }
                                    cArr = cArr2;
                                }
                                if (i4 > 0) {
                                    char[] cArr3 = new char[i2];
                                    java.lang.System.arraycopy(cArr, 0, cArr3, 0, i2);
                                    int i5 = i2 - i4;
                                    java.lang.System.arraycopy(cArr3, 0, cArr, i5, i4);
                                    java.lang.System.arraycopy(cArr3, i4, cArr, 0, i5);
                                }
                                if (z2) {
                                    char[] cArr4 = new char[i2];
                                    com.ironsource.adqualitysdk.sdk.i.h.f2297 = 0;
                                    while (com.ironsource.adqualitysdk.sdk.i.h.f2297 < i2) {
                                        cArr4[com.ironsource.adqualitysdk.sdk.i.h.f2297] = cArr[(i2 - com.ironsource.adqualitysdk.sdk.i.h.f2297) - 1];
                                        com.ironsource.adqualitysdk.sdk.i.h.f2297++;
                                    }
                                    cArr = cArr4;
                                }
                                if (i3 > 0) {
                                    com.ironsource.adqualitysdk.sdk.i.h.f2297 = 0;
                                    while (com.ironsource.adqualitysdk.sdk.i.h.f2297 < i2) {
                                        cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] = (char) (cArr[com.ironsource.adqualitysdk.sdk.i.h.f2297] - iArr[2]);
                                        com.ironsource.adqualitysdk.sdk.i.h.f2297++;
                                    }
                                }
                                str3 = new java.lang.String(cArr);
                            }
                            return str3;
                        }
                    });
                }
                if (m8355.isEmpty()) {
                    super.mo5820(jSONObject, null, t);
                    return;
                }
            }
            if (!((com.ironsource.adqualitysdk.sdk.i.x.a) this.f3234).f3246) {
                m8645((com.ironsource.adqualitysdk.sdk.i.x<T>) t, m8355);
                super.mo5820(jSONObject, m8355.get(0), t);
                return;
            } else {
                com.ironsource.adqualitysdk.sdk.i.p.m8553().post(new java.lang.Runnable() { // from class: com.ironsource.adqualitysdk.sdk.i.x.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.ironsource.adqualitysdk.sdk.i.x.this.m8645((com.ironsource.adqualitysdk.sdk.i.x) t, (java.util.List<android.webkit.WebView>) m8355);
                        com.ironsource.adqualitysdk.sdk.i.x.super.mo5820(jSONObject, (android.webkit.WebView) m8355.get(0), t);
                    }
                });
                return;
            }
        }
        super.mo5820(jSONObject, null, t);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    void mo8649(T t) {
        com.ironsource.adqualitysdk.sdk.i.z zVar;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (((com.ironsource.adqualitysdk.sdk.i.x.a) this.f3234).f3248) {
            zVar = this.f3236.get(t);
        } else {
            zVar = this.f3235;
        }
        mo5819(jSONObject, (org.json.JSONObject) zVar.m8728(), (android.webkit.WebView) t);
    }

    public class a {

        /* renamed from: ﮌ, reason: contains not printable characters */
        private boolean f3246;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private boolean f3247;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private boolean f3248;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private boolean f3249;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private boolean f3250;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private boolean f3251;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private java.util.List<java.lang.String> f3252;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private boolean f3253;

        /* renamed from: ｋ, reason: contains not printable characters */
        protected java.util.List<java.lang.String> f3254 = new java.util.ArrayList();

        /* renamed from: ﾇ, reason: contains not printable characters */
        private java.lang.String f3255;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private boolean f3256;

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.x<T>.a m8666(java.lang.String str) {
            this.f3255 = str;
            return this;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.x<T>.a m8670(java.util.List<java.lang.String> list) {
            this.f3252 = list;
            return this;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.x<T>.a m8669(boolean z) {
            this.f3256 = z;
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.x<T>.a m8668(boolean z) {
            this.f3253 = z;
            return this;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.x<T>.a m8672(boolean z) {
            this.f3250 = z;
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.x<T>.a m8665(boolean z) {
            this.f3247 = z;
            return this;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.x<T>.a m8671(boolean z) {
            this.f3251 = z;
            return this;
        }

        /* renamed from: ﮐ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.x<T>.a m8662(boolean z) {
            this.f3249 = z;
            return this;
        }

        /* renamed from: ﻏ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.x<T>.a m8664(boolean z) {
            this.f3248 = z;
            return this;
        }

        /* renamed from: ﱡ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.x<T>.a m8663(boolean z) {
            this.f3246 = z;
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final com.ironsource.adqualitysdk.sdk.i.x<T>.a m8667(java.util.List<java.lang.String> list) {
            if (list != null) {
                this.f3254 = list;
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﻛ, reason: contains not printable characters */
    public void m8645(T t, java.util.List<android.webkit.WebView> list) {
        com.ironsource.adqualitysdk.sdk.i.z zVar;
        com.ironsource.adqualitysdk.sdk.i.z zVar2;
        if (((com.ironsource.adqualitysdk.sdk.i.x.a) this.f3234).f3248) {
            zVar = this.f3236.get(t);
        } else {
            zVar = this.f3235;
        }
        zVar.m8730(list);
        if (((com.ironsource.adqualitysdk.sdk.i.x.a) this.f3234).f3256) {
            if (((com.ironsource.adqualitysdk.sdk.i.x.a) this.f3234).f3248) {
                zVar2 = this.f3236.get(t);
            } else {
                zVar2 = this.f3235;
            }
            zVar2.m8734(java.lang.Integer.toHexString(list.get(0).hashCode()));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.u
    /* renamed from: ﾒ */
    protected final java.lang.String mo5815(T t) {
        com.ironsource.adqualitysdk.sdk.i.z zVar;
        if (((com.ironsource.adqualitysdk.sdk.i.x.a) this.f3234).f3248) {
            zVar = this.f3236.get(t);
        } else {
            zVar = this.f3235;
        }
        return zVar.mo5815((com.ironsource.adqualitysdk.sdk.i.z) t);
    }
}
