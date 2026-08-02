package kotlinx.serialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KType;
import okhttp3.Handshake;
import okhttp3.internal.connection.ConnectPlan;

/* loaded from: classes5.dex */
public final /* synthetic */ class q implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List connectTls$lambda$6;
        switch (this.a) {
            case 0:
                return ((KType) ((ArrayList) this.b).get(0)).getClassifier();
            default:
                connectTls$lambda$6 = ConnectPlan.connectTls$lambda$6((Handshake) this.b);
                return connectTls$lambda$6;
        }
    }
}
