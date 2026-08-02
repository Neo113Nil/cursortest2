package kotlin.text;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RegexKt$fromInt$1$1<T> implements kotlin.jvm.functions.Function1<T, java.lang.Boolean> {
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Boolean invoke(java.lang.Enum r3) {
        kotlin.text.FlagEnum flagEnum = (kotlin.text.FlagEnum) r3;
        return java.lang.Boolean.valueOf((this.getHighSpeedVideoFpsRangesFor & flagEnum.getMask()) == flagEnum.getValue());
    }

    public RegexKt$fromInt$1$1(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }
}
