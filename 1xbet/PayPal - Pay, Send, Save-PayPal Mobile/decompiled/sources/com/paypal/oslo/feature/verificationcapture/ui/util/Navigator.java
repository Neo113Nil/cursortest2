package com.paypal.oslo.feature.verificationcapture.ui.util;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0005H&¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\r\u001a\u00020\u0005\"\b\b\u0000\u0010\u0003*\u00020\u0002\"\b\b\u0001\u0010\u0010*\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H&¢\u0006\u0004\b\r\u0010\u0013À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/util/Navigator;", "", "Landroidx/navigation3/runtime/NavKey;", "T", "destination", "", "navigate", "(Landroidx/navigation3/runtime/NavKey;)V", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "requestId", "navigateForResult-qCNXlvQ", "(Ljava/lang/String;Landroidx/navigation3/runtime/NavKey;)V", "navigateForResult", "popBackStack", "()V", "Lcom/paypal/oslo/core/navigation/result/NavResult;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "key", "result", "(Landroidx/navigation3/runtime/NavKey;Lcom/paypal/oslo/core/navigation/result/NavResult;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface Navigator {
    <T extends androidx.navigation3.runtime.NavKey> void navigate(T destination);

    /* renamed from: navigateForResult-qCNXlvQ */
    void mo20615navigateForResultqCNXlvQ(java.lang.String requestId, androidx.navigation3.runtime.NavKey destination);

    void popBackStack();

    <T extends androidx.navigation3.runtime.NavKey, R extends com.paypal.oslo.core.navigation.result.NavResult> void popBackStack(T key, R result);
}
