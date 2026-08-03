package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Wl {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.core.config.models.AdConfig.VastVideoConfig f5037a;
    public final com.inmobi.media.El b;
    public final com.inmobi.media.C2799u9 c;
    public int d;
    public boolean e;
    public java.lang.String f;
    public java.lang.String g;
    public final java.util.ArrayList h;
    public final java.util.ArrayList i;
    public java.lang.String j;
    public java.lang.String k;
    public final java.util.ArrayList l;
    public final java.util.ArrayList m;
    public final java.util.ArrayList n;

    public Wl(com.inmobi.media.core.config.models.AdConfig.VastVideoConfig vastVideoConfig, com.inmobi.media.El vastEventProcessor, com.inmobi.media.C2799u9 c2799u9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vastVideoConfig, "vastVideoConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vastEventProcessor, "vastEventProcessor");
        this.f5037a = vastVideoConfig;
        this.b = vastEventProcessor;
        this.c = c2799u9;
        this.f = "";
        this.g = "";
        this.h = new java.util.ArrayList();
        this.i = new java.util.ArrayList();
        this.j = "";
        this.k = "";
        this.l = new java.util.ArrayList();
        this.m = new java.util.ArrayList();
        this.n = new java.util.ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.inmobi.media.Wl wl, org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Nl nl;
        int i;
        java.lang.String str;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        wl.getClass();
        if (continuationImpl instanceof com.inmobi.media.Nl) {
            nl = (com.inmobi.media.Nl) continuationImpl;
            int i2 = nl.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nl.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = nl.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nl.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = new kotlin.jvm.internal.Ref.BooleanRef();
                    try {
                        str = xmlPullParser.getAttributeValue(null, "adType").toString();
                    } catch (java.lang.Exception unused) {
                        str = "video";
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(str, "video")) {
                        throw new com.inmobi.media.Kl((short) 1125);
                    }
                    kotlin.jvm.functions.Function1 ol = new com.inmobi.media.Ol(wl, null, booleanRef2, xmlPullParser);
                    nl.f4861a = booleanRef2;
                    nl.d = 1;
                    if (wl.a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.d, ol, nl) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = nl.f4861a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (booleanRef.element) {
                    throw new com.inmobi.media.Kl((short) 1101);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        nl = new com.inmobi.media.Nl(wl, continuationImpl);
        java.lang.Object obj2 = nl.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nl.d;
        if (i != 0) {
        }
        if (booleanRef.element) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object b(com.inmobi.media.Wl wl, org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Rl rl;
        int i;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef2;
        wl.getClass();
        if (continuationImpl instanceof com.inmobi.media.Rl) {
            rl = (com.inmobi.media.Rl) continuationImpl;
            int i2 = rl.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rl.e = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = rl.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rl.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.BooleanRef booleanRef3 = new kotlin.jvm.internal.Ref.BooleanRef();
                    kotlin.jvm.internal.Ref.BooleanRef booleanRef4 = new kotlin.jvm.internal.Ref.BooleanRef();
                    kotlin.jvm.functions.Function1 sl = new com.inmobi.media.Sl(xmlPullParser, wl, booleanRef4, booleanRef3, null);
                    rl.f4942a = booleanRef3;
                    rl.b = booleanRef4;
                    rl.e = 1;
                    if (wl.a(xmlPullParser, "VAST", sl, rl) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef3;
                    booleanRef2 = booleanRef4;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef2 = rl.b;
                    booleanRef = rl.f4942a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (!booleanRef.element) {
                    return kotlin.Unit.INSTANCE;
                }
                if (booleanRef2.element) {
                    throw new com.inmobi.media.Kl((short) 1124);
                }
                throw new com.inmobi.media.Kl((short) 1102);
            }
        }
        rl = new com.inmobi.media.Rl(wl, continuationImpl);
        java.lang.Object obj2 = rl.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rl.e;
        if (i != 0) {
        }
        if (!booleanRef.element) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object c(com.inmobi.media.Wl wl, org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Ul ul;
        int i;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        wl.getClass();
        if (continuationImpl instanceof com.inmobi.media.Ul) {
            ul = (com.inmobi.media.Ul) continuationImpl;
            int i2 = ul.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ul.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = ul.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ul.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    int i3 = wl.d + 1;
                    wl.d = i3;
                    if (i3 > wl.f5037a.getMaxWrapperLimit()) {
                        throw new com.inmobi.media.Kl((short) 1107);
                    }
                    kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = new kotlin.jvm.internal.Ref.BooleanRef();
                    kotlin.jvm.functions.Function1 vl = new com.inmobi.media.Vl(wl, null, booleanRef2, xmlPullParser);
                    ul.f5002a = booleanRef2;
                    ul.d = 1;
                    if (wl.a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.f, vl, ul) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = ul.f5002a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (booleanRef.element) {
                    throw new com.inmobi.media.Kl((short) 1121);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        ul = new com.inmobi.media.Ul(wl, continuationImpl);
        java.lang.Object obj2 = ul.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ul.d;
        if (i != 0) {
        }
        if (booleanRef.element) {
        }
    }

    public static final kotlin.Unit d(org.xmlpull.v1.XmlPullParser xmlPullParser, com.inmobi.media.Wl wl) {
        java.lang.String name = xmlPullParser.getName();
        if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.O)) {
            java.lang.String b = com.inmobi.media.Fl.b(wl.v(xmlPullParser));
            if (!com.inmobi.media.Fl.a(b)) {
                b = null;
            }
            com.inmobi.media.De de = b != null ? new com.inmobi.media.De(b, com.ironsource.Y3.d) : null;
            if (de != null) {
                wl.m.add(de);
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v)) {
            wl.m.addAll(wl.o(xmlPullParser));
        } else {
            wl.getClass();
            w(xmlPullParser);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit e(org.xmlpull.v1.XmlPullParser xmlPullParser, com.inmobi.media.Wl wl) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(xmlPullParser.getName(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M)) {
            wl.q(xmlPullParser);
        } else {
            wl.getClass();
            w(xmlPullParser);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit h(org.xmlpull.v1.XmlPullParser xmlPullParser, com.inmobi.media.Wl wl) {
        java.lang.String name = xmlPullParser.getName();
        if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v)) {
            wl.i.addAll(wl.o(xmlPullParser));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.x)) {
            wl.a(xmlPullParser, false);
        } else {
            wl.getClass();
            w(xmlPullParser);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static void w(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 2) {
            return;
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public final void g(final org.xmlpull.v1.XmlPullParser xmlPullParser) {
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.e, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Wl$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Wl.a(xmlPullParser, this, booleanRef);
            }
        });
        if (!booleanRef.element) {
            throw new com.inmobi.media.Kl((short) 1122);
        }
    }

    public final void i(final org.xmlpull.v1.XmlPullParser xmlPullParser) {
        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Wl$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Wl.a(xmlPullParser, this, intRef);
            }
        });
        if (this.n.size() != 0) {
            if (this.e) {
                com.inmobi.media.C2799u9 c2799u9 = this.c;
                if (c2799u9 != null) {
                    c2799u9.a("VastParser", "VAST Companion Error: Format not supported");
                }
                java.util.Map a2 = com.inmobi.media.AbstractC2938zk.a(this.b.f4690a);
                a2.put("errorCode", (short) 1152);
                com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
                com.inmobi.media.C2624nk.b("VastParseEvent", a2, com.inmobi.media.EnumC2728rk.f5431a);
                return;
            }
            return;
        }
        if (this.e) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("[ERRORCODE]", java.lang.String.valueOf(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED));
            hashMap.put("[ADSERVINGID]", this.g);
            hashMap.put("[UNIVERSALADID]", this.f);
            com.inmobi.media.El.a(hashMap, this.i, this.c);
            java.util.Map a3 = com.inmobi.media.AbstractC2938zk.a(this.b.f4690a);
            a3.put("errorCode", (short) 1150);
            com.inmobi.media.C2624nk c2624nk2 = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("VastParseEvent", a3, com.inmobi.media.EnumC2728rk.f5431a);
            return;
        }
        if (intRef.element > 0) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("[ERRORCODE]", java.lang.String.valueOf(600));
            hashMap2.put("[ADSERVINGID]", this.g);
            hashMap2.put("[UNIVERSALADID]", this.f);
            com.inmobi.media.El.a(hashMap2, this.i, this.c);
            java.util.Map a4 = com.inmobi.media.AbstractC2938zk.a(this.b.f4690a);
            a4.put("errorCode", (short) 1151);
            com.inmobi.media.C2624nk c2624nk3 = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("VastParseEvent", a4, com.inmobi.media.EnumC2728rk.f5431a);
        }
    }

    public final boolean j(final org.xmlpull.v1.XmlPullParser xmlPullParser) {
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.p, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Wl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Wl.b(xmlPullParser, this, booleanRef);
            }
        });
        return booleanRef.element;
    }

    public final void k(final org.xmlpull.v1.XmlPullParser xmlPullParser) {
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = new kotlin.jvm.internal.Ref.BooleanRef();
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.o, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Wl$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Wl.a(xmlPullParser, booleanRef, this, booleanRef2);
            }
        });
        if (!booleanRef.element) {
            throw new com.inmobi.media.Kl((short) 1112);
        }
        if (!booleanRef2.element) {
            throw new com.inmobi.media.Kl((short) 1111);
        }
    }

    public final void l(final org.xmlpull.v1.XmlPullParser xmlPullParser) {
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = new kotlin.jvm.internal.Ref.BooleanRef();
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.q, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Wl$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Wl.a(xmlPullParser, this, booleanRef, booleanRef2);
            }
        });
        if (!booleanRef.element) {
            throw new com.inmobi.media.Kl((short) 1116);
        }
        if (!booleanRef2.element) {
            throw new com.inmobi.media.Kl((short) 1117);
        }
    }

    public final java.util.ArrayList m(final org.xmlpull.v1.XmlPullParser xmlPullParser) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = new kotlin.jvm.internal.Ref.BooleanRef();
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.t, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Wl$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Wl.a(xmlPullParser, this, booleanRef2, booleanRef, arrayList);
            }
        });
        if (!booleanRef2.element) {
            throw new com.inmobi.media.Kl((short) 1118);
        }
        if (arrayList.isEmpty()) {
            throw new com.inmobi.media.Kl((short) 1119);
        }
        if (booleanRef.element) {
            java.util.Map a2 = com.inmobi.media.AbstractC2938zk.a(this.b.f4690a);
            a2.put("errorCode", (short) 1153);
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("VastParseEvent", a2, com.inmobi.media.EnumC2728rk.f5431a);
        }
        return arrayList;
    }

    public final int n(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.next();
        } catch (java.io.IOException unused) {
            com.inmobi.media.C2799u9 c2799u9 = this.c;
            if (c2799u9 == null) {
                return -1;
            }
            c2799u9.b("VastParser", "Parsing failed.");
            return -1;
        } catch (org.xmlpull.v1.XmlPullParserException unused2) {
            com.inmobi.media.C2799u9 c2799u92 = this.c;
            if (c2799u92 == null) {
                return -1;
            }
            c2799u92.b("VastParser", "VAST Schema validation error: VAST node at appropriate hierarchy not found.");
            return -1;
        }
    }

    public final java.util.ArrayList o(final org.xmlpull.v1.XmlPullParser xmlPullParser) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Wl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Wl.a(xmlPullParser, this, arrayList);
            }
        });
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(final org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "vendor");
        if (attributeValue == null) {
            com.inmobi.media.C2799u9 c2799u9 = this.c;
            if (c2799u9 != null) {
                c2799u9.b("VastParser", "VAST Schema Validation Error: Vendor not found");
                return;
            }
            return;
        }
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = "";
        final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        a(xmlPullParser, "Verification", new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Wl$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Wl.a(xmlPullParser, booleanRef, this, objectRef, objectRef2, arrayList);
            }
        });
        if (!booleanRef.element) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("[REASON]", java.lang.String.valueOf(2));
            hashMap.put("[ADSERVINGID]", this.g);
            hashMap.put("[UNIVERSALADID]", this.f);
            com.inmobi.media.El.a(hashMap, arrayList, this.c);
            return;
        }
        if (!com.inmobi.media.Fl.a((java.lang.String) objectRef.element)) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("[REASON]", java.lang.String.valueOf(3));
            hashMap2.put("[ADSERVINGID]", this.g);
            hashMap2.put("[UNIVERSALADID]", this.f);
            com.inmobi.media.El.a(hashMap2, arrayList, this.c);
            return;
        }
        this.i.add(new com.inmobi.media.Hf(attributeValue, (java.lang.String) objectRef2.element, (java.lang.String) objectRef.element));
        com.inmobi.media.C2799u9 c2799u92 = this.c;
        if (c2799u92 != null) {
            c2799u92.a("VastParser", "OMID ADVerification URL : " + objectRef.element);
        }
    }

    public final void q(final org.xmlpull.v1.XmlPullParser xmlPullParser) {
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Wl$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Wl.d(xmlPullParser, this);
            }
        });
    }

    public final void r(final org.xmlpull.v1.XmlPullParser xmlPullParser) {
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Wl$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Wl.e(xmlPullParser, this);
            }
        });
    }

    public final void s(final org.xmlpull.v1.XmlPullParser xmlPullParser) {
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.p, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Wl$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Wl.f(xmlPullParser, this);
            }
        });
    }

    public final void t(final org.xmlpull.v1.XmlPullParser xmlPullParser) {
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.o, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Wl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Wl.g(xmlPullParser, this);
            }
        });
    }

    public final void u(final org.xmlpull.v1.XmlPullParser xmlPullParser) {
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.q, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Wl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Wl.h(xmlPullParser, this);
            }
        });
    }

    public final java.lang.String v(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.lang.String text;
        int n = n(xmlPullParser);
        if ((n == 4 || n == 5) && (text = xmlPullParser.getText()) != null && com.inmobi.media.J3.a(text)) {
            return text;
        }
        return null;
    }

    public final void f(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.lang.String b = com.inmobi.media.Fl.b(v(xmlPullParser));
        if (b.length() == 0) {
            com.inmobi.media.C2799u9 c2799u9 = this.c;
            if (c2799u9 != null) {
                c2799u9.b("VastParser", "Vast Tracker Error: Impression");
                return;
            }
            return;
        }
        if (!com.inmobi.media.Fl.a(b)) {
            b = null;
        }
        if (b == null) {
            return;
        }
        this.i.add(new com.inmobi.media.De(b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n));
    }

    public final void e(final org.xmlpull.v1.XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Extensions", new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Wl$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Wl.c(xmlPullParser, this);
            }
        });
    }

    public static final kotlin.Unit f(org.xmlpull.v1.XmlPullParser xmlPullParser, com.inmobi.media.Wl wl) {
        java.lang.String name = xmlPullParser.getName();
        if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.q)) {
            wl.u(xmlPullParser);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L)) {
            wl.r(xmlPullParser);
        } else {
            wl.getClass();
            w(xmlPullParser);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(final org.xmlpull.v1.XmlPullParser xmlPullParser) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        final java.util.ArrayList arrayList2 = new java.util.ArrayList();
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Wl$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Wl.a(xmlPullParser, this, arrayList, objectRef, arrayList2);
            }
        });
        if (arrayList.isEmpty()) {
            com.inmobi.media.C2799u9 c2799u9 = this.c;
            if (c2799u9 != null) {
                c2799u9.b("VastParser", "VAST Companion Error: No Companion resources found");
                return;
            }
            return;
        }
        this.n.add(new com.inmobi.media.Dl(arrayList, arrayList2, this.m));
    }

    public final void d(final org.xmlpull.v1.XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Extension", new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Wl$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Wl.b(xmlPullParser, this);
            }
        });
    }

    public static final kotlin.Unit g(org.xmlpull.v1.XmlPullParser xmlPullParser, com.inmobi.media.Wl wl) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(xmlPullParser.getName(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.p)) {
            wl.s(xmlPullParser);
        } else {
            wl.getClass();
            w(xmlPullParser);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit b(org.xmlpull.v1.XmlPullParser xmlPullParser, com.inmobi.media.Wl wl, kotlin.jvm.internal.Ref.BooleanRef booleanRef) {
        java.lang.String name = xmlPullParser.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -2018804923) {
                if (hashCode != 1150879268) {
                    if (hashCode == 1539775849 && name.equals("UniversalAdId")) {
                        java.lang.String v = wl.v(xmlPullParser);
                        if (v == null) {
                            v = "";
                        }
                        wl.f = v;
                    }
                } else if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L)) {
                    wl.i(xmlPullParser);
                }
            } else if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.q)) {
                booleanRef.element = true;
                wl.l(xmlPullParser);
            }
            return kotlin.Unit.INSTANCE;
        }
        wl.getClass();
        w(xmlPullParser);
        return kotlin.Unit.INSTANCE;
    }

    public final com.inmobi.media.De b(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        java.lang.String attributeValue2 = xmlPullParser.getAttributeValue(null, "offset");
        java.lang.String b = com.inmobi.media.Fl.b(v(xmlPullParser));
        if (!com.inmobi.media.Fl.a(b)) {
            return null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(attributeValue, androidx.core.app.NotificationCompat.CATEGORY_PROGRESS)) {
            if (attributeValue2 == null || attributeValue2.length() == 0) {
                return null;
            }
            if (!new kotlin.text.Regex("^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:\\.\\d{1,3})?$").matches(attributeValue2) && !new kotlin.text.Regex("^0?[0-9]%$|^100%$|^[1-9][0-9]%$").matches(attributeValue2)) {
                com.inmobi.media.C2799u9 c2799u9 = this.c;
                if (c2799u9 != null) {
                    c2799u9.b("VastParser", "VAST Schema Validation Error: " + attributeValue2 + " is not a valid offset");
                }
            } else {
                return new com.inmobi.media.S5(b, attributeValue2);
            }
        } else {
            if (com.inmobi.media.Xl.f5053a.contains(attributeValue)) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(attributeValue);
                return new com.inmobi.media.De(b, attributeValue);
            }
            com.inmobi.media.C2799u9 c2799u92 = this.c;
            if (c2799u92 != null) {
                c2799u92.a("VastParser", "VAST Schema Validation Error: UnKnown Event: " + attributeValue);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.inmobi.media.Wl] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, java.util.ArrayList urls, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Ml ml;
        int i;
        ?? r3;
        try {
            if (continuationImpl instanceof com.inmobi.media.Ml) {
                ml = (com.inmobi.media.Ml) continuationImpl;
                int i2 = ml.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ml.d = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = ml.b;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = ml.d;
                    r3 = 1;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        ml.f4841a = urls;
                        ml.d = 1;
                        urls = urls;
                        if (a(str, ml) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r13 = ml.f4841a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        urls = r13;
                    }
                    r3 = this.f;
                    return new com.inmobi.media.Hl(r3, this.g, this.i, this.j, this.k, this.n, this.l);
                }
            }
            if (i != 0) {
            }
            r3 = this.f;
            return new com.inmobi.media.Hl(r3, this.g, this.i, this.j, this.k, this.n, this.l);
        } catch (com.inmobi.media.Kl e) {
            short s = e.f4803a;
            kotlin.Pair pair = kotlin.TuplesKt.to("[ERRORCODE]", java.lang.String.valueOf((s == 1100 || s == 1102) ? 303 : (s == 1101 || s == 1124 || s == 1125 || s == 1103 || s == 1120 || s == 1121 || s == 1123 || s == 1122 || s == 1112 || s == 1109 || s == 1115 || s == 1116 || s == 1117) ? 101 : s == 1104 ? 100 : (s == 1105 || s == 1106) ? androidx.datastore.preferences.protobuf.DescriptorProtos.Edition.EDITION_LEGACY_VALUE : s == 1107 ? com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE : (s == 1108 || s == 1114) ? androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis : s == 1111 ? 201 : s == 1113 ? com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_ERROR_VALUE : s == 1118 ? 401 : s == 1119 ? 403 : 0));
            kotlin.Pair pair2 = kotlin.TuplesKt.to("[ADSERVINGID]", this.g);
            kotlin.Pair pair3 = kotlin.TuplesKt.to("[UNIVERSALADID]", this.f);
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            pairArr[0] = pair;
            pairArr[r3] = pair2;
            pairArr[2] = pair3;
            java.util.HashMap macros = kotlin.collections.MapsKt.hashMapOf(pairArr);
            short s2 = e.f4803a;
            if (s2 != 1102 && s2 != 1124) {
                com.inmobi.media.El.a(macros, this.i, this.c);
            } else {
                com.inmobi.media.El.a(macros, kotlin.collections.CollectionsKt.plus((java.util.Collection) this.h, (java.lang.Iterable) this.i), this.c);
            }
            com.inmobi.media.C2799u9 c2799u9 = this.c;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(macros, "macros");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urls, "urls");
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(urls, 10));
            for (java.lang.String str2 : urls) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "<this>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(macros, "macros");
                java.lang.String str3 = str2;
                for (java.util.Map.Entry entry : macros.entrySet()) {
                    str3 = kotlin.text.StringsKt.replace$default(str3, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, (java.lang.Object) null);
                }
                arrayList.add(str3);
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String url = (java.lang.String) it.next();
                com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
                com.inmobi.media.Jg priority = com.inmobi.media.Jg.b;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "priority");
                com.inmobi.media.Mg.a(priority, new com.inmobi.media.C2711r3(url, c2799u9, null));
            }
            throw e;
        }
        ml = new com.inmobi.media.Ml(this, continuationImpl);
        java.lang.Object obj2 = ml.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ml.d;
        r3 = 1;
    }

    public static final kotlin.Unit b(org.xmlpull.v1.XmlPullParser xmlPullParser, com.inmobi.media.Wl wl) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(xmlPullParser.getName(), "AdVerifications")) {
            wl.c(xmlPullParser);
        } else {
            wl.getClass();
            w(xmlPullParser);
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void c(final org.xmlpull.v1.XmlPullParser xmlPullParser) {
        a(xmlPullParser, "AdVerifications", new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Wl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Wl.a(xmlPullParser, this);
            }
        });
    }

    public static final kotlin.Unit c(org.xmlpull.v1.XmlPullParser xmlPullParser, com.inmobi.media.Wl wl) {
        java.lang.String str;
        if (kotlin.jvm.internal.Intrinsics.areEqual(xmlPullParser.getName(), "Extension")) {
            try {
                str = xmlPullParser.getAttributeValue(null, "type");
            } catch (java.lang.Exception unused) {
                str = "";
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, "AdVerifications")) {
                wl.d(xmlPullParser);
            }
        } else {
            wl.getClass();
            w(xmlPullParser);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Tl tl;
        int i;
        try {
            if (continuationImpl instanceof com.inmobi.media.Tl) {
                tl = (com.inmobi.media.Tl) continuationImpl;
                int i2 = tl.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    tl.c = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = tl.f4982a;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = tl.c;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (android.text.TextUtils.isEmpty(str)) {
                            com.inmobi.media.C2799u9 c2799u9 = this.c;
                            if (c2799u9 != null) {
                                c2799u9.b("VastParser", "VAST Schema validation error: Empty VastXML");
                            }
                            throw new com.inmobi.media.Kl((short) 1100);
                        }
                        try {
                            org.xmlpull.v1.XmlPullParserFactory newInstance = org.xmlpull.v1.XmlPullParserFactory.newInstance();
                            com.inmobi.media.B5.f4614a.getClass();
                            if (!com.inmobi.media.B5.s()) {
                                newInstance.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                            }
                            org.xmlpull.v1.XmlPullParser newPullParser = newInstance.newPullParser();
                            newPullParser.setInput(new java.io.StringReader(str));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newPullParser, "apply(...)");
                            tl.c = 1;
                            if (a(newPullParser, tl) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (org.xmlpull.v1.XmlPullParserException unused) {
                            com.inmobi.media.C2799u9 c2799u92 = this.c;
                            if (c2799u92 != null) {
                                c2799u92.b("VastParser", "VAST Schema validation error: (XmlPullParserException)");
                            }
                            throw new com.inmobi.media.Kl((short) 1104);
                        } catch (java.lang.Exception unused2) {
                            com.inmobi.media.C2799u9 c2799u93 = this.c;
                            if (c2799u93 != null) {
                                c2799u93.b("VastParser", "VAST Schema validation error: (Exception)");
                            }
                            throw new com.inmobi.media.Kl((short) 1105);
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            return kotlin.Unit.INSTANCE;
        } catch (com.inmobi.media.Kl e) {
            com.inmobi.media.C2799u9 c2799u94 = this.c;
            if (c2799u94 != null) {
                c2799u94.b("VastParser", "VAST Schema validation error: " + ((int) e.f4803a));
            }
            throw e;
        } catch (java.lang.Exception e2) {
            com.inmobi.media.C2799u9 c2799u95 = this.c;
            if (c2799u95 != null) {
                java.lang.String arrays = java.util.Arrays.toString(e2.getStackTrace());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
                c2799u95.b("VastParser", "VAST Schema validation error: (Exception) " + arrays);
            }
            throw new com.inmobi.media.Kl((short) 1106);
        }
        tl = new com.inmobi.media.Tl(this, continuationImpl);
        java.lang.Object obj2 = tl.f4982a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tl.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Pl pl;
        int i;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        if (continuationImpl instanceof com.inmobi.media.Pl) {
            pl = (com.inmobi.media.Pl) continuationImpl;
            int i2 = pl.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pl.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = pl.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pl.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = new kotlin.jvm.internal.Ref.BooleanRef();
                    kotlin.jvm.functions.Function1 ql = new com.inmobi.media.Ql(this, null, booleanRef2, xmlPullParser);
                    pl.f4902a = booleanRef2;
                    pl.d = 1;
                    if (a(xmlPullParser, "VAST", ql, pl) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = pl.f4902a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (!booleanRef.element) {
                    return kotlin.Unit.INSTANCE;
                }
                throw new com.inmobi.media.Kl((short) 1103);
            }
        }
        pl = new com.inmobi.media.Pl(this, continuationImpl);
        java.lang.Object obj2 = pl.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pl.d;
        if (i != 0) {
        }
        if (!booleanRef.element) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final kotlin.Unit a(org.xmlpull.v1.XmlPullParser xmlPullParser, com.inmobi.media.Wl wl, kotlin.jvm.internal.Ref.BooleanRef booleanRef) {
        java.lang.String name = xmlPullParser.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -2077435339:
                    if (name.equals("AdVerifications")) {
                        wl.c(xmlPullParser);
                        break;
                    }
                    break;
                case -1692490108:
                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.o)) {
                        booleanRef.element = true;
                        wl.k(xmlPullParser);
                        break;
                    }
                    break;
                case -1499090620:
                    if (name.equals("AdServingId")) {
                        java.lang.String v = wl.v(xmlPullParser);
                        if (v == null) {
                            v = "";
                        }
                        wl.g = v;
                        break;
                    }
                    break;
                case 67232232:
                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c)) {
                        com.inmobi.media.De a2 = wl.a("error", xmlPullParser);
                        if (a2 != null) {
                            wl.i.add(a2);
                            break;
                        }
                    }
                    break;
                case 184043572:
                    if (name.equals("Extensions")) {
                        wl.e(xmlPullParser);
                        break;
                    }
                    break;
                case 2114088489:
                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n)) {
                        wl.f(xmlPullParser);
                        break;
                    }
                    break;
            }
            return kotlin.Unit.INSTANCE;
        }
        wl.getClass();
        w(xmlPullParser);
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.jvm.internal.Ref.BooleanRef booleanRef, com.inmobi.media.Wl wl, kotlin.jvm.internal.Ref.BooleanRef booleanRef2) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(xmlPullParser.getName(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.p)) {
            booleanRef.element = true;
            if (wl.j(xmlPullParser)) {
                booleanRef2.element = true;
            }
        } else {
            wl.getClass();
            w(xmlPullParser);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(org.xmlpull.v1.XmlPullParser xmlPullParser, com.inmobi.media.Wl wl, kotlin.jvm.internal.Ref.BooleanRef booleanRef, kotlin.jvm.internal.Ref.BooleanRef booleanRef2) {
        java.lang.String name = xmlPullParser.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -2049897434) {
                if (hashCode != -1927368268) {
                    if (hashCode != -385055469) {
                        if (hashCode == 611554000 && name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v)) {
                            wl.i.addAll(wl.o(xmlPullParser));
                        }
                    } else if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.t)) {
                        booleanRef2.element = true;
                        wl.l.addAll(wl.m(xmlPullParser));
                    }
                } else if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.s)) {
                    wl.k = wl.a(xmlPullParser);
                    booleanRef.element = true;
                }
            } else if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.x)) {
                wl.a(xmlPullParser, true);
            }
            return kotlin.Unit.INSTANCE;
        }
        wl.getClass();
        w(xmlPullParser);
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.String a(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.lang.String v = v(xmlPullParser);
        if (v != null && !android.text.TextUtils.isEmpty(v) && new kotlin.text.Regex("^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:\\.\\d{1,3})?$").matches(v)) {
            return v;
        }
        com.inmobi.media.C2799u9 c2799u9 = this.c;
        if (c2799u9 != null) {
            c2799u9.b("VastParser", "VAST Schema Validation Error: Invalid Duration " + xmlPullParser.getEventType());
        }
        throw new com.inmobi.media.Kl((short) 1115);
    }

    public static final kotlin.Unit a(org.xmlpull.v1.XmlPullParser xmlPullParser, com.inmobi.media.Wl wl, kotlin.jvm.internal.Ref.IntRef intRef) {
        int i;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(xmlPullParser.getName(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M)) {
            wl.getClass();
            w(xmlPullParser);
            return kotlin.Unit.INSTANCE;
        }
        intRef.element++;
        int i2 = 0;
        try {
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "width");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(attributeValue, "getAttributeValue(...)");
            i = java.lang.Integer.parseInt(attributeValue);
        } catch (java.lang.Exception unused) {
            com.inmobi.media.C2799u9 c2799u9 = wl.c;
            if (c2799u9 != null) {
                c2799u9.b("VastParser", "Invalid width encountered for a companion and ignoring that.");
            }
            i = 0;
        }
        try {
            java.lang.String attributeValue2 = xmlPullParser.getAttributeValue(null, "height");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(attributeValue2, "getAttributeValue(...)");
            i2 = java.lang.Integer.parseInt(attributeValue2);
        } catch (java.lang.Exception unused2) {
            com.inmobi.media.C2799u9 c2799u92 = wl.c;
            if (c2799u92 != null) {
                c2799u92.b("VastParser", "Invalid height encountered for a companion and ignoring that.");
            }
        }
        if (i > 0 && i2 > 0) {
            wl.h(xmlPullParser);
            return kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    public static final kotlin.Unit a(org.xmlpull.v1.XmlPullParser xmlPullParser, com.inmobi.media.Wl wl, java.util.List list, kotlin.jvm.internal.Ref.ObjectRef objectRef, java.util.List list2) {
        java.lang.String name = xmlPullParser.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -348198615) {
                if (hashCode != 611554000) {
                    if (hashCode != 676623548) {
                        if (hashCode == 1877773523 && name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.O)) {
                            java.lang.String b = com.inmobi.media.Fl.b(wl.v(xmlPullParser));
                            if (!com.inmobi.media.Fl.a(b)) {
                                b = null;
                            }
                            com.inmobi.media.De de = b != null ? new com.inmobi.media.De(b, com.ironsource.Y3.d) : null;
                            if (de != null) {
                                list2.add(de);
                            }
                        }
                    } else if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.D)) {
                        wl.a(xmlPullParser, list);
                    }
                } else if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v)) {
                    list2.addAll(wl.o(xmlPullParser));
                }
            } else if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.N)) {
                ?? b2 = com.inmobi.media.Fl.b(wl.v(xmlPullParser));
                if (com.inmobi.media.Fl.a(b2)) {
                    objectRef.element = b2;
                } else {
                    com.inmobi.media.C2799u9 c2799u9 = wl.c;
                    if (c2799u9 != null) {
                        c2799u9.b("VastParser", "Invalid ClickThrough URL: " + xmlPullParser.getText());
                    }
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        wl.getClass();
        w(xmlPullParser);
        return kotlin.Unit.INSTANCE;
    }

    public final void a(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.List list) {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "creativeType");
        java.lang.String b = com.inmobi.media.Fl.b(v(xmlPullParser));
        if (!com.inmobi.media.Fl.a(b)) {
            com.inmobi.media.C2799u9 c2799u9 = this.c;
            if (c2799u9 != null) {
                c2799u9.a("VastParser", "VAST Companion Error: StaticResource URL is null or empty");
                return;
            }
            return;
        }
        if (attributeValue == null || kotlin.text.StringsKt.isBlank(attributeValue)) {
            return;
        }
        java.util.List<java.lang.String> allowedCompanionType = this.f5037a.getAllowedCompanionType();
        if (!(allowedCompanionType instanceof java.util.Collection) || !allowedCompanionType.isEmpty()) {
            java.util.Iterator<T> it = allowedCompanionType.iterator();
            while (it.hasNext()) {
                if (kotlin.text.StringsKt.equals((java.lang.String) it.next(), attributeValue, true)) {
                    list.add(new com.inmobi.media.Ii(b));
                    return;
                }
            }
        }
        com.inmobi.media.C2799u9 c2799u92 = this.c;
        if (c2799u92 != null) {
            c2799u92.a("VastParser", "VAST Companion Error: Format not supported - " + attributeValue);
        }
        this.e = true;
    }

    public static final kotlin.Unit a(org.xmlpull.v1.XmlPullParser xmlPullParser, com.inmobi.media.Wl wl, java.util.List list) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(xmlPullParser.getName(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.w)) {
            com.inmobi.media.De b = wl.b(xmlPullParser);
            if (b != null) {
                list.add(b);
            }
        } else {
            wl.getClass();
            w(xmlPullParser);
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void a(final org.xmlpull.v1.XmlPullParser xmlPullParser, final boolean z) {
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.x, new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Wl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Wl.a(xmlPullParser, z, this);
            }
        });
    }

    public static final kotlin.Unit a(org.xmlpull.v1.XmlPullParser xmlPullParser, boolean z, com.inmobi.media.Wl wl) {
        java.lang.String name = xmlPullParser.getName();
        if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.y)) {
            if (z) {
                java.lang.String b = com.inmobi.media.Fl.b(wl.v(xmlPullParser));
                if (com.inmobi.media.Fl.a(b)) {
                    wl.j = b;
                }
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.z)) {
            com.inmobi.media.De a2 = wl.a(com.ironsource.Y3.d, xmlPullParser);
            if (a2 != null) {
                wl.i.add(a2);
            }
        } else {
            wl.getClass();
            w(xmlPullParser);
        }
        return kotlin.Unit.INSTANCE;
    }

    public final boolean a(int i, int i2, java.lang.String str, java.lang.String str2, int i3) {
        if (com.inmobi.media.Fl.a(str) && i > 0 && i2 > 0) {
            if (this.f5037a.getBitRate().getBitrate_mandatory() && i3 <= 0) {
                com.inmobi.media.C2799u9 c2799u9 = this.c;
                if (c2799u9 != null) {
                    c2799u9.b("VastParser", "VAST Schema Validation Error: Bitrate not found or invalid - " + i3);
                }
                return false;
            }
            if (kotlin.text.StringsKt.equals(str2, "Progressive", true)) {
                return true;
            }
            com.inmobi.media.C2799u9 c2799u92 = this.c;
            if (c2799u92 != null) {
                c2799u92.b("VastParser", "VAST Schema Validation Error: Delivery type NULL or invalid - " + str2);
            }
            return false;
        }
        com.inmobi.media.C2799u9 c2799u93 = this.c;
        if (c2799u93 != null) {
            c2799u93.b("VastParser", "VAST Schema Validation Error: Invalid Media - " + str + io.ktor.sse.ServerSentEventKt.SPACE + i + ", " + i2);
        }
        return false;
    }

    public static final kotlin.Unit a(org.xmlpull.v1.XmlPullParser xmlPullParser, com.inmobi.media.Wl wl, kotlin.jvm.internal.Ref.BooleanRef booleanRef, kotlin.jvm.internal.Ref.BooleanRef booleanRef2, java.util.List list) {
        int i;
        int i2;
        int i3;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(xmlPullParser.getName(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.u)) {
            wl.getClass();
            w(xmlPullParser);
            return kotlin.Unit.INSTANCE;
        }
        booleanRef.element = true;
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, com.ironsource.C3300u.g);
        java.lang.String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
        try {
            java.lang.String attributeValue3 = xmlPullParser.getAttributeValue(null, "bitrate");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(attributeValue3, "getAttributeValue(...)");
            i = java.lang.Integer.parseInt(attributeValue3);
        } catch (java.lang.Exception unused) {
            com.inmobi.media.C2799u9 c2799u9 = wl.c;
            if (c2799u9 != null) {
                c2799u9.b("VastParser", "Invalid Value for BitRate.");
            }
            i = 0;
        }
        try {
            java.lang.String attributeValue4 = xmlPullParser.getAttributeValue(null, "width");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(attributeValue4, "getAttributeValue(...)");
            i2 = java.lang.Integer.parseInt(attributeValue4);
        } catch (java.lang.Exception unused2) {
            com.inmobi.media.C2799u9 c2799u92 = wl.c;
            if (c2799u92 != null) {
                c2799u92.b("VastParser", "Invalid Value for Media Width.");
            }
            i2 = 0;
        }
        try {
            java.lang.String attributeValue5 = xmlPullParser.getAttributeValue(null, "height");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(attributeValue5, "getAttributeValue(...)");
            i3 = java.lang.Integer.parseInt(attributeValue5);
        } catch (java.lang.Exception unused3) {
            com.inmobi.media.C2799u9 c2799u93 = wl.c;
            if (c2799u93 != null) {
                c2799u93.b("VastParser", "Invalid Value for Media Height.");
            }
            i3 = 0;
        }
        java.lang.String b = com.inmobi.media.Fl.b(wl.v(xmlPullParser));
        if (!wl.a(i2, i3, b, attributeValue, i)) {
            return kotlin.Unit.INSTANCE;
        }
        if (attributeValue2 != null) {
            java.util.List<java.lang.String> allowedContentType = wl.f5037a.getAllowedContentType();
            if (!(allowedContentType instanceof java.util.Collection) || !allowedContentType.isEmpty()) {
                java.util.Iterator<T> it = allowedContentType.iterator();
                while (it.hasNext()) {
                    if (kotlin.text.StringsKt.equals((java.lang.String) it.next(), attributeValue2, true)) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(attributeValue);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(attributeValue2);
                        list.add(new com.inmobi.media.Gl(i2, i3, b, attributeValue, attributeValue2, i));
                        return kotlin.Unit.INSTANCE;
                    }
                }
            }
        }
        com.inmobi.media.C2799u9 c2799u94 = wl.c;
        if (c2799u94 != null) {
            c2799u94.b("VastParser", "VAST Schema Validation Error: Media type Invalid - " + attributeValue2);
        }
        if (com.inmobi.media.J3.a(attributeValue2)) {
            booleanRef2.element = true;
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(org.xmlpull.v1.XmlPullParser xmlPullParser, com.inmobi.media.Wl wl) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(xmlPullParser.getName(), "Verification")) {
            wl.p(xmlPullParser);
        } else {
            wl.getClass();
            w(xmlPullParser);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, java.lang.String] */
    public static final kotlin.Unit a(org.xmlpull.v1.XmlPullParser xmlPullParser, kotlin.jvm.internal.Ref.BooleanRef booleanRef, com.inmobi.media.Wl wl, kotlin.jvm.internal.Ref.ObjectRef objectRef, kotlin.jvm.internal.Ref.ObjectRef objectRef2, java.util.List list) {
        java.lang.String name = xmlPullParser.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != 611554000) {
                if (hashCode != 1561251035) {
                    if (hashCode == 1749252741 && name.equals("VerificationParameters")) {
                        objectRef2.element = com.inmobi.media.Fl.b(wl.v(xmlPullParser));
                    }
                } else if (name.equals("JavaScriptResource")) {
                    if (booleanRef.element) {
                        wl.getClass();
                        w(xmlPullParser);
                        return kotlin.Unit.INSTANCE;
                    }
                    java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "apiFramework");
                    if (attributeValue != null && kotlin.text.StringsKt.startsWith$default(attributeValue, "omid", false, 2, (java.lang.Object) null)) {
                        booleanRef.element = true;
                        objectRef.element = com.inmobi.media.Fl.b(wl.v(xmlPullParser));
                    }
                }
            } else if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v)) {
                list.addAll(wl.o(xmlPullParser));
            }
            return kotlin.Unit.INSTANCE;
        }
        wl.getClass();
        w(xmlPullParser);
        return kotlin.Unit.INSTANCE;
    }

    public final com.inmobi.media.De a(java.lang.String str, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.lang.String b = com.inmobi.media.Fl.b(v(xmlPullParser));
        if (!com.inmobi.media.Fl.a(b)) {
            com.inmobi.media.C2799u9 c2799u9 = this.c;
            if (c2799u9 == null) {
                return null;
            }
            c2799u9.b("VastParser", "Vast Tracker Error: " + str + io.ktor.sse.ServerSentEventKt.SPACE + b);
            return null;
        }
        return new com.inmobi.media.De(b, str);
    }

    public final void a(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, kotlin.jvm.functions.Function0 function0) {
        n(xmlPullParser);
        while (xmlPullParser.getEventType() != 1) {
            if (xmlPullParser.getName() != null && kotlin.jvm.internal.Intrinsics.areEqual(xmlPullParser.getName(), str) && xmlPullParser.getEventType() == 3) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                function0.invoke();
            }
            n(xmlPullParser);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0066 -> B:10:0x0077). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0074 -> B:10:0x0077). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Ll ll;
        int i;
        if (continuationImpl instanceof com.inmobi.media.Ll) {
            ll = (com.inmobi.media.Ll) continuationImpl;
            int i2 = ll.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ll.f = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = ll.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ll.f;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    n(xmlPullParser);
                    if (xmlPullParser.getEventType() == 1) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.jvm.functions.Function1 function12 = ll.c;
                str = ll.b;
                org.xmlpull.v1.XmlPullParser xmlPullParser2 = ll.f4824a;
                kotlin.ResultKt.throwOnFailure(obj);
                function1 = function12;
                xmlPullParser = xmlPullParser2;
                n(xmlPullParser);
                if (xmlPullParser.getEventType() == 1 || (xmlPullParser.getName() != null && kotlin.jvm.internal.Intrinsics.areEqual(xmlPullParser.getName(), str) && xmlPullParser.getEventType() == 3)) {
                    return kotlin.Unit.INSTANCE;
                }
                if (xmlPullParser.getEventType() == 2) {
                    ll.f4824a = xmlPullParser;
                    ll.b = str;
                    ll.c = function1;
                    ll.f = 1;
                    if (function1.invoke(ll) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                n(xmlPullParser);
                if (xmlPullParser.getEventType() == 1) {
                    if (xmlPullParser.getEventType() == 2) {
                    }
                    n(xmlPullParser);
                    if (xmlPullParser.getEventType() == 1) {
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        ll = new com.inmobi.media.Ll(this, continuationImpl);
        java.lang.Object obj2 = ll.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ll.f;
        if (i != 0) {
        }
    }
}
