package com.ingo.sdk.kotlin.ux;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R.\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00118\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/ingo/sdk/kotlin/ux/IngoUxState;", "", "<init>", "()V", "Lcom/ingo/sdk/kotlin/common/features/configuration/model/ConfigurationResponse;", "configurationResponse", "()Lcom/ingo/sdk/kotlin/common/features/configuration/model/ConfigurationResponse;", "Lcom/ingo/sdk/kotlin/common/features/customer/model/CustomerResponse;", "customerResponse", "()Lcom/ingo/sdk/kotlin/common/features/customer/model/CustomerResponse;", "Lcom/ingo/sdk/kotlin/common/features/customer/model/Account;", "getSelectedAccount", "()Lcom/ingo/sdk/kotlin/common/features/customer/model/Account;", "account", "", "setSelectedAccount", "(Lcom/ingo/sdk/kotlin/common/features/customer/model/Account;)V", "", "sessionMap", "Ljava/util/Map;", "getSessionMap", "()Ljava/util/Map;", "setSessionMap", "(Ljava/util/Map;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IngoUxState {
    private java.util.Map<java.lang.Object, java.lang.Object> sessionMap = new java.util.LinkedHashMap();

    public final java.util.Map<java.lang.Object, java.lang.Object> getSessionMap() {
        return this.sessionMap;
    }

    public final void setSessionMap(java.util.Map<java.lang.Object, java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.sessionMap = map;
    }

    public final com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse configurationResponse() {
        return (com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse) this.sessionMap.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse.class));
    }

    public final com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse customerResponse() {
        return (com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse) this.sessionMap.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse.class));
    }

    public final com.ingo.sdk.kotlin.common.features.customer.model.Account getSelectedAccount() {
        return (com.ingo.sdk.kotlin.common.features.customer.model.Account) this.sessionMap.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.customer.model.Account.class));
    }

    public final void setSelectedAccount(com.ingo.sdk.kotlin.common.features.customer.model.Account account) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(account, "");
        this.sessionMap.put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.customer.model.Account.class), account);
    }
}
