package com.paypal.oslo.app.contextheader;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/app/contextheader/ContextHeader;", "", "Larrow/core/Either;", "Lkotlinx/serialization/SerializationException;", "", "jsonValue", "()Larrow/core/Either;", "Lcom/paypal/oslo/app/contextheader/ContextHeaderKey;", "getHeaderKey", "()Lcom/paypal/oslo/app/contextheader/ContextHeaderKey;", "headerKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ContextHeader {
    com.paypal.oslo.app.contextheader.ContextHeaderKey getHeaderKey();

    arrow.core.Either<kotlinx.serialization.SerializationException, java.lang.String> jsonValue();
}
