package kotlin.reflect.jvm.internal.impl.renderer;

/* loaded from: classes5.dex */
final /* synthetic */ class DescriptorRendererImpl$renderFlexibleType$3 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.String invoke(java.lang.String str) {
        java.lang.String escape;
        java.lang.String str2 = str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        escape = ((kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl) this.receiver).getTextFormat().escape(str2);
        return escape;
    }

    DescriptorRendererImpl$renderFlexibleType$3(java.lang.Object obj) {
        super(1, obj, kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.class, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;", 0);
    }
}
