package com.plaid.internal;

/* renamed from: com.plaid.internal.f7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0526f7 extends com.plaid.internal.C0661v {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.R6 f6412a;

    public C0526f7(com.plaid.internal.InterfaceC0517e7 interfaceC0517e7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC0517e7, "");
        this.f6412a = new com.plaid.internal.R6(com.plaid.internal.EnumC0508d7.SMS_RECEIVER, interfaceC0517e7);
    }

    @Override // com.plaid.internal.C0661v
    public final void a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.google.android.gms.auth.api.phone.SmsRetrieverClient client = com.google.android.gms.auth.api.phone.SmsRetriever.getClient(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(client, "");
        client.startSmsRetriever();
        androidx.core.content.ContextCompat.registerReceiver(context, this.f6412a, new android.content.IntentFilter(com.google.android.gms.auth.api.phone.SmsRetriever.SMS_RETRIEVED_ACTION), 2);
    }

    @Override // com.plaid.internal.C0661v
    public final void b(android.content.Context context) {
        if (context != null) {
            context.unregisterReceiver(this.f6412a);
        }
    }
}
