package financial.atomic.b;

/* loaded from: classes3.dex */
public final class b extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ financial.atomic.transact.activity.TransactActivity f6734a;

    public b(financial.atomic.transact.activity.TransactActivity transactActivity) {
        this.f6734a = transactActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.os.Bundle extras;
        java.lang.String string;
        java.lang.String string2;
        financial.atomic.transact.Transact transact;
        financial.atomic.transact.Transact transact2;
        if (intent == null || (extras = intent.getExtras()) == null || (string = extras.getString("type")) == null) {
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(string, "DISMISS")) {
            this.f6734a.finish();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(string, "CLEANUP_APPLICATION")) {
            this.f6734a.finish();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(string, "PAUSE_REQUEST")) {
            this.f6734a.finish();
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(string, "CARD_ADDED_BY_SDK") || (string2 = extras.getString(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) == null) {
            return;
        }
        transact = this.f6734a.d;
        if (transact != null) {
            transact2 = this.f6734a.d;
            if (transact2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                transact2 = null;
            }
            transact2.dispatchEvent$transact_release(financial.atomic.transact.Transact.Event.CARD_ADDED_BY_SDK.getValue(), new org.json.JSONObject(string2));
        }
    }
}
