package com.bbflight.background_downloader;

import android.content.Context;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@DebugMetadata(c = "com.bbflight.background_downloader.Task", f = "Models.kt", i = {0, 0, 0, 0, 0, 0}, l = {297}, m = "withSuggestedFilenameFromResponseHeaders", n = {"context", "responseHeaders", "disposition", "encodedFilenameRegEx", "match", "unique"}, nl = {301}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0"}, v = 2)
/* loaded from: classes3.dex */
public final class N0 extends ContinuationImpl {
    public Context a;
    public Object b;
    public String c;
    public Object d;
    public Ref.ObjectRef e;
    public boolean f;
    public /* synthetic */ Object i;
    public final /* synthetic */ M0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(M0 m0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.j = m0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.e(null, null, false, this);
    }
}
