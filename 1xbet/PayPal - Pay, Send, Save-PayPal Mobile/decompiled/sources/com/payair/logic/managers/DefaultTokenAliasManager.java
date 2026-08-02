package com.payair.logic.managers;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/payair/logic/managers/DefaultTokenAliasManager;", "Lcom/payair/logic/managers/TokenAliasManager;", "Lcom/payair/logic/storage/StorageService;", "storageService", "<init>", "(Lcom/payair/logic/storage/StorageService;)V", "", "networkTokenReference", "getTokenAlias", "(Ljava/lang/String;)Ljava/lang/String;", "alias", "", "setTokenAlias", "(Ljava/lang/String;Ljava/lang/String;)V", "deleteTokenAlias", "(Ljava/lang/String;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DefaultTokenAliasManager implements com.payair.logic.managers.TokenAliasManager {

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.storage.StorageService f4444a;

    public DefaultTokenAliasManager(com.payair.logic.storage.StorageService storageService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageService, "");
        this.f4444a = storageService;
    }

    @Override // com.payair.logic.managers.TokenAliasManager
    public final void deleteTokenAlias(java.lang.String networkTokenReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        this.f4444a.deleteTokenAlias(networkTokenReference);
    }

    @Override // com.payair.logic.managers.TokenAliasManager
    public final java.lang.String getTokenAlias(java.lang.String networkTokenReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        return this.f4444a.getTokenAlias(networkTokenReference);
    }

    @Override // com.payair.logic.managers.TokenAliasManager
    public final void setTokenAlias(java.lang.String networkTokenReference, java.lang.String alias) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alias, "");
        this.f4444a.setTokenAlias(networkTokenReference, alias);
    }
}
