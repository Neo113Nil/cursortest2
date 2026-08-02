package androidx.lifecycle;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import okhttp3.internal.cache.DiskLruCache;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit distinctUntilChanged$lambda$4;
        Unit newSink$lambda$3$lambda$2;
        switch (this.a) {
            case 0:
                distinctUntilChanged$lambda$4 = Transformations.distinctUntilChanged$lambda$4((MediatorLiveData) this.b, (Ref.BooleanRef) this.c, obj);
                return distinctUntilChanged$lambda$4;
            default:
                newSink$lambda$3$lambda$2 = DiskLruCache.Editor.newSink$lambda$3$lambda$2((DiskLruCache) this.b, (DiskLruCache.Editor) this.c, (IOException) obj);
                return newSink$lambda$3$lambda$2;
        }
    }
}
