package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import kotlin.jvm.functions.Function2;
import okio.AbstractC1197l;
import okio.C;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterProcessCoordinator _init_$lambda$0;
        _init_$lambda$0 = OkioStorage._init_$lambda$0((C) obj, (AbstractC1197l) obj2);
        return _init_$lambda$0;
    }
}
