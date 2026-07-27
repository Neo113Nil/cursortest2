package com.fyber.inneractive.sdk.bidder;

import android.app.NotificationManager;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a1;
import com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.protobuf.y0;
import com.fyber.inneractive.sdk.protobuf.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t1;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b implements e, a1, com.fyber.inneractive.sdk.config.cellular.h {
    public static final b h = new b();

    /* renamed from: a, reason: collision with root package name */
    public final k f5192a;
    public final com.fyber.inneractive.sdk.serverapi.c b;
    public final d c;
    public f d;
    public final AtomicReference e = new AtomicReference(null);
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final Object g = new Object();

    public b() {
        com.fyber.inneractive.sdk.config.cellular.a aVar;
        com.fyber.inneractive.sdk.serverapi.c cVar = new com.fyber.inneractive.sdk.serverapi.c(com.fyber.inneractive.sdk.config.global.r.a());
        this.b = cVar;
        d dVar = new d(cVar);
        this.c = dVar;
        this.f5192a = TokenParametersOuterClass$TokenParameters.newBuilder();
        IAConfigManager iAConfigManager = IAConfigManager.R;
        iAConfigManager.x.e = this;
        if (iAConfigManager.u.b.a(true, "bidding_token_wait_for_ua")) {
            t1 t1Var = iAConfigManager.y;
            t1Var.b();
            if (!t1Var.d.get()) {
                t1Var.c();
            }
            dVar.b = iAConfigManager.y.a();
        }
        if (!InneractiveAdManager.isCurrentUserAChild() && (aVar = iAConfigManager.P) != null) {
            try {
                aVar.c.add(this);
            } catch (Throwable th) {
                IAlog.a("failed to add network observer", th, new Object[0]);
            }
        }
        f fVar = new f(this);
        this.d = fVar;
        com.fyber.inneractive.sdk.util.o.f5960a.registerReceiver(fVar, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        com.fyber.inneractive.sdk.util.o.f5960a.registerReceiver(fVar, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        com.fyber.inneractive.sdk.util.o.f5960a.registerReceiver(fVar, new IntentFilter("android.app.action.INTERRUPTION_FILTER_CHANGED"));
        com.fyber.inneractive.sdk.util.o.f5960a.registerReceiver(fVar, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
        com.fyber.inneractive.sdk.util.o.f5960a.registerReceiver(fVar, new IntentFilter("android.intent.action.AIRPLANE_MODE"));
        if (com.fyber.inneractive.sdk.util.o.a("android.permission.BLUETOOTH")) {
            com.fyber.inneractive.sdk.util.o.f5960a.registerReceiver(fVar, new IntentFilter("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED"));
            com.fyber.inneractive.sdk.util.o.f5960a.registerReceiver(fVar, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0656, code lost:
    
        if (r3.equals("2") == false) goto L146;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a() {
        JSONArray jSONArray;
        ?? r12;
        ?? r13;
        u0 u0Var;
        char c;
        char c2;
        o0 o0Var;
        String str;
        k kVar = this.f5192a;
        kVar.b = (z0) kVar.b.dynamicMethod(y0.NEW_MUTABLE_INSTANCE);
        k kVar2 = this.f5192a;
        this.c.getClass();
        TokenParametersOuterClass$TokenParameters.NullableString a2 = h.a("1.2");
        kVar2.c();
        ((TokenParametersOuterClass$TokenParameters) kVar2.b).setVersion(a2);
        if (this.e.get() != null) {
            this.c.a();
        }
        k kVar3 = this.f5192a;
        TokenParametersOuterClass$TokenParameters.NullableString a3 = h.a(this.c.b);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setUserAgent(a3);
        TokenParametersOuterClass$TokenParameters.NullableString a4 = h.a(this.c.c);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setSdkVersion(a4);
        TokenParametersOuterClass$TokenParameters.NullableString a5 = h.a(this.c.d);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setBundleID(a5);
        TokenParametersOuterClass$TokenParameters.NullableString a6 = h.a(this.c.e);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceModel(a6);
        TokenParametersOuterClass$TokenParameters.NullableString a7 = h.a(this.c.f);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setAppVersion(a7);
        TokenParametersOuterClass$TokenParameters.NullableString a8 = h.a(U3.d);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceOS(a8);
        int i = Build.VERSION.SDK_INT;
        a0 newBuilder = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        newBuilder.c();
        ((TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder.b).setData(i);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder.a();
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceApi(nullableUInt32);
        TokenParametersOuterClass$TokenParameters.NullableString a9 = h.a(Build.VERSION.RELEASE);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setOsVersion(a9);
        TokenParametersOuterClass$TokenParameters.NullableString a10 = h.a(this.c.g);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceLanguage(a10);
        TokenParametersOuterClass$TokenParameters.NullableString a11 = h.a(this.c.h);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setCountryCode(a11);
        TokenParametersOuterClass$TokenParameters.NullableString a12 = h.a(this.c.i);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setCarrierName(a12);
        TokenParametersOuterClass$TokenParameters.NullableString a13 = h.a(this.c.j);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setMobileCountryCode(a13);
        TokenParametersOuterClass$TokenParameters.NullableString a14 = h.a(this.c.k);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setMobileNetworkCode(a14);
        Long l = this.c.l;
        y newBuilder2 = TokenParametersOuterClass$TokenParameters.NullableSInt32.newBuilder();
        if (l != null) {
            int intValue = l.intValue();
            newBuilder2.c();
            ((TokenParametersOuterClass$TokenParameters.NullableSInt32) newBuilder2.b).setData(intValue);
        }
        TokenParametersOuterClass$TokenParameters.NullableSInt32 nullableSInt32 = (TokenParametersOuterClass$TokenParameters.NullableSInt32) newBuilder2.a();
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setOffsetFromGMT(nullableSInt32);
        IAConfigManager iAConfigManager = IAConfigManager.R;
        TokenParametersOuterClass$TokenParameters.NullableString a15 = h.a(iAConfigManager.E.g);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setUserID(a15);
        int i2 = this.c.m;
        a0 newBuilder3 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (i2 > 0) {
            newBuilder3.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder3.b).setData(i2);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt322 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder3.a();
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceWidth(nullableUInt322);
        int i3 = this.c.n;
        a0 newBuilder4 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (i3 > 0) {
            newBuilder4.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder4.b).setData(i3);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt323 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder4.a();
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setDeviceHeight(nullableUInt323);
        q qVar = this.c.o;
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setFrameworkName(qVar);
        TokenParametersOuterClass$TokenParameters.NullableString a16 = h.a(this.c.p);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setInputLanguages(a16);
        TokenParametersOuterClass$TokenParameters.NullableString a17 = h.a(this.c.G);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setMediationType(a17);
        this.c.getClass();
        com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.F.o;
        TokenParametersOuterClass$TokenParameters.NullableString a18 = h.a(lVar != null ? lVar.getOdt() : "");
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setOdt(a18);
        Integer a19 = com.fyber.inneractive.sdk.serverapi.b.a();
        a0 newBuilder5 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (a19 != null) {
            int intValue2 = a19.intValue();
            newBuilder5.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder5.b).setData(intValue2);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt324 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder5.a();
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.b).setAdServicesVersion(nullableUInt324);
        com.fyber.inneractive.sdk.config.h hVar = iAConfigManager.E;
        if (hVar != null) {
            k kVar4 = this.f5192a;
            if (hVar.n() == IabTcfGdprAppliesStatus.DOES_NOT_APPLY || com.fyber.inneractive.sdk.util.o.f5960a == null) {
                str = null;
            } else {
                hVar.p();
                if (hVar.e == null) {
                    hVar.e = hVar.l();
                }
                str = hVar.d;
                if (str == null) {
                    str = hVar.e;
                }
            }
            TokenParametersOuterClass$TokenParameters.NullableString a20 = h.a(str);
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.b).setGdprString(a20);
            TokenParametersOuterClass$TokenParameters.NullableBool a21 = h.a(hVar.e());
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.b).setGdprConsent(a21);
            TokenParametersOuterClass$TokenParameters.NullableString a22 = h.a(com.fyber.inneractive.sdk.util.o.f5960a == null ? null : hVar.h);
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.b).setCcpaString(a22);
            TokenParametersOuterClass$TokenParameters.NullableBool a23 = h.a(com.fyber.inneractive.sdk.util.o.f5960a == null ? null : hVar.i);
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.b).setLgpdConsent(a23);
            Boolean bool = hVar.j;
            if (bool != null && bool.booleanValue()) {
                k kVar5 = this.f5192a;
                TokenParametersOuterClass$TokenParameters.NullableBool a24 = h.a(bool);
                kVar5.c();
                ((TokenParametersOuterClass$TokenParameters) kVar5.b).setCoppaApplies(a24);
            }
            com.fyber.inneractive.sdk.gpp.a aVar = hVar.n;
            String str2 = aVar.d;
            String str3 = aVar.f5423a.get() == null ? null : aVar.b;
            if (com.fyber.inneractive.sdk.util.v.a(str2) || com.fyber.inneractive.sdk.util.v.a(str3)) {
                r newBuilder6 = TokenParametersOuterClass$TokenParameters.Gpp.newBuilder();
                if (com.fyber.inneractive.sdk.util.v.a(str2)) {
                    newBuilder6.c();
                    ((TokenParametersOuterClass$TokenParameters.Gpp) newBuilder6.b).setGppEncodedString(str2);
                } else {
                    IAlog.a("%ssetGppDataToToken No GPP String found, not adding to token", IAlog.a(this));
                }
                if (com.fyber.inneractive.sdk.util.v.a(str3)) {
                    newBuilder6.c();
                    ((TokenParametersOuterClass$TokenParameters.Gpp) newBuilder6.b).setGppSid(str3);
                } else {
                    IAlog.a("%ssetGppDataToToken No GPP SID found, not adding to token", IAlog.a(this));
                }
                k kVar6 = this.f5192a;
                TokenParametersOuterClass$TokenParameters.Gpp gpp = (TokenParametersOuterClass$TokenParameters.Gpp) newBuilder6.a();
                kVar6.c();
                ((TokenParametersOuterClass$TokenParameters) kVar6.b).setGpp(gpp);
            } else {
                IAlog.a("%ssetGppDataToToken No GPP data found", IAlog.a(this));
            }
        }
        char c3 = 0;
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            k kVar7 = this.f5192a;
            com.fyber.inneractive.sdk.config.y yVar = com.fyber.inneractive.sdk.config.x.f5294a.b;
            boolean z = yVar != null ? yVar.b : false;
            kVar7.c();
            ((TokenParametersOuterClass$TokenParameters) kVar7.b).setDnt(z);
        }
        k kVar8 = this.f5192a;
        TokenParametersOuterClass$TokenParameters.NullableString a25 = h.a(this.c.q);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setNetwork(a25);
        g0 g0Var = this.c.r;
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setSecureContent(g0Var);
        TokenParametersOuterClass$TokenParameters.NullableBool a26 = h.a(this.c.B);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setBatteryCharging(a26);
        TokenParametersOuterClass$TokenParameters.NullableBool a27 = h.a(this.c.s);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setHeadsetPlugged(a27);
        TokenParametersOuterClass$TokenParameters.NullableBool a28 = h.a(this.c.t);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setBluetoothPlugged(a28);
        TokenParametersOuterClass$TokenParameters.NullableBool a29 = h.a(this.c.u);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setLowPowerMode(a29);
        boolean z2 = this.c.v;
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setDarkMode(z2);
        TokenParametersOuterClass$TokenParameters.NullableBool a30 = h.a(this.c.w);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setAirplaneMode(a30);
        TokenParametersOuterClass$TokenParameters.NullableBool a31 = h.a(this.c.x);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setDndMode(a31);
        TokenParametersOuterClass$TokenParameters.NullableBool a32 = h.a(this.c.y);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setIsRingMuted(a32);
        int i4 = this.c.z;
        a0 newBuilder7 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (i4 > 0) {
            newBuilder7.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder7.b).setData(i4);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt325 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder7.a();
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setSessionDuration(nullableUInt325);
        String str4 = this.c.C;
        a0 newBuilder8 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (!TextUtils.isEmpty(str4)) {
            int parseInt = Integer.parseInt(str4);
            newBuilder8.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder8.b).setData(parseInt);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt326 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder8.a();
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setBatteryLevel(nullableUInt326);
        TokenParametersOuterClass$TokenParameters.NullableBool a33 = h.a(Boolean.valueOf(TextUtils.equals(iAConfigManager.x.a(UnitDisplayType.INTERSTITIAL, "LAST_VAST_SKIPED"), "1")));
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setPriorSkip(a33);
        InneractiveUserConfig.Gender gender = this.c.D;
        q0 q0Var = gender == InneractiveUserConfig.Gender.FEMALE ? q0.FEMALE : gender == InneractiveUserConfig.Gender.MALE ? q0.MALE : q0.UNKNOWN;
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setUserGender(q0Var);
        TokenParametersOuterClass$TokenParameters.NullableString a34 = h.a(this.c.F);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setZipCode(a34);
        boolean z3 = this.c.E;
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setMuteAudio(z3);
        TokenParametersOuterClass$TokenParameters.NullableBool a35 = h.a(this.c.K);
        kVar8.c();
        ((TokenParametersOuterClass$TokenParameters) kVar8.b).setMediaMuted(a35);
        com.fyber.inneractive.sdk.config.y yVar2 = com.fyber.inneractive.sdk.config.x.f5294a.b;
        if (yVar2 != null ? yVar2.c : false) {
            k kVar9 = this.f5192a;
            TokenParametersOuterClass$TokenParameters.NullableString a36 = h.a(this.c.A);
            kVar9.c();
            ((TokenParametersOuterClass$TokenParameters) kVar9.b).setAmazonId(a36);
        } else {
            k kVar10 = this.f5192a;
            TokenParametersOuterClass$TokenParameters.NullableString a37 = h.a(this.c.A);
            kVar10.c();
            ((TokenParametersOuterClass$TokenParameters) kVar10.b).setAaid(a37);
        }
        UnitDisplayType[] values = UnitDisplayType.values();
        int length = values.length;
        int i5 = 0;
        while (true) {
            boolean z4 = true;
            if (i5 >= length) {
                com.fyber.inneractive.sdk.serverapi.c cVar = this.b;
                cVar.getClass();
                com.fyber.inneractive.sdk.config.global.r a38 = com.fyber.inneractive.sdk.config.global.r.a();
                cVar.f5921a = a38;
                a38.a(false, "");
                com.fyber.inneractive.sdk.config.global.r rVar = this.b.f5921a;
                if (rVar != null) {
                    jSONArray = com.fyber.inneractive.sdk.config.global.g.a(rVar.b, true);
                    IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", jSONArray);
                } else {
                    jSONArray = null;
                }
                if (jSONArray != null) {
                    for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i6);
                        if (optJSONObject != null) {
                            n newBuilder9 = TokenParametersOuterClass$TokenParameters.Experiment.newBuilder();
                            String optString = optJSONObject.optString("id");
                            newBuilder9.c();
                            ((TokenParametersOuterClass$TokenParameters.Experiment) newBuilder9.b).setIdentifier(optString);
                            String optString2 = optJSONObject.optString("v");
                            newBuilder9.c();
                            ((TokenParametersOuterClass$TokenParameters.Experiment) newBuilder9.b).setVariant(optString2);
                            k kVar11 = this.f5192a;
                            TokenParametersOuterClass$TokenParameters.Experiment experiment = (TokenParametersOuterClass$TokenParameters.Experiment) newBuilder9.a();
                            kVar11.c();
                            ((TokenParametersOuterClass$TokenParameters) kVar11.b).addAbExperiments(experiment);
                        }
                    }
                }
                k kVar12 = this.f5192a;
                int i7 = com.fyber.inneractive.sdk.config.n.f5271a;
                String property = System.getProperty("ia.testEnvironmentConfiguration.number");
                a0 newBuilder10 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
                if (!TextUtils.isEmpty(property)) {
                    int parseInt2 = Integer.parseInt(property);
                    newBuilder10.c();
                    ((TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder10.b).setData(parseInt2);
                }
                TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt327 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder10.a();
                kVar12.c();
                ((TokenParametersOuterClass$TokenParameters) kVar12.b).setPortal(nullableUInt327);
                k kVar13 = this.f5192a;
                TokenParametersOuterClass$TokenParameters.NullableString a39 = h.a(System.getProperty("ia.testEnvironmentConfiguration.response"));
                kVar13.c();
                ((TokenParametersOuterClass$TokenParameters) kVar13.b).setMockResponseId(a39);
                k kVar14 = this.f5192a;
                TokenParametersOuterClass$TokenParameters.NullableString a40 = h.a(this.c.H);
                kVar14.c();
                ((TokenParametersOuterClass$TokenParameters) kVar14.b).setIgniteVersion(a40);
                k kVar15 = this.f5192a;
                TokenParametersOuterClass$TokenParameters.NullableString a41 = h.a(this.c.I);
                kVar15.c();
                ((TokenParametersOuterClass$TokenParameters) kVar15.b).setIgnitePackageName(a41);
                if (this.c.J) {
                    k kVar16 = this.f5192a;
                    TokenParametersOuterClass$TokenParameters.NullableBool a42 = h.a(Boolean.TRUE);
                    kVar16.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar16.b).setChildMode(a42);
                }
                return ((TokenParametersOuterClass$TokenParameters) this.f5192a.a()).toByteArray();
            }
            UnitDisplayType unitDisplayType = values[i5];
            if (!unitDisplayType.isDeprecated()) {
                int[] iArr = g.f5196a;
                int i8 = iArr[unitDisplayType.ordinal()];
                o0 o0Var2 = i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? o0.UNITDISPLAYTYPEUNKNOWN : o0.TYPENATIVE : o0.MRECT : o0.REWARDED : o0.INTERSTITIAL : o0.BANNER;
                com.fyber.inneractive.sdk.serverapi.a aVar2 = com.fyber.inneractive.sdk.serverapi.b.f5920a;
                IAConfigManager iAConfigManager2 = IAConfigManager.R;
                String a43 = iAConfigManager2.x.a(unitDisplayType, "LAST_DOMAIN_SHOWED");
                if (!TextUtils.isEmpty(a43) && a43.contains(",")) {
                    a43 = a43.split(",")[c3];
                }
                if (!TextUtils.isEmpty(a43)) {
                    k kVar17 = this.f5192a;
                    s newBuilder11 = TokenParametersOuterClass$TokenParameters.LastAdomain.newBuilder();
                    newBuilder11.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdomain) newBuilder11.b).setAdomain(a43);
                    newBuilder11.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdomain) newBuilder11.b).setType(o0Var2);
                    TokenParametersOuterClass$TokenParameters.LastAdomain lastAdomain = (TokenParametersOuterClass$TokenParameters.LastAdomain) newBuilder11.a();
                    kVar17.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar17.b).addLastAdomains(lastAdomain);
                }
                String a44 = iAConfigManager2.x.a(unitDisplayType, "LAST_APP_BUNDLE_ID");
                if (!TextUtils.isEmpty(a44)) {
                    k kVar18 = this.f5192a;
                    u newBuilder12 = TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle.newBuilder();
                    newBuilder12.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) newBuilder12.b).setLastBundle(a44);
                    newBuilder12.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) newBuilder12.b).setType(o0Var2);
                    TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle lastAdvertisedBundle = (TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) newBuilder12.a();
                    kVar18.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar18.b).addLastAdvertisedBundles(lastAdvertisedBundle);
                }
                if (TextUtils.equals(iAConfigManager2.x.a(unitDisplayType, "LAST_CLICKED"), "1")) {
                    k kVar19 = this.f5192a;
                    int i9 = iArr[unitDisplayType.ordinal()];
                    if (i9 == 1) {
                        c = 3;
                        c2 = 4;
                        o0Var = o0.BANNER;
                    } else if (i9 != 2) {
                        c = 3;
                        c = 3;
                        c = 3;
                        c = 3;
                        if (i9 != 3) {
                            c2 = 4;
                            c2 = 4;
                            c2 = 4;
                            o0Var = i9 != 4 ? i9 != 5 ? o0.UNITDISPLAYTYPEUNKNOWN : o0.TYPENATIVE : o0.MRECT;
                        } else {
                            c2 = 4;
                            o0Var = o0.REWARDED;
                        }
                    } else {
                        c = 3;
                        c2 = 4;
                        o0Var = o0.INTERSTITIAL;
                    }
                    kVar19.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar19.b).addPriorClicks(o0Var);
                    r12 = c;
                    r13 = c2;
                } else {
                    r12 = 3;
                    r13 = 4;
                }
                a("display", unitDisplayType, o0Var2);
                if (unitDisplayType.isFullscreenUnit()) {
                    a("video", unitDisplayType, o0Var2);
                    String a45 = iAConfigManager2.x.a(unitDisplayType, "LAST_VAST_CLICKED_TYPE");
                    if (!TextUtils.isEmpty(a45)) {
                        k kVar20 = this.f5192a;
                        b0 newBuilder13 = TokenParametersOuterClass$TokenParameters.PriorVideoClickType.newBuilder();
                        a45.getClass();
                        a45.hashCode();
                        switch (a45.hashCode()) {
                            case 49:
                                if (a45.equals("1")) {
                                    z4 = false;
                                    break;
                                }
                                z4 = -1;
                                break;
                            case 50:
                                break;
                            case 51:
                                if (a45.equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                                    z4 = 2;
                                    break;
                                }
                                z4 = -1;
                                break;
                            case 52:
                                if (a45.equals("4")) {
                                    z4 = r12;
                                    break;
                                }
                                z4 = -1;
                                break;
                            case 53:
                                if (a45.equals(CampaignEx.CLICKMODE_ON)) {
                                    z4 = r13;
                                    break;
                                }
                                z4 = -1;
                                break;
                            default:
                                z4 = -1;
                                break;
                        }
                        switch (z4) {
                            case false:
                                u0Var = u0.CTABUTTON;
                                break;
                            case true:
                                u0Var = u0.COMPANION;
                                break;
                            case true:
                                u0Var = u0.VIDEOVIEW;
                                break;
                            case true:
                                u0Var = u0.APPINFO;
                                break;
                            case true:
                                u0Var = u0.STOREPROMO;
                                break;
                            default:
                                u0Var = u0.NOCLICK;
                                break;
                        }
                        newBuilder13.c();
                        ((TokenParametersOuterClass$TokenParameters.PriorVideoClickType) newBuilder13.b).setClickType(u0Var);
                        newBuilder13.c();
                        ((TokenParametersOuterClass$TokenParameters.PriorVideoClickType) newBuilder13.b).setType(o0Var2);
                        TokenParametersOuterClass$TokenParameters.PriorVideoClickType priorVideoClickType = (TokenParametersOuterClass$TokenParameters.PriorVideoClickType) newBuilder13.a();
                        kVar20.c();
                        ((TokenParametersOuterClass$TokenParameters) kVar20.b).addPriorClickTypes(priorVideoClickType);
                    }
                }
            }
            i5++;
            c3 = 0;
        }
    }

    public final void b() {
        byte[] byteArray;
        if (this.f.compareAndSet(false, true)) {
            try {
                String encodeToString = Base64.encodeToString(a(), 2);
                IAConfigManager iAConfigManager = IAConfigManager.R;
                String str = iAConfigManager.m;
                com.fyber.inneractive.sdk.config.r rVar = iAConfigManager.u.b;
                String str2 = "token_size_limit";
                int a2 = rVar.a("token_size_limit", 4000, 1);
                if (!TextUtils.isEmpty(str)) {
                    str2 = "token_size_limit_" + str.toLowerCase(Locale.US);
                }
                TokenParametersOuterClass$TokenParameters a3 = iAConfigManager.J.a(rVar.a(str2, a2, 1) - encodeToString.getBytes().length);
                if (a3 == null) {
                    byteArray = null;
                } else {
                    k kVar = this.f5192a;
                    kVar.c();
                    com.fyber.inneractive.sdk.protobuf.t0.a(kVar.b, a3);
                    byteArray = ((TokenParametersOuterClass$TokenParameters) kVar.a()).toByteArray();
                }
                AtomicReference atomicReference = this.e;
                if (byteArray != null) {
                    encodeToString = Base64.encodeToString(byteArray, 2);
                }
                atomicReference.set(encodeToString);
            } catch (Throwable th) {
                IAlog.b("Failed to generate token with error: %s", th.getMessage());
            }
            this.f.set(false);
        }
    }

    public final void c() {
        int currentInterruptionFilter = ((NotificationManager) com.fyber.inneractive.sdk.util.o.f5960a.getSystemService("notification")).getCurrentInterruptionFilter();
        boolean z = currentInterruptionFilter >= 2 && currentInterruptionFilter <= 4;
        Boolean bool = this.c.x;
        if (bool == null || bool.booleanValue() != z) {
            this.c.x = Boolean.valueOf(z);
            d();
        }
    }

    public final void d() {
        com.fyber.inneractive.sdk.util.r.f5965a.execute(new a(this));
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.h
    public final void a(com.fyber.inneractive.sdk.util.a1 a1Var) {
        if (TextUtils.equals(this.c.q, a1Var.b())) {
            return;
        }
        this.c.q = a1Var.b();
        d();
    }

    public final void a(String str, UnitDisplayType unitDisplayType, o0 o0Var) {
        ArrayList arrayList;
        int i;
        m0 m0Var;
        IAConfigManager iAConfigManager = IAConfigManager.R;
        com.fyber.inneractive.sdk.cache.session.e eVar = iAConfigManager.x.f5237a;
        if (eVar != null) {
            com.fyber.inneractive.sdk.cache.session.k kVar = (com.fyber.inneractive.sdk.cache.session.k) eVar.b.get(com.fyber.inneractive.sdk.cache.session.enums.c.a(unitDisplayType.value(), str));
            TokenParametersOuterClass$TokenParameters.UserSession userSession = null;
            if (kVar != null) {
                ArrayList arrayList2 = new ArrayList(kVar);
                Collections.sort(arrayList2, new com.fyber.inneractive.sdk.cache.session.j());
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = null;
            }
            try {
                i = Integer.parseInt(iAConfigManager.u.b.a("number_of_sessions", Integer.toString(5)));
            } catch (Throwable unused) {
                i = 5;
            }
            int i2 = i >= 0 ? i : 5;
            if (i2 > 0 && arrayList != null && arrayList.size() >= i2) {
                if (str.equals("video")) {
                    m0Var = m0.VIDEO;
                } else if (!str.equals("display")) {
                    m0Var = m0.UNITCONTENTTYPEUNKNOWN;
                } else {
                    m0Var = m0.DISPLAY;
                }
                r0 newBuilder = TokenParametersOuterClass$TokenParameters.UserSession.newBuilder();
                newBuilder.c();
                ((TokenParametersOuterClass$TokenParameters.UserSession) newBuilder.b).setSubType(m0Var);
                Iterator it = arrayList.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    com.fyber.inneractive.sdk.cache.session.g gVar = (com.fyber.inneractive.sdk.cache.session.g) it.next();
                    h0 newBuilder2 = TokenParametersOuterClass$TokenParameters.SessionData.newBuilder();
                    int i4 = gVar.b;
                    newBuilder2.c();
                    ((TokenParametersOuterClass$TokenParameters.SessionData) newBuilder2.b).setClicks(i4);
                    int i5 = gVar.f5218a;
                    newBuilder2.c();
                    ((TokenParametersOuterClass$TokenParameters.SessionData) newBuilder2.b).setImpressions(i5);
                    if (str.equals("video") || o0Var.equals(o0.REWARDED)) {
                        int i6 = gVar.c;
                        newBuilder2.c();
                        ((TokenParametersOuterClass$TokenParameters.SessionData) newBuilder2.b).setCompletions(i6);
                    }
                    TokenParametersOuterClass$TokenParameters.SessionData sessionData = (TokenParametersOuterClass$TokenParameters.SessionData) newBuilder2.a();
                    newBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.UserSession) newBuilder.b).addSessionDataItems(sessionData);
                    i3++;
                    if (i3 >= i2) {
                        break;
                    }
                }
                newBuilder.c();
                ((TokenParametersOuterClass$TokenParameters.UserSession) newBuilder.b).setType(o0Var);
                userSession = (TokenParametersOuterClass$TokenParameters.UserSession) newBuilder.a();
            }
            if (userSession == null || userSession.getSessionDataItemsList().size() <= 0) {
                return;
            }
            k kVar2 = this.f5192a;
            kVar2.c();
            ((TokenParametersOuterClass$TokenParameters) kVar2.b).addUserSessions(userSession);
        }
    }
}
