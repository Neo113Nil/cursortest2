package io.appmetrica.analytics.impl;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class S7 {

    /* renamed from: a, reason: collision with root package name */
    public final U f6565a;

    /* renamed from: b, reason: collision with root package name */
    public final C0585j2 f6566b;

    public S7(U u3, C0585j2 c0585j2) {
        this.f6565a = u3;
        this.f6566b = c0585j2;
    }

    public final String a() {
        AdvertisingIdsHolder advertisingIdsHolder;
        byte[] bArr;
        U u3 = this.f6565a;
        Ln ln = new Ln(5, 500);
        synchronized (u3) {
            try {
                u3.a((Li) ln, true).get();
            } catch (InterruptedException | ExecutionException unused) {
            }
            advertisingIdsHolder = u3.f6698k;
        }
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        if (!yandex.isValid()) {
            String id = this.f6566b.getAppSetId().getId();
            if (id != null && id.length() != 0) {
                try {
                    UUID.fromString(id);
                    if (!id.equals("00000000-0000-0000-0000-000000000000")) {
                        return v2.m.o0(id, TokenBuilder.TOKEN_DELIMITER, "");
                    }
                } catch (Throwable unused2) {
                }
            }
            return v2.m.o0(UUID.randomUUID().toString(), TokenBuilder.TOKEN_DELIMITER, "").toLowerCase(Locale.US);
        }
        AdTrackingInfo adTrackingInfo = yandex.mAdTrackingInfo;
        kotlin.jvm.internal.j.b(adTrackingInfo);
        String str = adTrackingInfo.advId;
        kotlin.jvm.internal.j.b(str);
        try {
            bArr = MessageDigest.getInstance("MD5").digest(str.getBytes(v2.a.f10417a));
        } catch (NoSuchAlgorithmException unused3) {
            bArr = new byte[0];
        }
        return StringUtils.toHexString(bArr);
    }

    public S7() {
        this(C0878ua.k().c(), C0878ua.k().d());
    }
}
