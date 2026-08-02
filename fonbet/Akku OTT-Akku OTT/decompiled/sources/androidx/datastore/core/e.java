package androidx.datastore.core;

import androidx.datastore.core.Message;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit writeActor$lambda$1;
        writeActor$lambda$1 = DataStoreImpl.writeActor$lambda$1((Message.Update) obj, (Throwable) obj2);
        return writeActor$lambda$1;
    }
}
