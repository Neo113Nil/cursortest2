package com.google.errorprone.annotations;

@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@java.lang.annotation.Documented
/* loaded from: classes3.dex */
public @interface InlineMe {
    java.lang.String[] imports() default {};

    java.lang.String replacement();

    java.lang.String[] staticImports() default {};
}
