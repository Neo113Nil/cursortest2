package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Ym extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f6979a;
    public Mutex b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Zm d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ym(Zm zm, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = zm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
