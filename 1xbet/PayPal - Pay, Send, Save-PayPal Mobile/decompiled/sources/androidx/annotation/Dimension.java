package androidx.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.ANNOTATION_TYPE})
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER, kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.LOCAL_VARIABLE, kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
@kotlin.annotation.MustBeDocumented
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/annotation/Dimension;", "", "", "unit", "()I", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
@java.lang.annotation.Documented
/* loaded from: classes.dex */
public @interface Dimension {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.annotation.Dimension.Companion INSTANCE = androidx.annotation.Dimension.Companion.getHighResolutionOutputSizeshNQ4ISI;
    public static final int DP = 0;
    public static final int PX = 1;
    public static final int SP = 2;

    int unit() default 1;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Landroidx/annotation/Dimension$Companion;", "", "<init>", "()V", "", "DP", com.visa.cbp.getEncExpo.warmup, "PX", "SP"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static final int DP = 0;
        public static final int PX = 1;
        public static final int SP = 2;
        static final /* synthetic */ androidx.annotation.Dimension.Companion getHighResolutionOutputSizeshNQ4ISI = new androidx.annotation.Dimension.Companion();

        private Companion() {
        }
    }
}
