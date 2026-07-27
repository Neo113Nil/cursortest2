package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.io.Compressor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseParser;
import java.io.IOException;

/* loaded from: classes.dex */
public class SendingDataTaskHelper {

    /* renamed from: a, reason: collision with root package name */
    private final RequestBodyEncrypter f9900a;

    /* renamed from: b, reason: collision with root package name */
    private final Compressor f9901b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeProvider f9902c;

    /* renamed from: d, reason: collision with root package name */
    private final RequestDataHolder f9903d;

    /* renamed from: e, reason: collision with root package name */
    private final ResponseDataHolder f9904e;

    /* renamed from: f, reason: collision with root package name */
    private final NetworkResponseHandler f9905f;

    public SendingDataTaskHelper(RequestBodyEncrypter requestBodyEncrypter, Compressor compressor, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this(requestBodyEncrypter, compressor, new SystemTimeProvider(), requestDataHolder, responseDataHolder, networkResponseHandler);
    }

    public boolean isResponseValid() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.f9905f.handle(this.f9904e);
        return response != null && "accepted".equals(response.mStatus);
    }

    public void onPerformRequest() {
        this.f9903d.applySendTime(this.f9902c.currentTimeMillis());
    }

    public boolean prepareAndSetPostData(byte[] bArr) {
        byte[] encrypt;
        try {
            byte[] compress = this.f9901b.compress(bArr);
            if (compress == null || (encrypt = this.f9900a.encrypt(compress)) == null) {
                return false;
            }
            this.f9903d.setPostData(encrypt);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public SendingDataTaskHelper(RequestBodyEncrypter requestBodyEncrypter, Compressor compressor, TimeProvider timeProvider, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this.f9900a = requestBodyEncrypter;
        this.f9901b = compressor;
        this.f9902c = timeProvider;
        this.f9903d = requestDataHolder;
        this.f9904e = responseDataHolder;
        this.f9905f = networkResponseHandler;
    }
}
