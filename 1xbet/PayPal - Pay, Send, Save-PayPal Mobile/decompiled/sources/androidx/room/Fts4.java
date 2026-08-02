package androidx.room;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0002\u0018\u00002\u00020\u0001B`\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\b\u0002\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0011R\u0015\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00068\u0007¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0012R\u0011\u0010\b\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\b\u0010\u0010R\u0011\u0010\n\u001a\u00020\t8\u0007¢\u0006\u0006\u001a\u0004\b\n\u0010\u0013R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0011R\u0011\u0010\r\u001a\u00020\f8\u0007¢\u0006\u0006\u001a\u0004\b\r\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u000e8\u0007¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0015"}, d2 = {"Landroidx/room/Fts4;", "", "", "tokenizer", "", "tokenizerArgs", "Lkotlin/reflect/KClass;", "contentEntity", "languageId", "Landroidx/room/FtsOptions$MatchInfo;", "matchInfo", "notIndexed", "", "prefix", "Landroidx/room/FtsOptions$Order;", "order", "()Ljava/lang/String;", "()[Ljava/lang/String;", "()Ljava/lang/Class;", "()Landroidx/room/FtsOptions$MatchInfo;", "()[I", "()Landroidx/room/FtsOptions$Order;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: classes.dex */
public @interface Fts4 {
    java.lang.Class<?> contentEntity() default java.lang.Object.class;

    java.lang.String languageId() default "";

    androidx.room.FtsOptions.MatchInfo matchInfo() default androidx.room.FtsOptions.MatchInfo.FTS4;

    java.lang.String[] notIndexed() default {};

    androidx.room.FtsOptions.Order order() default androidx.room.FtsOptions.Order.ASC;

    int[] prefix() default {};

    java.lang.String tokenizer() default "simple";

    java.lang.String[] tokenizerArgs() default {};
}
