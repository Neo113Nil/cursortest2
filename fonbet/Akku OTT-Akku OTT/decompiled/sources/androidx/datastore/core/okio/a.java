package androidx.datastore.core.okio;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit createConnection$lambda$1;
        Unit sendDegradedPingLater$lambda$28;
        switch (this.a) {
            case 0:
                createConnection$lambda$1 = OkioStorage.createConnection$lambda$1((OkioStorage) this.b);
                return createConnection$lambda$1;
            default:
                sendDegradedPingLater$lambda$28 = Http2Connection.sendDegradedPingLater$lambda$28((Http2Connection) this.b);
                return sendDegradedPingLater$lambda$28;
        }
    }
}
