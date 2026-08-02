package com.discover.mpos.sdk.security.unpredictablenumber;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, d2 = {"Lcom/discover/mpos/sdk/security/unpredictablenumber/UnpredictableNumberGenerator;", "", "invalidate", "", "applicationCryptogram", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "setUp", "terminalId", "", "ifdSerialNumber", "tearDown", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.security.b.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public interface UnpredictableNumberGenerator {
    void a(java.lang.String str, java.lang.String str2);

    void a(byte[] bArr);

    byte[] a();

    void b();
}
