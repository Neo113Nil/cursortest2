package com.amplitude.android.migration;

import androidx.core.app.NotificationCompat;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.amplitude.android.migration.AndroidStorageMigration", f = "AndroidStorageMigration.kt", i = {0, 1, 1, 2, 2, 2, 2, 2, 3}, l = {21, 29, 35, 44}, m = "moveEventsToDestination", n = {"this", "this", "sourceEventFilePath", "this", "sourceEventFilePath", "baseEvents", NotificationCompat.CATEGORY_EVENT, "count", "this"}, s = {"L$0", "L$0", "L$2", "L$0", "L$2", "L$3", "L$5", "I$0", "L$0"})
/* loaded from: classes3.dex */
public final class b extends ContinuationImpl {
    public e a;
    public Iterator b;
    public String c;
    public List d;
    public Iterator e;
    public com.amplitude.core.events.a f;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ e k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.k = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(this);
    }
}
