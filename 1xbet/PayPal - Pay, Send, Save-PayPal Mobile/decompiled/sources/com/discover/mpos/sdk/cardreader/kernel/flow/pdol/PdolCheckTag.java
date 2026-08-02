package com.discover.mpos.sdk.cardreader.kernel.flow.pdol;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\tJ\b\u0010\u0015\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/pdol/PdolCheckTag;", "", "tagName", "", "expectedLength", "Lkotlin/ranges/IntRange;", "tagHex", "validator", "Lkotlin/Function1;", "", "", "(Ljava/lang/String;Lkotlin/ranges/IntRange;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getExpectedLength", "()Lkotlin/ranges/IntRange;", "getTagHex", "()Ljava/lang/String;", "getTagName", "getValidator", "()Lkotlin/jvm/functions/Function1;", "isValid", "length", "toString", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.g.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class PdolCheckTag {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3149a;
    public final kotlin.ranges.IntRange b;
    public final java.lang.String c;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Boolean> d;

    /* JADX WARN: Multi-variable type inference failed */
    public PdolCheckTag(java.lang.String str, kotlin.ranges.IntRange intRange, java.lang.String str2, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.f3149a = str;
        this.b = intRange;
        this.c = str2;
        this.d = function1;
    }

    public /* synthetic */ PdolCheckTag(java.lang.String str, kotlin.ranges.IntRange intRange, java.lang.String str2) {
        this(str, intRange, str2, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Boolean>() { // from class: com.discover.mpos.sdk.cardreader.kernel.flow.g.c.1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Boolean invoke(java.lang.Integer num) {
                return java.lang.Boolean.TRUE;
            }
        });
    }

    public final boolean a(int i) {
        return this.b.contains(i) && this.d.invoke(java.lang.Integer.valueOf(i)).booleanValue();
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.StringExtensionsKt.toJSONString(this);
    }
}
