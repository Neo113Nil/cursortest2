package kotlin.reflect;

/* compiled from: KParameter.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u0018R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00138&X§\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0019"}, d2 = {"Lkotlin/reflect/KParameter;", "Lkotlin/reflect/KAnnotatedElement;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "getIndex", "()I", "name", "", "getName", "()Ljava/lang/String;", "type", "Lkotlin/reflect/KType;", "getType", "()Lkotlin/reflect/KType;", "kind", "Lkotlin/reflect/KParameter$Kind;", "getKind", "()Lkotlin/reflect/KParameter$Kind;", "isOptional", "", "()Z", "isVararg", "isVararg$annotations", "()V", "Kind", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface KParameter extends kotlin.reflect.KAnnotatedElement {

    /* compiled from: KParameter.kt */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void isVararg$annotations() {
        }
    }

    int getIndex();

    kotlin.reflect.KParameter.Kind getKind();

    java.lang.String getName();

    kotlin.reflect.KType getType();

    boolean isOptional();

    boolean isVararg();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: KParameter.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/KParameter$Kind;", "", "<init>", "(Ljava/lang/String;I)V", "INSTANCE", "EXTENSION_RECEIVER", "VALUE", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Kind {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ kotlin.reflect.KParameter.Kind[] $VALUES;
        public static final kotlin.reflect.KParameter.Kind INSTANCE = new kotlin.reflect.KParameter.Kind("INSTANCE", 0);
        public static final kotlin.reflect.KParameter.Kind EXTENSION_RECEIVER = new kotlin.reflect.KParameter.Kind("EXTENSION_RECEIVER", 1);
        public static final kotlin.reflect.KParameter.Kind VALUE = new kotlin.reflect.KParameter.Kind("VALUE", 2);

        private static final /* synthetic */ kotlin.reflect.KParameter.Kind[] $values() {
            return new kotlin.reflect.KParameter.Kind[]{INSTANCE, EXTENSION_RECEIVER, VALUE};
        }

        public static kotlin.enums.EnumEntries<kotlin.reflect.KParameter.Kind> getEntries() {
            return $ENTRIES;
        }

        private Kind(java.lang.String str, int i) {
        }

        static {
            kotlin.reflect.KParameter.Kind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        }

        public static kotlin.reflect.KParameter.Kind valueOf(java.lang.String str) {
            return (kotlin.reflect.KParameter.Kind) java.lang.Enum.valueOf(kotlin.reflect.KParameter.Kind.class, str);
        }

        public static kotlin.reflect.KParameter.Kind[] values() {
            return (kotlin.reflect.KParameter.Kind[]) $VALUES.clone();
        }
    }
}
