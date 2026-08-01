package com.moloco.sdk.internal.services;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.moloco.sdk.internal.services.AbstractC4802c;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.internal.services.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4804e implements InterfaceC4803d {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public final Context f10785a;

    public C4804e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10785a = context;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC4803d
    public AbstractC4802c a() {
        Object m8079constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(AdvertisingIdClient.getAdvertisingIdInfo(this.f10785a));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        AbstractC4802c abstractC4802c = null;
        if (Result.m8085isFailureimpl(m8079constructorimpl)) {
            m8079constructorimpl = null;
        }
        AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) m8079constructorimpl;
        if (info != null) {
            if (info.isLimitAdTrackingEnabled()) {
                abstractC4802c = AbstractC4802c.b.b;
            } else {
                String id = info.getId();
                if (id != null) {
                    abstractC4802c = new AbstractC4802c.a(id);
                }
            }
            if (abstractC4802c != null) {
                return abstractC4802c;
            }
        }
        return AbstractC4802c.b.b;
    }
}
