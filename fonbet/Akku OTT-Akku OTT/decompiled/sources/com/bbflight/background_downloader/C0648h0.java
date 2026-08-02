package com.bbflight.background_downloader;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.HoldingQueue", f = "HoldingQueue.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {144}, m = "cancelTasksWithIds", n = {"context", "taskIds", "toRemove", "prefs", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-HoldingQueue$cancelTasksWithIds$2"}, nl = {145}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "I$0", "I$1"}, v = 2)
/* renamed from: com.bbflight.background_downloader.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0648h0 extends ContinuationImpl {
    public Context a;
    public Object b;
    public List c;
    public SharedPreferences d;
    public Object e;
    public Iterator f;
    public Object i;
    public U j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ C0638c0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0648h0(C0638c0 c0638c0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.m = c0638c0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.f(null, null, this);
    }
}
