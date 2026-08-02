package kotlin.reflect;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u0018R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00128'X¦\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u0014"}, d2 = {"Lkotlin/reflect/KParameter;", "Lkotlin/reflect/KAnnotatedElement;", "", "getIndex", "()I", "index", "", "getName", "()Ljava/lang/String;", "name", "Lkotlin/reflect/KType;", "getType", "()Lkotlin/reflect/KType;", "type", "Lkotlin/reflect/KParameter$Kind;", "getKind", "()Lkotlin/reflect/KParameter$Kind;", "kind", "", "isOptional", "()Z", "isVararg", "isVararg$annotations", "()V", "Kind"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface KParameter extends kotlin.reflect.KAnnotatedElement {

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes17.dex */
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
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lkotlin/reflect/KParameter$Kind;", "", "<init>", "(Ljava/lang/String;I)V", "INSTANCE", "CONTEXT", "EXTENSION_RECEIVER", "VALUE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Kind {
        public static final kotlin.reflect.KParameter.Kind CONTEXT;
        public static final kotlin.reflect.KParameter.Kind EXTENSION_RECEIVER;
        public static final kotlin.reflect.KParameter.Kind INSTANCE;
        public static final kotlin.reflect.KParameter.Kind VALUE;
        private static final /* synthetic */ kotlin.reflect.KParameter.Kind[] getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

        private Kind(java.lang.String str, int i) {
        }

        static {
            kotlin.reflect.KParameter.Kind kind = new kotlin.reflect.KParameter.Kind("INSTANCE", 0);
            INSTANCE = kind;
            kotlin.reflect.KParameter.Kind kind2 = new kotlin.reflect.KParameter.Kind("CONTEXT", 1);
            CONTEXT = kind2;
            kotlin.reflect.KParameter.Kind kind3 = new kotlin.reflect.KParameter.Kind("EXTENSION_RECEIVER", 2);
            EXTENSION_RECEIVER = kind3;
            kotlin.reflect.KParameter.Kind kind4 = new kotlin.reflect.KParameter.Kind("VALUE", 3);
            VALUE = kind4;
            kotlin.reflect.KParameter.Kind[] kindArr = {kind, kind2, kind3, kind4};
            getHighSpeedVideoFpsRanges = kindArr;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(kindArr);
        }

        public static kotlin.reflect.KParameter.Kind[] values() {
            return (kotlin.reflect.KParameter.Kind[]) getHighSpeedVideoFpsRanges.clone();
        }

        public static kotlin.reflect.KParameter.Kind valueOf(java.lang.String str) {
            return (kotlin.reflect.KParameter.Kind) java.lang.Enum.valueOf(kotlin.reflect.KParameter.Kind.class, str);
        }

        public static kotlin.enums.EnumEntries<kotlin.reflect.KParameter.Kind> getEntries() {
            return getHighSpeedVideoFpsRangesFor;
        }
    }
}
