package com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/Loggable;", "", "", "", "getLogParams", "()Ljava/util/Map;", "logParams", "getPiiParams", "piiParams"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface Loggable {
    default java.util.Map<java.lang.String, java.lang.String> getLogParams() {
        return null;
    }

    default java.util.Map<java.lang.String, java.lang.String> getPiiParams() {
        return null;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static java.util.Map<java.lang.String, java.lang.String> getLogParams(com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable loggable) {
            return com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable.super.getLogParams();
        }

        @java.lang.Deprecated
        public static java.util.Map<java.lang.String, java.lang.String> getPiiParams(com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable loggable) {
            return com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.Loggable.super.getPiiParams();
        }
    }
}
