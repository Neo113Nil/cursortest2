package com.payair.csdk;

/* loaded from: classes4.dex */
public final class b4 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.payair.csdk.b4 f4235a = new com.payair.csdk.b4();

    public b4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        com.payair.logic.remote.model.MediaContentsDto mediaContentsDto = (com.payair.logic.remote.model.MediaContentsDto) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaContentsDto, "");
        return com.payair.logic.remote.model.AssetDtoKt.toMediaContent(mediaContentsDto);
    }
}
