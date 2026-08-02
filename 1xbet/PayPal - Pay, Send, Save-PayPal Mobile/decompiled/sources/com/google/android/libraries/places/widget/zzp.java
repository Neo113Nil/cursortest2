package com.google.android.libraries.places.widget;

/* loaded from: classes8.dex */
final /* synthetic */ class zzp extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Exception exc = (java.lang.Exception) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        com.google.android.libraries.places.widget.PlaceDetailsCompactFragment.zzb((com.google.android.libraries.places.widget.PlaceDetailsCompactFragment) this.receiver, exc);
        return kotlin.Unit.INSTANCE;
    }

    zzp(java.lang.Object obj) {
        super(1, obj, com.google.android.libraries.places.widget.PlaceDetailsCompactFragment.class, "onPlaceLoadFailed", "onPlaceLoadFailed(Ljava/lang/Exception;)V", 0);
    }
}
