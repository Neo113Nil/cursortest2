package com.paypal.oslo.core.companion.domain;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u001e\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/companion/domain/ConfigSection;", "", "", "getId", "()Ljava/lang/String;", "id", "getName", "name", "getDescription", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "", "Lcom/paypal/oslo/core/companion/domain/ConfigField;", "getFields", "()Ljava/util/List;", "fields", "Lcom/paypal/oslo/core/companion/domain/ConfigSectionFieldResolver;", "getResolver", "()Lcom/paypal/oslo/core/companion/domain/ConfigSectionFieldResolver;", "resolver", "getSubsections", "subsections"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ConfigSection {
    java.lang.String getDescription();

    java.util.List<com.paypal.oslo.core.companion.domain.ConfigField<?>> getFields();

    java.lang.String getId();

    java.lang.String getName();

    com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver getResolver();

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static java.util.List<com.paypal.oslo.core.companion.domain.ConfigSection> getSubsections(com.paypal.oslo.core.companion.domain.ConfigSection configSection) {
            return com.paypal.oslo.core.companion.domain.ConfigSection.super.getSubsections();
        }
    }

    default java.util.List<com.paypal.oslo.core.companion.domain.ConfigSection> getSubsections() {
        return kotlin.collections.CollectionsKt.emptyList();
    }
}
