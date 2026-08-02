package com.paypal.oslo.core.network.graphql.error;

@com.paypal.oslo.core.network.graphql.error.FieldPathDsl
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/FieldPathBuilder;", "", "<init>", "()V", "T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/reflect/KProperty1;", "", "unaryPlus", "(Lkotlin/reflect/KProperty1;)V", "", "build$graphql_release", "()Ljava/lang/String;", "", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FieldPathBuilder {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<java.lang.String> getHighSpeedVideoSizes = new java.util.ArrayList();

    public final <T, R> void unaryPlus(kotlin.reflect.KProperty1<T, ? extends R> kProperty1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty1, "");
        this.getHighSpeedVideoSizes.add(kProperty1.getName());
    }

    public final java.lang.String build$graphql_release() {
        java.util.List<java.lang.String> list = this.getHighSpeedVideoSizes;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            java.lang.String str = (java.lang.String) obj;
            if (!kotlin.text.StringsKt.endsWith$default(str, "Fragment", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.endsWith$default(str, "fragment", false, 2, (java.lang.Object) null)) {
                arrayList.add(obj);
            }
        }
        return kotlin.collections.CollectionsKt.joinToString$default(arrayList, ".", null, null, 0, null, null, 62, null);
    }
}
