package com.moloco.sdk.internal.services.bidtoken;

/* loaded from: classes5.dex */
public final class p implements com.moloco.sdk.internal.services.bidtoken.o {
    public static final int d = 0;
    public final com.moloco.sdk.internal.services.y b;
    public final com.moloco.sdk.internal.services.F c;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7233a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.moloco.sdk.internal.services.H.values().length];
            try {
                iArr[com.moloco.sdk.internal.services.H.f7205a.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.internal.services.H.b.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.moloco.sdk.internal.services.H.c.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f7233a = iArr;
            int[] iArr2 = new int[com.moloco.sdk.internal.services.z.values().length];
            try {
                iArr2[com.moloco.sdk.internal.services.z.f7323a.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.moloco.sdk.internal.services.z.b.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.moloco.sdk.internal.services.z.c.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }

    public p(com.moloco.sdk.internal.services.y deviceInfoService, com.moloco.sdk.internal.services.F screenInfoService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoService, "deviceInfoService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenInfoService, "screenInfoService");
        this.b = deviceInfoService;
        this.c = screenInfoService;
    }

    public final long a(long j) {
        return j * 1000000;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.o
    public com.moloco.sdk.BidToken.ClientBidTokenComponents b(byte[] payload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        com.moloco.sdk.BidToken.ClientBidTokenComponents parseFrom = com.moloco.sdk.BidToken.ClientBidTokenComponents.parseFrom(payload);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parseFrom, "parseFrom(...)");
        return parseFrom;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.o
    public byte[] a(byte[] bidTokenComponents, byte[] secret) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidTokenComponents, "bidTokenComponents");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secret, "secret");
        com.moloco.sdk.BidToken.ClientBidToken.Builder newBuilder = com.moloco.sdk.BidToken.ClientBidToken.newBuilder();
        newBuilder.setEs(com.google.protobuf.ByteString.copyFrom(secret));
        newBuilder.setPayload(com.google.protobuf.ByteString.copyFrom(bidTokenComponents));
        byte[] byteArray = newBuilder.build().toByteArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.o
    public com.moloco.sdk.BidToken.ClientBidTokenComponents a(com.moloco.sdk.internal.services.bidtoken.providers.k clientSignals, com.moloco.sdk.internal.services.bidtoken.f bidTokenConfig) {
        com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus batteryStatus;
        com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.ConnectionType connectionType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientSignals, "clientSignals");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidTokenConfig, "bidTokenConfig");
        com.moloco.sdk.internal.services.x b = this.b.b();
        com.moloco.sdk.internal.services.E a2 = this.c.a();
        com.moloco.sdk.BidToken.ClientBidTokenComponents.Builder newBuilder = com.moloco.sdk.BidToken.ClientBidTokenComponents.newBuilder();
        com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo.Builder newBuilder2 = com.moloco.sdk.BidToken.ClientBidTokenComponents.SdkInfo.newBuilder();
        newBuilder2.setInitialized(clientSignals.w());
        newBuilder.setInfo(newBuilder2.build());
        com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo.Builder newBuilder3 = com.moloco.sdk.BidToken.ClientBidTokenComponents.MemoryInfo.newBuilder();
        java.lang.Boolean d2 = clientSignals.t().d();
        if (d2 != null) {
            newBuilder3.setLowMem(d2.booleanValue());
        }
        java.lang.Long e = clientSignals.t().e();
        if (e != null) {
            newBuilder3.setLowMemThresholdBytes(e.longValue());
        }
        java.lang.Long f = clientSignals.t().f();
        if (f != null) {
            newBuilder3.setTotalMemBytes(f.longValue());
        }
        newBuilder.setMemoryInfo(newBuilder3.build());
        com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo.Builder newBuilder4 = com.moloco.sdk.BidToken.ClientBidTokenComponents.DirInfo.newBuilder();
        java.lang.Long b2 = clientSignals.o().b();
        if (b2 != null) {
            newBuilder4.setDsizeBytes(b2.longValue());
        }
        newBuilder.setDirInfo(newBuilder4.build());
        com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.Builder newBuilder5 = com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.newBuilder();
        if (clientSignals.u().e() != null) {
            newBuilder5.setMcc(clientSignals.u().e().intValue());
        }
        java.lang.Integer f2 = clientSignals.u().f();
        if (f2 != null) {
            newBuilder5.setMnc(f2.intValue());
        }
        java.lang.Boolean g = clientSignals.u().g();
        if (g != null) {
            newBuilder5.setRestricted(g.booleanValue());
        }
        com.moloco.sdk.internal.services.A h = clientSignals.u().h();
        if (h != null) {
            if (h instanceof com.moloco.sdk.internal.services.A.a) {
                connectionType = com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.ConnectionType.CELLULAR;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(h, com.moloco.sdk.internal.services.A.b.b)) {
                connectionType = com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.ConnectionType.NO_NETWORK;
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(h, com.moloco.sdk.internal.services.A.c.b)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                connectionType = com.moloco.sdk.BidToken.ClientBidTokenComponents.NetworkInfo.ConnectionType.WIFI;
            }
            newBuilder5.setType(connectionType);
        }
        newBuilder.setNetworkInfo(newBuilder5.build());
        com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.Builder newBuilder6 = com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.newBuilder();
        java.lang.Integer e2 = clientSignals.q().e();
        if (e2 != null) {
            newBuilder6.setMaxBatteryLevel(e2.intValue());
        }
        java.lang.Integer d3 = clientSignals.q().d();
        if (d3 != null) {
            int intValue = d3.intValue();
            if (intValue == 2) {
                batteryStatus = com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus.CHARGING;
            } else if (intValue == 3) {
                batteryStatus = com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus.DISCHARGING;
            } else if (intValue == 4) {
                batteryStatus = com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus.NOT_CHARGING;
            } else if (intValue != 5) {
                batteryStatus = com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus.UNKNOWN;
            } else {
                batteryStatus = com.moloco.sdk.BidToken.ClientBidTokenComponents.BatteryInfo.BatteryStatus.FULL;
            }
            newBuilder6.setBatteryStatus(batteryStatus);
        }
        java.lang.Boolean f3 = clientSignals.q().f();
        if (f3 != null) {
            newBuilder6.setLowPowMode(f3.booleanValue());
        }
        newBuilder.setBatteryInfo(newBuilder6.build());
        com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo.Builder newBuilder7 = com.moloco.sdk.BidToken.ClientBidTokenComponents.AdvertisingInfo.newBuilder();
        com.moloco.sdk.internal.services.AbstractC3432c n = clientSignals.n();
        if (n instanceof com.moloco.sdk.internal.services.AbstractC3432c.a) {
            newBuilder7.setDnt(false);
            newBuilder7.setId(((com.moloco.sdk.internal.services.AbstractC3432c.a) n).b());
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(n, com.moloco.sdk.internal.services.AbstractC3432c.b.b)) {
            newBuilder7.setDnt(true);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        newBuilder.setAdInfo(newBuilder7.build());
        com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.Builder newBuilder8 = com.moloco.sdk.BidToken.ClientBidTokenComponents.Privacy.newBuilder();
        java.lang.Boolean isAgeRestrictedUser = clientSignals.v().getIsAgeRestrictedUser();
        if (isAgeRestrictedUser != null) {
            newBuilder8.setCoppa(isAgeRestrictedUser.booleanValue());
        }
        java.lang.Boolean isUserConsent = clientSignals.v().getIsUserConsent();
        if (isUserConsent != null) {
            newBuilder8.setGdpr(isUserConsent.booleanValue());
        }
        java.lang.Boolean isDoNotSell = clientSignals.v().getIsDoNotSell();
        if (isDoNotSell != null) {
            newBuilder8.setCcpa(isDoNotSell.booleanValue());
        }
        java.lang.String tCFConsent = clientSignals.v().getTCFConsent();
        if (tCFConsent != null) {
            newBuilder8.setTcfConsentString(tCFConsent);
        }
        newBuilder8.setUsPrivacy(clientSignals.v().get_usPrivacy());
        newBuilder.setPrivacy(newBuilder8.build());
        com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Builder newBuilder9 = com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.newBuilder();
        newBuilder9.setLanguage(b.s());
        newBuilder9.setOsv(b.x());
        newBuilder9.setMake(b.t());
        newBuilder9.setModel(b.v());
        newBuilder9.setHwv(b.r());
        newBuilder9.setCarrier(b.u());
        newBuilder9.setDevicetype(b.z() ? 5 : 1);
        newBuilder9.setJs(1);
        com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo.Builder newBuilder10 = com.moloco.sdk.BidToken.ClientBidTokenComponents.Geo.newBuilder();
        newBuilder10.setUtcoffset(java.util.TimeZone.getDefault().getOffset(new java.util.Date().getTime()) / 60000);
        newBuilder9.setGeo(newBuilder10.build());
        newBuilder9.setW(a2.n());
        newBuilder9.setH(a2.l());
        newBuilder9.setPxratio(a2.i());
        newBuilder9.setPpi(a2.j());
        newBuilder9.setOs(b.w());
        if (bidTokenConfig.b()) {
            newBuilder9.setDbt(a(b.p()));
        }
        com.moloco.sdk.internal.services.H f4 = clientSignals.r().f();
        if (f4 != null) {
            newBuilder9.setOrtn(a(f4));
        }
        java.lang.Boolean a3 = this.b.a();
        if (a3 != null) {
            newBuilder9.setHasGy(a3.booleanValue());
        }
        java.lang.String d4 = clientSignals.r().d();
        if (d4 != null) {
            newBuilder9.setKbLoc(d4);
        }
        java.lang.String e3 = clientSignals.r().e();
        if (e3 != null) {
            newBuilder9.setLocale(e3);
        }
        newBuilder9.setXdpi(a2.o());
        newBuilder9.setYdpi(a2.p());
        newBuilder9.setHardware(b.q());
        newBuilder9.setBrand(b.o());
        newBuilder.setDevice(newBuilder9.build());
        com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.Builder newBuilder11 = com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.newBuilder();
        com.moloco.sdk.internal.services.z d5 = clientSignals.p().d();
        if (d5 != null) {
            newBuilder11.setMuteSwitch(a(d5));
        }
        java.lang.Integer c = clientSignals.p().c();
        if (c != null) {
            newBuilder11.setVol(c.intValue());
        }
        newBuilder.setAudioInfo(newBuilder11.build());
        com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo.Builder newBuilder12 = com.moloco.sdk.BidToken.ClientBidTokenComponents.AccessibilityInfo.newBuilder();
        java.lang.Float g2 = clientSignals.m().g();
        if (g2 != null) {
            newBuilder12.setFontScale(g2.floatValue());
        }
        java.lang.Boolean f5 = clientSignals.m().f();
        if (f5 != null) {
            newBuilder12.setAccessibilityLargePointerIcon(f5.booleanValue());
        }
        java.lang.Boolean e4 = clientSignals.m().e();
        if (e4 != null) {
            newBuilder12.setAccessibilityCaptioningEnabled(e4.booleanValue());
        }
        java.lang.Boolean h2 = clientSignals.m().h();
        if (h2 != null) {
            newBuilder12.setReduceBrightColorsActivated(h2.booleanValue());
        }
        newBuilder.setAccessibilityInfo(newBuilder12.build());
        if (clientSignals.s().q()) {
            com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.Builder newBuilder13 = com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.newBuilder();
            newBuilder13.setSessionId(clientSignals.s().o());
            newBuilder13.setLastImpTs(clientSignals.s().k());
            newBuilder13.setSessionStartTs(clientSignals.s().p());
            com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.Builder newBuilder14 = com.moloco.sdk.BidToken.ClientBidTokenComponents.ImpLvlRevData.ImpCounts.newBuilder();
            newBuilder14.setBanner(clientSignals.s().i());
            newBuilder14.setMrec(clientSignals.s().l());
            newBuilder14.setNative(clientSignals.s().m());
            newBuilder14.setInterstitial(clientSignals.s().j());
            newBuilder14.setRewarded(clientSignals.s().n());
            newBuilder13.setImpCounts(newBuilder14.build());
            newBuilder.setImpLvlRevData(newBuilder13.build());
        }
        java.lang.String b3 = clientSignals.x().b();
        if (b3 != null && (!kotlin.text.StringsKt.isBlank(b3))) {
            com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig.Builder newBuilder15 = com.moloco.sdk.BidToken.ClientBidTokenComponents.TestConfig.newBuilder();
            newBuilder15.setJsonConfig(b3);
            newBuilder.setTestConfig(newBuilder15.build());
        }
        com.moloco.sdk.BidToken.ClientBidTokenComponents build = newBuilder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.o
    public com.moloco.sdk.BidToken.ClientBidToken a(byte[] payload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        com.moloco.sdk.BidToken.ClientBidToken parseFrom = com.moloco.sdk.BidToken.ClientBidToken.parseFrom(payload);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parseFrom, "parseFrom(...)");
        return parseFrom;
    }

    public final com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Orientation a(com.moloco.sdk.internal.services.H h) {
        int i = com.moloco.sdk.internal.services.bidtoken.p.a.f7233a[h.ordinal()];
        if (i == 1) {
            return com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Orientation.UNKNOWN;
        }
        if (i == 2) {
            return com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Orientation.PORTRAIT;
        }
        if (i == 3) {
            return com.moloco.sdk.BidToken.ClientBidTokenComponents.Device.Orientation.LANDSCAPE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.MuteSwitchState a(com.moloco.sdk.internal.services.z zVar) {
        int i = com.moloco.sdk.internal.services.bidtoken.p.a.b[zVar.ordinal()];
        if (i == 1) {
            return com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.MuteSwitchState.SILENT;
        }
        if (i == 2) {
            return com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.MuteSwitchState.VIBRATE;
        }
        if (i == 3) {
            return com.moloco.sdk.BidToken.ClientBidTokenComponents.AudioInfo.MuteSwitchState.NORMAL;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
