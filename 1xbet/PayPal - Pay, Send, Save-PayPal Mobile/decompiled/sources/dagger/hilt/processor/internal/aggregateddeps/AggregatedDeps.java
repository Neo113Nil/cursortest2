package dagger.hilt.processor.internal.aggregateddeps;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface AggregatedDeps {
    java.lang.String[] componentEntryPoints() default {};

    java.lang.String[] components();

    java.lang.String[] entryPoints() default {};

    java.lang.String[] modules() default {};

    java.lang.String[] replaces() default {};

    java.lang.String test() default "";
}
