package com.unity3d.ads.core.data.datasource;

/* compiled from: AndroidUnityBootConfigDataSource.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidUnityBootConfigDataSource;", "Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getValue", "", com.ironsource.X3.i.W, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidUnityBootConfigDataSource implements com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource {
    private final android.content.Context context;

    public AndroidUnityBootConfigDataSource(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource
    public java.lang.String getValue(java.lang.String key) {
        java.lang.Object m10798constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.unity3d.ads.core.data.datasource.AndroidUnityBootConfigDataSource androidUnityBootConfigDataSource = this;
            final java.lang.String str = key + com.ironsource.B5.U;
            final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            java.io.InputStream open = this.context.getAssets().open("bin/Data/boot.config");
            try {
                java.io.InputStream stream = open;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stream, "stream");
                java.io.Reader inputStreamReader = new java.io.InputStreamReader(stream, kotlin.text.Charsets.UTF_8);
                kotlin.io.TextStreamsKt.forEachLine(inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192), new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: com.unity3d.ads.core.data.datasource.AndroidUnityBootConfigDataSource$getValue$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str2) {
                        invoke2(str2);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.Object, java.lang.String] */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(java.lang.String line) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(line, "line");
                        if (kotlin.text.StringsKt.startsWith$default(line, str, false, 2, (java.lang.Object) null)) {
                            kotlin.jvm.internal.Ref.ObjectRef<java.lang.String> objectRef2 = objectRef;
                            ?? substring = line.substring(str.length());
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                            objectRef2.element = substring;
                        }
                    }
                });
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(open, null);
                m10798constructorimpl = kotlin.Result.m10798constructorimpl((java.lang.String) objectRef.element);
            } finally {
            }
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        return (java.lang.String) (kotlin.Result.m10804isFailureimpl(m10798constructorimpl) ? null : m10798constructorimpl);
    }
}
