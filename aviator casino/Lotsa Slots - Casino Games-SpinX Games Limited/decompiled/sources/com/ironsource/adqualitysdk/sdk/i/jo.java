package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class jo {

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static com.ironsource.adqualitysdk.sdk.i.jo f2854;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.js f2855;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean f2857;

    /* renamed from: ｋ, reason: contains not printable characters */
    private android.view.Choreographer.FrameCallback f2858;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private java.util.HashMap<com.ironsource.adqualitysdk.sdk.i.iw, com.ironsource.adqualitysdk.sdk.i.je> f2856 = new java.util.HashMap<>();

    /* renamed from: ﾒ, reason: contains not printable characters */
    private android.os.Handler f2859 = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ boolean m8240(com.ironsource.adqualitysdk.sdk.i.jo joVar) {
        joVar.f2857 = false;
        return false;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static synchronized com.ironsource.adqualitysdk.sdk.i.jo m8245() {
        com.ironsource.adqualitysdk.sdk.i.jo joVar;
        synchronized (com.ironsource.adqualitysdk.sdk.i.jo.class) {
            if (f2854 == null) {
                f2854 = new com.ironsource.adqualitysdk.sdk.i.jo();
            }
            joVar = f2854;
        }
        return joVar;
    }

    private jo() {
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jo$4, reason: invalid class name */
    final class AnonymousClass4 extends com.ironsource.adqualitysdk.sdk.i.je {
        AnonymousClass4() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.je
        /* renamed from: ｋ */
        public final void mo5825() {
            if (com.ironsource.adqualitysdk.sdk.i.jo.this.f2855 == null) {
                com.ironsource.adqualitysdk.sdk.i.jo.this.f2855 = new com.ironsource.adqualitysdk.sdk.i.js() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.4.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.js, com.ironsource.adqualitysdk.sdk.i.jr
                    /* renamed from: ﾇ */
                    public final void mo5967(android.app.Activity activity) {
                        com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.4.2.4
                            @Override // com.ironsource.adqualitysdk.sdk.i.je
                            /* renamed from: ｋ */
                            public final void mo5825() {
                                final com.ironsource.adqualitysdk.sdk.i.jo joVar = com.ironsource.adqualitysdk.sdk.i.jo.this;
                                com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.5
                                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                                    /* renamed from: ｋ */
                                    public final void mo5825() {
                                        com.ironsource.adqualitysdk.sdk.i.jo.m8240(com.ironsource.adqualitysdk.sdk.i.jo.this);
                                    }
                                });
                            }
                        });
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.js, com.ironsource.adqualitysdk.sdk.i.jr
                    /* renamed from: ﾒ */
                    public final void mo5968(android.app.Activity activity) {
                        com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.4.2.1
                            @Override // com.ironsource.adqualitysdk.sdk.i.je
                            /* renamed from: ｋ */
                            public final void mo5825() {
                                com.ironsource.adqualitysdk.sdk.i.jo.m8250(com.ironsource.adqualitysdk.sdk.i.jo.this);
                            }
                        });
                    }
                };
                com.ironsource.adqualitysdk.sdk.i.jo.this.f2859.post(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.4.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5825() {
                        com.ironsource.adqualitysdk.sdk.i.jt.m8287().m8292(com.ironsource.adqualitysdk.sdk.i.jo.this.f2855);
                        com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.4.1.1
                            @Override // com.ironsource.adqualitysdk.sdk.i.je
                            /* renamed from: ｋ */
                            public final void mo5825() {
                                com.ironsource.adqualitysdk.sdk.i.jo.m8250(com.ironsource.adqualitysdk.sdk.i.jo.this);
                            }
                        });
                    }
                });
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m8251() {
        com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.jo.AnonymousClass4());
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jo$1, reason: invalid class name */
    final class AnonymousClass1 extends com.ironsource.adqualitysdk.sdk.i.je {

        /* renamed from: ｋ, reason: contains not printable characters */
        final /* synthetic */ com.ironsource.adqualitysdk.sdk.i.iw f2861;

        AnonymousClass1(com.ironsource.adqualitysdk.sdk.i.iw iwVar) {
            this.f2861 = iwVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.je
        /* renamed from: ｋ */
        public final void mo5825() {
            com.ironsource.adqualitysdk.sdk.i.jo.this.f2856.put(this.f2861, new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.1.5
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5825() {
                    com.ironsource.adqualitysdk.sdk.i.jo.AnonymousClass1.this.f2861.mo7409();
                }
            });
            com.ironsource.adqualitysdk.sdk.i.jo.m8250(com.ironsource.adqualitysdk.sdk.i.jo.this);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m8252(com.ironsource.adqualitysdk.sdk.i.iw iwVar) {
        com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.jo.AnonymousClass1(iwVar));
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jo$2, reason: invalid class name */
    final class AnonymousClass2 extends com.ironsource.adqualitysdk.sdk.i.je {

        /* renamed from: ｋ, reason: contains not printable characters */
        private /* synthetic */ com.ironsource.adqualitysdk.sdk.i.iw f2864;

        AnonymousClass2(com.ironsource.adqualitysdk.sdk.i.iw iwVar) {
            this.f2864 = iwVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.je
        /* renamed from: ｋ */
        public final void mo5825() {
            com.ironsource.adqualitysdk.sdk.i.jo.this.f2856.remove(this.f2864);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m8253(com.ironsource.adqualitysdk.sdk.i.iw iwVar) {
        com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.jo.AnonymousClass2(iwVar));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m8250(com.ironsource.adqualitysdk.sdk.i.jo joVar) {
        if (joVar.f2857 || new java.util.HashMap(joVar.f2856).isEmpty()) {
            return;
        }
        joVar.f2857 = true;
        com.ironsource.adqualitysdk.sdk.i.p.m8554(new com.ironsource.adqualitysdk.sdk.i.je() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.3
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5825() {
                if (!com.ironsource.adqualitysdk.sdk.i.jo.this.f2857) {
                    com.ironsource.adqualitysdk.sdk.i.jo.this.f2858 = null;
                    return;
                }
                java.util.HashMap m8242 = com.ironsource.adqualitysdk.sdk.i.jo.m8242(com.ironsource.adqualitysdk.sdk.i.jo.this);
                java.util.Iterator it = m8242.keySet().iterator();
                while (it.hasNext()) {
                    com.ironsource.adqualitysdk.sdk.i.jo.this.f2859.post((java.lang.Runnable) m8242.get((com.ironsource.adqualitysdk.sdk.i.iw) it.next()));
                }
                if (com.ironsource.adqualitysdk.sdk.i.jo.this.f2858 == null) {
                    com.ironsource.adqualitysdk.sdk.i.jo.this.f2858 = new android.view.Choreographer.FrameCallback() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.3.2

                        /* renamed from: ｋ, reason: contains not printable characters */
                        private static int[] f2866 = {-1565241423, 1409866962, 69890831, -1638393562, 1521212856, 1092074966, -1242711693, -1085770036, -1814922786, 2027094965, -1944592496, -1792759570, 580083616, 323535689, -1008012711, 1994750649, -2024301807, -1458727179};

                        /* renamed from: ﾇ, reason: contains not printable characters */
                        private static int f2867 = 0;

                        /* renamed from: ﾒ, reason: contains not printable characters */
                        private static int f2868 = 1;

                        @Override // android.view.Choreographer.FrameCallback
                        public final void doFrame(long j) {
                            int i = 2 % 2;
                            int i2 = f2868 + 115;
                            f2867 = i2 % 128;
                            int i3 = i2 % 2;
                            try {
                                com.ironsource.adqualitysdk.sdk.i.p.m8549(com.ironsource.adqualitysdk.sdk.i.je.this);
                                int i4 = f2868 + 5;
                                f2867 = i4 % 128;
                                int i5 = i4 % 2;
                            } catch (java.lang.Throwable th) {
                                com.ironsource.adqualitysdk.sdk.i.m.m8523(m8254(new int[]{1057666961, 1092710459, 601714879, 1792987600, -201657226, 2020152173}, 12 - android.view.View.combineMeasuredStates(0, 0)).intern(), m8254(new int[]{-37546726, -656574888, -153447298, 1440608534, -349228691, 2009733402, -882229853, 702967395}, 14 - android.text.TextUtils.getOffsetBefore("", 0)).intern(), th, false);
                            }
                        }

                        /* renamed from: ｋ, reason: contains not printable characters */
                        private static java.lang.String m8254(int[] iArr, int i) {
                            java.lang.String str;
                            synchronized (com.ironsource.adqualitysdk.sdk.i.a.f96) {
                                char[] cArr = new char[4];
                                char[] cArr2 = new char[iArr.length << 1];
                                int[] iArr2 = (int[]) f2866.clone();
                                com.ironsource.adqualitysdk.sdk.i.a.f93 = 0;
                                while (com.ironsource.adqualitysdk.sdk.i.a.f93 < iArr.length) {
                                    cArr[0] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.a.f93] >> 16);
                                    cArr[1] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.a.f93];
                                    cArr[2] = (char) (iArr[com.ironsource.adqualitysdk.sdk.i.a.f93 + 1] >> 16);
                                    cArr[3] = (char) iArr[com.ironsource.adqualitysdk.sdk.i.a.f93 + 1];
                                    com.ironsource.adqualitysdk.sdk.i.a.f94 = (cArr[0] << 16) + cArr[1];
                                    com.ironsource.adqualitysdk.sdk.i.a.f95 = (cArr[2] << 16) + cArr[3];
                                    com.ironsource.adqualitysdk.sdk.i.a.m5770(iArr2);
                                    for (int i2 = 0; i2 < 16; i2++) {
                                        int i3 = com.ironsource.adqualitysdk.sdk.i.a.f94 ^ iArr2[i2];
                                        com.ironsource.adqualitysdk.sdk.i.a.f94 = i3;
                                        com.ironsource.adqualitysdk.sdk.i.a.f95 = com.ironsource.adqualitysdk.sdk.i.a.m5771(i3) ^ com.ironsource.adqualitysdk.sdk.i.a.f95;
                                        int i4 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                                        com.ironsource.adqualitysdk.sdk.i.a.f94 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                                        com.ironsource.adqualitysdk.sdk.i.a.f95 = i4;
                                    }
                                    int i5 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                                    com.ironsource.adqualitysdk.sdk.i.a.f94 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                                    com.ironsource.adqualitysdk.sdk.i.a.f95 = i5;
                                    com.ironsource.adqualitysdk.sdk.i.a.f95 = i5 ^ iArr2[16];
                                    com.ironsource.adqualitysdk.sdk.i.a.f94 ^= iArr2[17];
                                    int i6 = com.ironsource.adqualitysdk.sdk.i.a.f94;
                                    int i7 = com.ironsource.adqualitysdk.sdk.i.a.f95;
                                    cArr[0] = (char) (com.ironsource.adqualitysdk.sdk.i.a.f94 >>> 16);
                                    cArr[1] = (char) com.ironsource.adqualitysdk.sdk.i.a.f94;
                                    cArr[2] = (char) (com.ironsource.adqualitysdk.sdk.i.a.f95 >>> 16);
                                    cArr[3] = (char) com.ironsource.adqualitysdk.sdk.i.a.f95;
                                    com.ironsource.adqualitysdk.sdk.i.a.m5770(iArr2);
                                    cArr2[com.ironsource.adqualitysdk.sdk.i.a.f93 << 1] = cArr[0];
                                    cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 1] = cArr[1];
                                    cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 2] = cArr[2];
                                    cArr2[(com.ironsource.adqualitysdk.sdk.i.a.f93 << 1) + 3] = cArr[3];
                                    com.ironsource.adqualitysdk.sdk.i.a.f93 += 2;
                                }
                                str = new java.lang.String(cArr2, 0, i);
                            }
                            return str;
                        }
                    };
                }
                android.view.Choreographer.getInstance().postFrameCallback(com.ironsource.adqualitysdk.sdk.i.jo.this.f2858);
            }
        });
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ java.util.HashMap m8242(com.ironsource.adqualitysdk.sdk.i.jo joVar) {
        return new java.util.HashMap(joVar.f2856);
    }
}
