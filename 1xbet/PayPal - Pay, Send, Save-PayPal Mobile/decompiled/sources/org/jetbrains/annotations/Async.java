package org.jetbrains.annotations;

/* loaded from: classes18.dex */
public final class Async {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface Execute {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface Schedule {
    }

    private Async() {
        throw new java.lang.AssertionError("Async should not be instantiated");
    }
}
