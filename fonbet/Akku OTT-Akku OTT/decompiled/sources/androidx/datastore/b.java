package androidx.datastore;

import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.time.InstantKt;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List deviceProtectedDataStore$lambda$0;
        boolean parseIso$lambda$0;
        switch (this.a) {
            case 0:
                deviceProtectedDataStore$lambda$0 = DataStoreDelegateKt.deviceProtectedDataStore$lambda$0((Context) obj);
                return deviceProtectedDataStore$lambda$0;
            default:
                parseIso$lambda$0 = InstantKt.parseIso$lambda$0(((Character) obj).charValue());
                return Boolean.valueOf(parseIso$lambda$0);
        }
    }
}
