package com.google.android.libraries.places.widget;

/* loaded from: classes8.dex */
final /* synthetic */ class zzah implements androidx.view.Observer, kotlin.jvm.internal.FunctionAdapter {
    private final /* synthetic */ kotlin.jvm.functions.Function1 zza;

    @Override // androidx.view.Observer
    public final /* synthetic */ void onChanged(java.lang.Object obj) {
        this.zza.invoke(obj);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final kotlin.Function getFunctionDelegate() {
        return this.zza;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof androidx.view.Observer) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    zzah(kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.zza = function1;
    }
}
