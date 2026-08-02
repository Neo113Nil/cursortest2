package com.discover.mpos.sdk.core.emv;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002"}, d2 = {"Lcom/discover/mpos/sdk/core/emv/ClearableEmvData;", "Lcom/discover/mpos/sdk/core/emv/EmvData;", "Lcom/discover/mpos/sdk/core/emv/Clearable;"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public interface ClearableEmvData extends com.discover.mpos.sdk.core.emv.Clearable, com.discover.mpos.sdk.core.emv.EmvData {

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    public static final class DefaultImpls {
        public static java.lang.String toHexString(com.discover.mpos.sdk.core.emv.ClearableEmvData clearableEmvData) {
            return com.discover.mpos.sdk.core.emv.EmvData.DefaultImpls.toHexString(clearableEmvData);
        }
    }
}
