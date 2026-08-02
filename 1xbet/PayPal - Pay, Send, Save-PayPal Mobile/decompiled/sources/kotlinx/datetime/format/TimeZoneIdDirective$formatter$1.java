package kotlinx.datetime.format;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final /* synthetic */ class TimeZoneIdDirective$formatter$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlinx.datetime.format.DateTimeComponentsContents, java.lang.String> {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public final java.lang.String invoke(kotlinx.datetime.format.DateTimeComponentsContents dateTimeComponentsContents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeComponentsContents, "");
        return (java.lang.String) ((kotlinx.datetime.internal.format.Accessor) this.receiver).getterNotNull(dateTimeComponentsContents);
    }

    TimeZoneIdDirective$formatter$1(java.lang.Object obj) {
        super(1, obj, kotlinx.datetime.internal.format.Accessor.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }
}
