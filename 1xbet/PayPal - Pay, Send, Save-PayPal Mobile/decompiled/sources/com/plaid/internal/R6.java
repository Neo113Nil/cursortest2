package com.plaid.internal;

/* loaded from: classes16.dex */
public final class R6 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.EnumC0508d7 f5911a;
    public final com.plaid.internal.InterfaceC0517e7 b;

    public final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5912a;

        static {
            int[] iArr = new int[com.plaid.internal.EnumC0508d7.values().length];
            try {
                iArr[com.plaid.internal.EnumC0508d7.SMS_RECEIVER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.plaid.internal.EnumC0508d7.NO_SMS_AUTOFILL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f5912a = iArr;
        }
    }

    public R6(com.plaid.internal.EnumC0508d7 enumC0508d7, com.plaid.internal.InterfaceC0517e7 interfaceC0517e7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumC0508d7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC0517e7, "");
        this.f5911a = enumC0508d7;
        this.b = interfaceC0517e7;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(com.google.android.gms.auth.api.phone.SmsRetriever.SMS_RETRIEVED_ACTION, intent.getAction())) {
            android.os.Bundle extras = intent.getExtras();
            if (extras == null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("SMS Retrieved action extras are null", "");
                com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, "SMS Retrieved action extras are null");
                com.plaid.internal.J5 j5 = com.plaid.internal.Y6.f5982a;
                if (j5 != null) {
                    j5.a("SMS Retrieved action extras are null");
                    return;
                }
                return;
            }
            com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            java.lang.Integer valueOf = status != null ? java.lang.Integer.valueOf(status.getStatusCode()) : null;
            if (valueOf == null || valueOf.intValue() != 0) {
                if (valueOf == null || valueOf.intValue() != 15) {
                    return;
                }
                this.b.a();
                return;
            }
            if (com.plaid.internal.R6.a.f5912a[this.f5911a.ordinal()] == 1) {
                java.lang.String string = extras.getString(com.google.android.gms.auth.api.phone.SmsRetriever.EXTRA_SMS_MESSAGE);
                if (string != null) {
                    this.b.a(string);
                    return;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("SMS Receiver message is null", "");
                com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, "SMS Receiver message is null");
                com.plaid.internal.J5 j52 = com.plaid.internal.Y6.f5982a;
                if (j52 != null) {
                    j52.a("SMS Receiver message is null");
                }
            }
        }
    }
}
