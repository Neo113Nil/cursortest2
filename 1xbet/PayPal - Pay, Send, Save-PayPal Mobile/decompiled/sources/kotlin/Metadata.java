package kotlin;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\u0002\u0018\u00002\u00020\u0001B\\\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\b8\u0007¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\f\u001a\u00020\b8\u0007¢\u0006\f\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001c\u0010\u000f"}, d2 = {"Lkotlin/Metadata;", "", "", "kind", "", "metadataVersion", "bytecodeVersion", "", "", "data1", "data2", "extraString", com.visa.cbp.ConsumerInfo.setSignature, "extraInt", "k", "()I", "mv", "()[I", "bv", "bv$annotations", "()V", "d1", "()[Ljava/lang/String;", "d2", "xs", "()Ljava/lang/String;", "pn", "pn$annotations", "xi", "xi$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.RUNTIME)
/* loaded from: classes.dex */
public @interface Metadata {

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Bytecode version had no significant use in Kotlin metadata and it will be removed in a future version.")
        public static /* synthetic */ void bv$annotations() {
        }

        public static /* synthetic */ void pn$annotations() {
        }

        public static /* synthetic */ void xi$annotations() {
        }
    }

    int[] bv() default {1, 0, 3};

    java.lang.String[] d1() default {};

    java.lang.String[] d2() default {};

    int k() default 1;

    int[] mv() default {};

    java.lang.String pn() default "";

    int xi() default 0;

    java.lang.String xs() default "";
}
