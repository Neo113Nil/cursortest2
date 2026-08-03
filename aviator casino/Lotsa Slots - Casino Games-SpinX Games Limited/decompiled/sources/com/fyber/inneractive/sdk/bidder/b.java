package com.fyber.inneractive.sdk.bidder;

/* loaded from: classes3.dex */
public final class b implements com.fyber.inneractive.sdk.bidder.e, com.fyber.inneractive.sdk.config.v0, com.fyber.inneractive.sdk.config.cellular.h {
    public static final com.fyber.inneractive.sdk.bidder.b h = new com.fyber.inneractive.sdk.bidder.b();

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.bidder.k f3543a;
    public final com.fyber.inneractive.sdk.serverapi.c b;
    public final com.fyber.inneractive.sdk.bidder.d c;
    public com.fyber.inneractive.sdk.bidder.f d;
    public final java.util.concurrent.atomic.AtomicReference e = new java.util.concurrent.atomic.AtomicReference(null);
    public final java.util.concurrent.atomic.AtomicBoolean f = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.lang.Object g = new java.lang.Object();

    public b() {
        com.fyber.inneractive.sdk.config.cellular.a aVar;
        com.fyber.inneractive.sdk.serverapi.c cVar = new com.fyber.inneractive.sdk.serverapi.c(com.fyber.inneractive.sdk.config.global.r.a());
        this.b = cVar;
        com.fyber.inneractive.sdk.bidder.d dVar = new com.fyber.inneractive.sdk.bidder.d(cVar);
        this.c = dVar;
        this.f3543a = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.newBuilder();
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        iAConfigManager.w.e = this;
        if (iAConfigManager.t.b.a(true, "bidding_token_wait_for_ua")) {
            com.fyber.inneractive.sdk.util.s1 s1Var = iAConfigManager.x;
            s1Var.b();
            if (!s1Var.d.get()) {
                s1Var.c();
            }
            dVar.b = iAConfigManager.x.a();
        }
        if (!com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild() && (aVar = iAConfigManager.M) != null) {
            try {
                aVar.c.add(this);
            } catch (java.lang.Throwable th) {
                com.fyber.inneractive.sdk.util.IAlog.a("failed to add network observer", th, new java.lang.Object[0]);
            }
        }
        com.fyber.inneractive.sdk.bidder.f fVar = new com.fyber.inneractive.sdk.bidder.f(this);
        this.d = fVar;
        fVar.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0612, code lost:
    
        if (r3.equals(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D) == false) goto L136;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a() {
        org.json.JSONArray jSONArray;
        com.fyber.inneractive.sdk.bidder.u0 u0Var;
        java.lang.String str;
        com.fyber.inneractive.sdk.bidder.k kVar = this.f3543a;
        kVar.b = (com.fyber.inneractive.sdk.protobuf.z0) kVar.b.dynamicMethod(com.fyber.inneractive.sdk.protobuf.y0.NEW_MUTABLE_INSTANCE);
        com.fyber.inneractive.sdk.bidder.k kVar2 = this.f3543a;
        this.c.getClass();
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a2 = com.fyber.inneractive.sdk.bidder.h.a("1.2");
        kVar2.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar2.b).setVersion(a2);
        if (this.e.get() != null) {
            this.c.a();
        }
        com.fyber.inneractive.sdk.bidder.k kVar3 = this.f3543a;
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a3 = com.fyber.inneractive.sdk.bidder.h.a(this.c.b);
        kVar3.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar3.b).setUserAgent(a3);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a4 = com.fyber.inneractive.sdk.bidder.h.a(this.c.c);
        kVar3.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar3.b).setSdkVersion(a4);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a5 = com.fyber.inneractive.sdk.bidder.h.a(this.c.d);
        kVar3.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar3.b).setBundleID(a5);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a6 = com.fyber.inneractive.sdk.bidder.h.a(this.c.e);
        kVar3.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceModel(a6);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a7 = com.fyber.inneractive.sdk.bidder.h.a(this.c.f);
        kVar3.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar3.b).setAppVersion(a7);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a8 = com.fyber.inneractive.sdk.bidder.h.a(com.ironsource.X3.d);
        kVar3.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceOS(a8);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 a9 = com.fyber.inneractive.sdk.bidder.h.a(android.os.Build.VERSION.SDK_INT);
        kVar3.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceApi(a9);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a10 = com.fyber.inneractive.sdk.bidder.h.a(android.os.Build.VERSION.RELEASE);
        kVar3.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar3.b).setOsVersion(a10);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a11 = com.fyber.inneractive.sdk.bidder.h.a(this.c.g);
        kVar3.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceLanguage(a11);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a12 = com.fyber.inneractive.sdk.bidder.h.a(this.c.h);
        kVar3.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar3.b).setCountryCode(a12);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a13 = com.fyber.inneractive.sdk.bidder.h.a(this.c.i);
        kVar3.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar3.b).setCarrierName(a13);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a14 = com.fyber.inneractive.sdk.bidder.h.a(this.c.j);
        kVar3.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar3.b).setMobileCountryCode(a14);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a15 = com.fyber.inneractive.sdk.bidder.h.a(this.c.k);
        kVar3.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar3.b).setMobileNetworkCode(a15);
        java.lang.Long l = this.c.l;
        com.fyber.inneractive.sdk.bidder.y newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32.newBuilder();
        if (l != null) {
            int intValue = l.intValue();
            newBuilder.c();
            ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32) newBuilder.b).setData(intValue);
        }
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32 nullableSInt32 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32) newBuilder.a();
        kVar3.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar3.b).setOffsetFromGMT(nullableSInt32);
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a16 = com.fyber.inneractive.sdk.bidder.h.a(iAConfigManager.C.g);
        kVar3.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar3.b).setUserID(a16);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 a17 = com.fyber.inneractive.sdk.bidder.h.a(this.c.m);
        kVar3.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceWidth(a17);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 a18 = com.fyber.inneractive.sdk.bidder.h.a(this.c.n);
        kVar3.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceHeight(a18);
        com.fyber.inneractive.sdk.bidder.q qVar = this.c.o;
        kVar3.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar3.b).setFrameworkName(qVar);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a19 = com.fyber.inneractive.sdk.bidder.h.a(this.c.p);
        kVar3.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar3.b).setInputLanguages(a19);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a20 = com.fyber.inneractive.sdk.bidder.h.a(this.c.H);
        kVar3.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar3.b).setMediationType(a20);
        this.c.getClass();
        com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.D.p;
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a21 = com.fyber.inneractive.sdk.bidder.h.a(lVar != null ? lVar.getOdt() : "");
        kVar3.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar3.b).setOdt(a21);
        java.lang.Integer a22 = com.fyber.inneractive.sdk.serverapi.b.a();
        com.fyber.inneractive.sdk.bidder.a0 newBuilder2 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (a22 != null) {
            int intValue2 = a22.intValue();
            newBuilder2.c();
            ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder2.b).setData(intValue2);
        }
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder2.a();
        kVar3.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar3.b).setAdServicesVersion(nullableUInt32);
        com.fyber.inneractive.sdk.config.g gVar = iAConfigManager.C;
        char c = 0;
        if (gVar != null) {
            com.fyber.inneractive.sdk.bidder.k kVar4 = this.f3543a;
            if (gVar.m() == com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus.DOES_NOT_APPLY || com.fyber.inneractive.sdk.util.o.f4302a == null) {
                str = null;
            } else {
                gVar.o();
                if (gVar.e == null) {
                    gVar.k();
                }
                str = gVar.d;
                if (str == null) {
                    str = gVar.e;
                }
            }
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a23 = com.fyber.inneractive.sdk.bidder.h.a(str);
            kVar4.c();
            ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar4.b).setGdprString(a23);
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool a24 = com.fyber.inneractive.sdk.bidder.h.a(gVar.e());
            kVar4.c();
            ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar4.b).setGdprConsent(a24);
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a25 = com.fyber.inneractive.sdk.bidder.h.a(com.fyber.inneractive.sdk.util.o.f4302a == null ? null : gVar.h);
            kVar4.c();
            ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar4.b).setCcpaString(a25);
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool a26 = com.fyber.inneractive.sdk.bidder.h.a(com.fyber.inneractive.sdk.util.o.f4302a == null ? null : gVar.i);
            kVar4.c();
            ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar4.b).setLgpdConsent(a26);
            java.lang.Boolean bool = gVar.j;
            if (bool != null && bool.booleanValue()) {
                com.fyber.inneractive.sdk.bidder.k kVar5 = this.f3543a;
                com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool a27 = com.fyber.inneractive.sdk.bidder.h.a(bool);
                kVar5.c();
                ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar5.b).setCoppaApplies(a27);
            }
            com.fyber.inneractive.sdk.gpp.a aVar = gVar.m;
            java.lang.String str2 = aVar.d;
            java.lang.String str3 = aVar.f3769a.get() == null ? null : aVar.b;
            if (com.fyber.inneractive.sdk.util.v.a(str2) || com.fyber.inneractive.sdk.util.v.a(str3)) {
                com.fyber.inneractive.sdk.bidder.r newBuilder3 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp.newBuilder();
                if (com.fyber.inneractive.sdk.util.v.a(str2)) {
                    newBuilder3.c();
                    ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp) newBuilder3.b).setGppEncodedString(str2);
                } else {
                    com.fyber.inneractive.sdk.util.IAlog.a("%ssetGppDataToToken No GPP String found, not adding to token", com.fyber.inneractive.sdk.util.IAlog.a(this));
                }
                if (com.fyber.inneractive.sdk.util.v.a(str3)) {
                    newBuilder3.c();
                    ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp) newBuilder3.b).setGppSid(str3);
                } else {
                    com.fyber.inneractive.sdk.util.IAlog.a("%ssetGppDataToToken No GPP SID found, not adding to token", com.fyber.inneractive.sdk.util.IAlog.a(this));
                }
                com.fyber.inneractive.sdk.bidder.k kVar6 = this.f3543a;
                com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp gpp = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Gpp) newBuilder3.a();
                kVar6.c();
                ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar6.b).setGpp(gpp);
            } else {
                com.fyber.inneractive.sdk.util.IAlog.a("%ssetGppDataToToken No GPP data found", com.fyber.inneractive.sdk.util.IAlog.a(this));
            }
        }
        if (!com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild()) {
            com.fyber.inneractive.sdk.bidder.k kVar7 = this.f3543a;
            com.fyber.inneractive.sdk.config.v vVar = com.fyber.inneractive.sdk.config.u.f3639a.b;
            boolean z = vVar != null ? vVar.b : false;
            kVar7.c();
            ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar7.b).setDnt(z);
        }
        com.fyber.inneractive.sdk.bidder.k kVar8 = this.f3543a;
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a28 = com.fyber.inneractive.sdk.bidder.h.a(this.c.q);
        kVar8.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar8.b).setNetwork(a28);
        com.fyber.inneractive.sdk.bidder.g0 g0Var = this.c.r;
        kVar8.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar8.b).setSecureContent(g0Var);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool a29 = com.fyber.inneractive.sdk.bidder.h.a(this.c.B);
        kVar8.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar8.b).setBatteryCharging(a29);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool a30 = com.fyber.inneractive.sdk.bidder.h.a(this.c.s);
        kVar8.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar8.b).setHeadsetPlugged(a30);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool a31 = com.fyber.inneractive.sdk.bidder.h.a(this.c.t);
        kVar8.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar8.b).setBluetoothPlugged(a31);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool a32 = com.fyber.inneractive.sdk.bidder.h.a(this.c.u);
        kVar8.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar8.b).setLowPowerMode(a32);
        boolean z2 = this.c.v;
        kVar8.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar8.b).setDarkMode(z2);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool a33 = com.fyber.inneractive.sdk.bidder.h.a(this.c.w);
        kVar8.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar8.b).setAirplaneMode(a33);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool a34 = com.fyber.inneractive.sdk.bidder.h.a(this.c.x);
        kVar8.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar8.b).setDndMode(a34);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool a35 = com.fyber.inneractive.sdk.bidder.h.a(this.c.y);
        kVar8.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar8.b).setIsRingMuted(a35);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 a36 = com.fyber.inneractive.sdk.bidder.h.a(this.c.z);
        kVar8.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar8.b).setSessionDuration(a36);
        java.lang.String str4 = this.c.C;
        com.fyber.inneractive.sdk.bidder.a0 newBuilder4 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (!android.text.TextUtils.isEmpty(str4)) {
            int parseInt = java.lang.Integer.parseInt(str4);
            newBuilder4.c();
            ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder4.b).setData(parseInt);
        }
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt322 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder4.a();
        kVar8.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar8.b).setBatteryLevel(nullableUInt322);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool a37 = com.fyber.inneractive.sdk.bidder.h.a(java.lang.Boolean.valueOf(android.text.TextUtils.equals(iAConfigManager.w.a(com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL, "LAST_VAST_SKIPED"), "1")));
        kVar8.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar8.b).setPriorSkip(a37);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 a38 = com.fyber.inneractive.sdk.bidder.h.a(this.c.D);
        kVar8.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar8.b).setUserAge(a38);
        com.fyber.inneractive.sdk.external.InneractiveUserConfig.Gender gender = this.c.E;
        com.fyber.inneractive.sdk.bidder.q0 q0Var = gender == com.fyber.inneractive.sdk.external.InneractiveUserConfig.Gender.FEMALE ? com.fyber.inneractive.sdk.bidder.q0.FEMALE : gender == com.fyber.inneractive.sdk.external.InneractiveUserConfig.Gender.MALE ? com.fyber.inneractive.sdk.bidder.q0.MALE : com.fyber.inneractive.sdk.bidder.q0.UNKNOWN;
        kVar8.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar8.b).setUserGender(q0Var);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a39 = com.fyber.inneractive.sdk.bidder.h.a(this.c.G);
        kVar8.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar8.b).setZipCode(a39);
        boolean z3 = this.c.F;
        kVar8.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar8.b).setMuteAudio(z3);
        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool a40 = com.fyber.inneractive.sdk.bidder.h.a(this.c.L);
        kVar8.c();
        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar8.b).setMediaMuted(a40);
        com.fyber.inneractive.sdk.config.v vVar2 = com.fyber.inneractive.sdk.config.u.f3639a.b;
        if (vVar2 == null || !vVar2.c) {
            com.fyber.inneractive.sdk.bidder.k kVar9 = this.f3543a;
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a41 = com.fyber.inneractive.sdk.bidder.h.a(this.c.A);
            kVar9.c();
            ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar9.b).setAaid(a41);
        } else {
            com.fyber.inneractive.sdk.bidder.k kVar10 = this.f3543a;
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a42 = com.fyber.inneractive.sdk.bidder.h.a(this.c.A);
            kVar10.c();
            ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar10.b).setAmazonId(a42);
        }
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] values = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            char c2 = 2;
            if (i >= length) {
                com.fyber.inneractive.sdk.serverapi.c cVar = this.b;
                cVar.getClass();
                com.fyber.inneractive.sdk.config.global.r a43 = com.fyber.inneractive.sdk.config.global.r.a();
                cVar.f4264a = a43;
                a43.a(false, "");
                com.fyber.inneractive.sdk.config.global.r rVar = this.b.f4264a;
                if (rVar != null) {
                    jSONArray = com.fyber.inneractive.sdk.config.global.g.a(rVar.b, true);
                    com.fyber.inneractive.sdk.util.IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", jSONArray);
                } else {
                    jSONArray = null;
                }
                if (jSONArray != null) {
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                        if (optJSONObject != null) {
                            com.fyber.inneractive.sdk.bidder.n newBuilder5 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment.newBuilder();
                            java.lang.String optString = optJSONObject.optString("id");
                            newBuilder5.c();
                            ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment) newBuilder5.b).setIdentifier(optString);
                            java.lang.String optString2 = optJSONObject.optString("v");
                            newBuilder5.c();
                            ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment) newBuilder5.b).setVariant(optString2);
                            com.fyber.inneractive.sdk.bidder.k kVar11 = this.f3543a;
                            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment experiment = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment) newBuilder5.a();
                            kVar11.c();
                            ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar11.b).addAbExperiments(experiment);
                        }
                    }
                }
                com.fyber.inneractive.sdk.bidder.k kVar12 = this.f3543a;
                int i3 = com.fyber.inneractive.sdk.config.k.f3616a;
                java.lang.String property = java.lang.System.getProperty("ia.testEnvironmentConfiguration.number");
                com.fyber.inneractive.sdk.bidder.a0 newBuilder6 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
                if (!android.text.TextUtils.isEmpty(property)) {
                    int parseInt2 = java.lang.Integer.parseInt(property);
                    newBuilder6.c();
                    ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder6.b).setData(parseInt2);
                }
                com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt323 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder6.a();
                kVar12.c();
                ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar12.b).setPortal(nullableUInt323);
                com.fyber.inneractive.sdk.bidder.k kVar13 = this.f3543a;
                com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a44 = com.fyber.inneractive.sdk.bidder.h.a(java.lang.System.getProperty("ia.testEnvironmentConfiguration.response"));
                kVar13.c();
                ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar13.b).setMockResponseId(a44);
                com.fyber.inneractive.sdk.bidder.k kVar14 = this.f3543a;
                com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a45 = com.fyber.inneractive.sdk.bidder.h.a(this.c.I);
                kVar14.c();
                ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar14.b).setIgniteVersion(a45);
                com.fyber.inneractive.sdk.bidder.k kVar15 = this.f3543a;
                com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableString a46 = com.fyber.inneractive.sdk.bidder.h.a(this.c.J);
                kVar15.c();
                ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar15.b).setIgnitePackageName(a46);
                if (this.c.K) {
                    com.fyber.inneractive.sdk.bidder.k kVar16 = this.f3543a;
                    com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableBool a47 = com.fyber.inneractive.sdk.bidder.h.a(java.lang.Boolean.TRUE);
                    kVar16.c();
                    ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar16.b).setChildMode(a47);
                }
                return ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) this.f3543a.a()).toByteArray();
            }
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType = values[i];
            if (!unitDisplayType.isDeprecated()) {
                int[] iArr = com.fyber.inneractive.sdk.bidder.g.f3547a;
                int i4 = iArr[unitDisplayType.ordinal()];
                com.fyber.inneractive.sdk.bidder.o0 o0Var = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? com.fyber.inneractive.sdk.bidder.o0.UNITDISPLAYTYPEUNKNOWN : com.fyber.inneractive.sdk.bidder.o0.TYPENATIVE : com.fyber.inneractive.sdk.bidder.o0.MRECT : com.fyber.inneractive.sdk.bidder.o0.REWARDED : com.fyber.inneractive.sdk.bidder.o0.INTERSTITIAL : com.fyber.inneractive.sdk.bidder.o0.BANNER;
                com.fyber.inneractive.sdk.serverapi.a aVar2 = com.fyber.inneractive.sdk.serverapi.b.f4263a;
                com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager2 = com.fyber.inneractive.sdk.config.IAConfigManager.N;
                java.lang.String a48 = iAConfigManager2.w.a(unitDisplayType, "LAST_DOMAIN_SHOWED");
                if (!android.text.TextUtils.isEmpty(a48) && a48.contains(",")) {
                    a48 = a48.split(",")[c];
                }
                if (!android.text.TextUtils.isEmpty(a48)) {
                    com.fyber.inneractive.sdk.bidder.k kVar17 = this.f3543a;
                    com.fyber.inneractive.sdk.bidder.s newBuilder7 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain.newBuilder();
                    newBuilder7.c();
                    ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain) newBuilder7.b).setAdomain(a48);
                    newBuilder7.c();
                    ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain) newBuilder7.b).setType(o0Var);
                    com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain lastAdomain = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain) newBuilder7.a();
                    kVar17.c();
                    ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar17.b).addLastAdomains(lastAdomain);
                }
                java.lang.String a49 = iAConfigManager2.w.a(unitDisplayType, "LAST_APP_BUNDLE_ID");
                if (!android.text.TextUtils.isEmpty(a49)) {
                    com.fyber.inneractive.sdk.bidder.k kVar18 = this.f3543a;
                    com.fyber.inneractive.sdk.bidder.u newBuilder8 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle.newBuilder();
                    newBuilder8.c();
                    ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) newBuilder8.b).setLastBundle(a49);
                    newBuilder8.c();
                    ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) newBuilder8.b).setType(o0Var);
                    com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle lastAdvertisedBundle = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) newBuilder8.a();
                    kVar18.c();
                    ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar18.b).addLastAdvertisedBundles(lastAdvertisedBundle);
                }
                if (android.text.TextUtils.equals(iAConfigManager2.w.a(unitDisplayType, "LAST_CLICKED"), "1")) {
                    com.fyber.inneractive.sdk.bidder.k kVar19 = this.f3543a;
                    int i5 = iArr[unitDisplayType.ordinal()];
                    com.fyber.inneractive.sdk.bidder.o0 o0Var2 = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? com.fyber.inneractive.sdk.bidder.o0.UNITDISPLAYTYPEUNKNOWN : com.fyber.inneractive.sdk.bidder.o0.TYPENATIVE : com.fyber.inneractive.sdk.bidder.o0.MRECT : com.fyber.inneractive.sdk.bidder.o0.REWARDED : com.fyber.inneractive.sdk.bidder.o0.INTERSTITIAL : com.fyber.inneractive.sdk.bidder.o0.BANNER;
                    kVar19.c();
                    ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar19.b).addPriorClicks(o0Var2);
                }
                a("display", unitDisplayType, o0Var);
                if (unitDisplayType.isFullscreenUnit()) {
                    a("video", unitDisplayType, o0Var);
                    java.lang.String a50 = iAConfigManager2.w.a(unitDisplayType, "LAST_VAST_CLICKED_TYPE");
                    if (!android.text.TextUtils.isEmpty(a50)) {
                        com.fyber.inneractive.sdk.bidder.k kVar20 = this.f3543a;
                        com.fyber.inneractive.sdk.bidder.b0 newBuilder9 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType.newBuilder();
                        a50.getClass();
                        a50.hashCode();
                        switch (a50.hashCode()) {
                            case 49:
                                if (a50.equals("1")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 50:
                                if (a50.equals("2")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 51:
                                break;
                            case 52:
                                if (a50.equals("4")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 53:
                                if (a50.equals("5")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                u0Var = com.fyber.inneractive.sdk.bidder.u0.CTABUTTON;
                                break;
                            case 1:
                                u0Var = com.fyber.inneractive.sdk.bidder.u0.COMPANION;
                                break;
                            case 2:
                                u0Var = com.fyber.inneractive.sdk.bidder.u0.VIDEOVIEW;
                                break;
                            case 3:
                                u0Var = com.fyber.inneractive.sdk.bidder.u0.APPINFO;
                                break;
                            case 4:
                                u0Var = com.fyber.inneractive.sdk.bidder.u0.STOREPROMO;
                                break;
                            default:
                                u0Var = com.fyber.inneractive.sdk.bidder.u0.NOCLICK;
                                break;
                        }
                        newBuilder9.c();
                        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType) newBuilder9.b).setClickType(u0Var);
                        newBuilder9.c();
                        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType) newBuilder9.b).setType(o0Var);
                        com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType priorVideoClickType = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType) newBuilder9.a();
                        kVar20.c();
                        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar20.b).addPriorClickTypes(priorVideoClickType);
                    }
                }
            }
            i++;
            c = 0;
        }
    }

    public final void b() {
        byte[] byteArray;
        if (this.f.compareAndSet(false, true)) {
            try {
                java.lang.String encodeToString = android.util.Base64.encodeToString(a(), 2);
                com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
                java.lang.String str = iAConfigManager.l;
                com.fyber.inneractive.sdk.config.o oVar = iAConfigManager.t.b;
                java.lang.String str2 = "token_size_limit";
                int a2 = oVar.a("token_size_limit", com.vungle.ads.internal.protos.Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE, 1);
                if (!android.text.TextUtils.isEmpty(str)) {
                    str2 = "token_size_limit_" + str.toLowerCase(java.util.Locale.US);
                }
                com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters a3 = iAConfigManager.H.a(oVar.a(str2, a2, 1) - encodeToString.getBytes().length);
                if (a3 == null) {
                    byteArray = null;
                } else {
                    com.fyber.inneractive.sdk.bidder.k kVar = this.f3543a;
                    kVar.c();
                    com.fyber.inneractive.sdk.protobuf.t0.a(kVar.b, a3);
                    byteArray = ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar.a()).toByteArray();
                }
                java.util.concurrent.atomic.AtomicReference atomicReference = this.e;
                if (byteArray != null) {
                    encodeToString = android.util.Base64.encodeToString(byteArray, 2);
                }
                atomicReference.set(encodeToString);
            } catch (java.lang.Throwable th) {
                com.fyber.inneractive.sdk.util.IAlog.b("Failed to generate token with error: %s", th.getMessage());
            }
            this.f.set(false);
        }
    }

    public final void c() {
        int currentInterruptionFilter = ((android.app.NotificationManager) com.fyber.inneractive.sdk.util.o.f4302a.getSystemService(com.helpshift.util.ConfigValues.SOURCE_NOTIFICATION)).getCurrentInterruptionFilter();
        boolean z = currentInterruptionFilter >= 2 && currentInterruptionFilter <= 4;
        java.lang.Boolean bool = this.c.x;
        if (bool == null || bool.booleanValue() != z) {
            this.c.x = java.lang.Boolean.valueOf(z);
            d();
        }
    }

    public final void d() {
        com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.bidder.a(this));
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.h
    public final void a(com.fyber.inneractive.sdk.util.a1 a1Var) {
        if (android.text.TextUtils.equals(this.c.q, a1Var.b())) {
            return;
        }
        this.c.q = a1Var.b();
        d();
    }

    public final void a(java.lang.String str, com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType, com.fyber.inneractive.sdk.bidder.o0 o0Var) {
        java.util.ArrayList arrayList;
        int i;
        com.fyber.inneractive.sdk.bidder.m0 m0Var;
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        com.fyber.inneractive.sdk.cache.session.e eVar = iAConfigManager.w.f3644a;
        if (eVar != null) {
            com.fyber.inneractive.sdk.cache.session.k kVar = (com.fyber.inneractive.sdk.cache.session.k) eVar.b.get(com.fyber.inneractive.sdk.cache.session.enums.c.a(unitDisplayType.value(), str));
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession userSession = null;
            if (kVar != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kVar);
                java.util.Collections.sort(arrayList2, new com.fyber.inneractive.sdk.cache.session.j());
                arrayList = new java.util.ArrayList(arrayList2);
            } else {
                arrayList = null;
            }
            try {
                i = java.lang.Integer.parseInt(iAConfigManager.t.b.a("number_of_sessions", java.lang.Integer.toString(5)));
            } catch (java.lang.Throwable unused) {
                i = 5;
            }
            int i2 = i >= 0 ? i : 5;
            if (i2 > 0 && arrayList != null && arrayList.size() >= i2) {
                if (str.equals("video")) {
                    m0Var = com.fyber.inneractive.sdk.bidder.m0.VIDEO;
                } else if (!str.equals("display")) {
                    m0Var = com.fyber.inneractive.sdk.bidder.m0.UNITCONTENTTYPEUNKNOWN;
                } else {
                    m0Var = com.fyber.inneractive.sdk.bidder.m0.DISPLAY;
                }
                com.fyber.inneractive.sdk.bidder.r0 newBuilder = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession.newBuilder();
                newBuilder.c();
                ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) newBuilder.b).setSubType(m0Var);
                java.util.Iterator it = arrayList.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    com.fyber.inneractive.sdk.cache.session.g gVar = (com.fyber.inneractive.sdk.cache.session.g) it.next();
                    com.fyber.inneractive.sdk.bidder.h0 newBuilder2 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData.newBuilder();
                    int i4 = gVar.b;
                    newBuilder2.c();
                    ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) newBuilder2.b).setClicks(i4);
                    int i5 = gVar.f3567a;
                    newBuilder2.c();
                    ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) newBuilder2.b).setImpressions(i5);
                    if (str.equals("video") || o0Var.equals(com.fyber.inneractive.sdk.bidder.o0.REWARDED)) {
                        int i6 = gVar.c;
                        newBuilder2.c();
                        ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) newBuilder2.b).setCompletions(i6);
                    }
                    com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData sessionData = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) newBuilder2.a();
                    newBuilder.c();
                    ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) newBuilder.b).addSessionDataItems(sessionData);
                    i3++;
                    if (i3 >= i2) {
                        break;
                    }
                }
                newBuilder.c();
                ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) newBuilder.b).setType(o0Var);
                userSession = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) newBuilder.a();
            }
            if (userSession == null || userSession.getSessionDataItemsList().size() <= 0) {
                return;
            }
            com.fyber.inneractive.sdk.bidder.k kVar2 = this.f3543a;
            kVar2.c();
            ((com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) kVar2.b).addUserSessions(userSession);
        }
    }
}
