package io.appmetrica.analytics.impl;

import com.onesignal.core.internal.permissions.PermissionsViewModel;
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
    public final U f7432a;

    /* renamed from: b, reason: collision with root package name */
    public final C0734j2 f7433b;

    public S7(U u5, C0734j2 c0734j2) {
        this.f7432a = u5;
        this.f7433b = c0734j2;
    }

    public final String a() {
        AdvertisingIdsHolder advertisingIdsHolder;
        byte[] bArr;
        U u5 = this.f7432a;
        Ln ln = new Ln(5, PermissionsViewModel.DELAY_TIME_CALLBACK_CALL);
        synchronized (u5) {
            try {
                u5.a((Li) ln, true).get();
            } catch (InterruptedException | ExecutionException unused) {
            }
            advertisingIdsHolder = u5.f7571k;
        }
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        if (!yandex.isValid()) {
            String id = this.f7433b.getAppSetId().getId();
            if (id != null && id.length() != 0) {
                try {
                    UUID.fromString(id);
                    if (!id.equals("00000000-0000-0000-0000-000000000000")) {
                        return B4.r.M(id, "-", "");
                    }
                } catch (Throwable unused2) {
                }
            }
            return B4.r.M(UUID.randomUUID().toString(), "-", "").toLowerCase(Locale.US);
        }
        AdTrackingInfo adTrackingInfo = yandex.mAdTrackingInfo;
        kotlin.jvm.internal.i.b(adTrackingInfo);
        String str = adTrackingInfo.advId;
        kotlin.jvm.internal.i.b(str);
        try {
            bArr = MessageDigest.getInstance("MD5").digest(str.getBytes(B4.a.f287a));
        } catch (NoSuchAlgorithmException unused3) {
            bArr = new byte[0];
        }
        return StringUtils.toHexString(bArr);
    }

    public S7() {
        this(C1027ua.k().c(), C1027ua.k().d());
    }
}
