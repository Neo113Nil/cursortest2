package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.fi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3713fi extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f7108a;
    public Mutex b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C3770hi d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3713fi(C3770hi c3770hi, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c3770hi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((JSONObject) null, this);
    }
}
