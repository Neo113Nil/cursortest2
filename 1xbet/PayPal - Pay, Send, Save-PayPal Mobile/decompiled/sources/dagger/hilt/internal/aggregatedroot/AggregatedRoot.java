package dagger.hilt.internal.aggregatedroot;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface AggregatedRoot {
    java.lang.String originatingRoot();

    java.lang.String originatingRootPackage();

    java.lang.String[] originatingRootSimpleNames();

    java.lang.String root();

    java.lang.Class<?> rootAnnotation();

    java.lang.String rootComponentPackage() default "";

    java.lang.String[] rootComponentSimpleNames() default {};

    java.lang.String rootPackage();

    java.lang.String[] rootSimpleNames();
}
