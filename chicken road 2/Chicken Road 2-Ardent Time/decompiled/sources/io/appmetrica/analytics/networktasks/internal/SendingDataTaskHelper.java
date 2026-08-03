package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public class SendingDataTaskHelper {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter f7426a;

    /* renamed from: b, reason: collision with root package name */
    private final io.appmetrica.analytics.coreapi.internal.io.Compressor f7427b;

    /* renamed from: c, reason: collision with root package name */
    private final io.appmetrica.analytics.coreutils.internal.time.TimeProvider f7428c;

    /* renamed from: d, reason: collision with root package name */
    private final io.appmetrica.analytics.networktasks.internal.RequestDataHolder f7429d;

    /* renamed from: e, reason: collision with root package name */
    private final io.appmetrica.analytics.networktasks.internal.ResponseDataHolder f7430e;

    /* renamed from: f, reason: collision with root package name */
    private final io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler f7431f;

    public SendingDataTaskHelper(io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter requestBodyEncrypter, io.appmetrica.analytics.coreapi.internal.io.Compressor compressor, io.appmetrica.analytics.networktasks.internal.RequestDataHolder requestDataHolder, io.appmetrica.analytics.networktasks.internal.ResponseDataHolder responseDataHolder, io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler<io.appmetrica.analytics.networktasks.internal.DefaultResponseParser.Response> networkResponseHandler) {
        this(requestBodyEncrypter, compressor, new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider(), requestDataHolder, responseDataHolder, networkResponseHandler);
    }

    public boolean isResponseValid() {
        io.appmetrica.analytics.networktasks.internal.DefaultResponseParser.Response response = (io.appmetrica.analytics.networktasks.internal.DefaultResponseParser.Response) this.f7431f.handle(this.f7430e);
        return response != null && "accepted".equals(response.mStatus);
    }

    public void onPerformRequest() {
        this.f7429d.applySendTime(this.f7428c.currentTimeMillis());
    }

    public boolean prepareAndSetPostData(byte[] bArr) {
        byte[] encrypt;
        try {
            byte[] compress = this.f7427b.compress(bArr);
            if (compress == null || (encrypt = this.f7426a.encrypt(compress)) == null) {
                return false;
            }
            this.f7429d.setPostData(encrypt);
            return true;
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    public SendingDataTaskHelper(io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter requestBodyEncrypter, io.appmetrica.analytics.coreapi.internal.io.Compressor compressor, io.appmetrica.analytics.coreutils.internal.time.TimeProvider timeProvider, io.appmetrica.analytics.networktasks.internal.RequestDataHolder requestDataHolder, io.appmetrica.analytics.networktasks.internal.ResponseDataHolder responseDataHolder, io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler<io.appmetrica.analytics.networktasks.internal.DefaultResponseParser.Response> networkResponseHandler) {
        this.f7426a = requestBodyEncrypter;
        this.f7427b = compressor;
        this.f7428c = timeProvider;
        this.f7429d = requestDataHolder;
        this.f7430e = responseDataHolder;
        this.f7431f = networkResponseHandler;
    }
}
