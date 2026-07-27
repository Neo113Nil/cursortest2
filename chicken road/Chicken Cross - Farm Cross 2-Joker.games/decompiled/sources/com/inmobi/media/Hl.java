package com.inmobi.media;

import android.content.Context;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Hl extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Context f6608a;
    public List b;
    public List c;
    public JSONObject d;
    public long e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Ml h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hl(Ml ml, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.h = ml;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, null, this);
    }
}
