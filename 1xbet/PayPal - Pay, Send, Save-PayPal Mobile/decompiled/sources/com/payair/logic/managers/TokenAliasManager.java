package com.payair.logic.managers;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/payair/logic/managers/TokenAliasManager;", "", "", "networkTokenReference", "", "deleteTokenAlias", "(Ljava/lang/String;)V", "getTokenAlias", "(Ljava/lang/String;)Ljava/lang/String;", "alias", "setTokenAlias", "(Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface TokenAliasManager {
    void deleteTokenAlias(java.lang.String networkTokenReference);

    java.lang.String getTokenAlias(java.lang.String networkTokenReference);

    void setTokenAlias(java.lang.String networkTokenReference, java.lang.String alias);
}
