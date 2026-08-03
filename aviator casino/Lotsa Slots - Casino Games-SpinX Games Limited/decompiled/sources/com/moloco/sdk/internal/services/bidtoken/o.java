package com.moloco.sdk.internal.services.bidtoken;

/* loaded from: classes5.dex */
public interface o {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.internal.services.bidtoken.o.a f7231a = com.moloco.sdk.internal.services.bidtoken.o.a.f7232a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ com.moloco.sdk.internal.services.bidtoken.o.a f7232a = new com.moloco.sdk.internal.services.bidtoken.o.a();

        public final com.moloco.sdk.internal.services.bidtoken.o a() {
            com.moloco.sdk.service_locator.a.e eVar = com.moloco.sdk.service_locator.a.e.f7346a;
            return new com.moloco.sdk.internal.services.bidtoken.p(eVar.l(), eVar.m());
        }
    }

    com.moloco.sdk.BidToken.ClientBidToken a(byte[] bArr);

    com.moloco.sdk.BidToken.ClientBidTokenComponents a(com.moloco.sdk.internal.services.bidtoken.providers.k kVar, com.moloco.sdk.internal.services.bidtoken.f fVar);

    byte[] a(byte[] bArr, byte[] bArr2);

    com.moloco.sdk.BidToken.ClientBidTokenComponents b(byte[] bArr);
}
