package javax.annotation;

@javax.annotation.meta.TypeQualifier(applicableTo = java.lang.Number.class)
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface Nonnegative {
    javax.annotation.meta.When when() default javax.annotation.meta.When.ALWAYS;

    /* loaded from: classes17.dex */
    public static class Checker implements javax.annotation.meta.TypeQualifierValidator<javax.annotation.Nonnegative> {
        @Override // javax.annotation.meta.TypeQualifierValidator
        public javax.annotation.meta.When forConstantValue(javax.annotation.Nonnegative nonnegative, java.lang.Object obj) {
            if (!(obj instanceof java.lang.Number)) {
                return javax.annotation.meta.When.NEVER;
            }
            java.lang.Number number = (java.lang.Number) obj;
            if (!(number instanceof java.lang.Long) ? !(!(number instanceof java.lang.Double) ? !(number instanceof java.lang.Float) ? number.intValue() >= 0 : number.floatValue() >= 0.0f : number.doubleValue() >= 0.0d) : number.longValue() < 0) {
                return javax.annotation.meta.When.NEVER;
            }
            return javax.annotation.meta.When.ALWAYS;
        }
    }
}
