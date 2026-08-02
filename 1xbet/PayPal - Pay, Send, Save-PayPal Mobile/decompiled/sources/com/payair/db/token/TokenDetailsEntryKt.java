package com.payair.db.token;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\t\u001a\u00020\u0000*\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/payair/db/token/TokenDetailsEntry;", "", "tokenAlias", "Lcom/payair/model/TokenDetailsWithAsset;", "toTokenDetails", "(Lcom/payair/db/token/TokenDetailsEntry;Ljava/lang/String;)Lcom/payair/model/TokenDetailsWithAsset;", "Lcom/payair/model/TokenDetails;", "Lcom/payair/model/Asset;", com.payair.db.TokenDetailsDaoInternal.ASSET_FILE_NAME_PREFIX, "toTokenDetailsEntry", "(Lcom/payair/model/TokenDetails;Lcom/payair/model/Asset;)Lcom/payair/db/token/TokenDetailsEntry;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TokenDetailsEntryKt {
    public static /* synthetic */ com.payair.model.TokenDetailsWithAsset toTokenDetails$default(com.payair.db.token.TokenDetailsEntry tokenDetailsEntry, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return toTokenDetails(tokenDetailsEntry, str);
    }

    public static final com.payair.db.token.TokenDetailsEntry toTokenDetailsEntry(com.payair.model.TokenDetails tokenDetails, com.payair.model.Asset asset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenDetails, "");
        return new com.payair.db.token.TokenDetailsEntry(tokenDetails.getNetworkTokenReference(), tokenDetails.getTokenStatus(), tokenDetails.getTokenInfo(), tokenDetails.getProductConfig(), tokenDetails.getScheme(), asset, null, 64, null);
    }

    public static /* synthetic */ com.payair.db.token.TokenDetailsEntry toTokenDetailsEntry$default(com.payair.model.TokenDetails tokenDetails, com.payair.model.Asset asset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            asset = null;
        }
        return toTokenDetailsEntry(tokenDetails, asset);
    }

    public static final com.payair.model.TokenDetailsWithAsset toTokenDetails(com.payair.db.token.TokenDetailsEntry tokenDetailsEntry, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenDetailsEntry, "");
        return new com.payair.model.TokenDetailsWithAsset(new com.payair.model.TokenDetails(tokenDetailsEntry.getNetworkTokenReference(), tokenDetailsEntry.getTokenStatus(), tokenDetailsEntry.getTokenInfo(), tokenDetailsEntry.getProductConfig(), str, tokenDetailsEntry.getScheme()), tokenDetailsEntry.getAsset());
    }
}
