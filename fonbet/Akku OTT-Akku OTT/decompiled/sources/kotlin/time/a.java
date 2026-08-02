package kotlin.time;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean parseIso$lambda$6;
        parseIso$lambda$6 = InstantKt.parseIso$lambda$6(((Character) obj).charValue());
        return Boolean.valueOf(parseIso$lambda$6);
    }
}
