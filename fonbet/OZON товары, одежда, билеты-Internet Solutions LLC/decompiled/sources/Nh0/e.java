package Nh0;

import java.util.Calendar;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class e extends AbstractC7737t implements Function0<Integer> {

    /* renamed from: b, reason: collision with root package name */
    public static final e f19589b = new e(0);

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(Calendar.getInstance().getTimeZone().getRawOffset() / 1000);
    }
}
