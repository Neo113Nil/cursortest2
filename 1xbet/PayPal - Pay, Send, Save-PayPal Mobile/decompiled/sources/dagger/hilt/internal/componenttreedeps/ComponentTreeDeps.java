package dagger.hilt.internal.componenttreedeps;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface ComponentTreeDeps {
    java.lang.Class<?>[] aggregatedDeps() default {};

    java.lang.Class<?>[] aliasOfDeps() default {};

    java.lang.Class<?>[] defineComponentDeps() default {};

    java.lang.Class<?>[] earlyEntryPointDeps() default {};

    java.lang.Class<?>[] rootDeps() default {};

    java.lang.Class<?>[] uninstallModulesDeps() default {};
}
