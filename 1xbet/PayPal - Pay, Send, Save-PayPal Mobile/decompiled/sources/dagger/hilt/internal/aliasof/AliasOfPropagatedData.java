package dagger.hilt.internal.aliasof;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface AliasOfPropagatedData {
    java.lang.Class<? extends java.lang.annotation.Annotation> alias();

    java.lang.Class<? extends java.lang.annotation.Annotation>[] defineComponentScopes();
}
