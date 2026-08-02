package com.bbflight.background_downloader;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class A {
    public final M0 a;
    public final String b;
    public final Object c;
    public final Function1<Continuation<? super Unit>, Object> d;

    /* JADX WARN: Multi-variable type inference failed */
    public A(M0 task, String method, Object arg, Function1<? super Continuation<? super Unit>, ? extends Object> function1) {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(arg, "arg");
        this.a = task;
        this.b = method;
        this.c = arg;
        this.d = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a = (A) obj;
        return Intrinsics.areEqual(this.a, a.a) && Intrinsics.areEqual(this.b, a.b) && Intrinsics.areEqual(this.c, a.c) && Intrinsics.areEqual(this.d, a.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + androidx.compose.runtime.collection.a.a(this.a.a.hashCode() * 31, 31, this.b)) * 31;
        Function1<Continuation<? super Unit>, Object> function1 = this.d;
        return hashCode + (function1 == null ? 0 : function1.hashCode());
    }

    public final String toString() {
        return "BackgroundPost(task=" + this.a + ", method=" + this.b + ", arg=" + this.c + ", onFail=" + this.d + ")";
    }
}
