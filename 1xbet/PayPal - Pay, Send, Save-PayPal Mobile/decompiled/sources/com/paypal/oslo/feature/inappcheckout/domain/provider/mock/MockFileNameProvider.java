package com.paypal.oslo.feature.inappcheckout.domain.provider.mock;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0011H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0017\u0010\u0004J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/provider/mock/MockFileNameProvider;", "", "", "getAuthMockFileName", "()Ljava/lang/String;", "fileName", "", "setAuthMockFileName", "(Ljava/lang/String;)V", "getAddCardMockFileName", "setAddCardMockFileName", "getCtaMockFileName", "setCtaMockFileName", "getFiAfterRypCTAContingencyMockFileName", "setFiAfterRypCTAContingencyMockFileName", "getInitializeNativeRypCheckoutMockFileName", "setInitializeNativeRypCheckoutMockFileName", "", "shouldUseAuthFlow", "()Z", "useAuthFlow", "setShouldUseAuthFlow", "(Z)V", "getMockBaToken", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "setMockBaToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface MockFileNameProvider {
    java.lang.String getAddCardMockFileName();

    java.lang.String getAuthMockFileName();

    java.lang.String getCtaMockFileName();

    java.lang.String getFiAfterRypCTAContingencyMockFileName();

    java.lang.String getInitializeNativeRypCheckoutMockFileName();

    java.lang.String getMockBaToken();

    void setAddCardMockFileName(java.lang.String fileName);

    void setAuthMockFileName(java.lang.String fileName);

    void setCtaMockFileName(java.lang.String fileName);

    void setFiAfterRypCTAContingencyMockFileName(java.lang.String fileName);

    void setInitializeNativeRypCheckoutMockFileName(java.lang.String fileName);

    void setMockBaToken(java.lang.String token);

    void setShouldUseAuthFlow(boolean useAuthFlow);

    boolean shouldUseAuthFlow();
}
