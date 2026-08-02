package com.discover.mpos.sdk.card.apdu.base;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0018\u0010\u0005\u001a\u00028\u0000X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u0004\u0018\u00018\u0001X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/base/ApduResponse;", "T", "E", "Lcom/discover/mpos/sdk/card/apdu/error/ApduError;", "", "content", "getContent", "()Ljava/lang/Object;", "setContent", "(Ljava/lang/Object;)V", "error", "getError", "()Lcom/discover/mpos/sdk/card/apdu/error/ApduError;", "setError", "(Lcom/discover/mpos/sdk/card/apdu/error/ApduError;)V", "isExecutionFailed", "", "isSuccessful", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public interface ApduResponse<T, E extends com.discover.mpos.sdk.card.apdu.error.ApduError> {
    T getContent();

    E getError();

    boolean isExecutionFailed();

    boolean isSuccessful();

    void setContent(T t);

    void setError(E e);

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    public static final class a {
        public static <T, E extends com.discover.mpos.sdk.card.apdu.error.ApduError> boolean a(com.discover.mpos.sdk.card.apdu.base.ApduResponse<T, E> apduResponse) {
            return apduResponse.getError() == null;
        }

        public static <T, E extends com.discover.mpos.sdk.card.apdu.error.ApduError> boolean b(com.discover.mpos.sdk.card.apdu.base.ApduResponse<T, E> apduResponse) {
            E error = apduResponse.getError();
            return error != null && error.isContentMissing();
        }
    }
}
