package androidx.room;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001a\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007"}, d2 = {"Landroidx/room/Fts3;", "", "", "tokenizer", "", "tokenizerArgs", "()Ljava/lang/String;", "()[Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: classes.dex */
public @interface Fts3 {
    java.lang.String tokenizer() default "simple";

    java.lang.String[] tokenizerArgs() default {};
}
