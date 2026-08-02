package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final /* synthetic */ class s implements androidx.view.Observer, kotlin.jvm.internal.FunctionAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.Function1 f3336a;

    @Override // androidx.view.Observer
    public final /* synthetic */ void onChanged(java.lang.Object obj) {
        this.f3336a.invoke(obj);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final kotlin.Function getFunctionDelegate() {
        return this.f3336a;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof androidx.view.Observer) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    public s(kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.f3336a = function1;
    }
}
