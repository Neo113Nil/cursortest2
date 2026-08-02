package kotlinx.datetime.internal.format;

/* JADX INFO: Add missing generic type declarations: [Target] */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final /* synthetic */ class DecimalFractionFieldFormatDirective$formatter$1<Target> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<Target, kotlinx.datetime.internal.DecimalFraction> {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public final kotlinx.datetime.internal.DecimalFraction invoke(Target target) {
        return (kotlinx.datetime.internal.DecimalFraction) ((kotlinx.datetime.internal.format.Accessor) this.receiver).getterNotNull(target);
    }

    DecimalFractionFieldFormatDirective$formatter$1(java.lang.Object obj) {
        super(1, obj, kotlinx.datetime.internal.format.Accessor.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }
}
