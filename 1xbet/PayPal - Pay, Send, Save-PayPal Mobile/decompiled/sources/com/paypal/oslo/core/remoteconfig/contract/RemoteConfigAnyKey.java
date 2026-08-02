package com.paypal.oslo.core.remoteconfig.contract;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\f\u001a\u00028\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "D", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "", "getGroupName", "()Ljava/lang/String;", "groupName", "getKeyName", "keyName", "getDefaultValue", "()Ljava/lang/Object;", "defaultValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface RemoteConfigAnyKey<D> extends com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey {
    D getDefaultValue();

    java.lang.String getGroupName();

    @Override // com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey
    java.lang.String getKeyName();
}
