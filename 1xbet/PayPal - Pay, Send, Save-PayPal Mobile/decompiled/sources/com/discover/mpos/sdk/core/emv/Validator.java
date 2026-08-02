package com.discover.mpos.sdk.core.emv;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/discover/mpos/sdk/core/emv/Validator;", "DataToValidate", "", "toValidate", "", "isValid", "(Ljava/lang/Object;)Z"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public interface Validator<DataToValidate> {

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    public static final class DefaultImpls {
        public static <DataToValidate> boolean isValid(com.discover.mpos.sdk.core.emv.Validator<DataToValidate> validator, DataToValidate datatovalidate) {
            return false;
        }
    }

    boolean isValid(DataToValidate toValidate);
}
