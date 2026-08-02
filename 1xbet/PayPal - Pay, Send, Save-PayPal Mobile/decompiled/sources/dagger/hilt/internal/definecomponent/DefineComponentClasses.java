package dagger.hilt.internal.definecomponent;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface DefineComponentClasses {
    java.lang.String builder() default "";

    java.lang.String component() default "";
}
