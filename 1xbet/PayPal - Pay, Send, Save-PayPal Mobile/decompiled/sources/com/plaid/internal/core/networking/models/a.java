package com.plaid.internal.core.networking.models;

/* loaded from: classes16.dex */
public final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.lang.String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ okhttp3.ResponseBody f6015a;

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.String invoke() {
        java.lang.String string;
        try {
            okhttp3.ResponseBody responseBody = this.f6015a;
            if (responseBody == null || (string = responseBody.string()) == null) {
                return "unknown";
            }
            java.lang.String replace$default = kotlin.text.StringsKt.replace$default(string, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, " ", false, 4, (java.lang.Object) null);
            return replace$default != null ? replace$default : "unknown";
        } catch (java.lang.Throwable unused) {
            return "unknown";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(okhttp3.ResponseBody responseBody) {
        super(0);
        this.f6015a = responseBody;
    }
}
