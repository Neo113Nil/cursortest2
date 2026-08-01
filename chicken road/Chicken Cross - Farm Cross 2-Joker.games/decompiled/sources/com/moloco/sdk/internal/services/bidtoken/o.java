package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.BidToken;
import com.moloco.sdk.service_locator.a;

/* loaded from: classes7.dex */
public interface o {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10752a = a.f10753a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f10753a = new a();

        public final o a() {
            a.e eVar = a.e.f10870a;
            return new p(eVar.l(), eVar.m());
        }
    }

    BidToken.ClientBidToken a(byte[] bArr);

    BidToken.ClientBidTokenComponents a(com.moloco.sdk.internal.services.bidtoken.providers.k kVar, f fVar);

    byte[] a(byte[] bArr, byte[] bArr2);

    BidToken.ClientBidTokenComponents b(byte[] bArr);
}
